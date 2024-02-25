package f.d.a.f;

import android.util.SparseArray;
import m.y.d.l;

public final class a {
    public static final a a = new a();
    private static final SparseArray<f.d.a.g.a> b = new SparseArray<>();

    private a() {
    }

    public final f.d.a.g.a a(int i2) {
        return b.get(i2);
    }

    public final void b(f.d.a.g.a aVar) {
        l.d(aVar, "handler");
        b.append(aVar.b(), aVar);
    }
}
