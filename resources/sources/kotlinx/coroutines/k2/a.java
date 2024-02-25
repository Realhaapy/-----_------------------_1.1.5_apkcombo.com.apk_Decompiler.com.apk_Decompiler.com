package kotlinx.coroutines.k2;

import m.s;
import m.v.j.a.d;
import m.v.j.a.f;

public abstract class a<T> implements b<T> {

    @f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {212}, m = "collect")
    /* renamed from: kotlinx.coroutines.k2.a$a  reason: collision with other inner class name */
    static final class C0140a extends d {

        /* renamed from: e  reason: collision with root package name */
        Object f4855e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f4856f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a<T> f4857g;

        /* renamed from: h  reason: collision with root package name */
        int f4858h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0140a(a<T> aVar, m.v.d<? super C0140a> dVar) {
            super(dVar);
            this.f4857g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f4856f = obj;
            this.f4858h |= Integer.MIN_VALUE;
            return this.f4857g.a((c) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlinx.coroutines.k2.c<? super T> r6, m.v.d<? super m.s> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.k2.a.C0140a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.k2.a$a r0 = (kotlinx.coroutines.k2.a.C0140a) r0
            int r1 = r0.f4858h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f4858h = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.k2.a$a r0 = new kotlinx.coroutines.k2.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f4856f
            java.lang.Object r1 = m.v.i.d.c()
            int r2 = r0.f4858h
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.f4855e
            kotlinx.coroutines.k2.g.c r6 = (kotlinx.coroutines.k2.g.c) r6
            m.n.b(r7)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r7 = move-exception
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            m.n.b(r7)
            kotlinx.coroutines.k2.g.c r7 = new kotlinx.coroutines.k2.g.c
            m.v.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f4855e = r7     // Catch:{ all -> 0x0055 }
            r0.f4858h = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r6 = r5.b(r7, r0)     // Catch:{ all -> 0x0055 }
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r6 = r7
        L_0x004f:
            r6.releaseIntercepted()
            m.s r6 = m.s.a
            return r6
        L_0x0055:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0059:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.k2.a.a(kotlinx.coroutines.k2.c, m.v.d):java.lang.Object");
    }

    public abstract Object b(c<? super T> cVar, m.v.d<? super s> dVar);
}
