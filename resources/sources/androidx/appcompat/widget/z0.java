package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import e.f.r.y;
import e.f.r.z;

class z0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: n  reason: collision with root package name */
    private static z0 f742n;

    /* renamed from: o  reason: collision with root package name */
    private static z0 f743o;

    /* renamed from: e  reason: collision with root package name */
    private final View f744e;

    /* renamed from: f  reason: collision with root package name */
    private final CharSequence f745f;

    /* renamed from: g  reason: collision with root package name */
    private final int f746g;

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f747h = new a();

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f748i = new b();

    /* renamed from: j  reason: collision with root package name */
    private int f749j;

    /* renamed from: k  reason: collision with root package name */
    private int f750k;

    /* renamed from: l  reason: collision with root package name */
    private a1 f751l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f752m;

    class a implements Runnable {
        a() {
        }

        public void run() {
            z0.this.g(false);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            z0.this.c();
        }
    }

    private z0(View view, CharSequence charSequence) {
        this.f744e = view;
        this.f745f = charSequence;
        this.f746g = z.a(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f744e.removeCallbacks(this.f747h);
    }

    private void b() {
        this.f749j = Integer.MAX_VALUE;
        this.f750k = Integer.MAX_VALUE;
    }

    private void d() {
        this.f744e.postDelayed(this.f747h, (long) ViewConfiguration.getLongPressTimeout());
    }

    private static void e(z0 z0Var) {
        z0 z0Var2 = f742n;
        if (z0Var2 != null) {
            z0Var2.a();
        }
        f742n = z0Var;
        if (z0Var != null) {
            z0Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        z0 z0Var = f742n;
        if (z0Var != null && z0Var.f744e == view) {
            e((z0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            z0 z0Var2 = f743o;
            if (z0Var2 != null && z0Var2.f744e == view) {
                z0Var2.c();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new z0(view, charSequence);
    }

    private boolean h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f749j) <= this.f746g && Math.abs(y - this.f750k) <= this.f746g) {
            return false;
        }
        this.f749j = x;
        this.f750k = y;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (f743o == this) {
            f743o = null;
            a1 a1Var = this.f751l;
            if (a1Var != null) {
                a1Var.c();
                this.f751l = null;
                b();
                this.f744e.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f742n == this) {
            e((z0) null);
        }
        this.f744e.removeCallbacks(this.f748i);
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z) {
        long j2;
        if (y.C(this.f744e)) {
            e((z0) null);
            z0 z0Var = f743o;
            if (z0Var != null) {
                z0Var.c();
            }
            f743o = this;
            this.f752m = z;
            a1 a1Var = new a1(this.f744e.getContext());
            this.f751l = a1Var;
            a1Var.e(this.f744e, this.f749j, this.f750k, this.f752m, this.f745f);
            this.f744e.addOnAttachStateChangeListener(this);
            if (this.f752m) {
                j2 = 2500;
            } else {
                j2 = ((y.y(this.f744e) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f744e.removeCallbacks(this.f748i);
            this.f744e.postDelayed(this.f748i, j2);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f751l != null && this.f752m) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f744e.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f744e.isEnabled() && this.f751l == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f749j = view.getWidth() / 2;
        this.f750k = view.getHeight() / 2;
        g(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
