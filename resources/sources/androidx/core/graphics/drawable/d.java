package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

class d extends Drawable implements Drawable.Callback, c, b {

    /* renamed from: k  reason: collision with root package name */
    static final PorterDuff.Mode f888k = PorterDuff.Mode.SRC_IN;

    /* renamed from: e  reason: collision with root package name */
    private int f889e;

    /* renamed from: f  reason: collision with root package name */
    private PorterDuff.Mode f890f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f891g;

    /* renamed from: h  reason: collision with root package name */
    f f892h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f893i;

    /* renamed from: j  reason: collision with root package name */
    Drawable f894j;

    d(Drawable drawable) {
        this.f892h = d();
        a(drawable);
    }

    d(f fVar, Resources resources) {
        this.f892h = fVar;
        e(resources);
    }

    private f d() {
        return new f(this.f892h);
    }

    private void e(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.f892h;
        if (fVar != null && (constantState = fVar.b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    private boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        f fVar = this.f892h;
        ColorStateList colorStateList = fVar.c;
        PorterDuff.Mode mode = fVar.f896d;
        if (colorStateList == null || mode == null) {
            this.f891g = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f891g && colorForState == this.f889e && mode == this.f890f)) {
                setColorFilter(colorForState, mode);
                this.f889e = colorForState;
                this.f890f = mode;
                this.f891g = true;
                return true;
            }
        }
        return false;
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f894j;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f894j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f892h;
            if (fVar != null) {
                fVar.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final Drawable b() {
        return this.f894j;
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f894j.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f892h;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f894j.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        f fVar = this.f892h;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.f892h.a = getChangingConfigurations();
        return this.f892h;
    }

    public Drawable getCurrent() {
        return this.f894j.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f894j.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f894j.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return a.e(this.f894j);
    }

    public int getMinimumHeight() {
        return this.f894j.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f894j.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f894j.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f894j.getPadding(rect);
    }

    public int[] getState() {
        return this.f894j.getState();
    }

    public Region getTransparentRegion() {
        return this.f894j.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.g(this.f894j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f892h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x000d
            androidx.core.graphics.drawable.f r0 = r1.f892h
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f894j
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.d.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f894j.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f893i && super.mutate() == this) {
            this.f892h = d();
            Drawable drawable = this.f894j;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f892h;
            if (fVar != null) {
                Drawable drawable2 = this.f894j;
                fVar.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f893i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f894j;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        return a.l(this.f894j, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        return this.f894j.setLevel(i2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        this.f894j.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z) {
        a.i(this.f894j, z);
    }

    public void setChangingConfigurations(int i2) {
        this.f894j.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f894j.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f894j.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f894j.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return f(iArr) || this.f894j.setState(iArr);
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f892h.c = colorStateList;
        f(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f892h.f896d = mode;
        f(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f894j.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
