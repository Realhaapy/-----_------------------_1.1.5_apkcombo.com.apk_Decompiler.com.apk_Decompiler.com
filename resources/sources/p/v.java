package p;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import p.a0;
import p.e0.c;
import p.e0.e.d;
import p.e0.f.g;
import p.p;
import p.r;

public class v implements Cloneable {
    static final List<w> G = c.s(w.HTTP_2, w.HTTP_1_1);
    static final List<k> H = c.s(k.f5379g, k.f5380h);
    final boolean A;
    final int B;
    final int C;
    final int D;
    final int E;
    final int F;

    /* renamed from: e  reason: collision with root package name */
    final n f5410e;

    /* renamed from: f  reason: collision with root package name */
    final Proxy f5411f;

    /* renamed from: g  reason: collision with root package name */
    final List<w> f5412g;

    /* renamed from: h  reason: collision with root package name */
    final List<k> f5413h;

    /* renamed from: i  reason: collision with root package name */
    final List<t> f5414i;

    /* renamed from: j  reason: collision with root package name */
    final List<t> f5415j;

    /* renamed from: k  reason: collision with root package name */
    final p.c f5416k;

    /* renamed from: l  reason: collision with root package name */
    final ProxySelector f5417l;

    /* renamed from: m  reason: collision with root package name */
    final m f5418m;

    /* renamed from: n  reason: collision with root package name */
    final c f5419n;

    /* renamed from: o  reason: collision with root package name */
    final d f5420o;

    /* renamed from: p  reason: collision with root package name */
    final SocketFactory f5421p;

    /* renamed from: q  reason: collision with root package name */
    final SSLSocketFactory f5422q;

    /* renamed from: r  reason: collision with root package name */
    final p.e0.l.c f5423r;

    /* renamed from: s  reason: collision with root package name */
    final HostnameVerifier f5424s;
    final g t;
    final b u;
    final b v;
    final j w;
    final o x;
    final boolean y;
    final boolean z;

    class a extends p.e0.a {
        a() {
        }

        public void a(r.a aVar, String str) {
            aVar.b(str);
        }

        public void b(r.a aVar, String str, String str2) {
            aVar.c(str, str2);
        }

        public void c(k kVar, SSLSocket sSLSocket, boolean z) {
            kVar.a(sSLSocket, z);
        }

        public int d(a0.a aVar) {
            return aVar.c;
        }

        public boolean e(j jVar, p.e0.f.c cVar) {
            return jVar.b(cVar);
        }

        public Socket f(j jVar, a aVar, g gVar) {
            return jVar.c(aVar, gVar);
        }

        public boolean g(a aVar, a aVar2) {
            return aVar.d(aVar2);
        }

        public p.e0.f.c h(j jVar, a aVar, g gVar, c0 c0Var) {
            return jVar.d(aVar, gVar, c0Var);
        }

        public void i(j jVar, p.e0.f.c cVar) {
            jVar.f(cVar);
        }

        public p.e0.f.d j(j jVar) {
            return jVar.f5374e;
        }

        public IOException k(e eVar, IOException iOException) {
            return ((x) eVar).l(iOException);
        }
    }

    public static final class b {
        int A;
        int B;
        n a = new n();
        Proxy b;
        List<w> c = v.G;

        /* renamed from: d  reason: collision with root package name */
        List<k> f5425d = v.H;

        /* renamed from: e  reason: collision with root package name */
        final List<t> f5426e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        final List<t> f5427f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        p.c f5428g = p.k(p.a);

        /* renamed from: h  reason: collision with root package name */
        ProxySelector f5429h;

        /* renamed from: i  reason: collision with root package name */
        m f5430i;

        /* renamed from: j  reason: collision with root package name */
        c f5431j;

        /* renamed from: k  reason: collision with root package name */
        d f5432k;

        /* renamed from: l  reason: collision with root package name */
        SocketFactory f5433l;

        /* renamed from: m  reason: collision with root package name */
        SSLSocketFactory f5434m;

        /* renamed from: n  reason: collision with root package name */
        p.e0.l.c f5435n;

        /* renamed from: o  reason: collision with root package name */
        HostnameVerifier f5436o;

        /* renamed from: p  reason: collision with root package name */
        g f5437p;

        /* renamed from: q  reason: collision with root package name */
        b f5438q;

        /* renamed from: r  reason: collision with root package name */
        b f5439r;

        /* renamed from: s  reason: collision with root package name */
        j f5440s;
        o t;
        boolean u;
        boolean v;
        boolean w;
        int x;
        int y;
        int z;

