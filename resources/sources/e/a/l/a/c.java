package e.a.l.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

public class c extends Drawable implements Drawable.Callback {

    /* renamed from: e  reason: collision with root package name */
    private Drawable f3148e;

    public c(Drawable drawable) {
        b(drawable);
    }

    public Drawable a() {
        return this.f3148e;
    }

    public void b(Drawable drawable) {
        Drawable drawable2 = this.f3148e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f3148e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f3148e.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f3148e.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f3148e.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f3148e.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f3148e.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f3148e.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f3148e.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f3148e.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f3148e.getPadding(rect);
    }

    public int[] getState() {
        return this.f3148e.getState();
    }

    public Region getTransparentRegion() {
        return this.f3148e.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.g(this.f3148e);
    }

    public boolean isStateful() {
        return this.f3148e.isStateful();
    }

    public void jumpToCurrentState() {
        this.f3148e.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f3148e.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        return this.f3148e.setLevel(i2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        this.f3148e.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z) {
        a.i(this.f3148e, z);
    }

    public void setChangingConfigurations(int i2) {
        this.f3148e.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3148e.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f3148e.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f3148e.setFilterBitmap(z);
    }

    public void setHotspot(float f2, float f3) {
        a.j(this.f3148e, f2, f3);
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        a.k(this.f3148e, i2, i3, i4, i5);
    }

    public boolean setState(int[] iArr) {
        return this.f3148e.setState(iArr);
    }

    public void setTint(int i2) {
        a.m(this.f3148e, i2);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.n(this.f3148e, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.o(this.f3148e, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f3148e.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
