package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.x;
import e.f.n.b;
import e.f.r.w;

class f {

    class a implements b.C0072b {
        final /* synthetic */ Fragment a;

        a(Fragment fragment) {
            this.a = fragment;
        }

        public void a() {
            if (this.a.getAnimatingAway() != null) {
                View animatingAway = this.a.getAnimatingAway();
                this.a.setAnimatingAway((View) null);
                animatingAway.clearAnimation();
            }
            this.a.setAnimator((Animator) null);
        }
    }

    class b implements Animation.AnimationListener {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ Fragment b;
        final /* synthetic */ x.g c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e.f.n.b f1048d;

        class a implements Runnable {
            a() {
            }

            public void run() {
                if (b.this.b.getAnimatingAway() != null) {
                    b.this.b.setAnimatingAway((View) null);
                    b bVar = b.this;
                    bVar.c.a(bVar.b, bVar.f1048d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, x.g gVar, e.f.n.b bVar) {
            this.a = viewGroup;
            this.b = fragment;
            this.c = gVar;
            this.f1048d = bVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class c extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ Fragment c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x.g f1050d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e.f.n.b f1051e;

        c(ViewGroup viewGroup, View view, Fragment fragment, x.g gVar, e.f.n.b bVar) {
            this.a = viewGroup;
            this.b = view;
            this.c = fragment;
            this.f1050d = gVar;
            this.f1051e = bVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            Animator animator2 = this.c.getAnimator();
            this.c.setAnimator((Animator) null);
            if (animator2 != null && this.a.indexOfChild(this.b) < 0) {
                this.f1050d.a(this.c, this.f1051e);
            }
        }
    }

    static class d {
        public final Animation a;
        public final Animator b;

        d(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        d(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    static class e extends AnimationSet implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final ViewGroup f1052e;

        /* renamed from: f  reason: collision with root package name */
        private final View f1053f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f1054g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f1055h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f1056i = true;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1052e = viewGroup;
            this.f1053f = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j2, Transformation transformation) {
            this.f1056i = true;
            if (this.f1054g) {
                return !this.f1055h;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.f1054g = true;
                w.a(this.f1052e, this);
            }
            return true;
        }

        public boolean getTransformation(long j2, Transformation transformation, float f2) {
            this.f1056i = true;
            if (this.f1054g) {
                return !this.f1055h;
            }
            if (!super.getTransformation(j2, transformation, f2)) {
                this.f1054g = true;
                w.a(this.f1052e, this);
            }
            return true;
        }

        public void run() {
            if (this.f1054g || !this.f1056i) {
                this.f1052e.endViewTransition(this.f1053f);
                this.f1055h = true;
                return;
            }
            this.f1056i = false;
            this.f1052e.post(this);
        }
    }

    static void a(Fragment fragment, d dVar, x.g gVar) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        e.f.n.b bVar = new e.f.n.b();
        bVar.c(new a(fragment));
        gVar.b(fragment, bVar);
        if (dVar.a != null) {
            e eVar = new e(dVar.a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, bVar));
            fragment.mView.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.b;
        fragment.setAnimator(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, bVar));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    private static int b(Fragment fragment, boolean z, boolean z2) {
        return z2 ? z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    static d c(Context context, Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int b2 = b(fragment, z, z2);
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i2 = e.j.b.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i2) != null) {
                fragment.mContainer.setTag(i2, (Object) null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, b2);
        if (onCreateAnimation != null) {
            return new d(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, b2);
        if (onCreateAnimator != null) {
            return new d(onCreateAnimator);
        }
        if (b2 == 0 && nextTransition != 0) {
            b2 = d(nextTransition, z);
        }
        if (b2 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(b2));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, b2);
                    if (loadAnimation != null) {
                        return new d(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, b2);
                    if (loadAnimator != null) {
                        return new d(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, b2);
                        if (loadAnimation2 != null) {
                            return new d(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        return null;
    }

    private static int d(int i2, boolean z) {
        if (i2 == 4097) {
            return z ? e.j.a.fragment_open_enter : e.j.a.fragment_open_exit;
        }
        if (i2 == 4099) {
            return z ? e.j.a.fragment_fade_enter : e.j.a.fragment_fade_exit;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z ? e.j.a.fragment_close_enter : e.j.a.fragment_close_exit;
    }
}
