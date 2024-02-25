package kotlinx.coroutines;

public abstract class x1 extends f0 {
    public abstract x1 V();

    /* access modifiers changed from: protected */
    public final String W() {
        x1 x1Var;
        x1 c = v0.c();
        if (this == c) {
            return "Dispatchers.Main";
        }
        try {
            x1Var = c.V();
        } catch (UnsupportedOperationException unused) {
            x1Var = null;
        }
        if (this == x1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public String toString() {
        String W = W();
        if (W != null) {
            return W;
        }
        return p0.a(this) + '@' + p0.b(this);
    }
}
