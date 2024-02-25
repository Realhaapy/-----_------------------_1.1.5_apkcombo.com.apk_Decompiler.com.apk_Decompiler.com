package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import e.a.a;
import e.f.r.x;

public class o extends MultiAutoCompleteTextView implements x {

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f634g = {16843126};

    /* renamed from: e  reason: collision with root package name */
    private final e f635e;

    /* renamed from: f  reason: collision with root package name */
    private final y f636f;

    public o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.autoCompleteTextViewStyle);
    }

    public o(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        r0.a(this, getContext());
        w0 u = w0.u(getContext(), attributeSet, f634g, i2, 0);
        if (u.r(0)) {
            setDropDownBackgroundDrawable(u.f(0));
        }
        u.v();
        e eVar = new e(this);
        this.f635e = eVar;
        eVar.e(attributeSet, i2);
        y yVar = new y(this);
        this.f636f = yVar;
        yVar.m(attributeSet, i2);
        yVar.b();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f635e;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f636f;
        if (yVar != null) {
            yVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f635e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f635e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f635e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f635e;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(e.a.k.a.a.d(getContext(), i2));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f635e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f635e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f636f;
        if (yVar != null) {
            yVar.q(context, i2);
        }
    }
}
