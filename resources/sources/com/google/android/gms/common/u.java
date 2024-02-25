package com.google.android.gms.common;

import java.util.Arrays;

final class u extends t {
    private final byte[] b;

    u(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.b = bArr;
    }

    /* access modifiers changed from: package-private */
    public final byte[] c() {
        return this.b;
    }
}
