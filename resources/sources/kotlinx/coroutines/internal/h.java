package kotlinx.coroutines.internal;

import m.v.d;
import m.y.c.l;

public final class h {
    /* access modifiers changed from: private */
    public static final z a = new z("UNDEFINED");
    public static final z b = new z("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        if (r8.x0() != false) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void b(m.v.d<? super T> r6, java.lang.Object r7, m.y.c.l<? super java.lang.Throwable, m.s> r8) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.g
            if (r0 == 0) goto L_0x00b9
            kotlinx.coroutines.internal.g r6 = (kotlinx.coroutines.internal.g) r6
            java.lang.Object r8 = kotlinx.coroutines.c0.b(r7, r8)
            kotlinx.coroutines.f0 r0 = r6.f4808h
            m.v.g r1 = r6.getContext()
            boolean r0 = r0.U(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f4810j = r8
            r6.f4941g = r1
            kotlinx.coroutines.f0 r7 = r6.f4808h
            m.v.g r8 = r6.getContext()
            r7.T(r8, r6)
            goto L_0x00bc
        L_0x0026:
            boolean r0 = kotlinx.coroutines.o0.a()
            kotlinx.coroutines.e2 r0 = kotlinx.coroutines.e2.a
            kotlinx.coroutines.y0 r0 = r0.a()
            boolean r2 = r0.b0()
            if (r2 == 0) goto L_0x003f
            r6.f4810j = r8
            r6.f4941g = r1
            r0.X(r6)
            goto L_0x00bc
        L_0x003f:
            r0.Z(r1)
            r2 = 0
            m.v.g r3 = r6.getContext()     // Catch:{ all -> 0x00ac }
            kotlinx.coroutines.n1$b r4 = kotlinx.coroutines.n1.f4932d     // Catch:{ all -> 0x00ac }
            m.v.g$b r3 = r3.get(r4)     // Catch:{ all -> 0x00ac }
            kotlinx.coroutines.n1 r3 = (kotlinx.coroutines.n1) r3     // Catch:{ all -> 0x00ac }
            if (r3 == 0) goto L_0x006c
            boolean r4 = r3.a()     // Catch:{ all -> 0x00ac }
            if (r4 != 0) goto L_0x006c
            java.util.concurrent.CancellationException r3 = r3.E()     // Catch:{ all -> 0x00ac }
            r6.a(r8, r3)     // Catch:{ all -> 0x00ac }
            m.m$a r8 = m.m.f5014e     // Catch:{ all -> 0x00ac }
            java.lang.Object r8 = m.n.a(r3)     // Catch:{ all -> 0x00ac }
            m.m.a(r8)     // Catch:{ all -> 0x00ac }
            r6.resumeWith(r8)     // Catch:{ all -> 0x00ac }
            r8 = 1
            goto L_0x006d
        L_0x006c:
            r8 = 0
        L_0x006d:
            if (r8 != 0) goto L_0x00a5
            m.v.d<T> r8 = r6.f4809i     // Catch:{ all -> 0x00ac }
            java.lang.Object r3 = r6.f4811k     // Catch:{ all -> 0x00ac }
            m.v.g r4 = r8.getContext()     // Catch:{ all -> 0x00ac }
            java.lang.Object r3 = kotlinx.coroutines.internal.d0.c(r4, r3)     // Catch:{ all -> 0x00ac }
            kotlinx.coroutines.internal.z r5 = kotlinx.coroutines.internal.d0.a     // Catch:{ all -> 0x00ac }
            if (r3 == r5) goto L_0x0084
            kotlinx.coroutines.g2 r8 = kotlinx.coroutines.e0.e(r8, r4, r3)     // Catch:{ all -> 0x00ac }
            goto L_0x0085
        L_0x0084:
            r8 = r2
        L_0x0085:
            m.v.d<T> r5 = r6.f4809i     // Catch:{ all -> 0x0098 }
            r5.resumeWith(r7)     // Catch:{ all -> 0x0098 }
            m.s r7 = m.s.a     // Catch:{ all -> 0x0098 }
            if (r8 == 0) goto L_0x0094
            boolean r7 = r8.x0()     // Catch:{ all -> 0x00ac }
            if (r7 == 0) goto L_0x00a5
        L_0x0094:
            kotlinx.coroutines.internal.d0.a(r4, r3)     // Catch:{ all -> 0x00ac }
            goto L_0x00a5
        L_0x0098:
            r7 = move-exception
            if (r8 == 0) goto L_0x00a1
            boolean r8 = r8.x0()     // Catch:{ all -> 0x00ac }
            if (r8 == 0) goto L_0x00a4
        L_0x00a1:
            kotlinx.coroutines.internal.d0.a(r4, r3)     // Catch:{ all -> 0x00ac }
        L_0x00a4:
            throw r7     // Catch:{ all -> 0x00ac }
        L_0x00a5:
            boolean r7 = r0.d0()     // Catch:{ all -> 0x00ac }
            if (r7 != 0) goto L_0x00a5
            goto L_0x00b0
        L_0x00ac:
            r7 = move-exception
            r6.k(r7, r2)     // Catch:{ all -> 0x00b4 }
        L_0x00b0:
            r0.V(r1)
            goto L_0x00bc
        L_0x00b4:
            r6 = move-exception
            r0.V(r1)
            throw r6
        L_0x00b9:
            r6.resumeWith(r7)
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.h.b(m.v.d, java.lang.Object, m.y.c.l):void");
    }

    public static /* synthetic */ void c(d dVar, Object obj, l lVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }
}
