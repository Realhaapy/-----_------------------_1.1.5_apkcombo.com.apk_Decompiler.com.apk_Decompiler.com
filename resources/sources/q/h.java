package q;

public abstract class h implements s {

    /* renamed from: e  reason: collision with root package name */
    private final s f5484e;

    public h(s sVar) {
        if (sVar != null) {
            this.f5484e = sVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final s a() {
        return this.f5484e;
    }

    public void close() {
        this.f5484e.close();
    }

    public t d() {
        return this.f5484e.d();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f5484e.toString() + ")";
    }
}
