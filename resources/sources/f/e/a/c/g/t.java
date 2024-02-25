package f.e.a.c.g;

import java.util.concurrent.Executor;

final class t implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i f3969e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ u f3970f;

    t(u uVar, i iVar) {
        this.f3970f = uVar;
        this.f3969e = iVar;
    }

    public final void run() {
        try {
            i iVar = (i) this.f3970f.b.a(this.f3969e);
            if (iVar == null) {
                this.f3970f.a(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = k.b;
            iVar.e(executor, this.f3970f);
            iVar.d(executor, this.f3970f);
            iVar.a(executor, this.f3970f);
        } catch (g e2) {
            if (e2.getCause() instanceof Exception) {
                this.f3970f.c.p((Exception) e2.getCause());
            } else {
                this.f3970f.c.p(e2);
            }
        } catch (Exception e3) {
            this.f3970f.c.p(e3);
        }
    }
}
