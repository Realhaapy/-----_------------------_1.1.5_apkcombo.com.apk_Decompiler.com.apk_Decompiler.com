package q;

public abstract class g implements r {

    /* renamed from: e  reason: collision with root package name */
    private final r f5483e;

    public g(r rVar) {
        if (rVar != null) {
            this.f5483e = rVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() {
        this.f5483e.close();
    }

    public t d() {
        return this.f5483e.d();
    }

    public void flush() {
        this.f5483e.flush();
    }

    public void h(c cVar, long j2) {
        this.f5483e.h(cVar, j2);
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f5483e.toString() + ")";
    }
}
