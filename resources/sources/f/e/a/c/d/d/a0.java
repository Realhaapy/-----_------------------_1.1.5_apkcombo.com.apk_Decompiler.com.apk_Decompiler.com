package f.e.a.c.d.d;

import java.util.List;

final class a0 extends b0 {

    /* renamed from: g  reason: collision with root package name */
    final transient int f3888g;

    /* renamed from: h  reason: collision with root package name */
    final transient int f3889h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ b0 f3890i;

    a0(b0 b0Var, int i2, int i3) {
        this.f3890i = b0Var;
        this.f3888g = i2;
        this.f3889h = i3;
    }

    public final Object get(int i2) {
        t.a(i2, this.f3889h, "index");
        return this.f3890i.get(i2 + this.f3888g);
    }

    /* access modifiers changed from: package-private */
    public final int i() {
        return this.f3890i.j() + this.f3888g + this.f3889h;
    }

    /* access modifiers changed from: package-private */
    public final int j() {
        return this.f3890i.j() + this.f3888g;
    }

    /* access modifiers changed from: package-private */
    public final boolean m() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Object[] n() {
        return this.f3890i.n();
    }

    public final b0 o(int i2, int i3) {
        t.c(i2, i3, this.f3889h);
        b0 b0Var = this.f3890i;
        int i4 = this.f3888g;
        return b0Var.subList(i2 + i4, i3 + i4);
    }

    public final int size() {
        return this.f3889h;
    }

    public final /* bridge */ /* synthetic */ List subList(int i2, int i3) {
        return subList(i2, i3);
    }
}
