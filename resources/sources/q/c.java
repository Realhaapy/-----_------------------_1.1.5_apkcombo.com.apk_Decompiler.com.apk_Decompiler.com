package q;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

public final class c implements e, d, Cloneable, ByteChannel {

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f5475g = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: e  reason: collision with root package name */
    o f5476e;

    /* renamed from: f  reason: collision with root package name */
    long f5477f;

    public short A() {
        return u.d(readShort());
    }

    public final long B() {
        long j2 = this.f5477f;
        if (j2 == 0) {
            return 0;
        }
        o oVar = this.f5476e.f5509g;
        int i2 = oVar.c;
        return (i2 >= 8192 || !oVar.f5507e) ? j2 : j2 - ((long) (i2 - oVar.b));
    }

    public /* bridge */ /* synthetic */ d C() {
        J();
        return this;
    }

    public final c E(c cVar, long j2, long j3) {
        if (cVar != null) {
            u.b(this.f5477f, j2, j3);
            if (j3 == 0) {
                return this;
            }
            cVar.f5477f += j3;
            o oVar = this.f5476e;
            while (true) {
                int i2 = oVar.c;
                int i3 = oVar.b;
                if (j2 < ((long) (i2 - i3))) {
                    break;
                }
                j2 -= (long) (i2 - i3);
                oVar = oVar.f5508f;
            }
            while (j3 > 0) {
                o d2 = oVar.d();
                int i4 = (int) (((long) d2.b) + j2);
                d2.b = i4;
                d2.c = Math.min(i4 + ((int) j3), d2.c);
                o oVar2 = cVar.f5476e;
                if (oVar2 == null) {
                    d2.f5509g = d2;
                    d2.f5508f = d2;
                    cVar.f5476e = d2;
                } else {
                    oVar2.f5509g.c(d2);
                }
                j3 -= (long) (d2.c - d2.b);
                oVar = oVar.f5508f;
                j2 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public long F(c cVar, long j2) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j2 >= 0) {
            long j3 = this.f5477f;
            if (j3 == 0) {
                return -1;
            }
            if (j2 > j3) {
                j2 = j3;
            }
            cVar.h(this, j2);
            return j2;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
    }

    public String G(long j2) {
        if (j2 >= 0) {
            long j3 = Long.MAX_VALUE;
            if (j2 != Long.MAX_VALUE) {
                j3 = j2 + 1;
            }
            long O = O((byte) 10, 0, j3);
            if (O != -1) {
                return W(O);
            }
            if (j3 < X() && L(j3 - 1) == 13 && L(j3) == 10) {
                return W(j3);
            }
            c cVar = new c();
            E(cVar, 0, Math.min(32, X()));
            throw new EOFException("\\n not found: limit=" + Math.min(X(), j2) + " content=" + cVar.S().l() + 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j2);
    }

    public long H(r rVar) {
        long j2 = this.f5477f;
        if (j2 > 0) {
            rVar.h(this, j2);
        }
        return j2;
    }

    public c J() {
        return this;
    }

    public final byte L(long j2) {
        int i2;
        u.b(this.f5477f, j2, 1);
        long j3 = this.f5477f;
        if (j3 - j2 > j2) {
            o oVar = this.f5476e;
            while (true) {
                int i3 = oVar.c;
                int i4 = oVar.b;
                long j4 = (long) (i3 - i4);
                if (j2 < j4) {
                    return oVar.a[i4 + ((int) j2)];
                }
                j2 -= j4;
                oVar = oVar.f5508f;
            }
        } else {
            long j5 = j2 - j3;
            o oVar2 = this.f5476e;
            do {
                oVar2 = oVar2.f5509g;
                int i5 = oVar2.c;
                i2 = oVar2.b;
                j5 += (long) (i5 - i2);
            } while (j5 < 0);
            return oVar2.a[i2 + ((int) j5)];
        }
    }

    public void M(long j2) {
        if (this.f5477f < j2) {
            throw new EOFException();
        }
    }

    public /* bridge */ /* synthetic */ d N(String str) {
        k0(str);
        return this;
    }

    public long O(byte b, long j2, long j3) {
        o oVar;
        long j4 = 0;
        if (j2 < 0 || j3 < j2) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f5477f), Long.valueOf(j2), Long.valueOf(j3)}));
        }
        long j5 = this.f5477f;
        long j6 = j3 > j5 ? j5 : j3;
        if (j2 == j6 || (oVar = this.f5476e) == null) {
            return -1;
        }
        if (j5 - j2 < j2) {
            while (j5 > j2) {
                oVar = oVar.f5509g;
                j5 -= (long) (oVar.c - oVar.b);
            }
        } else {
            while (true) {
                long j7 = ((long) (oVar.c - oVar.b)) + j4;
                if (j7 >= j2) {
                    break;
                }
                oVar = oVar.f5508f;
                j4 = j7;
            }
            j5 = j4;
        }
        long j8 = j2;
        while (j5 < j6) {
            byte[] bArr = oVar.a;
            int min = (int) Math.min((long) oVar.c, (((long) oVar.b) + j6) - j5);
            for (int i2 = (int) ((((long) oVar.b) + j8) - j5); i2 < min; i2++) {
                if (bArr[i2] == b) {
                    return ((long) (i2 - oVar.b)) + j5;
                }
            }
            byte b2 = b;
            j5 += (long) (oVar.c - oVar.b);
            oVar = oVar.f5508f;
            j8 = j5;
        }
        return -1;
    }

    public byte[] P() {
        try {
            return u(this.f5477f);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public long Q(byte b) {
        return O(b, 0, Long.MAX_VALUE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        if (r8 != r9) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        r15.f5476e = r6.b();
        q.p.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        r6.b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        if (r1 != false) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0074 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long R() {
        /*
            r15 = this;
            long r0 = r15.f5477f
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00aa
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            q.o r6 = r15.f5476e
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L_0x0013:
            if (r8 >= r9) goto L_0x008f
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x003a
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002f
            int r11 = r10 + -97
        L_0x002c:
            int r11 = r11 + 10
            goto L_0x003a
        L_0x002f:
            r11 = 65
            if (r10 < r11) goto L_0x0070
            r11 = 70
            if (r10 > r11) goto L_0x0070
            int r11 = r10 + -65
            goto L_0x002c
        L_0x003a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x004a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x004a:
            q.c r0 = new q.c
            r0.<init>()
            r0.g0(r4)
            r0.f0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.U()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0070:
            if (r0 == 0) goto L_0x0074
            r1 = 1
            goto L_0x008f
        L_0x0074:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008f:
            if (r8 != r9) goto L_0x009b
            q.o r7 = r6.b()
            r15.f5476e = r7
            q.p.a(r6)
            goto L_0x009d
        L_0x009b:
            r6.b = r8
        L_0x009d:
            if (r1 != 0) goto L_0x00a3
            q.o r6 = r15.f5476e
            if (r6 != 0) goto L_0x000b
        L_0x00a3:
            long r1 = r15.f5477f
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f5477f = r1
            return r4
        L_0x00aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.c.R():long");
    }

    public f S() {
        return new f(P());
    }

    public String T(long j2, Charset charset) {
        u.b(this.f5477f, 0, j2);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j2 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j2);
        } else if (j2 == 0) {
            return "";
        } else {
            o oVar = this.f5476e;
            if (((long) oVar.b) + j2 > ((long) oVar.c)) {
                return new String(u(j2), charset);
            }
            String str = new String(oVar.a, oVar.b, (int) j2, charset);
            int i2 = (int) (((long) oVar.b) + j2);
            oVar.b = i2;
            this.f5477f -= j2;
            if (i2 == oVar.c) {
                this.f5476e = oVar.b();
                p.a(oVar);
            }
            return str;
        }
    }

    public String U() {
        try {
            return T(this.f5477f, u.a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public String V(long j2) {
        return T(j2, u.a);
    }

    /* access modifiers changed from: package-private */
    public String W(long j2) {
        String V;
        long j3 = 1;
        if (j2 > 0) {
            long j4 = j2 - 1;
            if (L(j4) == 13) {
                V = V(j4);
                j3 = 2;
                skip(j3);
                return V;
            }
        }
        V = V(j2);
        skip(j3);
        return V;
    }

    public final long X() {
        return this.f5477f;
    }

    public final f Y() {
        long j2 = this.f5477f;
        if (j2 <= 2147483647L) {
            return Z((int) j2);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f5477f);
    }

    public final f Z(int i2) {
        return i2 == 0 ? f.f5479i : new q(this, i2);
    }

    /* access modifiers changed from: package-private */
    public o a0(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException();
        }
        o oVar = this.f5476e;
        if (oVar == null) {
            o b = p.b();
            this.f5476e = b;
            b.f5509g = b;
            b.f5508f = b;
            return b;
        }
        o oVar2 = oVar.f5509g;
        if (oVar2.c + i2 <= 8192 && oVar2.f5507e) {
            return oVar2;
        }
        o b2 = p.b();
        oVar2.c(b2);
        return b2;
    }

    public c b() {
        return this;
    }

    public c b0(f fVar) {
        if (fVar != null) {
            fVar.B(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public c c0(byte[] bArr) {
        if (bArr != null) {
            d0(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public void close() {
    }

    public t d() {
        return t.f5512d;
    }

    public c d0(byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            long j2 = (long) i3;
            u.b((long) bArr.length, (long) i2, j2);
            int i4 = i3 + i2;
            while (i2 < i4) {
                o a0 = a0(1);
                int min = Math.min(i4 - i2, 8192 - a0.c);
                System.arraycopy(bArr, i2, a0.a, a0.c, min);
                i2 += min;
                a0.c += min;
            }
            this.f5477f += j2;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public /* bridge */ /* synthetic */ d e(byte[] bArr, int i2, int i3) {
        d0(bArr, i2, i3);
        return this;
    }

    public long e0(s sVar) {
        if (sVar != null) {
            long j2 = 0;
            while (true) {
                long F = sVar.F(this, 8192);
                if (F == -1) {
                    return j2;
                }
                j2 += F;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j2 = this.f5477f;
        if (j2 != cVar.f5477f) {
            return false;
        }
        long j3 = 0;
        if (j2 == 0) {
            return true;
        }
        o oVar = this.f5476e;
        o oVar2 = cVar.f5476e;
        int i2 = oVar.b;
        int i3 = oVar2.b;
        while (j3 < this.f5477f) {
            long min = (long) Math.min(oVar.c - i2, oVar2.c - i3);
            int i4 = 0;
            while (((long) i4) < min) {
                int i5 = i2 + 1;
                int i6 = i3 + 1;
                if (oVar.a[i2] != oVar2.a[i3]) {
                    return false;
                }
                i4++;
                i2 = i5;
                i3 = i6;
            }
            if (i2 == oVar.c) {
                oVar = oVar.f5508f;
                i2 = oVar.b;
            }
            if (i3 == oVar2.c) {
                oVar2 = oVar2.f5508f;
                i3 = oVar2.b;
            }
            j3 += min;
        }
        return true;
    }

    public c f0(int i2) {
        o a0 = a0(1);
        byte[] bArr = a0.a;
        int i3 = a0.c;
        a0.c = i3 + 1;
        bArr[i3] = (byte) i2;
        this.f5477f++;
        return this;
    }

    public void flush() {
    }

    public c g0(long j2) {
        if (j2 == 0) {
            f0(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j2)) / 4) + 1;
        o a0 = a0(numberOfTrailingZeros);
        byte[] bArr = a0.a;
        int i2 = a0.c;
        for (int i3 = (i2 + numberOfTrailingZeros) - 1; i3 >= i2; i3--) {
            bArr[i3] = f5475g[(int) (15 & j2)];
            j2 >>>= 4;
        }
        a0.c += numberOfTrailingZeros;
        this.f5477f += (long) numberOfTrailingZeros;
        return this;
    }

    public void h(c cVar, long j2) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (cVar != this) {
            u.b(cVar.f5477f, 0, j2);
            while (j2 > 0) {
                o oVar = cVar.f5476e;
                if (j2 < ((long) (oVar.c - oVar.b))) {
                    o oVar2 = this.f5476e;
                    o oVar3 = oVar2 != null ? oVar2.f5509g : null;
                    if (oVar3 != null && oVar3.f5507e) {
                        if ((((long) oVar3.c) + j2) - ((long) (oVar3.f5506d ? 0 : oVar3.b)) <= 8192) {
                            oVar.f(oVar3, (int) j2);
                            cVar.f5477f -= j2;
                            this.f5477f += j2;
                            return;
                        }
                    }
                    cVar.f5476e = oVar.e((int) j2);
                }
                o oVar4 = cVar.f5476e;
                long j3 = (long) (oVar4.c - oVar4.b);
                cVar.f5476e = oVar4.b();
                o oVar5 = this.f5476e;
                if (oVar5 == null) {
                    this.f5476e = oVar4;
                    oVar4.f5509g = oVar4;
                    oVar4.f5508f = oVar4;
                } else {
                    oVar5.f5509g.c(oVar4);
                    oVar4.a();
                }
                cVar.f5477f -= j3;
                this.f5477f += j3;
                j2 -= j3;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public c h0(int i2) {
        o a0 = a0(4);
        byte[] bArr = a0.a;
        int i3 = a0.c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & 255);
        bArr[i6] = (byte) (i2 & 255);
        a0.c = i6 + 1;
        this.f5477f += 4;
        return this;
    }

    public int hashCode() {
        o oVar = this.f5476e;
        if (oVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = oVar.c;
            for (int i4 = oVar.b; i4 < i3; i4++) {
                i2 = (i2 * 31) + oVar.a[i4];
            }
            oVar = oVar.f5508f;
        } while (oVar != this.f5476e);
        return i2;
    }

    public c i0(int i2) {
        o a0 = a0(2);
        byte[] bArr = a0.a;
        int i3 = a0.c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i4] = (byte) (i2 & 255);
        a0.c = i4 + 1;
        this.f5477f += 2;
        return this;
    }

    public boolean isOpen() {
        return true;
    }

    public /* bridge */ /* synthetic */ d j(long j2) {
        g0(j2);
        return this;
    }

    public c j0(String str, int i2, int i3, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i2 < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i2);
        } else if (i3 < i2) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i3 + " < " + i2);
        } else if (i3 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i3 + " > " + str.length());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(u.a)) {
            l0(str, i2, i3);
            return this;
        } else {
            byte[] bytes = str.substring(i2, i3).getBytes(charset);
            d0(bytes, 0, bytes.length);
            return this;
        }
    }

    public f k(long j2) {
        return new f(u(j2));
    }

    public c k0(String str) {
        l0(str, 0, str.length());
        return this;
    }

    public /* bridge */ /* synthetic */ d l(int i2) {
        i0(i2);
        return this;
    }

    public c l0(String str, int i2, int i3) {
        int i4;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i2);
        } else if (i3 < i2) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i3 + " < " + i2);
        } else if (i3 <= str.length()) {
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt < 128) {
                    o a0 = a0(1);
                    byte[] bArr = a0.a;
                    int i5 = a0.c - i2;
                    int min = Math.min(i3, 8192 - i5);
                    int i6 = i2 + 1;
                    bArr[i2 + i5] = (byte) charAt;
                    while (i6 < min) {
                        char charAt2 = str.charAt(i6);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i6 + i5] = (byte) charAt2;
                        i6++;
                    }
                    int i7 = a0.c;
                    int i8 = (i5 + i6) - i7;
                    a0.c = i7 + i8;
                    this.f5477f += (long) i8;
                    i2 = i6;
                } else {
                    if (charAt < 2048) {
                        i4 = (charAt >> 6) | 192;
                    } else if (charAt < 55296 || charAt > 57343) {
                        f0((charAt >> 12) | 224);
                        i4 = ((charAt >> 6) & 63) | 128;
                    } else {
                        int i9 = i2 + 1;
                        char charAt3 = i9 < i3 ? str.charAt(i9) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            f0(63);
                            i2 = i9;
                        } else {
                            int i10 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 0;
                            f0((i10 >> 18) | 240);
                            f0(((i10 >> 12) & 63) | 128);
                            f0(((i10 >> 6) & 63) | 128);
                            f0((i10 & 63) | 128);
                            i2 += 2;
                        }
                    }
                    f0(i4);
                    f0((charAt & '?') | 128);
                    i2++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i3 + " > " + str.length());
        }
    }

    public /* bridge */ /* synthetic */ d m(int i2) {
        h0(i2);
        return this;
    }

    public c m0(int i2) {
        int i3;
        int i4;
        if (i2 >= 128) {
            if (i2 < 2048) {
                i4 = (i2 >> 6) | 192;
            } else {
                if (i2 < 65536) {
                    if (i2 < 55296 || i2 > 57343) {
                        i3 = (i2 >> 12) | 224;
                    } else {
                        f0(63);
                        return this;
                    }
                } else if (i2 <= 1114111) {
                    f0((i2 >> 18) | 240);
                    i3 = ((i2 >> 12) & 63) | 128;
                } else {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i2));
                }
                f0(i3);
                i4 = ((i2 >> 6) & 63) | 128;
            }
            f0(i4);
            i2 = (i2 & 63) | 128;
        }
        f0(i2);
        return this;
    }

    public String p() {
        return G(Long.MAX_VALUE);
    }

    public int q() {
        return u.c(readInt());
    }

    public int read(ByteBuffer byteBuffer) {
        o oVar = this.f5476e;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), oVar.c - oVar.b);
        byteBuffer.put(oVar.a, oVar.b, min);
        int i2 = oVar.b + min;
        oVar.b = i2;
        this.f5477f -= (long) min;
        if (i2 == oVar.c) {
            this.f5476e = oVar.b();
            p.a(oVar);
        }
        return min;
    }

    public int read(byte[] bArr, int i2, int i3) {
        u.b((long) bArr.length, (long) i2, (long) i3);
        o oVar = this.f5476e;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(i3, oVar.c - oVar.b);
        System.arraycopy(oVar.a, oVar.b, bArr, i2, min);
        int i4 = oVar.b + min;
        oVar.b = i4;
        this.f5477f -= (long) min;
        if (i4 == oVar.c) {
            this.f5476e = oVar.b();
            p.a(oVar);
        }
        return min;
    }

    public byte readByte() {
        long j2 = this.f5477f;
        if (j2 != 0) {
            o oVar = this.f5476e;
            int i2 = oVar.b;
            int i3 = oVar.c;
            int i4 = i2 + 1;
            byte b = oVar.a[i2];
            this.f5477f = j2 - 1;
            if (i4 == i3) {
                this.f5476e = oVar.b();
                p.a(oVar);
            } else {
                oVar.b = i4;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public void readFully(byte[] bArr) {
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = read(bArr, i2, bArr.length - i2);
            if (read != -1) {
                i2 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() {
        long j2 = this.f5477f;
        if (j2 >= 4) {
            o oVar = this.f5476e;
            int i2 = oVar.b;
            int i3 = oVar.c;
            if (i3 - i2 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = oVar.a;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            byte b = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16);
            int i6 = i5 + 1;
            byte b2 = b | ((bArr[i5] & 255) << 8);
            int i7 = i6 + 1;
            byte b3 = b2 | (bArr[i6] & 255);
            this.f5477f = j2 - 4;
            if (i7 == i3) {
                this.f5476e = oVar.b();
                p.a(oVar);
            } else {
                oVar.b = i7;
            }
            return b3;
        }
        throw new IllegalStateException("size < 4: " + this.f5477f);
    }

    public short readShort() {
        long j2 = this.f5477f;
        if (j2 >= 2) {
            o oVar = this.f5476e;
            int i2 = oVar.b;
            int i3 = oVar.c;
            if (i3 - i2 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = oVar.a;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            byte b = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
            this.f5477f = j2 - 2;
            if (i5 == i3) {
                this.f5476e = oVar.b();
                p.a(oVar);
            } else {
                oVar.b = i5;
            }
            return (short) b;
        }
        throw new IllegalStateException("size < 2: " + this.f5477f);
    }

    public boolean s() {
        return this.f5477f == 0;
    }

    public void skip(long j2) {
        while (j2 > 0) {
            o oVar = this.f5476e;
            if (oVar != null) {
                int min = (int) Math.min(j2, (long) (oVar.c - oVar.b));
                long j3 = (long) min;
                this.f5477f -= j3;
                j2 -= j3;
                o oVar2 = this.f5476e;
                int i2 = oVar2.b + min;
                oVar2.b = i2;
                if (i2 == oVar2.c) {
                    this.f5476e = oVar2.b();
                    p.a(oVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public /* bridge */ /* synthetic */ d t(int i2) {
        f0(i2);
        return this;
    }

    public String toString() {
        return Y().toString();
    }

    public byte[] u(long j2) {
        u.b(this.f5477f, 0, j2);
        if (j2 <= 2147483647L) {
            byte[] bArr = new byte[((int) j2)];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j2);
    }

    public final void v() {
        try {
            skip(this.f5477f);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i2 = remaining;
            while (i2 > 0) {
                o a0 = a0(1);
                int min = Math.min(i2, 8192 - a0.c);
                byteBuffer.get(a0.a, a0.c, min);
                i2 -= min;
                a0.c += min;
            }
            this.f5477f += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public /* bridge */ /* synthetic */ d y(byte[] bArr) {
        c0(bArr);
        return this;
    }

    /* renamed from: z */
    public c clone() {
        c cVar = new c();
        if (this.f5477f == 0) {
            return cVar;
        }
        o d2 = this.f5476e.d();
        cVar.f5476e = d2;
        d2.f5509g = d2;
        d2.f5508f = d2;
        o oVar = this.f5476e;
        while (true) {
            oVar = oVar.f5508f;
            if (oVar != this.f5476e) {
                cVar.f5476e.f5509g.c(oVar.d());
            } else {
                cVar.f5477f = this.f5477f;
                return cVar;
            }
        }
    }
}
