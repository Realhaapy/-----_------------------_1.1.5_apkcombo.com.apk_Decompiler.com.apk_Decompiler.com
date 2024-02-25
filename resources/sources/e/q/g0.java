package e.q;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

class g0 extends f0 {

    /* renamed from: i  reason: collision with root package name */
    private static boolean f3600i = true;

    g0() {
    }

    @SuppressLint({"NewApi"})
    public void g(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g(view, i2);
        } else if (f3600i) {
            try {
                view.setTransitionVisibility(i2);
            } catch (NoSuchMethodError unused) {
                f3600i = false;
            }
        }
    }
}
