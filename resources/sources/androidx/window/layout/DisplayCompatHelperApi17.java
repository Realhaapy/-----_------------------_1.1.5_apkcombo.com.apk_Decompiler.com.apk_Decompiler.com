package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import m.y.d.l;

public final class DisplayCompatHelperApi17 {
    public static final DisplayCompatHelperApi17 INSTANCE = new DisplayCompatHelperApi17();

    private DisplayCompatHelperApi17() {
    }

    public final void getRealSize(Display display, Point point) {
        l.d(display, "display");
        l.d(point, "point");
        display.getRealSize(point);
    }
}
