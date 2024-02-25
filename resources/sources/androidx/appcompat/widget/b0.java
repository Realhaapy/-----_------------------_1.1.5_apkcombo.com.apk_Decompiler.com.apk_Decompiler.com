package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import e.f.r.x;

public class b0 extends ToggleButton implements x {

    /* renamed from: e  reason: collision with root package name */
    private final e f523e;

    /* renamed from: f  reason: collision with root package name */
    private final y f524f;

    public b0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public b0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        r0.a(this, getContext());
        e eVar = new e(this);
        this.f523e = eVar;
        eVar.e(attributeSet, i2);
        y yVar = new y(this);
        this.f524f = yVar;
        yVar.m(attributeSet, i2);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f523e;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f524f;
        if (yVar != null) {
            yVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f523e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f523e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f523e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f523e;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f523e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f523e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }
}
