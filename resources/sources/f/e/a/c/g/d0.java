package f.e.a.c.g;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class d0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i f3954e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ e0 f3955f;

    d0(e0 e0Var, i iVar) {
        this.f3955f = e0Var;
        this.f3954e = iVar;
    }

    public final void run() {
        try {
            i a = this.f3955f.b.a(this.f3954e.i());
            if (a == null) {
                this.f3955f.a(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = k.b;
            a.e(executor, this.f3955f);
            a.d(executor, this.f3955f);
            a.a(executor, this.f3955f);
        } catch (g e2) {
            if (e2.getCause() instanceof Exception) {
                this.f3955f.a((Exception) e2.getCause());
            } else {
                this.f3955f.a(e2);
            }
        } catch (CancellationException unused) {
            this.f3955f.b();
        } catch (Exception e3) {
            this.f3955f.a(e3);
        }
    }
}
