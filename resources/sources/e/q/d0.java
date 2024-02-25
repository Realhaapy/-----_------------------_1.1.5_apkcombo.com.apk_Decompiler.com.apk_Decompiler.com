package e.q;

import android.annotation.SuppressLint;
import android.view.View;

class d0 extends i0 {

    /* renamed from: e  reason: collision with root package name */
    private static boolean f3592e = true;

    d0() {
    }

    public void a(View view) {
    }

    @SuppressLint({"NewApi"})
    public float c(View view) {
        if (f3592e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f3592e = false;
            }
        }
        return view.getAlpha();
    }

    public void d(View view) {
    }

    @SuppressLint({"NewApi"})
    public void f(View view, float f2) {
        if (f3592e) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                f3592e = false;
            }
        }
        view.setAlpha(f2);
    }
}
