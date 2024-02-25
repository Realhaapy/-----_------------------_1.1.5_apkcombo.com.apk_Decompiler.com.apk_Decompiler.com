package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.yalantis.ucrop.e;
import com.yalantis.ucrop.f;
import com.yalantis.ucrop.i;
import com.yalantis.ucrop.k.c;
import com.yalantis.ucrop.k.d;

public class UCropView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public GestureCropImageView f3046e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final OverlayView f3047f;

    class a implements c {
        a() {
        }

        public void a(float f2) {
            UCropView.this.f3047f.setTargetAspectRatio(f2);
        }
    }

    class b implements d {
        b() {
        }

        public void a(RectF rectF) {
            UCropView.this.f3046e.setCropRect(rectF);
        }
    }

    public UCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UCropView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        LayoutInflater.from(context).inflate(f.ucrop_view, this, true);
        this.f3046e = (GestureCropImageView) findViewById(e.image_view_crop);
        OverlayView overlayView = (OverlayView) findViewById(e.view_overlay);
        this.f3047f = overlayView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f2980e);
        overlayView.g(obtainStyledAttributes);
        this.f3046e.A(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        c();
    }

    private void c() {
        this.f3046e.setCropBoundsChangeListener(new a());
        this.f3047f.setOverlayViewChangeListener(new b());
    }

    public GestureCropImageView getCropImageView() {
        return this.f3046e;
    }

    public OverlayView getOverlayView() {
        return this.f3047f;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
