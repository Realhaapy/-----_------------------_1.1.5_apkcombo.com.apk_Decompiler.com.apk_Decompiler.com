package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import e.a.f;
import e.a.g;
import e.a.j;
import e.a.n.b;
import e.f.r.y;

public class ActionBarContextView extends a {

    /* renamed from: m  reason: collision with root package name */
    private CharSequence f412m;

    /* renamed from: n  reason: collision with root package name */
    private CharSequence f413n;

    /* renamed from: o  reason: collision with root package name */
    private View f414o;

    /* renamed from: p  reason: collision with root package name */
    private View f415p;

    /* renamed from: q  reason: collision with root package name */
    private View f416q;

    /* renamed from: r  reason: collision with root package name */
    private LinearLayout f417r;

    /* renamed from: s  reason: collision with root package name */
    private TextView f418s;
    private TextView t;
    private int u;
    private int v;
    private boolean w;
    private int x;

    class a implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f419e;

        a(ActionBarContextView actionBarContextView, b bVar) {
            this.f419e = bVar;
        }

        public void onClick(View view) {
            this.f419e.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        w0 u2 = w0.u(context, attributeSet, j.x, i2, 0);
        y.T(this, u2.f(j.y));
        this.u = u2.m(j.C, 0);
        this.v = u2.m(j.B, 0);
        this.f504i = u2.l(j.A, 0);
        this.x = u2.m(j.z, g.abc_action_mode_close_item_material);
        u2.v();
    }

    private void i() {
        if (this.f417r == null) {
            LayoutInflater.from(getContext()).inflate(g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f417r = linearLayout;
            this.f418s = (TextView) linearLayout.findViewById(f.action_bar_title);
            this.t = (TextView) this.f417r.findViewById(f.action_bar_subtitle);
            if (this.u != 0) {
                this.f418s.setTextAppearance(getContext(), this.u);
            }
            if (this.v != 0) {
                this.t.setTextAppearance(getContext(), this.v);
            }
        }
        this.f418s.setText(this.f412m);
        this.t.setText(this.f413n);
        boolean z = !TextUtils.isEmpty(this.f412m);
        boolean z2 = !TextUtils.isEmpty(this.f413n);
        int i2 = 0;
        this.t.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f417r;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f417r.getParent() == null) {
            addView(this.f417r);
        }
    }

    public void g() {
        if (this.f414o == null) {
            k();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f413n;
    }

    public CharSequence getTitle() {
        return this.f412m;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(e.a.n.b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f414o
            if (r0 != 0) goto L_0x0019
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.x
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f414o = r0
        L_0x0015:
            r3.addView(r0)
            goto L_0x0022
        L_0x0019:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0022
            android.view.View r0 = r3.f414o
            goto L_0x0015
        L_0x0022:
            android.view.View r0 = r3.f414o
            int r1 = e.a.f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            r3.f415p = r0
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r3, r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.e()
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.g) r4
            androidx.appcompat.widget.c r0 = r3.f503h
            if (r0 == 0) goto L_0x0041
            r0.y()
        L_0x0041:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f503h = r0
            r1 = 1
            r0.J(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f503h
            android.content.Context r2 = r3.f501f
            r4.c(r1, r2)
            androidx.appcompat.widget.c r4 = r3.f503h
            androidx.appcompat.view.menu.n r4 = r4.o(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f502g = r4
            r1 = 0
            e.f.r.y.T(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f502g
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.h(e.a.n.b):void");
    }

    public boolean j() {
        return this.w;
    }

    public void k() {
        removeAllViews();
        this.f416q = null;
        this.f502g = null;
        this.f503h = null;
        View view = this.f415p;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public boolean l() {
        c cVar = this.f503h;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f503h;
        if (cVar != null) {
            cVar.B();
            this.f503h.C();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f412m);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean b = c1.b(this);
        int paddingRight = b ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f414o;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f414o.getLayoutParams();
            int i6 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d2 = a.d(paddingRight, i6, b);
            paddingRight = a.d(d2 + e(this.f414o, d2, paddingTop, paddingTop2, b), i7, b);
        }
        int i8 = paddingRight;
        LinearLayout linearLayout = this.f417r;
        if (!(linearLayout == null || this.f416q != null || linearLayout.getVisibility() == 8)) {
            i8 += e(this.f417r, i8, paddingTop, paddingTop2, b);
        }
        int i9 = i8;
        View view2 = this.f416q;
        if (view2 != null) {
            e(view2, i9, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f502g;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4 = 1073741824;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i3) != 0) {
            int size = View.MeasureSpec.getSize(i2);
            int i5 = this.f504i;
            if (i5 <= 0) {
                i5 = View.MeasureSpec.getSize(i3);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i6 = i5 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
            View view = this.f414o;
            if (view != null) {
                int c = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f414o.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f502g;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f502g, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f417r;
            if (linearLayout != null && this.f416q == null) {
                if (this.w) {
                    this.f417r.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f417r.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f417r.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f416q;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i7 = layoutParams.width;
                int i8 = i7 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                int i9 = layoutParams.height;
                if (i9 == -2) {
                    i4 = Integer.MIN_VALUE;
                }
                if (i9 >= 0) {
                    i6 = Math.min(i9, i6);
                }
                this.f416q.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i8), View.MeasureSpec.makeMeasureSpec(i6, i4));
            }
            if (this.f504i <= 0) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i10) {
                        i10 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i10);
                return;
            }
            setMeasuredDimension(size, i5);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i2) {
        this.f504i = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f416q;
        if (view2 != null) {
            removeView(view2);
        }
        this.f416q = view;
        if (!(view == null || (linearLayout = this.f417r) == null)) {
            removeView(linearLayout);
            this.f417r = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f413n = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f412m = charSequence;
        i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.w) {
            requestLayout();
        }
        this.w = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
