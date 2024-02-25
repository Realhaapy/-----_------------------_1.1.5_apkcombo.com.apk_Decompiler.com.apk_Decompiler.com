package f.e.c.a;

import f.e.c.a.y.a0;
import f.e.c.a.y.i0;
import f.e.c.a.z.a.i;

public final class g {
    private final a0 a;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        static {
            /*
                f.e.c.a.g$b[] r0 = f.e.c.a.g.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                f.e.c.a.g$b r2 = f.e.c.a.g.b.TINK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                f.e.c.a.g$b r3 = f.e.c.a.g.b.LEGACY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.e.c.a.g$b r4 = f.e.c.a.g.b.RAW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0033 }
                f.e.c.a.g$b r5 = f.e.c.a.g.b.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                f.e.c.a.y.i0[] r4 = f.e.c.a.y.i0.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                a = r4
                f.e.c.a.y.i0 r5 = f.e.c.a.y.i0.TINK     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x004e }
                f.e.c.a.y.i0 r4 = f.e.c.a.y.i0.LEGACY     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0058 }
                f.e.c.a.y.i0 r1 = f.e.c.a.y.i0.RAW     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0062 }
                f.e.c.a.y.i0 r1 = f.e.c.a.y.i0.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.g.a.<clinit>():void");
        }
    }

    public enum b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    private g(a0 a0Var) {
        this.a = a0Var;
    }

    public static g a(String str, byte[] bArr, b bVar) {
        a0.b V = a0.V();
        V.A(str);
        V.B(i.k(bArr));
        V.z(c(bVar));
        return new g((a0) V.a());
    }

    private static i0 c(b bVar) {
        int i2 = a.b[bVar.ordinal()];
        if (i2 == 1) {
            return i0.TINK;
        }
        if (i2 == 2) {
            return i0.LEGACY;
        }
        if (i2 == 3) {
            return i0.RAW;
        }
        if (i2 == 4) {
            return i0.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    /* access modifiers changed from: package-private */
    public a0 b() {
        return this.a;
    }
}
