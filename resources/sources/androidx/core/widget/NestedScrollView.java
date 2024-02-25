package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import e.f.r.i0.b;
import e.f.r.n;
import e.f.r.o;
import e.f.r.q;
import e.f.r.s;
import e.f.r.y;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements q, n {
    private static final a E = new a();
    private static final int[] F = {16843130};
    private final s A;
    private final o B;
    private float C;
    private c D;

    /* renamed from: e  reason: collision with root package name */
    private long f897e;

    /* renamed from: f  reason: collision with root package name */
    private final Rect f898f;

    /* renamed from: g  reason: collision with root package name */
    private OverScroller f899g;

    /* renamed from: h  reason: collision with root package name */
    public EdgeEffect f900h;

    /* renamed from: i  reason: collision with root package name */
    public EdgeEffect f901i;

    /* renamed from: j  reason: collision with root package name */
    private int f902j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f903k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f904l;

    /* renamed from: m  reason: collision with root package name */
    private View f905m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f906n;

    /* renamed from: o  reason: collision with root package name */
    private VelocityTracker f907o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f908p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f909q;

    /* renamed from: r  reason: collision with root package name */
    private int f910r;

    /* renamed from: s  reason: collision with root package name */
    private int f911s;
    private int t;
    private int u;
    private final int[] v;
    private final int[] w;
    private int x;
    private int y;
    private d z;

    static class a extends e.f.r.d {
        a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            e.f.r.i0.d.a(accessibilityEvent, nestedScrollView.getScrollX());
            e.f.r.i0.d.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public void g(View view, e.f.r.i0.b bVar) {
            int scrollRange;
            super.g(view, bVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.I(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                bVar.M(true);
                if (nestedScrollView.getScrollY() > 0) {
                    bVar.a(b.a.f3430e);
                    bVar.a(b.a.f3431f);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    bVar.a(b.a.f3429d);
                    bVar.a(b.a.f3432g);
                }
            }
        }

        public boolean j(View view, int i2, Bundle bundle) {
            if (super.j(view, i2, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i2 != 4096) {
                if (i2 == 8192 || i2 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.Q(0, max, true);
                    return true;
                } else if (i2 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.Q(0, min, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
        void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5);
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public int f912e;

        class a implements Parcelable.Creator<d> {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i2) {
                return new d[i2];
            }
        }

        d(Parcel parcel) {
            super(parcel);
            this.f912e = parcel.readInt();
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f912e + "}";
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f912e);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.f.a.c);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f898f = new Rect();
        this.f903k = true;
        this.f904l = false;
        this.f905m = null;
        this.f906n = false;
        this.f909q = true;
        this.u = -1;
        this.v = new int[2];
        this.w = new int[2];
        this.f900h = d.a(context, attributeSet);
        this.f901i = d.a(context, attributeSet);
        y();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, F, i2, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.A = new s(this);
        this.B = new o(this);
        setNestedScrollingEnabled(true);
        y.S(this, E);
    }

    private boolean A(View view) {
        return !C(view, 0, getHeight());
    }

    private static boolean B(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && B((View) parent, view2);
    }

    private boolean C(View view, int i2, int i3) {
        view.getDrawingRect(this.f898f);
        offsetDescendantRectToMyCoords(view, this.f898f);
        return this.f898f.bottom + i2 >= getScrollY() && this.f898f.top - i2 <= getScrollY() + i3;
    }

    private void D(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.B.d(0, scrollY2, 0, i2 - scrollY2, (int[]) null, i3, iArr);
    }

    private void E(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.u) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f902j = (int) motionEvent.getY(i2);
            this.u = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f907o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void H() {
        VelocityTracker velocityTracker = this.f907o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f907o = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int I(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f900h
            float r0 = androidx.core.widget.d.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r3.f900h
            float r4 = -r4
            float r4 = androidx.core.widget.d.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f900h
            float r5 = androidx.core.widget.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f900h
        L_0x002c:
            r5.onRelease()
        L_0x002f:
            r1 = r4
            goto L_0x0051
        L_0x0031:
            android.widget.EdgeEffect r0 = r3.f901i
            float r0 = androidx.core.widget.d.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            android.widget.EdgeEffect r0 = r3.f901i
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.d.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f901i
            float r5 = androidx.core.widget.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f901i
            goto L_0x002c
        L_0x0051:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L_0x0061
            r3.invalidate()
        L_0x0061:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.I(int, float):int");
    }

    private void J(boolean z2) {
        if (z2) {
            R(2, 1);
        } else {
            T(1);
        }
        this.y = getScrollY();
        y.M(this);
    }

    private boolean K(int i2, int i3, int i4) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        boolean z3 = i2 == 33;
        View s2 = s(z3, i3, i4);
        if (s2 == null) {
            s2 = this;
        }
        if (i3 < scrollY || i4 > i5) {
            l(z3 ? i3 - scrollY : i4 - i5);
            z2 = true;
        }
        if (s2 != findFocus()) {
            s2.requestFocus(i2);
        }
        return z2;
    }

    private void L(View view) {
        view.getDrawingRect(this.f898f);
        offsetDescendantRectToMyCoords(view, this.f898f);
        int f2 = f(this.f898f);
        if (f2 != 0) {
            scrollBy(0, f2);
        }
    }

    private boolean M(Rect rect, boolean z2) {
        int f2 = f(rect);
        boolean z3 = f2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, f2);
            } else {
                N(0, f2);
            }
        }
        return z3;
    }

    private void O(int i2, int i3, int i4, boolean z2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f897e > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f899g;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i4);
                J(z2);
            } else {
                if (!this.f899g.isFinished()) {
                    a();
                }
                scrollBy(i2, i3);
            }
            this.f897e = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private boolean S(MotionEvent motionEvent) {
        boolean z2;
        if (d.b(this.f900h) != 0.0f) {
            d.d(this.f900h, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z2 = true;
        } else {
            z2 = false;
        }
        if (d.b(this.f901i) == 0.0f) {
            return z2;
        }
        d.d(this.f901i, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    private void a() {
        this.f899g.abortAnimation();
        T(1);
    }

    private boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int e(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.C == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.C = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.C;
    }

    private void l(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.f909q) {
            N(0, i2);
        } else {
            scrollBy(0, i2);
        }
    }

    private boolean p(int i2) {
        EdgeEffect edgeEffect;
        if (d.b(this.f900h) != 0.0f) {
            edgeEffect = this.f900h;
        } else if (d.b(this.f901i) == 0.0f) {
            return false;
        } else {
            edgeEffect = this.f901i;
            i2 = -i2;
        }
        edgeEffect.onAbsorb(i2);
        return true;
    }

    private void q() {
        this.f906n = false;
        H();
        T(0);
        this.f900h.onRelease();
        this.f901i.onRelease();
    }

    private View s(boolean z2, int i2, int i3) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) focusables.get(i4);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (!z5) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    private boolean w(int i2, int i3) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i3 >= childAt.getTop() - scrollY && i3 < childAt.getBottom() - scrollY && i2 >= childAt.getLeft() && i2 < childAt.getRight();
    }

    private void x() {
        VelocityTracker velocityTracker = this.f907o;
        if (velocityTracker == null) {
            this.f907o = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void y() {
        this.f899g = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f910r = viewConfiguration.getScaledTouchSlop();
        this.f911s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.t = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void z() {
        if (this.f907o == null) {
            this.f907o = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean F(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.v(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f899g
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.F(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public boolean G(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        if (z2) {
            this.f898f.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f898f;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f898f.top = getScrollY() - height;
            Rect rect2 = this.f898f;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f898f;
        int i3 = rect3.top;
        int i4 = height + i3;
        rect3.bottom = i4;
        return K(i2, i3, i4);
    }

    public final void N(int i2, int i3) {
        O(i2, i3, 250, false);
    }

    /* access modifiers changed from: package-private */
    public void P(int i2, int i3, int i4, boolean z2) {
        O(i2 - getScrollX(), i3 - getScrollY(), i4, z2);
    }

    /* access modifiers changed from: package-private */
    public void Q(int i2, int i3, boolean z2) {
        P(i2, i3, 250, z2);
    }

    public boolean R(int i2, int i3) {
        return this.B.m(i2, i3);
    }

    public void T(int i2) {
        this.B.n(i2);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !C(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            l(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f898f);
            offsetDescendantRectToMyCoords(findNextFocus, this.f898f);
            l(f(this.f898f));
            findNextFocus.requestFocus(i2);
        }
        if (findFocus == null || !findFocus.isFocused() || !A(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f899g.isFinished()) {
            this.f899g.computeScrollOffset();
            int currY = this.f899g.getCurrY();
            int i2 = currY - this.y;
            this.y = currY;
            int[] iArr = this.w;
            boolean z2 = false;
            iArr[1] = 0;
            g(0, i2, iArr, (int[]) null, 1);
            int i3 = i2 - this.w[1];
            int scrollRange = getScrollRange();
            if (i3 != 0) {
                int scrollY = getScrollY();
                F(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i3 - scrollY2;
                int[] iArr2 = this.w;
                iArr2[1] = 0;
                k(0, scrollY2, 0, i4, this.v, 1, iArr2);
                i3 = i4 - this.w[1];
            }
            if (i3 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z2 = true;
                }
                if (z2) {
                    if (i3 < 0) {
                        if (this.f900h.isFinished()) {
                            edgeEffect = this.f900h;
                        }
                    } else if (this.f901i.isFinished()) {
                        edgeEffect = this.f901i;
                    }
                    edgeEffect.onAbsorb((int) this.f899g.getCurrVelocity());
                }
                a();
            }
            if (!this.f899g.isFinished()) {
                y.M(this);
            } else {
                T(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || r(keyEvent);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.B.a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.B.b(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return g(i2, i3, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.B.e(i2, i3, i4, i5, iArr);
    }

    public void draw(Canvas canvas) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i4 = 0;
        if (!this.f900h.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (i3 < 21 || b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i2 = getPaddingLeft() + 0;
            } else {
                i2 = 0;
            }
            if (i3 >= 21 && b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i2, (float) min);
            this.f900h.setSize(width, height);
            if (this.f900h.draw(canvas)) {
                y.M(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f901i.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (i3 < 21 || b.a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i4 = 0 + getPaddingLeft();
            }
            if (i3 >= 21 && b.a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i4 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f901i.setSize(width2, height2);
            if (this.f901i.draw(canvas)) {
                y.M(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* access modifiers changed from: protected */
    public int f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i3) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        } else if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public boolean g(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.B.c(i2, i3, iArr, iArr2, i4);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.A.a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public void h(View view, View view2, int i2, int i3) {
        this.A.c(view, view2, i2, i3);
        R(2, i3);
    }

    public boolean hasNestedScrollingParent() {
        return v(0);
    }

    public void i(View view, int i2) {
        this.A.d(view, i2);
        T(i2);
    }

    public boolean isNestedScrollingEnabled() {
        return this.B.j();
    }

    public void j(View view, int i2, int i3, int[] iArr, int i4) {
        g(i2, i3, iArr, (int[]) null, i4);
    }

    public void k(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        this.B.d(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void m(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        D(i5, i6, iArr);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i2, int i3) {
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void n(View view, int i2, int i3, int i4, int i5, int i6) {
        D(i5, i6, (int[]) null);
    }

    public boolean o(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f904l = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            r2 = 8
            if (r0 != r2) goto L_0x00a5
            boolean r0 = r8.f906n
            if (r0 != 0) goto L_0x00a5
            r0 = 2
            boolean r0 = e.f.r.m.a(r9, r0)
            r2 = 0
            if (r0 == 0) goto L_0x001c
            r0 = 9
        L_0x0017:
            float r0 = r9.getAxisValue(r0)
            goto L_0x0028
        L_0x001c:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = e.f.r.m.a(r9, r0)
            if (r0 == 0) goto L_0x0027
            r0 = 26
            goto L_0x0017
        L_0x0027:
            r0 = 0
        L_0x0028:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00a5
            float r2 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r2
            int r0 = (int) r0
            int r2 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 8194(0x2002, float:1.1482E-41)
            r6 = 1
            if (r0 >= 0) goto L_0x006c
            boolean r2 = r8.c()
            if (r2 == 0) goto L_0x0052
            boolean r9 = e.f.r.m.a(r9, r5)
            if (r9 != 0) goto L_0x0052
            r9 = 1
            goto L_0x0053
        L_0x0052:
            r9 = 0
        L_0x0053:
            if (r9 == 0) goto L_0x0099
            android.widget.EdgeEffect r9 = r8.f900h
            float r0 = (float) r0
            float r0 = -r0
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            androidx.core.widget.d.d(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f900h
            r9.onRelease()
            r8.invalidate()
            r9 = 1
            goto L_0x009a
        L_0x006c:
            if (r0 <= r2) goto L_0x0098
            boolean r7 = r8.c()
            if (r7 == 0) goto L_0x007c
            boolean r9 = e.f.r.m.a(r9, r5)
            if (r9 != 0) goto L_0x007c
            r9 = 1
            goto L_0x007d
        L_0x007c:
            r9 = 0
        L_0x007d:
            if (r9 == 0) goto L_0x0095
            android.widget.EdgeEffect r9 = r8.f901i
            int r0 = r0 - r2
            float r0 = (float) r0
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            androidx.core.widget.d.d(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f901i
            r9.onRelease()
            r8.invalidate()
            r1 = 1
        L_0x0095:
            r9 = r1
            r1 = r2
            goto L_0x009a
        L_0x0098:
            r1 = r0
        L_0x0099:
            r9 = 0
        L_0x009a:
            if (r1 == r3) goto L_0x00a4
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r1)
            return r6
        L_0x00a4:
            return r9
        L_0x00a5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f906n) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.u;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f902j) > this.f910r && (2 & getNestedScrollAxes()) == 0) {
                                this.f906n = true;
                                this.f902j = y2;
                                z();
                                this.f907o.addMovement(motionEvent);
                                this.x = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        E(motionEvent);
                    }
                }
            }
            this.f906n = false;
            this.u = -1;
            H();
            if (this.f899g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                y.M(this);
            }
            T(0);
        } else {
            int y3 = (int) motionEvent.getY();
            if (!w((int) motionEvent.getX(), y3)) {
                if (!S(motionEvent) && this.f899g.isFinished()) {
                    z2 = false;
                }
                this.f906n = z2;
                H();
            } else {
                this.f902j = y3;
                this.u = motionEvent.getPointerId(0);
                x();
                this.f907o.addMovement(motionEvent);
                this.f899g.computeScrollOffset();
                if (!S(motionEvent) && this.f899g.isFinished()) {
                    z2 = false;
                }
                this.f906n = z2;
                R(2, 0);
            }
        }
        return this.f906n;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.f903k = false;
        View view = this.f905m;
        if (view != null && B(view, this)) {
            L(this.f905m);
        }
        this.f905m = null;
        if (!this.f904l) {
            if (this.z != null) {
                scrollTo(getScrollX(), this.z.f912e);
                this.z = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e2 = e(scrollY, paddingTop, i6);
            if (e2 != scrollY) {
                scrollTo(getScrollX(), e2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f904l = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f908p && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        t((int) f3);
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        j(view, i2, i3, iArr, 0);
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        D(i5, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        h(view, view2, i2, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, (View) null, i2) : instance.findNextFocusFromRect(this, rect, i2);
        if (findNextFocus != null && !A(findNextFocus)) {
            return findNextFocus.requestFocus(i2, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.z = dVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f912e = getScrollY();
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        c cVar = this.D;
        if (cVar != null) {
            cVar.a(this, i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && C(findFocus, 0, i5)) {
            findFocus.getDrawingRect(this.f898f);
            offsetDescendantRectToMyCoords(findFocus, this.f898f);
            l(f(this.f898f));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return o(view, view2, i2, 0);
    }

    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r10.f899g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0222, code lost:
        if (r10.f899g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            r23.z()
            int r0 = r24.getActionMasked()
            r12 = 0
            if (r0 != 0) goto L_0x0010
            r10.x = r12
        L_0x0010:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r24)
            int r1 = r10.x
            float r1 = (float) r1
            r2 = 0
            r13.offsetLocation(r2, r1)
            r1 = 2
            r14 = 1
            if (r0 == 0) goto L_0x0226
            r3 = -1
            if (r0 == r14) goto L_0x01db
            if (r0 == r1) goto L_0x0082
            r1 = 3
            if (r0 == r1) goto L_0x0054
            r1 = 5
            if (r0 == r1) goto L_0x0041
            r1 = 6
            if (r0 == r1) goto L_0x002f
            goto L_0x0255
        L_0x002f:
            r23.E(r24)
            int r0 = r10.u
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.f902j = r0
            goto L_0x0255
        L_0x0041:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.f902j = r1
            int r0 = r11.getPointerId(r0)
            r10.u = r0
            goto L_0x0255
        L_0x0054:
            boolean r0 = r10.f906n
            if (r0 == 0) goto L_0x007b
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x007b
            android.widget.OverScroller r15 = r10.f899g
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
        L_0x0078:
            e.f.r.y.M(r23)
        L_0x007b:
            r10.u = r3
            r23.q()
            goto L_0x0255
        L_0x0082:
            int r0 = r10.u
            int r15 = r11.findPointerIndex(r0)
            if (r15 != r3) goto L_0x00a9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r10.u
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x0255
        L_0x00a9:
            float r0 = r11.getY(r15)
            int r6 = (int) r0
            int r0 = r10.f902j
            int r0 = r0 - r6
            float r1 = r11.getX(r15)
            int r1 = r10.I(r0, r1)
            int r0 = r0 - r1
            boolean r1 = r10.f906n
            if (r1 != 0) goto L_0x00d8
            int r1 = java.lang.Math.abs(r0)
            int r2 = r10.f910r
            if (r1 <= r2) goto L_0x00d8
            android.view.ViewParent r1 = r23.getParent()
            if (r1 == 0) goto L_0x00cf
            r1.requestDisallowInterceptTouchEvent(r14)
        L_0x00cf:
            r10.f906n = r14
            int r1 = r10.f910r
            if (r0 <= 0) goto L_0x00d7
            int r0 = r0 - r1
            goto L_0x00d8
        L_0x00d7:
            int r0 = r0 + r1
        L_0x00d8:
            r7 = r0
            boolean r0 = r10.f906n
            if (r0 == 0) goto L_0x0255
            r1 = 0
            int[] r3 = r10.w
            int[] r4 = r10.v
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.g(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00fa
            int[] r0 = r10.w
            r0 = r0[r14]
            int r7 = r7 - r0
            int r0 = r10.x
            int[] r1 = r10.v
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.x = r0
        L_0x00fa:
            r16 = r7
            int[] r0 = r10.v
            r0 = r0[r14]
            int r6 = r6 - r0
            r10.f902j = r6
            int r17 = r23.getScrollY()
            int r9 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L_0x0119
            if (r0 != r14) goto L_0x0116
            if (r9 <= 0) goto L_0x0116
            goto L_0x0119
        L_0x0116:
            r18 = 0
            goto L_0x011b
        L_0x0119:
            r18 = 1
        L_0x011b:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r7 = 0
            r8 = 0
            r19 = 1
            r0 = r23
            r2 = r16
            r6 = r9
            r22 = r9
            r9 = r19
            boolean r0 = r0.F(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x013d
            boolean r0 = r10.v(r12)
            if (r0 != 0) goto L_0x013d
            r8 = 1
            goto L_0x013e
        L_0x013d:
            r8 = 0
        L_0x013e:
            int r0 = r23.getScrollY()
            int r2 = r0 - r17
            int r4 = r16 - r2
            int[] r7 = r10.w
            r7[r14] = r12
            r1 = 0
            r3 = 0
            int[] r5 = r10.v
            r6 = 0
            r0 = r23
            r0.k(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r10.f902j
            int[] r1 = r10.v
            r2 = r1[r14]
            int r0 = r0 - r2
            r10.f902j = r0
            int r0 = r10.x
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.x = r0
            if (r18 == 0) goto L_0x01d1
            int[] r0 = r10.w
            r0 = r0[r14]
            int r0 = r16 - r0
            int r1 = r17 + r0
            if (r1 >= 0) goto L_0x0195
            android.widget.EdgeEffect r1 = r10.f900h
            int r0 = -r0
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            float r2 = r11.getX(r15)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            androidx.core.widget.d.d(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f901i
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01bd
            android.widget.EdgeEffect r0 = r10.f901i
        L_0x0191:
            r0.onRelease()
            goto L_0x01bd
        L_0x0195:
            r2 = r22
            if (r1 <= r2) goto L_0x01bd
            android.widget.EdgeEffect r1 = r10.f901i
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r11.getX(r15)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            androidx.core.widget.d.d(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f900h
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01bd
            android.widget.EdgeEffect r0 = r10.f900h
            goto L_0x0191
        L_0x01bd:
            android.widget.EdgeEffect r0 = r10.f900h
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01cd
            android.widget.EdgeEffect r0 = r10.f901i
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01d1
        L_0x01cd:
            e.f.r.y.M(r23)
            goto L_0x01d2
        L_0x01d1:
            r12 = r8
        L_0x01d2:
            if (r12 == 0) goto L_0x0255
            android.view.VelocityTracker r0 = r10.f907o
            r0.clear()
            goto L_0x0255
        L_0x01db:
            android.view.VelocityTracker r0 = r10.f907o
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r10.t
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r10.u
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r10.f911s
            if (r1 < r4) goto L_0x020a
            boolean r1 = r10.p(r0)
            if (r1 != 0) goto L_0x007b
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r10.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x007b
            r10.dispatchNestedFling(r2, r1, r14)
            r10.t(r0)
            goto L_0x007b
        L_0x020a:
            android.widget.OverScroller r15 = r10.f899g
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
            goto L_0x0078
        L_0x0226:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x022d
            return r12
        L_0x022d:
            boolean r0 = r10.f906n
            if (r0 == 0) goto L_0x023a
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x023a
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x023a:
            android.widget.OverScroller r0 = r10.f899g
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0245
            r23.a()
        L_0x0245:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.f902j = r0
            int r0 = r11.getPointerId(r12)
            r10.u = r0
            r10.R(r1, r12)
        L_0x0255:
            android.view.VelocityTracker r0 = r10.f907o
            if (r0 == 0) goto L_0x025c
            r0.addMovement(r13)
        L_0x025c:
            r13.recycle()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean r(KeyEvent keyEvent) {
        this.f898f.setEmpty();
        int i2 = 130;
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return !keyEvent.isAltPressed() ? b(33) : u(33);
            }
            if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? b(130) : u(130);
            }
            if (keyCode != 62) {
                return false;
            }
            if (keyEvent.isShiftPressed()) {
                i2 = 33;
            }
            G(i2);
            return false;
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f903k) {
            L(view2);
        } else {
            this.f905m = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return M(rect, z2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            H();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        this.f903k = true;
        super.requestLayout();
    }

    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int e2 = e(i2, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int e3 = e(i3, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (e2 != getScrollX() || e3 != getScrollY()) {
                super.scrollTo(e2, e3);
            }
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f908p) {
            this.f908p = z2;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        this.B.k(z2);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.D = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f909q = z2;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i2) {
        return R(i2, 0);
    }

    public void stopNestedScroll() {
        T(0);
    }

    public void t(int i2) {
        if (getChildCount() > 0) {
            this.f899g.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            J(true);
        }
    }

    public boolean u(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f898f;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f898f.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f898f;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f898f;
        return K(i2, rect3.top, rect3.bottom);
    }

    public boolean v(int i2) {
        return this.B.i(i2);
    }
}
