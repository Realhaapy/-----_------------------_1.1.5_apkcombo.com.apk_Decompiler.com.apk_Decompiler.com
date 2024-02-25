package com.android.billingclient.api;

public class l {
    /* access modifiers changed from: private */
    public SkuDetails a;

    public static class a {
        private SkuDetails a;

        public l a() {
            SkuDetails skuDetails = this.a;
            if (skuDetails != null) {
                l lVar = new l();
                lVar.a = skuDetails;
                return lVar;
            }
            throw new IllegalArgumentException("SkuDetails must be set");
        }

        public a b(SkuDetails skuDetails) {
            this.a = skuDetails;
            return this;
        }
    }

    public SkuDetails b() {
        return this.a;
    }
}
