package androidx.window.layout;

import android.app.Activity;
import m.y.d.l;

public final class ActivityCompatHelperApi24 {
    public static final ActivityCompatHelperApi24 INSTANCE = new ActivityCompatHelperApi24();

    private ActivityCompatHelperApi24() {
    }

    public final boolean isInMultiWindowMode(Activity activity) {
        l.d(activity, "activity");
        return activity.isInMultiWindowMode();
    }
}
