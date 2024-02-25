package e.f.k;

import android.graphics.Insets;
import android.graphics.Rect;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f3351e = new b(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3352d;

    static class a {
        static Insets a(int i2, int i3, int i4, int i5) {
            return Insets.of(i2, i3, i4, i5);
        }
    }

    private b(int i2, int i3, int i4, int i5) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.f3352d = i5;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.a, bVar2.a), Math.max(bVar.b, bVar2.b), Math.max(bVar.c, bVar2.c), Math.max(bVar.f3352d, bVar2.f3352d));
    }

    public static b b(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f3351e : new b(i2, i3, i4, i5);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.a, this.b, this.c, this.f3352d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3352d == bVar.f3352d && this.a == bVar.a && this.c == bVar.c && this.b == bVar.b;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.f3352d;
    }

    public String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.f3352d + '}';
    }
}
