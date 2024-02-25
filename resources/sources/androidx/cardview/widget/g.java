package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import e.d.b;
import e.d.c;

class g extends Drawable {

    /* renamed from: q  reason: collision with root package name */
    private static final double f774q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r  reason: collision with root package name */
    static a f775r;
    private final int a;
    private Paint b;
    private Paint c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f776d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f777e;

    /* renamed from: f  reason: collision with root package name */
    private float f778f;

    /* renamed from: g  reason: collision with root package name */
    private Path f779g;

    /* renamed from: h  reason: collision with root package name */
    private float f780h;

    /* renamed from: i  reason: collision with root package name */
    private float f781i;

    /* renamed from: j  reason: collision with root package name */
    private float f782j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f783k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f784l = true;

    /* renamed from: m  reason: collision with root package name */
    private final int f785m;

    /* renamed from: n  reason: collision with root package name */
    private final int f786n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f787o = true;

    /* renamed from: p  reason: collision with root package name */
    private boolean f788p = false;

    interface a {
        void a(Canvas canvas, RectF rectF, float f2, Paint paint);
    }

    g(Resources resources, ColorStateList colorStateList, float f2, float f3, float f4) {
        this.f785m = resources.getColor(b.cardview_shadow_start_color);
        this.f786n = resources.getColor(b.cardview_shadow_end_color);
        this.a = resources.getDimensionPixelSize(c.cardview_compat_inset_shadow);
        this.b = new Paint(5);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f778f = (float) ((int) (f2 + 0.5f));
        this.f777e = new RectF();
        Paint paint2 = new Paint(this.c);
        this.f776d = paint2;
        paint2.setAntiAlias(false);
        s(f3, f4);
    }

    private void a(Rect rect) {
        float f2 = this.f780h;
        float f3 = 1.5f * f2;
        this.f777e.set(((float) rect.left) + f2, ((float) rect.top) + f3, ((float) rect.right) - f2, ((float) rect.bottom) - f3);
        b();
    }

    private void b() {
        float f2 = this.f778f;
        RectF rectF = new RectF(-f2, -f2, f2, f2);
        RectF rectF2 = new RectF(rectF);
        float f3 = this.f781i;
        rectF2.inset(-f3, -f3);
        Path path = this.f779g;
        if (path == null) {
            this.f779g = new Path();
        } else {
            path.reset();
        }
        this.f779g.setFillType(Path.FillType.EVEN_ODD);
        this.f779g.moveTo(-this.f778f, 0.0f);
        this.f779g.rLineTo(-this.f781i, 0.0f);
        this.f779g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f779g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f779g.close();
        float f4 = this.f778f;
        float f5 = f4 / (this.f781i + f4);
        Paint paint = this.c;
        float f6 = this.f778f + this.f781i;
        int i2 = this.f785m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{i2, i2, this.f786n}, new float[]{0.0f, f5, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f776d;
        float f7 = this.f778f;
        float f8 = this.f781i;
        int i3 = this.f785m;
        paint2.setShader(new LinearGradient(0.0f, (-f7) + f8, 0.0f, (-f7) - f8, new int[]{i3, i3, this.f786n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f776d.setAntiAlias(false);
    }

    static float c(float f2, float f3, boolean z) {
        return z ? (float) (((double) f2) + ((1.0d - f774q) * ((double) f3))) : f2;
    }

    static float d(float f2, float f3, boolean z) {
        float f4 = f2 * 1.5f;
        return z ? (float) (((double) f4) + ((1.0d - f774q) * ((double) f3))) : f4;
    }

    private void e(Canvas canvas) {
        float f2 = this.f778f;
        float f3 = (-f2) - this.f781i;
        float f4 = f2 + ((float) this.a) + (this.f782j / 2.0f);
        float f5 = f4 * 2.0f;
        boolean z = this.f777e.width() - f5 > 0.0f;
        boolean z2 = this.f777e.height() - f5 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f777e;
        canvas.translate(rectF.left + f4, rectF.top + f4);
        canvas.drawPath(this.f779g, this.c);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f777e.width() - f5, -this.f778f, this.f776d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f777e;
        canvas.translate(rectF2.right - f4, rectF2.bottom - f4);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f779g, this.c);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f777e.width() - f5, (-this.f778f) + this.f781i, this.f776d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f777e;
        canvas.translate(rectF3.left + f4, rectF3.bottom - f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f779g, this.c);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f777e.height() - f5, -this.f778f, this.f776d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f777e;
        canvas.translate(rectF4.right - f4, rectF4.top + f4);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f779g, this.c);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f777e.height() - f5, -this.f778f, this.f776d);
        }
        canvas.restoreToCount(save4);
    }

    private void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f783k = colorStateList;
        this.b.setColor(colorStateList.getColorForState(getState(), this.f783k.getDefaultColor()));
    }

    private void s(float f2, float f3) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f2 + ". Must be >= 0");
        } else if (f3 >= 0.0f) {
            float t = (float) t(f2);
            float t2 = (float) t(f3);
            if (t > t2) {
                if (!this.f788p) {
                    this.f788p = true;
                }
                t = t2;
            }
            if (this.f782j != t || this.f780h != t2) {
                this.f782j = t;
                this.f780h = t2;
                this.f781i = (float) ((int) ((t * 1.5f) + ((float) this.a) + 0.5f));
                this.f784l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f3 + ". Must be >= 0");
        }
    }

    private int t(float f2) {
        int i2 = (int) (f2 + 0.5f);
        return i2 % 2 == 1 ? i2 - 1 : i2;
    }

    public void draw(Canvas canvas) {
        if (this.f784l) {
            a(getBounds());
            this.f784l = false;
        }
        canvas.translate(0.0f, this.f782j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.f782j) / 2.0f);
        f775r.a(canvas, this.f777e, this.f778f, this.b);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList f() {
        return this.f783k;
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f778f;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) d(this.f780h, this.f778f, this.f787o));
        int ceil2 = (int) Math.ceil((double) c(this.f780h, this.f778f, this.f787o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void h(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.f780h;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f783k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: package-private */
    public float j() {
        float f2 = this.f780h;
        return (Math.max(f2, this.f778f + ((float) this.a) + ((f2 * 1.5f) / 2.0f)) * 2.0f) + (((this.f780h * 1.5f) + ((float) this.a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    public float k() {
        float f2 = this.f780h;
        return (Math.max(f2, this.f778f + ((float) this.a) + (f2 / 2.0f)) * 2.0f) + ((this.f780h + ((float) this.a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f782j;
    }

    /* access modifiers changed from: package-private */
    public void m(boolean z) {
        this.f787o = z;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void o(ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f784l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f783k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.b.getColor() == colorForState) {
            return false;
        }
        this.b.setColor(colorForState);
        this.f784l = true;
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void p(float f2) {
        if (f2 >= 0.0f) {
            float f3 = (float) ((int) (f2 + 0.5f));
            if (this.f778f != f3) {
                this.f778f = f3;
                this.f784l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f2 + ". Must be >= 0");
    }

    /* access modifiers changed from: package-private */
    public void q(float f2) {
        s(this.f782j, f2);
    }

    /* access modifiers changed from: package-private */
    public void r(float f2) {
        s(f2, this.f780h);
    }

    public void setAlpha(int i2) {
        this.b.setAlpha(i2);
        this.c.setAlpha(i2);
        this.f776d.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
