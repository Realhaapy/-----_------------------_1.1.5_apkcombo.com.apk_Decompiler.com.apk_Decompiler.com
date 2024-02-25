package r.b.a.x;

import java.io.Serializable;
import r.b.a.b;

public final class n implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: e  reason: collision with root package name */
    private final long f5791e;

    /* renamed from: f  reason: collision with root package name */
    private final long f5792f;

    /* renamed from: g  reason: collision with root package name */
    private final long f5793g;

    /* renamed from: h  reason: collision with root package name */
    private final long f5794h;

    private n(long j2, long j3, long j4, long j5) {
        this.f5791e = j2;
        this.f5792f = j3;
        this.f5793g = j4;
        this.f5794h = j5;
    }

    public static n i(long j2, long j3) {
        if (j2 <= j3) {
            return new n(j2, j2, j3, j3);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static n j(long j2, long j3, long j4) {
        return k(j2, j2, j3, j4);
    }

    public static n k(long j2, long j3, long j4, long j5) {
        if (j2 > j3) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        } else if (j4 > j5) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        } else if (j3 <= j5) {
            return new n(j2, j3, j4, j5);
        } else {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
    }

    public int a(long j2, i iVar) {
        if (g(j2)) {
            return (int) j2;
        }
        throw new b("Invalid int value for " + iVar + ": " + j2);
    }

    public long b(long j2, i iVar) {
        if (h(j2)) {
            return j2;
        }
        if (iVar != null) {
            throw new b("Invalid value for " + iVar + " (valid values " + this + "): " + j2);
        }
        throw new b("Invalid value (valid values " + this + "): " + j2);
    }

    public long c() {
        return this.f5794h;
    }

    public long d() {
        return this.f5791e;
    }

    public boolean e() {
        return this.f5791e == this.f5792f && this.f5793g == this.f5794h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f5791e == nVar.f5791e && this.f5792f == nVar.f5792f && this.f5793g == nVar.f5793g && this.f5794h == nVar.f5794h;
    }

    public boolean f() {
        return d() >= -2147483648L && c() <= 2147483647L;
    }

    public boolean g(long j2) {
        return f() && h(j2);
    }

    public boolean h(long j2) {
        return j2 >= d() && j2 <= c();
    }

    public int hashCode() {
        long j2 = this.f5791e;
        long j3 = this.f5792f;
        long j4 = this.f5793g;
        long j5 = this.f5794h;
        long j6 = ((((((j2 + j3) << ((int) (j3 + 16))) >> ((int) (j4 + 48))) << ((int) (j4 + 32))) >> ((int) (32 + j5))) << ((int) (j5 + 48))) >> 16;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5791e);
        if (this.f5791e != this.f5792f) {
            sb.append('/');
            sb.append(this.f5792f);
        }
        sb.append(" - ");
        sb.append(this.f5793g);
        if (this.f5793g != this.f5794h) {
            sb.append('/');
            sb.append(this.f5794h);
        }
        return sb.toString();
    }
}
