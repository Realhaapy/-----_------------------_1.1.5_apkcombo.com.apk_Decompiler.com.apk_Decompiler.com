package f.e.a.c.g;

import com.google.android.gms.common.internal.n;

final class z implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i f3974e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ a0 f3975f;

    z(a0 a0Var, i iVar) {
        this.f3975f = a0Var;
        this.f3974e = iVar;
    }

    public final void run() {
        synchronized (this.f3975f.b) {
            a0 a0Var = this.f3975f;
            if (a0Var.c != null) {
                e a = a0Var.c;
                Exception h2 = this.f3974e.h();
                n.h(h2);
                a.a(h2);
            }
        }
    }
}
