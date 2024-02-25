package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.yalantis.ucrop.b;
import com.yalantis.ucrop.c;

public class HorizontalProgressWheelView extends View {

    /* renamed from: e  reason: collision with root package name */
    private final Rect f3085e;

    /* renamed from: f  reason: collision with root package name */
    private a f3086f;

    /* renamed from: g  reason: collision with root package name */
    private float f3087g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f3088h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f3089i;

    /* renamed from: j  reason: collision with root package name */
    private int f3090j;

    /* renamed from: k  reason: collision with root package name */
    private int f3091k;

    /* renamed from: l  reason: collision with root package name */
    private int f3092l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f3093m;

    /* renamed from: n  reason: collision with root package name */
    private float f3094n;

    /* renamed from: o  reason: collision with root package name */
    private int f3095o;

    public interface a {
        void a(float f2, float f3);

        void b();

        void c();
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3085e = new Rect();
        a();
    }

    private void a() {
        this.f3095o = e.f.j.a.d(getContext(), b.ucrop_color_widget_rotate_mid_line);
        this.f3090j = getContext().getResources().getDimensionPixelSize(c.ucrop_width_horizontal_wheel_progress_line);
        this.f3091k = getContext().getResources().getDimensionPixelSize(c.ucrop_height_horizontal_wheel_progress_line);
        this.f3092l = getContext().getResources().getDimensionPixelSize(c.ucrop_margin_horizontal_wheel_progress_line);
        Paint paint = new Paint(1);
        this.f3088h = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f3088h.setStrokeWidth((float) this.f3090j);
        this.f3088h.setColor(getResources().getColor(b.ucrop_color_progress_wheel_line));
        Paint paint2 = new Paint(this.f3088h);
        this.f3089i = paint2;
        paint2.setColor(this.f3095o);
        this.f3089i.setStrokeCap(Paint.Cap.ROUND);
        this.f3089i.setStrokeWidth((float) getContext().getResources().getDimensionPixelSize(c.ucrop_width_middle_wheel_progress_line));
    }

    private void b(MotionEvent motionEvent, float f2) {
        this.f3094n -= f2;
        postInvalidate();
        this.f3087g = motionEvent.getX();
        a aVar = this.f3086f;
        if (aVar != null) {
            aVar.a(-f2, this.f3094n);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Paint paint;
        float f2;
        super.onDraw(canvas);
        canvas.getClipBounds(this.f3085e);
        int width = this.f3085e.width();
        int i2 = this.f3090j;
        int i3 = this.f3092l;
        int i4 = width / (i2 + i3);
        float f3 = this.f3094n % ((float) (i3 + i2));
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i4 / 4;
            if (i5 < i6) {
                paint = this.f3088h;
                f2 = (float) i5;
            } else if (i5 > (i4 * 3) / 4) {
                paint = this.f3088h;
                f2 = (float) (i4 - i5);
            } else {
                this.f3088h.setAlpha(255);
                float f4 = -f3;
                Rect rect = this.f3085e;
                float f5 = ((float) rect.left) + f4 + ((float) ((this.f3090j + this.f3092l) * i5));
                float centerY = ((float) rect.centerY()) - (((float) this.f3091k) / 4.0f);
                Rect rect2 = this.f3085e;
                canvas.drawLine(f5, centerY, f4 + ((float) rect2.left) + ((float) ((this.f3090j + this.f3092l) * i5)), ((float) rect2.centerY()) + (((float) this.f3091k) / 4.0f), this.f3088h);
            }
            paint.setAlpha((int) ((f2 / ((float) i6)) * 255.0f));
            float f42 = -f3;
            Rect rect3 = this.f3085e;
            float f52 = ((float) rect3.left) + f42 + ((float) ((this.f3090j + this.f3092l) * i5));
            float centerY2 = ((float) rect3.centerY()) - (((float) this.f3091k) / 4.0f);
            Rect rect22 = this.f3085e;
            canvas.drawLine(f52, centerY2, f42 + ((float) rect22.left) + ((float) ((this.f3090j + this.f3092l) * i5)), ((float) rect22.centerY()) + (((float) this.f3091k) / 4.0f), this.f3088h);
        }
        float centerX = (float) this.f3085e.centerX();
        float centerY3 = ((float) this.f3085e.centerY()) - (((float) this.f3091k) / 2.0f);
        Canvas canvas2 = canvas;
        float f6 = centerY3;
        canvas2.drawLine(centerX, f6, (float) this.f3085e.centerX(), (((float) this.f3091k) / 2.0f) + ((float) this.f3085e.centerY()), this.f3089i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f3087g = motionEvent.getX();
        } else if (action == 1) {
            a aVar = this.f3086f;
            if (aVar != null) {
                this.f3093m = false;
                aVar.b();
            }
        } else if (action == 2) {
            float x = motionEvent.getX() - this.f3087g;
            if (x != 0.0f) {
                if (!this.f3093m) {
                    this.f3093m = true;
                    a aVar2 = this.f3086f;
                    if (aVar2 != null) {
                        aVar2.c();
                    }
                }
                b(motionEvent, x);
            }
        }
        return true;
    }

    public void setMiddleLineColor(int i2) {
        this.f3095o = i2;
        this.f3089i.setColor(i2);
        invalidate();
    }

    public void setScrollingListener(a aVar) {
        this.f3086f = aVar;
    }
}
