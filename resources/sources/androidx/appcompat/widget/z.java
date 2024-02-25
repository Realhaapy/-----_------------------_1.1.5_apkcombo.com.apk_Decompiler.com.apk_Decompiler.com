package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.b;
import androidx.core.widget.i;
import androidx.core.widget.l;
import e.a.k.a.a;
import e.f.k.d;
import e.f.p.c;
import e.f.r.x;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class z extends TextView implements x, l, b {

    /* renamed from: e  reason: collision with root package name */
    private final e f737e;

    /* renamed from: f  reason: collision with root package name */
    private final y f738f;

    /* renamed from: g  reason: collision with root package name */
    private final x f739g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f740h;

    /* renamed from: i  reason: collision with root package name */
    private Future<c> f741i;

    public z(Context context) {
        this(context, (AttributeSet) null);
    }

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public z(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        this.f740h = false;
        r0.a(this, getContext());
        e eVar = new e(this);
        this.f737e = eVar;
        eVar.e(attributeSet, i2);
        y yVar = new y(this);
        this.f738f = yVar;
        yVar.m(attributeSet, i2);
        yVar.b();
        this.f739g = new x(this);
    }

    private void e() {
        Future<c> future = this.f741i;
        if (future != null) {
            try {
                this.f741i = null;
                i.k(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f737e;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f738f;
        if (yVar != null) {
            yVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f738f;
        if (yVar != null) {
            return yVar.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f738f;
        if (yVar != null) {
            return yVar.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f738f;
        if (yVar != null) {
            return yVar.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f738f;
        return yVar != null ? yVar.h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f738f;
        if (yVar != null) {
            return yVar.i();
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return i.a(this);
    }

    public int getLastBaselineToBottomHeight() {
        return i.b(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f737e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f737e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f738f.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f738f.k();
    }

    public CharSequence getText() {
        e();
        return super.getText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f739g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.x r0 = r2.f739g
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public c.a getTextMetricsParamsCompat() {
        return i.e(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f738f.r(this, onCreateInputConnection, editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        y yVar = this.f738f;
        if (yVar != null) {
            yVar.o(z, i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        e();
        super.onMeasure(i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        y yVar = this.f738f;
        if (yVar != null && !b.a && yVar.l()) {
            this.f738f.c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        y yVar = this.f738f;
        if (yVar != null) {
            yVar.t(i2, i3, i4, i5);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        y yVar = this.f738f;
        if (yVar != null) {
            yVar.u(iArr, i2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (b.a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        y yVar = this.f738f;
        if (yVar != null) {
            yVar.v(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f737e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f737e;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f738f;
        if (yVar != null) {
            yVar.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f738f;
        if (yVar != null) {
            yVar.p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d2 = i2 != 0 ? a.d(context, i2) : null;
        Drawable d3 = i3 != 0 ? a.d(context, i3) : null;
        Drawable d4 = i4 != 0 ? a.d(context, i4) : null;
        if (i5 != 0) {
            drawable = a.d(context, i5);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(d2, d3, d4, drawable);
        y yVar = this.f738f;
        if (yVar != null) {
            yVar.p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f738f;
        if (yVar != null) {
            yVar.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d2 = i2 != 0 ? a.d(context, i2) : null;
        Drawable d3 = i3 != 0 ? a.d(context, i3) : null;
        Drawable d4 = i4 != 0 ? a.d(context, i4) : null;
        if (i5 != 0) {
            drawable = a.d(context, i5);
        }
        setCompoundDrawablesWithIntrinsicBounds(d2, d3, d4, drawable);
        y yVar = this.f738f;
        if (yVar != null) {
            yVar.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f738f;
        if (yVar != null) {
            yVar.p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.m(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            i.h(this, i2);
        }
    }

    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            i.i(this, i2);
        }
    }

    public void setLineHeight(int i2) {
        i.j(this, i2);
    }

    public void setPrecomputedText(c cVar) {
        i.k(this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f737e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f737e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f738f.w(colorStateList);
        this.f738f.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f738f.x(mode);
        this.f738f.b();
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f738f;
        if (yVar != null) {
            yVar.q(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f739g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<c> future) {
        this.f741i = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c.a aVar) {
        i.l(this, aVar);
    }

    public void setTextSize(int i2, float f2) {
        if (b.a) {
            super.setTextSize(i2, f2);
            return;
        }
        y yVar = this.f738f;
        if (yVar != null) {
            yVar.A(i2, f2);
        }
    }

    public void setTypeface(Typeface typeface, int i2) {
        if (!this.f740h) {
            Typeface typeface2 = null;
            if (typeface != null && i2 > 0) {
                typeface2 = d.a(getContext(), typeface, i2);
            }
            this.f740h = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i2);
            } finally {
                this.f740h = false;
            }
        }
    }
}
