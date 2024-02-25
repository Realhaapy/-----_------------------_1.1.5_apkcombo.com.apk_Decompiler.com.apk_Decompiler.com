package e.q;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import e.f.r.y;

class c0 {
    private static final i0 a;
    static final Property<View, Float> b = new a(Float.class, "translationAlpha");

    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(c0.c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f2) {
            c0.g(view, f2.floatValue());
        }
    }

    class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return y.o(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            y.W(view, rect);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2 >= 29 ? new h0() : i2 >= 23 ? new g0() : i2 >= 22 ? new f0() : i2 >= 21 ? new e0() : i2 >= 19 ? new d0() : new i0();
        new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        a.a(view);
    }

    static b0 b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new a0(view) : z.e(view);
    }

    static float c(View view) {
        return a.c(view);
    }

    static m0 d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new l0(view) : new k0(view.getWindowToken());
    }

    static void e(View view) {
        a.d(view);
    }

    static void f(View view, int i2, int i3, int i4, int i5) {
        a.e(view, i2, i3, i4, i5);
    }

    static void g(View view, float f2) {
        a.f(view, f2);
    }

    static void h(View view, int i2) {
        a.g(view, i2);
    }

    static void i(View view, Matrix matrix) {
        a.h(view, matrix);
    }

    static void j(View view, Matrix matrix) {
        a.i(view, matrix);
    }
}
