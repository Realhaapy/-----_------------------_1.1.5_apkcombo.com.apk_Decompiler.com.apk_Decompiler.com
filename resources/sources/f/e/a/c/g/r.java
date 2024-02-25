package f.e.a.c.g;

final class r implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i f3967e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ s f3968f;

    r(s sVar, i iVar) {
        this.f3968f = sVar;
        this.f3967e = iVar;
    }

    public final void run() {
        if (this.f3967e.k()) {
            this.f3968f.c.r();
            return;
        }
        try {
            this.f3968f.c.q(this.f3968f.b.a(this.f3967e));
        } catch (g e2) {
            if (e2.getCause() instanceof Exception) {
                this.f3968f.c.p((Exception) e2.getCause());
            } else {
                this.f3968f.c.p(e2);
            }
        } catch (Exception e3) {
            this.f3968f.c.p(e3);
        }
    }
}
