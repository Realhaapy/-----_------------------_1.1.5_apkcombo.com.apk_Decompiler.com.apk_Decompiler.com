package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import e.a.j;
import e.f.r.y;

class e {
    private final View a;
    private final j b;
    private int c = -1;

    /* renamed from: d  reason: collision with root package name */
    private u0 f542d;

    /* renamed from: e  reason: collision with root package name */
    private u0 f543e;

    /* renamed from: f  reason: collision with root package name */
    private u0 f544f;

    e(View view) {
        this.a = view;
        this.b = j.b();
    }

    private boolean a(Drawable drawable) {
        if (this.f544f == null) {
            this.f544f = new u0();
        }
        u0 u0Var = this.f544f;
        u0Var.a();
        ColorStateList m2 = y.m(this.a);
        if (m2 != null) {
            u0Var.f677d = true;
            u0Var.a = m2;
        }
        PorterDuff.Mode n2 = y.n(this.a);
        if (n2 != null) {
            u0Var.c = true;
            u0Var.b = n2;
        }
        if (!u0Var.f677d && !u0Var.c) {
            return false;
        }
        j.i(drawable, u0Var, this.a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 > 21 ? this.f542d != null : i2 == 21;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            u0 u0Var = this.f543e;
            if (u0Var != null) {
                j.i(background, u0Var, this.a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f542d;
            if (u0Var2 != null) {
                j.i(background, u0Var2, this.a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        u0 u0Var = this.f543e;
        if (u0Var != null) {
            return u0Var.a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        u0 u0Var = this.f543e;
        if (u0Var != null) {
            return u0Var.b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i2) {
        Context context = this.a.getContext();
        int[] iArr = j.l3;
        w0 u = w0.u(context, attributeSet, iArr, i2, 0);
        View view = this.a;
        y.Q(view, view.getContext(), iArr, attributeSet, u.q(), i2, 0);
        try {
            int i3 = j.m3;
            if (u.r(i3)) {
                this.c = u.m(i3, -1);
                ColorStateList f2 = this.b.f(this.a.getContext(), this.c);
                if (f2 != null) {
                    h(f2);
                }
            }
            int i4 = j.n3;
            if (u.r(i4)) {
                y.U(this.a, u.c(i4));
            }
            int i5 = j.o3;
            if (u.r(i5)) {
                y.V(this.a, e0.d(u.j(i5, -1), (PorterDuff.Mode) null));
            }
        } finally {
            u.v();
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.c = -1;
        h((ColorStateList) null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void g(int i2) {
        this.c = i2;
        j jVar = this.b;
        h(jVar != null ? jVar.f(this.a.getContext(), i2) : null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f542d == null) {
                this.f542d = new u0();
            }
            u0 u0Var = this.f542d;
            u0Var.a = colorStateList;
            u0Var.f677d = true;
        } else {
            this.f542d = null;
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f543e == null) {
            this.f543e = new u0();
        }
        u0 u0Var = this.f543e;
        u0Var.a = colorStateList;
        u0Var.f677d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f543e == null) {
            this.f543e = new u0();
        }
        u0 u0Var = this.f543e;
        u0Var.b = mode;
        u0Var.c = true;
        b();
    }
}
