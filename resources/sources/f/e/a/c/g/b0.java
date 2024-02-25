package f.e.a.c.g;

final class b0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i f3952e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ c0 f3953f;

    b0(c0 c0Var, i iVar) {
        this.f3953f = c0Var;
        this.f3952e = iVar;
    }

    public final void run() {
        synchronized (this.f3953f.b) {
            c0 c0Var = this.f3953f;
            if (c0Var.c != null) {
                c0Var.c.onSuccess(this.f3952e.i());
            }
        }
    }
}
