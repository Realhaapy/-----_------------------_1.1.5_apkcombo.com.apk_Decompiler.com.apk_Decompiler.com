package e.q;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class i0 {
    private static Method a;
    private static boolean b;
    private static Field c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f3604d;

    i0() {
    }

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    private void b() {
        if (!b) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{cls2, cls2, cls2, cls2});
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e2);
            }
            b = true;
        }
    }

    public void a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(j.save_non_transition_alpha, (Object) null);
        }
    }

    public float c(View view) {
        Float f2 = (Float) view.getTag(j.save_non_transition_alpha);
        float alpha = view.getAlpha();
        return f2 != null ? alpha / f2.floatValue() : alpha;
    }

    public void d(View view) {
        int i2 = j.save_non_transition_alpha;
        if (view.getTag(i2) == null) {
            view.setTag(i2, Float.valueOf(view.getAlpha()));
        }
    }

    public void e(View view, int i2, int i3, int i4, int i5) {
        b();
        Method method = a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public void f(View view, float f2) {
        Float f3 = (Float) view.getTag(j.save_non_transition_alpha);
        if (f3 != null) {
            view.setAlpha(f3.floatValue() * f2);
        } else {
            view.setAlpha(f2);
        }
    }

    public void g(View view, int i2) {
        if (!f3604d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f3604d = true;
        }
        Field field = c;
        if (field != null) {
            try {
                c.setInt(view, i2 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void h(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            h(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public void i(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            i(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }
}
