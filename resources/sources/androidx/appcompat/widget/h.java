package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.i;
import e.a.k.a.a;

public class h extends CheckedTextView {

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f566f = {16843016};

    /* renamed from: e  reason: collision with root package name */
    private final y f567e;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public h(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        r0.a(this, getContext());
        y yVar = new y(this);
        this.f567e = yVar;
        yVar.m(attributeSet, i2);
        yVar.b();
        w0 u = w0.u(getContext(), attributeSet, f566f, i2, 0);
        setCheckMarkDrawable(u.f(0));
        u.v();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y yVar = this.f567e;
        if (yVar != null) {
            yVar.b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(a.d(getContext(), i2));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.m(this, callback));
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f567e;
        if (yVar != null) {
            yVar.q(context, i2);
        }
    }
}
