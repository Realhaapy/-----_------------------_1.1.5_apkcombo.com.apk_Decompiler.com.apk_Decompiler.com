package e.f.r;

import android.os.Build;
import android.view.Gravity;

public final class h {
    public static int a(int i2, int i3) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i2, i3) : i2 & -8388609;
    }
}