        public b() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f5429h = proxySelector;
            if (proxySelector == null) {
                this.f5429h = new p.e0.k.a();
            }
            this.f5430i = m.a;
            this.f5433l = SocketFactory.getDefault();
            this.f5436o = p.e0.l.d.a;
            this.f5437p = g.c;
            b bVar = b.a;
            this.f5438q = bVar;
            this.f5439r = bVar;
            this.f5440s = new j();
            this.t = o.a;
            this.u = true;
            this.v = true;
            this.w = true;
            this.x = 0;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.B = 0;
        }
    }

    static {
        p.e0.a.a = new a();
    }

    public v() {
        this(new b());
    }

    v(b bVar) {
        boolean z2;
        p.e0.l.c cVar;
        this.f5410e = bVar.a;
        this.f5411f = bVar.b;
        this.f5412g = bVar.c;
        List<k> list = bVar.f5425d;
        this.f5413h = list;
        this.f5414i = c.r(bVar.f5426e);
        this.f5415j = c.r(bVar.f5427f);
        this.f5416k = bVar.f5428g;
        this.f5417l = bVar.f5429h;
        this.f5418m = bVar.f5430i;
        c cVar2 = bVar.f5431j;
        this.f5420o = bVar.f5432k;
        this.f5421p = bVar.f5433l;
        Iterator<k> it = list.iterator();
        loop0:
        while (true) {
            z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                k next = it.next();
                if (z2 || next.d()) {
                    z2 = true;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f5434m;
        if (sSLSocketFactory != null || !z2) {
            this.f5422q = sSLSocketFactory;
            cVar = bVar.f5435n;
        } else {
            X509TrustManager A2 = c.A();
            this.f5422q = v(A2);
            cVar = p.e0.l.c.b(A2);
        }
        this.f5423r = cVar;
        if (this.f5422q != null) {
            p.e0.j.g.l().f(this.f5422q);
        }
        this.f5424s = bVar.f5436o;
        this.t = bVar.f5437p.f(this.f5423r);
        this.u = bVar.f5438q;
        this.v = bVar.f5439r;
        this.w = bVar.f5440s;
        this.x = bVar.t;
        this.y = bVar.u;
        this.z = bVar.v;
        this.A = bVar.w;
        this.B = bVar.x;
        this.C = bVar.y;
        this.D = bVar.z;
        this.E = bVar.A;
        this.F = bVar.B;
        if (this.f5414i.contains((Object) null)) {
            throw new IllegalStateException("Null interceptor: " + this.f5414i);
        } else if (this.f5415j.contains((Object) null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f5415j);
        }
    }

    private static SSLSocketFactory v(X509TrustManager x509TrustManager) {
        try {
            SSLContext m2 = p.e0.j.g.l().m();
            m2.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            return m2.getSocketFactory();
        } catch (GeneralSecurityException e2) {
            throw c.b("No System TLS", e2);
        }
    }

    public ProxySelector A() {
        return this.f5417l;
    }

    public int B() {
        return this.D;
    }

    public boolean C() {
        return this.A;
    }

    public SocketFactory D() {
        return this.f5421p;
    }

    public SSLSocketFactory E() {
        return this.f5422q;
    }

    public int F() {
        return this.E;
    }

    public b b() {
        return this.v;
    }

    public int d() {
        return this.B;
    }

    public g e() {
        return this.t;
    }

    public int f() {
        return this.C;
    }

    public j h() {
        return this.w;
    }

    public List<k> i() {
        return this.f5413h;
    }

    public m j() {
        return this.f5418m;
    }

    public n k() {
        return this.f5410e;
    }

    public o l() {
        return this.x;
    }

    public p.c m() {
        return this.f5416k;
    }

    public boolean n() {
        return this.z;
    }

    public boolean p() {
        return this.y;
    }

    public HostnameVerifier q() {
        return this.f5424s;
    }

    public List<t> r() {
        return this.f5414i;
    }

    /* access modifiers changed from: package-private */
    public d s() {
        c cVar = this.f5419n;
        return cVar != null ? cVar.f5107e : this.f5420o;
    }

    public List<t> t() {
        return this.f5415j;
    }

    public e u(y yVar) {
        return x.j(this, yVar, false);
    }

    public int w() {
        return this.F;
    }

    public List<w> x() {
        return this.f5412g;
    }

    public Proxy y() {
        return this.f5411f;
    }

    public b z() {
        return this.u;
    }
}
