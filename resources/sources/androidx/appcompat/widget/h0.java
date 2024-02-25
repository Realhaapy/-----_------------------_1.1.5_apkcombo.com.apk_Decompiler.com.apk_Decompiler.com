package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.p;

public abstract class h0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: e  reason: collision with root package name */
    private final float f568e;

    /* renamed from: f  reason: collision with root package name */
    private final int f569f;

    /* renamed from: g  reason: collision with root package name */
    private final int f570g;

    /* renamed from: h  reason: collision with root package name */
    final View f571h;

    /* renamed from: i  reason: collision with root package name */
    private Runnable f572i;

    /* renamed from: j  reason: collision with root package name */
    private Runnable f573j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f574k;

    /* renamed from: l  reason: collision with root package name */
    private int f575l;

    /* renamed from: m  reason: collision with root package name */
    private final int[] f576m = new int[2];

    private class a implements Runnable {
        a() {
        }

        public void run() {
            ViewParent parent = h0.this.f571h.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void run() {
            h0.this.e();
        }
    }

    public h0(View view) {
        this.f571h = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f568e = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f569f = tapTimeout;
        this.f570g = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f573j;
        if (runnable != null) {
            this.f571h.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f572i;
        if (runnable2 != null) {
            this.f571h.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        f0 f0Var;
        View view = this.f571h;
        p b2 = b();
        if (b2 == null || !b2.b() || (f0Var = (f0) b2.f()) == null || !f0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(f0Var, obtainNoHistory);
        boolean e2 = f0Var.e(obtainNoHistory, this.f575l);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e2 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f571h
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f575l
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f568e
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f575l = r6
            java.lang.Runnable r6 = r5.f572i
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.h0$a r6 = new androidx.appcompat.widget.h0$a
            r6.<init>()
            r5.f572i = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f572i
            int r1 = r5.f569f
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f573j
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.h0$b r6 = new androidx.appcompat.widget.h0$b
            r6.<init>()
            r5.f573j = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f573j
            int r1 = r5.f570g
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h0.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f2, float f3, float f4) {
        float f5 = -f4;
        return f2 >= f5 && f3 >= f5 && f2 < ((float) (view.getRight() - view.getLeft())) + f4 && f3 < ((float) (view.getBottom() - view.getTop())) + f4;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f576m;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f576m;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    public abstract p b();

    /* access modifiers changed from: protected */
    public abstract boolean c();

    /* access modifiers changed from: protected */
    public boolean d() {
        p b2 = b();
        if (b2 == null || !b2.b()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        a();
        View view = this.f571h;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f574k = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f574k;
        if (z2) {
            z = f(motionEvent) || !d();
        } else {
            z = g(motionEvent) && c();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f571h.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f574k = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f574k = false;
        this.f575l = -1;
        Runnable runnable = this.f572i;
        if (runnable != null) {
            this.f571h.removeCallbacks(runnable);
        }
    }
}
