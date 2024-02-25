package f.e.c.a;

import f.e.c.a.y.c0;
import f.e.c.a.y.d0;
import f.e.c.a.y.i0;
import f.e.c.a.y.y;
import f.e.c.a.y.z;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

class s {
    static {
        Charset.forName("UTF-8");
    }

    public static d0.c a(c0.c cVar) {
        d0.c.a T = d0.c.T();
        T.C(cVar.S().T());
        T.B(cVar.V());
        T.A(cVar.U());
        T.z(cVar.T());
        return (d0.c) T.a();
    }

    public static d0 b(c0 c0Var) {
        d0.b T = d0.T();
        T.A(c0Var.V());
        for (c0.c a : c0Var.U()) {
            T.z(a(a));
        }
        return (d0) T.a();
    }

    public static void c(c0.c cVar) {
        if (!cVar.W()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(cVar.T())}));
        } else if (cVar.U() == i0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(cVar.T())}));
        } else if (cVar.V() == z.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(cVar.T())}));
        }
    }

    public static void d(c0 c0Var) {
        int V = c0Var.V();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (c0.c next : c0Var.U()) {
            if (next.V() == z.ENABLED) {
                c(next);
                if (next.T() == V) {
                    if (!z) {
                        z = true;
                    } else {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                }
                if (next.S().S() != y.c.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
