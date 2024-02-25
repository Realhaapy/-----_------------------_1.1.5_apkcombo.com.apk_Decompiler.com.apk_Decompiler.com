package com.facebook;

import android.os.Handler;
import com.facebook.j0;
import m.y.d.l;

public final class w0 {
    private final Handler a;
    private final j0 b;
    private final long c = g0.q();

    /* renamed from: d  reason: collision with root package name */
    private long f1777d;

    /* renamed from: e  reason: collision with root package name */
    private long f1778e;

    /* renamed from: f  reason: collision with root package name */
    private long f1779f;

    public w0(Handler handler, j0 j0Var) {
        l.d(j0Var, "request");
        this.a = handler;
        this.b = j0Var;
        g0 g0Var = g0.a;
    }

    /* access modifiers changed from: private */
    public static final void e(j0.b bVar, long j2, long j3) {
        ((j0.f) bVar).b(j2, j3);
    }

    public final void a(long j2) {
        long j3 = this.f1777d + j2;
        this.f1777d = j3;
        if (j3 >= this.f1778e + this.c || j3 >= this.f1779f) {
            d();
        }
    }

    public final void b(long j2) {
        this.f1779f += j2;
    }

    public final void d() {
        if (this.f1777d > this.f1778e) {
            j0.b n2 = this.b.n();
            long j2 = this.f1779f;
            if (j2 > 0 && (n2 instanceof j0.f)) {
                long j3 = this.f1777d;
                Handler handler = this.a;
                if ((handler == null ? null : Boolean.valueOf(handler.post(new s(n2, j3, j2)))) == null) {
                    ((j0.f) n2).b(j3, j2);
                }
                this.f1778e = this.f1777d;
            }
        }
    }
}
