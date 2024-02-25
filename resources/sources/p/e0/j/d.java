package p.e0.j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p.e0.c;
import p.w;

final class d extends g {
    final Method c;

    /* renamed from: d  reason: collision with root package name */
    final Method f5350d;

    d(Method method, Method method2) {
        this.c = method;
        this.f5350d = method2;
    }

    public static d u() {
        try {
            return new d(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public void g(SSLSocket sSLSocket, String str, List<w> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> b = g.b(list);
            this.c.invoke(sSLParameters, new Object[]{b.toArray(new String[b.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw c.b("unable to set ssl parameters", e2);
        }
    }

    public String n(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f5350d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw c.b("failed to get ALPN selected protocol", e2);
        } catch (IllegalAccessException e3) {
            throw c.b("failed to get ALPN selected protocol", e3);
        }
    }
}
