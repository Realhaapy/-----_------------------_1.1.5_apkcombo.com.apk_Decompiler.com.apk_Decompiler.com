package f.e.a.c.d.d;

import java.util.AbstractMap;

final class c extends b0 {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ d f3895g;

    c(d dVar) {
        this.f3895g = dVar;
    }

    public final /* bridge */ /* synthetic */ Object get(int i2) {
        t.a(i2, this.f3895g.f3898i, "index");
        d dVar = this.f3895g;
        int i3 = i2 + i2;
        Object obj = dVar.f3897h[i3];
        obj.getClass();
        Object obj2 = dVar.f3897h[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final boolean m() {
        return true;
    }

    public final int size() {
        return this.f3895g.f3898i;
    }
}
