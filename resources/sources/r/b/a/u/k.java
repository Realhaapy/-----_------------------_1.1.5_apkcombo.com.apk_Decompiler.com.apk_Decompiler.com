package r.b.a.u;

import e.a.j;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import r.b.a.b;
import r.b.a.c;
import r.b.a.w.d;
import r.b.a.x.f;
import r.b.a.x.h;
import r.b.a.x.i;
import r.b.a.x.l;
import r.b.a.x.m;
import r.b.a.x.n;

public final class k extends a<k> implements Serializable {
    private static final Integer[] A = new Integer[f5604p.length];
    private static final Integer[] B = new Integer[f5605q.length];
    private static final Integer[] C = new Integer[f5606r.length];
    private static final Integer[] D;
    private static final Integer[] E = new Integer[f5601m.length];
    private static final Integer[] F = new Integer[f5602n.length];
    private static final Integer[] G = new Integer[f5603o.length];
    private static final Integer[] H = new Integer[f5607s.length];

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f5600l;

    /* renamed from: m  reason: collision with root package name */
    private static final int[] f5601m = {0, 30, 59, 89, j.A0, 148, 177, 207, 236, 266, 295, 325};

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f5602n = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f5603o = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};

    /* renamed from: p  reason: collision with root package name */
    private static final int[] f5604p = {0, 1, 0, 1, 0, 1, 1};

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f5605q = {1, 9999, 11, 51, 5, 29, 354};

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f5606r = {1, 9999, 11, 52, 6, 30, 355};

    /* renamed from: s  reason: collision with root package name */
    private static final int[] f5607s = {0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};
    private static final long serialVersionUID = -5207853542612002020L;
    private static final char t;
    private static final String u = File.pathSeparator;
    private static final String v;
    private static final HashMap<Integer, Integer[]> w = new HashMap<>();
    private static final HashMap<Integer, Integer[]> x = new HashMap<>();
    private static final HashMap<Integer, Integer[]> y = new HashMap<>();
    private static final Long[] z = new Long[334];

    /* renamed from: e  reason: collision with root package name */
    private final transient l f5608e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f5609f;

    /* renamed from: g  reason: collision with root package name */
    private final transient int f5610g;

    /* renamed from: h  reason: collision with root package name */
    private final transient int f5611h;

    /* renamed from: i  reason: collision with root package name */
    private final transient int f5612i;

    /* renamed from: j  reason: collision with root package name */
    private final transient c f5613j;

    /* renamed from: k  reason: collision with root package name */
    private final long f5614k;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                r.b.a.x.a[] r0 = r.b.a.x.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                r.b.a.x.a r1 = r.b.a.x.a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                r.b.a.x.a r1 = r.b.a.x.a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r.b.a.x.a r1 = r.b.a.x.a.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                r.b.a.x.a r1 = r.b.a.x.a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                r.b.a.x.a r1 = r.b.a.x.a.DAY_OF_WEEK     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                r.b.a.x.a r1 = r.b.a.x.a.ALIGNED_DAY_OF_WEEK_IN_MONTH     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                r.b.a.x.a r1 = r.b.a.x.a.ALIGNED_DAY_OF_WEEK_IN_YEAR     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0060 }
                r.b.a.x.a r1 = r.b.a.x.a.EPOCH_DAY     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006c }
                r.b.a.x.a r1 = r.b.a.x.a.ALIGNED_WEEK_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                r.b.a.x.a r1 = r.b.a.x.a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0084 }
                r.b.a.x.a r1 = r.b.a.x.a.YEAR     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0090 }
                r.b.a.x.a r1 = r.b.a.x.a.ERA     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.u.k.a.<clinit>():void");
        }
    }

    static {
        int[] iArr = {0, 30, 59, 89, j.A0, 148, 177, 207, 236, 266, 295, 325};
        f5600l = iArr;
        char c = File.separatorChar;
        t = c;
        v = "org" + c + "threeten" + c + "bp" + c + "chrono";
        D = new Integer[iArr.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr2 = f5600l;
            if (i3 >= iArr2.length) {
                break;
            }
            D[i3] = Integer.valueOf(iArr2[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            int[] iArr3 = f5601m;
            if (i4 >= iArr3.length) {
                break;
            }
            E[i4] = Integer.valueOf(iArr3[i4]);
            i4++;
        }
        int i5 = 0;
        while (true) {
            int[] iArr4 = f5602n;
            if (i5 >= iArr4.length) {
                break;
            }
            F[i5] = Integer.valueOf(iArr4[i5]);
            i5++;
        }
        int i6 = 0;
        while (true) {
            int[] iArr5 = f5603o;
            if (i6 >= iArr5.length) {
                break;
            }
            G[i6] = Integer.valueOf(iArr5[i6]);
            i6++;
        }
        int i7 = 0;
        while (true) {
            int[] iArr6 = f5607s;
            if (i7 >= iArr6.length) {
                break;
            }
            H[i7] = Integer.valueOf(iArr6[i7]);
            i7++;
        }
        int i8 = 0;
        while (true) {
            Long[] lArr = z;
            if (i8 >= lArr.length) {
                break;
            }
            lArr[i8] = Long.valueOf((long) (i8 * 10631));
            i8++;
        }
        int i9 = 0;
        while (true) {
            int[] iArr7 = f5604p;
            if (i9 >= iArr7.length) {
                break;
            }
            A[i9] = Integer.valueOf(iArr7[i9]);
            i9++;
        }
        int i10 = 0;
        while (true) {
            int[] iArr8 = f5605q;
            if (i10 >= iArr8.length) {
                break;
            }
            B[i10] = Integer.valueOf(iArr8[i10]);
            i10++;
        }
        while (true) {
            int[] iArr9 = f5606r;
            if (i2 < iArr9.length) {
                C[i2] = Integer.valueOf(iArr9[i2]);
                i2++;
            } else {
                try {
                    v0();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            }
        }
    }

    private k(long j2) {
        int[] a0 = a0(j2);
        O(a0[1]);
        N(a0[2]);
        L(a0[3]);
        M(a0[4]);
        this.f5608e = l.a(a0[0]);
        int i2 = a0[1];
        this.f5609f = i2;
        this.f5610g = a0[2];
        this.f5611h = a0[3];
        this.f5612i = a0[4];
        this.f5613j = c.a(a0[5]);
        this.f5614k = j2;
        i0((long) i2);
    }

    private static long B0(int i2) {
        Long l2;
        int i3 = i2 - 1;
        int i4 = i3 / 30;
        int i5 = i3 % 30;
        int intValue = P(i4)[Math.abs(i5)].intValue();
        if (i5 < 0) {
            intValue = -intValue;
        }
        try {
            l2 = z[i4];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l2 = null;
        }
        if (l2 == null) {
            l2 = Long.valueOf((long) (i4 * 10631));
        }
        return ((l2.longValue() + ((long) intValue)) - 492148) - 1;
    }

    private static void K(int i2, int i3, int i4, int i5, int i6) {
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        int i10 = i5;
        int i11 = i6;
        if (i7 < 1) {
            throw new IllegalArgumentException("startYear < 1");
        } else if (i9 < 1) {
            throw new IllegalArgumentException("endYear < 1");
        } else if (i8 < 0 || i8 > 11) {
            throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
        } else if (i10 < 0 || i10 > 11) {
            throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
        } else if (i9 > 9999) {
            throw new IllegalArgumentException("endYear > 9999");
        } else if (i9 < i7) {
            throw new IllegalArgumentException("startYear > endYear");
        } else if (i9 != i7 || i10 >= i8) {
            boolean i0 = i0((long) i7);
            Integer[] numArr = w.get(Integer.valueOf(i2));
            if (numArr == null) {
                if (!i0) {
                    numArr = new Integer[f5600l.length];
                    int i12 = 0;
                    while (true) {
                        int[] iArr = f5600l;
                        if (i12 >= iArr.length) {
                            break;
                        }
                        numArr[i12] = Integer.valueOf(iArr[i12]);
                        i12++;
                    }
                } else {
                    numArr = new Integer[f5601m.length];
                    int i13 = 0;
                    while (true) {
                        int[] iArr2 = f5601m;
                        if (i13 >= iArr2.length) {
                            break;
                        }
                        numArr[i13] = Integer.valueOf(iArr2[i13]);
                        i13++;
                    }
                }
            }
            Integer[] numArr2 = new Integer[numArr.length];
            for (int i14 = 0; i14 < 12; i14++) {
                if (i14 > i8) {
                    numArr2[i14] = Integer.valueOf(numArr[i14].intValue() - i11);
                } else {
                    numArr2[i14] = Integer.valueOf(numArr[i14].intValue());
                }
            }
            w.put(Integer.valueOf(i2), numArr2);
            Integer[] numArr3 = x.get(Integer.valueOf(i2));
            if (numArr3 == null) {
                if (!i0) {
                    numArr3 = new Integer[f5602n.length];
                    int i15 = 0;
                    while (true) {
                        int[] iArr3 = f5602n;
                        if (i15 >= iArr3.length) {
                            break;
                        }
                        numArr3[i15] = Integer.valueOf(iArr3[i15]);
                        i15++;
                    }
                } else {
                    numArr3 = new Integer[f5603o.length];
                    int i16 = 0;
                    while (true) {
                        int[] iArr4 = f5603o;
                        if (i16 >= iArr4.length) {
                            break;
                        }
                        numArr3[i16] = Integer.valueOf(iArr4[i16]);
                        i16++;
                    }
                }
            }
            Integer[] numArr4 = new Integer[numArr3.length];
            for (int i17 = 0; i17 < 12; i17++) {
                if (i17 == i8) {
                    numArr4[i17] = Integer.valueOf(numArr3[i17].intValue() - i11);
                } else {
                    numArr4[i17] = Integer.valueOf(numArr3[i17].intValue());
                }
            }
            x.put(Integer.valueOf(i2), numArr4);
            if (i7 != i9) {
                int i18 = i7 - 1;
                int i19 = i18 / 30;
                int i20 = i18 % 30;
                Integer[] numArr5 = y.get(Integer.valueOf(i19));
                if (numArr5 == null) {
                    int length = f5607s.length;
                    Integer[] numArr6 = new Integer[length];
                    for (int i21 = 0; i21 < length; i21++) {
                        numArr6[i21] = Integer.valueOf(f5607s[i21]);
                    }
                    numArr5 = numArr6;
                }
                for (int i22 = i20 + 1; i22 < f5607s.length; i22++) {
                    numArr5[i22] = Integer.valueOf(numArr5[i22].intValue() - i11);
                }
                y.put(Integer.valueOf(i19), numArr5);
                int i23 = i9 - 1;
                int i24 = i23 / 30;
                if (i19 != i24) {
                    int i25 = i19 + 1;
                    while (true) {
                        Long[] lArr = z;
                        if (i25 >= lArr.length) {
                            break;
                        }
                        lArr[i25] = Long.valueOf(lArr[i25].longValue() - ((long) i11));
                        i25++;
                    }
                    int i26 = i24 + 1;
                    while (true) {
                        Long[] lArr2 = z;
                        if (i26 >= lArr2.length) {
                            break;
                        }
                        lArr2[i26] = Long.valueOf(lArr2[i26].longValue() + ((long) i11));
                        i26++;
                        i24 = i24;
                    }
                }
                int i27 = i24;
                int i28 = i23 % 30;
                Integer[] numArr7 = y.get(Integer.valueOf(i27));
                if (numArr7 == null) {
                    int length2 = f5607s.length;
                    Integer[] numArr8 = new Integer[length2];
                    for (int i29 = 0; i29 < length2; i29++) {
                        numArr8[i29] = Integer.valueOf(f5607s[i29]);
                    }
                    numArr7 = numArr8;
                }
                for (int i30 = i28 + 1; i30 < f5607s.length; i30++) {
                    numArr7[i30] = Integer.valueOf(numArr7[i30].intValue() + i11);
                }
                y.put(Integer.valueOf(i27), numArr7);
            }
            boolean i02 = i0((long) i9);
            Integer[] numArr9 = w.get(Integer.valueOf(i4));
            if (numArr9 == null) {
                if (!i02) {
                    numArr9 = new Integer[f5600l.length];
                    int i31 = 0;
                    while (true) {
                        int[] iArr5 = f5600l;
                        if (i31 >= iArr5.length) {
                            break;
                        }
                        numArr9[i31] = Integer.valueOf(iArr5[i31]);
                        i31++;
                    }
                } else {
                    numArr9 = new Integer[f5601m.length];
                    int i32 = 0;
                    while (true) {
                        int[] iArr6 = f5601m;
                        if (i32 >= iArr6.length) {
                            break;
                        }
                        numArr9[i32] = Integer.valueOf(iArr6[i32]);
                        i32++;
                    }
                }
            }
            Integer[] numArr10 = new Integer[numArr9.length];
            for (int i33 = 0; i33 < 12; i33++) {
                if (i33 > i10) {
                    numArr10[i33] = Integer.valueOf(numArr9[i33].intValue() + i11);
                } else {
                    numArr10[i33] = Integer.valueOf(numArr9[i33].intValue());
                }
            }
            w.put(Integer.valueOf(i4), numArr10);
            Integer[] numArr11 = x.get(Integer.valueOf(i4));
            if (numArr11 == null) {
                if (!i02) {
                    numArr11 = new Integer[f5602n.length];
                    int i34 = 0;
                    while (true) {
                        int[] iArr7 = f5602n;
                        if (i34 >= iArr7.length) {
                            break;
                        }
                        numArr11[i34] = Integer.valueOf(iArr7[i34]);
                        i34++;
                    }
                } else {
                    numArr11 = new Integer[f5603o.length];
                    int i35 = 0;
                    while (true) {
                        int[] iArr8 = f5603o;
                        if (i35 >= iArr8.length) {
                            break;
                        }
                        numArr11[i35] = Integer.valueOf(iArr8[i35]);
                        i35++;
                    }
                }
            }
            Integer[] numArr12 = new Integer[numArr11.length];
            for (int i36 = 0; i36 < 12; i36++) {
                if (i36 == i10) {
                    numArr12[i36] = Integer.valueOf(numArr11[i36].intValue() + i11);
                } else {
                    numArr12[i36] = Integer.valueOf(numArr11[i36].intValue());
                }
            }
            HashMap<Integer, Integer[]> hashMap = x;
            hashMap.put(Integer.valueOf(i4), numArr12);
            Integer[] numArr13 = hashMap.get(Integer.valueOf(i2));
            Integer[] numArr14 = hashMap.get(Integer.valueOf(i4));
            HashMap<Integer, Integer[]> hashMap2 = w;
            int intValue = numArr13[i8].intValue();
            int intValue2 = numArr14[i10].intValue();
            int intValue3 = hashMap2.get(Integer.valueOf(i2))[11].intValue() + numArr13[11].intValue();
            int intValue4 = hashMap2.get(Integer.valueOf(i4))[11].intValue() + numArr14[11].intValue();
            Integer[] numArr15 = C;
            int intValue5 = numArr15[5].intValue();
            Integer[] numArr16 = B;
            int intValue6 = numArr16[5].intValue();
            if (intValue5 < intValue) {
                intValue5 = intValue;
            }
            if (intValue5 < intValue2) {
                intValue5 = intValue2;
            }
            numArr15[5] = Integer.valueOf(intValue5);
            if (intValue6 <= intValue) {
                intValue = intValue6;
            }
            if (intValue <= intValue2) {
                intValue2 = intValue;
            }
            numArr16[5] = Integer.valueOf(intValue2);
            int intValue7 = numArr15[6].intValue();
            int intValue8 = numArr16[6].intValue();
            if (intValue7 < intValue3) {
                intValue7 = intValue3;
            }
            if (intValue7 < intValue4) {
                intValue7 = intValue4;
            }
            numArr15[6] = Integer.valueOf(intValue7);
            if (intValue8 <= intValue3) {
                intValue3 = intValue8;
            }
            if (intValue3 <= intValue4) {
                intValue4 = intValue3;
            }
            numArr16[6] = Integer.valueOf(intValue4);
        } else {
            throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
        }
    }

    private static void L(int i2) {
        if (i2 < 1 || i2 > b0()) {
            throw new b("Invalid day of month of Hijrah date, day " + i2 + " greater than " + b0() + " or less than 1");
        }
    }

    private static void M(int i2) {
        if (i2 < 1 || i2 > c0()) {
            throw new b("Invalid day of year of Hijrah date");
        }
    }

    private static void N(int i2) {
        if (i2 < 1 || i2 > 12) {
            throw new b("Invalid month of Hijrah date");
        }
    }

    private static void O(int i2) {
        if (i2 < 1 || i2 > 9999) {
            throw new b("Invalid year of Hijrah Era");
        }
    }

    private static Integer[] P(int i2) {
        Integer[] numArr;
        try {
            numArr = y.get(Integer.valueOf(i2));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? H : numArr;
    }

    private static Integer[] Q(int i2) {
        Integer[] numArr;
        try {
            numArr = w.get(Integer.valueOf(i2));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? i0((long) i2) ? E : D : numArr;
    }

    private static Integer[] R(int i2) {
        Integer[] numArr;
        try {
            numArr = x.get(Integer.valueOf(i2));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? i0((long) i2) ? G : F : numArr;
    }

    private static InputStream T() {
        ZipFile zipFile;
        String property = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigFile");
        if (property == null) {
            property = "hijrah_deviation.cfg";
        }
        String property2 = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigDir");
        if (property2 != null) {
            if (property2.length() != 0 || !property2.endsWith(System.getProperty("file.separator"))) {
                property2 = property2 + System.getProperty("file.separator");
            }
            File file = new File(property2 + t + property);
            if (!file.exists()) {
                return null;
            }
            try {
                return new FileInputStream(file);
            } catch (IOException e2) {
                throw e2;
            }
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.class.path"), u);
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                File file2 = new File(nextToken);
                if (file2.exists()) {
                    if (file2.isDirectory()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(nextToken);
                        char c = t;
                        sb.append(c);
                        String str = v;
                        sb.append(str);
                        if (new File(sb.toString(), property).exists()) {
                            try {
                                return new FileInputStream(nextToken + c + str + c + property);
                            } catch (IOException e3) {
                                throw e3;
                            }
                        }
                    } else {
                        try {
                            zipFile = new ZipFile(file2);
                        } catch (IOException unused) {
                            zipFile = null;
                        }
                        if (zipFile != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(v);
                            char c2 = t;
                            sb2.append(c2);
                            sb2.append(property);
                            String sb3 = sb2.toString();
                            ZipEntry entry = zipFile.getEntry(sb3);
                            if (entry == null) {
                                if (c2 == '/') {
                                    sb3 = sb3.replace('/', '\\');
                                } else if (c2 == '\\') {
                                    sb3 = sb3.replace('\\', '/');
                                }
                                entry = zipFile.getEntry(sb3);
                            }
                            if (entry != null) {
                                try {
                                    return zipFile.getInputStream(entry);
                                } catch (IOException e4) {
                                    throw e4;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return null;
        }
    }

    private static int U(long j2) {
        Long[] lArr = z;
        int i2 = 0;
        while (i2 < lArr.length) {
            try {
                if (j2 < lArr[i2].longValue()) {
                    return i2 - 1;
                }
                i2++;
            } catch (ArrayIndexOutOfBoundsException unused) {
                return ((int) j2) / 10631;
            }
        }
        return ((int) j2) / 10631;
    }

    private static int V(long j2, int i2) {
        Long l2;
        try {
            l2 = z[i2];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l2 = null;
        }
        if (l2 == null) {
            l2 = Long.valueOf((long) (i2 * 10631));
        }
        return (int) (j2 - l2.longValue());
    }

    private static int W(int i2, int i3, int i4) {
        Integer num;
        Integer[] Q = Q(i4);
        if (i2 < 0) {
            i2 = i0((long) i4) ? i2 + 355 : i2 + 354;
            if (i3 <= 0) {
                return i2;
            }
            num = Q[i3];
        } else if (i3 <= 0) {
            return i2;
        } else {
            num = Q[i3];
        }
        return i2 - num.intValue();
    }

    private static int X(int i2, int i3, int i4) {
        Integer[] P = P(i2);
        return i3 > 0 ? i3 - P[i4].intValue() : P[i4].intValue() + i3;
    }

    private static long Z(int i2, int i3, int i4) {
        return B0(i2) + ((long) d0(i3 - 1, i2)) + ((long) i4);
    }

    private static int[] a0(long j2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j3 = j2 - -492148;
        if (j3 >= 0) {
            int U = U(j3);
            int V = V(j3, U);
            int g0 = g0(U, (long) V);
            i5 = X(U, V, g0);
            i6 = (U * 30) + g0 + 1;
            i4 = f0(i5, i6);
            i3 = W(i5, i4, i6) + 1;
            i2 = l.AH.getValue();
        } else {
            int i7 = (int) j3;
            int i8 = i7 / 10631;
            int i9 = i7 % 10631;
            if (i9 == 0) {
                i9 = -10631;
                i8++;
            }
            int g02 = g0(i8, (long) i9);
            int X = X(i8, i9, g02);
            int i10 = 1 - ((i8 * 30) - g02);
            int i11 = i0((long) i10) ? X + 355 : X + 354;
            i4 = f0(i11, i10);
            i3 = W(i11, i4, i10) + 1;
            i2 = l.BEFORE_AH.getValue();
            int i12 = i10;
            i5 = i11;
            i6 = i12;
        }
        int i13 = (int) ((j3 + 5) % 7);
        return new int[]{i2, i6, i4 + 1, i3, i5 + 1, i13 + (i13 <= 0 ? 7 : 0)};
    }

    static int b0() {
        return C[5].intValue();
    }

    static int c0() {
        return C[6].intValue();
    }

    private static int d0(int i2, int i3) {
        return Q(i3)[i2].intValue();
    }

    static int e0(int i2, int i3) {
        return R(i3)[i2].intValue();
    }

    private static int f0(int i2, int i3) {
        Integer[] Q = Q(i3);
        int i4 = 0;
        if (i2 >= 0) {
            while (i4 < Q.length) {
                if (i2 < Q[i4].intValue()) {
                    return i4 - 1;
                }
                i4++;
            }
            return 11;
        }
        int i5 = i0((long) i3) ? i2 + 355 : i2 + 354;
        while (i4 < Q.length) {
            if (i5 < Q[i4].intValue()) {
                return i4 - 1;
            }
            i4++;
        }
        return 11;
    }

    private static int g0(int i2, long j2) {
        Integer[] P = P(i2);
        int i3 = 0;
        int i4 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i4 == 0) {
            return 0;
        }
        if (i4 > 0) {
            while (i3 < P.length) {
                if (j2 < ((long) P[i3].intValue())) {
                    return i3 - 1;
                }
                i3++;
            }
            return 29;
        }
        long j3 = -j2;
        while (i3 < P.length) {
            if (j3 <= ((long) P[i3].intValue())) {
                return i3 - 1;
            }
            i3++;
        }
        return 29;
    }

    static int h0(int i2) {
        Integer[] numArr;
        int i3 = i2 - 1;
        int i4 = i3 / 30;
        try {
            numArr = y.get(Integer.valueOf(i4));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            return i0((long) i2) ? 355 : 354;
        }
        int i5 = i3 % 30;
        if (i5 != 29) {
            return numArr[i5 + 1].intValue() - numArr[i5].intValue();
        }
        Long[] lArr = z;
        return (lArr[i4 + 1].intValue() - lArr[i4].intValue()) - numArr[i5].intValue();
    }

    static boolean i0(long j2) {
        if (j2 <= 0) {
            j2 = -j2;
        }
        return ((j2 * 11) + 14) % 30 < 11;
    }

    public static k m0(int i2, int i3, int i4) {
        return i2 >= 1 ? n0(l.AH, i2, i3, i4) : n0(l.BEFORE_AH, 1 - i2, i3, i4);
    }

    static k n0(l lVar, int i2, int i3, int i4) {
        d.i(lVar, "era");
        O(i2);
        N(i3);
        L(i4);
        return new k(Z(lVar.c(i2), i3, i4));
    }

    static k o0(long j2) {
        return new k(j2);
    }

    private static void p0(String str, int i2) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(58);
            if (indexOf != -1) {
                try {
                    int parseInt = Integer.parseInt(nextToken.substring(indexOf + 1, nextToken.length()));
                    int indexOf2 = nextToken.indexOf(45);
                    if (indexOf2 != -1) {
                        String substring = nextToken.substring(0, indexOf2);
                        String substring2 = nextToken.substring(indexOf2 + 1, indexOf);
                        int indexOf3 = substring.indexOf(47);
                        int indexOf4 = substring2.indexOf(47);
                        if (indexOf3 != -1) {
                            String substring3 = substring.substring(0, indexOf3);
                            String substring4 = substring.substring(indexOf3 + 1, substring.length());
                            try {
                                int parseInt2 = Integer.parseInt(substring3);
                                try {
                                    int parseInt3 = Integer.parseInt(substring4);
                                    if (indexOf4 != -1) {
                                        String substring5 = substring2.substring(0, indexOf4);
                                        String substring6 = substring2.substring(indexOf4 + 1, substring2.length());
                                        try {
                                            int parseInt4 = Integer.parseInt(substring5);
                                            try {
                                                int parseInt5 = Integer.parseInt(substring6);
                                                if (parseInt2 == -1 || parseInt3 == -1 || parseInt4 == -1 || parseInt5 == -1) {
                                                    throw new ParseException("Unknown error at line " + i2 + ".", i2);
                                                }
                                                K(parseInt2, parseInt3, parseInt4, parseInt5, parseInt);
                                            } catch (NumberFormatException unused) {
                                                throw new ParseException("End month is not properly set at line " + i2 + ".", i2);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            throw new ParseException("End year is not properly set at line " + i2 + ".", i2);
                                        }
                                    } else {
                                        throw new ParseException("End year/month has incorrect format at line " + i2 + ".", i2);
                                    }
                                } catch (NumberFormatException unused3) {
                                    throw new ParseException("Start month is not properly set at line " + i2 + ".", i2);
                                }
                            } catch (NumberFormatException unused4) {
                                throw new ParseException("Start year is not properly set at line " + i2 + ".", i2);
                            }
                        } else {
                            throw new ParseException("Start year/month has incorrect format at line " + i2 + ".", i2);
                        }
                    } else {
                        throw new ParseException("Start and end year/month has incorrect format at line " + i2 + ".", i2);
                    }
                } catch (NumberFormatException unused5) {
                    throw new ParseException("Offset is not properly set at line " + i2 + ".", i2);
                }
            } else {
                throw new ParseException("Offset has incorrect format at line " + i2 + ".", i2);
            }
        }
    }

    private Object readResolve() {
        return new k(this.f5614k);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void v0() {
        /*
            java.io.InputStream r0 = T()
            if (r0 == 0) goto L_0x0030
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0029 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0029 }
            r3.<init>(r0)     // Catch:{ all -> 0x0029 }
            r2.<init>(r3)     // Catch:{ all -> 0x0029 }
            r0 = 0
        L_0x0012:
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0022
            int r0 = r0 + 1
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x0026 }
            p0(r1, r0)     // Catch:{ all -> 0x0026 }
            goto L_0x0012
        L_0x0022:
            r2.close()
            goto L_0x0030
        L_0x0026:
            r0 = move-exception
            r1 = r2
            goto L_0x002a
        L_0x0029:
            r0 = move-exception
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            throw r0
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b.a.u.k.v0():void");
    }

    static b w0(DataInput dataInput) {
        return j.f5596g.x(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private Object writeReplace() {
        return new u((byte) 3, this);
    }

    private static k x0(int i2, int i3, int i4) {
        int d0 = d0(i3 - 1, i2);
        if (i4 > d0) {
            i4 = d0;
        }
        return m0(i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    public void A0(DataOutput dataOutput) {
        dataOutput.writeInt(l(r.b.a.x.a.YEAR));
        dataOutput.writeByte(l(r.b.a.x.a.MONTH_OF_YEAR));
        dataOutput.writeByte(l(r.b.a.x.a.DAY_OF_MONTH));
    }

    public long D() {
        return Z(this.f5609f, this.f5610g, this.f5611h);
    }

    /* renamed from: S */
    public j x() {
        return j.f5596g;
    }

    /* renamed from: Y */
    public l y() {
        return this.f5608e;
    }

    public n d(i iVar) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return iVar.h(this);
        }
        if (j(iVar)) {
            r.b.a.x.a aVar = (r.b.a.x.a) iVar;
            int i2 = a.a[aVar.ordinal()];
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? x().A(aVar) : n.i(1, 1000) : n.i(1, 5) : n.i(1, (long) k0()) : n.i(1, (long) j0());
        }
        throw new m("Unsupported field: " + iVar);
    }

    public int j0() {
        return e0(this.f5610g - 1, this.f5609f);
    }

    public int k0() {
        return h0(this.f5609f);
    }

    /* renamed from: l0 */
    public k m(long j2, l lVar) {
        return (k) super.m(j2, lVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r4 = (r4 - 1) / 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        r4 = (r4 - 1) % 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        return (long) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long n(r.b.a.x.i r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof r.b.a.x.a
            if (r0 == 0) goto L_0x005f
            int[] r0 = r.b.a.u.k.a.a
            r1 = r4
            r.b.a.x.a r1 = (r.b.a.x.a) r1
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x005c;
                case 2: goto L_0x0059;
                case 3: goto L_0x0056;
                case 4: goto L_0x0031;
                case 5: goto L_0x004f;
                case 6: goto L_0x004c;
                case 7: goto L_0x0045;
                case 8: goto L_0x0040;
                case 9: goto L_0x0037;
                case 10: goto L_0x0034;
                case 11: goto L_0x0031;
                case 12: goto L_0x0029;
                default: goto L_0x0012;
            }
        L_0x0012:
            r.b.a.x.m r0 = new r.b.a.x.m
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported field: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x0029:
            r.b.a.u.l r4 = r3.f5608e
            int r4 = r4.getValue()
        L_0x002f:
            long r0 = (long) r4
            return r0
        L_0x0031:
            int r4 = r3.f5609f
            goto L_0x002f
        L_0x0034:
            int r4 = r3.f5610g
            goto L_0x002f
        L_0x0037:
            int r4 = r3.f5612i
        L_0x0039:
            int r4 = r4 + -1
            int r4 = r4 / 7
        L_0x003d:
            int r4 = r4 + 1
            goto L_0x002f
        L_0x0040:
            long r0 = r3.D()
            return r0
        L_0x0045:
            int r4 = r3.f5612i
        L_0x0047:
            int r4 = r4 + -1
            int r4 = r4 % 7
            goto L_0x003d
        L_0x004c:
            int r4 = r3.f5611h
            goto L_0x0047
        L_0x004f:
            r.b.a.c r4 = r3.f5613j
            int r4 = r4.getValue()
            goto L_0x002f
        L_0x0056:
            int r4 = r3.f5611h
            goto L_0x0039
        L_0x0059:
            int r4 = r3.f5612i
            goto L_0x002f
        L_0x005c:
            int r4 = r3.f5611h
            goto L_0x002f
        L_0x005f:
            long r0 = r4.f(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b.a.u.k.n(r.b.a.x.i):long");
    }

    /* renamed from: q0 */
    public k s(long j2, l lVar) {
        return (k) super.s(j2, lVar);
    }

    /* renamed from: r0 */
    public k C(h hVar) {
        return (k) super.C(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public k H(long j2) {
        return new k(this.f5614k + j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public k I(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.f5610g - 1) + ((int) j2);
        int i3 = i2 / 12;
        int i4 = i2 % 12;
        while (i4 < 0) {
            i4 += 12;
            i3 = d.n(i3, 1);
        }
        return n0(this.f5608e, d.j(this.f5609f, i3), i4 + 1, this.f5611h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public k J(long j2) {
        if (j2 == 0) {
            return this;
        }
        return n0(this.f5608e, d.j(this.f5609f, (int) j2), this.f5610g, this.f5611h);
    }

    public final c<k> v(r.b.a.h hVar) {
        return super.v(hVar);
    }

    /* renamed from: y0 */
    public k h(f fVar) {
        return (k) super.h(fVar);
    }

    /* renamed from: z0 */
    public k k(i iVar, long j2) {
        if (!(iVar instanceof r.b.a.x.a)) {
            return (k) iVar.d(this, j2);
        }
        r.b.a.x.a aVar = (r.b.a.x.a) iVar;
        aVar.m(j2);
        int i2 = (int) j2;
        switch (a.a[aVar.ordinal()]) {
            case 1:
                return x0(this.f5609f, this.f5610g, i2);
            case 2:
                int i3 = i2 - 1;
                return x0(this.f5609f, (i3 / 30) + 1, (i3 % 30) + 1);
            case 3:
                return H((j2 - n(r.b.a.x.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                if (this.f5609f < 1) {
                    i2 = 1 - i2;
                }
                return x0(i2, this.f5610g, this.f5611h);
            case 5:
                return H(j2 - ((long) this.f5613j.getValue()));
            case 6:
                return H(j2 - n(r.b.a.x.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return H(j2 - n(r.b.a.x.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return new k((long) i2);
            case 9:
                return H((j2 - n(r.b.a.x.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 10:
                return x0(this.f5609f, i2, this.f5611h);
            case 11:
                return x0(i2, this.f5610g, this.f5611h);
            case 12:
                return x0(1 - this.f5609f, this.f5610g, this.f5611h);
            default:
                throw new m("Unsupported field: " + iVar);
        }
    }
}
