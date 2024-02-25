package f.e.c.a.z.a;

import f.e.c.a.z.a.b0;
import java.util.Collections;
import java.util.List;

abstract class i0 {
    private static final i0 a = new b();
    private static final i0 b = new c();

    private static final class b extends i0 {
        private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j2) {
            return (List) s1.A(obj, j2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: f.e.c.a.z.a.g0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: f.e.c.a.z.a.g0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: f.e.c.a.z.a.g0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static <L> java.util.List<L> g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof f.e.c.a.z.a.h0
                if (r1 == 0) goto L_0x0014
                f.e.c.a.z.a.g0 r0 = new f.e.c.a.z.a.g0
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof f.e.c.a.z.a.b1
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof f.e.c.a.z.a.b0.i
                if (r1 == 0) goto L_0x0024
                f.e.c.a.z.a.b0$i r0 = (f.e.c.a.z.a.b0.i) r0
                f.e.c.a.z.a.b0$i r6 = r0.b(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                f.e.c.a.z.a.s1.O(r3, r4, r0)
                goto L_0x007a
            L_0x002d:
                java.lang.Class<?> r1 = c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
            L_0x0046:
                f.e.c.a.z.a.s1.O(r3, r4, r1)
                r0 = r1
                goto L_0x007a
            L_0x004b:
                boolean r1 = r0 instanceof f.e.c.a.z.a.r1
                if (r1 == 0) goto L_0x005f
                f.e.c.a.z.a.g0 r1 = new f.e.c.a.z.a.g0
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                f.e.c.a.z.a.r1 r0 = (f.e.c.a.z.a.r1) r0
                r1.addAll(r0)
                goto L_0x0046
            L_0x005f:
                boolean r1 = r0 instanceof f.e.c.a.z.a.b1
                if (r1 == 0) goto L_0x007a
                boolean r1 = r0 instanceof f.e.c.a.z.a.b0.i
                if (r1 == 0) goto L_0x007a
                r1 = r0
                f.e.c.a.z.a.b0$i r1 = (f.e.c.a.z.a.b0.i) r1
                boolean r2 = r1.g()
                if (r2 != 0) goto L_0x007a
                int r0 = r0.size()
                int r0 = r0 + r6
                f.e.c.a.z.a.b0$i r0 = r1.b(r0)
                goto L_0x0029
            L_0x007a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.z.a.i0.b.g(java.lang.Object, long, int):java.util.List");
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j2) {
            Object obj2;
            List list = (List) s1.A(obj, j2);
            if (list instanceof h0) {
                obj2 = ((h0) list).d();
            } else if (!c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof b1) || !(list instanceof b0.i)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    b0.i iVar = (b0.i) list;
                    if (iVar.g()) {
                        iVar.a();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            s1.O(obj, j2, obj2);
        }

        /* access modifiers changed from: package-private */
        public <E> void d(Object obj, Object obj2, long j2) {
            List f2 = f(obj2, j2);
            List g2 = g(obj, j2, f2.size());
            int size = g2.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                g2.addAll(f2);
            }
            if (size > 0) {
                f2 = g2;
            }
            s1.O(obj, j2, f2);
        }

        /* access modifiers changed from: package-private */
        public <L> List<L> e(Object obj, long j2) {
            return g(obj, j2, 10);
        }
    }

    private static final class c extends i0 {
        private c() {
            super();
        }

        static <E> b0.i<E> f(Object obj, long j2) {
            return (b0.i) s1.A(obj, j2);
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j2) {
            f(obj, j2).a();
        }

        /* access modifiers changed from: package-private */
        public <E> void d(Object obj, Object obj2, long j2) {
            b0.i f2 = f(obj, j2);
            b0.i f3 = f(obj2, j2);
            int size = f2.size();
            int size2 = f3.size();
            if (size > 0 && size2 > 0) {
                if (!f2.g()) {
                    f2 = f2.b(size2 + size);
                }
                f2.addAll(f3);
            }
            if (size > 0) {
                f3 = f2;
            }
            s1.O(obj, j2, f3);
        }

        /* access modifiers changed from: package-private */
        public <L> List<L> e(Object obj, long j2) {
            b0.i f2 = f(obj, j2);
            if (f2.g()) {
                return f2;
            }
            int size = f2.size();
            b0.i b = f2.b(size == 0 ? 10 : size * 2);
            s1.O(obj, j2, b);
            return b;
        }
    }

    private i0() {
    }

    static i0 a() {
        return a;
    }

    static i0 b() {
        return b;
    }

    /* access modifiers changed from: package-private */
    public abstract void c(Object obj, long j2);

    /* access modifiers changed from: package-private */
    public abstract <L> void d(Object obj, Object obj2, long j2);

    /* access modifiers changed from: package-private */
    public abstract <L> List<L> e(Object obj, long j2);
}
