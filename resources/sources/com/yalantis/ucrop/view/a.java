package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import com.yalantis.ucrop.i;
import com.yalantis.ucrop.k.c;
import com.yalantis.ucrop.l.d;
import com.yalantis.ucrop.n.g;
import com.yalantis.ucrop.view.b;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class a extends b {
    private float A;
    private c B;
    private Runnable C;
    private Runnable D;
    private float E;
    private float F;
    private int G;
    private int H;
    private long I;
    /* access modifiers changed from: private */
    public final RectF x;
    private final Matrix y;
    private float z;

    /* renamed from: com.yalantis.ucrop.view.a$a  reason: collision with other inner class name */
    private static class C0054a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final WeakReference<a> f3048e;

        /* renamed from: f  reason: collision with root package name */
        private final long f3049f;

        /* renamed from: g  reason: collision with root package name */
        private final long f3050g = System.currentTimeMillis();

        /* renamed from: h  reason: collision with root package name */
        private final float f3051h;

        /* renamed from: i  reason: collision with root package name */
        private final float f3052i;

        /* renamed from: j  reason: collision with root package name */
        private final float f3053j;

        /* renamed from: k  reason: collision with root package name */
        private final float f3054k;

        /* renamed from: l  reason: collision with root package name */
        private final float f3055l;

        /* renamed from: m  reason: collision with root package name */
        private final float f3056m;

        /* renamed from: n  reason: collision with root package name */
        private final boolean f3057n;

        public C0054a(a aVar, long j2, float f2, float f3, float f4, float f5, float f6, float f7, boolean z) {
            this.f3048e = new WeakReference<>(aVar);
            this.f3049f = j2;
            this.f3051h = f2;
            this.f3052i = f3;
            this.f3053j = f4;
            this.f3054k = f5;
            this.f3055l = f6;
            this.f3056m = f7;
            this.f3057n = z;
        }

        public void run() {
            a aVar = (a) this.f3048e.get();
            if (aVar != null) {
                float min = (float) Math.min(this.f3049f, System.currentTimeMillis() - this.f3050g);
                float b = com.yalantis.ucrop.n.b.b(min, 0.0f, this.f3053j, (float) this.f3049f);
                float b2 = com.yalantis.ucrop.n.b.b(min, 0.0f, this.f3054k, (float) this.f3049f);
                float a = com.yalantis.ucrop.n.b.a(min, 0.0f, this.f3056m, (float) this.f3049f);
                if (min < ((float) this.f3049f)) {
                    float[] fArr = aVar.f3066h;
                    aVar.o(b - (fArr[0] - this.f3051h), b2 - (fArr[1] - this.f3052i));
                    if (!this.f3057n) {
                        aVar.F(this.f3055l + a, aVar.x.centerX(), aVar.x.centerY());
                    }
                    if (!aVar.x()) {
                        aVar.post(this);
                    }
                }
            }
        }
    }

    private static class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final WeakReference<a> f3058e;

        /* renamed from: f  reason: collision with root package name */
        private final long f3059f;

        /* renamed from: g  reason: collision with root package name */
        private final long f3060g = System.currentTimeMillis();

        /* renamed from: h  reason: collision with root package name */
        private final float f3061h;

        /* renamed from: i  reason: collision with root package name */
        private final float f3062i;

        /* renamed from: j  reason: collision with root package name */
        private final float f3063j;

        /* renamed from: k  reason: collision with root package name */
        private final float f3064k;

        public b(a aVar, long j2, float f2, float f3, float f4, float f5) {
            this.f3058e = new WeakReference<>(aVar);
            this.f3059f = j2;
            this.f3061h = f2;
            this.f3062i = f3;
            this.f3063j = f4;
            this.f3064k = f5;
        }

        public void run() {
            a aVar = (a) this.f3058e.get();
            if (aVar != null) {
                float min = (float) Math.min(this.f3059f, System.currentTimeMillis() - this.f3060g);
                float a = com.yalantis.ucrop.n.b.a(min, 0.0f, this.f3062i, (float) this.f3059f);
                if (min < ((float) this.f3059f)) {
                    aVar.F(this.f3061h + a, this.f3063j, this.f3064k);
                    aVar.post(this);
                    return;
                }
                aVar.B();
            }
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.x = new RectF();
        this.y = new Matrix();
        this.A = 10.0f;
        this.D = null;
        this.G = 0;
        this.H = 0;
        this.I = 500;
    }

    private void C(float f2, float f3) {
        float width = this.x.width();
        float height = this.x.height();
        float max = Math.max(this.x.width() / f2, this.x.height() / f3);
        RectF rectF = this.x;
        float f4 = ((height - (f3 * max)) / 2.0f) + rectF.top;
        this.f3068j.reset();
        this.f3068j.postScale(max, max);
        this.f3068j.postTranslate(((width - (f2 * max)) / 2.0f) + rectF.left, f4);
        setImageMatrix(this.f3068j);
    }

    private float[] s() {
        this.y.reset();
        this.y.setRotate(-getCurrentAngle());
        float[] fArr = this.f3065g;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        float[] b2 = g.b(this.x);
        this.y.mapPoints(copyOf);
        this.y.mapPoints(b2);
        RectF d2 = g.d(copyOf);
        RectF d3 = g.d(b2);
        float f2 = d2.left - d3.left;
        float f3 = d2.top - d3.top;
        float f4 = d2.right - d3.right;
        float f5 = d2.bottom - d3.bottom;
        float[] fArr2 = new float[4];
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        fArr2[0] = f2;
        if (f3 <= 0.0f) {
            f3 = 0.0f;
        }
        fArr2[1] = f3;
        if (f4 >= 0.0f) {
            f4 = 0.0f;
        }
        fArr2[2] = f4;
        if (f5 >= 0.0f) {
            f5 = 0.0f;
        }
        fArr2[3] = f5;
        this.y.reset();
        this.y.setRotate(getCurrentAngle());
        this.y.mapPoints(fArr2);
        return fArr2;
    }

    private void t() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            u((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        }
    }

    private void u(float f2, float f3) {
        float min = Math.min(Math.min(this.x.width() / f2, this.x.width() / f3), Math.min(this.x.height() / f3, this.x.height() / f2));
        this.F = min;
        this.E = min * this.A;
    }

    /* access modifiers changed from: protected */
    public void A(TypedArray typedArray) {
        float abs = Math.abs(typedArray.getFloat(i.f2981f, 0.0f));
        float abs2 = Math.abs(typedArray.getFloat(i.f2982g, 0.0f));
        if (abs == 0.0f || abs2 == 0.0f) {
            this.z = 0.0f;
        } else {
            this.z = abs / abs2;
        }
    }

    public void B() {
        setImageToWrapCropBounds(true);
    }

    /* access modifiers changed from: protected */
    public void D(float f2, float f3, float f4, long j2) {
        if (f2 > getMaxScale()) {
            f2 = getMaxScale();
        }
        float currentScale = getCurrentScale();
        b bVar = new b(this, j2, currentScale, f2 - currentScale, f3, f4);
        this.D = bVar;
        post(bVar);
    }

    public void E(float f2) {
        F(f2, this.x.centerX(), this.x.centerY());
    }

    public void F(float f2, float f3, float f4) {
        if (f2 <= getMaxScale()) {
            n(f2 / getCurrentScale(), f3, f4);
        }
    }

    public void G(float f2) {
        H(f2, this.x.centerX(), this.x.centerY());
    }

    public void H(float f2, float f3, float f4) {
        if (f2 >= getMinScale()) {
            n(f2 / getCurrentScale(), f3, f4);
        }
    }

    public c getCropBoundsChangeListener() {
        return this.B;
    }

    public float getMaxScale() {
        return this.E;
    }

    public float getMinScale() {
        return this.F;
    }

    public float getTargetAspectRatio() {
        return this.z;
    }

    /* access modifiers changed from: protected */
    public void l() {
        super.l();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            if (this.z == 0.0f) {
                this.z = intrinsicWidth / intrinsicHeight;
            }
            int i2 = this.f3069k;
            float f2 = this.z;
            int i3 = (int) (((float) i2) / f2);
            int i4 = this.f3070l;
            if (i3 > i4) {
                int i5 = (int) (((float) i4) * f2);
                int i6 = (i2 - i5) / 2;
                this.x.set((float) i6, 0.0f, (float) (i5 + i6), (float) i4);
            } else {
                int i7 = (i4 - i3) / 2;
                this.x.set(0.0f, (float) i7, (float) i2, (float) (i3 + i7));
            }
            u(intrinsicWidth, intrinsicHeight);
            C(intrinsicWidth, intrinsicHeight);
            c cVar = this.B;
            if (cVar != null) {
                cVar.a(this.z);
            }
            b.C0055b bVar = this.f3071m;
            if (bVar != null) {
                bVar.b(getCurrentScale());
                this.f3071m.c(getCurrentAngle());
            }
        }
    }

    public void n(float f2, float f3, float f4) {
        if ((f2 > 1.0f && getCurrentScale() * f2 <= getMaxScale()) || (f2 < 1.0f && getCurrentScale() * f2 >= getMinScale())) {
            super.n(f2, f3, f4);
        }
    }

    public void setCropBoundsChangeListener(c cVar) {
        this.B = cVar;
    }

    public void setCropRect(RectF rectF) {
        this.z = rectF.width() / rectF.height();
        this.x.set(rectF.left - ((float) getPaddingLeft()), rectF.top - ((float) getPaddingTop()), rectF.right - ((float) getPaddingRight()), rectF.bottom - ((float) getPaddingBottom()));
        t();
        B();
    }

    public void setImageToWrapCropBounds(boolean z2) {
        float f2;
        float f3;
        float f4;
        if (this.f3075q && !x()) {
            float[] fArr = this.f3066h;
            float f5 = fArr[0];
            float f6 = fArr[1];
            float currentScale = getCurrentScale();
            float centerX = this.x.centerX() - f5;
            float centerY = this.x.centerY() - f6;
            this.y.reset();
            this.y.setTranslate(centerX, centerY);
            float[] fArr2 = this.f3065g;
            float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
            this.y.mapPoints(copyOf);
            boolean y2 = y(copyOf);
            if (y2) {
                float[] s2 = s();
                f3 = -(s2[1] + s2[3]);
                f4 = -(s2[0] + s2[2]);
                f2 = 0.0f;
            } else {
                RectF rectF = new RectF(this.x);
                this.y.reset();
                this.y.setRotate(getCurrentAngle());
                this.y.mapRect(rectF);
                float[] c = g.c(this.f3065g);
                f4 = centerX;
                f2 = (Math.max(rectF.width() / c[0], rectF.height() / c[1]) * currentScale) - currentScale;
                f3 = centerY;
            }
            if (z2) {
                C0054a aVar = new C0054a(this, this.I, f5, f6, f4, f3, currentScale, f2, y2);
                this.C = aVar;
                post(aVar);
                return;
            }
            o(f4, f3);
            if (!y2) {
                F(currentScale + f2, this.x.centerX(), this.x.centerY());
            }
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(long j2) {
        if (j2 > 0) {
            this.I = j2;
            return;
        }
        throw new IllegalArgumentException("Animation duration cannot be negative value.");
    }

    public void setMaxResultImageSizeX(int i2) {
        this.G = i2;
    }

    public void setMaxResultImageSizeY(int i2) {
        this.H = i2;
    }

    public void setMaxScaleMultiplier(float f2) {
        this.A = f2;
    }

    public void setTargetAspectRatio(float f2) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            this.z = f2;
            return;
        }
        if (f2 == 0.0f) {
            f2 = ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
        }
        this.z = f2;
        c cVar = this.B;
        if (cVar != null) {
            cVar.a(this.z);
        }
    }

    public void v() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
    }

    public void w(Bitmap.CompressFormat compressFormat, int i2, com.yalantis.ucrop.k.a aVar) {
        v();
        setImageToWrapCropBounds(false);
        d dVar = new d(this.x, g.d(this.f3065g), getCurrentScale(), getCurrentAngle());
        com.yalantis.ucrop.l.b bVar = new com.yalantis.ucrop.l.b(this.G, this.H, compressFormat, i2, getImageInputPath(), getImageOutputPath(), getExifInfo());
        bVar.j(getImageInputUri());
        bVar.k(getImageOutputUri());
        new com.yalantis.ucrop.m.a(getContext(), getViewBitmap(), dVar, bVar, aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* access modifiers changed from: protected */
    public boolean x() {
        return y(this.f3065g);
    }

    /* access modifiers changed from: protected */
    public boolean y(float[] fArr) {
        this.y.reset();
        this.y.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.y.mapPoints(copyOf);
        float[] b2 = g.b(this.x);
        this.y.mapPoints(b2);
        return g.d(copyOf).contains(g.d(b2));
    }

    public void z(float f2) {
        m(f2, this.x.centerX(), this.x.centerY());
    }
}
