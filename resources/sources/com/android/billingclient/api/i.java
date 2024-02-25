package com.android.billingclient.api;

public final class i {
    /* access modifiers changed from: private */
    public String a;

    public static final class a {
        private String a;

        /* synthetic */ a(r0 r0Var) {
        }

        public i a() {
            String str = this.a;
            if (str != null) {
                i iVar = new i((s0) null);
                iVar.a = str;
                return iVar;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        public a b(String str) {
            this.a = str;
            return this;
        }
    }

    /* synthetic */ i(s0 s0Var) {
    }

    public static a b() {
        return new a((r0) null);
    }

    public String a() {
        return this.a;
    }
}
