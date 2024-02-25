package m;

import java.io.Serializable;

public final class l<A, B> implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final A f5012e;

    /* renamed from: f  reason: collision with root package name */
    private final B f5013f;

    public l(A a, B b) {
        this.f5012e = a;
        this.f5013f = b;
    }

    public final A a() {
        return this.f5012e;
    }

    public final B b() {
        return this.f5013f;
    }

    public final A c() {
        return this.f5012e;
    }

    public final B d() {
        return this.f5013f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return m.y.d.l.a(this.f5012e, lVar.f5012e) && m.y.d.l.a(this.f5013f, lVar.f5013f);
    }

    public int hashCode() {
        A a = this.f5012e;
        int i2 = 0;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f5013f;
        if (b != null) {
            i2 = b.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return '(' + this.f5012e + ", " + this.f5013f + ')';
    }
}
