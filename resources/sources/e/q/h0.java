package e.q;

import android.graphics.Matrix;
import android.view.View;

class h0 extends g0 {
    h0() {
    }

    public float c(View view) {
        return view.getTransitionAlpha();
    }

    public void e(View view, int i2, int i3, int i4, int i5) {
        view.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    public void f(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    public void g(View view, int i2) {
        view.setTransitionVisibility(i2);
    }

    public void h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public void i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
