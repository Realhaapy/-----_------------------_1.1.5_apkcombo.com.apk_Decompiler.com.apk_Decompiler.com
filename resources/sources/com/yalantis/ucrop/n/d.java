package com.yalantis.ucrop.n;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class d extends Drawable {
    private final Paint a = new Paint(2);
    private Bitmap b;
    private int c = 255;

    /* renamed from: d  reason: collision with root package name */
    private int f3022d;

    /* renamed from: e  reason: collision with root package name */
    private int f3023e;

    public d(Bitmap bitmap) {
        b(bitmap);
    }

    public Bitmap a() {
        return this.b;
    }

    public void b(Bitmap bitmap) {
        this.b = bitmap;
        if (bitmap != null) {
            this.f3022d = bitmap.getWidth();
            this.f3023e = this.b.getHeight();
            return;
        }
        this.f3023e = 0;
        this.f3022d = 0;
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.b;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.b, (Rect) null, getBounds(), this.a);
        }
    }

    public int getAlpha() {
        return this.c;
    }

    public int getIntrinsicHeight() {
        return this.f3023e;
    }

    public int getIntrinsicWidth() {
        return this.f3022d;
    }

    public int getMinimumHeight() {
        return this.f3023e;
    }

    public int getMinimumWidth() {
        return this.f3022d;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i2) {
        this.c = i2;
        this.a.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public void setFilterBitmap(boolean z) {
        this.a.setFilterBitmap(z);
    }
}
