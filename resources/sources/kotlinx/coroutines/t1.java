package kotlinx.coroutines;

import m.y.d.l;

public abstract class t1 extends a0 implements w0, i1 {

    /* renamed from: h  reason: collision with root package name */
    public u1 f4943h;

    public boolean a() {
        return true;
    }

    public void dispose() {
        y().g0(this);
    }

    public y1 g() {
        return null;
    }

    public String toString() {
        return p0.a(this) + '@' + p0.b(this) + "[job@" + p0.b(y()) + ']';
    }

    public final u1 y() {
        u1 u1Var = this.f4943h;
        if (u1Var != null) {
            return u1Var;
        }
        l.n("job");
        throw null;
    }

    public final void z(u1 u1Var) {
        this.f4943h = u1Var;
    }
}
