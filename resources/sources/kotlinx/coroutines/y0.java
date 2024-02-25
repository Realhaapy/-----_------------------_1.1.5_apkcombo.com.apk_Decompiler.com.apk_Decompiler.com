package kotlinx.coroutines;

import kotlinx.coroutines.internal.a;

public abstract class y0 extends f0 {

    /* renamed from: f  reason: collision with root package name */
    private long f4964f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4965g;

    /* renamed from: h  reason: collision with root package name */
    private a<s0<?>> f4966h;

    private final long W(boolean z) {
        return z ? 4294967296L : 1;
    }

    public static /* synthetic */ void a0(y0 y0Var, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                z = false;
            }
            y0Var.Z(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final void V(boolean z) {
        long W = this.f4964f - W(z);
        this.f4964f = W;
        if (W <= 0) {
            if (o0.a()) {
                if (!(this.f4964f == 0)) {
                    throw new AssertionError();
                }
            }
            if (this.f4965g) {
                e0();
            }
        }
    }

    public final void X(s0<?> s0Var) {
        a<s0<?>> aVar = this.f4966h;
        if (aVar == null) {
            aVar = new a<>();
            this.f4966h = aVar;
        }
        aVar.a(s0Var);
    }

    /* access modifiers changed from: protected */
    public long Y() {
        a<s0<?>> aVar = this.f4966h;
        return (aVar != null && !aVar.c()) ? 0 : Long.MAX_VALUE;
    }

    public final void Z(boolean z) {
        this.f4964f += W(z);
        if (!z) {
            this.f4965g = true;
        }
    }

    public final boolean b0() {
        return this.f4964f >= W(true);
    }

    public final boolean c0() {
        a<s0<?>> aVar = this.f4966h;
        if (aVar == null) {
            return true;
        }
        return aVar.c();
    }

    public final boolean d0() {
        s0 d2;
        a<s0<?>> aVar = this.f4966h;
        if (aVar == null || (d2 = aVar.d()) == null) {
            return false;
        }
        d2.run();
        return true;
    }

    /* access modifiers changed from: protected */
    public void e0() {
    }
}
