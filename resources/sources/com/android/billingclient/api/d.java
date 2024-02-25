package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;

public abstract class d {

    public static final class a {
        private volatile boolean a;
        private final Context b;
        private volatile p c;

        /* synthetic */ a(Context context, l1 l1Var) {
            this.b = context;
        }

        public d a() {
            if (this.b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            } else if (this.c != null) {
                p pVar = this.c;
                if (this.a) {
                    p pVar2 = this.c;
                    return this.c != null ? new e((String) null, this.a, this.b, this.c, (f1) null) : new e((String) null, this.a, this.b, (t0) null);
                }
                throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
            } else {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
        }

        public a b() {
            this.a = true;
            return this;
        }

        public a c(p pVar) {
            this.c = pVar;
            return this;
        }
    }

    public static a i(Context context) {
        return new a(context, (l1) null);
    }

    public abstract void a(b bVar, c cVar);

    public abstract void b(i iVar, j jVar);

    public abstract void c();

    public abstract int d();

    public abstract h e(String str);

    public abstract boolean f();

    public abstract h g(Activity activity, g gVar);

    @Deprecated
    public abstract void h(Activity activity, l lVar, k kVar);

    public abstract void j(q qVar, n nVar);

    public abstract void k(r rVar, o oVar);

    @Deprecated
    public abstract void l(s sVar, t tVar);

    public abstract void m(f fVar);
}
