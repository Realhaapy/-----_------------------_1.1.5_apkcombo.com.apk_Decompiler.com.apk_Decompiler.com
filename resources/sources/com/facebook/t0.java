package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import m.y.d.l;

public final class t0 extends OutputStream implements v0 {

    /* renamed from: e  reason: collision with root package name */
    private final Handler f1744e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<j0, w0> f1745f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private j0 f1746g;

    /* renamed from: h  reason: collision with root package name */
    private w0 f1747h;

    /* renamed from: i  reason: collision with root package name */
    private int f1748i;

    public t0(Handler handler) {
        this.f1744e = handler;
    }

    public void a(j0 j0Var) {
        this.f1746g = j0Var;
        this.f1747h = j0Var != null ? this.f1745f.get(j0Var) : null;
    }

    public final void c(long j2) {
        j0 j0Var = this.f1746g;
        if (j0Var != null) {
            if (this.f1747h == null) {
                w0 w0Var = new w0(this.f1744e, j0Var);
                this.f1747h = w0Var;
                this.f1745f.put(j0Var, w0Var);
            }
            w0 w0Var2 = this.f1747h;
            if (w0Var2 != null) {
                w0Var2.b(j2);
            }
            this.f1748i += (int) j2;
        }
    }

    public final int g() {
        return this.f1748i;
    }

    public final Map<j0, w0> o() {
        return this.f1745f;
    }

    public void write(int i2) {
        c(1);
    }

    public void write(byte[] bArr) {
        l.d(bArr, "buffer");
        c((long) bArr.length);
    }

    public void write(byte[] bArr, int i2, int i3) {
        l.d(bArr, "buffer");
        c((long) i3);
    }
}
