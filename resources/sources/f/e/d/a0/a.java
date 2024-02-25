package f.e.d.a0;

import f.e.d.y.f;
import f.e.d.y.n.e;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

public class a implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    private final Reader f4265e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4266f = false;

    /* renamed from: g  reason: collision with root package name */
    private final char[] f4267g = new char[1024];

    /* renamed from: h  reason: collision with root package name */
    private int f4268h = 0;

    /* renamed from: i  reason: collision with root package name */
    private int f4269i = 0;

    /* renamed from: j  reason: collision with root package name */
    private int f4270j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f4271k = 0;

    /* renamed from: l  reason: collision with root package name */
    int f4272l = 0;

    /* renamed from: m  reason: collision with root package name */
    private long f4273m;

    /* renamed from: n  reason: collision with root package name */
    private int f4274n;

    /* renamed from: o  reason: collision with root package name */
    private String f4275o;

    /* renamed from: p  reason: collision with root package name */
    private int[] f4276p;

    /* renamed from: q  reason: collision with root package name */
    private int f4277q;

    /* renamed from: r  reason: collision with root package name */
    private String[] f4278r;

    /* renamed from: s  reason: collision with root package name */
    private int[] f4279s;

    /* renamed from: f.e.d.a0.a$a  reason: collision with other inner class name */
    class C0125a extends f {
        C0125a() {
        }

        public void a(a aVar) {
            int i2;
            if (aVar instanceof e) {
                ((e) aVar).s0();
                return;
            }
            int i3 = aVar.f4272l;
            if (i3 == 0) {
                i3 = aVar.v();
            }
            if (i3 == 13) {
                i2 = 9;
            } else if (i3 == 12) {
                i2 = 8;
            } else if (i3 == 14) {
                i2 = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + aVar.d0() + aVar.S());
            }
            aVar.f4272l = i2;
        }
    }

    static {
        f.a = new C0125a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f4276p = iArr;
        this.f4277q = 0;
        this.f4277q = 0 + 1;
        iArr[0] = 6;
        this.f4278r = new String[32];
        this.f4279s = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f4265e = reader;
    }

    private boolean E(int i2) {
        int i3;
        int i4;
        char[] cArr = this.f4267g;
        int i5 = this.f4271k;
        int i6 = this.f4268h;
        this.f4271k = i5 - i6;
        int i7 = this.f4269i;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f4269i = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f4269i = 0;
        }
        this.f4268h = 0;
        do {
            Reader reader = this.f4265e;
            int i9 = this.f4269i;
            int read = reader.read(cArr, i9, cArr.length - i9);
            if (read == -1) {
                return false;
            }
            i3 = this.f4269i + read;
            this.f4269i = i3;
            if (this.f4270j == 0 && (i4 = this.f4271k) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f4268h++;
                this.f4271k = i4 + 1;
                i2++;
                continue;
            }
        } while (i3 < i2);
        return true;
    }

    private boolean P(char c) {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        g();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r1 != '/') goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r7.f4268h = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r4 != r2) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r7.f4268h = r4 - 1;
        r2 = E(2);
        r7.f4268h++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r2 != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        g();
        r2 = r7.f4268h;
        r3 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r3 == '*') goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        if (r3 == '/') goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0077, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        r7.f4268h = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        r7.f4268h = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (k0("*/") == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0091, code lost:
        o0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0098, code lost:
        r7.f4268h = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009c, code lost:
        if (r1 != '#') goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009e, code lost:
        g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int Y(boolean r8) {
        /*
            r7 = this;
            char[] r0 = r7.f4267g
        L_0x0002:
            int r1 = r7.f4268h
        L_0x0004:
            int r2 = r7.f4269i
        L_0x0006:
            r3 = 1
            if (r1 != r2) goto L_0x0034
            r7.f4268h = r1
            boolean r1 = r7.E(r3)
            if (r1 != 0) goto L_0x0030
            if (r8 != 0) goto L_0x0015
            r8 = -1
            return r8
        L_0x0015:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r7.S()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x0030:
            int r1 = r7.f4268h
            int r2 = r7.f4269i
        L_0x0034:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L_0x0044
            int r1 = r7.f4270j
            int r1 = r1 + r3
            r7.f4270j = r1
            r7.f4271k = r4
            goto L_0x00a3
        L_0x0044:
            r5 = 32
            if (r1 == r5) goto L_0x00a3
            r5 = 13
            if (r1 == r5) goto L_0x00a3
            r5 = 9
            if (r1 != r5) goto L_0x0051
            goto L_0x00a3
        L_0x0051:
            r5 = 47
            if (r1 != r5) goto L_0x0098
            r7.f4268h = r4
            r6 = 2
            if (r4 != r2) goto L_0x006a
            int r4 = r4 + -1
            r7.f4268h = r4
            boolean r2 = r7.E(r6)
            int r4 = r7.f4268h
            int r4 = r4 + r3
            r7.f4268h = r4
            if (r2 != 0) goto L_0x006a
            return r1
        L_0x006a:
            r7.g()
            int r2 = r7.f4268h
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L_0x0080
            if (r3 == r5) goto L_0x0078
            return r1
        L_0x0078:
            int r2 = r2 + 1
            r7.f4268h = r2
        L_0x007c:
            r7.l0()
            goto L_0x0002
        L_0x0080:
            int r2 = r2 + 1
            r7.f4268h = r2
            java.lang.String r1 = "*/"
            boolean r1 = r7.k0(r1)
            if (r1 == 0) goto L_0x0091
            int r1 = r7.f4268h
            int r1 = r1 + r6
            goto L_0x0004
        L_0x0091:
            java.lang.String r8 = "Unterminated comment"
            r7.o0(r8)
            r8 = 0
            throw r8
        L_0x0098:
            r2 = 35
            r7.f4268h = r4
            if (r1 != r2) goto L_0x00a2
            r7.g()
            goto L_0x007c
        L_0x00a2:
            return r1
        L_0x00a3:
            r1 = r4
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.d.a0.a.Y(boolean):int");
    }

    private String a0(char c) {
        char[] cArr = this.f4267g;
        StringBuilder sb = null;
        while (true) {
            int i2 = this.f4268h;
            int i3 = this.f4269i;
            int i4 = i2;
            while (true) {
                if (i2 < i3) {
                    int i5 = i2 + 1;
                    char c2 = cArr[i2];
                    if (c2 == c) {
                        this.f4268h = i5;
                        int i6 = (i5 - i4) - 1;
                        if (sb == null) {
                            return new String(cArr, i4, i6);
                        }
                        sb.append(cArr, i4, i6);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.f4268h = i5;
                        int i7 = (i5 - i4) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i7 + 1) * 2, 16));
                        }
                        sb.append(cArr, i4, i7);
                        sb.append(h0());
                    } else {
                        if (c2 == 10) {
                            this.f4270j++;
                            this.f4271k = i5;
                        }
                        i2 = i5;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i2 - i4) * 2, 16));
                    }
                    sb.append(cArr, i4, i2 - i4);
                    this.f4268h = i2;
                    if (!E(1)) {
                        o0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String c0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r6.f4268h
            int r4 = r3 + r2
            int r5 = r6.f4269i
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f4267g
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.g()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f4267g
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.E(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f4267g
            int r4 = r6.f4268h
            r1.append(r3, r4, r2)
            int r3 = r6.f4268h
            int r3 = r3 + r2
            r6.f4268h = r3
            r2 = 1
            boolean r2 = r6.E(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f4267g
            int r3 = r6.f4268h
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f4267g
            int r3 = r6.f4268h
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f4268h
            int r2 = r2 + r0
            r6.f4268h = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.d.a0.a.c0():java.lang.String");
    }

    private int e0() {
        String str;
        String str2;
        int i2;
        char c = this.f4267g[this.f4268h];
        if (c == 't' || c == 'T') {
            i2 = 5;
            str2 = "true";
            str = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i2 = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i2 = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i3 = 1; i3 < length; i3++) {
            if (this.f4268h + i3 >= this.f4269i && !E(i3 + 1)) {
                return 0;
            }
            char c2 = this.f4267g[this.f4268h + i3];
            if (c2 != str2.charAt(i3) && c2 != str.charAt(i3)) {
                return 0;
            }
        }
        if ((this.f4268h + length < this.f4269i || E(length + 1)) && P(this.f4267g[this.f4268h + length])) {
            return 0;
        }
        this.f4268h += length;
        this.f4272l = i2;
        return i2;
    }

    private int f0() {
        int i2;
        char c;
        char[] cArr = this.f4267g;
        int i3 = this.f4268h;
        int i4 = this.f4269i;
        int i5 = 0;
        int i6 = 0;
        char c2 = 0;
        boolean z = true;
        long j2 = 0;
        boolean z2 = false;
        while (true) {
            if (i3 + i6 == i4) {
                if (i6 == cArr.length) {
                    return i5;
                }
                if (!E(i6 + 1)) {
                    break;
                }
                i3 = this.f4268h;
                i4 = this.f4269i;
            }
            c = cArr[i3 + i6];
            if (c == '+') {
                i5 = 0;
                if (c2 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                i5 = 0;
                if (c2 != 2 && c2 != 4) {
                    return 0;
                }
                c2 = 5;
                i6++;
            } else {
                if (c == '-') {
                    i5 = 0;
                    if (c2 == 0) {
                        c2 = 1;
                        z2 = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (c == '.') {
                    i5 = 0;
                    if (c2 != 2) {
                        return 0;
                    }
                    c2 = 3;
                } else if (c >= '0' && c <= '9') {
                    if (c2 == 1 || c2 == 0) {
                        j2 = (long) (-(c - '0'));
                        i5 = 0;
                        c2 = 2;
                    } else {
                        if (c2 == 2) {
                            if (j2 == 0) {
                                return 0;
                            }
                            long j3 = (10 * j2) - ((long) (c - '0'));
                            int i7 = (j2 > -922337203685477580L ? 1 : (j2 == -922337203685477580L ? 0 : -1));
                            z &= i7 > 0 || (i7 == 0 && j3 < j2);
                            j2 = j3;
                        } else if (c2 == 3) {
                            i5 = 0;
                            c2 = 4;
                        } else if (c2 == 5 || c2 == 6) {
                            i5 = 0;
                            c2 = 7;
                        }
                        i5 = 0;
                    }
                }
                i6++;
            }
            c2 = 6;
            i6++;
        }
        if (P(c)) {
            return 0;
        }
        if (c2 == 2 && z && ((j2 != Long.MIN_VALUE || z2) && (j2 != 0 || !z2))) {
            if (!z2) {
                j2 = -j2;
            }
            this.f4273m = j2;
            this.f4268h += i6;
            i2 = 15;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f4274n = i6;
            i2 = 16;
        }
        this.f4272l = i2;
        return i2;
    }

    private void g() {
        if (!this.f4266f) {
            o0("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    private void g0(int i2) {
        int i3 = this.f4277q;
        int[] iArr = this.f4276p;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.f4276p = Arrays.copyOf(iArr, i4);
            this.f4279s = Arrays.copyOf(this.f4279s, i4);
            this.f4278r = (String[]) Arrays.copyOf(this.f4278r, i4);
        }
        int[] iArr2 = this.f4276p;
        int i5 = this.f4277q;
        this.f4277q = i5 + 1;
        iArr2[i5] = i2;
    }

    private char h0() {
        int i2;
        int i3;
        if (this.f4268h != this.f4269i || E(1)) {
            char[] cArr = this.f4267g;
            int i4 = this.f4268h;
            int i5 = i4 + 1;
            this.f4268h = i5;
            char c = cArr[i4];
            if (c == 10) {
                this.f4270j++;
                this.f4271k = i5;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    o0("Invalid escape sequence");
                    throw null;
                } else if (i5 + 4 <= this.f4269i || E(4)) {
                    char c2 = 0;
                    int i6 = this.f4268h;
                    int i7 = i6 + 4;
                    while (i6 < i7) {
                        char c3 = this.f4267g[i6];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i2 = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f4267g, this.f4268h, 4));
                            } else {
                                i2 = c3 - 'A';
                            }
                            i3 = i2 + 10;
                        } else {
                            i3 = c3 - '0';
                        }
                        c2 = (char) (c4 + i3);
                        i6++;
                    }
                    this.f4268h += 4;
                    return c2;
                } else {
                    o0("Unterminated escape sequence");
                    throw null;
                }
            }
            return c;
        }
        o0("Unterminated escape sequence");
        throw null;
    }

    private void j0(char c) {
        char[] cArr = this.f4267g;
        while (true) {
            int i2 = this.f4268h;
            int i3 = this.f4269i;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char c2 = cArr[i2];
                    if (c2 == c) {
                        this.f4268h = i4;
                        return;
                    } else if (c2 == '\\') {
                        this.f4268h = i4;
                        h0();
                        break;
                    } else {
                        if (c2 == 10) {
                            this.f4270j++;
                            this.f4271k = i4;
                        }
                        i2 = i4;
                    }
                } else {
                    this.f4268h = i2;
                    if (!E(1)) {
                        o0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    private boolean k0(String str) {
        int length = str.length();
        while (true) {
            int i2 = 0;
            if (this.f4268h + length > this.f4269i && !E(length)) {
                return false;
            }
            char[] cArr = this.f4267g;
            int i3 = this.f4268h;
            if (cArr[i3] == 10) {
                this.f4270j++;
                this.f4271k = i3 + 1;
            } else {
                while (i2 < length) {
                    if (this.f4267g[this.f4268h + i2] == str.charAt(i2)) {
                        i2++;
                    }
                }
                return true;
            }
            this.f4268h++;
        }
    }

    private void l0() {
        char c;
        do {
            if (this.f4268h < this.f4269i || E(1)) {
                char[] cArr = this.f4267g;
                int i2 = this.f4268h;
                int i3 = i2 + 1;
                this.f4268h = i3;
                c = cArr[i2];
                if (c == 10) {
                    this.f4270j++;
                    this.f4271k = i3;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m0() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f4268h
            int r2 = r1 + r0
            int r3 = r4.f4269i
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f4267g
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.g()
        L_0x004b:
            int r1 = r4.f4268h
            int r1 = r1 + r0
            r4.f4268h = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f4268h = r1
            r0 = 1
            boolean r0 = r4.E(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.d.a0.a.m0():void");
    }

    private void o() {
        Y(true);
        int i2 = this.f4268h - 1;
        this.f4268h = i2;
        if (i2 + 5 <= this.f4269i || E(5)) {
            char[] cArr = this.f4267g;
            if (cArr[i2] == ')' && cArr[i2 + 1] == ']' && cArr[i2 + 2] == '}' && cArr[i2 + 3] == '\'' && cArr[i2 + 4] == 10) {
                this.f4268h += 5;
            }
        }
    }

    private IOException o0(String str) {
        throw new d(str + S());
    }

    public void B() {
        int i2 = this.f4272l;
        if (i2 == 0) {
            i2 = v();
        }
        if (i2 == 2) {
            int i3 = this.f4277q - 1;
            this.f4277q = i3;
            this.f4278r[i3] = null;
            int[] iArr = this.f4279s;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f4272l = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + d0() + S());
    }

    public String J() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = this.f4277q;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f4276p[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.f4279s[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String[] strArr = this.f4278r;
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        return sb.toString();
    }

    public boolean L() {
        int i2 = this.f4272l;
        if (i2 == 0) {
            i2 = v();
        }
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    public final boolean O() {
        return this.f4266f;
    }

    /* access modifiers changed from: package-private */
    public String S() {
        return " at line " + (this.f4270j + 1) + " column " + ((this.f4268h - this.f4271k) + 1) + " path " + J();
    }

    public boolean T() {
        int i2 = this.f4272l;
        if (i2 == 0) {
            i2 = v();
        }
        if (i2 == 5) {
            this.f4272l = 0;
            int[] iArr = this.f4279s;
            int i3 = this.f4277q - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.f4272l = 0;
            int[] iArr2 = this.f4279s;
            int i4 = this.f4277q - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + d0() + S());
        }
    }

    public double U() {
        String str;
        int i2 = this.f4272l;
        if (i2 == 0) {
            i2 = v();
        }
        if (i2 == 15) {
            this.f4272l = 0;
            int[] iArr = this.f4279s;
            int i3 = this.f4277q - 1;
            iArr[i3] = iArr[i3] + 1;
            return (double) this.f4273m;
        }
        if (i2 == 16) {
            this.f4275o = new String(this.f4267g, this.f4268h, this.f4274n);
            this.f4268h += this.f4274n;
        } else {
            if (i2 == 8 || i2 == 9) {
                str = a0(i2 == 8 ? '\'' : '\"');
            } else if (i2 == 10) {
                str = c0();
            } else if (i2 != 11) {
                throw new IllegalStateException("Expected a double but was " + d0() + S());
            }
            this.f4275o = str;
        }
        this.f4272l = 11;
        double parseDouble = Double.parseDouble(this.f4275o);
        if (this.f4266f || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f4275o = null;
            this.f4272l = 0;
            int[] iArr2 = this.f4279s;
            int i4 = this.f4277q - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        }
        throw new d("JSON forbids NaN and infinities: " + parseDouble + S());
    }

    public int V() {
        String a0;
        int i2 = this.f4272l;
        if (i2 == 0) {
            i2 = v();
        }
        if (i2 == 15) {
            long j2 = this.f4273m;
            int i3 = (int) j2;
            if (j2 == ((long) i3)) {
                this.f4272l = 0;
                int[] iArr = this.f4279s;
                int i4 = this.f4277q - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            throw new NumberFormatException("Expected an int but was " + this.f4273m + S());
        }
        if (i2 == 16) {
            this.f4275o = new String(this.f4267g, this.f4268h, this.f4274n);
            this.f4268h += this.f4274n;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                a0 = c0();
            } else {
                a0 = a0(i2 == 8 ? '\'' : '\"');
            }
            this.f4275o = a0;
            try {
                int parseInt = Integer.parseInt(this.f4275o);
                this.f4272l = 0;
                int[] iArr2 = this.f4279s;
                int i5 = this.f4277q - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + d0() + S());
        }
        this.f4272l = 11;
        double parseDouble = Double.parseDouble(this.f4275o);
        int i6 = (int) parseDouble;
        if (((double) i6) == parseDouble) {
            this.f4275o = null;
            this.f4272l = 0;
            int[] iArr3 = this.f4279s;
            int i7 = this.f4277q - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        }
        throw new NumberFormatException("Expected an int but was " + this.f4275o + S());
    }

    public long W() {
        String a0;
        int i2 = this.f4272l;
        if (i2 == 0) {
            i2 = v();
        }
        if (i2 == 15) {
            this.f4272l = 0;
            int[] iArr = this.f4279s;
            int i3 = this.f4277q - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.f4273m;
        }
        if (i2 == 16) {
            this.f4275o = new String(this.f4267g, this.f4268h, this.f4274n);
            this.f4268h += this.f4274n;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                a0 = c0();
            } else {
                a0 = a0(i2 == 8 ? '\'' : '\"');
            }
            this.f4275o = a0;
            try {
                long parseLong = Long.parseLong(this.f4275o);
                this.f4272l = 0;
                int[] iArr2 = this.f4279s;
                int i4 = this.f4277q - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + d0() + S());
        }
        this.f4272l = 11;
        double parseDouble = Double.parseDouble(this.f4275o);
        long j2 = (long) parseDouble;
        if (((double) j2) == parseDouble) {
            this.f4275o = null;
            this.f4272l = 0;
            int[] iArr3 = this.f4279s;
            int i5 = this.f4277q - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.f4275o + S());
    }

    public String X() {
        String str;
        char c;
        int i2 = this.f4272l;
        if (i2 == 0) {
            i2 = v();
        }
        if (i2 == 14) {
            str = c0();
        } else {
            if (i2 == 12) {
                c = '\'';
            } else if (i2 == 13) {
                c = '\"';
            } else {
                throw new IllegalStateException("Expected a name but was " + d0() + S());
            }
            str = a0(c);
        }
        this.f4272l = 0;
        this.f4278r[this.f4277q - 1] = str;
        return str;
    }

    public void Z() {
        int i2 = this.f4272l;
        if (i2 == 0) {
            i2 = v();
        }
        if (i2 == 7) {
            this.f4272l = 0;
            int[] iArr = this.f4279s;
            int i3 = this.f4277q - 1;
            iArr[i3] = iArr[i3] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + d0() + S());
    }

    public void a() {
        int i2 = this.f4272l;
        if (i2 == 0) {
            i2 = v();
        }
        if (i2 == 3) {
            g0(1);
            this.f4279s[this.f4277q - 1] = 0;
            this.f4272l = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + d0() + S());
    }

    public String b0() {
        String str;
        char c;
        int i2 = this.f4272l;
        if (i2 == 0) {
            i2 = v();
        }
        if (i2 == 10) {
            str = c0();
        } else {
            if (i2 == 8) {
                c = '\'';
            } else if (i2 == 9) {
                c = '\"';
            } else if (i2 == 11) {
                str = this.f4275o;
                this.f4275o = null;
            } else if (i2 == 15) {
                str = Long.toString(this.f4273m);
            } else if (i2 == 16) {
                str = new String(this.f4267g, this.f4268h, this.f4274n);
                this.f4268h += this.f4274n;
            } else {
                throw new IllegalStateException("Expected a string but was " + d0() + S());
            }
            str = a0(c);
        }
        this.f4272l = 0;
        int[] iArr = this.f4279s;
        int i3 = this.f4277q - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    public void c() {
        int i2 = this.f4272l;
        if (i2 == 0) {
            i2 = v();
        }
        if (i2 == 1) {
            g0(3);
            this.f4272l = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + d0() + S());
    }

    public void close() {
        this.f4272l = 0;
        this.f4276p[0] = 8;
        this.f4277q = 1;
        this.f4265e.close();
    }

    public b d0() {
        int i2 = this.f4272l;
        if (i2 == 0) {
            i2 = v();
        }
        switch (i2) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void i0(boolean z) {
        this.f4266f = z;
    }

    public void n0() {
        char c;
        int i2 = 0;
        do {
            int i3 = this.f4272l;
            if (i3 == 0) {
                i3 = v();
            }
            if (i3 == 3) {
                g0(1);
            } else if (i3 == 1) {
                g0(3);
            } else if (i3 == 4 || i3 == 2) {
                this.f4277q--;
                i2--;
                this.f4272l = 0;
            } else if (i3 == 14 || i3 == 10) {
                m0();
                this.f4272l = 0;
            } else {
                if (i3 == 8 || i3 == 12) {
                    c = '\'';
                } else if (i3 == 9 || i3 == 13) {
                    c = '\"';
                } else {
                    if (i3 == 16) {
                        this.f4268h += this.f4274n;
                    }
                    this.f4272l = 0;
                }
                j0(c);
                this.f4272l = 0;
            }
            i2++;
            this.f4272l = 0;
        } while (i2 != 0);
        int[] iArr = this.f4279s;
        int i4 = this.f4277q;
        int i5 = i4 - 1;
        iArr[i5] = iArr[i5] + 1;
        this.f4278r[i4 - 1] = "null";
    }

    public String toString() {
        return getClass().getSimpleName() + S();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int v() {
        /*
            r16 = this;
            r0 = r16
            int[] r1 = r0.f4276p
            int r2 = r0.f4277q
            int r3 = r2 + -1
            r3 = r1[r3]
            r4 = 8
            r5 = 39
            r6 = 34
            r7 = 93
            r8 = 3
            r9 = 7
            r10 = 59
            r11 = 44
            r12 = 4
            r13 = 2
            r14 = 0
            r15 = 1
            if (r3 != r15) goto L_0x0023
            int r2 = r2 - r15
            r1[r2] = r13
            goto L_0x00a3
        L_0x0023:
            if (r3 != r13) goto L_0x003c
            int r1 = r0.Y(r15)
            if (r1 == r11) goto L_0x00a3
            if (r1 == r10) goto L_0x0038
            if (r1 != r7) goto L_0x0032
            r0.f4272l = r12
            return r12
        L_0x0032:
            java.lang.String r1 = "Unterminated array"
            r0.o0(r1)
            throw r14
        L_0x0038:
            r16.g()
            goto L_0x00a3
        L_0x003c:
            r13 = 5
            if (r3 == r8) goto L_0x0117
            if (r3 != r13) goto L_0x0043
            goto L_0x0117
        L_0x0043:
            if (r3 != r12) goto L_0x0077
            int r2 = r2 - r15
            r1[r2] = r13
            int r1 = r0.Y(r15)
            r2 = 58
            if (r1 == r2) goto L_0x00a3
            r2 = 61
            if (r1 != r2) goto L_0x0071
            r16.g()
            int r1 = r0.f4268h
            int r2 = r0.f4269i
            if (r1 < r2) goto L_0x0063
            boolean r1 = r0.E(r15)
            if (r1 == 0) goto L_0x00a3
        L_0x0063:
            char[] r1 = r0.f4267g
            int r2 = r0.f4268h
            char r1 = r1[r2]
            r13 = 62
            if (r1 != r13) goto L_0x00a3
            int r2 = r2 + r15
            r0.f4268h = r2
            goto L_0x00a3
        L_0x0071:
            java.lang.String r1 = "Expected ':'"
            r0.o0(r1)
            throw r14
        L_0x0077:
            r1 = 6
            if (r3 != r1) goto L_0x0089
            boolean r1 = r0.f4266f
            if (r1 == 0) goto L_0x0081
            r16.o()
        L_0x0081:
            int[] r1 = r0.f4276p
            int r2 = r0.f4277q
            int r2 = r2 - r15
            r1[r2] = r9
            goto L_0x00a3
        L_0x0089:
            if (r3 != r9) goto L_0x00a1
            r1 = 0
            int r1 = r0.Y(r1)
            r2 = -1
            if (r1 != r2) goto L_0x0098
            r1 = 17
        L_0x0095:
            r0.f4272l = r1
            return r1
        L_0x0098:
            r16.g()
            int r1 = r0.f4268h
            int r1 = r1 - r15
            r0.f4268h = r1
            goto L_0x00a3
        L_0x00a1:
            if (r3 == r4) goto L_0x010f
        L_0x00a3:
            int r1 = r0.Y(r15)
            if (r1 == r6) goto L_0x010c
            if (r1 == r5) goto L_0x0106
            if (r1 == r11) goto L_0x00ef
            if (r1 == r10) goto L_0x00ef
            r2 = 91
            if (r1 == r2) goto L_0x00ec
            if (r1 == r7) goto L_0x00e7
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x00e4
            int r1 = r0.f4268h
            int r1 = r1 - r15
            r0.f4268h = r1
            int r1 = r16.e0()
            if (r1 == 0) goto L_0x00c5
            return r1
        L_0x00c5:
            int r1 = r16.f0()
            if (r1 == 0) goto L_0x00cc
            return r1
        L_0x00cc:
            char[] r1 = r0.f4267g
            int r2 = r0.f4268h
            char r1 = r1[r2]
            boolean r1 = r0.P(r1)
            if (r1 == 0) goto L_0x00de
            r16.g()
            r1 = 10
            goto L_0x0095
        L_0x00de:
            java.lang.String r1 = "Expected value"
            r0.o0(r1)
            throw r14
        L_0x00e4:
            r0.f4272l = r15
            return r15
        L_0x00e7:
            if (r3 != r15) goto L_0x00ef
            r0.f4272l = r12
            return r12
        L_0x00ec:
            r0.f4272l = r8
            return r8
        L_0x00ef:
            if (r3 == r15) goto L_0x00fb
            r1 = 2
            if (r3 != r1) goto L_0x00f5
            goto L_0x00fb
        L_0x00f5:
            java.lang.String r1 = "Unexpected value"
            r0.o0(r1)
            throw r14
        L_0x00fb:
            r16.g()
            int r1 = r0.f4268h
            int r1 = r1 - r15
            r0.f4268h = r1
            r0.f4272l = r9
            return r9
        L_0x0106:
            r16.g()
            r0.f4272l = r4
            return r4
        L_0x010c:
            r1 = 9
            goto L_0x0095
        L_0x010f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x0117:
            int r2 = r2 - r15
            r1[r2] = r12
            r1 = 125(0x7d, float:1.75E-43)
            if (r3 != r13) goto L_0x0134
            int r2 = r0.Y(r15)
            if (r2 == r11) goto L_0x0134
            if (r2 == r10) goto L_0x0131
            if (r2 != r1) goto L_0x012b
        L_0x0128:
            r1 = 2
            goto L_0x0095
        L_0x012b:
            java.lang.String r1 = "Unterminated object"
            r0.o0(r1)
            throw r14
        L_0x0131:
            r16.g()
        L_0x0134:
            int r2 = r0.Y(r15)
            if (r2 == r6) goto L_0x0165
            if (r2 == r5) goto L_0x015e
            java.lang.String r4 = "Expected name"
            if (r2 == r1) goto L_0x0157
            r16.g()
            int r1 = r0.f4268h
            int r1 = r1 - r15
            r0.f4268h = r1
            char r1 = (char) r2
            boolean r1 = r0.P(r1)
            if (r1 == 0) goto L_0x0153
            r1 = 14
            goto L_0x0095
        L_0x0153:
            r0.o0(r4)
            throw r14
        L_0x0157:
            if (r3 == r13) goto L_0x015a
            goto L_0x0128
        L_0x015a:
            r0.o0(r4)
            throw r14
        L_0x015e:
            r16.g()
            r1 = 12
            goto L_0x0095
        L_0x0165:
            r1 = 13
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.d.a0.a.v():int");
    }

    public void z() {
        int i2 = this.f4272l;
        if (i2 == 0) {
            i2 = v();
        }
        if (i2 == 4) {
            int i3 = this.f4277q - 1;
            this.f4277q = i3;
            int[] iArr = this.f4279s;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f4272l = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + d0() + S());
    }
}
