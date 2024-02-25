package p.e0.f;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import p.a0;
import p.c0;
import p.e0.h.a;
import p.e0.i.b;
import p.e0.i.f;
import p.e0.i.g;
import p.i;
import p.j;
import p.p;
import p.q;
import p.s;
import p.t;
import p.v;
import p.w;
import p.y;
import p.z;
import q.d;
import q.e;
import q.l;

public final class c extends g.j implements i {
    private final j b;
    private final c0 c;

    /* renamed from: d  reason: collision with root package name */
    private Socket f5150d;

    /* renamed from: e  reason: collision with root package name */
    private Socket f5151e;

    /* renamed from: f  reason: collision with root package name */
    private q f5152f;

    /* renamed from: g  reason: collision with root package name */
    private w f5153g;

    /* renamed from: h  reason: collision with root package name */
    private g f5154h;

    /* renamed from: i  reason: collision with root package name */
    private e f5155i;

    /* renamed from: j  reason: collision with root package name */
    private d f5156j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5157k;

    /* renamed from: l  reason: collision with root package name */
    public int f5158l;

    /* renamed from: m  reason: collision with root package name */
    public int f5159m = 1;

    /* renamed from: n  reason: collision with root package name */
    public final List<Reference<g>> f5160n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public long f5161o = Long.MAX_VALUE;

    public c(j jVar, c0 c0Var) {
        this.b = jVar;
        this.c = c0Var;
    }

