package f.e.a.c.d.d;

final class b extends b0 {

    /* renamed from: i  reason: collision with root package name */
    static final b0 f3891i = new b(new Object[0], 0);

    /* renamed from: g  reason: collision with root package name */
    final transient Object[] f3892g;

    /* renamed from: h  reason: collision with root package name */
    private final transient int f3893h;

    b(Object[] objArr, int i2) {
        this.f3892g = objArr;
        this.f3893h = i2;
    }

    public final Object get(int i2) {
        t.a(i2, this.f3893h, "index");
        Object obj = this.f3892g[i2];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    public final int h(Object[] objArr, int i2) {
        System.arraycopy(this.f3892g, 0, objArr, 0, this.f3893h);
        return this.f3893h;
    }

    /* access modifiers changed from: package-private */
    public final int i() {
        return this.f3893h;
    }

    /* access modifiers changed from: package-private */
    public final int j() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean m() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Object[] n() {
        return this.f3892g;
    }

    public final int size() {
        return this.f3893h;
    }
}
