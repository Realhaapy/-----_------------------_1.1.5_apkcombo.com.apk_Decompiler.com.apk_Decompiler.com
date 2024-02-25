package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class f extends Drawable {
    private float a;
    private final Paint b;
    private final RectF c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f766d;

    /* renamed from: e  reason: collision with root package name */
    private float f767e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f768f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f769g = true;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f770h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuffColorFilter f771i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f772j;

    /* renamed from: k  reason: collision with root package name */
    private PorterDuff.Mode f773k = PorterDuff.Mode.SRC_IN;

    f(ColorStateList colorStateList, float f2) {
        this.a = f2;
        this.b = new Paint(5);
        e(colorStateList);
        this.c = new RectF();
        this.f766d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f770h = colorStateList;
        this.b.setColor(colorStateList.getColorForState(getState(), this.f770h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f766d.set(rect);
        if (this.f768f) {
            float d2 = g.d(this.f767e, this.a, this.f769g);
            this.f766d.inset((int) Math.ceil((double) g.c(this.f767e, this.a, this.f769g)), (int) Math.ceil((double) d2));
            this.c.set(this.f766d);
        }
    }

    public ColorStateList b() {
        return this.f770h;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f767e;
    }

    public float d() {
        return this.a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.b;
        if (this.f771i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f771i);
            z = true;
        }
        RectF rectF = this.c;
        float f2 = this.a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void g(float f2, boolean z, boolean z2) {
        if (f2 != this.f767e || this.f768f != z || this.f769g != z2) {
            this.f767e = f2;
            this.f768f = z;
            this.f769g = z2;
            i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f766d, this.a);
    }

    /* access modifiers changed from: package-private */
    public void h(float f2) {
        if (f2 != this.a) {
            this.a = f2;
            i((Rect) null);
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f770h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f772j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f770h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.cardview.widget.f.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f770h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.b.getColor();
        if (z) {
            this.b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f772j;
        if (colorStateList2 == null || (mode = this.f773k) == null) {
            return z;
        }
        this.f771i = a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i2) {
        this.b.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f772j = colorStateList;
        this.f771i = a(colorStateList, this.f773k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f773k = mode;
        this.f771i = a(this.f772j, mode);
        invalidateSelf();
    }
}
