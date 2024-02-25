package e.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import e.f.r.y;

public class d extends j0 {

    class a extends n {
        final /* synthetic */ View a;

        a(d dVar, View view) {
            this.a = view;
        }

        public void e(m mVar) {
            c0.g(this.a, 1.0f);
            c0.a(this.a);
            mVar.T(this);
        }
    }

    private static class b extends AnimatorListenerAdapter {
        private final View a;
        private boolean b = false;

        b(View view) {
            this.a = view;
        }

        public void onAnimationEnd(Animator animator) {
            c0.g(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (y.A(this.a) && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, (Paint) null);
            }
        }
    }

    public d(int i2) {
        m0(i2);
    }

    private Animator n0(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        c0.g(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, c0.b, new float[]{f3});
        ofFloat.addListener(new b(view));
        b(new a(this, view));
        return ofFloat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.a.get("android:fade:transitionAlpha");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float o0(e.q.s r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.q.d.o0(e.q.s, float):float");
    }

    public Animator i0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float f2 = 0.0f;
        float o0 = o0(sVar, 0.0f);
        if (o0 != 1.0f) {
            f2 = o0;
        }
        return n0(view, f2, 1.0f);
    }

    public Animator k0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        c0.e(view);
        return n0(view, o0(sVar, 1.0f), 0.0f);
    }

    public void m(s sVar) {
        super.m(sVar);
        sVar.a.put("android:fade:transitionAlpha", Float.valueOf(c0.c(sVar.b)));
    }
}
