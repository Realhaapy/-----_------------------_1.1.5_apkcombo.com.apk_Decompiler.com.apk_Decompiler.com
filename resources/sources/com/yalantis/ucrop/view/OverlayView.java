package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.yalantis.ucrop.b;
import com.yalantis.ucrop.c;
import com.yalantis.ucrop.i;
import com.yalantis.ucrop.k.d;
import com.yalantis.ucrop.n.g;

public class OverlayView extends View {
    private int A;
    private int B;
    private int C;
    private d D;
    private boolean E;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f3031e;

    /* renamed from: f  reason: collision with root package name */
    private final RectF f3032f;

    /* renamed from: g  reason: collision with root package name */
    protected int f3033g;

    /* renamed from: h  reason: collision with root package name */
    protected int f3034h;

    /* renamed from: i  reason: collision with root package name */
    protected float[] f3035i;

    /* renamed from: j  reason: collision with root package name */
    private int f3036j;

    /* renamed from: k  reason: collision with root package name */
    private int f3037k;

    /* renamed from: l  reason: collision with root package name */
    private float f3038l;

    /* renamed from: m  reason: collision with root package name */
    private float[] f3039m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f3040n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f3041o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f3042p;

    /* renamed from: q  reason: collision with root package name */
    private int f3043q;

    /* renamed from: r  reason: collision with root package name */
    private Path f3044r;

