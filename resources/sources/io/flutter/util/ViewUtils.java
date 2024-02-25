package io.flutter.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

public final class ViewUtils {

    public interface ViewVisitor {
        boolean run(View view);
    }

    static /* synthetic */ boolean b(Class[] clsArr, View view) {
        for (Class isInstance : clsArr) {
            if (isInstance.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public static boolean childHasFocus(View view) {
        return traverseHierarchy(view, a.a);
    }

    public static int generateViewId(int i2) {
        return Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : i2;
    }

    public static Activity getActivity(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return getActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean hasChildViewOfType(View view, Class<? extends View>[] clsArr) {
        return traverseHierarchy(view, new b(clsArr));
    }

    public static boolean traverseHierarchy(View view, ViewVisitor viewVisitor) {
        if (view == null) {
            return false;
        }
        if (viewVisitor.run(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                if (traverseHierarchy(viewGroup.getChildAt(i2), viewVisitor)) {
                    return true;
                }
            }
        }
        return false;
    }
}
