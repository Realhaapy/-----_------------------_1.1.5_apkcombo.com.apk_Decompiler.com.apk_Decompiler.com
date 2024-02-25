package f.e.c.a.z.a;

final class t1 {
    private static final b a = ((!e.e() || d.c()) ? new c() : new e());

    private static class a {
        /* access modifiers changed from: private */
        public static void h(byte b, byte b2, byte b3, byte b4, char[] cArr, int i2) {
            if (m(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m(b3) || m(b4)) {
                throw c0.c();
            }
            int r2 = ((b & 7) << 18) | (r(b2) << 12) | (r(b3) << 6) | r(b4);
            cArr[i2] = l(r2);
            cArr[i2 + 1] = q(r2);
        }

        /* access modifiers changed from: private */
        public static void i(byte b, char[] cArr, int i2) {
            cArr[i2] = (char) b;
        }

        /* access modifiers changed from: private */
        public static void j(byte b, byte b2, byte b3, char[] cArr, int i2) {
            if (m(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m(b3)))) {
                throw c0.c();
            }
            cArr[i2] = (char) (((b & 15) << 12) | (r(b2) << 6) | r(b3));
        }

        /* access modifiers changed from: private */
        public static void k(byte b, byte b2, char[] cArr, int i2) {
            if (b < -62 || m(b2)) {
                throw c0.c();
            }
            cArr[i2] = (char) (((b & 31) << 6) | r(b2));
        }

        private static char l(int i2) {
            return (char) ((i2 >>> 10) + 55232);
        }

        private static boolean m(byte b) {
            return b > -65;
        }

        /* access modifiers changed from: private */
        public static boolean n(byte b) {
            return b >= 0;
        }

        /* access modifiers changed from: private */
        public static boolean o(byte b) {
            return b < -16;
        }

        /* access modifiers changed from: private */
        public static boolean p(byte b) {
            return b < -32;
        }

        private static char q(int i2) {
            return (char) ((i2 & 1023) + 56320);
        }

        private static int r(byte b) {
            return b & 63;
        }
    }

    static abstract class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public abstract String a(byte[] bArr, int i2, int i3);

        /* access modifiers changed from: package-private */
        public abstract int b(CharSequence charSequence, byte[] bArr, int i2, int i3);

        /* access modifiers changed from: package-private */
        public final boolean c(byte[] bArr, int i2, int i3) {
            return d(0, bArr, i2, i3) == 0;
        }

