package m.a0;

import m.t.w;
import m.w.c;
import m.y.d.g;

public class a implements Iterable<Integer>, m.y.d.u.a {

    /* renamed from: h  reason: collision with root package name */
    public static final C0143a f4973h = new C0143a((g) null);

    /* renamed from: e  reason: collision with root package name */
    private final int f4974e;

    /* renamed from: f  reason: collision with root package name */
    private final int f4975f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4976g;

    /* renamed from: m.a0.a$a  reason: collision with other inner class name */
    public static final class C0143a {
        private C0143a() {
        }

        public /* synthetic */ C0143a(g gVar) {
            this();
        }

        public final a a(int i2, int i3, int i4) {
            return new a(i2, i3, i4);
        }
    }

    public a(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i4 != Integer.MIN_VALUE) {
            this.f4974e = i2;
            this.f4975f = c.b(i2, i3, i4);
            this.f4976g = i4;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (!(this.f4974e == aVar.f4974e && this.f4975f == aVar.f4975f && this.f4976g == aVar.f4976g)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int h() {
        return this.f4974e;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f4974e * 31) + this.f4975f) * 31) + this.f4976g;
    }

    public final int i() {
        return this.f4975f;
    }

    public boolean isEmpty() {
        if (this.f4976g > 0) {
            if (this.f4974e > this.f4975f) {
                return true;
            }
        } else if (this.f4974e < this.f4975f) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.f4976g;
    }

    /* renamed from: k */
    public w iterator() {
        return new b(this.f4974e, this.f4975f, this.f4976g);
    }

    public String toString() {
        int i2;
        StringBuilder sb;
        if (this.f4976g > 0) {
            sb = new StringBuilder();
            sb.append(this.f4974e);
            sb.append("..");
            sb.append(this.f4975f);
            sb.append(" step ");
            i2 = this.f4976g;
        } else {
            sb = new StringBuilder();
            sb.append(this.f4974e);
            sb.append(" downTo ");
            sb.append(this.f4975f);
            sb.append(" step ");
            i2 = -this.f4976g;
        }
        sb.append(i2);
        return sb.toString();
    }
}
