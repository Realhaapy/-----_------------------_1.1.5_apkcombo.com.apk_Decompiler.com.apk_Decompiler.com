package f.e.a.c.d.d;

import java.util.Iterator;

final class e extends f0 {

    /* renamed from: g  reason: collision with root package name */
    private final transient e0 f3899g;

    /* renamed from: h  reason: collision with root package name */
    private final transient b0 f3900h;

    e(e0 e0Var, b0 b0Var) {
        this.f3899g = e0Var;
        this.f3900h = b0Var;
    }

    public final boolean contains(Object obj) {
        return this.f3899g.get(obj) != null;
    }

    /* access modifiers changed from: package-private */
    public final int h(Object[] objArr, int i2) {
        return this.f3900h.h(objArr, 0);
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f3900h.listIterator(0);
    }

    public final b0 k() {
        return this.f3900h;
    }

    public final i l() {
        return this.f3900h.listIterator(0);
    }

    public final int size() {
        return this.f3899g.size();
    }
}
