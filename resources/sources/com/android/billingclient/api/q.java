package com.android.billingclient.api;

public final class q {
    private final String a;

    public static class a {
        /* access modifiers changed from: private */
        public String a;

        /* synthetic */ a(w0 w0Var) {
        }

        public q a() {
            if (this.a != null) {
                return new q(this, (x0) null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.a = str;
            return this;
        }
    }

    /* synthetic */ q(a aVar, x0 x0Var) {
        this.a = aVar.a;
    }

    public static a a() {
        return new a((w0) null);
    }

    public final String b() {
        return this.a;
    }
}
