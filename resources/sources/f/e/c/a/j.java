package f.e.c.a;

import f.e.c.a.y.a0;
import f.e.c.a.y.c0;
import f.e.c.a.y.i0;
import f.e.c.a.y.y;
import f.e.c.a.y.z;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Iterator;

public final class j {
    private final c0.b a;

    private j(c0.b bVar) {
        this.a = bVar;
    }

    private synchronized boolean d(int i2) {
        boolean z;
        Iterator<c0.c> it = this.a.C().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().T() == i2) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }

    private synchronized c0.c e(a0 a0Var) {
        c0.c.a X;
        y p2 = r.p(a0Var);
        int f2 = f();
        i0 S = a0Var.S();
        if (S == i0.UNKNOWN_PREFIX) {
            S = i0.TINK;
        }
        X = c0.c.X();
        X.z(p2);
        X.A(f2);
        X.C(z.ENABLED);
        X.B(S);
        return (c0.c) X.a();
    }

    private synchronized int f() {
        int g2;
        do {
            g2 = g();
        } while (d(g2));
        return g2;
    }

    private static int g() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b = 0;
        while (b == 0) {
            secureRandom.nextBytes(bArr);
            b = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b;
    }

    public static j i() {
        return new j(c0.W());
    }

    public static j j(i iVar) {
        return new j((c0.b) iVar.f().e());
    }

    public synchronized j a(g gVar) {
        b(gVar.b(), false);
        return this;
    }

    @Deprecated
    public synchronized int b(a0 a0Var, boolean z) {
        c0.c e2;
        e2 = e(a0Var);
        this.a.z(e2);
        if (z) {
            this.a.D(e2.T());
        }
        return e2.T();
    }

    public synchronized i c() {
        return i.e((c0) this.a.a());
    }

    public synchronized j h(int i2) {
        int i3 = 0;
        while (i3 < this.a.B()) {
            c0.c A = this.a.A(i3);
            if (A.T() != i2) {
                i3++;
            } else if (A.V().equals(z.ENABLED)) {
                this.a.D(i2);
            } else {
                throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i2);
            }
        }
        throw new GeneralSecurityException("key not found: " + i2);
        return this;
    }
}
