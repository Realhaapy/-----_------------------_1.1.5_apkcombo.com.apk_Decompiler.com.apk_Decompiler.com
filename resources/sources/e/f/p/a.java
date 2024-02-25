package e.f.p;

import android.text.SpannableStringBuilder;
import java.util.Locale;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    static final d f3385d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f3386e = Character.toString(8206);

    /* renamed from: f  reason: collision with root package name */
    private static final String f3387f = Character.toString(8207);

    /* renamed from: g  reason: collision with root package name */
    static final a f3388g;

    /* renamed from: h  reason: collision with root package name */
    static final a f3389h;
    private final boolean a;
    private final int b;
    private final d c;

    /* renamed from: e.f.p.a$a  reason: collision with other inner class name */
    public static final class C0075a {
        private boolean a;
        private int b;
        private d c;

        public C0075a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z) {
            return z ? a.f3389h : a.f3388g;
        }

        private void c(boolean z) {
            this.a = z;
            this.c = a.f3385d;
            this.b = 2;
        }

        public a a() {
            return (this.b == 2 && this.c == a.f3385d) ? b(this.a) : new a(this.a, this.b, this.c);
        }
    }

    private static class b {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f3390f = new byte[1792];
        private final CharSequence a;
        private final boolean b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        private int f3391d;

        /* renamed from: e  reason: collision with root package name */
        private char f3392e;

        static {
            for (int i2 = 0; i2 < 1792; i2++) {
                f3390f[i2] = Character.getDirectionality(i2);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.a = charSequence;
            this.b = z;
            this.c = charSequence.length();
        }

        private static byte c(char c2) {
            return c2 < 1792 ? f3390f[c2] : Character.getDirectionality(c2);
        }

        private byte f() {
            char charAt;
            int i2 = this.f3391d;
            do {
                int i3 = this.f3391d;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.a;
                int i4 = i3 - 1;
                this.f3391d = i4;
                charAt = charSequence.charAt(i4);
                this.f3392e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f3391d = i2;
            this.f3392e = ';';
            return 13;
        }

        private byte g() {
            char charAt;
            do {
                int i2 = this.f3391d;
                if (i2 >= this.c) {
                    return 12;
                }
                CharSequence charSequence = this.a;
                this.f3391d = i2 + 1;
                charAt = charSequence.charAt(i2);
                this.f3392e = charAt;
            } while (charAt != ';');
            return 12;
        }

        private byte h() {
            char charAt;
            int i2 = this.f3391d;
            while (true) {
                int i3 = this.f3391d;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.a;
                int i4 = i3 - 1;
                this.f3391d = i4;
                char charAt2 = charSequence.charAt(i4);
                this.f3392e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i5 = this.f3391d;
                        if (i5 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.a;
                        int i6 = i5 - 1;
                        this.f3391d = i6;
                        charAt = charSequence2.charAt(i6);
                        this.f3392e = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f3391d = i2;
            this.f3392e = '>';
            return 13;
        }

        private byte i() {
            char charAt;
            int i2 = this.f3391d;
            while (true) {
                int i3 = this.f3391d;
                if (i3 < this.c) {
                    CharSequence charSequence = this.a;
                    this.f3391d = i3 + 1;
                    char charAt2 = charSequence.charAt(i3);
                    this.f3392e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i4 = this.f3391d;
                            if (i4 >= this.c) {
                                break;
                            }
                            CharSequence charSequence2 = this.a;
                            this.f3391d = i4 + 1;
                            charAt = charSequence2.charAt(i4);
                            this.f3392e = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f3391d = i2;
                    this.f3392e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public byte a() {
            char charAt = this.a.charAt(this.f3391d - 1);
            this.f3392e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.a, this.f3391d);
                this.f3391d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f3391d--;
            byte c2 = c(this.f3392e);
            if (!this.b) {
                return c2;
            }
            char c3 = this.f3392e;
            return c3 == '>' ? h() : c3 == ';' ? f() : c2;
        }

        /* access modifiers changed from: package-private */
        public byte b() {
            char charAt = this.a.charAt(this.f3391d);
            this.f3392e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.a, this.f3391d);
                this.f3391d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f3391d++;
            byte c2 = c(this.f3392e);
            if (!this.b) {
                return c2;
            }
            char c3 = this.f3392e;
            return c3 == '<' ? i() : c3 == '&' ? g() : c2;
        }

        /* access modifiers changed from: package-private */
        public int d() {
            this.f3391d = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (this.f3391d < this.c && i2 == 0) {
                byte b2 = b();
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i4 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case 14:
                            case 15:
                                i4++;
                                i3 = -1;
                                continue;
                            case 16:
                            case 17:
                                i4++;
                                i3 = 1;
                                continue;
                            case 18:
                                i4--;
                                i3 = 0;
                                continue;
                        }
                    }
                } else if (i4 == 0) {
                    return -1;
                }
                i2 = i4;
            }
            if (i2 == 0) {
                return 0;
            }
            if (i3 != 0) {
                return i3;
            }
            while (this.f3391d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i2 == i4) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i2 == i4) {
                            return 1;
                        }
                        break;
                    case 18:
                        i4++;
                        continue;
                }
                i4--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r1 = r1 - 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int e() {
            /*
                r7 = this;
                int r0 = r7.c
                r7.f3391d = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.f3391d
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0025:
                if (r2 != r1) goto L_0x002b
                return r5
            L_0x0028:
                if (r2 != r1) goto L_0x002b
                return r4
            L_0x002b:
                int r1 = r1 + -1
                goto L_0x0007
            L_0x002e:
                if (r1 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r1 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r2 != 0) goto L_0x0007
            L_0x0039:
                r2 = r1
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e.f.p.a.b.e():int");
        }
    }

    static {
        d dVar = e.c;
        f3385d = dVar;
        f3388g = new a(false, 2, dVar);
        f3389h = new a(true, 2, dVar);
    }

    a(boolean z, int i2, d dVar) {
        this.a = z;
        this.b = i2;
        this.c = dVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0075a().a();
    }

    static boolean e(Locale locale) {
        return f.b(locale) == 1;
    }

    private String f(CharSequence charSequence, d dVar) {
        boolean a2 = dVar.a(charSequence, 0, charSequence.length());
        return (this.a || (!a2 && b(charSequence) != 1)) ? this.a ? (!a2 || b(charSequence) == -1) ? f3387f : "" : "" : f3386e;
    }

    private String g(CharSequence charSequence, d dVar) {
        boolean a2 = dVar.a(charSequence, 0, charSequence.length());
        return (this.a || (!a2 && a(charSequence) != 1)) ? this.a ? (!a2 || a(charSequence) == -1) ? f3387f : "" : "" : f3386e;
    }

    public boolean d() {
        return (this.b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.c, true);
    }

    public CharSequence i(CharSequence charSequence, d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a2 = dVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z) {
            spannableStringBuilder.append(g(charSequence, a2 ? e.b : e.a));
        }
        if (a2 != this.a) {
            spannableStringBuilder.append(a2 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(f(charSequence, a2 ? e.b : e.a));
        }
        return spannableStringBuilder;
    }
}
