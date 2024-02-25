package kotlinx.coroutines;

import kotlinx.coroutines.m2.i;
import m.v.d;
import m.y.d.l;

public abstract class s0<T> extends i {

    /* renamed from: g  reason: collision with root package name */
    public int f4941g;

    public s0(int i2) {
        this.f4941g = i2;
    }

    public void a(Object obj, Throwable th) {
    }

    public abstract d<T> c();

    public Throwable e(Object obj) {
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar == null) {
            return null;
        }
        return yVar.a;
    }

    public <T> T g(Object obj) {
        return obj;
    }

    public final void k(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                b.a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            l.b(th);
            h0.a(c().getContext(), new n0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object l();

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a2, code lost:
        if (r4.x0() != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c9, code lost:
        if (r4.x0() != false) goto L_0x00cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            boolean r0 = kotlinx.coroutines.o0.a()
            if (r0 == 0) goto L_0x0017
            int r0 = r10.f4941g
            r1 = -1
            if (r0 == r1) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0011
            goto L_0x0017
        L_0x0011:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0017:
            kotlinx.coroutines.m2.j r0 = r10.f4921f
            m.v.d r1 = r10.c()     // Catch:{ all -> 0x00cf }
            kotlinx.coroutines.internal.g r1 = (kotlinx.coroutines.internal.g) r1     // Catch:{ all -> 0x00cf }
            m.v.d<T> r2 = r1.f4809i     // Catch:{ all -> 0x00cf }
            java.lang.Object r1 = r1.f4811k     // Catch:{ all -> 0x00cf }
            m.v.g r3 = r2.getContext()     // Catch:{ all -> 0x00cf }
            java.lang.Object r1 = kotlinx.coroutines.internal.d0.c(r3, r1)     // Catch:{ all -> 0x00cf }
            kotlinx.coroutines.internal.z r4 = kotlinx.coroutines.internal.d0.a     // Catch:{ all -> 0x00cf }
            r5 = 0
            if (r1 == r4) goto L_0x0035
            kotlinx.coroutines.g2 r4 = kotlinx.coroutines.e0.e(r2, r3, r1)     // Catch:{ all -> 0x00cf }
            goto L_0x0036
        L_0x0035:
            r4 = r5
        L_0x0036:
            m.v.g r6 = r2.getContext()     // Catch:{ all -> 0x00c2 }
            java.lang.Object r7 = r10.l()     // Catch:{ all -> 0x00c2 }
            java.lang.Throwable r8 = r10.e(r7)     // Catch:{ all -> 0x00c2 }
            if (r8 != 0) goto L_0x0055
            int r9 = r10.f4941g     // Catch:{ all -> 0x00c2 }
            boolean r9 = kotlinx.coroutines.t0.b(r9)     // Catch:{ all -> 0x00c2 }
            if (r9 == 0) goto L_0x0055
            kotlinx.coroutines.n1$b r9 = kotlinx.coroutines.n1.f4932d     // Catch:{ all -> 0x00c2 }
            m.v.g$b r6 = r6.get(r9)     // Catch:{ all -> 0x00c2 }
            kotlinx.coroutines.n1 r6 = (kotlinx.coroutines.n1) r6     // Catch:{ all -> 0x00c2 }
            goto L_0x0056
        L_0x0055:
            r6 = r5
        L_0x0056:
            if (r6 == 0) goto L_0x0084
            boolean r9 = r6.a()     // Catch:{ all -> 0x00c2 }
            if (r9 != 0) goto L_0x0084
            java.util.concurrent.CancellationException r6 = r6.E()     // Catch:{ all -> 0x00c2 }
            r10.a(r7, r6)     // Catch:{ all -> 0x00c2 }
            m.m$a r7 = m.m.f5014e     // Catch:{ all -> 0x00c2 }
            boolean r7 = kotlinx.coroutines.o0.d()     // Catch:{ all -> 0x00c2 }
            if (r7 == 0) goto L_0x0079
            boolean r7 = r2 instanceof m.v.j.a.e     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x0072
            goto L_0x0079
        L_0x0072:
            r7 = r2
            m.v.j.a.e r7 = (m.v.j.a.e) r7     // Catch:{ all -> 0x00c2 }
            java.lang.Throwable r6 = kotlinx.coroutines.internal.y.j(r6, r7)     // Catch:{ all -> 0x00c2 }
        L_0x0079:
            java.lang.Object r6 = m.n.a(r6)     // Catch:{ all -> 0x00c2 }
            m.m.a(r6)     // Catch:{ all -> 0x00c2 }
        L_0x0080:
            r2.resumeWith(r6)     // Catch:{ all -> 0x00c2 }
            goto L_0x009a
        L_0x0084:
            if (r8 == 0) goto L_0x0090
            m.m$a r6 = m.m.f5014e     // Catch:{ all -> 0x00c2 }
            java.lang.Object r6 = m.n.a(r8)     // Catch:{ all -> 0x00c2 }
            m.m.a(r6)     // Catch:{ all -> 0x00c2 }
            goto L_0x0080
        L_0x0090:
            java.lang.Object r6 = r10.g(r7)     // Catch:{ all -> 0x00c2 }
            m.m$a r7 = m.m.f5014e     // Catch:{ all -> 0x00c2 }
            m.m.a(r6)     // Catch:{ all -> 0x00c2 }
            goto L_0x0080
        L_0x009a:
            m.s r2 = m.s.a     // Catch:{ all -> 0x00c2 }
            if (r4 == 0) goto L_0x00a4
            boolean r4 = r4.x0()     // Catch:{ all -> 0x00cf }
            if (r4 == 0) goto L_0x00a7
        L_0x00a4:
            kotlinx.coroutines.internal.d0.a(r3, r1)     // Catch:{ all -> 0x00cf }
        L_0x00a7:
            m.m$a r1 = m.m.f5014e     // Catch:{ all -> 0x00b0 }
            r0.v()     // Catch:{ all -> 0x00b0 }
            m.m.a(r2)     // Catch:{ all -> 0x00b0 }
            goto L_0x00ba
        L_0x00b0:
            r0 = move-exception
            m.m$a r1 = m.m.f5014e
            java.lang.Object r2 = m.n.a(r0)
            m.m.a(r2)
        L_0x00ba:
            java.lang.Throwable r0 = m.m.b(r2)
            r10.k(r5, r0)
            goto L_0x00ec
        L_0x00c2:
            r2 = move-exception
            if (r4 == 0) goto L_0x00cb
            boolean r4 = r4.x0()     // Catch:{ all -> 0x00cf }
            if (r4 == 0) goto L_0x00ce
        L_0x00cb:
            kotlinx.coroutines.internal.d0.a(r3, r1)     // Catch:{ all -> 0x00cf }
        L_0x00ce:
            throw r2     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r1 = move-exception
            m.m$a r2 = m.m.f5014e     // Catch:{ all -> 0x00db }
            r0.v()     // Catch:{ all -> 0x00db }
            m.s r0 = m.s.a     // Catch:{ all -> 0x00db }
            m.m.a(r0)     // Catch:{ all -> 0x00db }
            goto L_0x00e5
        L_0x00db:
            r0 = move-exception
            m.m$a r2 = m.m.f5014e
            java.lang.Object r0 = m.n.a(r0)
            m.m.a(r0)
        L_0x00e5:
            java.lang.Throwable r0 = m.m.b(r0)
            r10.k(r1, r0)
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.s0.run():void");
    }
}
