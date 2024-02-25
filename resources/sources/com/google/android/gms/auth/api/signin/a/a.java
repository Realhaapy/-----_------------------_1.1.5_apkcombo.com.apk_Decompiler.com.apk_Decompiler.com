package com.google.android.gms.auth.api.signin.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.n;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class a {
    private static final Lock c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    private static a f2365d;
    private final Lock a = new ReentrantLock();
    private final SharedPreferences b;

    a(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        n.h(context);
        Lock lock = c;
        lock.lock();
        try {
            if (f2365d == null) {
                f2365d = new a(context.getApplicationContext());
            }
            a aVar = f2365d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            c.unlock();
            throw th;
        }
    }

    private static final String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public GoogleSignInAccount b() {
        String c2;
        String c3 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c3) || (c2 = c(d("googleSignInAccount", c3))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m(c2);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, (String) null);
        } finally {
            this.a.unlock();
        }
    }
}
