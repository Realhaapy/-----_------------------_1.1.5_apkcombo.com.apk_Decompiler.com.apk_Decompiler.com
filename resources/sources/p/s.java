package p;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p.e0.c;

public final class s {

    /* renamed from: j  reason: collision with root package name */
    private static final char[] f5398j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final String a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    final String f5399d;

    /* renamed from: e  reason: collision with root package name */
    final int f5400e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f5401f;

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f5402g;

    /* renamed from: h  reason: collision with root package name */
    private final String f5403h;

    /* renamed from: i  reason: collision with root package name */
    private final String f5404i;

    public static final class a {
        String a;
        String b = "";
        String c = "";

        /* renamed from: d  reason: collision with root package name */
        String f5405d;

        /* renamed from: e  reason: collision with root package name */
        int f5406e = -1;

        /* renamed from: f  reason: collision with root package name */
        final List<String> f5407f;

        /* renamed from: g  reason: collision with root package name */
        List<String> f5408g;

        /* renamed from: h  reason: collision with root package name */
        String f5409h;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f5407f = arrayList;
            arrayList.add("");
        }

        private static String b(String str, int i2, int i3) {
            return c.c(s.r(str, i2, i3, false));
        }

        private boolean f(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean g(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private static int i(String str, int i2, int i3) {
            try {
                int parseInt = Integer.parseInt(s.a(str, i2, i3, "", false, false, false, true, (Charset) null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        private void k() {
            List<String> list = this.f5407f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f5407f.isEmpty()) {
                this.f5407f.add("");
                return;
            }
            List<String> list2 = this.f5407f;
            list2.set(list2.size() - 1, "");
        }

        private static int m(String str, int i2, int i3) {
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt == ':') {
                    return i2;
                }
                if (charAt == '[') {
                    do {
                        i2++;
                        if (i2 >= i3) {
                            break;
                        }
                    } while (str.charAt(i2) == ']');
                }
                i2++;
            }
            return i3;
        }

        private void n(String str, int i2, int i3, boolean z, boolean z2) {
            String a2 = s.a(str, i2, i3, " \"<>^`{}|/\\?#", z2, false, false, true, (Charset) null);
            if (!f(a2)) {
                if (g(a2)) {
                    k();
                    return;
                }
                List<String> list = this.f5407f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f5407f;
                    list2.set(list2.size() - 1, a2);
                } else {
                    this.f5407f.add(a2);
                }
                if (z) {
                    this.f5407f.add("");
                }
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        private void p(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f5407f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f5407f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f5407f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = p.e0.c.m(r11, r6, r13, r12)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.n(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p.s.a.p(java.lang.String, int, int):void");
        }

        private static int r(String str, int i2, int i3) {
            if (i3 - i2 < 2) {
                return -1;
            }
            char charAt = str.charAt(i2);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i2++;
                    if (i2 >= i3) {
                        break;
                    }
                    char charAt2 = str.charAt(i2);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i2;
                        }
                    }
                }
            }
            return -1;
        }

        private static int s(String str, int i2, int i3) {
            int i4 = 0;
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i4++;
                i2++;
            }
            return i4;
        }

