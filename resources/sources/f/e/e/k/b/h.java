package f.e.e.k.b;

import f.e.e.b;
import java.nio.charset.StandardCharsets;

final class h {
    private final String a;
    private l b;
    private b c;

    /* renamed from: d  reason: collision with root package name */
    private b f4497d;

    /* renamed from: e  reason: collision with root package name */
    private final StringBuilder f4498e;

    /* renamed from: f  reason: collision with root package name */
    int f4499f;

    /* renamed from: g  reason: collision with root package name */
    private int f4500g;

    /* renamed from: h  reason: collision with root package name */
    private k f4501h;

    /* renamed from: i  reason: collision with root package name */
    private int f4502i;

    h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = (char) (bytes[i2] & 255);
            if (c2 != '?' || str.charAt(i2) == '?') {
                sb.append(c2);
                i2++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.a = sb.toString();
        this.b = l.FORCE_NONE;
        this.f4498e = new StringBuilder(str.length());
        this.f4500g = -1;
    }

    private int h() {
        return this.a.length() - this.f4502i;
    }

    public int a() {
        return this.f4498e.length();
    }

    public StringBuilder b() {
        return this.f4498e;
    }

    public char c() {
        return this.a.charAt(this.f4499f);
    }

    public String d() {
        return this.a;
    }

    public int e() {
        return this.f4500g;
    }

    public int f() {
        return h() - this.f4499f;
    }

    public k g() {
        return this.f4501h;
    }

    public boolean i() {
        return this.f4499f < h();
    }

    public void j() {
        this.f4500g = -1;
    }

    public void k() {
        this.f4501h = null;
    }

    public void l(b bVar, b bVar2) {
        this.c = bVar;
        this.f4497d = bVar2;
    }

    public void m(int i2) {
        this.f4502i = i2;
    }

    public void n(l lVar) {
        this.b = lVar;
    }

    public void o(int i2) {
        this.f4500g = i2;
    }

    public void p() {
        q(a());
    }

    public void q(int i2) {
        k kVar = this.f4501h;
        if (kVar == null || i2 > kVar.a()) {
            this.f4501h = k.l(i2, this.b, this.c, this.f4497d, true);
        }
    }

    public void r(char c2) {
        this.f4498e.append(c2);
    }

    public void s(String str) {
        this.f4498e.append(str);
    }
}
