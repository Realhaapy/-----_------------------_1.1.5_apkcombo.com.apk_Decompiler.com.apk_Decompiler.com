package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import e.a.a;

public class u extends SeekBar {

    /* renamed from: e  reason: collision with root package name */
    private final v f676e;

    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.seekBarStyle);
    }

    public u(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        r0.a(this, getContext());
        v vVar = new v(this);
        this.f676e = vVar;
        vVar.c(attributeSet, i2);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f676e.h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f676e.i();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f676e.g(canvas);
    }
}
