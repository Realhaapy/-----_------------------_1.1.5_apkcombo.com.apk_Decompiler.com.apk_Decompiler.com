package p.e0.j;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p.e0.l.a;
import p.e0.l.b;
import p.e0.l.e;
import p.v;
import p.w;
import q.c;

public class g {
    private static final g a = k();
    private static final Logger b = Logger.getLogger(v.class.getName());

    public static List<String> b(List<w> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            w wVar = list.get(i2);
            if (wVar != w.HTTP_1_0) {
                arrayList.add(wVar.toString());
            }
        }
        return arrayList;
    }

    static byte[] e(List<w> list) {
        c cVar = new c();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            w wVar = list.get(i2);
            if (wVar != w.HTTP_1_0) {
                cVar.f0(wVar.toString().length());
                cVar.k0(wVar.toString());
            }
        }
        return cVar.P();
    }

    private static g i() {
        g w = a.w();
        if (w != null) {
            return w;
        }
        g w2 = b.w();
        Objects.requireNonNull(w2, "No platform found on Android");
        return w2;
    }

    private static g j() {
        c u;
        if (r() && (u = c.u()) != null) {
            return u;
        }
        d u2 = d.u();
        if (u2 != null) {
            return u2;
        }
        g u3 = e.u();
        return u3 != null ? u3 : new g();
    }

    private static g k() {
        return p() ? i() : j();
    }

    public static g l() {
        return a;
    }

    public static boolean p() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static boolean r() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    public void a(SSLSocket sSLSocket) {
    }

    public p.e0.l.c c(X509TrustManager x509TrustManager) {
        return new a(d(x509TrustManager));
    }

    public e d(X509TrustManager x509TrustManager) {
        return new b(x509TrustManager.getAcceptedIssuers());
    }

    public void f(SSLSocketFactory sSLSocketFactory) {
    }

    public void g(SSLSocket sSLSocket, String str, List<w> list) {
    }

    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        socket.connect(inetSocketAddress, i2);
    }

    public SSLContext m() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    public String n(SSLSocket sSLSocket) {
        return null;
    }

    public Object o(String str) {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean q(String str) {
        return true;
    }

    public void s(int i2, String str, Throwable th) {
        b.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void t(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        s(5, str, (Throwable) obj);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
