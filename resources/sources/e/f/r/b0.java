package e.f.r;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public final class b0 {

    static class a {
        static boolean a(ViewParent viewParent, View view, float f2, float f3, boolean z) {
            return viewParent.onNestedFling(view, f2, f3, z);
        }

        static boolean b(ViewParent viewParent, View view, float f2, float f3) {
            return viewParent.onNestedPreFling(view, f2, f3);
        }

        static void c(ViewParent viewParent, View view, int i2, int i3, int[] iArr) {
            viewParent.onNestedPreScroll(view, i2, i3, iArr);
        }

        static void d(ViewParent viewParent, View view, int i2, int i3, int i4, int i5) {
            viewParent.onNestedScroll(view, i2, i3, i4, i5);
        }

        static void e(ViewParent viewParent, View view, View view2, int i2) {
            viewParent.onNestedScrollAccepted(view, view2, i2);
        }

        static boolean f(ViewParent viewParent, View view, View view2, int i2) {
            return viewParent.onStartNestedScroll(view, view2, i2);
        }

        static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f2, float f3, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return a.a(viewParent, view, f2, f3, z);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e2);
                return false;
            }
        } else if (viewParent instanceof r) {
            return ((r) viewParent).onNestedFling(view, f2, f3, z);
        } else {
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, View view, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return a.b(viewParent, view, f2, f3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e2);
                return false;
            }
        } else if (viewParent instanceof r) {
            return ((r) viewParent).onNestedPreFling(view, f2, f3);
        } else {
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int i2, int i3, int[] iArr, int i4) {
        if (viewParent instanceof p) {
            ((p) viewParent).j(view, i2, i3, iArr, i4);
        } else if (i4 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    a.c(viewParent, view, i2, i3, iArr);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e2);
                }
            } else if (viewParent instanceof r) {
                ((r) viewParent).onNestedPreScroll(view, i2, i3, iArr);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof q) {
            ((q) viewParent2).m(view, i2, i3, i4, i5, i6, iArr);
            return;
        }
        iArr[0] = iArr[0] + i4;
        iArr[1] = iArr[1] + i5;
        if (viewParent2 instanceof p) {
            ((p) viewParent2).n(view, i2, i3, i4, i5, i6);
        } else if (i6 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    a.d(viewParent, view, i2, i3, i4, i5);
                } catch (AbstractMethodError e2) {
                    AbstractMethodError abstractMethodError = e2;
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", abstractMethodError);
                }
            } else if (viewParent2 instanceof r) {
                ((r) viewParent2).onNestedScroll(view, i2, i3, i4, i5);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int i2, int i3) {
        if (viewParent instanceof p) {
            ((p) viewParent).h(view, view2, i2, i3);
        } else if (i3 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    a.e(viewParent, view, view2, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e2);
                }
            } else if (viewParent instanceof r) {
                ((r) viewParent).onNestedScrollAccepted(view, view2, i2);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i2, int i3) {
        if (viewParent instanceof p) {
            return ((p) viewParent).o(view, view2, i2, i3);
        }
        if (i3 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return a.f(viewParent, view, view2, i2);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e2);
                return false;
            }
        } else if (viewParent instanceof r) {
            return ((r) viewParent).onStartNestedScroll(view, view2, i2);
        } else {
            return false;
        }
    }

    public static void g(ViewParent viewParent, View view, int i2) {
        if (viewParent instanceof p) {
            ((p) viewParent).i(view, i2);
        } else if (i2 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    a.g(viewParent, view);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e2);
                }
            } else if (viewParent instanceof r) {
                ((r) viewParent).onStopNestedScroll(view);
            }
        }
    }
}
