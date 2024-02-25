package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.m;
import e.a.f;
import e.f.r.g0;
import e.f.r.p;
import e.f.r.q;
import e.f.r.r;
import e.f.r.s;
import e.f.r.y;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements c0, r, p, q {
    static final int[] J = {e.a.a.actionBarSize, 16842841};
    private g0 A;
    private g0 B;
    private d C;
    private OverScroller D;
    ViewPropertyAnimator E;
    final AnimatorListenerAdapter F;
    private final Runnable G;
    private final Runnable H;
    private final s I;

    /* renamed from: e  reason: collision with root package name */
    private int f420e;

    /* renamed from: f  reason: collision with root package name */
    private int f421f = 0;

    /* renamed from: g  reason: collision with root package name */
    private ContentFrameLayout f422g;

    /* renamed from: h  reason: collision with root package name */
    ActionBarContainer f423h;

    /* renamed from: i  reason: collision with root package name */
    private d0 f424i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f425j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f426k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f427l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f428m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f429n;

    /* renamed from: o  reason: collision with root package name */
    boolean f430o;

    /* renamed from: p  reason: collision with root package name */
    private int f431p;

    /* renamed from: q  reason: collision with root package name */
    private int f432q;

    /* renamed from: r  reason: collision with root package name */
    private final Rect f433r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    private final Rect f434s = new Rect();
    private final Rect t = new Rect();
    private final Rect u = new Rect();
    private final Rect v = new Rect();
    private final Rect w = new Rect();
    private final Rect x = new Rect();
    private g0 y;
    private g0 z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = null;
            actionBarOverlayLayout.f430o = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = null;
            actionBarOverlayLayout.f430o = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = actionBarOverlayLayout.f423h.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.F);
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = actionBarOverlayLayout.f423h.animate().translationY((float) (-ActionBarOverlayLayout.this.f423h.getHeight())).setListener(ActionBarOverlayLayout.this.F);
        }
    }

    public interface d {
        void a();

        void b();

        void c(int i2);

        void d();

        void e(boolean z);

        void f();
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g0 g0Var = g0.b;
        this.y = g0Var;
        this.z = g0Var;
        this.A = g0Var;
        this.B = g0Var;
        this.F = new a();
        this.G = new b();
        this.H = new c();
        v(context);
        this.I = new s(this);
    }

    private void A() {
        u();
        this.G.run();
    }

    private boolean B(float f2) {
        this.D.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.D.getFinalY() > this.f423h.getHeight();
    }

    private void p() {
        u();
        this.H.run();
    }

    private boolean q(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        int i2;
        int i3;
        int i4;
        int i5;
        e eVar = (e) view.getLayoutParams();
        if (!z2 || eVar.leftMargin == (i5 = rect.left)) {
            z6 = false;
        } else {
            eVar.leftMargin = i5;
            z6 = true;
        }
        if (z3 && eVar.topMargin != (i4 = rect.top)) {
            eVar.topMargin = i4;
            z6 = true;
        }
        if (z5 && eVar.rightMargin != (i3 = rect.right)) {
            eVar.rightMargin = i3;
            z6 = true;
        }
        if (!z4 || eVar.bottomMargin == (i2 = rect.bottom)) {
            return z6;
        }
        eVar.bottomMargin = i2;
        return true;
    }

    private d0 t(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(J);
        boolean z2 = false;
        this.f420e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f425j = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f426k = z2;
        this.D = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.H, 600);
    }

    private void y() {
        u();
        postDelayed(this.G, 600);
    }

    public void a(Menu menu, m.a aVar) {
        z();
        this.f424i.a(menu, aVar);
    }

    public boolean b() {
        z();
        return this.f424i.b();
    }

    public void c() {
        z();
        this.f424i.c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public boolean d() {
        z();
        return this.f424i.d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f425j != null && !this.f426k) {
            int bottom = this.f423h.getVisibility() == 0 ? (int) (((float) this.f423h.getBottom()) + this.f423h.getTranslationY() + 0.5f) : 0;
            this.f425j.setBounds(0, bottom, getWidth(), this.f425j.getIntrinsicHeight() + bottom);
            this.f425j.draw(canvas);
        }
    }

    public boolean e() {
        z();
        return this.f424i.e();
    }

    public boolean f() {
        z();
        return this.f424i.f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        z();
        boolean q2 = q(this.f423h, rect, true, true, false, true);
        this.u.set(rect);
        c1.a(this, this.u, this.f433r);
        if (!this.v.equals(this.u)) {
            this.v.set(this.u);
            q2 = true;
        }
        if (!this.f434s.equals(this.f433r)) {
            this.f434s.set(this.f433r);
            q2 = true;
        }
        if (q2) {
            requestLayout();
        }
        return true;
    }

    public boolean g() {
        z();
        return this.f424i.g();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f423h;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.I.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f424i.getTitle();
    }

    public void h(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    public void i(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void j(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    public void k(int i2) {
        z();
        if (i2 == 2) {
            this.f424i.u();
        } else if (i2 == 5) {
            this.f424i.v();
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    public void l() {
        z();
        this.f424i.h();
    }

    public void m(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        n(view, i2, i3, i4, i5, i6);
    }

    public void n(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    public boolean o(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        g0 v2 = g0.v(windowInsets, this);
        boolean q2 = q(this.f423h, new Rect(v2.i(), v2.k(), v2.j(), v2.h()), true, true, false, true);
        y.e(this, v2, this.f433r);
        Rect rect = this.f433r;
        g0 l2 = v2.l(rect.left, rect.top, rect.right, rect.bottom);
        this.y = l2;
        boolean z2 = true;
        if (!this.z.equals(l2)) {
            this.z = this.y;
            q2 = true;
        }
        if (!this.f434s.equals(this.f433r)) {
            this.f434s.set(this.f433r);
        } else {
            z2 = q2;
        }
        if (z2) {
            requestLayout();
        }
        return v2.a().c().b().t();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        y.P(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = eVar.leftMargin + paddingLeft;
                int i8 = eVar.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0104 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r13, int r14) {
        /*
            r12 = this;
            r12.z()
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f423h
            r3 = 0
            r5 = 0
            r0 = r12
            r2 = r13
            r4 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r0 = r12.f423h
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r0
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f423h
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            r2 = 0
            int r7 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f423h
            int r1 = r1.getMeasuredHeight()
            int r3 = r0.topMargin
            int r1 = r1 + r3
            int r0 = r0.bottomMargin
            int r1 = r1 + r0
            int r8 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r0 = r12.f423h
            int r0 = r0.getMeasuredState()
            int r9 = android.view.View.combineMeasuredStates(r2, r0)
            int r0 = e.f.r.y.y(r12)
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            if (r0 == 0) goto L_0x005f
            int r1 = r12.f420e
            boolean r3 = r12.f428m
            if (r3 == 0) goto L_0x0071
            androidx.appcompat.widget.ActionBarContainer r3 = r12.f423h
            android.view.View r3 = r3.getTabContainer()
            if (r3 == 0) goto L_0x0071
            int r3 = r12.f420e
            int r1 = r1 + r3
            goto L_0x0071
        L_0x005f:
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f423h
            int r1 = r1.getVisibility()
            r3 = 8
            if (r1 == r3) goto L_0x0070
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f423h
            int r1 = r1.getMeasuredHeight()
            goto L_0x0071
        L_0x0070:
            r1 = 0
        L_0x0071:
            android.graphics.Rect r3 = r12.t
            android.graphics.Rect r4 = r12.f433r
            r3.set(r4)
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 21
            if (r10 < r11) goto L_0x0083
            e.f.r.g0 r3 = r12.y
            r12.A = r3
            goto L_0x008a
        L_0x0083:
            android.graphics.Rect r3 = r12.w
            android.graphics.Rect r4 = r12.u
            r3.set(r4)
        L_0x008a:
            boolean r3 = r12.f427l
            if (r3 != 0) goto L_0x00a5
            if (r0 != 0) goto L_0x00a5
            android.graphics.Rect r0 = r12.t
            int r3 = r0.top
            int r3 = r3 + r1
            r0.top = r3
            int r3 = r0.bottom
            int r3 = r3 + r2
            r0.bottom = r3
            if (r10 < r11) goto L_0x00e2
            e.f.r.g0 r0 = r12.A
            e.f.r.g0 r0 = r0.l(r2, r1, r2, r2)
            goto L_0x00d3
        L_0x00a5:
            if (r10 < r11) goto L_0x00d6
            e.f.r.g0 r0 = r12.A
            int r0 = r0.i()
            e.f.r.g0 r3 = r12.A
            int r3 = r3.k()
            int r3 = r3 + r1
            e.f.r.g0 r1 = r12.A
            int r1 = r1.j()
            e.f.r.g0 r4 = r12.A
            int r4 = r4.h()
            int r4 = r4 + r2
            e.f.k.b r0 = e.f.k.b.b(r0, r3, r1, r4)
            e.f.r.g0$b r1 = new e.f.r.g0$b
            e.f.r.g0 r2 = r12.A
            r1.<init>(r2)
            r1.c(r0)
            e.f.r.g0 r0 = r1.a()
        L_0x00d3:
            r12.A = r0
            goto L_0x00e2
        L_0x00d6:
            android.graphics.Rect r0 = r12.w
            int r3 = r0.top
            int r3 = r3 + r1
            r0.top = r3
            int r1 = r0.bottom
            int r1 = r1 + r2
            r0.bottom = r1
        L_0x00e2:
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f422g
            android.graphics.Rect r2 = r12.t
            r3 = 1
            r4 = 1
            r5 = 1
            r6 = 1
            r0 = r12
            r0.q(r1, r2, r3, r4, r5, r6)
            if (r10 < r11) goto L_0x0104
            e.f.r.g0 r0 = r12.B
            e.f.r.g0 r1 = r12.A
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0104
            e.f.r.g0 r0 = r12.A
            r12.B = r0
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f422g
            e.f.r.y.f(r1, r0)
            goto L_0x011e
        L_0x0104:
            if (r10 >= r11) goto L_0x011e
            android.graphics.Rect r0 = r12.x
            android.graphics.Rect r1 = r12.w
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x011e
            android.graphics.Rect r0 = r12.x
            android.graphics.Rect r1 = r12.w
            r0.set(r1)
            androidx.appcompat.widget.ContentFrameLayout r0 = r12.f422g
            android.graphics.Rect r1 = r12.w
            r0.a(r1)
        L_0x011e:
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f422g
            r3 = 0
            r5 = 0
            r0 = r12
            r2 = r13
            r4 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ContentFrameLayout r0 = r12.f422g
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r0
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f422g
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r7, r1)
            androidx.appcompat.widget.ContentFrameLayout r2 = r12.f422g
            int r2 = r2.getMeasuredHeight()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r0 = r0.bottomMargin
            int r2 = r2 + r0
            int r0 = java.lang.Math.max(r8, r2)
            androidx.appcompat.widget.ContentFrameLayout r2 = r12.f422g
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r9, r2)
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r3 = r3 + r4
            int r1 = r1 + r3
            int r3 = r12.getPaddingTop()
            int r4 = r12.getPaddingBottom()
            int r3 = r3 + r4
            int r0 = r0 + r3
            int r3 = r12.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r3)
            int r3 = r12.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r3)
            int r1 = android.view.View.resolveSizeAndState(r1, r13, r2)
            int r2 = r2 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r14, r2)
            r12.setMeasuredDimension(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f429n || !z2) {
            return false;
        }
        if (B(f3)) {
            p();
        } else {
            A();
        }
        this.f430o = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f431p + i3;
        this.f431p = i6;
        setActionBarHideOffset(i6);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.I.b(view, view2, i2);
        this.f431p = getActionBarHideOffset();
        u();
        d dVar = this.C;
        if (dVar != null) {
            dVar.b();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f423h.getVisibility() != 0) {
            return false;
        }
        return this.f429n;
    }

    public void onStopNestedScroll(View view) {
        if (this.f429n && !this.f430o) {
            if (this.f431p <= this.f423h.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.C;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i2);
        }
        z();
        int i3 = this.f432q ^ i2;
        this.f432q = i2;
        boolean z2 = false;
        boolean z3 = (i2 & 4) == 0;
        if ((i2 & 256) != 0) {
            z2 = true;
        }
        d dVar = this.C;
        if (dVar != null) {
            dVar.e(!z2);
            if (z3 || !z2) {
                this.C.a();
            } else {
                this.C.f();
            }
        }
        if ((i3 & 256) != 0 && this.C != null) {
            y.P(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f421f = i2;
        d dVar = this.C;
        if (dVar != null) {
            dVar.c(i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    /* renamed from: s */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i2) {
        u();
        this.f423h.setTranslationY((float) (-Math.max(0, Math.min(i2, this.f423h.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.C = dVar;
        if (getWindowToken() != null) {
            this.C.c(this.f421f);
            int i2 = this.f432q;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                y.P(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f428m = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f429n) {
            this.f429n = z2;
            if (!z2) {
                u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        z();
        this.f424i.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f424i.setIcon(drawable);
    }

    public void setLogo(int i2) {
        z();
        this.f424i.r(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.f427l = z2;
        this.f426k = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f424i.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f424i.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        removeCallbacks(this.G);
        removeCallbacks(this.H);
        ViewPropertyAnimator viewPropertyAnimator = this.E;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f427l;
    }

    /* access modifiers changed from: package-private */
    public void z() {
        if (this.f422g == null) {
            this.f422g = (ContentFrameLayout) findViewById(f.action_bar_activity_content);
            this.f423h = (ActionBarContainer) findViewById(f.action_bar_container);
            this.f424i = t(findViewById(f.action_bar));
        }
    }
}
