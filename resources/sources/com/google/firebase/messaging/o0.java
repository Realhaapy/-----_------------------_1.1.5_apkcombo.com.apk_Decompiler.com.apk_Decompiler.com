package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.h;
import com.google.firebase.installations.l;
import com.google.firebase.q.k;
import com.google.firebase.r.b;
import com.google.firebase.t.i;
import f.e.a.c.b.d;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

class o0 {
    private final h a;
    private final r0 b;
    private final d c;

    /* renamed from: d  reason: collision with root package name */
    private final b<i> f2815d;

    /* renamed from: e  reason: collision with root package name */
    private final b<k> f2816e;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.firebase.installations.h f2817f;

    o0(h hVar, r0 r0Var, b<i> bVar, b<k> bVar2, com.google.firebase.installations.h hVar2) {
        this(hVar, r0Var, new d(hVar.j()), bVar, bVar2, hVar2);
    }

    o0(h hVar, r0 r0Var, d dVar, b<i> bVar, b<k> bVar2, com.google.firebase.installations.h hVar2) {
        this.a = hVar;
        this.b = r0Var;
        this.c = dVar;
        this.f2815d = bVar;
        this.f2816e = bVar2;
        this.f2817f = hVar2;
    }

    private static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private f.e.a.c.g.i<String> c(f.e.a.c.g.i<Bundle> iVar) {
        return iVar.f(x.f2848e, new v(this));
    }

    private String d() {
        try {
            return a(MessageDigest.getInstance("SHA-1").digest(this.a.n().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String f(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    static boolean g(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ String i(f.e.a.c.g.i iVar) {
        return f((Bundle) iVar.j(IOException.class));
    }

    private void j(String str, String str2, Bundle bundle) {
        k.a b2;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.a.o().c());
        bundle.putString("gmsv", Integer.toString(this.b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.a());
        bundle.putString("app_ver_name", this.b.b());
        bundle.putString("firebase-app-name-hash", d());
        try {
            String b3 = ((l) f.e.a.c.g.l.a(this.f2817f.b(false))).b();
            if (!TextUtils.isEmpty(b3)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b3);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e2);
        }
        bundle.putString("appid", (String) f.e.a.c.g.l.a(this.f2817f.a()));
        bundle.putString("cliv", "fcm-" + "23.0.6");
        k kVar = this.f2816e.get();
        i iVar = this.f2815d.get();
        if (kVar != null && iVar != null && (b2 = kVar.b("fire-iid")) != k.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b2.a()));
            bundle.putString("Firebase-Client", iVar.a());
        }
    }

    private f.e.a.c.g.i<Bundle> k(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.c.a(bundle);
        } catch (InterruptedException | ExecutionException e2) {
            return f.e.a.c.g.l.e(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public f.e.a.c.g.i<?> b() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return c(k(r0.c(this.a), "*", bundle));
    }

    /* access modifiers changed from: package-private */
    public f.e.a.c.g.i<String> e() {
        return c(k(r0.c(this.a), "*", new Bundle()));
    }

    /* access modifiers changed from: package-private */
    public f.e.a.c.g.i<?> l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return c(k(str, "/topics/" + str2, bundle));
    }

    /* access modifiers changed from: package-private */
    public f.e.a.c.g.i<?> m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return c(k(str, "/topics/" + str2, bundle));
    }
}
