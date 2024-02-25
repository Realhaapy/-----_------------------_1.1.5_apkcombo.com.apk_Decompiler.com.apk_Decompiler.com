package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.g0;

public class FitWindowsLinearLayout extends LinearLayout implements g0 {

    /* renamed from: e  reason: collision with root package name */
    private g0.a f456e;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        g0.a aVar = this.f456e;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(g0.a aVar) {
        this.f456e = aVar;
    }
}
