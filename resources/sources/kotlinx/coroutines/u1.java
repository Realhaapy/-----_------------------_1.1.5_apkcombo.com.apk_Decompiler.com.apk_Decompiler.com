package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.n;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.n1;
import m.s;
import m.v.g;
import m.y.c.p;
import m.y.d.g;
import m.y.d.l;

public class u1 implements n1, u, b2 {

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4945e = AtomicReferenceFieldUpdater.newUpdater(u1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    private static final class a extends t1 {

        /* renamed from: i  reason: collision with root package name */
        private final u1 f4946i;

        /* renamed from: j  reason: collision with root package name */
        private final b f4947j;

        /* renamed from: k  reason: collision with root package name */
        private final t f4948k;

        /* renamed from: l  reason: collision with root package name */
        private final Object f4949l;

        public a(u1 u1Var, b bVar, t tVar, Object obj) {
            this.f4946i = u1Var;
            this.f4947j = bVar;
            this.f4948k = tVar;
            this.f4949l = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            x((Throwable) obj);
            return s.a;
        }

        public void x(Throwable th) {
            this.f4946i.x(this.f4947j, this.f4948k, this.f4949l);
        }
    }

    private static final class b implements i1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: e  reason: collision with root package name */
        private final y1 f4950e;

        public b(y1 y1Var, boolean z, Throwable th) {
            this.f4950e = y1Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return this._exceptionsHolder;
        }

        private final void l(Object obj) {
            this._exceptionsHolder = obj;
        }

        public boolean a() {
            return e() == null;
        }

        public final void b(Throwable th) {
            Throwable e2 = e();
            if (e2 == null) {
                m(th);
            } else if (th != e2) {
                Object d2 = d();
                if (d2 == null) {
                    l(th);
                } else if (d2 instanceof Throwable) {
                    if (th != d2) {
                        ArrayList<Throwable> c = c();
                        c.add(d2);
                        c.add(th);
                        s sVar = s.a;
                        l(c);
                    }
                } else if (d2 instanceof ArrayList) {
                    ((ArrayList) d2).add(th);
                } else {
                    throw new IllegalStateException(l.j("State is ", d2).toString());
                }
            }
        }

        public final Throwable e() {
            return (Throwable) this._rootCause;
        }

        public final boolean f() {
            return e() != null;
        }

        public y1 g() {
            return this.f4950e;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
        public final boolean h() {
            return this._isCompleting;
        }

        public final boolean i() {
            return d() == v1.f4957e;
        }

        public final List<Throwable> j(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object d2 = d();
            if (d2 == null) {
                arrayList = c();
            } else if (d2 instanceof Throwable) {
                ArrayList<Throwable> c = c();
                c.add(d2);
                arrayList = c;
            } else if (d2 instanceof ArrayList) {
                arrayList = (ArrayList) d2;
            } else {
                throw new IllegalStateException(l.j("State is ", d2).toString());
            }
            Throwable e2 = e();
            if (e2 != null) {
                arrayList.add(0, e2);
            }
            if (th != null && !l.a(th, e2)) {
                arrayList.add(th);
            }
            l(v1.f4957e);
            return arrayList;
        }

        public final void k(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        public final void m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + h() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + g() + ']';
        }
    }

    public static final class c extends o.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ u1 f4951d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f4952e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(o oVar, u1 u1Var, Object obj) {
            super(oVar);
            this.f4951d = u1Var;
            this.f4952e = obj;
        }

        /* renamed from: i */
        public Object g(o oVar) {
            if (this.f4951d.M() == this.f4952e) {
                return null;
            }
            return n.a();
        }
    }

    public u1(boolean z) {
        this._state = z ? v1.f4959g : v1.f4958f;
        this._parentHandle = null;
    }

