package p.e0.j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p.e0.c;
import p.w;

class e extends g {
    private final Method c;

    /* renamed from: d  reason: collision with root package name */
    private final Method f5351d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f5352e;

    /* renamed from: f  reason: collision with root package name */
    private final Class<?> f5353f;

    /* renamed from: g  reason: collision with root package name */
    private final Class<?> f5354g;

    private static class a implements InvocationHandler {
        private final List<String> a;
        boolean b;
        String c;

        a(List<String> list) {
            this.a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = c.b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            obj2 = this.a.get(0);
                            break;
                        } else if (this.a.contains(list.get(i2))) {
                            obj2 = list.get(i2);
                            break;
                        } else {
                            i2++;
                        }
                    }
                    String str = (String) obj2;
                    this.c = str;
                    return str;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.c = method;
        this.f5351d = method2;
        this.f5352e = method3;
        this.f5353f = cls;
        this.f5354g = cls2;
    }

    public static g u() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider");
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider");
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider");
            Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
            return new e(method, cls.getMethod("get", new Class[]{SSLSocket.class}), cls.getMethod("remove", new Class[]{SSLSocket.class}), cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    public void a(SSLSocket sSLSocket) {
        try {
            this.f5352e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw c.b("unable to remove alpn", e2);
        }
    }

    public void g(SSLSocket sSLSocket, String str, List<w> list) {
        List<String> b = g.b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(g.class.getClassLoader(), new Class[]{this.f5353f, this.f5354g}, new a(b));
            this.c.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw c.b("unable to set alpn", e2);
        }
    }

    public String n(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f5351d.invoke((Object) null, new Object[]{sSLSocket}));
            boolean z = aVar.b;
            if (!z && aVar.c == null) {
                g.l().s(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (z) {
                return null;
            } else {
                return aVar.c;
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw c.b("unable to get selected protocol", e2);
        }
    }
}
