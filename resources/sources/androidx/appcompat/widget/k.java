package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.i;
import androidx.core.widget.j;
import e.a.a;
import e.f.r.f;
import e.f.r.j0.b;
import e.f.r.v;
import e.f.r.x;
import e.f.r.y;

public class k extends EditText implements x, v {

    /* renamed from: e  reason: collision with root package name */
    private final e f619e;

    /* renamed from: f  reason: collision with root package name */
    private final y f620f;

    /* renamed from: g  reason: collision with root package name */
    private final x f621g;

    /* renamed from: h  reason: collision with root package name */
    private final j f622h;

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.editTextStyle);
    }

    public k(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        r0.a(this, getContext());
        e eVar = new e(this);
        this.f619e = eVar;
        eVar.e(attributeSet, i2);
        y yVar = new y(this);
        this.f620f = yVar;
        yVar.m(attributeSet, i2);
        yVar.b();
        this.f621g = new x(this);
        this.f622h = new j();
    }

    public f a(f fVar) {
        return this.f622h.a(this, fVar);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f619e;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f620f;
        if (yVar != null) {
            yVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f619e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f619e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f621g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.x r0 = r2.f621g
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f620f.r(this, onCreateInputConnection, editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        String[] u = y.u(this);
        if (onCreateInputConnection == null || u == null) {
            return onCreateInputConnection;
        }
        e.f.r.j0.a.d(editorInfo, u);
        return b.a(onCreateInputConnection, editorInfo, t.a(this));
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (t.b(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i2) {
        if (t.c(this, i2)) {
            return true;
        }
        return super.onTextContextMenuItem(i2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f619e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f619e;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.m(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f619e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f619e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f620f;
        if (yVar != null) {
            yVar.q(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f621g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.b(textClassifier);
        }
    }
}
