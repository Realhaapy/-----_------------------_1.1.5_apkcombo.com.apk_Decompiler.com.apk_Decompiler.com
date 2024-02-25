package kotlinx.coroutines;

final class x0 implements i1 {

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4963e;

    public x0(boolean z) {
        this.f4963e = z;
    }

    public boolean a() {
        return this.f4963e;
    }

    public y1 g() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(a() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
