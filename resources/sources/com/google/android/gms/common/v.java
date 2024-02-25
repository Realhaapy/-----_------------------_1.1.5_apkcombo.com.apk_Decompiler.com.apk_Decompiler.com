package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class v extends t {
    private static final WeakReference<byte[]> c = new WeakReference<>((Object) null);
    private WeakReference<byte[]> b = c;

    v(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    public final byte[] c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.b.get();
            if (bArr == null) {
                bArr = d0();
                this.b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] d0();
}
