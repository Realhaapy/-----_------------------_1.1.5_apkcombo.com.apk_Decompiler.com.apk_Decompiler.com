package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public final class a {
    private static Method a;
    private static boolean b;
    private static Method c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f887d;

    /* renamed from: androidx.core.graphics.drawable.a$a  reason: collision with other inner class name */
    static class C0016a {
        static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i2) {
            return drawableContainerState.getChild(i2);
        }

        static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        static void e(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    static class b {
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f2, float f3) {
            drawable.setHotspot(f2, f3);
        }

        static void f(Drawable drawable, int i2, int i3, int i4, int i5) {
            drawable.setHotspotBounds(i2, i3, i4, i5);
        }

        static void g(Drawable drawable, int i2) {
            drawable.setTint(i2);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    static class c {
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int i2) {
            return drawable.setLayoutDirection(i2);
        }
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.a(drawable, theme);
        }
    }

    public static boolean b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return b.b(drawable);
        }
        return false;
    }

    public static int c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0016a.a(drawable);
        }
        return 0;
    }

    public static ColorFilter d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return b.c(drawable);
        }
        return null;
    }

    public static int e(Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return c.a(drawable);
        }
        if (i2 >= 17) {
            if (!f887d) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    c = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e2);
                }
                f887d = true;
            }
            Method method = c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e3) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e3);
                    c = null;
                }
            }
        }
        return 0;
    }

    public static void f(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.d(drawable, resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    public static boolean g(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0016a.d(drawable);
        }
        return false;
    }

    @Deprecated
    public static void h(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void i(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            C0016a.e(drawable, z);
        }
    }

    public static void j(Drawable drawable, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.e(drawable, f2, f3);
        }
    }

    public static void k(Drawable drawable, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.f(drawable, i2, i3, i4, i5);
        }
    }

    public static boolean l(Drawable drawable, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            return c.b(drawable, i2);
        }
        if (i3 >= 17) {
            if (!b) {
                Class<Drawable> cls = Drawable.class;
                try {
                    Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e2);
                }
                b = true;
            }
            Method method = a;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{Integer.valueOf(i2)});
                    return true;
                } catch (Exception e3) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e3);
                    a = null;
                }
            }
        }
        return false;
    }

    public static void m(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.g(drawable, i2);
        } else if (drawable instanceof b) {
            ((b) drawable).setTint(i2);
        }
    }

    public static void n(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.h(drawable, colorStateList);
        } else if (drawable instanceof b) {
            ((b) drawable).setTintList(colorStateList);
        }
    }

    public static void o(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.i(drawable, mode);
        } else if (drawable instanceof b) {
            ((b) drawable).setTintMode(mode);
        }
    }

    public static Drawable p(Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 23 ? drawable : i2 >= 21 ? !(drawable instanceof b) ? new e(drawable) : drawable : !(drawable instanceof b) ? new d(drawable) : drawable;
    }
}
