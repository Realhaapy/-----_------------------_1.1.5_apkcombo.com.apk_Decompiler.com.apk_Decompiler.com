package com.android.billingclient.api;

import f.e.a.c.d.d.k;

public final class h {
    /* access modifiers changed from: private */
    public int a;
    /* access modifiers changed from: private */
    public String b;

    public static class a {
        private int a;
        private String b = "";

        /* synthetic */ a(p0 p0Var) {
        }

        public h a() {
            h hVar = new h();
            hVar.a = this.a;
            hVar.b = this.b;
            return hVar;
        }

        public a b(String str) {
            this.b = str;
            return this;
        }

        public a c(int i2) {
            this.a = i2;
            return this;
        }
    }

    public static a c() {
        return new a((p0) null);
    }

    public String a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public String toString() {
        String j2 = k.j(this.a);
        String str = this.b;
        return "Response Code: " + j2 + ", Debug Message: " + str;
    }
}
