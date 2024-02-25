package e.q;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

class e0 extends d0 {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f3597f = true;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f3598g = true;

    e0() {
    }

    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f3597f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f3597f = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void i(View view, Matrix matrix) {
        if (f3598g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f3598g = false;
            }
        }
    }
}
