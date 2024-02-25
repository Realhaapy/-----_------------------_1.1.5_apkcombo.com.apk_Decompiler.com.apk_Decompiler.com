package p.e0.g;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import p.a;
import p.a0;
import p.b0;
import p.c0;
import p.e;
import p.e0.f.c;
import p.e0.f.g;
import p.p;
import p.s;
import p.t;
import p.v;
import p.y;
import p.z;

public final class j implements t {
    private final v a;
    private volatile g b;
    private Object c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f5192d;

    public j(v vVar, boolean z) {
        this.a = vVar;
    }

    private a c(s sVar) {
        p.g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (sVar.m()) {
            SSLSocketFactory E = this.a.E();
            hostnameVerifier = this.a.q();
            sSLSocketFactory = E;
            gVar = this.a.e();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new a(sVar.l(), sVar.w(), this.a.l(), this.a.D(), sSLSocketFactory, hostnameVerifier, gVar, this.a.z(), this.a.y(), this.a.x(), this.a.i(), this.a.A());
    }

    private y d(a0 a0Var, c0 c0Var) {
        String v;
        s A;
        if (a0Var != null) {
            int g2 = a0Var.g();
            String f2 = a0Var.O().f();
            z zVar = null;
            if (g2 == 307 || g2 == 308) {
                if (!f2.equals("GET") && !f2.equals("HEAD")) {
                    return null;
                }
            } else if (g2 == 401) {
                return this.a.b().a(c0Var, a0Var);
            } else {
                if (g2 != 503) {
                    if (g2 != 407) {
                        if (g2 != 408) {
                            switch (g2) {
                                case 300:
                                case 301:
                                case 302:
                                case 303:
                                    break;
                                default:
                                    return null;
                            }
                        } else if (!this.a.C()) {
                            return null;
                        } else {
                            a0Var.O().a();
                            if ((a0Var.J() == null || a0Var.J().g() != 408) && i(a0Var, 0) <= 0) {
                                return a0Var.O();
                            }
                            return null;
                        }
                    } else if (c0Var.b().type() == Proxy.Type.HTTP) {
                        return this.a.z().a(c0Var, a0Var);
                    } else {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                } else if ((a0Var.J() == null || a0Var.J().g() != 503) && i(a0Var, Integer.MAX_VALUE) == 0) {
                    return a0Var.O();
                } else {
                    return null;
                }
            }
            if (!this.a.n() || (v = a0Var.v("Location")) == null || (A = a0Var.O().h().A(v)) == null) {
                return null;
            }
            if (!A.B().equals(a0Var.O().h().B()) && !this.a.p()) {
                return null;
            }
            y.a g3 = a0Var.O().g();
            if (f.b(f2)) {
                boolean d2 = f.d(f2);
                if (f.c(f2)) {
                    g3.d("GET", (z) null);
                } else {
                    if (d2) {
                        zVar = a0Var.O().a();
                    }
                    g3.d(f2, zVar);
                }
                if (!d2) {
                    g3.e("Transfer-Encoding");
                    g3.e("Content-Length");
                    g3.e("Content-Type");
                }
            }
            if (!j(a0Var, A)) {
                g3.e("Authorization");
            }
            g3.g(A);
            return g3.a();
        }
        throw new IllegalStateException();
    }

    private boolean f(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
    }

    private boolean g(IOException iOException, g gVar, boolean z, y yVar) {
        gVar.q(iOException);
        if (!this.a.C()) {
            return false;
        }
        return (!z || !h(iOException, yVar)) && f(iOException, z) && gVar.h();
    }

    private boolean h(IOException iOException, y yVar) {
        yVar.a();
        return iOException instanceof FileNotFoundException;
    }

    private int i(a0 a0Var, int i2) {
        String v = a0Var.v("Retry-After");
        if (v == null) {
            return i2;
        }
        if (v.matches("\\d+")) {
            return Integer.valueOf(v).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private boolean j(a0 a0Var, s sVar) {
        s h2 = a0Var.O().h();
        return h2.l().equals(sVar.l()) && h2.w() == sVar.w() && h2.B().equals(sVar.B());
    }

    public a0 a(t.a aVar) {
        y e2 = aVar.e();
        g gVar = (g) aVar;
        e f2 = gVar.f();
        p h2 = gVar.h();
        g gVar2 = new g(this.a.h(), c(e2.h()), f2, h2, this.c);
        this.b = gVar2;
        a0 a0Var = null;
        int i2 = 0;
        while (!this.f5192d) {
            try {
                a0 j2 = gVar.j(e2, gVar2, (c) null, (c) null);
                if (a0Var != null) {
                    a0.a E = j2.E();
                    a0.a E2 = a0Var.E();
                    E2.b((b0) null);
                    E.m(E2.c());
                    j2 = E.c();
                }
                try {
                    y d2 = d(j2, gVar2.o());
                    if (d2 == null) {
                        gVar2.k();
                        return j2;
                    }
                    p.e0.c.e(j2.a());
                    int i3 = i2 + 1;
                    if (i3 <= 20) {
                        d2.a();
                        if (!j(j2, d2.h())) {
                            gVar2.k();
                            gVar2 = new g(this.a.h(), c(d2.h()), f2, h2, this.c);
                            this.b = gVar2;
                        } else if (gVar2.c() != null) {
                            throw new IllegalStateException("Closing the body of " + j2 + " didn't close its backing stream. Bad interceptor?");
                        }
                        a0Var = j2;
                        e2 = d2;
                        i2 = i3;
                    } else {
                        gVar2.k();
                        throw new ProtocolException("Too many follow-up requests: " + i3);
                    }
                } catch (IOException e3) {
                    gVar2.k();
                    throw e3;
                }
            } catch (p.e0.f.e e4) {
                if (!g(e4.c(), gVar2, false, e2)) {
                    throw e4.b();
                }
            } catch (IOException e5) {
                if (!g(e5, gVar2, !(e5 instanceof p.e0.i.a), e2)) {
                    throw e5;
                }
            } catch (Throwable th) {
                gVar2.q((IOException) null);
                gVar2.k();
                throw th;
            }
        }
        gVar2.k();
        throw new IOException("Canceled");
    }

    public void b() {
        this.f5192d = true;
        g gVar = this.b;
        if (gVar != null) {
            gVar.b();
        }
    }

    public boolean e() {
        return this.f5192d;
    }

    public void k(Object obj) {
        this.c = obj;
    }
}
