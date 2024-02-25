package e.f.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class c0 {
    private final WeakReference<View> a;
    Runnable b = null;
    Runnable c = null;

    /* renamed from: d  reason: collision with root package name */
    int f3399d = -1;

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ d0 a;
        final /* synthetic */ View b;

        a(c0 c0Var, d0 d0Var, View view) {
            this.a = d0Var;
            this.b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.a.a(this.b);
        }

        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }

        public void onAnimationStart(Animator animator) {
            this.a.c(this.b);
        }
    }

    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    static class c implements d0 {
        c0 a;
        boolean b;

        c(c0 c0Var) {
            this.a = c0Var;
        }

        public void a(View view) {
            Object tag = view.getTag(2113929216);
            d0 d0Var = tag instanceof d0 ? (d0) tag : null;
            if (d0Var != null) {
                d0Var.a(view);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: e.f.r.d0} */
        /* JADX WARNING: Multi-variable type inference failed */
        @android.annotation.SuppressLint({"WrongConstant"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(android.view.View r4) {
            /*
                r3 = this;
                e.f.r.c0 r0 = r3.a
                int r0 = r0.f3399d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                e.f.r.c0 r0 = r3.a
                r0.f3399d = r1
            L_0x000f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x0019
                boolean r0 = r3.b
                if (r0 != 0) goto L_0x0039
            L_0x0019:
                e.f.r.c0 r0 = r3.a
                java.lang.Runnable r1 = r0.c
                if (r1 == 0) goto L_0x0024
                r0.c = r2
                r1.run()
            L_0x0024:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof e.f.r.d0
                if (r1 == 0) goto L_0x0031
                r2 = r0
                e.f.r.d0 r2 = (e.f.r.d0) r2
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r2.b(r4)
            L_0x0036:
                r4 = 1
                r3.b = r4
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.f.r.c0.c.b(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: e.f.r.d0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.b = r0
                e.f.r.c0 r0 = r3.a
                int r0 = r0.f3399d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                e.f.r.c0 r0 = r3.a
                java.lang.Runnable r2 = r0.b
                if (r2 == 0) goto L_0x001a
                r0.b = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof e.f.r.d0
                if (r2 == 0) goto L_0x0027
                r1 = r0
                e.f.r.d0 r1 = (e.f.r.d0) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.c(r4)
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.f.r.c0.c.c(android.view.View):void");
        }
    }

    c0(View view) {
        this.a = new WeakReference<>(view);
    }

    private void h(View view, d0 d0Var) {
        if (d0Var != null) {
            view.animate().setListener(new a(this, d0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public c0 a(float f2) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = (View) this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public c0 e(long j2) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public c0 f(Interpolator interpolator) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public c0 g(d0 d0Var) {
        View view = (View) this.a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, d0Var);
                d0Var = new c(this);
            }
            h(view, d0Var);
        }
        return this;
    }

    public c0 i(long j2) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j2);
        }
        return this;
    }

    public c0 j(f0 f0Var) {
        View view = (View) this.a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            b bVar = null;
            if (f0Var != null) {
                bVar = new b(f0Var, view);
            }
            b.a(view.animate(), bVar);
        }
        return this;
    }

    public void k() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public c0 l(float f2) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
