package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m.y.d.l;

public class o {

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f4819e;

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f4820f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4821g;
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    public static abstract class a extends b {
    }

    public static abstract class b extends d<o> {
        public final o b;
        public o c;

        public b(o oVar) {
            this.b = oVar;
        }

        /* renamed from: h */
        public void d(o oVar, Object obj) {
            boolean z = obj == null;
            o oVar2 = z ? this.b : this.c;
            if (oVar2 != null && o.f4819e.compareAndSet(oVar, this, oVar2) && z) {
                o oVar3 = this.b;
                o oVar4 = this.c;
                l.b(oVar4);
                oVar3.m(oVar4);
            }
        }
    }

    public static final class c extends v {
        public final a a;

        public final void d() {
            throw null;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<o> cls2 = o.class;
        f4819e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f4820f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f4821g = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlinx.coroutines.internal.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlinx.coroutines.internal.o} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (f4819e.compareAndSet(r3, r2, ((kotlinx.coroutines.internal.w) r4).a) != false) goto L_0x004b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlinx.coroutines.internal.o k(kotlinx.coroutines.internal.v r8) {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.o r0 = (kotlinx.coroutines.internal.o) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f4820f
            boolean r0 = r1.compareAndSet(r7, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r7.s()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != r8) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.v
            if (r5 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0032
            r0 = r4
            kotlinx.coroutines.internal.v r0 = (kotlinx.coroutines.internal.v) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0032:
            kotlinx.coroutines.internal.v r4 = (kotlinx.coroutines.internal.v) r4
            r4.c(r2)
            goto L_0x0000
        L_0x0038:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.w
            if (r5 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f4819e
            kotlinx.coroutines.internal.w r4 = (kotlinx.coroutines.internal.w) r4
            kotlinx.coroutines.internal.o r4 = r4.a
            boolean r2 = r5.compareAndSet(r3, r2, r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x0000
        L_0x004b:
            r2 = r3
            goto L_0x0006
        L_0x004d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.o r2 = (kotlinx.coroutines.internal.o) r2
            goto L_0x0007
        L_0x0052:
            r3 = r4
            kotlinx.coroutines.internal.o r3 = (kotlinx.coroutines.internal.o) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.o.k(kotlinx.coroutines.internal.v):kotlinx.coroutines.internal.o");
    }

    private final o l(o oVar) {
        while (oVar.s()) {
            oVar = (o) oVar._prev;
        }
        return oVar;
    }

    /* access modifiers changed from: private */
    public final void m(o oVar) {
        o oVar2;
        do {
            oVar2 = (o) oVar._prev;
            if (n() != oVar) {
                return;
            }
        } while (!f4820f.compareAndSet(oVar, oVar2, this));
        if (s()) {
            oVar.k((v) null);
        }
    }

    private final w v() {
        w wVar = (w) this._removedRef;
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this);
        f4821g.lazySet(this, wVar2);
        return wVar2;
    }

    public final boolean i(o oVar, o oVar2) {
        f4820f.lazySet(oVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4819e;
        atomicReferenceFieldUpdater.lazySet(oVar, oVar2);
        if (!atomicReferenceFieldUpdater.compareAndSet(this, oVar2, oVar)) {
            return false;
        }
        oVar.m(oVar2);
        return true;
    }

    public final boolean j(o oVar) {
        f4820f.lazySet(oVar, this);
        f4819e.lazySet(oVar, this);
        while (n() == this) {
            if (f4819e.compareAndSet(this, this, oVar)) {
                oVar.m(this);
                return true;
            }
        }
        return false;
    }

    public final Object n() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof v)) {
                return obj;
            }
            ((v) obj).c(this);
        }
    }

    public final o o() {
        return n.b(n());
    }

    public final o p() {
        o k2 = k((v) null);
        return k2 == null ? l((o) this._prev) : k2;
    }

    public final void q() {
        ((w) n()).a.r();
    }

    public final void r() {
        o oVar = this;
        while (true) {
            Object n2 = oVar.n();
            if (!(n2 instanceof w)) {
                oVar.k((v) null);
                return;
            }
            oVar = ((w) n2).a;
        }
    }

    public boolean s() {
        return n() instanceof w;
    }

    public boolean t() {
        return u() == null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    public final o u() {
        Object n2;
        o oVar;
        do {
            n2 = n();
            if (n2 instanceof w) {
                return ((w) n2).a;
            }
            if (n2 == this) {
                return (o) n2;
            }
            oVar = (o) n2;
        } while (!f4819e.compareAndSet(this, n2, oVar.v()));
        oVar.k((v) null);
        return null;
    }

    public final int w(o oVar, o oVar2, b bVar) {
        f4820f.lazySet(oVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4819e;
        atomicReferenceFieldUpdater.lazySet(oVar, oVar2);
        bVar.c = oVar2;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, oVar2, bVar)) {
            return 0;
        }
        return bVar.c(this) == null ? 1 : 2;
    }
}
