package f.e.d.y.n;

import f.e.d.a0.c;
import f.e.d.f;
import f.e.d.j;
import f.e.d.k;
import f.e.d.r;
import f.e.d.s;
import f.e.d.v;
import f.e.d.w;

public final class l<T> extends v<T> {
    private final s<T> a;
    private final k<T> b;
    final f c;

    /* renamed from: d  reason: collision with root package name */
    private final f.e.d.z.a<T> f4398d;

    /* renamed from: e  reason: collision with root package name */
    private final w f4399e;

    /* renamed from: f  reason: collision with root package name */
    private final l<T>.defpackage.b f4400f = new b();

    /* renamed from: g  reason: collision with root package name */
    private v<T> f4401g;

    private final class b implements r, j {
        private b(l lVar) {
        }
    }

    public l(s<T> sVar, k<T> kVar, f fVar, f.e.d.z.a<T> aVar, w wVar) {
        this.a = sVar;
        this.b = kVar;
        this.c = fVar;
        this.f4398d = aVar;
        this.f4399e = wVar;
    }

    private v<T> f() {
        v<T> vVar = this.f4401g;
        if (vVar != null) {
            return vVar;
        }
        v<T> l2 = this.c.l(this.f4399e, this.f4398d);
        this.f4401g = l2;
        return l2;
    }

    public T c(f.e.d.a0.a aVar) {
        if (this.b == null) {
            return f().c(aVar);
        }
        f.e.d.l a2 = f.e.d.y.l.a(aVar);
        if (a2.m()) {
            return null;
        }
        return this.b.a(a2, this.f4398d.e(), this.f4400f);
    }

    public void e(c cVar, T t) {
        s<T> sVar = this.a;
        if (sVar == null) {
            f().e(cVar, t);
        } else if (t == null) {
            cVar.S();
        } else {
            f.e.d.y.l.b(sVar.a(t, this.f4398d.e(), this.f4400f), cVar);
        }
    }
}
