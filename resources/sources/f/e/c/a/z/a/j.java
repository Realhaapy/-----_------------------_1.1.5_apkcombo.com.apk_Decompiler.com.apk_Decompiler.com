package f.e.c.a.z.a;

import java.util.Arrays;

public abstract class j {
    int a;
    int b;
    k c;

    private static final class b extends j {

        /* renamed from: d  reason: collision with root package name */
        private final byte[] f4115d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f4116e;

        /* renamed from: f  reason: collision with root package name */
        private int f4117f;

        /* renamed from: g  reason: collision with root package name */
        private int f4118g;

        /* renamed from: h  reason: collision with root package name */
        private int f4119h;

        /* renamed from: i  reason: collision with root package name */
        private int f4120i;

        /* renamed from: j  reason: collision with root package name */
        private int f4121j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f4122k;

        /* renamed from: l  reason: collision with root package name */
        private int f4123l;

        private b(byte[] bArr, int i2, int i3, boolean z) {
            super();
            this.f4123l = Integer.MAX_VALUE;
            this.f4115d = bArr;
            this.f4117f = i3 + i2;
            this.f4119h = i2;
            this.f4120i = i2;
            this.f4116e = z;
        }

        private void K() {
            int i2 = this.f4117f + this.f4118g;
            this.f4117f = i2;
            int i3 = i2 - this.f4120i;
            int i4 = this.f4123l;
            if (i3 > i4) {
                int i5 = i3 - i4;
                this.f4118g = i5;
                this.f4117f = i2 - i5;
                return;
            }
            this.f4118g = 0;
        }

        private void N() {
            if (this.f4117f - this.f4119h >= 10) {
                O();
            } else {
                P();
            }
        }

