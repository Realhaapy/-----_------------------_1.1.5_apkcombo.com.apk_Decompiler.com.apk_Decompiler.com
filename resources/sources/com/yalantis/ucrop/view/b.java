package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.yalantis.ucrop.l.c;
import com.yalantis.ucrop.n.d;
import com.yalantis.ucrop.n.g;

public class b extends AppCompatImageView {

    /* renamed from: g  reason: collision with root package name */
    protected final float[] f3065g;

    /* renamed from: h  reason: collision with root package name */
    protected final float[] f3066h;

    /* renamed from: i  reason: collision with root package name */
    private final float[] f3067i;

    /* renamed from: j  reason: collision with root package name */
    protected Matrix f3068j;

    /* renamed from: k  reason: collision with root package name */
    protected int f3069k;

    /* renamed from: l  reason: collision with root package name */
    protected int f3070l;

    /* renamed from: m  reason: collision with root package name */
    protected C0055b f3071m;

    /* renamed from: n  reason: collision with root package name */
    private float[] f3072n;

    /* renamed from: o  reason: collision with root package name */
    private float[] f3073o;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f3074p;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f3075q;

    /* renamed from: r  reason: collision with root package name */
    private int f3076r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public String f3077s;
    /* access modifiers changed from: private */
    public String t;
    /* access modifiers changed from: private */
    public Uri u;
    /* access modifiers changed from: private */
    public Uri v;
    /* access modifiers changed from: private */
    public c w;

    class a implements com.yalantis.ucrop.k.b {
        a() {
        }

        public void a(Exception exc) {
            Log.e("TransformImageView", "onFailure: setImageUri", exc);
            C0055b bVar = b.this.f3071m;
            if (bVar != null) {
                bVar.a(exc);
            }
        }

        public void b(Bitmap bitmap, c cVar, Uri uri, Uri uri2) {
            Uri unused = b.this.u = uri;
            Uri unused2 = b.this.v = uri2;
            String unused3 = b.this.f3077s = uri.getPath();
            String unused4 = b.this.t = uri2 != null ? uri2.getPath() : null;
            c unused5 = b.this.w = cVar;
            b bVar = b.this;
            bVar.f3074p = true;
            bVar.setImageBitmap(bitmap);
        }
    }

    /* renamed from: com.yalantis.ucrop.view.b$b  reason: collision with other inner class name */
    public interface C0055b {
        void a(Exception exc);

        void b(float f2);

        void c(float f2);

        void d();
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3065g = new float[8];
        this.f3066h = new float[2];
        this.f3067i = new float[9];
        this.f3068j = new Matrix();
        this.f3074p = false;
        this.f3075q = false;
        this.f3076r = 0;
        k();
    }

    private void q() {
        this.f3068j.mapPoints(this.f3065g, this.f3072n);
        this.f3068j.mapPoints(this.f3066h, this.f3073o);
    }

    public float getCurrentAngle() {
        return h(this.f3068j);
    }

    public float getCurrentScale() {
        return i(this.f3068j);
    }

    public c getExifInfo() {
        return this.w;
    }

    public String getImageInputPath() {
        return this.f3077s;
    }

    public Uri getImageInputUri() {
        return this.u;
    }

    public String getImageOutputPath() {
        return this.t;
    }

    public Uri getImageOutputUri() {
        return this.v;
    }

    public int getMaxBitmapSize() {
        if (this.f3076r <= 0) {
            this.f3076r = com.yalantis.ucrop.n.a.b(getContext());
        }
        return this.f3076r;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof d)) {
            return null;
        }
        return ((d) getDrawable()).a();
    }

    public float h(Matrix matrix) {
        return (float) (-(Math.atan2((double) j(matrix, 1), (double) j(matrix, 0)) * 57.29577951308232d));
    }

    public float i(Matrix matrix) {
        return (float) Math.sqrt(Math.pow((double) j(matrix, 0), 2.0d) + Math.pow((double) j(matrix, 3), 2.0d));
    }

    /* access modifiers changed from: protected */
    public float j(Matrix matrix, int i2) {
        matrix.getValues(this.f3067i);
        return this.f3067i[i2];
    }

    /* access modifiers changed from: protected */
    public void k() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* access modifiers changed from: protected */
    public void l() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            Log.d("TransformImageView", String.format("Image size: [%d:%d]", new Object[]{Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)}));
            RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            this.f3072n = g.b(rectF);
            this.f3073o = g.a(rectF);
            this.f3075q = true;
            C0055b bVar = this.f3071m;
            if (bVar != null) {
                bVar.d();
            }
        }
    }

    public void m(float f2, float f3, float f4) {
        if (f2 != 0.0f) {
            this.f3068j.postRotate(f2, f3, f4);
            setImageMatrix(this.f3068j);
            C0055b bVar = this.f3071m;
            if (bVar != null) {
                bVar.c(h(this.f3068j));
            }
        }
    }

    public void n(float f2, float f3, float f4) {
        if (f2 != 0.0f) {
            this.f3068j.postScale(f2, f2, f3, f4);
            setImageMatrix(this.f3068j);
            C0055b bVar = this.f3071m;
            if (bVar != null) {
                bVar.b(i(this.f3068j));
            }
        }
    }

    public void o(float f2, float f3) {
        if (f2 != 0.0f || f3 != 0.0f) {
            this.f3068j.postTranslate(f2, f3);
            setImageMatrix(this.f3068j);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z || (this.f3074p && !this.f3075q)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f3069k = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f3070l = (getHeight() - getPaddingBottom()) - paddingTop;
            l();
        }
    }

    public void p(Uri uri, Uri uri2) {
        int maxBitmapSize = getMaxBitmapSize();
        com.yalantis.ucrop.n.a.d(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new a());
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new d(bitmap));
    }

    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.f3068j.set(matrix);
        q();
    }

    public void setMaxBitmapSize(int i2) {
        this.f3076r = i2;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(C0055b bVar) {
        this.f3071m = bVar;
    }
}
