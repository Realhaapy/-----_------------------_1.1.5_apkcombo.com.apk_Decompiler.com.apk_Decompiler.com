package e.q;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

class v implements w {
    private final ViewGroupOverlay a;

    v(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    public void a(View view) {
        this.a.add(view);
    }

    public void b(Drawable drawable) {
        this.a.add(drawable);
    }

    public void c(View view) {
        this.a.remove(view);
    }

    public void d(Drawable drawable) {
        this.a.remove(drawable);
    }
}
