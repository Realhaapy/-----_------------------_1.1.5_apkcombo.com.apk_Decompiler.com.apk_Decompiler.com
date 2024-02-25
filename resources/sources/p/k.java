package p;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p.e0.c;

public final class k {

    /* renamed from: e  reason: collision with root package name */
    private static final h[] f5377e;

    /* renamed from: f  reason: collision with root package name */
    private static final h[] f5378f;

    /* renamed from: g  reason: collision with root package name */
    public static final k f5379g;

    /* renamed from: h  reason: collision with root package name */
    public static final k f5380h = new a(false).a();
    final boolean a;
    final boolean b;
    final String[] c;

    /* renamed from: d  reason: collision with root package name */
    final String[] f5381d;

    public static final class a {
        boolean a;
        String[] b;
        String[] c;

        /* renamed from: d  reason: collision with root package name */
        boolean f5382d;

        public a(k kVar) {
            this.a = kVar.a;
            this.b = kVar.c;
            this.c = kVar.f5381d;
            this.f5382d = kVar.b;
        }

        a(boolean z) {
            this.a = z;
        }

        public k a() {
            return new k(this);
        }

        public a b(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public a c(h... hVarArr) {
            if (this.a) {
                String[] strArr = new String[hVarArr.length];
                for (int i2 = 0; i2 < hVarArr.length; i2++) {
                    strArr[i2] = hVarArr[i2].a;
                }
                b(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a d(boolean z) {
            if (this.a) {
                this.f5382d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public a e(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public a f(d0... d0VarArr) {
            if (this.a) {
                String[] strArr = new String[d0VarArr.length];
                for (int i2 = 0; i2 < d0VarArr.length; i2++) {
                    strArr[i2] = d0VarArr[i2].f5129e;
                }
                e(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    static {
        h hVar = h.f5369q;
        h hVar2 = h.f5370r;
        h hVar3 = h.f5371s;
        h hVar4 = h.t;
        h hVar5 = h.u;
        h hVar6 = h.f5363k;
        h hVar7 = h.f5365m;
        h hVar8 = h.f5364l;
        h hVar9 = h.f5366n;
        h hVar10 = h.f5368p;
        h hVar11 = h.f5367o;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11};
        f5377e = hVarArr;
        h[] hVarArr2 = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, h.f5361i, h.f5362j, h.f5359g, h.f5360h, h.f5357e, h.f5358f, h.f5356d};
        f5378f = hVarArr2;
        a aVar = new a(true);
        aVar.c(hVarArr);
        d0 d0Var = d0.TLS_1_3;
        d0 d0Var2 = d0.TLS_1_2;
        aVar.f(d0Var, d0Var2);
        aVar.d(true);
        aVar.a();
        a aVar2 = new a(true);
        aVar2.c(hVarArr2);
        d0 d0Var3 = d0.TLS_1_0;
        aVar2.f(d0Var, d0Var2, d0.TLS_1_1, d0Var3);
        aVar2.d(true);
        f5379g = aVar2.a();
        a aVar3 = new a(true);
        aVar3.c(hVarArr2);
        aVar3.f(d0Var3);
        aVar3.d(true);
        aVar3.a();
    }

    k(a aVar) {
        this.a = aVar.a;
        this.c = aVar.b;
        this.f5381d = aVar.c;
        this.b = aVar.f5382d;
    }

    private k e(SSLSocket sSLSocket, boolean z) {
        String[] x = this.c != null ? c.x(h.b, sSLSocket.getEnabledCipherSuites(), this.c) : sSLSocket.getEnabledCipherSuites();
        String[] x2 = this.f5381d != null ? c.x(c.f5133f, sSLSocket.getEnabledProtocols(), this.f5381d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int u = c.u(h.b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && u != -1) {
            x = c.g(x, supportedCipherSuites[u]);
        }
        a aVar = new a(this);
        aVar.b(x);
        aVar.e(x2);
        return aVar.a();
    }

    /* access modifiers changed from: package-private */
    public void a(SSLSocket sSLSocket, boolean z) {
        k e2 = e(sSLSocket, z);
        String[] strArr = e2.f5381d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = e2.c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public List<h> b() {
        String[] strArr = this.c;
        if (strArr != null) {
            return h.b(strArr);
        }
        return null;
    }

    public boolean c(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.f5381d;
        if (strArr != null && !c.z(c.f5133f, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || c.z(h.b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        k kVar = (k) obj;
        boolean z = this.a;
        if (z != kVar.a) {
            return false;
        }
        return !z || (Arrays.equals(this.c, kVar.c) && Arrays.equals(this.f5381d, kVar.f5381d) && this.b == kVar.b);
    }

    public boolean f() {
        return this.b;
    }

    public List<d0> g() {
        String[] strArr = this.f5381d;
        if (strArr != null) {
            return d0.c(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.a) {
            return ((((527 + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.f5381d)) * 31) + (this.b ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        String str = "[all enabled]";
        String obj = this.c != null ? b().toString() : str;
        if (this.f5381d != null) {
            str = g().toString();
        }
        return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + str + ", supportsTlsExtensions=" + this.b + ")";
    }
}
