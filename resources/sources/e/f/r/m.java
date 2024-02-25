package e.f.r;

import android.view.MotionEvent;

public final class m {
    public static boolean a(MotionEvent motionEvent, int i2) {
        return (motionEvent.getSource() & i2) == i2;
    }
}
