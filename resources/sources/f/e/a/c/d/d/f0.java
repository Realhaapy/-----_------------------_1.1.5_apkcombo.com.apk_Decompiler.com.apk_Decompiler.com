package f.e.a.c.d.d;

import java.util.Set;

public abstract class f0 extends y implements Set {

    /* renamed from: f  reason: collision with root package name */
    private transient b0 f3907f;

    f0() {
    }

    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    public final int hashCode() {
        return h.a(this);
    }

    public b0 k() {
        b0 b0Var = this.f3907f;
        if (b0Var != null) {
            return b0Var;
        }
        b0 o2 = o();
        this.f3907f = o2;
        return o2;
    }

    /* access modifiers changed from: package-private */
    public b0 o() {
        return b0.p(toArray());
    }
}
