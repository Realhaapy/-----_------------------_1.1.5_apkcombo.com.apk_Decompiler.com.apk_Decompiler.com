package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

@Deprecated
public class s {
    /* access modifiers changed from: private */
    public String a;
    /* access modifiers changed from: private */
    public List b;

    public static class a {
        private String a;
        private List b;

        /* synthetic */ a(a1 a1Var) {
        }

        public s a() {
            String str = this.a;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            } else if (this.b != null) {
                s sVar = new s();
                sVar.a = str;
                sVar.b = this.b;
                return sVar;
            } else {
                throw new IllegalArgumentException("SKU list or SkuWithOffer list must be set");
            }
        }

        public a b(List<String> list) {
            this.b = new ArrayList(list);
            return this;
        }

        public a c(String str) {
            this.a = str;
            return this;
        }
    }

    public static a c() {
        return new a((a1) null);
    }

    public String a() {
        return this.a;
    }

    public List<String> b() {
        return this.b;
    }
}
