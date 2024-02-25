package e.f.r;

import android.animation.ValueAnimator;
import android.view.View;

public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ f0 a;
    public final /* synthetic */ View b;

    public /* synthetic */ b(f0 f0Var, View view) {
        this.a = f0Var;
        this.b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(this.b);
    }
}
