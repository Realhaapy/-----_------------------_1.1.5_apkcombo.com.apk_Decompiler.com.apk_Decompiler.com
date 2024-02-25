package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.h;
import e.a.j;

class p extends PopupWindow {
    private static final boolean b = (Build.VERSION.SDK_INT < 21);
    private boolean a;

    public p(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a(context, attributeSet, i2, i3);
    }

    private void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        w0 u = w0.u(context, attributeSet, j.N1, i2, i3);
        int i4 = j.P1;
        if (u.r(i4)) {
            b(u.a(i4, false));
        }
        setBackgroundDrawable(u.f(j.O1));
        u.v();
    }

    private void b(boolean z) {
        if (b) {
            this.a = z;
        } else {
            h.a(this, z);
        }
    }

    public void showAsDropDown(View view, int i2, int i3) {
        if (b && this.a) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3);
    }

    public void showAsDropDown(View view, int i2, int i3, int i4) {
        if (b && this.a) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3, i4);
    }

    public void update(View view, int i2, int i3, int i4, int i5) {
        if (b && this.a) {
            i3 -= view.getHeight();
        }
        super.update(view, i2, i3, i4, i5);
    }
}
