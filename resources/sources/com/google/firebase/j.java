package com.google.firebase;

import com.google.android.gms.common.internal.n;

public class j extends Exception {
    @Deprecated
    protected j() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(String str) {
        super(str);
        n.e(str, "Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(String str, Throwable th) {
        super(str, th);
        n.e(str, "Detail message must not be empty");
    }
}
