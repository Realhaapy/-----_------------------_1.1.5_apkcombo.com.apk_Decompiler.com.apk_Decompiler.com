package p;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p.e0.c;
import p.s;

public final class a {
    final s a;
    final o b;
    final SocketFactory c;

    /* renamed from: d  reason: collision with root package name */
    final b f5075d;

    /* renamed from: e  reason: collision with root package name */
    final List<w> f5076e;

    /* renamed from: f  reason: collision with root package name */
    final List<k> f5077f;

    /* renamed from: g  reason: collision with root package name */
    final ProxySelector f5078g;

    /* renamed from: h  reason: collision with root package name */
    final Proxy f5079h;

    /* renamed from: i  reason: collision with root package name */
    final SSLSocketFactory f5080i;

    /* renamed from: j  reason: collision with root package name */
    final HostnameVerifier f5081j;

    /* renamed from: k  reason: collision with root package name */
    final g f5082k;

    public a(String str, int i2, o oVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b bVar, Proxy proxy, List<w> list, List<k> list2, ProxySelector proxySelector) {
        s.a aVar = new s.a();
        aVar.q(sSLSocketFactory != null ? "https" : "http");
        aVar.e(str);
        aVar.l(i2);
        this.a = aVar.a();
        Objects.requireNonNull(oVar, "dns == null");
        this.b = oVar;
        Objects.requireNonNull(socketFactory, "socketFactory == null");
        this.c = socketFactory;
        Objects.requireNonNull(bVar, "proxyAuthenticator == null");
        this.f5075d = bVar;
        Objects.requireNonNull(list, "protocols == null");
        this.f5076e = c.r(list);
        Objects.requireNonNull(list2, "connectionSpecs == null");
        this.f5077f = c.r(list2);
        Objects.requireNonNull(proxySelector, "proxySelector == null");
        this.f5078g = proxySelector;
        this.f5079h = proxy;
        this.f5080i = sSLSocketFactory;
        this.f5081j = hostnameVerifier;
        this.f5082k = gVar;
    }

    public g a() {
        return this.f5082k;
    }

    public List<k> b() {
        return this.f5077f;
    }

    public o c() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public boolean d(a aVar) {
        return this.b.equals(aVar.b) && this.f5075d.equals(aVar.f5075d) && this.f5076e.equals(aVar.f5076e) && this.f5077f.equals(aVar.f5077f) && this.f5078g.equals(aVar.f5078g) && c.o(this.f5079h, aVar.f5079h) && c.o(this.f5080i, aVar.f5080i) && c.o(this.f5081j, aVar.f5081j) && c.o(this.f5082k, aVar.f5082k) && l().w() == aVar.l().w();
    }

    public HostnameVerifier e() {
        return this.f5081j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && d(aVar);
        }
    }

    public List<w> f() {
        return this.f5076e;
    }

    public Proxy g() {
        return this.f5079h;
    }

    public b h() {
        return this.f5075d;
    }

    public int hashCode() {
        int hashCode = (((((((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.f5075d.hashCode()) * 31) + this.f5076e.hashCode()) * 31) + this.f5077f.hashCode()) * 31) + this.f5078g.hashCode()) * 31;
        Proxy proxy = this.f5079h;
        int i2 = 0;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f5080i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f5081j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        g gVar = this.f5082k;
        if (gVar != null) {
            i2 = gVar.hashCode();
        }
        return hashCode4 + i2;
    }

    public ProxySelector i() {
        return this.f5078g;
    }

    public SocketFactory j() {
        return this.c;
    }

    public SSLSocketFactory k() {
        return this.f5080i;
    }

    public s l() {
        return this.a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.a.l());
        sb.append(":");
        sb.append(this.a.w());
        if (this.f5079h != null) {
            sb.append(", proxy=");
            obj = this.f5079h;
        } else {
            sb.append(", proxySelector=");
            obj = this.f5078g;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
