package r.b.a.v;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import r.b.a.q;
import r.b.a.r;
import r.b.a.v.k;

public final class c {

    /* renamed from: h  reason: collision with root package name */
    private static final r.b.a.x.k<q> f5670h = new a();

    /* renamed from: i  reason: collision with root package name */
    private static final Map<Character, r.b.a.x.i> f5671i;

    /* renamed from: j  reason: collision with root package name */
    static final Comparator<String> f5672j = new C0155c();
    private c a;
    private final c b;
    private final List<g> c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f5673d;

    /* renamed from: e  reason: collision with root package name */
    private int f5674e;

    /* renamed from: f  reason: collision with root package name */
    private char f5675f;

    /* renamed from: g  reason: collision with root package name */
    private int f5676g;

    class a implements r.b.a.x.k<q> {
        a() {
        }

        /* renamed from: b */
        public q a(r.b.a.x.e eVar) {
            q qVar = (q) eVar.f(r.b.a.x.j.g());
            if (qVar == null || (qVar instanceof r)) {
                return null;
            }
            return qVar;
        }
    }

    class b extends g {
        final /* synthetic */ k.b a;

        b(c cVar, k.b bVar) {
            this.a = bVar;
        }

        public String a(r.b.a.x.i iVar, long j2, l lVar, Locale locale) {
            return this.a.a(j2, lVar);
        }

        public Iterator<Map.Entry<String, Long>> b(r.b.a.x.i iVar, l lVar, Locale locale) {
            return this.a.b(lVar);
        }
    }

