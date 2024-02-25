package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import e.a.a;

public class s extends RatingBar {

    /* renamed from: e  reason: collision with root package name */
    private final q f674e;

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.ratingBarStyle);
    }

    public s(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        r0.a(this, getContext());
        q qVar = new q(this);
        this.f674e = qVar;
        qVar.c(attributeSet, i2);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap b = this.f674e.b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
