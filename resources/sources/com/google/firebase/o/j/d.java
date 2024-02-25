package com.google.firebase.o.j;

import java.io.OutputStream;

final class d extends OutputStream {

    /* renamed from: e  reason: collision with root package name */
    private long f2861e = 0;

    d() {
    }

    /* access modifiers changed from: package-private */
    public long a() {
        return this.f2861e;
    }

    public void write(int i2) {
        this.f2861e++;
    }

    public void write(byte[] bArr) {
        this.f2861e += (long) bArr.length;
    }

    public void write(byte[] bArr, int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 > bArr.length || i3 < 0 || (i4 = i2 + i3) > bArr.length || i4 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f2861e += (long) i3;
    }
}
