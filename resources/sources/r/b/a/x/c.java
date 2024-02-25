package r.b.a.x;

import java.util.Map;
import r.b.a.d;
import r.b.a.f;
import r.b.a.u.h;
import r.b.a.u.m;
import r.b.a.v.i;

public final class c {
    public static final i a = b.QUARTER_OF_YEAR;
    public static final i b = b.WEEK_OF_WEEK_BASED_YEAR;
    public static final i c = b.WEEK_BASED_YEAR;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                r.b.a.x.c$c[] r0 = r.b.a.x.c.C0158c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                r.b.a.x.c$c r1 = r.b.a.x.c.C0158c.WEEK_BASED_YEARS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                r.b.a.x.c$c r1 = r.b.a.x.c.C0158c.QUARTER_YEARS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.x.c.a.<clinit>():void");
        }
    }

    private enum b implements i {
        DAY_OF_QUARTER {
            public boolean c(e eVar) {
                return eVar.j(a.DAY_OF_YEAR) && eVar.j(a.MONTH_OF_YEAR) && eVar.j(a.YEAR) && b.y(eVar);
            }

            public <R extends d> R d(R r2, long j2) {
                long f2 = f(r2);
                k().b(j2, this);
                a aVar = a.DAY_OF_YEAR;
                return r2.k(aVar, r2.n(aVar) + (j2 - f2));
            }

            public long f(e eVar) {
                if (eVar.j(this)) {
                    return (long) (eVar.l(a.DAY_OF_YEAR) - b.f5779i[((eVar.l(a.MONTH_OF_YEAR) - 1) / 3) + (m.f5618g.z(eVar.n(a.YEAR)) ? 4 : 0)]);
                }
                throw new m("Unsupported field: DayOfQuarter");
            }

            public n h(e eVar) {
                if (eVar.j(this)) {
                    long n2 = eVar.n(b.QUARTER_OF_YEAR);
                    if (n2 != 1) {
                        return n2 == 2 ? n.i(1, 91) : (n2 == 3 || n2 == 4) ? n.i(1, 92) : k();
                    }
                    return m.f5618g.z(eVar.n(a.YEAR)) ? n.i(1, 91) : n.i(1, 90);
                }
                throw new m("Unsupported field: DayOfQuarter");
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0073, code lost:
                if (r2 == 2) goto L_0x0075;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public r.b.a.x.e j(java.util.Map<r.b.a.x.i, java.lang.Long> r13, r.b.a.x.e r14, r.b.a.v.i r15) {
                /*
                    r12 = this;
                    r.b.a.x.a r14 = r.b.a.x.a.YEAR
                    java.lang.Object r0 = r13.get(r14)
                    java.lang.Long r0 = (java.lang.Long) r0
                    r.b.a.x.c$b r1 = r.b.a.x.c.b.QUARTER_OF_YEAR
                    java.lang.Object r2 = r13.get(r1)
                    java.lang.Long r2 = (java.lang.Long) r2
                    if (r0 == 0) goto L_0x009b
                    if (r2 != 0) goto L_0x0016
                    goto L_0x009b
                L_0x0016:
                    long r3 = r0.longValue()
                    int r0 = r14.l(r3)
                    r.b.a.x.c$b r3 = r.b.a.x.c.b.DAY_OF_QUARTER
                    java.lang.Object r3 = r13.get(r3)
                    java.lang.Long r3 = (java.lang.Long) r3
                    long r3 = r3.longValue()
                    r.b.a.v.i r5 = r.b.a.v.i.LENIENT
                    r6 = 3
                    r7 = 1
                    r9 = 1
                    if (r15 != r5) goto L_0x004f
                    long r10 = r2.longValue()
                    r.b.a.f r15 = r.b.a.f.Z(r0, r9, r9)
                    long r9 = r.b.a.w.d.o(r10, r7)
                    long r5 = r.b.a.w.d.l(r9, r6)
                    r.b.a.f r15 = r15.g0(r5)
                    long r2 = r.b.a.w.d.o(r3, r7)
                    r.b.a.f r15 = r15.f0(r2)
                    goto L_0x0091
                L_0x004f:
                    r.b.a.x.n r5 = r1.k()
                    long r10 = r2.longValue()
                    int r2 = r5.a(r10, r1)
                    r.b.a.v.i r5 = r.b.a.v.i.STRICT
                    if (r15 != r5) goto L_0x007d
                    r15 = 92
                    r5 = 91
                    if (r2 != r9) goto L_0x0072
                    r.b.a.u.m r15 = r.b.a.u.m.f5618g
                    long r10 = (long) r0
                    boolean r15 = r15.z(r10)
                    if (r15 == 0) goto L_0x006f
                    goto L_0x0075
                L_0x006f:
                    r15 = 90
                    goto L_0x0077
                L_0x0072:
                    r10 = 2
                    if (r2 != r10) goto L_0x0077
                L_0x0075:
                    r15 = 91
                L_0x0077:
                    long r10 = (long) r15
                    r.b.a.x.n r15 = r.b.a.x.n.i(r7, r10)
                    goto L_0x0081
                L_0x007d:
                    r.b.a.x.n r15 = r12.k()
                L_0x0081:
                    r15.b(r3, r12)
                    int r2 = r2 - r9
                    int r2 = r2 * 3
                    int r2 = r2 + r9
                    r.b.a.f r15 = r.b.a.f.Z(r0, r2, r9)
                    long r3 = r3 - r7
                    r.b.a.f r15 = r15.f0(r3)
                L_0x0091:
                    r13.remove(r12)
                    r13.remove(r14)
                    r13.remove(r1)
                    return r15
                L_0x009b:
                    r13 = 0
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: r.b.a.x.c.b.a.j(java.util.Map, r.b.a.x.e, r.b.a.v.i):r.b.a.x.e");
            }

            public n k() {
                return n.j(1, 90, 92);
            }

            public String toString() {
                return "DayOfQuarter";
            }
        },
        QUARTER_OF_YEAR {
            public boolean c(e eVar) {
                return eVar.j(a.MONTH_OF_YEAR) && b.y(eVar);
            }

            public <R extends d> R d(R r2, long j2) {
                long f2 = f(r2);
                k().b(j2, this);
                a aVar = a.MONTH_OF_YEAR;
                return r2.k(aVar, r2.n(aVar) + ((j2 - f2) * 3));
            }

            public long f(e eVar) {
                if (eVar.j(this)) {
                    return (eVar.n(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new m("Unsupported field: QuarterOfYear");
            }

            public n h(e eVar) {
                return k();
            }

            public n k() {
                return n.i(1, 4);
            }

            public String toString() {
                return "QuarterOfYear";
            }
        },
        WEEK_OF_WEEK_BASED_YEAR {
            public boolean c(e eVar) {
                return eVar.j(a.EPOCH_DAY) && b.y(eVar);
            }

            public <R extends d> R d(R r2, long j2) {
                k().b(j2, this);
                return r2.s(r.b.a.w.d.o(j2, f(r2)), b.WEEKS);
            }

            public long f(e eVar) {
                if (eVar.j(this)) {
                    return (long) b.u(f.J(eVar));
                }
                throw new m("Unsupported field: WeekOfWeekBasedYear");
            }

            public n h(e eVar) {
                if (eVar.j(this)) {
                    return b.x(f.J(eVar));
                }
                throw new m("Unsupported field: WeekOfWeekBasedYear");
            }

            public e j(Map<i, Long> map, e eVar, i iVar) {
                b bVar;
                f fVar;
                Map<i, Long> map2 = map;
                i iVar2 = iVar;
                b bVar2 = b.WEEK_BASED_YEAR;
                Long l2 = map2.get(bVar2);
                a aVar = a.DAY_OF_WEEK;
                Long l3 = map2.get(aVar);
                if (l2 == null || l3 == null) {
                    return null;
                }
                int a = bVar2.k().a(l2.longValue(), bVar2);
                long longValue = map2.get(b.WEEK_OF_WEEK_BASED_YEAR).longValue();
                if (iVar2 == i.LENIENT) {
                    long longValue2 = l3.longValue();
                    long j2 = 0;
                    if (longValue2 > 7) {
                        long j3 = longValue2 - 1;
                        j2 = j3 / 7;
                        longValue2 = (j3 % 7) + 1;
                    } else if (longValue2 < 1) {
                        j2 = (longValue2 / 7) - 1;
                        longValue2 = (longValue2 % 7) + 7;
                    }
                    bVar = bVar2;
                    fVar = f.Z(a, 1, 4).h0(longValue - 1).h0(j2).k(aVar, longValue2);
                } else {
                    bVar = bVar2;
                    int l4 = aVar.l(l3.longValue());
                    (iVar2 == i.STRICT ? b.x(f.Z(a, 1, 4)) : k()).b(longValue, this);
                    fVar = f.Z(a, 1, 4).h0(longValue - 1).k(aVar, (long) l4);
                }
                map2.remove(this);
                map2.remove(bVar);
                map2.remove(aVar);
                return fVar;
            }

            public n k() {
                return n.j(1, 52, 53);
            }

            public String toString() {
                return "WeekOfWeekBasedYear";
            }
        },
        WEEK_BASED_YEAR {
            public boolean c(e eVar) {
                return eVar.j(a.EPOCH_DAY) && b.y(eVar);
            }

            public <R extends d> R d(R r2, long j2) {
                if (c(r2)) {
                    int a = k().a(j2, b.WEEK_BASED_YEAR);
                    f J = f.J(r2);
                    a aVar = a.DAY_OF_WEEK;
                    int l2 = J.l(aVar);
                    int o2 = b.u(J);
                    if (o2 == 53 && b.w(a) == 52) {
                        o2 = 52;
                    }
                    f Z = f.Z(a, 1, 4);
                    return r2.h(Z.f0((long) ((l2 - Z.l(aVar)) + ((o2 - 1) * 7))));
                }
                throw new m("Unsupported field: WeekBasedYear");
            }

            public long f(e eVar) {
                if (eVar.j(this)) {
                    return (long) b.v(f.J(eVar));
                }
                throw new m("Unsupported field: WeekBasedYear");
            }

            public n h(e eVar) {
                return a.YEAR.k();
            }

            public n k() {
                return a.YEAR.k();
            }

            public String toString() {
                return "WeekBasedYear";
            }
        };
        
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public static final int[] f5779i = null;

        static {
            f5779i = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        /* access modifiers changed from: private */
        public static int u(f fVar) {
            int ordinal = fVar.N().ordinal();
            int O = fVar.O() - 1;
            int i2 = (3 - ordinal) + O;
            int i3 = (i2 - ((i2 / 7) * 7)) - 3;
            if (i3 < -3) {
                i3 += 7;
            }
            if (O < i3) {
                return (int) x(fVar.o0(180).Y(1)).c();
            }
            int i4 = ((O - i3) / 7) + 1;
            if (i4 == 53) {
                if (!(i3 == -3 || (i3 == -2 && fVar.T()))) {
                    return 1;
                }
            }
            return i4;
        }

        /* access modifiers changed from: private */
        public static int v(f fVar) {
            int S = fVar.S();
            int O = fVar.O();
            if (O <= 3) {
                return O - fVar.N().ordinal() < -2 ? S - 1 : S;
            }
            if (O < 363) {
                return S;
            }
            return ((O - 363) - (fVar.T() ? 1 : 0)) - fVar.N().ordinal() >= 0 ? S + 1 : S;
        }

        /* access modifiers changed from: private */
        public static int w(int i2) {
            f Z = f.Z(i2, 1, 1);
            if (Z.N() != r.b.a.c.THURSDAY) {
                return (Z.N() != r.b.a.c.WEDNESDAY || !Z.T()) ? 52 : 53;
            }
            return 53;
        }

        /* access modifiers changed from: private */
        public static n x(f fVar) {
            return n.i(1, (long) w(v(fVar)));
        }

        /* access modifiers changed from: private */
        public static boolean y(e eVar) {
            return h.j(eVar).equals(m.f5618g);
        }

        public boolean a() {
            return true;
        }

        public boolean g() {
            return false;
        }

        public e j(Map<i, Long> map, e eVar, i iVar) {
            return null;
        }
    }

    /* renamed from: r.b.a.x.c$c  reason: collision with other inner class name */
    private enum C0158c implements l {
        WEEK_BASED_YEARS("WeekBasedYears", d.h(31556952)),
        QUARTER_YEARS("QuarterYears", d.h(7889238));
        

        /* renamed from: e  reason: collision with root package name */
        private final String f5784e;

        private C0158c(String str, d dVar) {
            this.f5784e = str;
        }

        public boolean a() {
            return true;
        }

        public <R extends d> R c(R r2, long j2) {
            int i2 = a.a[ordinal()];
            if (i2 == 1) {
                i iVar = c.c;
                return r2.k(iVar, r.b.a.w.d.k((long) r2.l(iVar), j2));
            } else if (i2 == 2) {
                return r2.s(j2 / 256, b.YEARS).s((j2 % 256) * 3, b.MONTHS);
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        public String toString() {
            return this.f5784e;
        }
    }

    static {
        b bVar = b.DAY_OF_QUARTER;
        C0158c cVar = C0158c.WEEK_BASED_YEARS;
        C0158c cVar2 = C0158c.QUARTER_YEARS;
    }
}
