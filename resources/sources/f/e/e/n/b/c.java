package f.e.e.n.b;

import e.a.j;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    private static final c[] f4558d = a();
    private final int a;
    private final b[] b;
    private final int c;

    public static final class a {
        private final int a;
        private final int b;

        a(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }
    }

    public static final class b {
        private final int a;
        private final a[] b;

        b(int i2, a... aVarArr) {
            this.a = i2;
            this.b = aVarArr;
        }

        public a[] a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }

        public int c() {
            int i2 = 0;
            for (a a2 : this.b) {
                i2 += a2.a();
            }
            return i2;
        }

        public int d() {
            return this.a * c();
        }
    }

    private c(int i2, int[] iArr, b... bVarArr) {
        this.a = i2;
        this.b = bVarArr;
        int b2 = bVarArr[0].b();
        int i3 = 0;
        for (a aVar : bVarArr[0].a()) {
            i3 += aVar.a() * (aVar.b() + b2);
        }
        this.c = i3;
    }

    private static c[] a() {
        return new c[]{new c(1, new int[0], new b(7, new a(1, 19)), new b(10, new a(1, 16)), new b(13, new a(1, 13)), new b(17, new a(1, 9))), new c(2, new int[]{6, 18}, new b(10, new a(1, 34)), new b(16, new a(1, 28)), new b(22, new a(1, 22)), new b(28, new a(1, 16))), new c(3, new int[]{6, 22}, new b(15, new a(1, 55)), new b(26, new a(1, 44)), new b(18, new a(2, 17)), new b(22, new a(2, 13))), new c(4, new int[]{6, 26}, new b(20, new a(1, 80)), new b(18, new a(2, 32)), new b(26, new a(2, 24)), new b(16, new a(4, 9))), new c(5, new int[]{6, 30}, new b(26, new a(1, 108)), new b(24, new a(2, 43)), new b(18, new a(2, 15), new a(2, 16)), new b(22, new a(2, 11), new a(2, 12))), new c(6, new int[]{6, 34}, new b(18, new a(2, 68)), new b(16, new a(4, 27)), new b(24, new a(4, 19)), new b(28, new a(4, 15))), new c(7, new int[]{6, 22, 38}, new b(20, new a(2, 78)), new b(18, new a(4, 31)), new b(18, new a(2, 14), new a(4, 15)), new b(26, new a(4, 13), new a(1, 14))), new c(8, new int[]{6, 24, 42}, new b(24, new a(2, 97)), new b(22, new a(2, 38), new a(2, 39)), new b(22, new a(4, 18), new a(2, 19)), new b(26, new a(4, 14), new a(2, 15))), new c(9, new int[]{6, 26, 46}, new b(30, new a(2, j.y0)), new b(22, new a(3, 36), new a(2, 37)), new b(20, new a(4, 16), new a(4, 17)), new b(24, new a(4, 12), new a(4, 13))), new c(10, new int[]{6, 28, 50}, new b(18, new a(2, 68), new a(2, 69)), new b(26, new a(4, 43), new a(1, 44)), new b(24, new a(6, 19), new a(2, 20)), new b(28, new a(6, 15), new a(2, 16))), new c(11, new int[]{6, 30, 54}, new b(20, new a(4, 81)), new b(30, new a(1, 50), new a(4, 51)), new b(28, new a(4, 22), new a(4, 23)), new b(24, new a(3, 12), new a(8, 13))), new c(12, new int[]{6, 32, 58}, new b(24, new a(2, 92), new a(2, 93)), new b(22, new a(6, 36), new a(2, 37)), new b(26, new a(4, 20), new a(6, 21)), new b(28, new a(7, 14), new a(4, 15))), new c(13, new int[]{6, 34, 62}, new b(26, new a(4, 107)), new b(22, new a(8, 37), new a(1, 38)), new b(24, new a(8, 20), new a(4, 21)), new b(22, new a(12, 11), new a(4, 12))), new c(14, new int[]{6, 26, 46, 66}, new b(30, new a(3, 115), new a(1, j.y0)), new b(24, new a(4, 40), new a(5, 41)), new b(20, new a(11, 16), new a(5, 17)), new b(24, new a(11, 12), new a(5, 13))), new c(15, new int[]{6, 26, 48, 70}, new b(22, new a(5, 87), new a(1, 88)), new b(24, new a(5, 41), new a(5, 42)), new b(30, new a(5, 24), new a(7, 25)), new b(24, new a(11, 12), new a(7, 13))), new c(16, new int[]{6, 26, 50, 74}, new b(24, new a(5, 98), new a(1, 99)), new b(28, new a(7, 45), new a(3, 46)), new b(24, new a(15, 19), new a(2, 20)), new b(30, new a(3, 15), new a(13, 16))), new c(17, new int[]{6, 30, 54, 78}, new b(28, new a(1, 107), new a(5, 108)), new b(28, new a(10, 46), new a(1, 47)), new b(28, new a(1, 22), new a(15, 23)), new b(28, new a(2, 14), new a(17, 15))), new c(18, new int[]{6, 30, 56, 82}, new b(30, new a(5, j.C0), new a(1, j.D0)), new b(26, new a(9, 43), new a(4, 44)), new b(28, new a(17, 22), new a(1, 23)), new b(28, new a(2, 14), new a(19, 15))), new c(19, new int[]{6, 30, 58, 86}, new b(28, new a(3, 113), new a(4, 114)), new b(26, new a(3, 44), new a(11, 45)), new b(26, new a(17, 21), new a(4, 22)), new b(26, new a(9, 13), new a(16, 14))), new c(20, new int[]{6, 34, 62, 90}, new b(28, new a(3, 107), new a(5, 108)), new b(26, new a(3, 41), new a(13, 42)), new b(30, new a(15, 24), new a(5, 25)), new b(28, new a(15, 15), new a(10, 16))), new c(21, new int[]{6, 28, 50, 72, 94}, new b(28, new a(4, j.y0), new a(4, j.z0)), new b(26, new a(17, 42)), new b(28, new a(17, 22), new a(6, 23)), new b(30, new a(19, 16), new a(6, 17))), new c(22, new int[]{6, 26, 50, 74, 98}, new b(28, new a(2, 111), new a(7, 112)), new b(28, new a(17, 46)), new b(30, new a(7, 24), new a(16, 25)), new b(24, new a(34, 13))), new c(23, new int[]{6, 30, 54, 78, 102}, new b(30, new a(4, j.D0), new a(5, j.E0)), new b(28, new a(4, 47), new a(14, 48)), new b(30, new a(11, 24), new a(14, 25)), new b(30, new a(16, 15), new a(14, 16))), new c(24, new int[]{6, 28, 54, 80, 106}, new b(30, new a(6, j.z0), new a(4, j.A0)), new b(28, new a(6, 45), new a(14, 46)), new b(30, new a(11, 24), new a(16, 25)), new b(30, new a(30, 16), new a(2, 17))), new c(25, new int[]{6, 32, 58, 84, 110}, new b(26, new a(8, 106), new a(4, 107)), new b(28, new a(8, 47), new a(13, 48)), new b(30, new a(7, 24), new a(22, 25)), new b(30, new a(22, 15), new a(13, 16))), new c(26, new int[]{6, 30, 58, 86, 114}, new b(28, new a(10, 114), new a(2, 115)), new b(28, new a(19, 46), new a(4, 47)), new b(28, new a(28, 22), new a(6, 23)), new b(30, new a(33, 16), new a(4, 17))), new c(27, new int[]{6, 34, 62, 90, j.A0}, new b(30, new a(8, j.E0), new a(4, j.F0)), new b(28, new a(22, 45), new a(3, 46)), new b(30, new a(8, 23), new a(26, 24)), new b(30, new a(12, 15), new a(28, 16))), new c(28, new int[]{6, 26, 50, 74, 98, j.E0}, new b(30, new a(3, j.z0), new a(10, j.A0)), new b(28, new a(3, 45), new a(23, 46)), new b(30, new a(4, 24), new a(31, 25)), new b(30, new a(11, 15), new a(31, 16))), new c(29, new int[]{6, 30, 54, 78, 102, j.I0}, new b(30, new a(7, j.y0), new a(7, j.z0)), new b(28, new a(21, 45), new a(7, 46)), new b(30, new a(1, 23), new a(37, 24)), new b(30, new a(19, 15), new a(26, 16))), new c(30, new int[]{6, 26, 52, 78, 104, 130}, new b(30, new a(5, 115), new a(10, j.y0)), new b(28, new a(19, 47), new a(10, 48)), new b(30, new a(15, 24), new a(25, 25)), new b(30, new a(23, 15), new a(25, 16))), new c(31, new int[]{6, 30, 56, 82, 108, 134}, new b(30, new a(13, 115), new a(3, j.y0)), new b(28, new a(2, 46), new a(29, 47)), new b(30, new a(42, 24), new a(1, 25)), new b(30, new a(23, 15), new a(28, 16))), new c(32, new int[]{6, 34, 60, 86, 112, 138}, new b(30, new a(17, 115)), new b(28, new a(10, 46), new a(23, 47)), new b(30, new a(10, 24), new a(35, 25)), new b(30, new a(19, 15), new a(35, 16))), new c(33, new int[]{6, 30, 58, 86, 114, 142}, new b(30, new a(17, 115), new a(1, j.y0)), new b(28, new a(14, 46), new a(21, 47)), new b(30, new a(29, 24), new a(19, 25)), new b(30, new a(11, 15), new a(46, 16))), new c(34, new int[]{6, 34, 62, 90, j.A0, 146}, new b(30, new a(13, 115), new a(6, j.y0)), new b(28, new a(14, 46), new a(23, 47)), new b(30, new a(44, 24), new a(7, 25)), new b(30, new a(59, 16), new a(1, 17))), new c(35, new int[]{6, 30, 54, 78, 102, j.I0, 150}, new b(30, new a(12, j.D0), new a(7, j.E0)), new b(28, new a(12, 47), new a(26, 48)), new b(30, new a(39, 24), new a(14, 25)), new b(30, new a(22, 15), new a(41, 16))), new c(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new b(30, new a(6, j.D0), new a(14, j.E0)), new b(28, new a(6, 47), new a(34, 48)), new b(30, new a(46, 24), new a(10, 25)), new b(30, new a(2, 15), new a(64, 16))), new c(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new b(30, new a(17, j.E0), new a(4, j.F0)), new b(28, new a(29, 46), new a(14, 47)), new b(30, new a(49, 24), new a(10, 25)), new b(30, new a(24, 15), new a(46, 16))), new c(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new b(30, new a(4, j.E0), new a(18, j.F0)), new b(28, new a(13, 46), new a(32, 47)), new b(30, new a(48, 24), new a(14, 25)), new b(30, new a(42, 15), new a(32, 16))), new c(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new b(30, new a(20, j.z0), new a(4, j.A0)), new b(28, new a(40, 47), new a(7, 48)), new b(30, new a(43, 24), new a(22, 25)), new b(30, new a(10, 15), new a(67, 16))), new c(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new b(30, new a(19, j.A0), new a(6, j.B0)), new b(28, new a(18, 47), new a(31, 48)), new b(30, new a(34, 24), new a(34, 25)), new b(30, new a(20, 15), new a(61, 16)))};
    }

    public static c e(int i2) {
        if (i2 > 0 && i2 <= 40) {
            return f4558d[i2 - 1];
        }
        throw new IllegalArgumentException();
    }

    public int b() {
        return (this.a * 4) + 17;
    }

    public b c(a aVar) {
        return this.b[aVar.ordinal()];
    }

    public int d() {
        return this.c;
    }

    public int f() {
        return this.a;
    }

    public String toString() {
        return String.valueOf(this.a);
    }
}
