package com.facebook.y0;

import com.facebook.internal.s0.n.a;
import com.facebook.y0.q0.g;
import m.y.d.l;

public final class z {
    public static final z a = new z();

    static {
        l.c(z.class.getName(), "AppEventStore::class.java.name");
    }

    private z() {
    }

    public static final synchronized void a(t tVar, i0 i0Var) {
        Class<z> cls = z.class;
        synchronized (cls) {
            if (!a.d(cls)) {
                try {
                    l.d(tVar, "accessTokenAppIdPair");
                    l.d(i0Var, "appEvents");
                    g gVar = g.a;
                    g.b();
                    x xVar = x.a;
                    h0 a2 = x.a();
                    a2.a(tVar, i0Var.d());
                    x.b(a2);
                } catch (Throwable th) {
                    a.b(th, cls);
                }
            }
        }
    }

    public static final synchronized void b(w wVar) {
        Class<z> cls = z.class;
        synchronized (cls) {
            if (!a.d(cls)) {
                try {
                    l.d(wVar, "eventsToPersist");
                    g gVar = g.a;
                    g.b();
                    x xVar = x.a;
                    h0 a2 = x.a();
                    for (t next : wVar.f()) {
                        i0 c = wVar.c(next);
                        if (c != null) {
                            a2.a(next, c.d());
                        } else {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                    }
                    x xVar2 = x.a;
                    x.b(a2);
                } catch (Throwable th) {
                    a.b(th, cls);
                }
            }
        }
    }
}
