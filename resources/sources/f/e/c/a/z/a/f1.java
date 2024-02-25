package f.e.c.a.z.a;

final class f1 implements q0 {
    private final s0 a;
    private final String b;
    private final Object[] c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4100d;

    f1(s0 s0Var, String str, Object[] objArr) {
        char charAt;
        this.a = s0Var;
        this.b = str;
        this.c = objArr;
        char charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            char c2 = charAt2 & 8191;
            int i2 = 13;
            int i3 = 1;
            while (true) {
                int i4 = i3 + 1;
                charAt = str.charAt(i3);
                if (charAt < 55296) {
                    break;
                }
                c2 |= (charAt & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
            charAt2 = c2 | (charAt << i2);
        }
        this.f4100d = charAt2;
    }

    public boolean a() {
        return (this.f4100d & 2) == 2;
    }

    public c1 b() {
        return (this.f4100d & 1) == 1 ? c1.PROTO2 : c1.PROTO3;
    }

    public s0 c() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.b;
    }
}
