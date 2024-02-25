package p.e0.f;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import p.c0;
import p.e;
import p.e0.c;
import p.p;
import p.s;

public final class f {
    private final p.a a;
    private final d b;
    private final e c;

    /* renamed from: d  reason: collision with root package name */
    private final p f5164d;

    /* renamed from: e  reason: collision with root package name */
    private List<Proxy> f5165e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    private int f5166f;

    /* renamed from: g  reason: collision with root package name */
    private List<InetSocketAddress> f5167g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    private final List<c0> f5168h = new ArrayList();

    public static final class a {
        private final List<c0> a;
        private int b = 0;

        a(List<c0> list) {
            this.a = list;
        }

        public List<c0> a() {
            return new ArrayList(this.a);
        }

        public boolean b() {
            return this.b < this.a.size();
        }

        public c0 c() {
            if (b()) {
                List<c0> list = this.a;
                int i2 = this.b;
                this.b = i2 + 1;
                return list.get(i2);
            }
            throw new NoSuchElementException();
        }
    }

    public f(p.a aVar, d dVar, e eVar, p pVar) {
        this.a = aVar;
        this.b = dVar;
        this.c = eVar;
        this.f5164d = pVar;
        h(aVar.l(), aVar.g());
    }

    static String b(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    private boolean d() {
        return this.f5166f < this.f5165e.size();
    }

    private Proxy f() {
        if (d()) {
            List<Proxy> list = this.f5165e;
            int i2 = this.f5166f;
            this.f5166f = i2 + 1;
            Proxy proxy = list.get(i2);
            g(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.a.l().l() + "; exhausted proxy configurations: " + this.f5165e);
    }

    private void g(Proxy proxy) {
        String str;
        int i2;
        this.f5167g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.a.l().l();
            i2 = this.a.l().w();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = b(inetSocketAddress);
                i2 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        }
        if (i2 < 1 || i2 > 65535) {
            throw new SocketException("No route to " + str + ":" + i2 + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.f5167g.add(InetSocketAddress.createUnresolved(str, i2));
        } else {
            this.f5164d.j(this.c, str);
            List<InetAddress> a2 = this.a.c().a(str);
            if (!a2.isEmpty()) {
                this.f5164d.i(this.c, str, a2);
                int size = a2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    this.f5167g.add(new InetSocketAddress(a2.get(i3), i2));
                }
                return;
            }
            throw new UnknownHostException(this.a.c() + " returned no addresses for " + str);
        }
    }

    private void h(s sVar, Proxy proxy) {
        List<Proxy> s2;
        if (proxy != null) {
            s2 = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.a.i().select(sVar.C());
            if (select == null || select.isEmpty()) {
                s2 = c.s(Proxy.NO_PROXY);
            } else {
                s2 = c.r(select);
            }
        }
        this.f5165e = s2;
        this.f5166f = 0;
    }

    public void a(c0 c0Var, IOException iOException) {
        if (!(c0Var.b().type() == Proxy.Type.DIRECT || this.a.i() == null)) {
            this.a.i().connectFailed(this.a.l().C(), c0Var.b().address(), iOException);
        }
        this.b.b(c0Var);
    }

    public boolean c() {
        return d() || !this.f5168h.isEmpty();
    }

    public a e() {
        if (c()) {
            ArrayList arrayList = new ArrayList();
            while (d()) {
                Proxy f2 = f();
                int size = this.f5167g.size();
                for (int i2 = 0; i2 < size; i2++) {
                    c0 c0Var = new c0(this.a, f2, this.f5167g.get(i2));
                    if (this.b.c(c0Var)) {
                        this.f5168h.add(c0Var);
                    } else {
                        arrayList.add(c0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f5168h);
                this.f5168h.clear();
            }
            return new a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
