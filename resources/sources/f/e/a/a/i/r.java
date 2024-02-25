package f.e.a.a.i;

import f.e.a.a.b;
import f.e.a.a.c;
import f.e.a.a.e;
import f.e.a.a.f;
import f.e.a.a.h;
import f.e.a.a.i.o;

final class r<T> implements f<T> {
    private final p a;
    private final String b;
    private final b c;

    /* renamed from: d  reason: collision with root package name */
    private final e<T, byte[]> f3813d;

    /* renamed from: e  reason: collision with root package name */
    private final s f3814e;

    r(p pVar, String str, b bVar, e<T, byte[]> eVar, s sVar) {
        this.a = pVar;
        this.b = str;
        this.c = bVar;
        this.f3813d = eVar;
        this.f3814e = sVar;
    }

    static /* synthetic */ void b(Exception exc) {
    }

    public void a(c<T> cVar) {
        c(cVar, a.a);
    }

    public void c(c<T> cVar, h hVar) {
        s sVar = this.f3814e;
        o.a a2 = o.a();
        a2.e(this.a);
        a2.c(cVar);
        a2.f(this.b);
        a2.d(this.f3813d);
        a2.b(this.c);
        sVar.a(a2.a(), hVar);
    }
}
