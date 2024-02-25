package f.e.c.a;

import f.e.c.a.p;
import f.e.c.a.y.a0;
import f.e.c.a.y.c0;
import f.e.c.a.y.y;
import f.e.c.a.y.z;
import f.e.c.a.z.a.i;
import f.e.c.a.z.a.s0;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

public final class r {
    private static final Logger a = Logger.getLogger(r.class.getName());
    private static final ConcurrentMap<String, d> b = new ConcurrentHashMap();
    private static final ConcurrentMap<String, c> c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentMap<String, Boolean> f4030d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentMap<Class<?>, q<?, ?>> f4031e = new ConcurrentHashMap();

    class a implements d {
        final /* synthetic */ h a;

        a(h hVar) {
            this.a = hVar;
        }

        public <Q> e<Q> a(Class<Q> cls) {
            try {
                return new f(this.a, cls);
            } catch (IllegalArgumentException e2) {
                throw new GeneralSecurityException("Primitive type not supported", e2);
            }
        }

        public e<?> b() {
            h hVar = this.a;
            return new f(hVar, hVar.a());
        }

        public Class<?> c() {
            return this.a.getClass();
        }

        public Set<Class<?>> d() {
            return this.a.h();
        }
    }

    class b implements c {
        b(h hVar) {
        }
    }

    private interface c {
    }

    private interface d {
        <P> e<P> a(Class<P> cls);

        e<?> b();

        Class<?> c();

        Set<Class<?>> d();
    }

    static {
        new ConcurrentHashMap();
    }

    private r() {
    }

    private static <T> T a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    private static <KeyProtoT extends s0> d b(h<KeyProtoT> hVar) {
        return new a(hVar);
    }