    /* renamed from: s  reason: collision with root package name */
    private Paint f3045s;
    private Paint t;
    private Paint u;
    private Paint v;
    private int w;
    private float x;
    private float y;
    private int z;

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3031e = new RectF();
        this.f3032f = new RectF();
        this.f3039m = null;
        this.f3044r = new Path();
        this.f3045s = new Paint(1);
        this.t = new Paint(1);
        this.u = new Paint(1);
        this.v = new Paint(1);
        this.w = 0;
        this.x = -1.0f;
        this.y = -1.0f;
        this.z = -1;
        this.A = getResources().getDimensionPixelSize(c.ucrop_default_crop_rect_corner_touch_threshold);
        this.B = getResources().getDimensionPixelSize(c.ucrop_default_crop_rect_min_size);
        this.C = getResources().getDimensionPixelSize(c.ucrop_default_crop_rect_corner_touch_area_line_length);
        d();
    }

    private int c(float f2, float f3) {
        double d2 = (double) this.A;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3 += 2) {
            double sqrt = Math.sqrt(Math.pow((double) (f2 - this.f3035i[i3]), 2.0d) + Math.pow((double) (f3 - this.f3035i[i3 + 1]), 2.0d));
            if (sqrt < d2) {
                i2 = i3 / 2;
                d2 = sqrt;
            }
        }
        if (this.w != 1 || i2 >= 0 || !this.f3031e.contains(f2, f3)) {
            return i2;
        }
        return 4;
    }

    private void e(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(i.f2986k, getResources().getDimensionPixelSize(c.ucrop_default_crop_frame_stoke_width));
        int color = typedArray.getColor(i.f2985j, getResources().getColor(b.ucrop_color_default_crop_frame));
        this.u.setStrokeWidth((float) dimensionPixelSize);
        this.u.setColor(color);
        this.u.setStyle(Paint.Style.STROKE);
        this.v.setStrokeWidth((float) (dimensionPixelSize * 3));
        this.v.setColor(color);
        this.v.setStyle(Paint.Style.STROKE);
    }

    private void f(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(i.f2990o, getResources().getDimensionPixelSize(c.ucrop_default_crop_grid_stoke_width));
        int color = typedArray.getColor(i.f2987l, getResources().getColor(b.ucrop_color_default_crop_grid));
        this.t.setStrokeWidth((float) dimensionPixelSize);
        this.t.setColor(color);
        this.f3036j = typedArray.getInt(i.f2989n, 2);
        this.f3037k = typedArray.getInt(i.f2988m, 2);
    }

    private void i(float f2, float f3) {
        this.f3032f.set(this.f3031e);
        int i2 = this.z;
        boolean z2 = true;
        if (i2 == 0) {
            RectF rectF = this.f3032f;
            RectF rectF2 = this.f3031e;
            rectF.set(f2, f3, rectF2.right, rectF2.bottom);
        } else if (i2 == 1) {
            RectF rectF3 = this.f3032f;
            RectF rectF4 = this.f3031e;
            rectF3.set(rectF4.left, f3, f2, rectF4.bottom);
        } else if (i2 == 2) {
            RectF rectF5 = this.f3032f;
            RectF rectF6 = this.f3031e;
            rectF5.set(rectF6.left, rectF6.top, f2, f3);
        } else if (i2 == 3) {
            RectF rectF7 = this.f3032f;
            RectF rectF8 = this.f3031e;
            rectF7.set(f2, rectF8.top, rectF8.right, f3);
        } else if (i2 == 4) {
            this.f3032f.offset(f2 - this.x, f3 - this.y);
            if (this.f3032f.left > ((float) getLeft()) && this.f3032f.top > ((float) getTop()) && this.f3032f.right < ((float) getRight()) && this.f3032f.bottom < ((float) getBottom())) {
                this.f3031e.set(this.f3032f);
                j();
                postInvalidate();
                return;
            }
            return;
        }
        boolean z3 = this.f3032f.height() >= ((float) this.B);
        if (this.f3032f.width() < ((float) this.B)) {
            z2 = false;
        }
        RectF rectF9 = this.f3031e;
        rectF9.set(z2 ? this.f3032f.left : rectF9.left, z3 ? this.f3032f.top : rectF9.top, z2 ? this.f3032f.right : rectF9.right, z3 ? this.f3032f.bottom : rectF9.bottom);
        if (z3 || z2) {
            j();
            postInvalidate();
        }
    }

    private void j() {
        this.f3035i = g.b(this.f3031e);
        g.a(this.f3031e);
        this.f3039m = null;
        this.f3044r.reset();
        this.f3044r.addCircle(this.f3031e.centerX(), this.f3031e.centerY(), Math.min(this.f3031e.width(), this.f3031e.height()) / 2.0f, Path.Direction.CW);
    }

    /* access modifiers changed from: protected */
    public void a(Canvas canvas) {
        if (this.f3041o) {
            if (this.f3039m == null && !this.f3031e.isEmpty()) {
                this.f3039m = new float[((this.f3036j * 4) + (this.f3037k * 4))];
                int i2 = 0;
                for (int i3 = 0; i3 < this.f3036j; i3++) {
                    float[] fArr = this.f3039m;
                    int i4 = i2 + 1;
                    RectF rectF = this.f3031e;
                    fArr[i2] = rectF.left;
                    int i5 = i4 + 1;
                    float f2 = ((float) i3) + 1.0f;
                    float height = rectF.height() * (f2 / ((float) (this.f3036j + 1)));
                    RectF rectF2 = this.f3031e;
                    fArr[i4] = height + rectF2.top;
                    float[] fArr2 = this.f3039m;
                    int i6 = i5 + 1;
                    fArr2[i5] = rectF2.right;
                    i2 = i6 + 1;
                    fArr2[i6] = (rectF2.height() * (f2 / ((float) (this.f3036j + 1)))) + this.f3031e.top;
                }
                for (int i7 = 0; i7 < this.f3037k; i7++) {
                    float[] fArr3 = this.f3039m;
                    int i8 = i2 + 1;
                    float f3 = ((float) i7) + 1.0f;
                    float width = this.f3031e.width() * (f3 / ((float) (this.f3037k + 1)));
                    RectF rectF3 = this.f3031e;
                    fArr3[i2] = width + rectF3.left;
                    float[] fArr4 = this.f3039m;
                    int i9 = i8 + 1;
                    fArr4[i8] = rectF3.top;
                    int i10 = i9 + 1;
                    float width2 = rectF3.width() * (f3 / ((float) (this.f3037k + 1)));
                    RectF rectF4 = this.f3031e;
                    fArr4[i9] = width2 + rectF4.left;
                    i2 = i10 + 1;
                    this.f3039m[i10] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.f3039m;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.t);
            }
        }
        if (this.f3040n) {
            canvas.drawRect(this.f3031e, this.u);
        }
        if (this.w != 0) {
            canvas.save();
            this.f3032f.set(this.f3031e);
            RectF rectF5 = this.f3032f;
            int i11 = this.C;
            rectF5.inset((float) i11, (float) (-i11));
            canvas.clipRect(this.f3032f, Region.Op.DIFFERENCE);
            this.f3032f.set(this.f3031e);
            RectF rectF6 = this.f3032f;
            int i12 = this.C;
            rectF6.inset((float) (-i12), (float) i12);
            canvas.clipRect(this.f3032f, Region.Op.DIFFERENCE);
            canvas.drawRect(this.f3031e, this.v);
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    public void b(Canvas canvas) {
        canvas.save();
        if (this.f3042p) {
            canvas.clipPath(this.f3044r, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.f3031e, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.f3043q);
        canvas.restore();
        if (this.f3042p) {
            canvas.drawCircle(this.f3031e.centerX(), this.f3031e.centerY(), Math.min(this.f3031e.width(), this.f3031e.height()) / 2.0f, this.f3045s);
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, (Paint) null);
        }
    }

    /* access modifiers changed from: protected */
    public void g(TypedArray typedArray) {
        this.f3042p = typedArray.getBoolean(i.f2983h, false);
        int color = typedArray.getColor(i.f2984i, getResources().getColor(b.ucrop_color_default_dimmed));
        this.f3043q = color;
        this.f3045s.setColor(color);
        this.f3045s.setStyle(Paint.Style.STROKE);
        this.f3045s.setStrokeWidth(1.0f);
        e(typedArray);
        this.f3040n = typedArray.getBoolean(i.f2991p, true);
        f(typedArray);
        this.f3041o = typedArray.getBoolean(i.f2992q, true);
    }

    public RectF getCropViewRect() {
        return this.f3031e;
    }

    public int getFreestyleCropMode() {
        return this.w;
    }

    public d getOverlayViewChangeListener() {
        return this.D;
    }

    public void h() {
        int i2 = this.f3033g;
        float f2 = this.f3038l;
        int i3 = (int) (((float) i2) / f2);
        int i4 = this.f3034h;
        if (i3 > i4) {
            int i5 = (int) (((float) i4) * f2);
            int i6 = (i2 - i5) / 2;
            this.f3031e.set((float) (getPaddingLeft() + i6), (float) getPaddingTop(), (float) (getPaddingLeft() + i5 + i6), (float) (getPaddingTop() + this.f3034h));
        } else {
            int i7 = (i4 - i3) / 2;
            this.f3031e.set((float) getPaddingLeft(), (float) (getPaddingTop() + i7), (float) (getPaddingLeft() + this.f3033g), (float) (getPaddingTop() + i3 + i7));
        }
        d dVar = this.D;
        if (dVar != null) {
            dVar.a(this.f3031e);
        }
        j();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b(canvas);
        a(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f3033g = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f3034h = (getHeight() - getPaddingBottom()) - paddingTop;
            if (this.E) {
                this.E = false;
                setTargetAspectRatio(this.f3038l);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2 = false;
        if (!this.f3031e.isEmpty() && this.w != 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int c = c(x2, y2);
                this.z = c;
                if (c != -1) {
                    z2 = true;
                }
                if (!z2) {
                    this.x = -1.0f;
                    this.y = -1.0f;
                } else if (this.x < 0.0f) {
                    this.x = x2;
                    this.y = y2;
                }
                return z2;
            } else if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.z != -1) {
                float min = Math.min(Math.max(x2, (float) getPaddingLeft()), (float) (getWidth() - getPaddingRight()));
                float min2 = Math.min(Math.max(y2, (float) getPaddingTop()), (float) (getHeight() - getPaddingBottom()));
                i(min, min2);
                this.x = min;
                this.y = min2;
                return true;
            } else if ((motionEvent.getAction() & 255) == 1) {
                this.x = -1.0f;
                this.y = -1.0f;
                this.z = -1;
                d dVar = this.D;
                if (dVar != null) {
                    dVar.a(this.f3031e);
                }
            }
        }
        return false;
    }

    public void setCircleDimmedLayer(boolean z2) {
        this.f3042p = z2;
    }

    public void setCropFrameColor(int i2) {
        this.u.setColor(i2);
    }

    public void setCropFrameStrokeWidth(int i2) {
        this.u.setStrokeWidth((float) i2);
    }

    public void setCropGridColor(int i2) {
        this.t.setColor(i2);
    }

    public void setCropGridColumnCount(int i2) {
        this.f3037k = i2;
        this.f3039m = null;
    }

    public void setCropGridRowCount(int i2) {
        this.f3036j = i2;
        this.f3039m = null;
    }

    public void setCropGridStrokeWidth(int i2) {
        this.t.setStrokeWidth((float) i2);
    }

    public void setDimmedColor(int i2) {
        this.f3043q = i2;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z2) {
        this.w = z2 ? 1 : 0;
    }

    public void setFreestyleCropMode(int i2) {
        this.w = i2;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(d dVar) {
        this.D = dVar;
    }

    public void setShowCropFrame(boolean z2) {
        this.f3040n = z2;
    }

    public void setShowCropGrid(boolean z2) {
        this.f3041o = z2;
    }

    public void setTargetAspectRatio(float f2) {
        this.f3038l = f2;
        if (this.f3033g > 0) {
            h();
            postInvalidate();
            return;
        }
        this.E = true;
    }
}
