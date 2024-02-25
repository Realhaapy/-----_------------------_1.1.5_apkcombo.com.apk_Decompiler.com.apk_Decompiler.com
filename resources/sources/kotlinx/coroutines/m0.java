package kotlinx.coroutines;

import kotlinx.coroutines.l2.b;
import m.k;
import m.v.d;
import m.v.f;
import m.y.c.l;
import m.y.c.p;

public enum m0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;

        static {
            int[] iArr = new int[m0.values().length];
            iArr[m0.DEFAULT.ordinal()] = 1;
            iArr[m0.ATOMIC.ordinal()] = 2;
            iArr[m0.UNDISPATCHED.ordinal()] = 3;
            iArr[m0.LAZY.ordinal()] = 4;
            a = iArr;
        }
    }

    public final <R, T> void c(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r2, d<? super T> dVar) {
        int i2 = a.a[ordinal()];
        if (i2 == 1) {
            kotlinx.coroutines.l2.a.e(pVar, r2, dVar, (l) null, 4, (Object) null);
        } else if (i2 == 2) {
            f.a(pVar, r2, dVar);
        } else if (i2 == 3) {
            b.a(pVar, r2, dVar);
        } else if (i2 != 4) {
            throw new k();
        }
    }

    public final boolean d() {
        return this == LAZY;
    }
}
