package com.facebook.y0.o0;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import m.y.d.g;

public final class l {

    /* renamed from: g  reason: collision with root package name */
    public static final a f2079g = new a((g) null);

    /* renamed from: h  reason: collision with root package name */
    private static l f2080h;

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicBoolean f2081i = new AtomicBoolean(false);
    private final Class<?> a;
    private final Class<?> b;
    private final Method c;

    /* renamed from: d  reason: collision with root package name */
    private final Method f2082d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f2083e;

    /* renamed from: f  reason: collision with root package name */
    private final Method f2084f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final void a() {
            m mVar = m.a;
            Class<?> a = m.a("com.android.billingclient.api.SkuDetailsParams");
            Class<?> a2 = m.a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (a != null && a2 != null) {
                Method d2 = m.d(a, "newBuilder", new Class[0]);
                Method d3 = m.d(a2, "setType", String.class);
                Method d4 = m.d(a2, "setSkusList", List.class);
                Method d5 = m.d(a2, "build", new Class[0]);
                if (d2 != null && d3 != null && d4 != null && d5 != null) {
                    l.c(new l(a, a2, d2, d3, d4, d5));
                }
            }
        }

        public final l b() {
            if (l.a().get()) {
                return l.b();
            }
            a();
            l.a().set(true);
            return l.b();
        }
    }

    public l(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        m.y.d.l.d(cls, "skuDetailsParamsClazz");
        m.y.d.l.d(cls2, "builderClazz");
        m.y.d.l.d(method, "newBuilderMethod");
        m.y.d.l.d(method2, "setTypeMethod");
        m.y.d.l.d(method3, "setSkusListMethod");
        m.y.d.l.d(method4, "buildMethod");
        this.a = cls;
        this.b = cls2;
        this.c = method;
        this.f2082d = method2;
        this.f2083e = method3;
        this.f2084f = method4;
    }

    public static final /* synthetic */ AtomicBoolean a() {
        Class<l> cls = l.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return f2081i;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ l b() {
        Class<l> cls = l.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return f2080h;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ void c(l lVar) {
        Class<l> cls = l.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                f2080h = lVar;
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    public final Object d(String str, List<String> list) {
        Object e2;
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            m mVar = m.a;
            Object e3 = m.e(this.a, this.c, (Object) null, new Object[0]);
            if (e3 == null || (e2 = m.e(this.b, this.f2082d, e3, str)) == null) {
                return null;
            }
            Object e4 = m.e(this.b, this.f2083e, e2, list);
            if (e4 == null) {
                return null;
            }
            return m.e(this.b, this.f2084f, e4, new Object[0]);
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }

    public final Class<?> e() {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }
}
