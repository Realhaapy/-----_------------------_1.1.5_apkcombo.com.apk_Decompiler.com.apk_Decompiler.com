package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import e.f.r.y;

public abstract class a implements View.OnTouchListener {
    private static final int v = ViewConfiguration.getTapTimeout();

    /* renamed from: e  reason: collision with root package name */
    final C0017a f913e = new C0017a();

    /* renamed from: f  reason: collision with root package name */
    private final Interpolator f914f = new AccelerateInterpolator();

    /* renamed from: g  reason: collision with root package name */
    final View f915g;

    /* renamed from: h  reason: collision with root package name */
    private Runnable f916h;

    /* renamed from: i  reason: collision with root package name */
    private float[] f917i = {0.0f, 0.0f};

    /* renamed from: j  reason: collision with root package name */
    private float[] f918j = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: k  reason: collision with root package name */
    private int f919k;

    /* renamed from: l  reason: collision with root package name */
    private int f920l;

    /* renamed from: m  reason: collision with root package name */
    private float[] f921m = {0.0f, 0.0f};

    /* renamed from: n  reason: collision with root package name */
    private float[] f922n = {0.0f, 0.0f};

    /* renamed from: o  reason: collision with root package name */
    private float[] f923o = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: p  reason: collision with root package name */
    private boolean f924p;

    /* renamed from: q  reason: collision with root package name */
    boolean f925q;

    /* renamed from: r  reason: collision with root package name */
    boolean f926r;

