package com.facebook.y0.o0;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class h {

    /* renamed from: s  reason: collision with root package name */
    public static final b f2059s = new b((g) null);
    private static final AtomicBoolean t = new AtomicBoolean(false);
    private static h u;
    private static final AtomicBoolean v = new AtomicBoolean(false);
    private static final Map<String, JSONObject> w = new ConcurrentHashMap();
    private static final Map<String, JSONObject> x = new ConcurrentHashMap();
    private final Context a;
    private final Object b;
    private final Class<?> c;

    /* renamed from: d  reason: collision with root package name */
    private final Class<?> f2060d;

    /* renamed from: e  reason: collision with root package name */
    private final Class<?> f2061e;

    /* renamed from: f  reason: collision with root package name */
    private final Class<?> f2062f;

    /* renamed from: g  reason: collision with root package name */
    private final Class<?> f2063g;

    /* renamed from: h  reason: collision with root package name */
    private final Class<?> f2064h;

    /* renamed from: i  reason: collision with root package name */
    private final Class<?> f2065i;

    /* renamed from: j  reason: collision with root package name */
    private final Method f2066j;

    /* renamed from: k  reason: collision with root package name */
    private final Method f2067k;

    /* renamed from: l  reason: collision with root package name */
    private final Method f2068l;

    /* renamed from: m  reason: collision with root package name */
    private final Method f2069m;

    /* renamed from: n  reason: collision with root package name */
    private final Method f2070n;

    /* renamed from: o  reason: collision with root package name */
    private final Method f2071o;

    /* renamed from: p  reason: collision with root package name */
    private final Method f2072p;

    /* renamed from: q  reason: collision with root package name */
    private final l f2073q;

    /* renamed from: r  reason: collision with root package name */
    private final Set<String> f2074r;

    public static final class a implements InvocationHandler {
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (com.facebook.internal.s0.n.a.d(this)) {
                return null;
            }
            try {
                l.d(obj, "proxy");
                l.d(method, "m");
                if (l.a(method.getName(), "onBillingSetupFinished")) {
                    h.f2059s.f().set(true);
                } else {
                    String name = method.getName();
                    l.c(name, "m.name");
                    if (p.k(name, "onBillingServiceDisconnected", false, 2, (Object) null)) {
                        h.f2059s.f().set(false);
                    }
                }
                return null;
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
                return null;
            }
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        private final Object a(Context context, Class<?> cls) {
            Object e2;
            Object e3;
            m mVar = m.a;
            Class<?> a = m.a("com.android.billingclient.api.BillingClient$Builder");
            Class<?> a2 = m.a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (a == null || a2 == null) {
                return null;
            }
            Method d2 = m.d(cls, "newBuilder", Context.class);
            Method d3 = m.d(a, "enablePendingPurchases", new Class[0]);
            Method d4 = m.d(a, "setListener", a2);
            Method d5 = m.d(a, "build", new Class[0]);
            if (d2 == null || d3 == null || d4 == null || d5 == null || (e2 = m.e(cls, d2, (Object) null, context)) == null) {
                return null;
            }
            Object newProxyInstance = Proxy.newProxyInstance(a2.getClassLoader(), new Class[]{a2}, new d());
            l.c(newProxyInstance, "newProxyInstance(\n              listenerClazz.classLoader, arrayOf(listenerClazz), PurchasesUpdatedListenerWrapper())");
            Object e4 = m.e(a, d4, e2, newProxyInstance);
            if (e4 == null || (e3 = m.e(a, d3, e4, new Object[0])) == null) {
                return null;
            }
            return m.e(a, d5, e3, new Object[0]);
        }

        private final void b(Context context) {
            Class<String> cls = String.class;
            l b = l.f2079g.b();
            if (b != null) {
                m mVar = m.a;
                Class<?> a = m.a("com.android.billingclient.api.BillingClient");
                Class<?> a2 = m.a("com.android.billingclient.api.Purchase");
                Class<?> a3 = m.a("com.android.billingclient.api.Purchase$PurchasesResult");
                Class<?> a4 = m.a("com.android.billingclient.api.SkuDetails");
                Class<?> a5 = m.a("com.android.billingclient.api.PurchaseHistoryRecord");
                Class<?> a6 = m.a("com.android.billingclient.api.SkuDetailsResponseListener");
                Class<?> a7 = m.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
                if (a == null || a3 == null || a2 == null || a4 == null || a6 == null || a5 == null || a7 == null) {
                    return;
                }
                Method d2 = m.d(a, "queryPurchases", cls);
                Method d3 = m.d(a3, "getPurchasesList", new Class[0]);
                Method d4 = m.d(a2, "getOriginalJson", new Class[0]);
                Method d5 = m.d(a4, "getOriginalJson", new Class[0]);
                Method d6 = m.d(a5, "getOriginalJson", new Class[0]);
                Method d7 = m.d(a, "querySkuDetailsAsync", b.e(), a6);
                Method d8 = m.d(a, "queryPurchaseHistoryAsync", cls, a7);
                if (d2 == null || d3 == null || d4 == null || d5 == null || d6 == null || d7 == null || d8 == null) {
                    return;
                }
                Object a8 = a(context, a);
                if (a8 != null) {
                    h.l(new h(context, a8, a, a3, a2, a4, a5, a6, a7, d2, d3, d4, d5, d6, d7, d8, b, (g) null));
                    h f2 = h.f();
                    Objects.requireNonNull(f2, "null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
                    h.m(f2);
                }
            }
        }

        public final synchronized h c(Context context) {
            l.d(context, "context");
            if (h.e().get()) {
                return h.f();
            }
            b(context);
            h.e().set(true);
            return h.f();
        }

        public final Map<String, JSONObject> d() {
            return h.g();
        }

        public final Map<String, JSONObject> e() {
            return h.j();
        }

        public final AtomicBoolean f() {
            return h.k();
        }
    }

    public final class c implements InvocationHandler {
        private Runnable a;
        final /* synthetic */ h b;

        public c(h hVar, Runnable runnable) {
            l.d(hVar, "this$0");
            l.d(runnable, "runnable");
            this.b = hVar;
            this.a = runnable;
        }

        private final void a(List<?> list) {
            if (!com.facebook.internal.s0.n.a.d(this)) {
                try {
                    for (Object next : list) {
                        try {
                            m mVar = m.a;
                            Object e2 = m.e(h.h(this.b), h.b(this.b), next, new Object[0]);
                            String str = e2 instanceof String ? (String) e2 : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                jSONObject.put("packageName", h.a(this.b).getPackageName());
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    h.d(this.b).add(string);
                                    Map<String, JSONObject> d2 = h.f2059s.d();
                                    l.c(string, "skuID");
                                    d2.put(string, jSONObject);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    this.a.run();
                } catch (Throwable th) {
                    com.facebook.internal.s0.n.a.b(th, this);
                }
            }
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (com.facebook.internal.s0.n.a.d(this)) {
                return null;
            }
            try {
                l.d(obj, "proxy");
                l.d(method, "method");
                if (l.a(method.getName(), "onPurchaseHistoryResponse")) {
                    List list = objArr == null ? null : objArr[1];
                    if (list != null && (list instanceof List)) {
                        a(list);
                    }
                }
                return null;
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
                return null;
            }
        }
    }

    public static final class d implements InvocationHandler {
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (com.facebook.internal.s0.n.a.d(this)) {
                return null;
            }
            try {
                l.d(obj, "proxy");
                l.d(method, "m");
                return null;
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
                return null;
            }
        }
    }

    public final class e implements InvocationHandler {
        private Runnable a;
        final /* synthetic */ h b;

        public e(h hVar, Runnable runnable) {
            l.d(hVar, "this$0");
            l.d(runnable, "runnable");
            this.b = hVar;
            this.a = runnable;
        }

        public final void a(List<?> list) {
            if (!com.facebook.internal.s0.n.a.d(this)) {
                try {
                    l.d(list, "skuDetailsObjectList");
                    for (Object next : list) {
                        try {
                            m mVar = m.a;
                            Object e2 = m.e(h.i(this.b), h.c(this.b), next, new Object[0]);
                            String str = e2 instanceof String ? (String) e2 : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    Map<String, JSONObject> e3 = h.f2059s.e();
                                    l.c(string, "skuID");
                                    e3.put(string, jSONObject);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    this.a.run();
                } catch (Throwable th) {
                    com.facebook.internal.s0.n.a.b(th, this);
                }
            }
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (com.facebook.internal.s0.n.a.d(this)) {
                return null;
            }
            try {
                l.d(obj, "proxy");
                l.d(method, "m");
                if (l.a(method.getName(), "onSkuDetailsResponse")) {
                    List list = objArr == null ? null : objArr[1];
                    if (list != null && (list instanceof List)) {
                        a(list);
                    }
                }
                return null;
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
                return null;
            }
        }
    }

    private h(Context context, Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, l lVar) {
        this.a = context;
        this.b = obj;
        this.c = cls;
        this.f2060d = cls2;
        this.f2061e = cls3;
        this.f2062f = cls4;
        this.f2063g = cls5;
        this.f2064h = cls6;
        this.f2065i = cls7;
        this.f2066j = method;
        this.f2067k = method2;
        this.f2068l = method3;
        this.f2069m = method4;
        this.f2070n = method5;
        this.f2071o = method6;
        this.f2072p = method7;
        this.f2073q = lVar;
        this.f2074r = new CopyOnWriteArraySet();
    }

    public /* synthetic */ h(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, l lVar, g gVar) {
        this(context, obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, lVar);
    }

    public static final /* synthetic */ Context a(h hVar) {
        Class<h> cls = h.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return hVar.a;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Method b(h hVar) {
        Class<h> cls = h.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return hVar.f2070n;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Method c(h hVar) {
        Class<h> cls = h.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return hVar.f2069m;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Set d(h hVar) {
        Class<h> cls = h.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return hVar.f2074r;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean e() {
        Class<h> cls = h.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return t;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ h f() {
        Class<h> cls = h.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return u;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Map g() {
        Class<h> cls = h.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return w;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Class h(h hVar) {
        Class<h> cls = h.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return hVar.f2063g;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Class i(h hVar) {
        Class<h> cls = h.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return hVar.f2062f;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Map j() {
        Class<h> cls = h.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return x;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean k() {
        Class<h> cls = h.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return v;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ void l(h hVar) {
        Class<h> cls = h.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                u = hVar;
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    public static final /* synthetic */ void m(h hVar) {
        Class<h> cls = h.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                hVar.t();
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void q(h hVar, Runnable runnable) {
        Class<h> cls = h.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                l.d(hVar, "this$0");
                l.d(runnable, "$queryPurchaseHistoryRunnable");
                hVar.s("inapp", new ArrayList(hVar.f2074r), runnable);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    private final void r(String str, Runnable runnable) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                Object newProxyInstance = Proxy.newProxyInstance(this.f2065i.getClassLoader(), new Class[]{this.f2065i}, new c(this, runnable));
                l.c(newProxyInstance, "newProxyInstance(\n            purchaseHistoryResponseListenerClazz.classLoader,\n            arrayOf(purchaseHistoryResponseListenerClazz),\n            PurchaseHistoryResponseListenerWrapper(runnable))");
                m mVar = m.a;
                m.e(this.c, this.f2072p, this.b, str, newProxyInstance);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    private final void s(String str, List<String> list, Runnable runnable) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                Object newProxyInstance = Proxy.newProxyInstance(this.f2064h.getClassLoader(), new Class[]{this.f2064h}, new e(this, runnable));
                l.c(newProxyInstance, "newProxyInstance(\n            skuDetailsResponseListenerClazz.classLoader,\n            arrayOf(skuDetailsResponseListenerClazz),\n            SkuDetailsResponseListenerWrapper(runnable))");
                Object d2 = this.f2073q.d(str, list);
                m mVar = m.a;
                m.e(this.c, this.f2071o, this.b, d2, newProxyInstance);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    private final void t() {
        Method d2;
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                m mVar = m.a;
                Class<?> a2 = m.a("com.android.billingclient.api.BillingClientStateListener");
                if (a2 != null && (d2 = m.d(this.c, "startConnection", a2)) != null) {
                    Object newProxyInstance = Proxy.newProxyInstance(a2.getClassLoader(), new Class[]{a2}, new a());
                    l.c(newProxyInstance, "newProxyInstance(\n            listenerClazz.classLoader, arrayOf(listenerClazz), BillingClientStateListenerWrapper())");
                    m.e(this.c, d2, this.b, newProxyInstance);
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final void o(String str, Runnable runnable) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                l.d(str, "skuType");
                l.d(runnable, "querySkuRunnable");
                m mVar = m.a;
                Object e2 = m.e(this.f2060d, this.f2067k, m.e(this.c, this.f2066j, this.b, "inapp"), new Object[0]);
                List list = e2 instanceof List ? (List) e2 : null;
                if (list != null) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Object next : list) {
                            m mVar2 = m.a;
                            Object e3 = m.e(this.f2061e, this.f2068l, next, new Object[0]);
                            String str2 = e3 instanceof String ? (String) e3 : null;
                            if (str2 != null) {
                                JSONObject jSONObject = new JSONObject(str2);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    arrayList.add(string);
                                    Map<String, JSONObject> map = w;
                                    l.c(string, "skuID");
                                    map.put(string, jSONObject);
                                }
                            }
                        }
                        s(str, arrayList, runnable);
                    } catch (JSONException unused) {
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final void p(String str, Runnable runnable) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                l.d(str, "skuType");
                l.d(runnable, "queryPurchaseHistoryRunnable");
                r(str, new e(this, runnable));
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }
}
