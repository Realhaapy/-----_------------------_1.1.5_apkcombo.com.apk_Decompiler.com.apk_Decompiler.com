package f.e.a.c.e;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;

public final class f {
    public static final a.g<f.e.a.c.e.b.a> a;
    public static final a.g<f.e.a.c.e.b.a> b;
    public static final a.C0039a<f.e.a.c.e.b.a, a> c;

    /* renamed from: d  reason: collision with root package name */
    static final a.C0039a<f.e.a.c.e.b.a, e> f3934d;

    static {
        a.g<f.e.a.c.e.b.a> gVar = new a.g<>();
        a = gVar;
        a.g<f.e.a.c.e.b.a> gVar2 = new a.g<>();
        b = gVar2;
        c cVar = new c();
        c = cVar;
        d dVar = new d();
        f3934d = dVar;
        new Scope("profile");
        new Scope("email");
        new a("SignIn.API", cVar, gVar);
        new a("SignIn.INTERNAL_API", dVar, gVar2);
    }
}
