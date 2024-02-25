package f.e.c.a.w;

import f.e.c.a.a0.s;
import f.e.c.a.a0.t;
import f.e.c.a.h;
import f.e.c.a.o;
import f.e.c.a.r;
import f.e.c.a.y.u;
import f.e.c.a.y.v;
import f.e.c.a.y.w;
import f.e.c.a.y.x;
import f.e.c.a.y.y;
import f.e.c.a.z.a.i;
import f.e.c.a.z.a.q;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

public final class b extends h<v> {

    class a extends h.b<o, v> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public o a(v vVar) {
            u P = vVar.T().P();
            SecretKeySpec secretKeySpec = new SecretKeySpec(vVar.S().w(), "HMAC");
            int Q = vVar.T().Q();
            int i2 = c.a[P.ordinal()];
            if (i2 == 1) {
                return new t(new s("HMACSHA1", secretKeySpec), Q);
            }
            if (i2 == 2) {
                return new t(new s("HMACSHA256", secretKeySpec), Q);
            }
            if (i2 == 3) {
                return new t(new s("HMACSHA512", secretKeySpec), Q);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    /* renamed from: f.e.c.a.w.b$b  reason: collision with other inner class name */
    class C0119b extends h.a<w, v> {
        C0119b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public v a(w wVar) {
            v.b V = v.V();
            V.B(b.this.k());
            V.A(wVar.Q());
            V.z(i.k(f.e.c.a.a0.u.c(wVar.P())));
            return (v) V.a();
        }

        /* renamed from: f */
        public w c(i iVar) {
            return w.R(iVar, q.b());
        }

        /* renamed from: g */
        public void d(w wVar) {
            if (wVar.P() >= 16) {
                b.o(wVar.Q());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                f.e.c.a.y.u[] r0 = f.e.c.a.y.u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                f.e.c.a.y.u r1 = f.e.c.a.y.u.SHA1     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.e.c.a.y.u r1 = f.e.c.a.y.u.SHA256     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.e.c.a.y.u r1 = f.e.c.a.y.u.SHA512     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.w.b.c.<clinit>():void");
        }
    }

    public b() {
        super(v.class, new a(o.class));
    }

    public static void m(boolean z) {
        r.q(new b(), z);
    }

    /* access modifiers changed from: private */
    public static void o(x xVar) {
        if (xVar.Q() >= 10) {
            int i2 = c.a[xVar.P().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (xVar.Q() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (xVar.Q() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (xVar.Q() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public h.a<w, v> e() {
        return new C0119b(w.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public v g(i iVar) {
        return v.W(iVar, q.b());
    }

    /* renamed from: n */
    public void i(v vVar) {
        f.e.c.a.a0.w.c(vVar.U(), k());
        if (vVar.S().size() >= 16) {
            o(vVar.T());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