        private void O() {
            int i2 = 0;
            while (i2 < 10) {
                byte[] bArr = this.f4115d;
                int i3 = this.f4119h;
                this.f4119h = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw c0.e();
        }

        private void P() {
            int i2 = 0;
            while (i2 < 10) {
                if (D() < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw c0.e();
        }

        public int A() {
            return H();
        }

        public long B() {
            return I();
        }

        public boolean C(int i2) {
            int b = u1.b(i2);
            if (b == 0) {
                N();
                return true;
            } else if (b == 1) {
                M(8);
                return true;
            } else if (b == 2) {
                M(H());
                return true;
            } else if (b == 3) {
                L();
                a(u1.c(u1.a(i2), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    M(4);
                    return true;
                }
                throw c0.d();
            }
        }

        public byte D() {
            int i2 = this.f4119h;
            if (i2 != this.f4117f) {
                byte[] bArr = this.f4115d;
                this.f4119h = i2 + 1;
                return bArr[i2];
            }
            throw c0.j();
        }

        public byte[] E(int i2) {
            if (i2 > 0) {
                int i3 = this.f4117f;
                int i4 = this.f4119h;
                if (i2 <= i3 - i4) {
                    int i5 = i2 + i4;
                    this.f4119h = i5;
                    return Arrays.copyOfRange(this.f4115d, i4, i5);
                }
            }
            if (i2 > 0) {
                throw c0.j();
            } else if (i2 == 0) {
                return b0.b;
            } else {
                throw c0.f();
            }
        }

        public int F() {
            int i2 = this.f4119h;
            if (this.f4117f - i2 >= 4) {
                byte[] bArr = this.f4115d;
                this.f4119h = i2 + 4;
                return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
            }
            throw c0.j();
        }

        public long G() {
            int i2 = this.f4119h;
            if (this.f4117f - i2 >= 8) {
                byte[] bArr = this.f4115d;
                this.f4119h = i2 + 8;
                return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
            }
            throw c0.j();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int H() {
            /*
                r5 = this;
                int r0 = r5.f4119h
                int r1 = r5.f4117f
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f4115d
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f4119h = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.J()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f4119h = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.z.a.j.b.H():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long I() {
            /*
                r11 = this;
                int r0 = r11.f4119h
                int r1 = r11.f4117f
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f4115d
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f4119h = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.J()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f4119h = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.z.a.j.b.I():long");
        }

        /* access modifiers changed from: package-private */
        public long J() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte D = D();
                j2 |= ((long) (D & Byte.MAX_VALUE)) << i2;
                if ((D & 128) == 0) {
                    return j2;
                }
            }
            throw c0.e();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void L() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.z()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.C(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.z.a.j.b.L():void");
        }

        public void M(int i2) {
            if (i2 >= 0) {
                int i3 = this.f4117f;
                int i4 = this.f4119h;
                if (i2 <= i3 - i4) {
                    this.f4119h = i4 + i2;
                    return;
                }
            }
            if (i2 < 0) {
                throw c0.f();
            }
            throw c0.j();
        }

        public void a(int i2) {
            if (this.f4121j != i2) {
                throw c0.a();
            }
        }

        public int d() {
            return this.f4119h - this.f4120i;
        }

        public boolean e() {
            return this.f4119h == this.f4117f;
        }

        public void i(int i2) {
            this.f4123l = i2;
            K();
        }

        public int j(int i2) {
            if (i2 >= 0) {
                int d2 = i2 + d();
                int i3 = this.f4123l;
                if (d2 <= i3) {
                    this.f4123l = d2;
                    K();
                    return i3;
                }
                throw c0.j();
            }
            throw c0.f();
        }

        public boolean k() {
            return I() != 0;
        }

        public i l() {
            int H = H();
            if (H > 0) {
                int i2 = this.f4117f;
                int i3 = this.f4119h;
                if (H <= i2 - i3) {
                    i l2 = (!this.f4116e || !this.f4122k) ? i.l(this.f4115d, i3, H) : i.C(this.f4115d, i3, H);
                    this.f4119h += H;
                    return l2;
                }
            }
            return H == 0 ? i.f4106f : i.B(E(H));
        }

        public double m() {
            return Double.longBitsToDouble(G());
        }

        public int n() {
            return H();
        }

        public int o() {
            return F();
        }

        public long p() {
            return G();
        }

        public float q() {
            return Float.intBitsToFloat(F());
        }

        public int r() {
            return H();
        }

        public long s() {
            return I();
        }

        public int t() {
            return F();
        }

        public long u() {
            return G();
        }

        public int v() {
            return j.b(H());
        }

        public long w() {
            return j.c(I());
        }

        public String x() {
            int H = H();
            if (H > 0 && H <= this.f4117f - this.f4119h) {
                String str = new String(this.f4115d, this.f4119h, H, b0.a);
                this.f4119h += H;
                return str;
            } else if (H == 0) {
                return "";
            } else {
                if (H < 0) {
                    throw c0.f();
                }
                throw c0.j();
            }
        }

        public String y() {
            int H = H();
            if (H > 0) {
                int i2 = this.f4117f;
                int i3 = this.f4119h;
                if (H <= i2 - i3) {
                    String e2 = t1.e(this.f4115d, i3, H);
                    this.f4119h += H;
                    return e2;
                }
            }
            if (H == 0) {
                return "";
            }
            if (H <= 0) {
                throw c0.f();
            }
            throw c0.j();
        }

        public int z() {
            if (e()) {
                this.f4121j = 0;
                return 0;
            }
            int H = H();
            this.f4121j = H;
            if (u1.a(H) != 0) {
                return this.f4121j;
            }
            throw c0.b();
        }
    }

    private j() {
        this.b = 100;
    }

    public static int b(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long c(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static j f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static j g(byte[] bArr, int i2, int i3) {
        return h(bArr, i2, i3, false);
    }

    static j h(byte[] bArr, int i2, int i3, boolean z) {
        b bVar = new b(bArr, i2, i3, z);
        try {
            bVar.j(i3);
            return bVar;
        } catch (c0 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i2);

    public abstract void a(int i2);

    public abstract int d();

    public abstract boolean e();

    public abstract void i(int i2);

    public abstract int j(int i2);

    public abstract boolean k();

    public abstract i l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();
}
