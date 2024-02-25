package com.yalantis.ucrop.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.yalantis.ucrop.n.h;

public class GestureCropImageView extends a {
    private ScaleGestureDetector J;
    private h K;
    private GestureDetector L;
    /* access modifiers changed from: private */
    public float M;
    /* access modifiers changed from: private */
    public float N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private int R;

    private class b extends GestureDetector.SimpleOnGestureListener {
        private b() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            gestureCropImageView.D(gestureCropImageView.getDoubleTapTargetScale(), motionEvent.getX(), motionEvent.getY(), 200);
            return super.onDoubleTap(motionEvent);
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            GestureCropImageView.this.o(-f2, -f3);
            return true;
        }
    }

    private class c extends h.b {
        private c() {
        }

        public boolean a(h hVar) {
            GestureCropImageView.this.m(hVar.c(), GestureCropImageView.this.M, GestureCropImageView.this.N);
            return true;
        }
    }

    private class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private d() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView.this.n(scaleGestureDetector.getScaleFactor(), GestureCropImageView.this.M, GestureCropImageView.this.N);
            return true;
        }
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = 5;
    }

    private void K() {
        this.L = new GestureDetector(getContext(), new b(), (Handler) null, true);
        this.J = new ScaleGestureDetector(getContext(), new d());
        this.K = new h(new c());
    }

    public int getDoubleTapScaleSteps() {
        return this.R;
    }

    /* access modifiers changed from: protected */
    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow((double) (getMaxScale() / getMinScale()), (double) (1.0f / ((float) this.R))));
    }

    /* access modifiers changed from: protected */
    public void k() {
        super.k();
        K();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            v();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.M = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
            this.N = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
        }
        if (this.Q) {
            this.L.onTouchEvent(motionEvent);
        }
        if (this.P) {
            this.J.onTouchEvent(motionEvent);
        }
        if (this.O) {
            this.K.d(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1) {
            B();
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i2) {
        this.R = i2;
    }

    public void setGestureEnabled(boolean z) {
        this.Q = z;
    }

    public void setRotateEnabled(boolean z) {
        this.O = z;
    }

    public void setScaleEnabled(boolean z) {
        this.P = z;
    }
}
