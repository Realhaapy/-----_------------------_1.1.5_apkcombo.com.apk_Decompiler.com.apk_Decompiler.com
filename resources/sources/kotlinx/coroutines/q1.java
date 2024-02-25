package kotlinx.coroutines;

public class q1 extends u1 implements w {

    /* renamed from: f  reason: collision with root package name */
    private final boolean f4938f = s0();

    public q1(n1 n1Var) {
        super(true);
        Q(n1Var);
    }

    private final boolean s0() {
        t tVar;
        s K = K();
        t tVar2 = K instanceof t ? (t) K : null;
        if (tVar2 == null) {
            return false;
        }
        do {
            u1 y = tVar2.y();
            if (y.G()) {
                return true;
            }
            s K2 = y.K();
            if (K2 instanceof t) {
                tVar = (t) K2;
                continue;
            } else {
                tVar = null;
                continue;
            }
        } while (tVar2 != null);
        return false;
    }

    public boolean G() {
        return this.f4938f;
    }

    public boolean H() {
        return true;
    }
}
