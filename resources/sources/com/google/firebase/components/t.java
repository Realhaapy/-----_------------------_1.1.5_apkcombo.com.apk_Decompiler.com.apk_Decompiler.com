package com.google.firebase.components;

public final class t {
    private final Class<?> a;
    private final int b;
    private final int c;

    private t(Class<?> cls, int i2, int i3) {
        c0.c(cls, "Null dependency anInterface.");
        this.a = cls;
        this.b = i2;
        this.c = i3;
    }

    private static String a(int i2) {
        if (i2 == 0) {
            return "direct";
        }
        if (i2 == 1) {
            return "provider";
        }
        if (i2 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i2);
    }

    @Deprecated
    public static t g(Class<?> cls) {
        return new t(cls, 0, 0);
    }

    public static t h(Class<?> cls) {
        return new t(cls, 0, 1);
    }

    public static t i(Class<?> cls) {
        return new t(cls, 1, 0);
    }

    public static t j(Class<?> cls) {
        return new t(cls, 1, 1);
    }

    public static t k(Class<?> cls) {
        return new t(cls, 2, 0);
    }

    public Class<?> b() {
        return this.a;
    }

    public boolean c() {
        return this.c == 2;
    }

    public boolean d() {
        return this.c == 0;
    }

    public boolean e() {
        return this.b == 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a == tVar.a && this.b == tVar.b && this.c == tVar.c;
    }

    public boolean f() {
        return this.b == 2;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i2 = this.b;
        sb.append(i2 == 1 ? "required" : i2 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(a(this.c));
        sb.append("}");
        return sb.toString();
    }
}
