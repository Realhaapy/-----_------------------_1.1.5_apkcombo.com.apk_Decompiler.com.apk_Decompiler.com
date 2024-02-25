package f.e.c.a;

import f.e.c.a.y.c0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class c {
    public static final byte[] a = new byte[0];

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                f.e.c.a.y.i0[] r0 = f.e.c.a.y.i0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                f.e.c.a.y.i0 r1 = f.e.c.a.y.i0.LEGACY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.e.c.a.y.i0 r1 = f.e.c.a.y.i0.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.e.c.a.y.i0 r1 = f.e.c.a.y.i0.TINK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                f.e.c.a.y.i0 r1 = f.e.c.a.y.i0.RAW     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.c.a.<clinit>():void");
        }
    }

    public static byte[] a(c0.c cVar) {
        ByteBuffer put;
        int i2 = a.a[cVar.U().ordinal()];
        if (i2 == 1 || i2 == 2) {
            put = ByteBuffer.allocate(5).put((byte) 0);
        } else if (i2 == 3) {
            put = ByteBuffer.allocate(5).put((byte) 1);
        } else if (i2 == 4) {
            return a;
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return put.putInt(cVar.T()).array();
    }
}
