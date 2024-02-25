package com.yalantis.ucrop.n;

import android.view.MotionEvent;

public class h {
    private float a;
    private float b;
    private float c;

    /* renamed from: d  reason: collision with root package name */
    private float f3024d;

    /* renamed from: e  reason: collision with root package name */
    private int f3025e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f3026f = -1;

    /* renamed from: g  reason: collision with root package name */
    private float f3027g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3028h;

    /* renamed from: i  reason: collision with root package name */
    private a f3029i;

    public interface a {
        boolean a(h hVar);
    }

    public static class b implements a {
    }

    public h(a aVar) {
        this.f3029i = aVar;
    }

    private float a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        return b((float) Math.toDegrees((double) ((float) Math.atan2((double) (f3 - f5), (double) (f2 - f4)))), (float) Math.toDegrees((double) ((float) Math.atan2((double) (f7 - f9), (double) (f6 - f8)))));
    }

    private float b(float f2, float f3) {
        float f4;
        float f5 = (f3 % 360.0f) - (f2 % 360.0f);
        this.f3027g = f5;
        if (f5 < -180.0f) {
            f4 = f5 + 360.0f;
        } else {
            if (f5 > 180.0f) {
                f4 = f5 - 360.0f;
            }
            return this.f3027g;
        }
        this.f3027g = f4;
        return this.f3027g;
    }

    public float c() {
        return this.f3027g;
    }

    public boolean d(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f3025e = -1;
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    this.a = motionEvent.getX();
                    this.b = motionEvent.getY();
                    this.f3026f = motionEvent2.findPointerIndex(motionEvent2.getPointerId(motionEvent.getActionIndex()));
                } else if (actionMasked == 6) {
                    this.f3026f = -1;
                }
            } else if (!(this.f3025e == -1 || this.f3026f == -1 || motionEvent.getPointerCount() <= this.f3026f)) {
                float x = motionEvent2.getX(this.f3025e);
                float y = motionEvent2.getY(this.f3025e);
                float x2 = motionEvent2.getX(this.f3026f);
                float y2 = motionEvent2.getY(this.f3026f);
                if (this.f3028h) {
                    this.f3027g = 0.0f;
                    this.f3028h = false;
                } else {
                    a(this.a, this.b, this.c, this.f3024d, x2, y2, x, y);
                }
                a aVar = this.f3029i;
                if (aVar != null) {
                    aVar.a(this);
                }
                this.a = x2;
                this.b = y2;
                this.c = x;
                this.f3024d = y;
            }
            return true;
        }
        this.c = motionEvent.getX();
        this.f3024d = motionEvent.getY();
        this.f3025e = motionEvent2.findPointerIndex(motionEvent2.getPointerId(0));
        this.f3027g = 0.0f;
        this.f3028h = true;
        return true;
    }
}
