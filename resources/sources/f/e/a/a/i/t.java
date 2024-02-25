package f.e.a.a.i;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.u;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.w;
import f.e.a.a.b;
import f.e.a.a.g;
import f.e.a.a.h;
import f.e.a.a.i.a0.e;
import f.e.a.a.i.c0.a;
import f.e.a.a.i.j;
import f.e.a.a.i.p;
import f.e.a.a.i.u;
import java.util.Collections;
import java.util.Set;

public class t implements s {

    /* renamed from: e  reason: collision with root package name */
    private static volatile u f3815e;
    private final a a;
    private final a b;
    private final e c;

    /* renamed from: d  reason: collision with root package name */
    private final u f3816d;

    t(a aVar, a aVar2, e eVar, u uVar, w wVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = eVar;
        this.f3816d = uVar;
        wVar.a();
    }

    private j b(o oVar) {
        j.a a2 = j.a();
        a2.i(this.a.a());
        a2.k(this.b.a());
        a2.j(oVar.g());
        a2.h(new i(oVar.b(), oVar.d()));
        a2.g(oVar.c().a());
        return a2.d();
    }

    public static t c() {
        u uVar = f3815e;
        if (uVar != null) {
            return uVar.c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<b> d(g gVar) {
        return gVar instanceof h ? Collections.unmodifiableSet(((h) gVar).a()) : Collections.singleton(b.b("proto"));
    }

    public static void f(Context context) {
        if (f3815e == null) {
            synchronized (t.class) {
                if (f3815e == null) {
                    u.a g2 = f.g();
                    g2.b(context);
                    f3815e = g2.a();
                }
            }
        }
    }

    public void a(o oVar, h hVar) {
        this.c.a(oVar.f().f(oVar.c().c()), b(oVar), hVar);
    }

    public com.google.android.datatransport.runtime.scheduling.jobscheduling.u e() {
        return this.f3816d;
    }

    public g g(g gVar) {
        Set<b> d2 = d(gVar);
        p.a a2 = p.a();
        a2.b(gVar.b());
        a2.c(gVar.c());
        return new q(d2, a2.a(), this);
    }
}
