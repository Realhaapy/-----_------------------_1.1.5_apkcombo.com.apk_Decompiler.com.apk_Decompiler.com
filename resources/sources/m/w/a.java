package m.w;

import java.lang.reflect.Method;
import m.y.d.l;
import m.z.b;
import m.z.c;

public class a {

    /* renamed from: m.w.a$a  reason: collision with other inner class name */
    private static final class C0146a {
        public static final Method a;

        /* JADX WARNING: Removed duplicated region for block: B:14:0x003a A[EDGE_INSN: B:14:0x003a->B:10:0x003a ?: BREAK  , SYNTHETIC] */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                m.y.d.l.c(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x000e:
                if (r4 >= r2) goto L_0x0039
                r5 = r1[r4]
                int r4 = r4 + 1
                java.lang.String r6 = r5.getName()
                java.lang.String r7 = "addSuppressed"
                boolean r6 = m.y.d.l.a(r6, r7)
                if (r6 == 0) goto L_0x0035
                java.lang.Class[] r6 = r5.getParameterTypes()
                java.lang.String r7 = "it.parameterTypes"
                m.y.d.l.c(r6, r7)
                java.lang.Object r6 = m.t.f.n(r6)
                boolean r6 = m.y.d.l.a(r6, r0)
                if (r6 == 0) goto L_0x0035
                r6 = 1
                goto L_0x0036
            L_0x0035:
                r6 = 0
            L_0x0036:
                if (r6 == 0) goto L_0x000e
                goto L_0x003a
            L_0x0039:
                r5 = 0
            L_0x003a:
                a = r5
                int r0 = r1.length
            L_0x003d:
                if (r3 >= r0) goto L_0x004f
                r2 = r1[r3]
                int r3 = r3 + 1
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = m.y.d.l.a(r2, r4)
                if (r2 == 0) goto L_0x003d
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m.w.a.C0146a.<clinit>():void");
        }
    }

    public void a(Throwable th, Throwable th2) {
        l.d(th, "cause");
        l.d(th2, "exception");
        Method method = C0146a.a;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    public c b() {
        return new b();
    }
}
