package com.android.billingclient.api;

public final class b {
    /* access modifiers changed from: private */
    public String a;

    public static final class a {
        private String a;

        /* synthetic */ a(u uVar) {
        }

        public b a() {
            String str = this.a;
            if (str != null) {
                b bVar = new b((o0) null);
                bVar.a = str;
                return bVar;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        public a b(String str) {
            this.a = str;
            return this;
        }
    }

    /* synthetic */ b(o0 o0Var) {
    }

    public static a b() {
        return new a((u) null);
    }

    public String a() {
        return this.a;
    }
}
