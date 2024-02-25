package com.facebook.internal.u0;

import android.util.Base64;
import android.util.Log;
import com.facebook.g0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import m.d0.d;
import m.s;
import m.x.i;
import m.y.d.l;
import m.y.d.p;
import org.json.JSONObject;

public final class c {
    public static final c a = new c();
    private static final String b = "/.well-known/oauth/openid/keys/";

    private c() {
    }

    public static final PublicKey a(String str) {
        l.d(str, "key");
        byte[] decode = Base64.decode(p.r(p.r(p.r(str, "\n", "", false, 4, (Object) null), "-----BEGIN PUBLIC KEY-----", "", false, 4, (Object) null), "-----END PUBLIC KEY-----", "", false, 4, (Object) null), 0);
        l.c(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        l.c(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    /* JADX INFO: finally extract failed */
    public static final String b(String str) {
        l.d(str, "kid");
        g0 g0Var = g0.a;
        URL url = new URL("https", l.j("www.", g0.l()), b);
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        p pVar = new p();
        g0.k().execute(new a(url, pVar, str, reentrantLock, newCondition));
        reentrantLock.lock();
        try {
            newCondition.await(5000, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) pVar.f5062e;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public static final void c(URL url, p pVar, String str, ReentrantLock reentrantLock, Condition condition) {
        l.d(url, "$openIdKeyUrl");
        l.d(pVar, "$result");
        l.d(str, "$kid");
        l.d(reentrantLock, "$lock");
        URLConnection openConnection = url.openConnection();
        Objects.requireNonNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            l.c(inputStream, "connection.inputStream");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, d.a);
            String c = i.c(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
            httpURLConnection.getInputStream().close();
            pVar.f5062e = new JSONObject(c).optString(str);
            httpURLConnection.disconnect();
            reentrantLock.lock();
            try {
                condition.signal();
                s sVar = s.a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Exception e2) {
            try {
                String name = a.getClass().getName();
                String message = e2.getMessage();
                if (message == null) {
                    message = "Error getting public key";
                }
                Log.d(name, message);
                httpURLConnection.disconnect();
                reentrantLock.lock();
                condition.signal();
                s sVar2 = s.a;
            } catch (Throwable th2) {
                httpURLConnection.disconnect();
                reentrantLock.lock();
                condition.signal();
                s sVar3 = s.a;
                throw th2;
            } finally {
                reentrantLock.unlock();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static final boolean e(PublicKey publicKey, String str, String str2) {
        l.d(publicKey, "publicKey");
        l.d(str, "data");
        l.d(str2, "signature");
        try {
            Signature instance = Signature.getInstance("SHA256withRSA");
            instance.initVerify(publicKey);
            byte[] bytes = str.getBytes(d.a);
            l.c(bytes, "(this as java.lang.String).getBytes(charset)");
            instance.update(bytes);
            byte[] decode = Base64.decode(str2, 8);
            l.c(decode, "decode(signature, Base64.URL_SAFE)");
            return instance.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }
}
