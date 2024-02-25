package com.android.billingclient.api;

public final class r {
    private final String a;

    public static class a {
        /* access modifiers changed from: private */
        public String a;

        /* synthetic */ a(y0 y0Var) {
        }

        public r a() {
            if (this.a != null) {
                return new r(this, (z0) null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.a = str;
            return this;
        }
    }

    /* synthetic */ r(a aVar, z0 z0Var) {
        this.a = aVar.a;
    }

    public static a a() {
        return new a((y0) null);
    }

    public final String b() {
        return this.a;
    }
}
