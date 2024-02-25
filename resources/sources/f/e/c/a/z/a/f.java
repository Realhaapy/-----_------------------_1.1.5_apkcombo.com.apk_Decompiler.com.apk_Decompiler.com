package f.e.c.a.z.a;

import f.e.c.a.z.a.u1;
import java.nio.ByteBuffer;
import java.util.List;

abstract class f implements g1 {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                f.e.c.a.z.a.u1$b[] r0 = f.e.c.a.z.a.u1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0060 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006c }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0084 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0090 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x009c }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00cc }
                f.e.c.a.z.a.u1$b r1 = f.e.c.a.z.a.u1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.z.a.f.a.<clinit>():void");
        }
    }

    private static final class b extends f {
        private final boolean a;
        private final byte[] b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private int f4096d;

        /* renamed from: e  reason: collision with root package name */
        private int f4097e;

        /* renamed from: f  reason: collision with root package name */
        private int f4098f;

        public b(ByteBuffer byteBuffer, boolean z) {
            super((a) null);
            this.a = z;
            this.b = byteBuffer.array();
            this.c = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f4096d = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean R() {
            return this.c == this.f4096d;
        }

        private byte S() {
            int i2 = this.c;
            if (i2 != this.f4096d) {
                byte[] bArr = this.b;
                this.c = i2 + 1;
                return bArr[i2];
            }
            throw c0.j();
        }

        private Object T(u1.b bVar, Class<?> cls, q qVar) {
            switch (a.a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(t());
                case 2:
                    return z();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(c());
                case 5:
                    return Integer.valueOf(r());
                case 6:
                    return Long.valueOf(h());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(C());
                case 9:
                    return Long.valueOf(L());
                case 10:
                    return s(cls, qVar);
                case 11:
                    return Integer.valueOf(E());
                case 12:
                    return Long.valueOf(w());
                case 13:
                    return Integer.valueOf(j());
                case 14:
                    return Long.valueOf(l());
                case 15:
                    return M();
                case 16:
                    return Integer.valueOf(B());
                case 17:
                    return Long.valueOf(f());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private <T> T U(h1<T> h1Var, q qVar) {
            int i2 = this.f4098f;
            this.f4098f = u1.c(u1.a(this.f4097e), 4);
            try {
                T i3 = h1Var.i();
                h1Var.d(i3, this, qVar);
                h1Var.e(i3);
                if (this.f4097e == this.f4098f) {
                    return i3;
                }
                throw c0.g();
            } finally {
                this.f4098f = i2;
            }
        }

        private int V() {
            f0(4);
            return W();
        }

        private int W() {
            int i2 = this.c;
            byte[] bArr = this.b;
            this.c = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }

        private long X() {
            f0(8);
            return Y();
        }

        private long Y() {
            int i2 = this.c;
            byte[] bArr = this.b;
            this.c = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }

        private <T> T Z(h1<T> h1Var, q qVar) {
            int c0 = c0();
            f0(c0);
            int i2 = this.f4096d;
            int i3 = this.c + c0;
            this.f4096d = i3;
            try {
                T i4 = h1Var.i();
                h1Var.d(i4, this, qVar);
                h1Var.e(i4);
                if (this.c == i3) {
                    return i4;
                }
                throw c0.g();
            } finally {
                this.f4096d = i2;
            }
        }

        private int c0() {
            byte b2;
            int i2 = this.c;
            int i3 = this.f4096d;
            if (i3 != i2) {
                byte[] bArr = this.b;
                int i4 = i2 + 1;
                byte b3 = bArr[i2];
                if (b3 >= 0) {
                    this.c = i4;
                    return b3;
                } else if (i3 - i4 < 9) {
                    return (int) e0();
                } else {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << 7);
                    if (b4 < 0) {
                        b2 = b4 ^ Byte.MIN_VALUE;
                    } else {
                        int i6 = i5 + 1;
                        byte b5 = b4 ^ (bArr[i5] << 14);
                        if (b5 >= 0) {
                            b2 = b5 ^ 16256;
                        } else {
                            i5 = i6 + 1;
                            byte b6 = b5 ^ (bArr[i6] << 21);
                            if (b6 < 0) {
                                b2 = b6 ^ -2080896;
                            } else {
                                i6 = i5 + 1;
                                byte b7 = bArr[i5];
                                b2 = (b6 ^ (b7 << 28)) ^ 266354560;
                                if (b7 < 0) {
                                    i5 = i6 + 1;
                                    if (bArr[i6] < 0) {
                                        i6 = i5 + 1;
                                        if (bArr[i5] < 0) {
                                            i5 = i6 + 1;
                                            if (bArr[i6] < 0) {
                                                i6 = i5 + 1;
                                                if (bArr[i5] < 0) {
                                                    i5 = i6 + 1;
                                                    if (bArr[i6] < 0) {
                                                        throw c0.e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i5 = i6;
                    }
                    this.c = i5;
                    return b2;
                }
            } else {
                throw c0.j();
            }
        }

        private long e0() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte S = S();
                j2 |= ((long) (S & Byte.MAX_VALUE)) << i2;
                if ((S & 128) == 0) {
                    return j2;
                }
            }
            throw c0.e();
        }

        private void f0(int i2) {
            if (i2 < 0 || i2 > this.f4096d - this.c) {
                throw c0.j();
            }
        }

        private void g0(int i2) {
            if (this.c != i2) {
                throw c0.j();
            }
        }

        private void h0(int i2) {
            if (u1.b(this.f4097e) != i2) {
                throw c0.d();
            }
        }

        private void i0(int i2) {
            f0(i2);
            this.c += i2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x001c, LOOP_START] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void j0() {
            /*
                r3 = this;
                int r0 = r3.f4098f
                int r1 = r3.f4097e
                int r1 = f.e.c.a.z.a.u1.a(r1)
                r2 = 4
                int r1 = f.e.c.a.z.a.u1.c(r1, r2)
                r3.f4098f = r1
            L_0x000f:
                int r1 = r3.u()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L_0x001e
                boolean r1 = r3.D()
                if (r1 != 0) goto L_0x000f
            L_0x001e:
                int r1 = r3.f4097e
                int r2 = r3.f4098f
                if (r1 != r2) goto L_0x0027
                r3.f4098f = r0
                return
            L_0x0027:
                f.e.c.a.z.a.c0 r0 = f.e.c.a.z.a.c0.g()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.z.a.f.b.j0():void");
        }

        private void k0() {
            int i2 = this.f4096d;
            int i3 = this.c;
            if (i2 - i3 >= 10) {
                byte[] bArr = this.b;
                int i4 = 0;
                while (i4 < 10) {
                    int i5 = i3 + 1;
                    if (bArr[i3] >= 0) {
                        this.c = i5;
                        return;
                    } else {
                        i4++;
                        i3 = i5;
                    }
                }
            }
            l0();
        }

        private void l0() {
            int i2 = 0;
            while (i2 < 10) {
                if (S() < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw c0.e();
        }

        private void m0(int i2) {
            f0(i2);
            if ((i2 & 3) != 0) {
                throw c0.g();
            }
        }

        private void n0(int i2) {
            f0(i2);
            if ((i2 & 7) != 0) {
                throw c0.g();
            }
        }

        public void A(List<Float> list) {
            int i2;
            int i3;
            if (list instanceof x) {
                x xVar = (x) list;
                int b2 = u1.b(this.f4097e);
                if (b2 == 2) {
                    int c0 = c0();
                    m0(c0);
                    int i4 = this.c + c0;
                    while (this.c < i4) {
                        xVar.k(Float.intBitsToFloat(W()));
                    }
                } else if (b2 == 5) {
                    do {
                        xVar.k(readFloat());
                        if (!R()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i3;
                } else {
                    throw c0.d();
                }
            } else {
                int b3 = u1.b(this.f4097e);
                if (b3 == 2) {
                    int c02 = c0();
                    m0(c02);
                    int i5 = this.c + c02;
                    while (this.c < i5) {
                        list.add(Float.valueOf(Float.intBitsToFloat(W())));
                    }
                } else if (b3 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i2;
                } else {
                    throw c0.d();
                }
            }
        }

        public int B() {
            h0(0);
            return c0();
        }

        public int C() {
            h0(0);
            return c0();
        }

        public boolean D() {
            int i2;
            int i3;
            if (R() || (i2 = this.f4097e) == this.f4098f) {
                return false;
            }
            int b2 = u1.b(i2);
            if (b2 != 0) {
                if (b2 == 1) {
                    i3 = 8;
                } else if (b2 == 2) {
                    i3 = c0();
                } else if (b2 == 3) {
                    j0();
                    return true;
                } else if (b2 == 5) {
                    i3 = 4;
                } else {
                    throw c0.d();
                }
                i0(i3);
                return true;
            }
            k0();
            return true;
        }

        public int E() {
            h0(5);
            return V();
        }

        public void F(List<i> list) {
            int i2;
            if (u1.b(this.f4097e) == 2) {
                do {
                    list.add(z());
                    if (!R()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (c0() == this.f4097e);
                this.c = i2;
                return;
            }
            throw c0.d();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|(2:22|35)(3:30|23|24)) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
            if (D() != false) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
            throw new f.e.c.a.z.a.c0("Unable to parse map entry.");
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <K, V> void G(java.util.Map<K, V> r8, f.e.c.a.z.a.l0.a<K, V> r9, f.e.c.a.z.a.q r10) {
            /*
                r7 = this;
                r0 = 2
                r7.h0(r0)
                int r1 = r7.c0()
                r7.f0(r1)
                int r2 = r7.f4096d
                int r3 = r7.c
                int r3 = r3 + r1
                r7.f4096d = r3
                K r1 = r9.b     // Catch:{ all -> 0x005b }
                V r3 = r9.f4152d     // Catch:{ all -> 0x005b }
            L_0x0016:
                int r4 = r7.u()     // Catch:{ all -> 0x005b }
                r5 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r5) goto L_0x0025
                r8.put(r1, r3)     // Catch:{ all -> 0x005b }
                r7.f4096d = r2
                return
            L_0x0025:
                r5 = 1
                java.lang.String r6 = "Unable to parse map entry."
                if (r4 == r5) goto L_0x0046
                if (r4 == r0) goto L_0x0039
                boolean r4 = r7.D()     // Catch:{ a -> 0x004e }
                if (r4 == 0) goto L_0x0033
                goto L_0x0016
            L_0x0033:
                f.e.c.a.z.a.c0 r4 = new f.e.c.a.z.a.c0     // Catch:{ a -> 0x004e }
                r4.<init>(r6)     // Catch:{ a -> 0x004e }
                throw r4     // Catch:{ a -> 0x004e }
            L_0x0039:
                f.e.c.a.z.a.u1$b r4 = r9.c     // Catch:{ a -> 0x004e }
                V r5 = r9.f4152d     // Catch:{ a -> 0x004e }
                java.lang.Class r5 = r5.getClass()     // Catch:{ a -> 0x004e }
                java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch:{ a -> 0x004e }
                goto L_0x0016
            L_0x0046:
                f.e.c.a.z.a.u1$b r4 = r9.a     // Catch:{ a -> 0x004e }
                r5 = 0
                java.lang.Object r1 = r7.T(r4, r5, r5)     // Catch:{ a -> 0x004e }
                goto L_0x0016
            L_0x004e:
                boolean r4 = r7.D()     // Catch:{ all -> 0x005b }
                if (r4 == 0) goto L_0x0055
                goto L_0x0016
            L_0x0055:
                f.e.c.a.z.a.c0 r8 = new f.e.c.a.z.a.c0     // Catch:{ all -> 0x005b }
                r8.<init>(r6)     // Catch:{ all -> 0x005b }
                throw r8     // Catch:{ all -> 0x005b }
            L_0x005b:
                r8 = move-exception
                r7.f4096d = r2
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.z.a.f.b.G(java.util.Map, f.e.c.a.z.a.l0$a, f.e.c.a.z.a.q):void");
        }

        public void H(List<Double> list) {
            int i2;
            int i3;
            if (list instanceof n) {
                n nVar = (n) list;
                int b2 = u1.b(this.f4097e);
                if (b2 == 1) {
                    do {
                        nVar.k(readDouble());
                        if (!R()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i3;
                } else if (b2 == 2) {
                    int c0 = c0();
                    n0(c0);
                    int i4 = this.c + c0;
                    while (this.c < i4) {
                        nVar.k(Double.longBitsToDouble(Y()));
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b3 = u1.b(this.f4097e);
                if (b3 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i2;
                } else if (b3 == 2) {
                    int c02 = c0();
                    n0(c02);
                    int i5 = this.c + c02;
                    while (this.c < i5) {
                        list.add(Double.valueOf(Double.longBitsToDouble(Y())));
                    }
                } else {
                    throw c0.d();
                }
            }
        }

        public void I(List<Long> list) {
            int i2;
            int i3;
            int i4;
            if (list instanceof j0) {
                j0 j0Var = (j0) list;
                int b2 = u1.b(this.f4097e);
                if (b2 == 0) {
                    do {
                        j0Var.l(L());
                        if (!R()) {
                            i4 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i4;
                    return;
                } else if (b2 == 2) {
                    i2 = this.c + c0();
                    while (this.c < i2) {
                        j0Var.l(d0());
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b3 = u1.b(this.f4097e);
                if (b3 == 0) {
                    do {
                        list.add(Long.valueOf(L()));
                        if (!R()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i3;
                    return;
                } else if (b3 == 2) {
                    i2 = this.c + c0();
                    while (this.c < i2) {
                        list.add(Long.valueOf(d0()));
                    }
                } else {
                    throw c0.d();
                }
            }
            g0(i2);
        }

        public void J(List<Long> list) {
            int i2;
            int i3;
            if (list instanceof j0) {
                j0 j0Var = (j0) list;
                int b2 = u1.b(this.f4097e);
                if (b2 == 1) {
                    do {
                        j0Var.l(w());
                        if (!R()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i3;
                } else if (b2 == 2) {
                    int c0 = c0();
                    n0(c0);
                    int i4 = this.c + c0;
                    while (this.c < i4) {
                        j0Var.l(Y());
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b3 = u1.b(this.f4097e);
                if (b3 == 1) {
                    do {
                        list.add(Long.valueOf(w()));
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i2;
                } else if (b3 == 2) {
                    int c02 = c0();
                    n0(c02);
                    int i5 = this.c + c02;
                    while (this.c < i5) {
                        list.add(Long.valueOf(Y()));
                    }
                } else {
                    throw c0.d();
                }
            }
        }

        public <T> void K(List<T> list, h1<T> h1Var, q qVar) {
            int i2;
            if (u1.b(this.f4097e) == 3) {
                int i3 = this.f4097e;
                do {
                    list.add(U(h1Var, qVar));
                    if (!R()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (c0() == i3);
                this.c = i2;
                return;
            }
            throw c0.d();
        }

        public long L() {
            h0(0);
            return d0();
        }

        public String M() {
            return a0(true);
        }

        public void N(List<Long> list) {
            int i2;
            int i3;
            if (list instanceof j0) {
                j0 j0Var = (j0) list;
                int b2 = u1.b(this.f4097e);
                if (b2 == 1) {
                    do {
                        j0Var.l(h());
                        if (!R()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i3;
                } else if (b2 == 2) {
                    int c0 = c0();
                    n0(c0);
                    int i4 = this.c + c0;
                    while (this.c < i4) {
                        j0Var.l(Y());
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b3 = u1.b(this.f4097e);
                if (b3 == 1) {
                    do {
                        list.add(Long.valueOf(h()));
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i2;
                } else if (b3 == 2) {
                    int c02 = c0();
                    n0(c02);
                    int i5 = this.c + c02;
                    while (this.c < i5) {
                        list.add(Long.valueOf(Y()));
                    }
                } else {
                    throw c0.d();
                }
            }
        }

        public void O(List<Integer> list) {
            int i2;
            int i3;
            int i4;
            if (list instanceof a0) {
                a0 a0Var = (a0) list;
                int b2 = u1.b(this.f4097e);
                if (b2 == 0) {
                    do {
                        a0Var.k(C());
                        if (!R()) {
                            i4 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i4;
                    return;
                } else if (b2 == 2) {
                    i2 = this.c + c0();
                    while (this.c < i2) {
                        a0Var.k(c0());
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b3 = u1.b(this.f4097e);
                if (b3 == 0) {
                    do {
                        list.add(Integer.valueOf(C()));
                        if (!R()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i3;
                    return;
                } else if (b3 == 2) {
                    i2 = this.c + c0();
                    while (this.c < i2) {
                        list.add(Integer.valueOf(c0()));
                    }
                } else {
                    throw c0.d();
                }
            }
            g0(i2);
        }

        public void P(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof a0) {
                a0 a0Var = (a0) list;
                int b2 = u1.b(this.f4097e);
                if (b2 == 0) {
                    do {
                        a0Var.k(c());
                        if (!R()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i3;
                } else if (b2 == 2) {
                    int c0 = this.c + c0();
                    while (this.c < c0) {
                        a0Var.k(c0());
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b3 = u1.b(this.f4097e);
                if (b3 == 0) {
                    do {
                        list.add(Integer.valueOf(c()));
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i2;
                } else if (b3 == 2) {
                    int c02 = this.c + c0();
                    while (this.c < c02) {
                        list.add(Integer.valueOf(c0()));
                    }
                } else {
                    throw c0.d();
                }
            }
        }

        public <T> T a(h1<T> h1Var, q qVar) {
            h0(3);
            return U(h1Var, qVar);
        }

        public String a0(boolean z) {
            h0(2);
            int c0 = c0();
            if (c0 == 0) {
                return "";
            }
            f0(c0);
            if (z) {
                byte[] bArr = this.b;
                int i2 = this.c;
                if (!t1.n(bArr, i2, i2 + c0)) {
                    throw c0.c();
                }
            }
            String str = new String(this.b, this.c, c0, b0.a);
            this.c += c0;
            return str;
        }

        public void b(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof a0) {
                a0 a0Var = (a0) list;
                int b2 = u1.b(this.f4097e);
                if (b2 == 0) {
                    do {
                        a0Var.k(j());
                        if (!R()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i3;
                } else if (b2 == 2) {
                    int c0 = this.c + c0();
                    while (this.c < c0) {
                        a0Var.k(j.b(c0()));
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b3 = u1.b(this.f4097e);
                if (b3 == 0) {
                    do {
                        list.add(Integer.valueOf(j()));
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i2;
                } else if (b3 == 2) {
                    int c02 = this.c + c0();
                    while (this.c < c02) {
                        list.add(Integer.valueOf(j.b(c0())));
                    }
                } else {
                    throw c0.d();
                }
            }
        }

        public void b0(List<String> list, boolean z) {
            int i2;
            int i3;
            if (u1.b(this.f4097e) != 2) {
                throw c0.d();
            } else if (!(list instanceof h0) || z) {
                do {
                    list.add(a0(z));
                    if (!R()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (c0() == this.f4097e);
                this.c = i2;
            } else {
                h0 h0Var = (h0) list;
                do {
                    h0Var.c(z());
                    if (!R()) {
                        i3 = this.c;
                    } else {
                        return;
                    }
                } while (c0() == this.f4097e);
                this.c = i3;
            }
        }

        public int c() {
            h0(0);
            return c0();
        }

        public <T> T d(h1<T> h1Var, q qVar) {
            h0(2);
            return Z(h1Var, qVar);
        }

        public long d0() {
            long j2;
            int i2;
            long j3;
            long j4;
            byte b2;
            int i3 = this.c;
            int i4 = this.f4096d;
            if (i4 != i3) {
                byte[] bArr = this.b;
                int i5 = i3 + 1;
                byte b3 = bArr[i3];
                if (b3 >= 0) {
                    this.c = i5;
                    return (long) b3;
                } else if (i4 - i5 < 9) {
                    return e0();
                } else {
                    int i6 = i5 + 1;
                    byte b4 = b3 ^ (bArr[i5] << 7);
                    if (b4 < 0) {
                        b2 = b4 ^ Byte.MIN_VALUE;
                    } else {
                        int i7 = i6 + 1;
                        byte b5 = b4 ^ (bArr[i6] << 14);
                        if (b5 >= 0) {
                            i2 = i7;
                            j2 = (long) (b5 ^ 16256);
                        } else {
                            i6 = i7 + 1;
                            byte b6 = b5 ^ (bArr[i7] << 21);
                            if (b6 < 0) {
                                b2 = b6 ^ -2080896;
                            } else {
                                long j5 = (long) b6;
                                int i8 = i6 + 1;
                                long j6 = j5 ^ (((long) bArr[i6]) << 28);
                                if (j6 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    int i9 = i8 + 1;
                                    long j7 = j6 ^ (((long) bArr[i8]) << 35);
                                    if (j7 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i8 = i9 + 1;
                                        j6 = j7 ^ (((long) bArr[i9]) << 42);
                                        if (j6 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            i9 = i8 + 1;
                                            j7 = j6 ^ (((long) bArr[i8]) << 49);
                                            if (j7 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                int i10 = i9 + 1;
                                                long j8 = (j7 ^ (((long) bArr[i9]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    i2 = i10 + 1;
                                                    if (((long) bArr[i10]) < 0) {
                                                        throw c0.e();
                                                    }
                                                } else {
                                                    i2 = i10;
                                                }
                                                j2 = j8;
                                            }
                                        }
                                    }
                                    j2 = j7 ^ j3;
                                }
                                j2 = j6 ^ j4;
                                i2 = i8;
                            }
                        }
                        this.c = i2;
                        return j2;
                    }
                    j2 = (long) b2;
                    this.c = i2;
                    return j2;
                }
            } else {
                throw c0.j();
            }
        }

        public int e() {
            return this.f4097e;
        }

        public long f() {
            h0(0);
            return d0();
        }

        public void g(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof a0) {
                a0 a0Var = (a0) list;
                int b2 = u1.b(this.f4097e);
                if (b2 == 2) {
                    int c0 = c0();
                    m0(c0);
                    int i4 = this.c + c0;
                    while (this.c < i4) {
                        a0Var.k(W());
                    }
                } else if (b2 == 5) {
                    do {
                        a0Var.k(r());
                        if (!R()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i3;
                } else {
                    throw c0.d();
                }
            } else {
                int b3 = u1.b(this.f4097e);
                if (b3 == 2) {
                    int c02 = c0();
                    m0(c02);
                    int i5 = this.c + c02;
                    while (this.c < i5) {
                        list.add(Integer.valueOf(W()));
                    }
                } else if (b3 == 5) {
                    do {
                        list.add(Integer.valueOf(r()));
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i2;
                } else {
                    throw c0.d();
                }
            }
        }

        public long h() {
            h0(1);
            return X();
        }

        public void i(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof a0) {
                a0 a0Var = (a0) list;
                int b2 = u1.b(this.f4097e);
                if (b2 == 2) {
                    int c0 = c0();
                    m0(c0);
                    int i4 = this.c + c0;
                    while (this.c < i4) {
                        a0Var.k(W());
                    }
                } else if (b2 == 5) {
                    do {
                        a0Var.k(E());
                        if (!R()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i3;
                } else {
                    throw c0.d();
                }
            } else {
                int b3 = u1.b(this.f4097e);
                if (b3 == 2) {
                    int c02 = c0();
                    m0(c02);
                    int i5 = this.c + c02;
                    while (this.c < i5) {
                        list.add(Integer.valueOf(W()));
                    }
                } else if (b3 == 5) {
                    do {
                        list.add(Integer.valueOf(E()));
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i2;
                } else {
                    throw c0.d();
                }
            }
        }

        public int j() {
            h0(0);
            return j.b(c0());
        }

        public void k(List<Long> list) {
            int i2;
            int i3;
            if (list instanceof j0) {
                j0 j0Var = (j0) list;
                int b2 = u1.b(this.f4097e);
                if (b2 == 0) {
                    do {
                        j0Var.l(l());
                        if (!R()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i3;
                } else if (b2 == 2) {
                    int c0 = this.c + c0();
                    while (this.c < c0) {
                        j0Var.l(j.c(d0()));
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b3 = u1.b(this.f4097e);
                if (b3 == 0) {
                    do {
                        list.add(Long.valueOf(l()));
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i2;
                } else if (b3 == 2) {
                    int c02 = this.c + c0();
                    while (this.c < c02) {
                        list.add(Long.valueOf(j.c(d0())));
                    }
                } else {
                    throw c0.d();
                }
            }
        }

        public long l() {
            h0(0);
            return j.c(d0());
        }

        public void m(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof a0) {
                a0 a0Var = (a0) list;
                int b2 = u1.b(this.f4097e);
                if (b2 == 0) {
                    do {
                        a0Var.k(B());
                        if (!R()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i3;
                } else if (b2 == 2) {
                    int c0 = this.c + c0();
                    while (this.c < c0) {
                        a0Var.k(c0());
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b3 = u1.b(this.f4097e);
                if (b3 == 0) {
                    do {
                        list.add(Integer.valueOf(B()));
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i2;
                } else if (b3 == 2) {
                    int c02 = this.c + c0();
                    while (this.c < c02) {
                        list.add(Integer.valueOf(c0()));
                    }
                } else {
                    throw c0.d();
                }
            }
        }

        public <T> T n(Class<T> cls, q qVar) {
            h0(3);
            return U(d1.a().d(cls), qVar);
        }

        public void o(List<Boolean> list) {
            int i2;
            int i3;
            int i4;
            if (list instanceof g) {
                g gVar = (g) list;
                int b2 = u1.b(this.f4097e);
                if (b2 == 0) {
                    do {
                        gVar.l(t());
                        if (!R()) {
                            i4 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i4;
                    return;
                } else if (b2 == 2) {
                    i2 = this.c + c0();
                    while (this.c < i2) {
                        gVar.l(c0() != 0);
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b3 = u1.b(this.f4097e);
                if (b3 == 0) {
                    do {
                        list.add(Boolean.valueOf(t()));
                        if (!R()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i3;
                    return;
                } else if (b3 == 2) {
                    i2 = this.c + c0();
                    while (this.c < i2) {
                        list.add(Boolean.valueOf(c0() != 0));
                    }
                } else {
                    throw c0.d();
                }
            }
            g0(i2);
        }

        public String p() {
            return a0(false);
        }

        public <T> void q(List<T> list, h1<T> h1Var, q qVar) {
            int i2;
            if (u1.b(this.f4097e) == 2) {
                int i3 = this.f4097e;
                do {
                    list.add(Z(h1Var, qVar));
                    if (!R()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (c0() == i3);
                this.c = i2;
                return;
            }
            throw c0.d();
        }

        public int r() {
            h0(5);
            return V();
        }

        public double readDouble() {
            h0(1);
            return Double.longBitsToDouble(X());
        }

        public float readFloat() {
            h0(5);
            return Float.intBitsToFloat(V());
        }

        public <T> T s(Class<T> cls, q qVar) {
            h0(2);
            return Z(d1.a().d(cls), qVar);
        }

        public boolean t() {
            h0(0);
            return c0() != 0;
        }

        public int u() {
            if (R()) {
                return Integer.MAX_VALUE;
            }
            int c0 = c0();
            this.f4097e = c0;
            if (c0 == this.f4098f) {
                return Integer.MAX_VALUE;
            }
            return u1.a(c0);
        }

        public void v(List<String> list) {
            b0(list, false);
        }

        public long w() {
            h0(1);
            return X();
        }

        public void x(List<Long> list) {
            int i2;
            int i3;
            int i4;
            if (list instanceof j0) {
                j0 j0Var = (j0) list;
                int b2 = u1.b(this.f4097e);
                if (b2 == 0) {
                    do {
                        j0Var.l(f());
                        if (!R()) {
                            i4 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i4;
                    return;
                } else if (b2 == 2) {
                    i2 = this.c + c0();
                    while (this.c < i2) {
                        j0Var.l(d0());
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b3 = u1.b(this.f4097e);
                if (b3 == 0) {
                    do {
                        list.add(Long.valueOf(f()));
                        if (!R()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f4097e);
                    this.c = i3;
                    return;
                } else if (b3 == 2) {
                    i2 = this.c + c0();
                    while (this.c < i2) {
                        list.add(Long.valueOf(d0()));
                    }
                } else {
                    throw c0.d();
                }
            }
            g0(i2);
        }

        public void y(List<String> list) {
            b0(list, true);
        }

        public i z() {
            h0(2);
            int c0 = c0();
            if (c0 == 0) {
                return i.f4106f;
            }
            f0(c0);
            i C = this.a ? i.C(this.b, this.c, c0) : i.l(this.b, this.c, c0);
            this.c += c0;
            return C;
        }
    }

    private f() {
    }

    /* synthetic */ f(a aVar) {
        this();
    }

    public static f Q(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