        public s a() {
            if (this.a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f5405d != null) {
                return new s(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: package-private */
        public int c() {
            int i2 = this.f5406e;
            return i2 != -1 ? i2 : s.d(this.a);
        }

        public a d(String str) {
            this.f5408g = str != null ? s.y(s.b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public a e(String str) {
            Objects.requireNonNull(str, "host == null");
            String b2 = b(str, 0, str.length());
            if (b2 != null) {
                this.f5405d = b2;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        /* access modifiers changed from: package-private */
        public a h(s sVar, String str) {
            int m2;
            int i2;
            s sVar2 = sVar;
            String str2 = str;
            int C = c.C(str2, 0, str.length());
            int D = c.D(str2, C, str.length());
            int r2 = r(str2, C, D);
            if (r2 != -1) {
                if (str.regionMatches(true, C, "https:", 0, 6)) {
                    this.a = "https";
                    C += 6;
                } else if (str.regionMatches(true, C, "http:", 0, 5)) {
                    this.a = "http";
                    C += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, r2) + "'");
                }
            } else if (sVar2 != null) {
                this.a = sVar2.a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int s2 = s(str2, C, D);
            char c2 = '?';
            char c3 = '#';
            if (s2 >= 2 || sVar2 == null || !sVar2.a.equals(this.a)) {
                int i3 = C + s2;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    m2 = c.m(str2, i3, D, "@/\\?#");
                    char charAt = m2 != D ? str2.charAt(m2) : 65535;
                    if (charAt == 65535 || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        int i4 = m2;
                        int m3 = m(str2, i3, i4);
                        int i5 = m3 + 1;
                    } else {
                        if (charAt == '@') {
                            if (!z) {
                                int l2 = c.l(str2, i3, m2, ':');
                                int i6 = l2;
                                String str3 = "%40";
                                i2 = m2;
                                String a2 = s.a(str, i3, l2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                if (z2) {
                                    a2 = this.b + str3 + a2;
                                }
                                this.b = a2;
                                if (i6 != i2) {
                                    this.c = s.a(str, i6 + 1, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                i2 = m2;
                                this.c += "%40" + s.a(str, i3, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                            }
                            i3 = i2 + 1;
                        }
                        c2 = '?';
                        c3 = '#';
                    }
                }
                int i42 = m2;
                int m32 = m(str2, i3, i42);
                int i52 = m32 + 1;
                if (i52 < i42) {
                    this.f5405d = b(str2, i3, m32);
                    int i7 = i(str2, i52, i42);
                    this.f5406e = i7;
                    if (i7 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i52, i42) + '\"');
                    }
                } else {
                    this.f5405d = b(str2, i3, m32);
                    this.f5406e = s.d(this.a);
                }
                if (this.f5405d != null) {
                    C = i42;
                } else {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i3, m32) + '\"');
                }
            } else {
                this.b = sVar.j();
                this.c = sVar.f();
                this.f5405d = sVar2.f5399d;
                this.f5406e = sVar2.f5400e;
                this.f5407f.clear();
                this.f5407f.addAll(sVar.h());
                if (C == D || str2.charAt(C) == '#') {
                    d(sVar.i());
                }
            }
            int m4 = c.m(str2, C, D, "?#");
            p(str2, C, m4);
            if (m4 < D && str2.charAt(m4) == '?') {
                int l3 = c.l(str2, m4, D, '#');
                this.f5408g = s.y(s.a(str, m4 + 1, l3, " \"'<>#", true, false, true, true, (Charset) null));
                m4 = l3;
            }
            if (m4 < D && str2.charAt(m4) == '#') {
                this.f5409h = s.a(str, 1 + m4, D, "", true, false, false, false, (Charset) null);
            }
            return this;
        }

        public a j(String str) {
            Objects.requireNonNull(str, "password == null");
            this.c = s.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public a l(int i2) {
            if (i2 <= 0 || i2 > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i2);
            }
            this.f5406e = i2;
            return this;
        }

        /* access modifiers changed from: package-private */
        public a o() {
            int size = this.f5407f.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f5407f.set(i2, s.b(this.f5407f.get(i2), "[]", true, true, false, true));
            }
            List<String> list = this.f5408g;
            if (list != null) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str = this.f5408g.get(i3);
                    if (str != null) {
                        this.f5408g.set(i3, s.b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f5409h;
            if (str2 != null) {
                this.f5409h = s.b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a q(String str) {
            Objects.requireNonNull(str, "scheme == null");
            String str2 = "http";
            if (!str.equalsIgnoreCase(str2)) {
                str2 = "https";
                if (!str.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
            }
            this.a = str2;
            return this;
        }

        public a t(String str) {
            Objects.requireNonNull(str, "username == null");
            this.b = s.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            String str3 = this.f5405d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f5405d);
                    sb.append(']');
                } else {
                    sb.append(this.f5405d);
                }
            }
            if (!(this.f5406e == -1 && this.a == null)) {
                int c2 = c();
                String str4 = this.a;
                if (str4 == null || c2 != s.d(str4)) {
                    sb.append(':');
                    sb.append(c2);
                }
            }
            s.q(sb, this.f5407f);
            if (this.f5408g != null) {
                sb.append('?');
                s.n(sb, this.f5408g);
            }
            if (this.f5409h != null) {
                sb.append('#');
                sb.append(this.f5409h);
            }
            return sb.toString();
        }
    }

    s(a aVar) {
        this.a = aVar.a;
        this.b = s(aVar.b, false);
        this.c = s(aVar.c, false);
        this.f5399d = aVar.f5405d;
        this.f5400e = aVar.c();
        this.f5401f = t(aVar.f5407f, false);
        List<String> list = aVar.f5408g;
        String str = null;
        this.f5402g = list != null ? t(list, true) : null;
        String str2 = aVar.f5409h;
        this.f5403h = str2 != null ? s(str2, false) : str;
        this.f5404i = aVar.toString();
    }

    static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i4 = i3;
        int i5 = i2;
        while (i5 < i4) {
            int codePointAt = str.codePointAt(i5);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || v(str, i5, i3)))) && (codePointAt != 43 || !z3))) {
                    i5 += Character.charCount(codePointAt);
                }
            }
            q.c cVar = new q.c();
            int i6 = i2;
            cVar.l0(str, i2, i5);
            c(cVar, str, i5, i3, str2, z, z2, z3, z4, charset);
            return cVar.U();
        }
        int i7 = i2;
        return str.substring(i2, i3);
    }

    static String b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, (Charset) null);
    }

    static void c(q.c cVar, String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        q.c cVar2 = null;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    cVar.k0(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !v(str, i2, i3)))))) {
                    if (cVar2 == null) {
                        cVar2 = new q.c();
                    }
                    if (charset == null || charset.equals(c.f5131d)) {
                        cVar2.m0(codePointAt);
                    } else {
                        cVar2.j0(str, i2, Character.charCount(codePointAt) + i2, charset);
                    }
                    while (!cVar2.s()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.f0(37);
                        char[] cArr = f5398j;
                        cVar.f0(cArr[(readByte >> 4) & 15]);
                        cVar.f0(cArr[readByte & 15]);
                    }
                } else {
                    cVar.m0(codePointAt);
                }
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    public static int d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static s k(String str) {
        a aVar = new a();
        aVar.h((s) null, str);
        return aVar.a();
    }

    static void n(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static void q(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append(list.get(i2));
        }
    }

    static String r(String str, int i2, int i3, boolean z) {
        for (int i4 = i2; i4 < i3; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                q.c cVar = new q.c();
                cVar.l0(str, i2, i4);
                u(cVar, str, i4, i3, z);
                return cVar.U();
            }
        }
        return str.substring(i2, i3);
    }

    static String s(String str, boolean z) {
        return r(str, 0, str.length(), z);
    }

    private List<String> t(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            arrayList.add(str != null ? s(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static void u(q.c cVar, String str, int i2, int i3, boolean z) {
        int i4;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt == 37 && (i4 = i2 + 2) < i3) {
                int i5 = c.i(str.charAt(i2 + 1));
                int i6 = c.i(str.charAt(i4));
                if (!(i5 == -1 || i6 == -1)) {
                    cVar.f0((i5 << 4) + i6);
                    i2 = i4;
                    i2 += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                cVar.f0(32);
                i2 += Character.charCount(codePointAt);
            }
            cVar.m0(codePointAt);
            i2 += Character.charCount(codePointAt);
        }
    }

    static boolean v(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && c.i(str.charAt(i2 + 1)) != -1 && c.i(str.charAt(i4)) != -1;
    }

    static List<String> y(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public s A(String str) {
        a p2 = p(str);
        if (p2 != null) {
            return p2.a();
        }
        return null;
    }

    public String B() {
        return this.a;
    }

    public URI C() {
        a o2 = o();
        o2.o();
        String aVar = o2.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public String e() {
        if (this.f5403h == null) {
            return null;
        }
        return this.f5404i.substring(this.f5404i.indexOf(35) + 1);
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && ((s) obj).f5404i.equals(this.f5404i);
    }

    public String f() {
        if (this.c.isEmpty()) {
            return "";
        }
        int indexOf = this.f5404i.indexOf(64);
        return this.f5404i.substring(this.f5404i.indexOf(58, this.a.length() + 3) + 1, indexOf);
    }

    public String g() {
        int indexOf = this.f5404i.indexOf(47, this.a.length() + 3);
        String str = this.f5404i;
        return this.f5404i.substring(indexOf, c.m(str, indexOf, str.length(), "?#"));
    }

    public List<String> h() {
        int indexOf = this.f5404i.indexOf(47, this.a.length() + 3);
        String str = this.f5404i;
        int m2 = c.m(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < m2) {
            int i2 = indexOf + 1;
            int l2 = c.l(this.f5404i, i2, m2, '/');
            arrayList.add(this.f5404i.substring(i2, l2));
            indexOf = l2;
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f5404i.hashCode();
    }

    public String i() {
        if (this.f5402g == null) {
            return null;
        }
        int indexOf = this.f5404i.indexOf(63) + 1;
        String str = this.f5404i;
        return this.f5404i.substring(indexOf, c.l(str, indexOf, str.length(), '#'));
    }

    public String j() {
        if (this.b.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.f5404i;
        return this.f5404i.substring(length, c.m(str, length, str.length(), ":@"));
    }

    public String l() {
        return this.f5399d;
    }

    public boolean m() {
        return this.a.equals("https");
    }

    public a o() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = j();
        aVar.c = f();
        aVar.f5405d = this.f5399d;
        aVar.f5406e = this.f5400e != d(this.a) ? this.f5400e : -1;
        aVar.f5407f.clear();
        aVar.f5407f.addAll(h());
        aVar.d(i());
        aVar.f5409h = e();
        return aVar;
    }

    public a p(String str) {
        try {
            a aVar = new a();
            aVar.h(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String toString() {
        return this.f5404i;
    }

    public int w() {
        return this.f5400e;
    }

    public String x() {
        if (this.f5402g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        n(sb, this.f5402g);
        return sb.toString();
    }

    public String z() {
        a p2 = p("/...");
        p2.t("");
        p2.j("");
        return p2.a().toString();
    }
}