        /* access modifiers changed from: package-private */
        public abstract int d(int i2, byte[] bArr, int i3, int i4);
    }

    static final class c extends b {
        c() {
        }

        private static int e(byte[] bArr, int i2, int i3) {
            while (i2 < i3 && bArr[i2] >= 0) {
                i2++;
            }
            if (i2 >= i3) {
                return 0;
            }
            return f(bArr, i2, i3);
        }

        private static int f(byte[] bArr, int i2, int i3) {
            while (i2 < i3) {
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b < 0) {
                    if (b < -32) {
                        if (i4 >= i3) {
                            return b;
                        }
                        if (b >= -62) {
                            i2 = i4 + 1;
                            if (bArr[i4] > -65) {
                            }
                        }
                        return -1;
                    } else if (b < -16) {
                        if (i4 >= i3 - 1) {
                            return t1.l(bArr, i4, i3);
                        }
                        int i5 = i4 + 1;
                        byte b2 = bArr[i4];
                        if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                            i2 = i5 + 1;
                            if (bArr[i5] > -65) {
                            }
                        }
                        return -1;
                    } else if (i4 >= i3 - 2) {
                        return t1.l(bArr, i4, i3);
                    } else {
                        int i6 = i4 + 1;
                        byte b3 = bArr[i4];
                        if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                            int i7 = i6 + 1;
                            if (bArr[i6] <= -65) {
                                i4 = i7 + 1;
                                if (bArr[i7] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                i2 = i4;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public String a(byte[] bArr, int i2, int i3) {
            if ((i2 | i3 | ((bArr.length - i2) - i3)) >= 0) {
                int i4 = i2 + i3;
                char[] cArr = new char[i3];
                int i5 = 0;
                while (r13 < i4) {
                    byte b = bArr[r13];
                    if (!a.n(b)) {
                        break;
                    }
                    i2 = r13 + 1;
                    a.i(b, cArr, i5);
                    i5++;
                }
                int i6 = i5;
                while (r13 < i4) {
                    int i7 = r13 + 1;
                    byte b2 = bArr[r13];
                    if (a.n(b2)) {
                        int i8 = i6 + 1;
                        a.i(b2, cArr, i6);
                        while (i7 < i4) {
                            byte b3 = bArr[i7];
                            if (!a.n(b3)) {
                                break;
                            }
                            i7++;
                            a.i(b3, cArr, i8);
                            i8++;
                        }
                        r13 = i7;
                        i6 = i8;
                    } else if (a.p(b2)) {
                        if (i7 < i4) {
                            a.k(b2, bArr[i7], cArr, i6);
                            r13 = i7 + 1;
                            i6++;
                        } else {
                            throw c0.c();
                        }
                    } else if (a.o(b2)) {
                        if (i7 < i4 - 1) {
                            int i9 = i7 + 1;
                            a.j(b2, bArr[i7], bArr[i9], cArr, i6);
                            r13 = i9 + 1;
                            i6++;
                        } else {
                            throw c0.c();
                        }
                    } else if (i7 < i4 - 2) {
                        int i10 = i7 + 1;
                        byte b4 = bArr[i7];
                        int i11 = i10 + 1;
                        a.h(b2, b4, bArr[i10], bArr[i11], cArr, i6);
                        r13 = i11 + 1;
                        i6 = i6 + 1 + 1;
                    } else {
                        throw c0.c();
                    }
                }
                return new String(cArr, 0, i6);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
        }

        /* access modifiers changed from: package-private */
        public int b(CharSequence charSequence, byte[] bArr, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            char charAt;
            int length = charSequence.length();
            int i7 = i3 + i2;
            int i8 = 0;
            while (i8 < length && (i6 = i8 + i2) < i7 && (charAt = charSequence.charAt(i8)) < 128) {
                bArr[i6] = (byte) charAt;
                i8++;
            }
            if (i8 == length) {
                return i2 + length;
            }
            int i9 = i2 + i8;
            while (i8 < length) {
                char charAt2 = charSequence.charAt(i8);
                if (charAt2 < 128 && i9 < i7) {
                    i5 = i9 + 1;
                    bArr[i9] = (byte) charAt2;
                } else if (charAt2 < 2048 && i9 <= i7 - 2) {
                    int i10 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 >>> 6) | 960);
                    i9 = i10 + 1;
                    bArr[i10] = (byte) ((charAt2 & '?') | 128);
                    i8++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i9 <= i7 - 3) {
                    int i11 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 >>> 12) | 480);
                    int i12 = i11 + 1;
                    bArr[i11] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i5 = i12 + 1;
                    bArr[i12] = (byte) ((charAt2 & '?') | 128);
                } else if (i9 <= i7 - 4) {
                    int i13 = i8 + 1;
                    if (i13 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i13);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i14 = i9 + 1;
                            bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                            int i15 = i14 + 1;
                            bArr[i14] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i16 = i15 + 1;
                            bArr[i15] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i9 = i16 + 1;
                            bArr[i16] = (byte) ((codePoint & 63) | 128);
                            i8 = i13;
                            i8++;
                        } else {
                            i8 = i13;
                        }
                    }
                    throw new d(i8 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i4 = i8 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i9);
                } else {
                    throw new d(i8, length);
                }
                i9 = i5;
                i8++;
            }
            return i9;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
            if (r8[r9] > -65) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x007f, code lost:
            if (r8[r9] > -65) goto L_0x0081;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r8[r9] > -65) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x0082
                if (r9 < r10) goto L_0x0005
                return r7
            L_0x0005:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L_0x001c
                r7 = -62
                if (r0 < r7) goto L_0x001b
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
                goto L_0x001b
            L_0x0018:
                r9 = r7
                goto L_0x0082
            L_0x001b:
                return r2
            L_0x001c:
                r4 = -16
                if (r0 >= r4) goto L_0x0049
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L_0x0034
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r7 < r10) goto L_0x0031
                int r7 = f.e.c.a.z.a.t1.j(r0, r9)
                return r7
            L_0x0031:
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x0034:
                if (r7 > r3) goto L_0x0048
                r4 = -96
                if (r0 != r1) goto L_0x003c
                if (r7 < r4) goto L_0x0048
            L_0x003c:
                r1 = -19
                if (r0 != r1) goto L_0x0042
                if (r7 >= r4) goto L_0x0048
            L_0x0042:
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
            L_0x0048:
                return r2
            L_0x0049:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L_0x005d
                int r7 = r9 + 1
                byte r1 = r8[r9]
                if (r7 < r10) goto L_0x005b
                int r7 = f.e.c.a.z.a.t1.j(r0, r1)
                return r7
            L_0x005b:
                r9 = r7
                goto L_0x0060
            L_0x005d:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L_0x0060:
                if (r4 != 0) goto L_0x006e
                int r7 = r9 + 1
                byte r4 = r8[r9]
                if (r7 < r10) goto L_0x006d
                int r7 = f.e.c.a.z.a.t1.k(r0, r1, r4)
                return r7
            L_0x006d:
                r9 = r7
            L_0x006e:
                if (r1 > r3) goto L_0x0081
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L_0x0081
                if (r4 > r3) goto L_0x0081
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
            L_0x0081:
                return r2
            L_0x0082:
                int r7 = e(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.z.a.t1.c.d(int, byte[], int, int):int");
        }
    }

    static class d extends IllegalArgumentException {
        d(int i2, int i3) {
            super("Unpaired surrogate at index " + i2 + " of " + i3);
        }
    }

    static final class e extends b {
        e() {
        }

        static boolean e() {
            return s1.C() && s1.D();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static int f(byte[] r8, long r9, int r11) {
            /*
                int r0 = g(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L_0x0007:
                r0 = 0
                r1 = 0
            L_0x0009:
                r2 = 1
                if (r11 <= 0) goto L_0x001a
                long r4 = r9 + r2
                byte r1 = f.e.c.a.z.a.s1.s(r8, r9)
                if (r1 < 0) goto L_0x0019
                int r11 = r11 + -1
                r9 = r4
                goto L_0x0009
            L_0x0019:
                r9 = r4
            L_0x001a:
                if (r11 != 0) goto L_0x001d
                return r0
            L_0x001d:
                int r11 = r11 + -1
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L_0x003a
                if (r11 != 0) goto L_0x0029
                return r1
            L_0x0029:
                int r11 = r11 + -1
                r0 = -62
                if (r1 < r0) goto L_0x0039
                long r2 = r2 + r9
                byte r9 = f.e.c.a.z.a.s1.s(r8, r9)
                if (r9 <= r4) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r9 = r2
                goto L_0x0007
            L_0x0039:
                return r5
            L_0x003a:
                r6 = -16
                if (r1 >= r6) goto L_0x0064
                r6 = 2
                if (r11 >= r6) goto L_0x0046
                int r8 = h(r8, r1, r9, r11)
                return r8
            L_0x0046:
                int r11 = r11 + -2
                long r6 = r9 + r2
                byte r9 = f.e.c.a.z.a.s1.s(r8, r9)
                if (r9 > r4) goto L_0x0063
                r10 = -96
                if (r1 != r0) goto L_0x0056
                if (r9 < r10) goto L_0x0063
            L_0x0056:
                r0 = -19
                if (r1 != r0) goto L_0x005c
                if (r9 >= r10) goto L_0x0063
            L_0x005c:
                long r2 = r2 + r6
                byte r9 = f.e.c.a.z.a.s1.s(r8, r6)
                if (r9 <= r4) goto L_0x0037
            L_0x0063:
                return r5
            L_0x0064:
                r0 = 3
                if (r11 >= r0) goto L_0x006c
                int r8 = h(r8, r1, r9, r11)
                return r8
            L_0x006c:
                int r11 = r11 + -3
                long r6 = r9 + r2
                byte r9 = f.e.c.a.z.a.s1.s(r8, r9)
                if (r9 > r4) goto L_0x008e
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L_0x008e
                long r9 = r6 + r2
                byte r0 = f.e.c.a.z.a.s1.s(r8, r6)
                if (r0 > r4) goto L_0x008e
                long r2 = r2 + r9
                byte r9 = f.e.c.a.z.a.s1.s(r8, r9)
                if (r9 <= r4) goto L_0x0037
            L_0x008e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.z.a.t1.e.f(byte[], long, int):int");
        }

        private static int g(byte[] bArr, long j2, int i2) {
            int i3 = 0;
            if (i2 < 16) {
                return 0;
            }
            while (i3 < i2) {
                long j3 = 1 + j2;
                if (s1.s(bArr, j2) < 0) {
                    return i3;
                }
                i3++;
                j2 = j3;
            }
            return i2;
        }

        private static int h(byte[] bArr, int i2, long j2, int i3) {
            if (i3 == 0) {
                return t1.i(i2);
            }
            if (i3 == 1) {
                return t1.j(i2, s1.s(bArr, j2));
            }
            if (i3 == 2) {
                return t1.k(i2, s1.s(bArr, j2), s1.s(bArr, j2 + 1));
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        public String a(byte[] bArr, int i2, int i3) {
            if ((i2 | i3 | ((bArr.length - i2) - i3)) >= 0) {
                int i4 = i2 + i3;
                char[] cArr = new char[i3];
                int i5 = 0;
                while (r13 < i4) {
                    byte s2 = s1.s(bArr, (long) r13);
                    if (!a.n(s2)) {
                        break;
                    }
                    i2 = r13 + 1;
                    a.i(s2, cArr, i5);
                    i5++;
                }
                int i6 = i5;
                while (r13 < i4) {
                    int i7 = r13 + 1;
                    byte s3 = s1.s(bArr, (long) r13);
                    if (a.n(s3)) {
                        int i8 = i6 + 1;
                        a.i(s3, cArr, i6);
                        while (i7 < i4) {
                            byte s4 = s1.s(bArr, (long) i7);
                            if (!a.n(s4)) {
                                break;
                            }
                            i7++;
                            a.i(s4, cArr, i8);
                            i8++;
                        }
                        r13 = i7;
                        i6 = i8;
                    } else if (a.p(s3)) {
                        if (i7 < i4) {
                            int i9 = i7 + 1;
                            a.k(s3, s1.s(bArr, (long) i7), cArr, i6);
                            r13 = i9;
                            i6++;
                        } else {
                            throw c0.c();
                        }
                    } else if (a.o(s3)) {
                        if (i7 < i4 - 1) {
                            int i10 = i7 + 1;
                            int i11 = i10 + 1;
                            a.j(s3, s1.s(bArr, (long) i7), s1.s(bArr, (long) i10), cArr, i6);
                            r13 = i11;
                            i6++;
                        } else {
                            throw c0.c();
                        }
                    } else if (i7 < i4 - 2) {
                        int i12 = i7 + 1;
                        byte s5 = s1.s(bArr, (long) i7);
                        int i13 = i12 + 1;
                        a.h(s3, s5, s1.s(bArr, (long) i12), s1.s(bArr, (long) i13), cArr, i6);
                        r13 = i13 + 1;
                        i6 = i6 + 1 + 1;
                    } else {
                        throw c0.c();
                    }
                }
                return new String(cArr, 0, i6);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:38:0x00fb, LOOP_START, PHI: r2 r3 r4 r11 
          PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int b(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
            /*
                r22 = this;
                r0 = r23
                r1 = r24
                r2 = r25
                r3 = r26
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r23.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x0144
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x0144
                r2 = 0
            L_0x001a:
                r3 = 128(0x80, float:1.794E-43)
                r11 = 1
                if (r2 >= r8) goto L_0x002f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x002f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                f.e.c.a.z.a.s1.H(r1, r4, r3)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001a
            L_0x002f:
                if (r2 != r8) goto L_0x0033
                int r0 = (int) r4
                return r0
            L_0x0033:
                if (r2 >= r8) goto L_0x0142
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x004b
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r14 >= 0) goto L_0x004b
                long r14 = r4 + r11
                byte r13 = (byte) r13
                f.e.c.a.z.a.s1.H(r1, r4, r13)
                r4 = r11
                r12 = r14
            L_0x0047:
                r11 = 128(0x80, float:1.794E-43)
                goto L_0x00fb
            L_0x004b:
                r14 = 2048(0x800, float:2.87E-42)
                if (r13 >= r14) goto L_0x0075
                r14 = 2
                long r14 = r6 - r14
                int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r16 > 0) goto L_0x0075
                long r14 = r4 + r11
                int r3 = r13 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                f.e.c.a.z.a.s1.H(r1, r4, r3)
                long r3 = r14 + r11
                r5 = r13 & 63
                r13 = 128(0x80, float:1.794E-43)
                r5 = r5 | r13
                byte r5 = (byte) r5
                f.e.c.a.z.a.s1.H(r1, r14, r5)
                r20 = r11
                r11 = 128(0x80, float:1.794E-43)
                r12 = r3
                r4 = r20
                goto L_0x00fb
            L_0x0075:
                r3 = 57343(0xdfff, float:8.0355E-41)
                r14 = 55296(0xd800, float:7.7486E-41)
                if (r13 < r14) goto L_0x007f
                if (r3 >= r13) goto L_0x00ae
            L_0x007f:
                r15 = 3
                long r15 = r6 - r15
                int r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r17 > 0) goto L_0x00ae
                long r14 = r4 + r11
                int r3 = r13 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                f.e.c.a.z.a.s1.H(r1, r4, r3)
                long r3 = r14 + r11
                int r5 = r13 >>> 6
                r5 = r5 & 63
                r11 = 128(0x80, float:1.794E-43)
                r5 = r5 | r11
                byte r5 = (byte) r5
                f.e.c.a.z.a.s1.H(r1, r14, r5)
                r14 = 1
                long r18 = r3 + r14
                r5 = r13 & 63
                r5 = r5 | r11
                byte r5 = (byte) r5
                f.e.c.a.z.a.s1.H(r1, r3, r5)
                r12 = r18
                r4 = 1
                goto L_0x0047
            L_0x00ae:
                r11 = 4
                long r11 = r6 - r11
                int r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r15 > 0) goto L_0x010f
                int r3 = r2 + 1
                if (r3 == r8) goto L_0x0107
                char r2 = r0.charAt(r3)
                boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r11 == 0) goto L_0x0106
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r11 = 1
                long r13 = r4 + r11
                int r15 = r2 >>> 18
                r15 = r15 | 240(0xf0, float:3.36E-43)
                byte r15 = (byte) r15
                f.e.c.a.z.a.s1.H(r1, r4, r15)
                long r4 = r13 + r11
                int r15 = r2 >>> 12
                r15 = r15 & 63
                r11 = 128(0x80, float:1.794E-43)
                r12 = r15 | 128(0x80, float:1.794E-43)
                byte r12 = (byte) r12
                f.e.c.a.z.a.s1.H(r1, r13, r12)
                r12 = 1
                long r14 = r4 + r12
                int r16 = r2 >>> 6
                r12 = r16 & 63
                r12 = r12 | r11
                byte r12 = (byte) r12
                f.e.c.a.z.a.s1.H(r1, r4, r12)
                r4 = 1
                long r12 = r14 + r4
                r2 = r2 & 63
                r2 = r2 | r11
                byte r2 = (byte) r2
                f.e.c.a.z.a.s1.H(r1, r14, r2)
                r2 = r3
            L_0x00fb:
                int r2 = r2 + 1
                r3 = 128(0x80, float:1.794E-43)
                r20 = r4
                r4 = r12
                r11 = r20
                goto L_0x0033
            L_0x0106:
                r2 = r3
            L_0x0107:
                f.e.c.a.z.a.t1$d r0 = new f.e.c.a.z.a.t1$d
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x010f:
                if (r14 > r13) goto L_0x0127
                if (r13 > r3) goto L_0x0127
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x0121
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x0127
            L_0x0121:
                f.e.c.a.z.a.t1$d r0 = new f.e.c.a.z.a.t1$d
                r0.<init>(r2, r8)
                throw r0
            L_0x0127:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r13)
                r1.append(r9)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0142:
                int r0 = (int) r4
                return r0
            L_0x0144:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r10)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r4.append(r0)
                r4.append(r9)
                int r0 = r2 + r3
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.z.a.t1.e.b(java.lang.CharSequence, byte[], int, int):int");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
            if (f.e.c.a.z.a.s1.s(r13, r2) > -65) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x009e, code lost:
            if (f.e.c.a.z.a.s1.s(r13, r2) > -65) goto L_0x00a0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(int r12, byte[] r13, int r14, int r15) {
            /*
                r11 = this;
                r0 = r14 | r15
                int r1 = r13.length
                int r1 = r1 - r15
                r0 = r0 | r1
                r1 = 0
                if (r0 < 0) goto L_0x00a8
                long r2 = (long) r14
                long r14 = (long) r15
                if (r12 == 0) goto L_0x00a1
                int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
                if (r0 < 0) goto L_0x0011
                return r12
            L_0x0011:
                byte r0 = (byte) r12
                r4 = -32
                r5 = -1
                r6 = -65
                r7 = 1
                if (r0 >= r4) goto L_0x002b
                r12 = -62
                if (r0 < r12) goto L_0x002a
                long r7 = r7 + r2
                byte r12 = f.e.c.a.z.a.s1.s(r13, r2)
                if (r12 <= r6) goto L_0x0027
                goto L_0x002a
            L_0x0027:
                r2 = r7
                goto L_0x00a1
            L_0x002a:
                return r5
            L_0x002b:
                r9 = -16
                if (r0 >= r9) goto L_0x005f
                int r12 = r12 >> 8
                int r12 = ~r12
                byte r12 = (byte) r12
                if (r12 != 0) goto L_0x0045
                long r9 = r2 + r7
                byte r12 = f.e.c.a.z.a.s1.s(r13, r2)
                int r1 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r1 < 0) goto L_0x0044
                int r12 = f.e.c.a.z.a.t1.j(r0, r12)
                return r12
            L_0x0044:
                r2 = r9
            L_0x0045:
                if (r12 > r6) goto L_0x005e
                r1 = -96
                if (r0 != r4) goto L_0x004d
                if (r12 < r1) goto L_0x005e
            L_0x004d:
                r4 = -19
                if (r0 != r4) goto L_0x0053
                if (r12 >= r1) goto L_0x005e
            L_0x0053:
                long r0 = r2 + r7
                byte r12 = f.e.c.a.z.a.s1.s(r13, r2)
                if (r12 <= r6) goto L_0x005c
                goto L_0x005e
            L_0x005c:
                r2 = r0
                goto L_0x00a1
            L_0x005e:
                return r5
            L_0x005f:
                int r4 = r12 >> 8
                int r4 = ~r4
                byte r4 = (byte) r4
                if (r4 != 0) goto L_0x0076
                long r9 = r2 + r7
                byte r4 = f.e.c.a.z.a.s1.s(r13, r2)
                int r12 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r12 < 0) goto L_0x0074
                int r12 = f.e.c.a.z.a.t1.j(r0, r4)
                return r12
            L_0x0074:
                r2 = r9
                goto L_0x0079
            L_0x0076:
                int r12 = r12 >> 16
                byte r1 = (byte) r12
            L_0x0079:
                if (r1 != 0) goto L_0x008b
                long r9 = r2 + r7
                byte r1 = f.e.c.a.z.a.s1.s(r13, r2)
                int r12 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r12 < 0) goto L_0x008a
                int r12 = f.e.c.a.z.a.t1.k(r0, r4, r1)
                return r12
            L_0x008a:
                r2 = r9
            L_0x008b:
                if (r4 > r6) goto L_0x00a0
                int r12 = r0 << 28
                int r4 = r4 + 112
                int r12 = r12 + r4
                int r12 = r12 >> 30
                if (r12 != 0) goto L_0x00a0
                if (r1 > r6) goto L_0x00a0
                long r0 = r2 + r7
                byte r12 = f.e.c.a.z.a.s1.s(r13, r2)
                if (r12 <= r6) goto L_0x005c
            L_0x00a0:
                return r5
            L_0x00a1:
                long r14 = r14 - r2
                int r12 = (int) r14
                int r12 = f(r13, r2, r12)
                return r12
            L_0x00a8:
                java.lang.ArrayIndexOutOfBoundsException r12 = new java.lang.ArrayIndexOutOfBoundsException
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r13 = r13.length
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r0[r1] = r13
                r13 = 1
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r0[r13] = r14
                r13 = 2
                java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
                r0[r13] = r14
                java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r13 = java.lang.String.format(r13, r0)
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.z.a.t1.e.d(int, byte[], int, int):int");
        }
    }

    static String e(byte[] bArr, int i2, int i3) {
        return a.a(bArr, i2, i3);
    }

    static int f(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        return a.b(charSequence, bArr, i2, i3);
    }

    static int g(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 < length) {
                char charAt = charSequence.charAt(i2);
                if (charAt >= 2048) {
                    i3 += h(charSequence, i2);
                    break;
                }
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                break;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    private static int h(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
            } else {
                i3 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i2) >= 65536) {
                        i2++;
                    } else {
                        throw new d(i2, length);
                    }
                }
            }
            i2++;
        }
        return i3;
    }

    /* access modifiers changed from: private */
    public static int i(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    /* access modifiers changed from: private */
    public static int j(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    /* access modifiers changed from: private */
    public static int k(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }

    /* access modifiers changed from: private */
    public static int l(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            return i(b2);
        }
        if (i4 == 1) {
            return j(b2, bArr[i2]);
        }
        if (i4 == 2) {
            return k(b2, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    public static boolean m(byte[] bArr) {
        return a.c(bArr, 0, bArr.length);
    }

    public static boolean n(byte[] bArr, int i2, int i3) {
        return a.c(bArr, i2, i3);
    }
}
