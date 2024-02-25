package f.e.c.a;

import f.e.c.a.y.c0;
import f.e.c.a.y.d0;
import f.e.c.a.y.t;
import f.e.c.a.z.a.q;
import java.security.GeneralSecurityException;

public final class i {
    private final c0 a;

    private i(c0 c0Var) {
        this.a = c0Var;
    }

    public static void a(t tVar) {
        if (tVar == null || tVar.Q().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static void b(c0 c0Var) {
        if (c0Var == null || c0Var.T() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static c0 c(t tVar, a aVar) {
        try {
            c0 X = c0.X(aVar.b(tVar.Q().w(), new byte[0]), q.b());
            b(X);
            return X;
        } catch (f.e.c.a.z.a.c0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static t d(c0 c0Var, a aVar) {
        byte[] a2 = aVar.a(c0Var.f(), new byte[0]);
        try {
            if (c0.X(aVar.b(a2, new byte[0]), q.b()).equals(c0Var)) {
                t.b R = t.R();
                R.z(f.e.c.a.z.a.i.k(a2));
                R.A(s.b(c0Var));
                return (t) R.a();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (f.e.c.a.z.a.c0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    static final i e(c0 c0Var) {
        b(c0Var);
        return new i(c0Var);
    }

    private <B, P> P i(Class<P> cls, Class<B> cls2) {
        return r.t(r.l(this, cls2), cls);
    }

    public static final i j(k kVar, a aVar) {
        t a2 = kVar.a();
        a(a2);
        return new i(c(a2, aVar));
    }

    /* access modifiers changed from: package-private */
    public c0 f() {
        return this.a;
    }

    public d0 g() {
        return s.b(this.a);
    }

    public <P> P h(Class<P> cls) {
        Class<?> e2 = r.e(cls);
        if (e2 != null) {
            return i(cls, e2);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public void k(l lVar, a aVar) {
        lVar.b(d(this.a, aVar));
    }

    public String toString() {
        return g().toString();
    }
}
