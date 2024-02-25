package p.e0.j;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p.e0.l.e;
import p.w;

class b extends g {
    private final f<Socket> c;

    /* renamed from: d  reason: collision with root package name */
    private final f<Socket> f5346d;

    /* renamed from: e  reason: collision with root package name */
    private final f<Socket> f5347e;

    /* renamed from: f  reason: collision with root package name */
    private final f<Socket> f5348f;

    /* renamed from: g  reason: collision with root package name */
    private final c f5349g = c.b();

    static final class a extends p.e0.l.c {
        private final Object a;
        private final Method b;

        a(Object obj, Method method) {
            this.a = obj;
            this.b = method;
        }

        public List<Certificate> a(List<Certificate> list, String str) {
            try {
                return (List) this.b.invoke(this.a, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str});
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: p.e0.j.b$b  reason: collision with other inner class name */
    static final class C0151b implements e {
        private final X509TrustManager a;
        private final Method b;

        C0151b(X509TrustManager x509TrustManager, Method method) {
            this.b = method;
            this.a = x509TrustManager;
        }

        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.b.invoke(this.a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e2) {
                throw p.e0.c.b("unable to get issues and signature", e2);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0151b)) {
                return false;
            }
            C0151b bVar = (C0151b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b);
        }

        public int hashCode() {
            return this.a.hashCode() + (this.b.hashCode() * 31);
        }
    }

    static final class c {
        private final Method a;
        private final Method b;
        private final Method c;

        c(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }

        static c b() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new c(method3, method, method2);
        }

        /* access modifiers changed from: package-private */
        public Object a(String str) {
            Method method = this.a;
            if (method != null) {
                try {
                    Object invoke = method.invoke((Object) null, new Object[0]);
                    this.b.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean c(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    b(Class<?> cls, f<Socket> fVar, f<Socket> fVar2, f<Socket> fVar3, f<Socket> fVar4) {
        this.c = fVar;
        this.f5346d = fVar2;
        this.f5347e = fVar3;
        this.f5348f = fVar4;
    }

    private boolean u(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.q(str);
        }
    }

    private boolean v(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            return u(str, cls, obj);
        }
    }

    public static g w() {
        Class<?> cls;
        f fVar;
        f fVar2;
        Class<byte[]> cls2 = byte[].class;
        if (!g.p()) {
            return null;
        }
        try {
            cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        }
        Class<?> cls3 = cls;
        f fVar3 = new f((Class<?>) null, "setUseSessionTickets", Boolean.TYPE);
        f fVar4 = new f((Class<?>) null, "setHostname", String.class);
        if (y()) {
            f fVar5 = new f(cls2, "getAlpnSelectedProtocol", new Class[0]);
            fVar = new f((Class<?>) null, "setAlpnProtocols", cls2);
            fVar2 = fVar5;
        } else {
            fVar2 = null;
            fVar = null;
        }
        return new b(cls3, fVar3, fVar4, fVar2, fVar);
    }

    static int x() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    private static boolean y() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public p.e0.l.c c(X509TrustManager x509TrustManager) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls2.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls, cls}));
        } catch (Exception unused) {
            return super.c(x509TrustManager);
        }
    }

    public e d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new C0151b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    public void g(SSLSocket sSLSocket, String str, List<w> list) {
        if (str != null) {
            this.c.e(sSLSocket, Boolean.TRUE);
            this.f5346d.e(sSLSocket, str);
        }
        f<Socket> fVar = this.f5348f;
        if (fVar != null && fVar.g(sSLSocket)) {
            this.f5348f.f(sSLSocket, g.e(list));
        }
    }

    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        try {
            socket.connect(inetSocketAddress, i2);
        } catch (AssertionError e2) {
            if (p.e0.c.y(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        } catch (SecurityException e3) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e3);
            throw iOException;
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException2 = new IOException("Exception in connect");
                iOException2.initCause(e4);
                throw iOException2;
            }
            throw e4;
        }
    }

    public SSLContext m() {
        boolean z = true;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 16 || i2 >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    public String n(SSLSocket sSLSocket) {
        byte[] bArr;
        f<Socket> fVar = this.f5347e;
        if (fVar == null || !fVar.g(sSLSocket) || (bArr = (byte[]) this.f5347e.f(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, p.e0.c.f5131d);
    }

    public Object o(String str) {
        return this.f5349g.a(str);
    }

    public boolean q(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return super.q(str);
        }
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return v(str, cls, cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.q(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            throw p.e0.c.b("unable to determine cleartext support", e2);
        }
    }

    public void s(int i2, String str, Throwable th) {
        int min;
        int i3 = 5;
        if (i2 != 5) {
            i3 = 3;
        }
        if (th != null) {
            str = str + 10 + Log.getStackTraceString(th);
        }
        int i4 = 0;
        int length = str.length();
        while (i4 < length) {
            int indexOf = str.indexOf(10, i4);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i4 + 4000);
                Log.println(i3, "OkHttp", str.substring(i4, min));
                if (min >= indexOf) {
                    break;
                }
                i4 = min;
            }
            i4 = min + 1;
        }
    }

    public void t(String str, Object obj) {
        if (!this.f5349g.c(obj)) {
            s(5, str, (Throwable) null);
        }
    }
}
