package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.g0;
import m.y.d.l;

public final class f0 {
    public static final f0 a = new f0();

    public interface a {
        void a(String str);
    }

    public static final class b implements InstallReferrerStateListener {
        final /* synthetic */ InstallReferrerClient a;
        final /* synthetic */ a b;

        b(InstallReferrerClient installReferrerClient, a aVar) {
            this.a = installReferrerClient;
            this.b = aVar;
        }

        public void a(int i2) {
            f0 f0Var;
            if (!com.facebook.internal.s0.n.a.d(this)) {
                if (i2 == 0) {
                    try {
                        ReferrerDetails a2 = this.a.a();
                        l.c(a2, "{\n                      referrerClient.installReferrer\n                    }");
                        String a3 = a2.a();
                        if (a3 != null && (q.w(a3, "fb", false, 2, (Object) null) || q.w(a3, "facebook", false, 2, (Object) null))) {
                            this.b.a(a3);
                        }
                        f0Var = f0.a;
                    } catch (RemoteException unused) {
                        return;
                    }
                } else if (i2 == 2) {
                    try {
                        f0Var = f0.a;
                    } catch (Throwable th) {
                        com.facebook.internal.s0.n.a.b(th, this);
                        return;
                    }
                } else {
                    return;
                }
                f0Var.e();
            }
        }

        public void b() {
        }
    }

    private f0() {
    }

    private final boolean b() {
        g0 g0Var = g0.a;
        return g0.c().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    private final void c(a aVar) {
        g0 g0Var = g0.a;
        InstallReferrerClient a2 = InstallReferrerClient.b(g0.c()).a();
        try {
            a2.c(new b(a2, aVar));
        } catch (Exception unused) {
        }
    }

    public static final void d(a aVar) {
        l.d(aVar, "callback");
        f0 f0Var = a;
        if (!f0Var.b()) {
            f0Var.c(aVar);
        }
    }

    /* access modifiers changed from: private */
    public final void e() {
        g0 g0Var = g0.a;
        g0.c().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