    /* renamed from: s  reason: collision with root package name */
    boolean f927s;
    private boolean t;
    private boolean u;

    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    private static class C0017a {
        private int a;
        private int b;
        private float c;

        /* renamed from: d  reason: collision with root package name */
        private float f928d;

        /* renamed from: e  reason: collision with root package name */
        private long f929e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        private long f930f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f931g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f932h = 0;

        /* renamed from: i  reason: collision with root package name */
        private long f933i = -1;

        /* renamed from: j  reason: collision with root package name */
        private float f934j;

        /* renamed from: k  reason: collision with root package name */
        private int f935k;

        C0017a() {
        }

        private float e(long j2) {
            long j3 = this.f929e;
            if (j2 < j3) {
                return 0.0f;
            }
            long j4 = this.f933i;
            if (j4 < 0 || j2 < j4) {
                return a.e(((float) (j2 - j3)) / ((float) this.a), 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f934j;
            return (1.0f - f2) + (f2 * a.e(((float) (j2 - j4)) / ((float) this.f935k), 0.0f, 1.0f));
        }

        private float g(float f2) {
            return (-4.0f * f2 * f2) + (f2 * 4.0f);
        }

        public void a() {
            if (this.f930f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g2 = g(e(currentAnimationTimeMillis));
                this.f930f = currentAnimationTimeMillis;
                float f2 = ((float) (currentAnimationTimeMillis - this.f930f)) * g2;
                this.f931g = (int) (this.c * f2);
                this.f932h = (int) (f2 * this.f928d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f931g;
        }

        public int c() {
            return this.f932h;
        }

        public int d() {
            float f2 = this.c;
            return (int) (f2 / Math.abs(f2));
        }

        public int f() {
            float f2 = this.f928d;
            return (int) (f2 / Math.abs(f2));
        }

        public boolean h() {
            return this.f933i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f933i + ((long) this.f935k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f935k = a.f((int) (currentAnimationTimeMillis - this.f929e), 0, this.b);
            this.f934j = e(currentAnimationTimeMillis);
            this.f933i = currentAnimationTimeMillis;
        }

        public void j(int i2) {
            this.b = i2;
        }

        public void k(int i2) {
            this.a = i2;
        }

        public void l(float f2, float f3) {
            this.c = f2;
            this.f928d = f3;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f929e = currentAnimationTimeMillis;
            this.f933i = -1;
            this.f930f = currentAnimationTimeMillis;
            this.f934j = 0.5f;
            this.f931g = 0;
            this.f932h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.f927s) {
                if (aVar.f925q) {
                    aVar.f925q = false;
                    aVar.f913e.m();
                }
                C0017a aVar2 = a.this.f913e;
                if (aVar2.h() || !a.this.u()) {
                    a.this.f927s = false;
                    return;
                }
                a aVar3 = a.this;
                if (aVar3.f926r) {
                    aVar3.f926r = false;
                    aVar3.c();
                }
                aVar2.a();
                a.this.j(aVar2.b(), aVar2.c());
                y.N(a.this.f915g, this);
            }
        }
    }

    public a(View view) {
        this.f915g = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = (float) ((int) ((1575.0f * f2) + 0.5f));
        o(f3, f3);
        float f4 = (float) ((int) ((f2 * 315.0f) + 0.5f));
        p(f4, f4);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(v);
        r(500);
        q(500);
    }

    private float d(int i2, float f2, float f3, float f4) {
        float h2 = h(this.f917i[i2], f3, this.f918j[i2], f2);
        int i3 = (h2 > 0.0f ? 1 : (h2 == 0.0f ? 0 : -1));
        if (i3 == 0) {
            return 0.0f;
        }
        float f5 = this.f921m[i2];
        float f6 = this.f922n[i2];
        float f7 = this.f923o[i2];
        float f8 = f5 * f4;
        return i3 > 0 ? e(h2 * f8, f6, f7) : -e((-h2) * f8, f6, f7);
    }

    static float e(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    static int f(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    private float g(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f919k;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                return f2 >= 0.0f ? 1.0f - (f2 / f3) : (!this.f927s || i2 != 1) ? 0.0f : 1.0f;
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
    }

    private float h(float f2, float f3, float f4, float f5) {
        float f6;
        float e2 = e(f2 * f3, 0.0f, f4);
        float g2 = g(f3 - f5, e2) - g(f5, e2);
        if (g2 < 0.0f) {
            f6 = -this.f914f.getInterpolation(-g2);
        } else if (g2 <= 0.0f) {
            return 0.0f;
        } else {
            f6 = this.f914f.getInterpolation(g2);
        }
        return e(f6, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f925q) {
            this.f927s = false;
        } else {
            this.f913e.i();
        }
    }

    private void v() {
        int i2;
        if (this.f916h == null) {
            this.f916h = new b();
        }
        this.f927s = true;
        this.f925q = true;
        if (this.f924p || (i2 = this.f920l) <= 0) {
            this.f916h.run();
        } else {
            y.O(this.f915g, this.f916h, (long) i2);
        }
        this.f924p = true;
    }

    public abstract boolean a(int i2);

    public abstract boolean b(int i2);

    /* access modifiers changed from: package-private */
    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f915g.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i2, int i3);

    public a k(int i2) {
        this.f920l = i2;
        return this;
    }

    public a l(int i2) {
        this.f919k = i2;
        return this;
    }

    public a m(boolean z) {
        if (this.t && !z) {
            i();
        }
        this.t = z;
        return this;
    }

    public a n(float f2, float f3) {
        float[] fArr = this.f918j;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a o(float f2, float f3) {
        float[] fArr = this.f923o;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.t
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.i()
            goto L_0x0058
        L_0x001a:
            r5.f926r = r2
            r5.f924p = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f915g
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f915g
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f913e
            r7.l(r0, r6)
            boolean r6 = r5.f927s
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.u()
            if (r6 == 0) goto L_0x0058
            r5.v()
        L_0x0058:
            boolean r6 = r5.u
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f927s
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f2, float f3) {
        float[] fArr = this.f922n;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public a q(int i2) {
        this.f913e.j(i2);
        return this;
    }

    public a r(int i2) {
        this.f913e.k(i2);
        return this;
    }

    public a s(float f2, float f3) {
        float[] fArr = this.f917i;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a t(float f2, float f3) {
        float[] fArr = this.f921m;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean u() {
        C0017a aVar = this.f913e;
        int f2 = aVar.f();
        int d2 = aVar.d();
        return (f2 != 0 && b(f2)) || (d2 != 0 && a(d2));
    }
}
