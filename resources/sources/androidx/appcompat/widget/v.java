package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.a;
import e.a.j;
import e.f.r.y;

class v extends q {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f678d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f679e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f680f = null;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f681g = null;

    /* renamed from: h  reason: collision with root package name */
    private boolean f682h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f683i = false;

    v(SeekBar seekBar) {
        super(seekBar);
        this.f678d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f679e;
        if (drawable == null) {
            return;
        }
        if (this.f682h || this.f683i) {
            Drawable p2 = a.p(drawable.mutate());
            this.f679e = p2;
            if (this.f682h) {
                a.n(p2, this.f680f);
            }
            if (this.f683i) {
                a.o(this.f679e, this.f681g);
            }
            if (this.f679e.isStateful()) {
                this.f679e.setState(this.f678d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i2) {
        super.c(attributeSet, i2);
        Context context = this.f678d.getContext();
        int[] iArr = j.Q;
        w0 u = w0.u(context, attributeSet, iArr, i2, 0);
        SeekBar seekBar = this.f678d;
        y.Q(seekBar, seekBar.getContext(), iArr, attributeSet, u.q(), i2, 0);
        Drawable g2 = u.g(j.R);
        if (g2 != null) {
            this.f678d.setThumb(g2);
        }
        j(u.f(j.S));
        int i3 = j.U;
        if (u.r(i3)) {
            this.f681g = e0.d(u.j(i3, -1), this.f681g);
            this.f683i = true;
        }
        int i4 = j.T;
        if (u.r(i4)) {
            this.f680f = u.c(i4);
            this.f682h = true;
        }
        u.v();
        f();
    }

    /* access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        if (this.f679e != null) {
            int max = this.f678d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f679e.getIntrinsicWidth();
                int intrinsicHeight = this.f679e.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f679e.setBounds(-i3, -i2, i3, i2);
                float width = ((float) ((this.f678d.getWidth() - this.f678d.getPaddingLeft()) - this.f678d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f678d.getPaddingLeft(), (float) (this.f678d.getHeight() / 2));
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f679e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f679e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f678d.getDrawableState())) {
            this.f678d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f679e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Drawable drawable) {
        Drawable drawable2 = this.f679e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f679e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f678d);
            a.l(drawable, y.s(this.f678d));
            if (drawable.isStateful()) {
                drawable.setState(this.f678d.getDrawableState());
            }
            f();
        }
        this.f678d.invalidate();
    }
}
