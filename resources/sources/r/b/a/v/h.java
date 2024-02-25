package r.b.a.v;

import java.util.concurrent.ConcurrentHashMap;

public final class h {

    /* renamed from: e  reason: collision with root package name */
    public static final h f5726e = new h('0', '+', '-', '.');
    private final char a;
    private final char b;
    private final char c;

    /* renamed from: d  reason: collision with root package name */
    private final char f5727d;

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private h(char c2, char c3, char c4, char c5) {
        this.a = c2;
        this.b = c3;
        this.c = c4;
        this.f5727d = c5;
    }

    /* access modifiers changed from: package-private */
    public String a(String str) {
        char c2 = this.a;
        if (c2 == '0') {
            return str;
        }
        int i2 = c2 - '0';
        char[] charArray = str.toCharArray();
        for (int i3 = 0; i3 < charArray.length; i3++) {
            charArray[i3] = (char) (charArray[i3] + i2);
        }
        return new String(charArray);
    }

    /* access modifiers changed from: package-private */
    public int b(char c2) {
        int i2 = c2 - this.a;
        if (i2 < 0 || i2 > 9) {
            return -1;
        }
        return i2;
    }

    public char c() {
        return this.f5727d;
    }

    public char d() {
        return this.c;
    }

    public char e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b == hVar.b && this.c == hVar.c && this.f5727d == hVar.f5727d;
    }

    public char f() {
        return this.a;
    }

    public int hashCode() {
        return this.a + this.b + this.c + this.f5727d;
    }

    public String toString() {
        return "DecimalStyle[" + this.a + this.b + this.c + this.f5727d + "]";
    }
}
