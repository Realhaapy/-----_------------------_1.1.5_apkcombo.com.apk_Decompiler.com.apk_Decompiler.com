package m.d0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import m.a0.c;
import m.c0.b;
import m.l;
import m.y.c.p;

final class e implements b<c> {
    /* access modifiers changed from: private */
    public final CharSequence a;
    /* access modifiers changed from: private */
    public final int b;
    /* access modifiers changed from: private */
    public final int c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, l<Integer, Integer>> f4992d;

    public static final class a implements Iterator<c>, m.y.d.u.a {

        /* renamed from: e  reason: collision with root package name */
        private int f4993e = -1;

        /* renamed from: f  reason: collision with root package name */
        private int f4994f;

        /* renamed from: g  reason: collision with root package name */
        private int f4995g;

        /* renamed from: h  reason: collision with root package name */
        private c f4996h;

        /* renamed from: i  reason: collision with root package name */
        private int f4997i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ e f4998j;

        a(e eVar) {
            this.f4998j = eVar;
            int e2 = f.e(eVar.b, 0, eVar.a.length());
            this.f4994f = e2;
            this.f4995g = e2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < m.d0.e.c(r6.f4998j)) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void b() {
            /*
                r6 = this;
                int r0 = r6.f4995g
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f4993e = r1
                r0 = 0
                r6.f4996h = r0
                goto L_0x0099
            L_0x000c:
                m.d0.e r0 = r6.f4998j
                int r0 = r0.c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f4997i
                int r0 = r0 + r3
                r6.f4997i = r0
                m.d0.e r4 = r6.f4998j
                int r4 = r4.c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f4995g
                m.d0.e r4 = r6.f4998j
                java.lang.CharSequence r4 = r4.a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                m.a0.c r0 = new m.a0.c
                int r1 = r6.f4994f
                m.d0.e r4 = r6.f4998j
                java.lang.CharSequence r4 = r4.a
                int r4 = m.d0.q.z(r4)
                r0.<init>(r1, r4)
            L_0x0042:
                r6.f4996h = r0
            L_0x0044:
                r6.f4995g = r2
                goto L_0x0097
            L_0x0047:
                m.d0.e r0 = r6.f4998j
                m.y.c.p r0 = r0.f4992d
                m.d0.e r4 = r6.f4998j
                java.lang.CharSequence r4 = r4.a
                int r5 = r6.f4995g
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                m.l r0 = (m.l) r0
                if (r0 != 0) goto L_0x0073
                m.a0.c r0 = new m.a0.c
                int r1 = r6.f4994f
                m.d0.e r4 = r6.f4998j
                java.lang.CharSequence r4 = r4.a
                int r4 = m.d0.q.z(r4)
                r0.<init>(r1, r4)
                goto L_0x0042
            L_0x0073:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f4994f
                m.a0.c r4 = m.a0.f.g(r4, r2)
                r6.f4996h = r4
                int r2 = r2 + r0
                r6.f4994f = r2
                if (r0 != 0) goto L_0x0095
                r1 = 1
            L_0x0095:
                int r2 = r2 + r1
                goto L_0x0044
            L_0x0097:
                r6.f4993e = r3
            L_0x0099:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m.d0.e.a.b():void");
        }

        /* renamed from: c */
        public c next() {
            if (this.f4993e == -1) {
                b();
            }
            if (this.f4993e != 0) {
                c cVar = this.f4996h;
                Objects.requireNonNull(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f4996h = null;
                this.f4993e = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f4993e == -1) {
                b();
            }
            return this.f4993e == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(CharSequence charSequence, int i2, int i3, p<? super CharSequence, ? super Integer, l<Integer, Integer>> pVar) {
        m.y.d.l.d(charSequence, "input");
        m.y.d.l.d(pVar, "getNextMatch");
        this.a = charSequence;
        this.b = i2;
        this.c = i3;
        this.f4992d = pVar;
    }

    public Iterator<c> iterator() {
        return new a(this);
    }
}
