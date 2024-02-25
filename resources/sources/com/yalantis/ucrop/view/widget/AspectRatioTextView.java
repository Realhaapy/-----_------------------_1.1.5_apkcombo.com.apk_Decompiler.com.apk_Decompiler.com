package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.z;
import com.yalantis.ucrop.b;
import com.yalantis.ucrop.c;
import com.yalantis.ucrop.i;
import e.f.j.a;
import java.util.Locale;

public class AspectRatioTextView extends z {

    /* renamed from: j  reason: collision with root package name */
    private final Rect f3078j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f3079k;

    /* renamed from: l  reason: collision with root package name */
    private int f3080l;

    /* renamed from: m  reason: collision with root package name */
    private float f3081m;

    /* renamed from: n  reason: collision with root package name */
    private String f3082n;

    /* renamed from: o  reason: collision with root package name */
    private float f3083o;

    /* renamed from: p  reason: collision with root package name */
    private float f3084p;

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3078j = new Rect();
        h(context.obtainStyledAttributes(attributeSet, i.a));
    }

    private void f(int i2) {
        Paint paint = this.f3079k;
        if (paint != null) {
            paint.setColor(i2);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{16842913}, new int[]{0}}, new int[]{i2, a.d(getContext(), b.ucrop_color_widget)}));
    }

    private void h(TypedArray typedArray) {
        setGravity(1);
        this.f3082n = typedArray.getString(i.b);
        this.f3083o = typedArray.getFloat(i.c, 0.0f);
        float f2 = typedArray.getFloat(i.f2979d, 0.0f);
        this.f3084p = f2;
        float f3 = this.f3083o;
        if (f3 == 0.0f || f2 == 0.0f) {
            this.f3081m = 0.0f;
        } else {
            this.f3081m = f3 / f2;
        }
        this.f3080l = getContext().getResources().getDimensionPixelSize(c.ucrop_size_dot_scale_text_view);
        Paint paint = new Paint(1);
        this.f3079k = paint;
        paint.setStyle(Paint.Style.FILL);
        i();
        f(getResources().getColor(b.ucrop_color_widget_active));
        typedArray.recycle();
    }

    private void i() {
        String str;
        if (!TextUtils.isEmpty(this.f3082n)) {
            str = this.f3082n;
        } else {
            str = String.format(Locale.US, "%d:%d", new Object[]{Integer.valueOf((int) this.f3083o), Integer.valueOf((int) this.f3084p)});
        }
        setText(str);
    }

    private void j() {
        if (this.f3081m != 0.0f) {
            float f2 = this.f3083o;
            float f3 = this.f3084p;
            this.f3083o = f3;
            this.f3084p = f2;
            this.f3081m = f3 / f2;
        }
    }

    public float g(boolean z) {
        if (z) {
            j();
            i();
        }
        return this.f3081m;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.f3078j);
            Rect rect = this.f3078j;
            float f2 = ((float) rect.bottom) - (((float) rect.top) / 2.0f);
            int i2 = this.f3080l;
            canvas.drawCircle(((float) (rect.right - rect.left)) / 2.0f, f2 - (((float) i2) * 1.5f), ((float) i2) / 2.0f, this.f3079k);
        }
    }

    public void setActiveColor(int i2) {
        f(i2);
        invalidate();
    }

    public void setAspectRatio(com.yalantis.ucrop.l.a aVar) {
        this.f3082n = aVar.a();
        this.f3083o = aVar.b();
        float c = aVar.c();
        this.f3084p = c;
        float f2 = this.f3083o;
        if (f2 == 0.0f || c == 0.0f) {
            this.f3081m = 0.0f;
        } else {
            this.f3081m = f2 / c;
        }
        i();
    }
}
