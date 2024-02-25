package r.b.a.x;

import r.b.a.c;
import r.b.a.w.d;

public final class g {

    private static final class b implements f {

        /* renamed from: e  reason: collision with root package name */
        private final int f5785e;

        /* renamed from: f  reason: collision with root package name */
        private final int f5786f;

        private b(int i2, c cVar) {
            d.i(cVar, "dayOfWeek");
            this.f5785e = i2;
            this.f5786f = cVar.getValue();
        }

        public d t(d dVar) {
            int l2 = dVar.l(a.DAY_OF_WEEK);
            int i2 = this.f5785e;
            if (i2 < 2 && l2 == this.f5786f) {
                return dVar;
            }
            if ((i2 & 1) == 0) {
                int i3 = l2 - this.f5786f;
                return dVar.s((long) (i3 >= 0 ? 7 - i3 : -i3), b.DAYS);
            }
            int i4 = this.f5786f - l2;
            return dVar.m((long) (i4 >= 0 ? 7 - i4 : -i4), b.DAYS);
        }
    }

    public static f a(c cVar) {
        return new b(0, cVar);
    }

    public static f b(c cVar) {
        return new b(1, cVar);
    }
}
