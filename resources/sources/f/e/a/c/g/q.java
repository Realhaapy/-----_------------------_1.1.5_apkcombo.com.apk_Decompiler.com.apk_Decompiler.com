package f.e.a.c.g;

import java.util.concurrent.ExecutionException;

final class q implements p {
    private final Object a = new Object();
    private final int b;
    private final j0<Void> c;

    /* renamed from: d  reason: collision with root package name */
    private int f3962d;

    /* renamed from: e  reason: collision with root package name */
    private int f3963e;

    /* renamed from: f  reason: collision with root package name */
    private int f3964f;

    /* renamed from: g  reason: collision with root package name */
    private Exception f3965g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3966h;

    public q(int i2, j0<Void> j0Var) {
        this.b = i2;
        this.c = j0Var;
    }

    private final void c() {
        if (this.f3962d + this.f3963e + this.f3964f != this.b) {
            return;
        }
        if (this.f3965g != null) {
            j0<Void> j0Var = this.c;
            int i2 = this.f3963e;
            int i3 = this.b;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i3);
            sb.append(" underlying tasks failed");
            j0Var.p(new ExecutionException(sb.toString(), this.f3965g));
        } else if (this.f3966h) {
            this.c.r();
        } else {
            this.c.q(null);
        }
    }

    public final void a(Exception exc) {
        synchronized (this.a) {
            this.f3963e++;
            this.f3965g = exc;
            c();
        }
    }

    public final void b() {
        synchronized (this.a) {
            this.f3964f++;
            this.f3966h = true;
            c();
        }
    }

    public final void onSuccess(Object obj) {
        synchronized (this.a) {
            this.f3962d++;
            c();
        }
    }
}
