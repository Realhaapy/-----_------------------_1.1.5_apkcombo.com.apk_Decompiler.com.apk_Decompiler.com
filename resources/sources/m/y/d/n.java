package m.y.d;

public final class n implements d {

    /* renamed from: e  reason: collision with root package name */
    private final Class<?> f5060e;

    public n(Class<?> cls, String str) {
        l.d(cls, "jClass");
        l.d(str, "moduleName");
        this.f5060e = cls;
    }

    public Class<?> b() {
        return this.f5060e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof n) && l.a(b(), ((n) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return l.j(b().toString(), " (Kotlin reflection is not available)");
    }
}
