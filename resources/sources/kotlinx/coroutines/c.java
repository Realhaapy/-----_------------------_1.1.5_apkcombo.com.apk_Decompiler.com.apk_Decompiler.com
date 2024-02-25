package kotlinx.coroutines;

import m.v.d;
import m.v.g;
import m.y.c.l;
import m.y.c.p;

public abstract class c<T> extends u1 implements n1, d<T>, k0 {

    /* renamed from: f  reason: collision with root package name */
    private final g f4786f;

    public c(g gVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            Q((n1) gVar.get(n1.f4932d));
        }
        this.f4786f = gVar.plus(this);
    }

    public final void P(Throwable th) {
        h0.a(this.f4786f, th);
    }

    public String X() {
        String b = e0.b(this.f4786f);
        if (b == null) {
            return super.X();
        }
        return '\"' + b + "\":" + super.X();
    }

    public boolean a() {
        return super.a();
    }

    /* access modifiers changed from: protected */
    public final void c0(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            t0(yVar.a, yVar.a());
            return;
        }
        u0(obj);
    }

    public g e() {
        return this.f4786f;
    }

    public final g getContext() {
        return this.f4786f;
    }

    public final void resumeWith(Object obj) {
        Object V = V(c0.d(obj, (l) null, 1, (Object) null));
        if (V != v1.b) {
            s0(V);
        }
    }

    /* access modifiers changed from: protected */
    public void s0(Object obj) {
        p(obj);
    }

    /* access modifiers changed from: protected */
    public void t0(Throwable th, boolean z) {
    }

    /* access modifiers changed from: protected */
    public String u() {
        return m.y.d.l.j(p0.a(this), " was cancelled");
    }

    /* access modifiers changed from: protected */
    public void u0(T t) {
    }

    public final <R> void v0(m0 m0Var, R r2, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        m0Var.c(pVar, r2, this);
    }
}
