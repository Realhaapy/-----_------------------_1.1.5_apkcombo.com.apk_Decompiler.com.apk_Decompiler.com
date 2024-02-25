package com.android.billingclient.api;

import android.text.TextUtils;

public final class c1 {
    private String a;

    /* synthetic */ c1(b1 b1Var) {
    }

    public final c1 a(String str) {
        this.a = str;
        return this;
    }

    public final e1 b() {
        if (!TextUtils.isEmpty(this.a)) {
            return new e1(this.a, (String) null, (String) null, 0, (d1) null);
        }
        throw new IllegalArgumentException("SKU must be set.");
    }
}