    /* renamed from: r.b.a.v.c$c  reason: collision with other inner class name */
    class C0155c implements Comparator<String> {
        C0155c() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.length() == str2.length() ? str.compareTo(str2) : str.length() - str2.length();
        }
    }

    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                r.b.a.v.j[] r0 = r.b.a.v.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                r.b.a.v.j r1 = r.b.a.v.j.EXCEEDS_PAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                r.b.a.v.j r1 = r.b.a.v.j.ALWAYS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r.b.a.v.j r1 = r.b.a.v.j.NORMAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                r.b.a.v.j r1 = r.b.a.v.j.NOT_NEGATIVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.v.c.d.<clinit>():void");
        }
    }

    static final class e implements g {

        /* renamed from: e  reason: collision with root package name */
        private final char f5677e;

        e(char c) {
            this.f5677e = c;
        }

        public boolean a(f fVar, StringBuilder sb) {
            sb.append(this.f5677e);
            return true;
        }

        public int c(d dVar, CharSequence charSequence, int i2) {
            if (i2 == charSequence.length()) {
                return ~i2;
            }
            return !dVar.b(this.f5677e, charSequence.charAt(i2)) ? ~i2 : i2 + 1;
        }

        public String toString() {
            if (this.f5677e == '\'') {
                return "''";
            }
            return "'" + this.f5677e + "'";
        }
    }

    static final class f implements g {

        /* renamed from: e  reason: collision with root package name */
        private final g[] f5678e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f5679f;

        f(List<g> list, boolean z) {
            this((g[]) list.toArray(new g[list.size()]), z);
        }

        f(g[] gVarArr, boolean z) {
            this.f5678e = gVarArr;
            this.f5679f = z;
        }

        public boolean a(f fVar, StringBuilder sb) {
            int length = sb.length();
            if (this.f5679f) {
                fVar.h();
            }
            try {
                for (g a : this.f5678e) {
                    if (!a.a(fVar, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                if (this.f5679f) {
                    fVar.b();
                }
                return true;
            } finally {
                if (this.f5679f) {
                    fVar.b();
                }
            }
        }

        public f b(boolean z) {
            return z == this.f5679f ? this : new f(this.f5678e, z);
        }

        public int c(d dVar, CharSequence charSequence, int i2) {
            if (this.f5679f) {
                dVar.r();
                int i3 = i2;
                for (g c : this.f5678e) {
                    i3 = c.c(dVar, charSequence, i3);
                    if (i3 < 0) {
                        dVar.f(false);
                        return i2;
                    }
                }
                dVar.f(true);
                return i3;
            }
            for (g c2 : this.f5678e) {
                i2 = c2.c(dVar, charSequence, i2);
                if (i2 < 0) {
                    break;
                }
            }
            return i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f5678e != null) {
                sb.append(this.f5679f ? "[" : "(");
                for (g append : this.f5678e) {
                    sb.append(append);
                }
                sb.append(this.f5679f ? "]" : ")");
            }
            return sb.toString();
        }
    }

    interface g {
        boolean a(f fVar, StringBuilder sb);

        int c(d dVar, CharSequence charSequence, int i2);
    }

    static final class h implements g {

        /* renamed from: e  reason: collision with root package name */
        private final r.b.a.x.i f5680e;

        /* renamed from: f  reason: collision with root package name */
        private final int f5681f;

        /* renamed from: g  reason: collision with root package name */
        private final int f5682g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f5683h;

        h(r.b.a.x.i iVar, int i2, int i3, boolean z) {
            r.b.a.w.d.i(iVar, "field");
            if (!iVar.k().e()) {
                throw new IllegalArgumentException("Field must have a fixed set of values: " + iVar);
            } else if (i2 < 0 || i2 > 9) {
                throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i2);
            } else if (i3 < 1 || i3 > 9) {
                throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i3);
            } else if (i3 >= i2) {
                this.f5680e = iVar;
                this.f5681f = i2;
                this.f5682g = i3;
                this.f5683h = z;
            } else {
                throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
            }
        }

        private long b(BigDecimal bigDecimal) {
            r.b.a.x.n k2 = this.f5680e.k();
            BigDecimal valueOf = BigDecimal.valueOf(k2.d());
            return bigDecimal.multiply(BigDecimal.valueOf(k2.c()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact();
        }

        private BigDecimal d(long j2) {
            r.b.a.x.n k2 = this.f5680e.k();
            k2.b(j2, this.f5680e);
            BigDecimal valueOf = BigDecimal.valueOf(k2.d());
            BigDecimal divide = BigDecimal.valueOf(j2).subtract(valueOf).divide(BigDecimal.valueOf(k2.c()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            return divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        }

        public boolean a(f fVar, StringBuilder sb) {
            Long f2 = fVar.f(this.f5680e);
            if (f2 == null) {
                return false;
            }
            h d2 = fVar.d();
            BigDecimal d3 = d(f2.longValue());
            if (d3.scale() != 0) {
                String a = d2.a(d3.setScale(Math.min(Math.max(d3.scale(), this.f5681f), this.f5682g), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.f5683h) {
                    sb.append(d2.c());
                }
                sb.append(a);
                return true;
            } else if (this.f5681f <= 0) {
                return true;
            } else {
                if (this.f5683h) {
                    sb.append(d2.c());
                }
                for (int i2 = 0; i2 < this.f5681f; i2++) {
                    sb.append(d2.f());
                }
                return true;
            }
        }

        public int c(d dVar, CharSequence charSequence, int i2) {
            int i3;
            int i4 = 0;
            int i5 = dVar.l() ? this.f5681f : 0;
            int i6 = dVar.l() ? this.f5682g : 9;
            int length = charSequence.length();
            if (i2 == length) {
                return i5 > 0 ? ~i2 : i2;
            }
            if (this.f5683h) {
                if (charSequence.charAt(i2) != dVar.j().c()) {
                    return i5 > 0 ? ~i2 : i2;
                }
                i2++;
            }
            int i7 = i2;
            int i8 = i5 + i7;
            if (i8 > length) {
                return ~i7;
            }
            int min = Math.min(i6 + i7, length);
            int i9 = i7;
            while (true) {
                if (i9 >= min) {
                    i3 = i9;
                    break;
                }
                int i10 = i9 + 1;
                int b = dVar.j().b(charSequence.charAt(i9));
                if (b >= 0) {
                    i4 = (i4 * 10) + b;
                    i9 = i10;
                } else if (i10 < i8) {
                    return ~i7;
                } else {
                    i3 = i10 - 1;
                }
            }
            return dVar.o(this.f5680e, b(new BigDecimal(i4).movePointLeft(i3 - i7)), i7, i3);
        }

        public String toString() {
            String str = this.f5683h ? ",DecimalPoint" : "";
            return "Fraction(" + this.f5680e + "," + this.f5681f + "," + this.f5682g + str + ")";
        }
    }

    static final class i implements g {

        /* renamed from: e  reason: collision with root package name */
        private final int f5684e;

        i(int i2) {
            this.f5684e = i2;
        }

        public boolean a(f fVar, StringBuilder sb) {
            int i2;
            StringBuilder sb2 = sb;
            Long f2 = fVar.f(r.b.a.x.a.INSTANT_SECONDS);
            Long l2 = 0L;
            r.b.a.x.e e2 = fVar.e();
            r.b.a.x.a aVar = r.b.a.x.a.NANO_OF_SECOND;
            if (e2.j(aVar)) {
                l2 = Long.valueOf(fVar.e().n(aVar));
            }
            int i3 = 0;
            if (f2 == null) {
                return false;
            }
            long longValue = f2.longValue();
            int l3 = aVar.l(l2.longValue());
            if (longValue >= -62167219200L) {
                long j2 = (longValue - 315569520000L) + 62167219200L;
                long e3 = r.b.a.w.d.e(j2, 315569520000L) + 1;
                r.b.a.g X = r.b.a.g.X(r.b.a.w.d.h(j2, 315569520000L) - 62167219200L, 0, r.f5578i);
                if (e3 > 0) {
                    sb2.append('+');
                    sb2.append(e3);
                }
                sb2.append(X);
                if (X.S() == 0) {
                    sb2.append(":00");
                }
            } else {
                long j3 = longValue + 62167219200L;
                long j4 = j3 / 315569520000L;
                long j5 = j3 % 315569520000L;
                r.b.a.g X2 = r.b.a.g.X(j5 - 62167219200L, 0, r.f5578i);
                int length = sb.length();
                sb2.append(X2);
                if (X2.S() == 0) {
                    sb2.append(":00");
                }
                if (j4 < 0) {
                    if (X2.T() == -10000) {
                        sb2.replace(length, length + 2, Long.toString(j4 - 1));
                    } else {
                        if (j5 != 0) {
                            length++;
                            j4 = Math.abs(j4);
                        }
                        sb2.insert(length, j4);
                    }
                }
            }
            int i4 = this.f5684e;
            if (i4 == -2) {
                if (l3 != 0) {
                    sb2.append('.');
                    int i5 = 1000000;
                    if (l3 % 1000000 == 0) {
                        i2 = (l3 / 1000000) + 1000;
                    } else {
                        if (l3 % 1000 == 0) {
                            l3 /= 1000;
                        } else {
                            i5 = 1000000000;
                        }
                        i2 = l3 + i5;
                    }
                    sb2.append(Integer.toString(i2).substring(1));
                }
            } else if (i4 > 0 || (i4 == -1 && l3 > 0)) {
                sb2.append('.');
                int i6 = 100000000;
                while (true) {
                    int i7 = this.f5684e;
                    if ((i7 != -1 || l3 <= 0) && i3 >= i7) {
                        break;
                    }
                    int i8 = l3 / i6;
                    sb2.append((char) (i8 + 48));
                    l3 -= i8 * i6;
                    i6 /= 10;
                    i3++;
                }
            }
            sb2.append('Z');
            return true;
        }

        public int c(d dVar, CharSequence charSequence, int i2) {
            int i3;
            int i4;
            int i5;
            int i6 = i2;
            d d2 = dVar.d();
            int i7 = this.f5684e;
            int i8 = i7 < 0 ? 0 : i7;
            if (i7 < 0) {
                i7 = 9;
            }
            c cVar = new c();
            cVar.a(b.f5661h);
            cVar.e('T');
            r.b.a.x.a aVar = r.b.a.x.a.HOUR_OF_DAY;
            cVar.k(aVar, 2);
            cVar.e(':');
            r.b.a.x.a aVar2 = r.b.a.x.a.MINUTE_OF_HOUR;
            cVar.k(aVar2, 2);
            cVar.e(':');
            r.b.a.x.a aVar3 = r.b.a.x.a.SECOND_OF_MINUTE;
            cVar.k(aVar3, 2);
            r.b.a.x.a aVar4 = r.b.a.x.a.NANO_OF_SECOND;
            cVar.b(aVar4, i8, i7, true);
            cVar.e('Z');
            int c = cVar.s().k(false).c(d2, charSequence, i6);
            if (c < 0) {
                return c;
            }
            long longValue = d2.i(r.b.a.x.a.YEAR).longValue();
            int intValue = d2.i(r.b.a.x.a.MONTH_OF_YEAR).intValue();
            int intValue2 = d2.i(r.b.a.x.a.DAY_OF_MONTH).intValue();
            int intValue3 = d2.i(aVar).intValue();
            int intValue4 = d2.i(aVar2).intValue();
            Long i9 = d2.i(aVar3);
            Long i10 = d2.i(aVar4);
            int intValue5 = i9 != null ? i9.intValue() : 0;
            int intValue6 = i10 != null ? i10.intValue() : 0;
            int i11 = ((int) longValue) % 10000;
            if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
                i3 = intValue5;
                i5 = 1;
                i4 = 0;
            } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
                dVar.p();
                i4 = intValue3;
                i5 = 0;
                i3 = 59;
            } else {
                i4 = intValue3;
                i3 = intValue5;
                i5 = 0;
            }
            try {
                d dVar2 = dVar;
                int i12 = i2;
                return dVar2.o(aVar4, (long) intValue6, i12, dVar2.o(r.b.a.x.a.INSTANT_SECONDS, r.b.a.w.d.m(longValue / 10000, 315569520000L) + r.b.a.g.V(i11, intValue, intValue2, i4, intValue4, i3, 0).b0((long) i5).C(r.f5578i), i12, c));
            } catch (RuntimeException unused) {
                return ~i6;
            }
        }

        public String toString() {
            return "Instant()";
        }
    }

    static class j implements g {

        /* renamed from: j  reason: collision with root package name */
        static final int[] f5685j = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        /* renamed from: e  reason: collision with root package name */
        final r.b.a.x.i f5686e;

        /* renamed from: f  reason: collision with root package name */
        final int f5687f;

        /* renamed from: g  reason: collision with root package name */
        final int f5688g;

        /* renamed from: h  reason: collision with root package name */
        final j f5689h;

        /* renamed from: i  reason: collision with root package name */
        final int f5690i;

        j(r.b.a.x.i iVar, int i2, int i3, j jVar) {
            this.f5686e = iVar;
            this.f5687f = i2;
            this.f5688g = i3;
            this.f5689h = jVar;
            this.f5690i = 0;
        }

        private j(r.b.a.x.i iVar, int i2, int i3, j jVar, int i4) {
            this.f5686e = iVar;
            this.f5687f = i2;
            this.f5688g = i3;
            this.f5689h = jVar;
            this.f5690i = i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a2 A[LOOP:0: B:30:0x0099->B:32:0x00a2, LOOP_END] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(r.b.a.v.f r12, java.lang.StringBuilder r13) {
            /*
                r11 = this;
                r.b.a.x.i r0 = r11.f5686e
                java.lang.Long r0 = r12.f(r0)
                r1 = 0
                if (r0 != 0) goto L_0x000a
                return r1
            L_0x000a:
                long r2 = r0.longValue()
                r11.b(r12, r2)
                r.b.a.v.h r12 = r12.d()
                r4 = -9223372036854775808
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L_0x001e
                java.lang.String r0 = "9223372036854775808"
                goto L_0x0026
            L_0x001e:
                long r4 = java.lang.Math.abs(r2)
                java.lang.String r0 = java.lang.Long.toString(r4)
            L_0x0026:
                int r4 = r0.length()
                int r5 = r11.f5688g
                java.lang.String r6 = " cannot be printed as the value "
                java.lang.String r7 = "Field "
                if (r4 > r5) goto L_0x00b0
                java.lang.String r0 = r12.a(r0)
                r4 = 0
                r8 = 2
                r9 = 1
                int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                int[] r4 = r.b.a.v.c.d.a
                r.b.a.v.j r5 = r11.f5689h
                int r5 = r5.ordinal()
                if (r10 < 0) goto L_0x0065
                r4 = r4[r5]
                if (r4 == r9) goto L_0x0055
                if (r4 == r8) goto L_0x004d
                goto L_0x0099
            L_0x004d:
                char r2 = r12.e()
            L_0x0051:
                r13.append(r2)
                goto L_0x0099
            L_0x0055:
                int r4 = r11.f5687f
                r5 = 19
                if (r4 >= r5) goto L_0x0099
                int[] r5 = f5685j
                r4 = r5[r4]
                long r4 = (long) r4
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x0099
                goto L_0x004d
            L_0x0065:
                r4 = r4[r5]
                if (r4 == r9) goto L_0x0094
                if (r4 == r8) goto L_0x0094
                r5 = 3
                if (r4 == r5) goto L_0x0094
                r5 = 4
                if (r4 == r5) goto L_0x0072
                goto L_0x0099
            L_0x0072:
                r.b.a.b r12 = new r.b.a.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r7)
                r.b.a.x.i r0 = r11.f5686e
                r13.append(r0)
                r13.append(r6)
                r13.append(r2)
                java.lang.String r0 = " cannot be negative according to the SignStyle"
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                throw r12
            L_0x0094:
                char r2 = r12.d()
                goto L_0x0051
            L_0x0099:
                int r2 = r11.f5687f
                int r3 = r0.length()
                int r2 = r2 - r3
                if (r1 >= r2) goto L_0x00ac
                char r2 = r12.f()
                r13.append(r2)
                int r1 = r1 + 1
                goto L_0x0099
            L_0x00ac:
                r13.append(r0)
                return r9
            L_0x00b0:
                r.b.a.b r12 = new r.b.a.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r7)
                r.b.a.x.i r0 = r11.f5686e
                r13.append(r0)
                r13.append(r6)
                r13.append(r2)
                java.lang.String r0 = " exceeds the maximum print width of "
                r13.append(r0)
                int r0 = r11.f5688g
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.v.c.j.a(r.b.a.v.f, java.lang.StringBuilder):boolean");
        }

        /* access modifiers changed from: package-private */
        public long b(f fVar, long j2) {
            return j2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:105:0x015b  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x0179  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int c(r.b.a.v.d r20, java.lang.CharSequence r21, int r22) {
            /*
                r19 = this;
                r6 = r19
                r0 = r22
                int r1 = r21.length()
                if (r0 != r1) goto L_0x000c
                int r0 = ~r0
                return r0
            L_0x000c:
                char r2 = r21.charAt(r22)
                r.b.a.v.h r3 = r20.j()
                char r3 = r3.e()
                r4 = 0
                r5 = 1
                if (r2 != r3) goto L_0x0039
                r.b.a.v.j r2 = r6.f5689h
                boolean r3 = r20.l()
                int r7 = r6.f5687f
                int r8 = r6.f5688g
                if (r7 != r8) goto L_0x002a
                r7 = 1
                goto L_0x002b
            L_0x002a:
                r7 = 0
            L_0x002b:
                boolean r2 = r2.a(r5, r3, r7)
                if (r2 != 0) goto L_0x0033
                int r0 = ~r0
                return r0
            L_0x0033:
                int r0 = r0 + 1
                r7 = r0
                r0 = 0
                r2 = 1
                goto L_0x0070
            L_0x0039:
                r.b.a.v.h r3 = r20.j()
                char r3 = r3.d()
                if (r2 != r3) goto L_0x005f
                r.b.a.v.j r2 = r6.f5689h
                boolean r3 = r20.l()
                int r7 = r6.f5687f
                int r8 = r6.f5688g
                if (r7 != r8) goto L_0x0051
                r7 = 1
                goto L_0x0052
            L_0x0051:
                r7 = 0
            L_0x0052:
                boolean r2 = r2.a(r4, r3, r7)
                if (r2 != 0) goto L_0x005a
                int r0 = ~r0
                return r0
            L_0x005a:
                int r0 = r0 + 1
                r7 = r0
                r0 = 1
                goto L_0x006f
            L_0x005f:
                r.b.a.v.j r2 = r6.f5689h
                r.b.a.v.j r3 = r.b.a.v.j.ALWAYS
                if (r2 != r3) goto L_0x006d
                boolean r2 = r20.l()
                if (r2 == 0) goto L_0x006d
                int r0 = ~r0
                return r0
            L_0x006d:
                r7 = r0
                r0 = 0
            L_0x006f:
                r2 = 0
            L_0x0070:
                boolean r3 = r20.l()
                if (r3 != 0) goto L_0x007f
                boolean r3 = r19.d(r20)
                if (r3 == 0) goto L_0x007d
                goto L_0x007f
            L_0x007d:
                r3 = 1
                goto L_0x0081
            L_0x007f:
                int r3 = r6.f5687f
            L_0x0081:
                int r8 = r7 + r3
                if (r8 <= r1) goto L_0x0087
                int r0 = ~r7
                return r0
            L_0x0087:
                boolean r9 = r20.l()
                if (r9 != 0) goto L_0x0097
                boolean r9 = r19.d(r20)
                if (r9 == 0) goto L_0x0094
                goto L_0x0097
            L_0x0094:
                r9 = 9
                goto L_0x0099
            L_0x0097:
                int r9 = r6.f5688g
            L_0x0099:
                int r10 = r6.f5690i
                int r10 = java.lang.Math.max(r10, r4)
                int r9 = r9 + r10
            L_0x00a0:
                r10 = 0
                r11 = 2
                if (r4 >= r11) goto L_0x010b
                int r9 = r9 + r7
                int r9 = java.lang.Math.min(r9, r1)
                r11 = r7
                r14 = 0
            L_0x00ac:
                if (r11 >= r9) goto L_0x00f5
                int r16 = r11 + 1
                r12 = r21
                char r11 = r12.charAt(r11)
                r.b.a.v.h r13 = r20.j()
                int r11 = r13.b(r11)
                if (r11 >= 0) goto L_0x00c6
                int r11 = r16 + -1
                if (r11 >= r8) goto L_0x00f7
                int r0 = ~r7
                return r0
            L_0x00c6:
                int r13 = r16 - r7
                r5 = 18
                if (r13 <= r5) goto L_0x00e5
                if (r10 != 0) goto L_0x00d2
                java.math.BigInteger r10 = java.math.BigInteger.valueOf(r14)
            L_0x00d2:
                java.math.BigInteger r5 = java.math.BigInteger.TEN
                java.math.BigInteger r5 = r10.multiply(r5)
                long r10 = (long) r11
                java.math.BigInteger r10 = java.math.BigInteger.valueOf(r10)
                java.math.BigInteger r10 = r5.add(r10)
                r5 = r8
                r22 = r9
                goto L_0x00ee
            L_0x00e5:
                r17 = 10
                long r14 = r14 * r17
                r5 = r8
                r22 = r9
                long r8 = (long) r11
                long r14 = r14 + r8
            L_0x00ee:
                r9 = r22
                r8 = r5
                r11 = r16
                r5 = 1
                goto L_0x00ac
            L_0x00f5:
                r12 = r21
            L_0x00f7:
                r5 = r8
                int r8 = r6.f5690i
                if (r8 <= 0) goto L_0x0109
                if (r4 != 0) goto L_0x0109
                int r11 = r11 - r7
                int r11 = r11 - r8
                int r9 = java.lang.Math.max(r3, r11)
                int r4 = r4 + 1
                r8 = r5
                r5 = 1
                goto L_0x00a0
            L_0x0109:
                r5 = r11
                goto L_0x010e
            L_0x010b:
                r5 = r7
                r14 = 0
            L_0x010e:
                if (r0 == 0) goto L_0x013c
                if (r10 == 0) goto L_0x0129
                java.math.BigInteger r0 = java.math.BigInteger.ZERO
                boolean r0 = r10.equals(r0)
                if (r0 == 0) goto L_0x0124
                boolean r0 = r20.l()
                if (r0 == 0) goto L_0x0124
                r0 = 1
                int r7 = r7 - r0
                int r0 = ~r7
                return r0
            L_0x0124:
                java.math.BigInteger r10 = r10.negate()
                goto L_0x0158
            L_0x0129:
                r0 = 1
                r1 = 0
                int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
                if (r3 != 0) goto L_0x0139
                boolean r1 = r20.l()
                if (r1 == 0) goto L_0x0139
                int r7 = r7 - r0
                int r0 = ~r7
                return r0
            L_0x0139:
                long r0 = -r14
                r2 = r0
                goto L_0x0159
            L_0x013c:
                r.b.a.v.j r0 = r6.f5689h
                r.b.a.v.j r1 = r.b.a.v.j.EXCEEDS_PAD
                if (r0 != r1) goto L_0x0158
                boolean r0 = r20.l()
                if (r0 == 0) goto L_0x0158
                int r0 = r5 - r7
                int r1 = r6.f5687f
                if (r2 == 0) goto L_0x0154
                if (r0 > r1) goto L_0x0158
                r0 = 1
                int r7 = r7 - r0
                int r0 = ~r7
                return r0
            L_0x0154:
                if (r0 <= r1) goto L_0x0158
                int r0 = ~r7
                return r0
            L_0x0158:
                r2 = r14
            L_0x0159:
                if (r10 == 0) goto L_0x0179
                int r0 = r10.bitLength()
                r1 = 63
                if (r0 <= r1) goto L_0x016b
                java.math.BigInteger r0 = java.math.BigInteger.TEN
                java.math.BigInteger r10 = r10.divide(r0)
                int r5 = r5 + -1
            L_0x016b:
                long r2 = r10.longValue()
                r0 = r19
                r1 = r20
                r4 = r7
                int r0 = r0.e(r1, r2, r4, r5)
                return r0
            L_0x0179:
                r0 = r19
                r1 = r20
                r4 = r7
                int r0 = r0.e(r1, r2, r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.v.c.j.c(r.b.a.v.d, java.lang.CharSequence, int):int");
        }

        /* access modifiers changed from: package-private */
        public boolean d(d dVar) {
            int i2 = this.f5690i;
            return i2 == -1 || (i2 > 0 && this.f5687f == this.f5688g && this.f5689h == j.NOT_NEGATIVE);
        }

        /* access modifiers changed from: package-private */
        public int e(d dVar, long j2, int i2, int i3) {
            return dVar.o(this.f5686e, j2, i2, i3);
        }

        /* access modifiers changed from: package-private */
        public j f() {
            return this.f5690i == -1 ? this : new j(this.f5686e, this.f5687f, this.f5688g, this.f5689h, -1);
        }

        /* access modifiers changed from: package-private */
        public j g(int i2) {
            return new j(this.f5686e, this.f5687f, this.f5688g, this.f5689h, this.f5690i + i2);
        }

        public String toString() {
            StringBuilder sb;
            Object obj;
            int i2 = this.f5687f;
            if (i2 == 1 && this.f5688g == 19 && this.f5689h == j.NORMAL) {
                sb = new StringBuilder();
                sb.append("Value(");
                obj = this.f5686e;
            } else if (i2 == this.f5688g && this.f5689h == j.NOT_NEGATIVE) {
                sb = new StringBuilder();
                sb.append("Value(");
                sb.append(this.f5686e);
                sb.append(",");
                sb.append(this.f5687f);
                sb.append(")");
                return sb.toString();
            } else {
                sb = new StringBuilder();
                sb.append("Value(");
                sb.append(this.f5686e);
                sb.append(",");
                sb.append(this.f5687f);
                sb.append(",");
                sb.append(this.f5688g);
                sb.append(",");
                obj = this.f5689h;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    static final class k implements g {

        /* renamed from: g  reason: collision with root package name */
        static final String[] f5691g = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

        /* renamed from: h  reason: collision with root package name */
        static final k f5692h = new k("Z", "+HH:MM:ss");

        /* renamed from: e  reason: collision with root package name */
        private final String f5693e;

        /* renamed from: f  reason: collision with root package name */
        private final int f5694f;

        k(String str, String str2) {
            r.b.a.w.d.i(str, "noOffsetText");
            r.b.a.w.d.i(str2, "pattern");
            this.f5693e = str;
            this.f5694f = b(str2);
        }

        private int b(String str) {
            int i2 = 0;
            while (true) {
                String[] strArr = f5691g;
                if (i2 >= strArr.length) {
                    throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
                } else if (strArr[i2].equals(str)) {
                    return i2;
                } else {
                    i2++;
                }
            }
        }

        private boolean d(int[] iArr, int i2, CharSequence charSequence, boolean z) {
            int i3;
            int i4 = this.f5694f;
            if ((i4 + 3) / 2 < i2) {
                return false;
            }
            int i5 = iArr[0];
            if (i4 % 2 == 0 && i2 > 1) {
                int i6 = i5 + 1;
                if (i6 > charSequence.length() || charSequence.charAt(i5) != ':') {
                    return z;
                }
                i5 = i6;
            }
            if (i5 + 2 > charSequence.length()) {
                return z;
            }
            int i7 = i5 + 1;
            char charAt = charSequence.charAt(i5);
            int i8 = i7 + 1;
            char charAt2 = charSequence.charAt(i7);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || (i3 = ((charAt - '0') * 10) + (charAt2 - '0')) < 0 || i3 > 59) {
                return z;
            }
            iArr[i2] = i3;
            iArr[0] = i8;
            return false;
        }

        public boolean a(f fVar, StringBuilder sb) {
            Long f2 = fVar.f(r.b.a.x.a.OFFSET_SECONDS);
            if (f2 == null) {
                return false;
            }
            int p2 = r.b.a.w.d.p(f2.longValue());
            if (p2 != 0) {
                int abs = Math.abs((p2 / 3600) % 100);
                int abs2 = Math.abs((p2 / 60) % 60);
                int abs3 = Math.abs(p2 % 60);
                int length = sb.length();
                sb.append(p2 < 0 ? "-" : "+");
                sb.append((char) ((abs / 10) + 48));
                sb.append((char) ((abs % 10) + 48));
                int i2 = this.f5694f;
                if (i2 >= 3 || (i2 >= 1 && abs2 > 0)) {
                    String str = ":";
                    sb.append(i2 % 2 == 0 ? str : "");
                    sb.append((char) ((abs2 / 10) + 48));
                    sb.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    int i3 = this.f5694f;
                    if (i3 >= 7 || (i3 >= 5 && abs3 > 0)) {
                        if (i3 % 2 != 0) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append((char) ((abs3 / 10) + 48));
                        sb.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                }
                return true;
            }
            sb.append(this.f5693e);
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r16.s(r17, r18, r0.f5693e, 0, r9) != false) goto L_0x0036;
         */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int c(r.b.a.v.d r16, java.lang.CharSequence r17, int r18) {
            /*
                r15 = this;
                r0 = r15
                r7 = r17
                r8 = r18
                int r1 = r17.length()
                java.lang.String r2 = r0.f5693e
                int r9 = r2.length()
                if (r9 != 0) goto L_0x0022
                if (r8 != r1) goto L_0x0041
                r.b.a.x.a r2 = r.b.a.x.a.OFFSET_SECONDS
                r3 = 0
                r1 = r16
                r5 = r18
                r6 = r18
            L_0x001d:
                int r1 = r1.o(r2, r3, r5, r6)
                return r1
            L_0x0022:
                if (r8 != r1) goto L_0x0026
                int r1 = ~r8
                return r1
            L_0x0026:
                java.lang.String r4 = r0.f5693e
                r5 = 0
                r1 = r16
                r2 = r17
                r3 = r18
                r6 = r9
                boolean r1 = r1.s(r2, r3, r4, r5, r6)
                if (r1 == 0) goto L_0x0041
            L_0x0036:
                r.b.a.x.a r2 = r.b.a.x.a.OFFSET_SECONDS
                r3 = 0
                int r6 = r8 + r9
                r1 = r16
                r5 = r18
                goto L_0x001d
            L_0x0041:
                char r1 = r17.charAt(r18)
                r2 = 43
                r3 = 45
                if (r1 == r2) goto L_0x004d
                if (r1 != r3) goto L_0x009d
            L_0x004d:
                r2 = 1
                if (r1 != r3) goto L_0x0052
                r1 = -1
                goto L_0x0053
            L_0x0052:
                r1 = 1
            L_0x0053:
                r3 = 4
                int[] r3 = new int[r3]
                int r4 = r8 + 1
                r5 = 0
                r3[r5] = r4
                boolean r4 = r15.d(r3, r2, r7, r2)
                r6 = 2
                r10 = 3
                if (r4 != 0) goto L_0x0079
                int r4 = r0.f5694f
                if (r4 < r10) goto L_0x0069
                r4 = 1
                goto L_0x006a
            L_0x0069:
                r4 = 0
            L_0x006a:
                boolean r4 = r15.d(r3, r6, r7, r4)
                if (r4 != 0) goto L_0x0079
                boolean r4 = r15.d(r3, r10, r7, r5)
                if (r4 == 0) goto L_0x0077
                goto L_0x0079
            L_0x0077:
                r4 = 0
                goto L_0x007a
            L_0x0079:
                r4 = 1
            L_0x007a:
                if (r4 != 0) goto L_0x009d
                long r11 = (long) r1
                r1 = r3[r2]
                long r1 = (long) r1
                r13 = 3600(0xe10, double:1.7786E-320)
                long r1 = r1 * r13
                r4 = r3[r6]
                long r6 = (long) r4
                r13 = 60
                long r6 = r6 * r13
                long r1 = r1 + r6
                r4 = r3[r10]
                long r6 = (long) r4
                long r1 = r1 + r6
                long r6 = r11 * r1
                r.b.a.x.a r2 = r.b.a.x.a.OFFSET_SECONDS
                r9 = r3[r5]
                r1 = r16
                r3 = r6
                r5 = r18
                r6 = r9
                goto L_0x001d
            L_0x009d:
                if (r9 != 0) goto L_0x00a0
                goto L_0x0036
            L_0x00a0:
                int r1 = ~r8
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.v.c.k.c(r.b.a.v.d, java.lang.CharSequence, int):int");
        }

        public String toString() {
            String replace = this.f5693e.replace("'", "''");
            return "Offset(" + f5691g[this.f5694f] + ",'" + replace + "')";
        }
    }

    static final class l implements g {

        /* renamed from: e  reason: collision with root package name */
        private final g f5695e;

        /* renamed from: f  reason: collision with root package name */
        private final int f5696f;

        /* renamed from: g  reason: collision with root package name */
        private final char f5697g;

        l(g gVar, int i2, char c) {
            this.f5695e = gVar;
            this.f5696f = i2;
            this.f5697g = c;
        }

        public boolean a(f fVar, StringBuilder sb) {
            int length = sb.length();
            if (!this.f5695e.a(fVar, sb)) {
                return false;
            }
            int length2 = sb.length() - length;
            if (length2 <= this.f5696f) {
                for (int i2 = 0; i2 < this.f5696f - length2; i2++) {
                    sb.insert(length, this.f5697g);
                }
                return true;
            }
            throw new r.b.a.b("Cannot print as output of " + length2 + " characters exceeds pad width of " + this.f5696f);
        }

        public int c(d dVar, CharSequence charSequence, int i2) {
            boolean l2 = dVar.l();
            boolean k2 = dVar.k();
            if (i2 > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            } else if (i2 == charSequence.length()) {
                return ~i2;
            } else {
                int i3 = this.f5696f + i2;
                if (i3 > charSequence.length()) {
                    if (l2) {
                        return ~i2;
                    }
                    i3 = charSequence.length();
                }
                int i4 = i2;
                while (i4 < i3) {
                    char charAt = charSequence.charAt(i4);
                    char c = this.f5697g;
                    if (!k2) {
                        if (!dVar.b(charAt, c)) {
                            break;
                        }
                    } else if (charAt != c) {
                        break;
                    }
                    i4++;
                }
                int c2 = this.f5695e.c(dVar, charSequence.subSequence(0, i3), i4);
                return (c2 == i3 || !l2) ? c2 : ~(i2 + i4);
            }
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Pad(");
            sb.append(this.f5695e);
            sb.append(",");
            sb.append(this.f5696f);
            if (this.f5697g == ' ') {
                str = ")";
            } else {
                str = ",'" + this.f5697g + "')";
            }
            sb.append(str);
            return sb.toString();
        }
    }

    enum m implements g {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        public boolean a(f fVar, StringBuilder sb) {
            return true;
        }

        public int c(d dVar, CharSequence charSequence, int i2) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                dVar.m(true);
            } else if (ordinal == 1) {
                dVar.m(false);
            } else if (ordinal == 2) {
                dVar.q(true);
            } else if (ordinal == 3) {
                dVar.q(false);
            }
            return i2;
        }

        public String toString() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (ordinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (ordinal == 2) {
                return "ParseStrict(true)";
            }
            if (ordinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    static final class n implements g {

        /* renamed from: e  reason: collision with root package name */
        private final String f5703e;

        n(String str) {
            this.f5703e = str;
        }

        public boolean a(f fVar, StringBuilder sb) {
            sb.append(this.f5703e);
            return true;
        }

        public int c(d dVar, CharSequence charSequence, int i2) {
            if (i2 > charSequence.length() || i2 < 0) {
                throw new IndexOutOfBoundsException();
            }
            String str = this.f5703e;
            return !dVar.s(charSequence, i2, str, 0, str.length()) ? ~i2 : i2 + this.f5703e.length();
        }

        public String toString() {
            String replace = this.f5703e.replace("'", "''");
            return "'" + replace + "'";
        }
    }

    static final class o implements g {

        /* renamed from: e  reason: collision with root package name */
        private final r.b.a.x.i f5704e;

        /* renamed from: f  reason: collision with root package name */
        private final l f5705f;

        /* renamed from: g  reason: collision with root package name */
        private final g f5706g;

        /* renamed from: h  reason: collision with root package name */
        private volatile j f5707h;

        o(r.b.a.x.i iVar, l lVar, g gVar) {
            this.f5704e = iVar;
            this.f5705f = lVar;
            this.f5706g = gVar;
        }

        private j b() {
            if (this.f5707h == null) {
                this.f5707h = new j(this.f5704e, 1, 19, j.NORMAL);
            }
            return this.f5707h;
        }

        public boolean a(f fVar, StringBuilder sb) {
            Long f2 = fVar.f(this.f5704e);
            if (f2 == null) {
                return false;
            }
            String a = this.f5706g.a(this.f5704e, f2.longValue(), this.f5705f, fVar.c());
            if (a == null) {
                return b().a(fVar, sb);
            }
            sb.append(a);
            return true;
        }

        public int c(d dVar, CharSequence charSequence, int i2) {
            int length = charSequence.length();
            if (i2 < 0 || i2 > length) {
                throw new IndexOutOfBoundsException();
            }
            Iterator<Map.Entry<String, Long>> b = this.f5706g.b(this.f5704e, dVar.l() ? this.f5705f : null, dVar.h());
            if (b != null) {
                while (b.hasNext()) {
                    Map.Entry next = b.next();
                    String str = (String) next.getKey();
                    if (dVar.s(str, 0, charSequence, i2, str.length())) {
                        return dVar.o(this.f5704e, ((Long) next.getValue()).longValue(), i2, i2 + str.length());
                    }
                }
                if (dVar.l()) {
                    return ~i2;
                }
            }
            return b().c(dVar, charSequence, i2);
        }

        public String toString() {
            StringBuilder sb;
            Object obj;
            if (this.f5705f == l.FULL) {
                sb = new StringBuilder();
                sb.append("Text(");
                obj = this.f5704e;
            } else {
                sb = new StringBuilder();
                sb.append("Text(");
                sb.append(this.f5704e);
                sb.append(",");
                obj = this.f5705f;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    static final class p implements g {

        /* renamed from: g  reason: collision with root package name */
        private static volatile Map.Entry<Integer, a> f5708g;

        /* renamed from: e  reason: collision with root package name */
        private final r.b.a.x.k<q> f5709e;

        /* renamed from: f  reason: collision with root package name */
        private final String f5710f;

        private static final class a {
            final int a;
            private final Map<CharSequence, a> b;
            private final Map<String, a> c;

            private a(int i2) {
                this.b = new HashMap();
                this.c = new HashMap();
                this.a = i2;
            }

            /* synthetic */ a(int i2, a aVar) {
                this(i2);
            }

            /* access modifiers changed from: private */
            public void c(String str) {
                int length = str.length();
                int i2 = this.a;
                if (length == i2) {
                    this.b.put(str, (Object) null);
                    this.c.put(str.toLowerCase(Locale.ENGLISH), (Object) null);
                } else if (length > i2) {
                    String substring = str.substring(0, i2);
                    a aVar = this.b.get(substring);
                    if (aVar == null) {
                        aVar = new a(length);
                        this.b.put(substring, aVar);
                        this.c.put(substring.toLowerCase(Locale.ENGLISH), aVar);
                    }
                    aVar.c(str);
                }
            }

            /* access modifiers changed from: private */
            public a d(CharSequence charSequence, boolean z) {
                Map map;
                if (z) {
                    map = this.b;
                } else {
                    map = this.c;
                    charSequence = charSequence.toString().toLowerCase(Locale.ENGLISH);
                }
                return (a) map.get(charSequence);
            }
        }

        p(r.b.a.x.k<q> kVar, String str) {
            this.f5709e = kVar;
            this.f5710f = str;
        }

        private q b(Set<String> set, String str, boolean z) {
            if (str == null) {
                return null;
            }
            if (!z) {
                for (String next : set) {
                    if (next.equalsIgnoreCase(str)) {
                        return q.o(next);
                    }
                }
                return null;
            } else if (set.contains(str)) {
                return q.o(str);
            } else {
                return null;
            }
        }

        private int d(d dVar, CharSequence charSequence, int i2, int i3) {
            int c;
            String upperCase = charSequence.subSequence(i2, i3).toString().toUpperCase();
            d d2 = dVar.d();
            if ((i3 >= charSequence.length() || !dVar.b(charSequence.charAt(i3), 'Z')) && (c = k.f5692h.c(d2, charSequence, i3)) >= 0) {
                dVar.n(q.u(upperCase, r.B((int) d2.i(r.b.a.x.a.OFFSET_SECONDS).longValue())));
                return c;
            }
            dVar.n(q.u(upperCase, r.f5578i));
            return i3;
        }

        private static a e(Set<String> set) {
            ArrayList<String> arrayList = new ArrayList<>(set);
            Collections.sort(arrayList, c.f5672j);
            a aVar = new a(((String) arrayList.get(0)).length(), (a) null);
            for (String b : arrayList) {
                aVar.c(b);
            }
            return aVar;
        }

        public boolean a(f fVar, StringBuilder sb) {
            q qVar = (q) fVar.g(this.f5709e);
            if (qVar == null) {
                return false;
            }
            sb.append(qVar.a());
            return true;
        }

        public int c(d dVar, CharSequence charSequence, int i2) {
            int i3;
            int length = charSequence.length();
            if (i2 > length) {
                throw new IndexOutOfBoundsException();
            } else if (i2 == length) {
                return ~i2;
            } else {
                char charAt = charSequence.charAt(i2);
                if (charAt == '+' || charAt == '-') {
                    d d2 = dVar.d();
                    int c = k.f5692h.c(d2, charSequence, i2);
                    if (c < 0) {
                        return c;
                    }
                    dVar.n(r.B((int) d2.i(r.b.a.x.a.OFFSET_SECONDS).longValue()));
                    return c;
                }
                int i4 = i2 + 2;
                if (length >= i4) {
                    char charAt2 = charSequence.charAt(i2 + 1);
                    if (dVar.b(charAt, 'U') && dVar.b(charAt2, 'T')) {
                        int i5 = i2 + 3;
                        return (length < i5 || !dVar.b(charSequence.charAt(i4), 'C')) ? d(dVar, charSequence, i2, i4) : d(dVar, charSequence, i2, i5);
                    } else if (dVar.b(charAt, 'G') && length >= (i3 = i2 + 3) && dVar.b(charAt2, 'M') && dVar.b(charSequence.charAt(i4), 'T')) {
                        return d(dVar, charSequence, i2, i3);
                    }
                }
                Set<String> a2 = r.b.a.y.i.a();
                int size = a2.size();
                Map.Entry<Integer, a> entry = f5708g;
                if (entry == null || entry.getKey().intValue() != size) {
                    synchronized (this) {
                        entry = f5708g;
                        if (entry == null || entry.getKey().intValue() != size) {
                            entry = new AbstractMap.SimpleImmutableEntry<>(Integer.valueOf(size), e(a2));
                            f5708g = entry;
                        }
                    }
                }
                a value = entry.getValue();
                String str = null;
                String str2 = null;
                while (value != null) {
                    int i6 = value.a + i2;
                    if (i6 > length) {
                        break;
                    }
                    String charSequence2 = charSequence.subSequence(i2, i6).toString();
                    value = value.d(charSequence2, dVar.k());
                    String str3 = charSequence2;
                    str2 = str;
                    str = str3;
                }
                q b = b(a2, str, dVar.k());
                if (b == null) {
                    b = b(a2, str2, dVar.k());
                    if (b != null) {
                        str = str2;
                    } else if (!dVar.b(charAt, 'Z')) {
                        return ~i2;
                    } else {
                        dVar.n(r.f5578i);
                        return i2 + 1;
                    }
                }
                dVar.n(b);
                return i2 + str.length();
            }
        }

        public String toString() {
            return this.f5710f;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f5671i = hashMap;
        hashMap.put('G', r.b.a.x.a.ERA);
        hashMap.put('y', r.b.a.x.a.YEAR_OF_ERA);
        hashMap.put('u', r.b.a.x.a.YEAR);
        r.b.a.x.i iVar = r.b.a.x.c.a;
        hashMap.put('Q', iVar);
        hashMap.put('q', iVar);
        r.b.a.x.a aVar = r.b.a.x.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', r.b.a.x.a.DAY_OF_YEAR);
        hashMap.put('d', r.b.a.x.a.DAY_OF_MONTH);
        hashMap.put('F', r.b.a.x.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        r.b.a.x.a aVar2 = r.b.a.x.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', r.b.a.x.a.AMPM_OF_DAY);
        hashMap.put('H', r.b.a.x.a.HOUR_OF_DAY);
        hashMap.put('k', r.b.a.x.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', r.b.a.x.a.HOUR_OF_AMPM);
        hashMap.put('h', r.b.a.x.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', r.b.a.x.a.MINUTE_OF_HOUR);
        hashMap.put('s', r.b.a.x.a.SECOND_OF_MINUTE);
        r.b.a.x.a aVar3 = r.b.a.x.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', r.b.a.x.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', r.b.a.x.a.NANO_OF_DAY);
    }

    public c() {
        this.a = this;
        this.c = new ArrayList();
        this.f5676g = -1;
        this.b = null;
        this.f5673d = false;
    }

    private c(c cVar, boolean z) {
        this.a = this;
        this.c = new ArrayList();
        this.f5676g = -1;
        this.b = cVar;
        this.f5673d = z;
    }

    private int d(g gVar) {
        r.b.a.w.d.i(gVar, "pp");
        c cVar = this.a;
        int i2 = cVar.f5674e;
        if (i2 > 0) {
            if (gVar != null) {
                gVar = new l(gVar, i2, cVar.f5675f);
            }
            cVar.f5674e = 0;
            cVar.f5675f = 0;
        }
        cVar.c.add(gVar);
        c cVar2 = this.a;
        cVar2.f5676g = -1;
        return cVar2.c.size() - 1;
    }

    private c j(j jVar) {
        j jVar2;
        c cVar = this.a;
        int i2 = cVar.f5676g;
        if (i2 < 0 || !(cVar.c.get(i2) instanceof j)) {
            this.a.f5676g = d(jVar);
        } else {
            c cVar2 = this.a;
            int i3 = cVar2.f5676g;
            j jVar3 = (j) cVar2.c.get(i3);
            int i4 = jVar.f5687f;
            int i5 = jVar.f5688g;
            if (i4 == i5 && jVar.f5689h == j.NOT_NEGATIVE) {
                jVar2 = jVar3.g(i5);
                d(jVar.f());
                this.a.f5676g = i3;
            } else {
                jVar2 = jVar3.f();
                this.a.f5676g = d(jVar);
            }
            this.a.c.set(i3, jVar2);
        }
        return this;
    }

    public c a(b bVar) {
        r.b.a.w.d.i(bVar, "formatter");
        d(bVar.k(false));
        return this;
    }

    public c b(r.b.a.x.i iVar, int i2, int i3, boolean z) {
        d(new h(iVar, i2, i3, z));
        return this;
    }

    public c c() {
        d(new i(-2));
        return this;
    }

    public c e(char c2) {
        d(new e(c2));
        return this;
    }

    public c f(String str) {
        r.b.a.w.d.i(str, "literal");
        if (str.length() > 0) {
            d(str.length() == 1 ? new e(str.charAt(0)) : new n(str));
        }
        return this;
    }

    public c g(String str, String str2) {
        d(new k(str2, str));
        return this;
    }

    public c h() {
        d(k.f5692h);
        return this;
    }

    public c i(r.b.a.x.i iVar, Map<Long, String> map) {
        r.b.a.w.d.i(iVar, "field");
        r.b.a.w.d.i(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        l lVar = l.FULL;
        d(new o(iVar, lVar, new b(this, new k.b(Collections.singletonMap(lVar, linkedHashMap)))));
        return this;
    }

    public c k(r.b.a.x.i iVar, int i2) {
        r.b.a.w.d.i(iVar, "field");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
        }
        j(new j(iVar, i2, i2, j.NOT_NEGATIVE));
        return this;
    }

    public c l(r.b.a.x.i iVar, int i2, int i3, j jVar) {
        if (i2 == i3 && jVar == j.NOT_NEGATIVE) {
            k(iVar, i3);
            return this;
        }
        r.b.a.w.d.i(iVar, "field");
        r.b.a.w.d.i(jVar, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        } else if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        } else if (i3 >= i2) {
            j(new j(iVar, i2, i3, jVar));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
        }
    }

    public c m() {
        d(new p(f5670h, "ZoneRegionId()"));
        return this;
    }

    public c n() {
        c cVar = this.a;
        if (cVar.b != null) {
            if (cVar.c.size() > 0) {
                c cVar2 = this.a;
                f fVar = new f(cVar2.c, cVar2.f5673d);
                this.a = this.a.b;
                d(fVar);
            } else {
                this.a = this.a.b;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public c o() {
        c cVar = this.a;
        cVar.f5676g = -1;
        this.a = new c(cVar, true);
        return this;
    }

    public c p() {
        d(m.INSENSITIVE);
        return this;
    }

    public c q() {
        d(m.SENSITIVE);
        return this;
    }

    public c r() {
        d(m.LENIENT);
        return this;
    }

    public b s() {
        return t(Locale.getDefault());
    }

    public b t(Locale locale) {
        r.b.a.w.d.i(locale, "locale");
        while (this.a.b != null) {
            n();
        }
        return new b(new f(this.c, false), locale, h.f5726e, i.SMART, (Set<r.b.a.x.i>) null, (r.b.a.u.h) null, (q) null);
    }

    /* access modifiers changed from: package-private */
    public b u(i iVar) {
        return s().m(iVar);
    }
}
