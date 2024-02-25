package kotlinx.coroutines;

import kotlinx.coroutines.m2.b;
import m.v.d;
import m.v.e;
import m.v.g;

public final class e0 {
    private static final boolean a;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r0.equals("on") != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r0.equals("") != false) goto L_0x0053;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.internal.a0.d(r0)
            if (r0 == 0) goto L_0x0053
            int r1 = r0.hashCode()
            if (r1 == 0) goto L_0x002a
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L_0x0021
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L_0x0033
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0054
        L_0x0021:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            goto L_0x0053
        L_0x002a:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            goto L_0x0053
        L_0x0033:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0053:
            r0 = 1
        L_0x0054:
            a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e0.<clinit>():void");
    }

    public static final f0 a() {
        return a ? b.f4905k : v.f4953f;
    }

    public static final String b(g gVar) {
        i0 i0Var;
        String T;
        if (!o0.c() || (i0Var = (i0) gVar.get(i0.f4798f)) == null) {
            return null;
        }
        j0 j0Var = (j0) gVar.get(j0.f4833f);
        String str = "coroutine";
        if (!(j0Var == null || (T = j0Var.T()) == null)) {
            str = T;
        }
        return str + '#' + i0Var.T();
    }

    public static final g c(k0 k0Var, g gVar) {
        g plus = k0Var.e().plus(gVar);
        g plus2 = o0.c() ? plus.plus(new i0(o0.b().incrementAndGet())) : plus;
        return (plus == v0.a() || plus.get(e.b) != null) ? plus2 : plus2.plus(v0.a());
    }

    public static final g2<?> d(m.v.j.a.e eVar) {
        while (!(eVar instanceof r0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof g2) {
                return (g2) eVar;
            }
        }
        return null;
    }

    public static final g2<?> e(d<?> dVar, g gVar, Object obj) {
        if (!(dVar instanceof m.v.j.a.e)) {
            return null;
        }
        if (!(gVar.get(h2.f4797e) != null)) {
            return null;
        }
        g2<?> d2 = d((m.v.j.a.e) dVar);
        if (d2 != null) {
            d2.y0(gVar, obj);
        }
        return d2;
    }
}
