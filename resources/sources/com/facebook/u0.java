package com.facebook;

import android.os.Handler;
import com.facebook.l0;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Map;
import m.y.d.l;

public final class u0 extends FilterOutputStream implements v0 {

    /* renamed from: e  reason: collision with root package name */
    private final l0 f1764e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<j0, w0> f1765f;

    /* renamed from: g  reason: collision with root package name */
    private final long f1766g;

    /* renamed from: h  reason: collision with root package name */
    private final long f1767h = g0.q();

    /* renamed from: i  reason: collision with root package name */
    private long f1768i;

    /* renamed from: j  reason: collision with root package name */
    private long f1769j;

    /* renamed from: k  reason: collision with root package name */
    private w0 f1770k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u0(OutputStream outputStream, l0 l0Var, Map<j0, w0> map, long j2) {
        super(outputStream);
        l.d(outputStream, "out");
        l.d(l0Var, "requests");
        l.d(map, "progressMap");
        this.f1764e = l0Var;
        this.f1765f = map;
        this.f1766g = j2;
        g0 g0Var = g0.a;
    }

    /* access modifiers changed from: private */
    public static final void B(l0.a aVar, u0 u0Var) {
        l.d(aVar, "$callback");
        l.d(u0Var, "this$0");
        ((l0.b) aVar).b(u0Var.f1764e, u0Var.g(), u0Var.o());
    }

    private final void c(long j2) {
        w0 w0Var = this.f1770k;
        if (w0Var != null) {
            w0Var.a(j2);
        }
        long j3 = this.f1768i + j2;
        this.f1768i = j3;
        if (j3 >= this.f1769j + this.f1767h || j3 >= this.f1766g) {
            z();
        }
    }

    private final void z() {
        if (this.f1768i > this.f1769j) {
            for (l0.a next : this.f1764e.s()) {
                if (next instanceof l0.b) {
                    Handler r2 = this.f1764e.r();
                    if ((r2 == null ? null : Boolean.valueOf(r2.post(new r(next, this)))) == null) {
                        ((l0.b) next).b(this.f1764e, this.f1768i, this.f1766g);
                    }
                }
            }
            this.f1769j = this.f1768i;
        }
    }

    public void a(j0 j0Var) {
        this.f1770k = j0Var != null ? this.f1765f.get(j0Var) : null;
    }

    public void close() {
        super.close();
        for (w0 d2 : this.f1765f.values()) {
            d2.d();
        }
        z();
    }

    public final long g() {
        return this.f1768i;
    }

    public final long o() {
        return this.f1766g;
    }

    public void write(int i2) {
        this.out.write(i2);
        c(1);
    }

    public void write(byte[] bArr) {
        l.d(bArr, "buffer");
        this.out.write(bArr);
        c((long) bArr.length);
    }

    public void write(byte[] bArr, int i2, int i3) {
        l.d(bArr, "buffer");
        this.out.write(bArr, i2, i3);
        c((long) i3);
    }
}
