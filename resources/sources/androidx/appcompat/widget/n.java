package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.e;
import e.a.j;
import e.a.k.a.a;
import e.f.r.y;

public class n {
    private final ImageView a;
    private u0 b;
    private u0 c;

    /* renamed from: d  reason: collision with root package name */
    private u0 f633d;

    public n(ImageView imageView) {
        this.a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f633d == null) {
            this.f633d = new u0();
        }
        u0 u0Var = this.f633d;
        u0Var.a();
        ColorStateList a2 = e.a(this.a);
        if (a2 != null) {
            u0Var.f677d = true;
            u0Var.a = a2;
        }
        PorterDuff.Mode b2 = e.b(this.a);
        if (b2 != null) {
            u0Var.c = true;
            u0Var.b = b2;
        }
        if (!u0Var.f677d && !u0Var.c) {
            return false;
        }
        j.i(drawable, u0Var, this.a.getDrawableState());
        return true;
    }

    private boolean j() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 > 21 ? this.b != null : i2 == 21;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!j() || !a(drawable)) {
            u0 u0Var = this.c;
            if (u0Var != null) {
                j.i(drawable, u0Var, this.a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.b;
            if (u0Var2 != null) {
                j.i(drawable, u0Var2, this.a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        u0 u0Var = this.c;
        if (u0Var != null) {
            return u0Var.a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        u0 u0Var = this.c;
        if (u0Var != null) {
            return u0Var.b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return Build.VERSION.SDK_INT < 21 || !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i2) {
        int m2;
        Context context = this.a.getContext();
        int[] iArr = j.M;
        w0 u = w0.u(context, attributeSet, iArr, i2, 0);
        ImageView imageView = this.a;
        y.Q(imageView, imageView.getContext(), iArr, attributeSet, u.q(), i2, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (!(drawable != null || (m2 = u.m(j.N, -1)) == -1 || (drawable = a.d(this.a.getContext(), m2)) == null)) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                e0.b(drawable);
            }
            int i3 = j.O;
            if (u.r(i3)) {
                e.c(this.a, u.c(i3));
            }
            int i4 = j.P;
            if (u.r(i4)) {
                e.d(this.a, e0.d(u.j(i4, -1), (PorterDuff.Mode) null));
            }
        } finally {
            u.v();
        }
    }

    public void g(int i2) {
        if (i2 != 0) {
            Drawable d2 = a.d(this.a.getContext(), i2);
            if (d2 != null) {
                e0.b(d2);
            }
            this.a.setImageDrawable(d2);
        } else {
            this.a.setImageDrawable((Drawable) null);
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new u0();
        }
        u0 u0Var = this.c;
        u0Var.a = colorStateList;
        u0Var.f677d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public void i(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new u0();
        }
        u0 u0Var = this.c;
        u0Var.b = mode;
        u0Var.c = true;
        b();
    }
}
