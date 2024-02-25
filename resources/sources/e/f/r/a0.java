package e.f.r;

import android.os.Build;
import android.view.ViewGroup;
import e.f.e;

public final class a0 {

    static class a {
        static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static void c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.b(viewGroup);
        }
        Boolean bool = (Boolean) viewGroup.getTag(e.z);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && y.x(viewGroup) == null) ? false : true;
    }
}
