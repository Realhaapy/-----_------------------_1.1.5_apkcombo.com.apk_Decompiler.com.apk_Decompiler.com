package e.a.n;

import android.view.View;
import android.view.animation.Interpolator;
import e.f.r.c0;
import e.f.r.d0;
import e.f.r.e0;
import java.util.ArrayList;
import java.util.Iterator;

public class h {
    final ArrayList<c0> a = new ArrayList<>();
    private long b = -1;
    private Interpolator c;

    /* renamed from: d  reason: collision with root package name */
    d0 f3193d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3194e;

    /* renamed from: f  reason: collision with root package name */
    private final e0 f3195f = new a();

    class a extends e0 {
        private boolean a = false;
        private int b = 0;

        a() {
        }

        public void b(View view) {
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == h.this.a.size()) {
                d0 d0Var = h.this.f3193d;
                if (d0Var != null) {
                    d0Var.b((View) null);
                }
                d();
            }
        }

        public void c(View view) {
            if (!this.a) {
                this.a = true;
                d0 d0Var = h.this.f3193d;
                if (d0Var != null) {
                    d0Var.c((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.b = 0;
            this.a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f3194e) {
            Iterator<c0> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f3194e = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f3194e = false;
    }

    public h c(c0 c0Var) {
        if (!this.f3194e) {
            this.a.add(c0Var);
        }
        return this;
    }

    public h d(c0 c0Var, c0 c0Var2) {
        this.a.add(c0Var);
        c0Var2.i(c0Var.c());
        this.a.add(c0Var2);
        return this;
    }

    public h e(long j2) {
        if (!this.f3194e) {
            this.b = j2;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f3194e) {
            this.c = interpolator;
        }
        return this;
    }

    public h g(d0 d0Var) {
        if (!this.f3194e) {
            this.f3193d = d0Var;
        }
        return this;
    }

    public void h() {
        if (!this.f3194e) {
            Iterator<c0> it = this.a.iterator();
            while (it.hasNext()) {
                c0 next = it.next();
                long j2 = this.b;
                if (j2 >= 0) {
                    next.e(j2);
                }
                Interpolator interpolator = this.c;
                if (interpolator != null) {
                    next.f(interpolator);
                }
                if (this.f3193d != null) {
                    next.g(this.f3195f);
                }
                next.k();
            }
            this.f3194e = true;
        }
    }
}
