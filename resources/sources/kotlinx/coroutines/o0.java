package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;

public final class o0 {
    private static final boolean a = false;
    private static final boolean b;
    private static final boolean c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicLong f4934d = new AtomicLong(0);

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r0.equals("auto") != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r0.equals("on") != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r0.equals("") != false) goto L_0x0042;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = kotlinx.coroutines.internal.a0.d(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0064
            int r3 = r0.hashCode()
            if (r3 == 0) goto L_0x003a
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L_0x0031
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L_0x0027
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L_0x0044
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0044
            goto L_0x0064
        L_0x0027:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0044
            r0 = 0
            goto L_0x0068
        L_0x0031:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0044
            goto L_0x0042
        L_0x003a:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0044
        L_0x0042:
            r0 = 1
            goto L_0x0068
        L_0x0044:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0064:
            boolean r0 = a()
        L_0x0068:
            b = r0
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = kotlinx.coroutines.internal.a0.e(r0, r2)
            if (r0 == 0) goto L_0x0075
            r1 = 1
        L_0x0075:
            c = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            f4934d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.o0.<clinit>():void");
    }

    public static final boolean a() {
        return a;
    }

    public static final AtomicLong b() {
        return f4934d;
    }

    public static final boolean c() {
        return b;
    }

    public static final boolean d() {
        return c;
    }
}
