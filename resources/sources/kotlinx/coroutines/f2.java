package kotlinx.coroutines;

import m.v.g;

public final class f2 extends f0 {

    /* renamed from: f  reason: collision with root package name */
    public static final f2 f4792f = new f2();

    private f2() {
    }

    public void T(g gVar, Runnable runnable) {
        i2 i2Var = (i2) gVar.get(i2.f4800f);
        if (i2Var != null) {
            i2Var.f4801e = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public boolean U(g gVar) {
        return false;
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
