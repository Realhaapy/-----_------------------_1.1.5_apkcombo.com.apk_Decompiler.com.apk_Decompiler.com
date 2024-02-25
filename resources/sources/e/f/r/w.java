package e.f.r;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

public final class w implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: e  reason: collision with root package name */
    private final View f3435e;

    /* renamed from: f  reason: collision with root package name */
    private ViewTreeObserver f3436f;

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f3437g;

    private w(View view, Runnable runnable) {
        this.f3435e = view;
        this.f3436f = view.getViewTreeObserver();
        this.f3437g = runnable;
    }

    public static w a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        w wVar = new w(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(wVar);
        view.addOnAttachStateChangeListener(wVar);
        return wVar;
    }

    public void b() {
        (this.f3436f.isAlive() ? this.f3436f : this.f3435e.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f3435e.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.f3437g.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f3436f = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
