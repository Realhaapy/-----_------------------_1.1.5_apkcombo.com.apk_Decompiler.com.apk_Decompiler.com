package e.q;

import android.annotation.SuppressLint;
import android.view.View;

class f0 extends e0 {

    /* renamed from: h  reason: collision with root package name */
    private static boolean f3599h = true;

    f0() {
    }

    @SuppressLint({"NewApi"})
    public void e(View view, int i2, int i3, int i4, int i5) {
        if (f3599h) {
            try {
                view.setLeftTopRightBottom(i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                f3599h = false;
            }
        }
    }
}
