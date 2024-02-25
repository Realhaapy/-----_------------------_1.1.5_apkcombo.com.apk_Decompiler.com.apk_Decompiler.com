package f.e.a.c.d.d;

final class f extends b0 {

    /* renamed from: g  reason: collision with root package name */
    private final transient Object[] f3904g;

    /* renamed from: h  reason: collision with root package name */
    private final transient int f3905h;

    /* renamed from: i  reason: collision with root package name */
    private final transient int f3906i;

    f(Object[] objArr, int i2, int i3) {
        this.f3904g = objArr;
        this.f3905h = i2;
        this.f3906i = i3;
    }

    public final Object get(int i2) {
        t.a(i2, this.f3906i, "index");
        Object obj = this.f3904g[i2 + i2 + this.f3905h];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    public final boolean m() {
        return true;
    }

    public final int size() {
        return this.f3906i;
    }
}