    private final Object A(b bVar, Object obj) {
        boolean f2;
        Throwable F;
        boolean z = true;
        if (o0.a()) {
            if (!(M() == bVar)) {
                throw new AssertionError();
            }
        }
        if (o0.a() && !(!bVar.i())) {
            throw new AssertionError();
        } else if (!o0.a() || bVar.h()) {
            y yVar = obj instanceof y ? (y) obj : null;
            Throwable th = yVar == null ? null : yVar.a;
            synchronized (bVar) {
                f2 = bVar.f();
                List<Throwable> j2 = bVar.j(th);
                F = F(bVar, j2);
                if (F != null) {
                    n(F, j2);
                }
            }
            if (!(F == null || F == th)) {
                obj = new y(F, false, 2, (g) null);
            }
            if (F != null) {
                if (!t(F) && !N(F)) {
                    z = false;
                }
                if (z) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    ((y) obj).b();
                }
            }
            if (!f2) {
                b0(F);
            }
            c0(obj);
            boolean compareAndSet = f4945e.compareAndSet(this, bVar, v1.g(obj));
            if (!o0.a() || compareAndSet) {
                w(bVar, obj);
                return obj;
            }
            throw new AssertionError();
        } else {
            throw new AssertionError();
        }
    }

    private final t C(i1 i1Var) {
        t tVar = i1Var instanceof t ? (t) i1Var : null;
        if (tVar != null) {
            return tVar;
        }
        y1 g2 = i1Var.g();
        if (g2 == null) {
            return null;
        }
        return Y(g2);
    }

    private final Throwable D(Object obj) {
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar == null) {
            return null;
        }
        return yVar.a;
    }

    private final Throwable F(b bVar, List<? extends Throwable> list) {
        T t = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (!(((Throwable) next) instanceof CancellationException)) {
                    t = next;
                    break;
                }
            }
            Throwable th = (Throwable) t;
            return th != null ? th : (Throwable) list.get(0);
        } else if (bVar.f()) {
            return new o1(u(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    private final y1 I(i1 i1Var) {
        y1 g2 = i1Var.g();
        if (g2 != null) {
            return g2;
        }
        if (i1Var instanceof x0) {
            return new y1();
        }
        if (i1Var instanceof t1) {
            f0((t1) i1Var);
            return null;
        }
        throw new IllegalStateException(l.j("State should have list: ", i1Var).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        Z(((kotlinx.coroutines.u1.b) r2).g(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        return kotlinx.coroutines.v1.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object U(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.M()
            boolean r3 = r2 instanceof kotlinx.coroutines.u1.b
            if (r3 == 0) goto L_0x0052
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.u1$b r3 = (kotlinx.coroutines.u1.b) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.i()     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x001a
            kotlinx.coroutines.internal.z r7 = kotlinx.coroutines.v1.f4956d     // Catch:{ all -> 0x004f }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r3 = r2
            kotlinx.coroutines.u1$b r3 = (kotlinx.coroutines.u1.b) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.f()     // Catch:{ all -> 0x004f }
            if (r7 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0031
        L_0x0025:
            if (r1 != 0) goto L_0x002b
            java.lang.Throwable r1 = r6.y(r7)     // Catch:{ all -> 0x004f }
        L_0x002b:
            r7 = r2
            kotlinx.coroutines.u1$b r7 = (kotlinx.coroutines.u1.b) r7     // Catch:{ all -> 0x004f }
            r7.b(r1)     // Catch:{ all -> 0x004f }
        L_0x0031:
            r7 = r2
            kotlinx.coroutines.u1$b r7 = (kotlinx.coroutines.u1.b) r7     // Catch:{ all -> 0x004f }
            java.lang.Throwable r7 = r7.e()     // Catch:{ all -> 0x004f }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0041
            goto L_0x004a
        L_0x0041:
            kotlinx.coroutines.u1$b r2 = (kotlinx.coroutines.u1.b) r2
            kotlinx.coroutines.y1 r7 = r2.g()
            r6.Z(r7, r0)
        L_0x004a:
            kotlinx.coroutines.internal.z r7 = kotlinx.coroutines.v1.a
            return r7
        L_0x004f:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0052:
            boolean r3 = r2 instanceof kotlinx.coroutines.i1
            if (r3 == 0) goto L_0x009a
            if (r1 != 0) goto L_0x005c
            java.lang.Throwable r1 = r6.y(r7)
        L_0x005c:
            r3 = r2
            kotlinx.coroutines.i1 r3 = (kotlinx.coroutines.i1) r3
            boolean r4 = r3.a()
            if (r4 == 0) goto L_0x0070
            boolean r2 = r6.o0(r3, r1)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.internal.z r7 = kotlinx.coroutines.v1.a
            return r7
        L_0x0070:
            kotlinx.coroutines.y r3 = new kotlinx.coroutines.y
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.p0(r2, r3)
            kotlinx.coroutines.internal.z r4 = kotlinx.coroutines.v1.a
            if (r3 == r4) goto L_0x008a
            kotlinx.coroutines.internal.z r2 = kotlinx.coroutines.v1.c
            if (r3 != r2) goto L_0x0089
            goto L_0x0002
        L_0x0089:
            return r3
        L_0x008a:
            java.lang.String r7 = "Cannot happen in "
            java.lang.String r7 = m.y.d.l.j(r7, r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L_0x009a:
            kotlinx.coroutines.internal.z r7 = kotlinx.coroutines.v1.f4956d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.u1.U(java.lang.Object):java.lang.Object");
    }

    private final t1 W(m.y.c.l<? super Throwable, s> lVar, boolean z) {
        t1 t1Var = null;
        if (z) {
            if (lVar instanceof p1) {
                t1Var = (p1) lVar;
            }
            if (t1Var == null) {
                t1Var = new l1(lVar);
            }
        } else {
            t1 t1Var2 = lVar instanceof t1 ? (t1) lVar : null;
            if (t1Var2 != null) {
                if (!o0.a() || (!(t1Var2 instanceof p1))) {
                    t1Var = t1Var2;
                } else {
                    throw new AssertionError();
                }
            }
            if (t1Var == null) {
                t1Var = new m1(lVar);
            }
        }
        t1Var.z(this);
        return t1Var;
    }

    private final t Y(o oVar) {
        while (oVar.s()) {
            oVar = oVar.p();
        }
        while (true) {
            oVar = oVar.o();
            if (!oVar.s()) {
                if (oVar instanceof t) {
                    return (t) oVar;
                }
                if (oVar instanceof y1) {
                    return null;
                }
            }
        }
    }

    private final void Z(y1 y1Var, Throwable th) {
        b0 b0Var;
        b0(th);
        b0 b0Var2 = null;
        for (o oVar = (o) y1Var.n(); !l.a(oVar, y1Var); oVar = oVar.o()) {
            if (oVar instanceof p1) {
                t1 t1Var = (t1) oVar;
                try {
                    t1Var.x(th);
                } catch (Throwable th2) {
                    if (b0Var2 == null) {
                        b0Var = null;
                    } else {
                        b.a(b0Var2, th2);
                        b0Var = b0Var2;
                    }
                    if (b0Var == null) {
                        b0Var2 = new b0("Exception in completion handler " + t1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (b0Var2 != null) {
            P(b0Var2);
        }
        t(th);
    }

    private final void a0(y1 y1Var, Throwable th) {
        b0 b0Var;
        b0 b0Var2 = null;
        for (o oVar = (o) y1Var.n(); !l.a(oVar, y1Var); oVar = oVar.o()) {
            if (oVar instanceof t1) {
                t1 t1Var = (t1) oVar;
                try {
                    t1Var.x(th);
                } catch (Throwable th2) {
                    if (b0Var2 == null) {
                        b0Var = null;
                    } else {
                        b.a(b0Var2, th2);
                        b0Var = b0Var2;
                    }
                    if (b0Var == null) {
                        b0Var2 = new b0("Exception in completion handler " + t1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (b0Var2 != null) {
            P(b0Var2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kotlinx.coroutines.h1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void e0(kotlinx.coroutines.x0 r3) {
        /*
            r2 = this;
            kotlinx.coroutines.y1 r0 = new kotlinx.coroutines.y1
            r0.<init>()
            boolean r1 = r3.a()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            kotlinx.coroutines.h1 r1 = new kotlinx.coroutines.h1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f4945e
            r1.compareAndSet(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.u1.e0(kotlinx.coroutines.x0):void");
    }

    private final void f0(t1 t1Var) {
        t1Var.j(new y1());
        f4945e.compareAndSet(this, t1Var, t1Var.o());
    }

    private final int i0(Object obj) {
        if (obj instanceof x0) {
            if (((x0) obj).a()) {
                return 0;
            }
            if (!f4945e.compareAndSet(this, obj, v1.f4959g)) {
                return -1;
            }
            d0();
            return 1;
        } else if (!(obj instanceof h1)) {
            return 0;
        } else {
            if (!f4945e.compareAndSet(this, obj, ((h1) obj).g())) {
                return -1;
            }
            d0();
            return 1;
        }
    }

    private final String j0(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof i1 ? ((i1) obj).a() ? "Active" : "New" : obj instanceof y ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.f() ? "Cancelling" : bVar.h() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException l0(u1 u1Var, Throwable th, String str, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                str = null;
            }
            return u1Var.k0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final boolean m(Object obj, y1 y1Var, t1 t1Var) {
        int w;
        c cVar = new c(t1Var, this, obj);
        do {
            w = y1Var.p().w(t1Var, y1Var, cVar);
            if (w == 1) {
                return true;
            }
        } while (w != 2);
        return false;
    }

    private final void n(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Throwable n2 = !o0.d() ? th : y.n(th);
            for (Throwable th2 : list) {
                if (o0.d()) {
                    th2 = y.n(th2);
                }
                if (th2 != th && th2 != n2 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    b.a(th, th2);
                }
            }
        }
    }

    private final boolean n0(i1 i1Var, Object obj) {
        if (o0.a()) {
            if (!((i1Var instanceof x0) || (i1Var instanceof t1))) {
                throw new AssertionError();
            }
        }
        if (o0.a() && !(!(obj instanceof y))) {
            throw new AssertionError();
        } else if (!f4945e.compareAndSet(this, i1Var, v1.g(obj))) {
            return false;
        } else {
            b0((Throwable) null);
            c0(obj);
            w(i1Var, obj);
            return true;
        }
    }

    private final boolean o0(i1 i1Var, Throwable th) {
        if (o0.a() && !(!(i1Var instanceof b))) {
            throw new AssertionError();
        } else if (!o0.a() || i1Var.a()) {
            y1 I = I(i1Var);
            if (I == null) {
                return false;
            }
            if (!f4945e.compareAndSet(this, i1Var, new b(I, false, th))) {
                return false;
            }
            Z(I, th);
            return true;
        } else {
            throw new AssertionError();
        }
    }

    private final Object p0(Object obj, Object obj2) {
        return !(obj instanceof i1) ? v1.a : (((obj instanceof x0) || (obj instanceof t1)) && !(obj instanceof t) && !(obj2 instanceof y)) ? n0((i1) obj, obj2) ? obj2 : v1.c : q0((i1) obj, obj2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0072, code lost:
        if (r2 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0075, code lost:
        Z(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0078, code lost:
        r7 = C(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007c, code lost:
        if (r7 == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0082, code lost:
        if (r0(r1, r7, r8) == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0086, code lost:
        return kotlinx.coroutines.v1.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008b, code lost:
        return A(r1, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object q0(kotlinx.coroutines.i1 r7, java.lang.Object r8) {
        /*
            r6 = this;
            kotlinx.coroutines.y1 r0 = r6.I(r7)
            if (r0 != 0) goto L_0x000b
            kotlinx.coroutines.internal.z r7 = kotlinx.coroutines.v1.c
            return r7
        L_0x000b:
            boolean r1 = r7 instanceof kotlinx.coroutines.u1.b
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r7
            kotlinx.coroutines.u1$b r1 = (kotlinx.coroutines.u1.b) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            if (r1 != 0) goto L_0x001d
            kotlinx.coroutines.u1$b r1 = new kotlinx.coroutines.u1$b
            r3 = 0
            r1.<init>(r0, r3, r2)
        L_0x001d:
            monitor-enter(r1)
            boolean r3 = r1.h()     // Catch:{ all -> 0x008c }
            if (r3 == 0) goto L_0x002a
            kotlinx.coroutines.internal.z r7 = kotlinx.coroutines.v1.a     // Catch:{ all -> 0x008c }
            monitor-exit(r1)
            return r7
        L_0x002a:
            r3 = 1
            r1.k(r3)     // Catch:{ all -> 0x008c }
            if (r1 == r7) goto L_0x003e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f4945e     // Catch:{ all -> 0x008c }
            boolean r4 = r4.compareAndSet(r6, r7, r1)     // Catch:{ all -> 0x008c }
            if (r4 != 0) goto L_0x003e
            kotlinx.coroutines.internal.z r7 = kotlinx.coroutines.v1.c     // Catch:{ all -> 0x008c }
            monitor-exit(r1)
            return r7
        L_0x003e:
            boolean r4 = kotlinx.coroutines.o0.a()     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x0052
            boolean r4 = r1.i()     // Catch:{ all -> 0x008c }
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x004c
            goto L_0x0052
        L_0x004c:
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch:{ all -> 0x008c }
            r7.<init>()     // Catch:{ all -> 0x008c }
            throw r7     // Catch:{ all -> 0x008c }
        L_0x0052:
            boolean r4 = r1.f()     // Catch:{ all -> 0x008c }
            boolean r5 = r8 instanceof kotlinx.coroutines.y     // Catch:{ all -> 0x008c }
            if (r5 == 0) goto L_0x005e
            r5 = r8
            kotlinx.coroutines.y r5 = (kotlinx.coroutines.y) r5     // Catch:{ all -> 0x008c }
            goto L_0x005f
        L_0x005e:
            r5 = r2
        L_0x005f:
            if (r5 != 0) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            java.lang.Throwable r5 = r5.a     // Catch:{ all -> 0x008c }
            r1.b(r5)     // Catch:{ all -> 0x008c }
        L_0x0067:
            java.lang.Throwable r5 = r1.e()     // Catch:{ all -> 0x008c }
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x006f
            r2 = r5
        L_0x006f:
            m.s r3 = m.s.a     // Catch:{ all -> 0x008c }
            monitor-exit(r1)
            if (r2 != 0) goto L_0x0075
            goto L_0x0078
        L_0x0075:
            r6.Z(r0, r2)
        L_0x0078:
            kotlinx.coroutines.t r7 = r6.C(r7)
            if (r7 == 0) goto L_0x0087
            boolean r7 = r6.r0(r1, r7, r8)
            if (r7 == 0) goto L_0x0087
            kotlinx.coroutines.internal.z r7 = kotlinx.coroutines.v1.b
            return r7
        L_0x0087:
            java.lang.Object r7 = r6.A(r1, r8)
            return r7
        L_0x008c:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.u1.q0(kotlinx.coroutines.i1, java.lang.Object):java.lang.Object");
    }

    private final boolean r0(b bVar, t tVar, Object obj) {
        while (n1.a.d(tVar.f4942i, false, false, new a(this, bVar, tVar, obj), 1, (Object) null) == z1.f4972e) {
            tVar = Y(tVar);
            if (tVar == null) {
                return false;
            }
        }
        return true;
    }

    private final Object s(Object obj) {
        Object p0;
        do {
            Object M = M();
            if (!(M instanceof i1) || ((M instanceof b) && ((b) M).h())) {
                return v1.a;
            }
            p0 = p0(M, new y(y(obj), false, 2, (g) null));
        } while (p0 == v1.c);
        return p0;
    }

    private final boolean t(Throwable th) {
        if (T()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        s K = K();
        return (K == null || K == z1.f4972e) ? z : K.f(th) || z;
    }

    private final void w(i1 i1Var, Object obj) {
        s K = K();
        if (K != null) {
            K.dispose();
            h0(z1.f4972e);
        }
        Throwable th = null;
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar != null) {
            th = yVar.a;
        }
        if (i1Var instanceof t1) {
            try {
                ((t1) i1Var).x(th);
            } catch (Throwable th2) {
                P(new b0("Exception in completion handler " + i1Var + " for " + this, th2));
            }
        } else {
            y1 g2 = i1Var.g();
            if (g2 != null) {
                a0(g2, th);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void x(b bVar, t tVar, Object obj) {
        if (o0.a()) {
            if (!(M() == bVar)) {
                throw new AssertionError();
            }
        }
        t Y = Y(tVar);
        if (Y == null || !r0(bVar, Y, obj)) {
            p(A(bVar, obj));
        }
    }

    private final Throwable y(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new o1(u(), (Throwable) null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((b2) obj).z();
    }

    public final w0 B(boolean z, boolean z2, m.y.c.l<? super Throwable, s> lVar) {
        t1 W = W(lVar, z);
        while (true) {
            Object M = M();
            if (M instanceof x0) {
                x0 x0Var = (x0) M;
                if (!x0Var.a()) {
                    e0(x0Var);
                } else if (f4945e.compareAndSet(this, M, W)) {
                    return W;
                }
            } else {
                Throwable th = null;
                if (M instanceof i1) {
                    y1 g2 = ((i1) M).g();
                    if (g2 == null) {
                        Objects.requireNonNull(M, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        f0((t1) M);
                    } else {
                        w0 w0Var = z1.f4972e;
                        if (z && (M instanceof b)) {
                            synchronized (M) {
                                th = ((b) M).e();
                                if (th == null || ((lVar instanceof t) && !((b) M).h())) {
                                    if (m(M, g2, W)) {
                                        if (th == null) {
                                            return W;
                                        }
                                        w0Var = W;
                                    }
                                }
                                s sVar = s.a;
                            }
                        }
                        if (th != null) {
                            if (z2) {
                                lVar.invoke(th);
                            }
                            return w0Var;
                        } else if (m(M, g2, W)) {
                            return W;
                        }
                    }
                } else {
                    if (z2) {
                        y yVar = M instanceof y ? (y) M : null;
                        if (yVar != null) {
                            th = yVar.a;
                        }
                        lVar.invoke(th);
                    }
                    return z1.f4972e;
                }
            }
        }
    }

    public final CancellationException E() {
        Object M = M();
        if (M instanceof b) {
            Throwable e2 = ((b) M).e();
            if (e2 != null) {
                return k0(e2, l.j(p0.a(this), " is cancelling"));
            }
            throw new IllegalStateException(l.j("Job is still new or active: ", this).toString());
        } else if (!(M instanceof i1)) {
            return M instanceof y ? l0(this, ((y) M).a, (String) null, 1, (Object) null) : new o1(l.j(p0.a(this), " has completed normally"), (Throwable) null, this);
        } else {
            throw new IllegalStateException(l.j("Job is still new or active: ", this).toString());
        }
    }

    public boolean G() {
        return true;
    }

    public boolean H() {
        return false;
    }

    public void J(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new o1(u(), (Throwable) null, this);
        }
        r(cancellationException);
    }

    public final s K() {
        return (s) this._parentHandle;
    }

    public final void L(b2 b2Var) {
        q(b2Var);
    }

    public final Object M() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof v)) {
                return obj;
            }
            ((v) obj).c(this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean N(Throwable th) {
        return false;
    }

    public void P(Throwable th) {
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void Q(n1 n1Var) {
        if (o0.a()) {
            if (!(K() == null)) {
                throw new AssertionError();
            }
        }
        if (n1Var == null) {
            h0(z1.f4972e);
            return;
        }
        n1Var.start();
        s S = n1Var.S(this);
        h0(S);
        if (R()) {
            S.dispose();
            h0(z1.f4972e);
        }
    }

    public final boolean R() {
        return !(M() instanceof i1);
    }

    public final s S(u uVar) {
        return (s) n1.a.d(this, true, false, new t(uVar), 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    public boolean T() {
        return false;
    }

    public final Object V(Object obj) {
        Object p0;
        do {
            p0 = p0(M(), obj);
            if (p0 == v1.a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, D(obj));
            }
        } while (p0 == v1.c);
        return p0;
    }

    public String X() {
        return p0.a(this);
    }

    public boolean a() {
        Object M = M();
        return (M instanceof i1) && ((i1) M).a();
    }

    /* access modifiers changed from: protected */
    public void b0(Throwable th) {
    }

    /* access modifiers changed from: protected */
    public void c0(Object obj) {
    }

    /* access modifiers changed from: protected */
    public void d0() {
    }

    public <R> R fold(R r2, p<? super R, ? super g.b, ? extends R> pVar) {
        return n1.a.b(this, r2, pVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g0(kotlinx.coroutines.t1 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.M()
            boolean r1 = r0 instanceof kotlinx.coroutines.t1
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f4945e
            kotlinx.coroutines.x0 r2 = kotlinx.coroutines.v1.f4959g
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof kotlinx.coroutines.i1
            if (r1 == 0) goto L_0x0027
            kotlinx.coroutines.i1 r0 = (kotlinx.coroutines.i1) r0
            kotlinx.coroutines.y1 r0 = r0.g()
            if (r0 == 0) goto L_0x0027
            r4.t()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.u1.g0(kotlinx.coroutines.t1):void");
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        return n1.a.c(this, cVar);
    }

    public final g.c<?> getKey() {
        return n1.f4932d;
    }

    public final void h0(s sVar) {
        this._parentHandle = sVar;
    }

    /* access modifiers changed from: protected */
    public final CancellationException k0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = u();
            }
            cancellationException = new o1(str, th, this);
        }
        return cancellationException;
    }

    public final String m0() {
        return X() + '{' + j0(M()) + '}';
    }

    public m.v.g minusKey(g.c<?> cVar) {
        return n1.a.e(this, cVar);
    }

    /* access modifiers changed from: protected */
    public void p(Object obj) {
    }

    public m.v.g plus(m.v.g gVar) {
        return n1.a.f(this, gVar);
    }

    public final boolean q(Object obj) {
        Object a2 = v1.a;
        if (H() && (a2 = s(obj)) == v1.b) {
            return true;
        }
        if (a2 == v1.a) {
            a2 = U(obj);
        }
        if (a2 == v1.a || a2 == v1.b) {
            return true;
        }
        if (a2 == v1.f4956d) {
            return false;
        }
        p(a2);
        return true;
    }

    public void r(Throwable th) {
        q(th);
    }

    public final boolean start() {
        int i0;
        do {
            i0 = i0(M());
            if (i0 == 0) {
                return false;
            }
        } while (i0 != 1);
        return true;
    }

    public String toString() {
        return m0() + '@' + p0.b(this);
    }

    /* access modifiers changed from: protected */
    public String u() {
        return "Job was cancelled";
    }

    public boolean v(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return q(th) && G();
    }

    public CancellationException z() {
        Throwable th;
        Object M = M();
        CancellationException cancellationException = null;
        if (M instanceof b) {
            th = ((b) M).e();
        } else if (M instanceof y) {
            th = ((y) M).a;
        } else if (!(M instanceof i1)) {
            th = null;
        } else {
            throw new IllegalStateException(l.j("Cannot be cancelling child in this state: ", M).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        return cancellationException == null ? new o1(l.j("Parent job is ", j0(M)), th, this) : cancellationException;
    }
}