    private void e(int i2, int i3, p.e eVar, p pVar) {
        Proxy b2 = this.c.b();
        this.f5150d = (b2.type() == Proxy.Type.DIRECT || b2.type() == Proxy.Type.HTTP) ? this.c.a().j().createSocket() : new Socket(b2);
        pVar.f(eVar, this.c.d(), b2);
        this.f5150d.setSoTimeout(i3);
        try {
            p.e0.j.g.l().h(this.f5150d, this.c.d(), i2);
            try {
                this.f5155i = l.b(l.i(this.f5150d));
                this.f5156j = l.a(l.f(this.f5150d));
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.c.d());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0137 A[Catch:{ all -> 0x012e }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013d A[Catch:{ all -> 0x012e }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f(p.e0.f.b r8) {
        /*
            r7 = this;
            p.c0 r0 = r7.c
            p.a r0 = r0.a()
            javax.net.ssl.SSLSocketFactory r1 = r0.k()
            r2 = 0
            java.net.Socket r3 = r7.f5150d     // Catch:{ AssertionError -> 0x0130 }
            p.s r4 = r0.l()     // Catch:{ AssertionError -> 0x0130 }
            java.lang.String r4 = r4.l()     // Catch:{ AssertionError -> 0x0130 }
            p.s r5 = r0.l()     // Catch:{ AssertionError -> 0x0130 }
            int r5 = r5.w()     // Catch:{ AssertionError -> 0x0130 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x0130 }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x0130 }
            p.k r8 = r8.a(r1)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            boolean r3 = r8.f()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            if (r3 == 0) goto L_0x0041
            p.e0.j.g r3 = p.e0.j.g.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            p.s r4 = r0.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r4 = r4.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.util.List r5 = r0.f()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r3.g(r1, r4, r5)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
        L_0x0041:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            p.q r4 = p.q.b(r3)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            javax.net.ssl.HostnameVerifier r5 = r0.e()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            p.s r6 = r0.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r6 = r6.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            if (r3 != 0) goto L_0x00d8
            java.util.List r8 = r4.c()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            boolean r2 = r8.isEmpty()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r3 = "Hostname "
            if (r2 != 0) goto L_0x00b6
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r4.<init>()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r4.append(r3)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            p.s r0 = r0.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = r0.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = " not verified:\n    certificate: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = p.g.c(r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = "\n    DN: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.util.List r8 = p.e0.l.d.a(r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r4.append(r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r8 = r4.toString()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            throw r2     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
        L_0x00b6:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r2.<init>()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r2.append(r3)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            p.s r0 = r0.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = r0.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r2.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = r2.toString()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r8.<init>(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            throw r8     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
        L_0x00d8:
            p.g r3 = r0.a()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            p.s r0 = r0.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = r0.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.util.List r5 = r4.c()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r3.a(r0, r5)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            boolean r8 = r8.f()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            if (r8 == 0) goto L_0x00f9
            p.e0.j.g r8 = p.e0.j.g.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r2 = r8.n(r1)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
        L_0x00f9:
            r7.f5151e = r1     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            q.s r8 = q.l.i(r1)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            q.e r8 = q.l.b(r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r7.f5155i = r8     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.net.Socket r8 = r7.f5151e     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            q.r r8 = q.l.f(r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            q.d r8 = q.l.a(r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r7.f5156j = r8     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r7.f5152f = r4     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            if (r2 == 0) goto L_0x011a
            p.w r8 = p.w.a(r2)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            goto L_0x011c
        L_0x011a:
            p.w r8 = p.w.HTTP_1_1     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
        L_0x011c:
            r7.f5153g = r8     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            if (r1 == 0) goto L_0x0127
            p.e0.j.g r8 = p.e0.j.g.l()
            r8.a(r1)
        L_0x0127:
            return
        L_0x0128:
            r8 = move-exception
            r2 = r1
            goto L_0x013e
        L_0x012b:
            r8 = move-exception
            r2 = r1
            goto L_0x0131
        L_0x012e:
            r8 = move-exception
            goto L_0x013e
        L_0x0130:
            r8 = move-exception
        L_0x0131:
            boolean r0 = p.e0.c.y(r8)     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x013d
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x012e }
            r0.<init>(r8)     // Catch:{ all -> 0x012e }
            throw r0     // Catch:{ all -> 0x012e }
        L_0x013d:
            throw r8     // Catch:{ all -> 0x012e }
        L_0x013e:
            if (r2 == 0) goto L_0x0147
            p.e0.j.g r0 = p.e0.j.g.l()
            r0.a(r2)
        L_0x0147:
            p.e0.c.f(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e0.f.c.f(p.e0.f.b):void");
    }

    private void g(int i2, int i3, int i4, p.e eVar, p pVar) {
        y i5 = i();
        s h2 = i5.h();
        int i6 = 0;
        while (i6 < 21) {
            e(i2, i3, eVar, pVar);
            i5 = h(i3, i4, i5, h2);
            if (i5 != null) {
                p.e0.c.f(this.f5150d);
                this.f5150d = null;
                this.f5156j = null;
                this.f5155i = null;
                pVar.d(eVar, this.c.d(), this.c.b(), (w) null);
                i6++;
            } else {
                return;
            }
        }
    }

    private y h(int i2, int i3, y yVar, s sVar) {
        String str = "CONNECT " + p.e0.c.q(sVar, true) + " HTTP/1.1";
        while (true) {
            e eVar = this.f5155i;
            a aVar = new a((v) null, (g) null, eVar, this.f5156j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            eVar.d().g((long) i2, timeUnit);
            this.f5156j.d().g((long) i3, timeUnit);
            aVar.o(yVar.d(), str);
            aVar.a();
            a0.a f2 = aVar.f(false);
            f2.p(yVar);
            a0 c2 = f2.c();
            long b2 = p.e0.g.e.b(c2);
            if (b2 == -1) {
                b2 = 0;
            }
            q.s k2 = aVar.k(b2);
            p.e0.c.B(k2, Integer.MAX_VALUE, timeUnit);
            k2.close();
            int g2 = c2.g();
            if (g2 != 200) {
                if (g2 == 407) {
                    y a = this.c.a().h().a(this.c, c2);
                    if (a == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if ("close".equalsIgnoreCase(c2.v("Connection"))) {
                        return a;
                    } else {
                        yVar = a;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c2.g());
                }
            } else if (this.f5155i.b().s() && this.f5156j.b().s()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private y i() {
        y.a aVar = new y.a();
        aVar.g(this.c.a().l());
        aVar.d("CONNECT", (z) null);
        aVar.b("Host", p.e0.c.q(this.c.a().l(), true));
        aVar.b("Proxy-Connection", "Keep-Alive");
        aVar.b("User-Agent", p.e0.d.a());
        y a = aVar.a();
        a0.a aVar2 = new a0.a();
        aVar2.p(a);
        aVar2.n(w.HTTP_1_1);
        aVar2.g(407);
        aVar2.k("Preemptive Authenticate");
        aVar2.b(p.e0.c.c);
        aVar2.q(-1);
        aVar2.o(-1);
        aVar2.i("Proxy-Authenticate", "OkHttp-Preemptive");
        y a2 = this.c.a().h().a(this.c, aVar2.c());
        return a2 != null ? a2 : a;
    }

    private void j(b bVar, int i2, p.e eVar, p pVar) {
        if (this.c.a().k() == null) {
            List<w> f2 = this.c.a().f();
            w wVar = w.H2_PRIOR_KNOWLEDGE;
            if (f2.contains(wVar)) {
                this.f5151e = this.f5150d;
                this.f5153g = wVar;
                r(i2);
                return;
            }
            this.f5151e = this.f5150d;
            this.f5153g = w.HTTP_1_1;
            return;
        }
        pVar.u(eVar);
        f(bVar);
        pVar.t(eVar, this.f5152f);
        if (this.f5153g == w.HTTP_2) {
            r(i2);
        }
    }

    private void r(int i2) {
        this.f5151e.setSoTimeout(0);
        g.h hVar = new g.h(true);
        hVar.d(this.f5151e, this.c.a().l().l(), this.f5155i, this.f5156j);
        hVar.b(this);
        hVar.c(i2);
        g a = hVar.a();
        this.f5154h = a;
        a.h0();
    }

    public void a(g gVar) {
        synchronized (this.b) {
            this.f5159m = gVar.V();
        }
    }

    public void b(p.e0.i.i iVar) {
        iVar.f(b.REFUSED_STREAM);
    }

    public void c() {
        p.e0.c.f(this.f5150d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090 A[Catch:{ IOException -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(int r17, int r18, int r19, int r20, boolean r21, p.e r22, p.p r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            p.w r0 = r7.f5153g
            if (r0 != 0) goto L_0x0150
            p.c0 r0 = r7.c
            p.a r0 = r0.a()
            java.util.List r0 = r0.b()
            p.e0.f.b r10 = new p.e0.f.b
            r10.<init>(r0)
            p.c0 r1 = r7.c
            p.a r1 = r1.a()
            javax.net.ssl.SSLSocketFactory r1 = r1.k()
            if (r1 != 0) goto L_0x0074
            p.k r1 = p.k.f5380h
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0067
            p.c0 r0 = r7.c
            p.a r0 = r0.a()
            p.s r0 = r0.l()
            java.lang.String r0 = r0.l()
            p.e0.j.g r1 = p.e0.j.g.l()
            boolean r1 = r1.q(r0)
            if (r1 == 0) goto L_0x0046
            goto L_0x0086
        L_0x0046:
            p.e0.f.e r1 = new p.e0.f.e
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0067:
            p.e0.f.e r0 = new p.e0.f.e
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0074:
            p.c0 r0 = r7.c
            p.a r0 = r0.a()
            java.util.List r0 = r0.f()
            p.w r1 = p.w.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0143
        L_0x0086:
            r11 = 0
            r12 = r11
        L_0x0088:
            p.c0 r0 = r7.c     // Catch:{ IOException -> 0x00f9 }
            boolean r0 = r0.c()     // Catch:{ IOException -> 0x00f9 }
            if (r0 == 0) goto L_0x00a9
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.g(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00f9 }
            java.net.Socket r0 = r7.f5150d     // Catch:{ IOException -> 0x00f9 }
            if (r0 != 0) goto L_0x00a4
            goto L_0x00c6
        L_0x00a4:
            r13 = r17
            r14 = r18
            goto L_0x00b0
        L_0x00a9:
            r13 = r17
            r14 = r18
            r7.e(r13, r14, r8, r9)     // Catch:{ IOException -> 0x00f7 }
        L_0x00b0:
            r15 = r20
            r7.j(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00f5 }
            p.c0 r0 = r7.c     // Catch:{ IOException -> 0x00f5 }
            java.net.InetSocketAddress r0 = r0.d()     // Catch:{ IOException -> 0x00f5 }
            p.c0 r1 = r7.c     // Catch:{ IOException -> 0x00f5 }
            java.net.Proxy r1 = r1.b()     // Catch:{ IOException -> 0x00f5 }
            p.w r2 = r7.f5153g     // Catch:{ IOException -> 0x00f5 }
            r9.d(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f5 }
        L_0x00c6:
            p.c0 r0 = r7.c
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x00e0
            java.net.Socket r0 = r7.f5150d
            if (r0 == 0) goto L_0x00d3
            goto L_0x00e0
        L_0x00d3:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            p.e0.f.e r1 = new p.e0.f.e
            r1.<init>(r0)
            throw r1
        L_0x00e0:
            p.e0.i.g r0 = r7.f5154h
            if (r0 == 0) goto L_0x00f4
            p.j r1 = r7.b
            monitor-enter(r1)
            p.e0.i.g r0 = r7.f5154h     // Catch:{ all -> 0x00f1 }
            int r0 = r0.V()     // Catch:{ all -> 0x00f1 }
            r7.f5159m = r0     // Catch:{ all -> 0x00f1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            goto L_0x00f4
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            throw r0
        L_0x00f4:
            return
        L_0x00f5:
            r0 = move-exception
            goto L_0x0100
        L_0x00f7:
            r0 = move-exception
            goto L_0x00fe
        L_0x00f9:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x00fe:
            r15 = r20
        L_0x0100:
            java.net.Socket r1 = r7.f5151e
            p.e0.c.f(r1)
            java.net.Socket r1 = r7.f5150d
            p.e0.c.f(r1)
            r7.f5151e = r11
            r7.f5150d = r11
            r7.f5155i = r11
            r7.f5156j = r11
            r7.f5152f = r11
            r7.f5153g = r11
            r7.f5154h = r11
            p.c0 r1 = r7.c
            java.net.InetSocketAddress r3 = r1.d()
            p.c0 r1 = r7.c
            java.net.Proxy r4 = r1.b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.e(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x0135
            p.e0.f.e r12 = new p.e0.f.e
            r12.<init>(r0)
            goto L_0x0138
        L_0x0135:
            r12.a(r0)
        L_0x0138:
            if (r21 == 0) goto L_0x0142
            boolean r0 = r10.b(r0)
            if (r0 == 0) goto L_0x0142
            goto L_0x0088
        L_0x0142:
            throw r12
        L_0x0143:
            p.e0.f.e r0 = new p.e0.f.e
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0150:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e0.f.c.d(int, int, int, int, boolean, p.e, p.p):void");
    }

    public q k() {
        return this.f5152f;
    }

    public boolean l(p.a aVar, c0 c0Var) {
        if (this.f5160n.size() >= this.f5159m || this.f5157k || !p.e0.a.a.g(this.c.a(), aVar)) {
            return false;
        }
        if (aVar.l().l().equals(p().a().l().l())) {
            return true;
        }
        if (this.f5154h == null || c0Var == null || c0Var.b().type() != Proxy.Type.DIRECT || this.c.b().type() != Proxy.Type.DIRECT || !this.c.d().equals(c0Var.d()) || c0Var.a().e() != p.e0.l.d.a || !s(aVar.l())) {
            return false;
        }
        try {
            aVar.a().a(aVar.l().l(), k().c());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean m(boolean z) {
        int soTimeout;
        if (this.f5151e.isClosed() || this.f5151e.isInputShutdown() || this.f5151e.isOutputShutdown()) {
            return false;
        }
        g gVar = this.f5154h;
        if (gVar != null) {
            return gVar.U(System.nanoTime());
        }
        if (z) {
            try {
                soTimeout = this.f5151e.getSoTimeout();
                this.f5151e.setSoTimeout(1);
                if (this.f5155i.s()) {
                    this.f5151e.setSoTimeout(soTimeout);
                    return false;
                }
                this.f5151e.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.f5151e.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    public boolean n() {
        return this.f5154h != null;
    }

    public p.e0.g.c o(v vVar, t.a aVar, g gVar) {
        if (this.f5154h != null) {
            return new f(vVar, aVar, gVar, this.f5154h);
        }
        this.f5151e.setSoTimeout(aVar.b());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f5155i.d().g((long) aVar.b(), timeUnit);
        this.f5156j.d().g((long) aVar.c(), timeUnit);
        return new a(vVar, gVar, this.f5155i, this.f5156j);
    }

    public c0 p() {
        return this.c;
    }

    public Socket q() {
        return this.f5151e;
    }

    public boolean s(s sVar) {
        if (sVar.w() != this.c.a().l().w()) {
            return false;
        }
        if (!sVar.l().equals(this.c.a().l().l())) {
            return this.f5152f != null && p.e0.l.d.a.c(sVar.l(), (X509Certificate) this.f5152f.c().get(0));
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.c.a().l().l());
        sb.append(":");
        sb.append(this.c.a().l().w());
        sb.append(", proxy=");
        sb.append(this.c.b());
        sb.append(" hostAddress=");
        sb.append(this.c.d());
        sb.append(" cipherSuite=");
        q qVar = this.f5152f;
        sb.append(qVar != null ? qVar.a() : "none");
        sb.append(" protocol=");
        sb.append(this.f5153g);
        sb.append('}');
        return sb.toString();
    }
}