    private static <KeyProtoT extends s0> c c(h<KeyProtoT> hVar) {
        return new b(hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void d(java.lang.String r5, java.lang.Class<?> r6, boolean r7) {
        /*
            java.lang.Class<f.e.c.a.r> r0 = f.e.c.a.r.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, f.e.c.a.r$d> r1 = b     // Catch:{ all -> 0x0081 }
            boolean r2 = r1.containsKey(r5)     // Catch:{ all -> 0x0081 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0081 }
            f.e.c.a.r$d r1 = (f.e.c.a.r.d) r1     // Catch:{ all -> 0x0081 }
            java.lang.Class r2 = r1.c()     // Catch:{ all -> 0x0081 }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x0047
            if (r7 == 0) goto L_0x0045
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r6 = f4030d     // Catch:{ all -> 0x0081 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x0081 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0081 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0081 }
            if (r6 == 0) goto L_0x002e
            goto L_0x0045
        L_0x002e:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r7.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "New keys are already disallowed for key type "
            r7.append(r1)     // Catch:{ all -> 0x0081 }
            r7.append(r5)     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0081 }
            r6.<init>(r5)     // Catch:{ all -> 0x0081 }
            throw r6     // Catch:{ all -> 0x0081 }
        L_0x0045:
            monitor-exit(r0)
            return
        L_0x0047:
            java.util.logging.Logger r7 = a     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r2.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = "Attempted overwrite of a registered key manager for key type "
            r2.append(r3)     // Catch:{ all -> 0x0081 }
            r2.append(r5)     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0081 }
            r7.warning(r2)     // Catch:{ all -> 0x0081 }
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0081 }
            r4 = 0
            r3[r4] = r5     // Catch:{ all -> 0x0081 }
            r5 = 1
            java.lang.Class r1 = r1.c()     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0081 }
            r3[r5] = r1     // Catch:{ all -> 0x0081 }
            r5 = 2
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x0081 }
            r3[r5] = r6     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0081 }
            r7.<init>(r5)     // Catch:{ all -> 0x0081 }
            throw r7     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.r.d(java.lang.String, java.lang.Class, boolean):void");
    }

    public static Class<?> e(Class<?> cls) {
        q qVar = (q) f4031e.get(cls);
        if (qVar == null) {
            return null;
        }
        return qVar.a();
    }

    private static synchronized d f(String str) {
        d dVar;
        synchronized (r.class) {
            ConcurrentMap<String, d> concurrentMap = b;
            if (concurrentMap.containsKey(str)) {
                dVar = (d) concurrentMap.get(str);
            } else {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
        }
        return dVar;
    }

    private static <P> e<P> g(String str, Class<P> cls) {
        d f2 = f(str);
        if (cls == null) {
            return f2.b();
        }
        if (f2.d().contains(cls)) {
            return f2.a(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + f2.c() + ", supported primitives: " + s(f2.d()));
    }

    public static <P> P h(String str, i iVar, Class<P> cls) {
        a(cls);
        return j(str, iVar, cls);
    }

    public static <P> P i(String str, byte[] bArr, Class<P> cls) {
        return h(str, i.k(bArr), cls);
    }

    private static <P> P j(String str, i iVar, Class<P> cls) {
        return g(str, cls).b(iVar);
    }

    public static <P> p<P> k(i iVar, e<P> eVar, Class<P> cls) {
        a(cls);
        return m(iVar, eVar, cls);
    }

    public static <P> p<P> l(i iVar, Class<P> cls) {
        return k(iVar, (e) null, cls);
    }

    private static <P> p<P> m(i iVar, e<P> eVar, Class<P> cls) {
        s.d(iVar.f());
        p<P> f2 = p.f(cls);
        for (c0.c next : iVar.f().U()) {
            if (next.V() == z.ENABLED) {
                p.b<P> a2 = f2.a((eVar == null || !eVar.a(next.S().T())) ? j(next.S().T(), next.S().U(), cls) : eVar.b(next.S().U()), next);
                if (next.T() == iVar.f().V()) {
                    f2.g(a2);
                }
            }
        }
        return f2;
    }

    public static e<?> n(String str) {
        return f(str).b();
    }

    public static synchronized s0 o(a0 a0Var) {
        s0 c2;
        synchronized (r.class) {
            e<?> n2 = n(a0Var.T());
            if (((Boolean) f4030d.get(a0Var.T())).booleanValue()) {
                c2 = n2.c(a0Var.U());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.T());
            }
        }
        return c2;
    }

    public static synchronized y p(a0 a0Var) {
        y d2;
        synchronized (r.class) {
            e<?> n2 = n(a0Var.T());
            if (((Boolean) f4030d.get(a0Var.T())).booleanValue()) {
                d2 = n2.d(a0Var.U());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.T());
            }
        }
        return d2;
    }

    public static synchronized <KeyProtoT extends s0> void q(h<KeyProtoT> hVar, boolean z) {
        synchronized (r.class) {
            if (hVar != null) {
                String c2 = hVar.c();
                d(c2, hVar.getClass(), z);
                ConcurrentMap<String, d> concurrentMap = b;
                if (!concurrentMap.containsKey(c2)) {
                    concurrentMap.put(c2, b(hVar));
                    c.put(c2, c(hVar));
                }
                f4030d.put(c2, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static synchronized <B, P> void r(q<B, P> qVar) {
        synchronized (r.class) {
            if (qVar != null) {
                Class<P> c2 = qVar.c();
                ConcurrentMap<Class<?>, q<?, ?>> concurrentMap = f4031e;
                if (concurrentMap.containsKey(c2)) {
                    q qVar2 = (q) concurrentMap.get(c2);
                    if (!qVar.getClass().equals(qVar2.getClass())) {
                        Logger logger = a;
                        logger.warning("Attempted overwrite of a registered SetWrapper for type " + c2);
                        throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{c2.getName(), qVar2.getClass().getName(), qVar.getClass().getName()}));
                    }
                }
                concurrentMap.put(c2, qVar);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    private static String s(Set<Class<?>> set) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class next : set) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(next.getCanonicalName());
            z = false;
        }
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [f.e.c.a.p<B>, f.e.c.a.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <B, P> P t(f.e.c.a.p<B> r3, java.lang.Class<P> r4) {
        /*
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, f.e.c.a.q<?, ?>> r0 = f4031e
            java.lang.Object r4 = r0.get(r4)
            f.e.c.a.q r4 = (f.e.c.a.q) r4
            if (r4 == 0) goto L_0x0044
            java.lang.Class r0 = r4.a()
            java.lang.Class r1 = r3.d()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001d
            java.lang.Object r3 = r4.b(r3)
            return r3
        L_0x001d:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Wrong input primitive class, expected "
            r1.append(r2)
            java.lang.Class r4 = r4.a()
            r1.append(r4)
            java.lang.String r4 = ", got "
            r1.append(r4)
            java.lang.Class r3 = r3.d()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x0044:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No wrapper found for "
            r0.append(r1)
            java.lang.Class r3 = r3.d()
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.r.t(f.e.c.a.p, java.lang.Class):java.lang.Object");
    }
}
