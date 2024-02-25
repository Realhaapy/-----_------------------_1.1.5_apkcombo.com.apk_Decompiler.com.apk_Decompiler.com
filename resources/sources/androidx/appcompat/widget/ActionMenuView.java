package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.i0;

public class ActionMenuView extends i0 implements g.b, n {
    private boolean A;
    private int B;
    private int C;
    private int D;
    e E;
    private g t;
    private Context u;
    private int v;
    private boolean w;
    private c x;
    private m.a y;
    g.a z;

    public interface a {
        boolean b();

        boolean c();
    }

    private static class b implements m.a {
        b() {
        }

        public void a(g gVar, boolean z) {
        }

        public boolean b(g gVar) {
            return false;
        }
    }

    public static class c extends i0.a {
        @ViewDebug.ExportedProperty
        public boolean a;
        @ViewDebug.ExportedProperty
        public int b;
        @ViewDebug.ExportedProperty
        public int c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f437d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f438e;

        /* renamed from: f  reason: collision with root package name */
        boolean f439f;

        public c(int i2, int i3) {
            super(i2, i3);
            this.a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.a = cVar.a;
        }
    }

    private class d implements g.a {
        d() {
        }

        public boolean a(g gVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.E;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        public void b(g gVar) {
            g.a aVar = ActionMenuView.this.z;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.C = (int) (56.0f * f2);
        this.D = (int) (f2 * 4.0f);
        this.u = context;
        this.v = 0;
    }

    static int J(View view, int i2, int i3, int i4, int i5) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = true;
        boolean z3 = actionMenuItemView != null && actionMenuItemView.f();
        int i6 = 2;
        if (i3 <= 0 || (z3 && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i7 = measuredWidth / i2;
            if (measuredWidth % i2 != 0) {
                i7++;
            }
            if (!z3 || i7 >= 2) {
                i6 = i7;
            }
        }
        if (cVar.a || !z3) {
            z2 = false;
        }
        cVar.f437d = z2;
        cVar.b = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), makeMeasureSpec);
        return i6;
    }

    private void K(int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        boolean z4;
        int i7;
        boolean z5;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
        int i8 = size - paddingLeft;
        int i9 = this.C;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = i9 + (i11 / i10);
        int childCount = getChildCount();
        int i13 = 0;
        int i14 = 0;
        boolean z6 = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        long j2 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            int i18 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i19 = i15 + 1;
                if (z7) {
                    int i20 = this.D;
                    i7 = i19;
                    z5 = false;
                    childAt.setPadding(i20, 0, i20, 0);
                } else {
                    i7 = i19;
                    z5 = false;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f439f = z5;
                cVar.c = z5 ? 1 : 0;
                cVar.b = z5;
                cVar.f437d = z5;
                cVar.leftMargin = z5;
                cVar.rightMargin = z5;
                cVar.f438e = z7 && ((ActionMenuItemView) childAt).f();
                int J = J(childAt, i12, cVar.a ? 1 : i10, childMeasureSpec, paddingTop);
                i16 = Math.max(i16, J);
                if (cVar.f437d) {
                    i17++;
                }
                if (cVar.a) {
                    z6 = true;
                }
                i10 -= J;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (J == 1) {
                    j2 |= (long) (1 << i14);
                    i13 = i13;
                } else {
                    int i21 = i13;
                }
                i15 = i7;
            }
            i14++;
            size2 = i18;
        }
        int i22 = size2;
        boolean z8 = z6 && i15 == 2;
        boolean z9 = false;
        while (true) {
            if (i17 <= 0 || i10 <= 0) {
                i6 = mode;
                i4 = i8;
                z2 = z9;
                i5 = i13;
            } else {
                int i23 = 0;
                int i24 = 0;
                int i25 = Integer.MAX_VALUE;
                long j3 = 0;
                while (i24 < childCount) {
                    boolean z10 = z9;
                    c cVar2 = (c) getChildAt(i24).getLayoutParams();
                    int i26 = i13;
                    if (cVar2.f437d) {
                        int i27 = cVar2.b;
                        if (i27 < i25) {
                            j3 = 1 << i24;
                            i25 = i27;
                            i23 = 1;
                        } else if (i27 == i25) {
                            i23++;
                            j3 |= 1 << i24;
                        }
                    }
                    i24++;
                    i13 = i26;
                    z9 = z10;
                }
                z2 = z9;
                i5 = i13;
                j2 |= j3;
                if (i23 > i10) {
                    i6 = mode;
                    i4 = i8;
                    break;
                }
                int i28 = i25 + 1;
                int i29 = 0;
                while (i29 < childCount) {
                    View childAt2 = getChildAt(i29);
                    c cVar3 = (c) childAt2.getLayoutParams();
                    int i30 = i8;
                    int i31 = mode;
                    long j4 = (long) (1 << i29);
                    if ((j3 & j4) == 0) {
                        if (cVar3.b == i28) {
                            j2 |= j4;
                        }
                        z4 = z8;
                    } else {
                        if (!z8 || !cVar3.f438e || i10 != 1) {
                            z4 = z8;
                        } else {
                            int i32 = this.D;
                            z4 = z8;
                            childAt2.setPadding(i32 + i12, 0, i32, 0);
                        }
                        cVar3.b++;
                        cVar3.f439f = true;
                        i10--;
                    }
                    i29++;
                    mode = i31;
                    i8 = i30;
                    z8 = z4;
                }
                i13 = i5;
                z9 = true;
            }
        }
        boolean z11 = !z6 && i15 == 1;
        if (i10 <= 0 || j2 == 0 || (i10 >= i15 - 1 && !z11 && i16 <= 1)) {
            z3 = z2;
        } else {
            float bitCount = (float) Long.bitCount(j2);
            if (!z11) {
                if ((j2 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f438e) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount - 1;
                if ((j2 & ((long) (1 << i33))) != 0 && !((c) getChildAt(i33).getLayoutParams()).f438e) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > 0.0f ? (int) (((float) (i10 * i12)) / bitCount) : 0;
            z3 = z2;
            for (int i35 = 0; i35 < childCount; i35++) {
                if ((j2 & ((long) (1 << i35))) != 0) {
                    View childAt3 = getChildAt(i35);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.c = i34;
                        cVar4.f439f = true;
                        if (i35 == 0 && !cVar4.f438e) {
                            cVar4.leftMargin = (-i34) / 2;
                        }
                    } else if (cVar4.a) {
                        cVar4.c = i34;
                        cVar4.f439f = true;
                        cVar4.rightMargin = (-i34) / 2;
                    } else {
                        if (i35 != 0) {
                            cVar4.leftMargin = i34 / 2;
                        }
                        if (i35 != childCount - 1) {
                            cVar4.rightMargin = i34 / 2;
                        }
                    }
                    z3 = true;
                }
            }
        }
        if (z3) {
            for (int i36 = 0; i36 < childCount; i36++) {
                View childAt4 = getChildAt(i36);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f439f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.b * i12) + cVar5.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i4, i6 != 1073741824 ? i5 : i22);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public c k() {
        c cVar = new c(-2, -2);
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: B */
    public c l(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public c m(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return k();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    public c D() {
        c A2 = k();
        A2.a = true;
        return A2;
    }

    /* access modifiers changed from: protected */
    public boolean E(int i2) {
        boolean z2 = false;
        if (i2 == 0) {
            return false;
        }
        View childAt = getChildAt(i2 - 1);
        View childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof a)) {
            z2 = false | ((a) childAt).b();
        }
        return (i2 <= 0 || !(childAt2 instanceof a)) ? z2 : z2 | ((a) childAt2).c();
    }

    public boolean F() {
        c cVar = this.x;
        return cVar != null && cVar.B();
    }

    public boolean G() {
        c cVar = this.x;
        return cVar != null && cVar.D();
    }

    public boolean H() {
        c cVar = this.x;
        return cVar != null && cVar.E();
    }

    public boolean I() {
        return this.w;
    }

    public g L() {
        return this.t;
    }

    public void M(m.a aVar, g.a aVar2) {
        this.y = aVar;
        this.z = aVar2;
    }

    public boolean N() {
        c cVar = this.x;
        return cVar != null && cVar.K();
    }

    public boolean a(i iVar) {
        return this.t.L(iVar, 0);
    }

    public void b(g gVar) {
        this.t = gVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.t == null) {
            Context context = getContext();
            g gVar = new g(context);
            this.t = gVar;
            gVar.R(new d());
            c cVar = new c(context);
            this.x = cVar;
            cVar.J(true);
            c cVar2 = this.x;
            m.a aVar = this.y;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.j(aVar);
            this.t.c(this.x, this.u);
            this.x.H(this);
        }
        return this.t;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.x.A();
    }

    public int getPopupTheme() {
        return this.v;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.x;
        if (cVar != null) {
            cVar.e(false);
            if (this.x.E()) {
                this.x.B();
                this.x.K();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (!this.A) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i4 - i2;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean b2 = c1.b(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (E(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b2) {
                        i6 = getPaddingLeft() + cVar.leftMargin;
                        i7 = i6 + measuredWidth;
                    } else {
                        i7 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i6 = i7 - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i6, i13, i7, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    E(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (b2) {
            int width = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.a) {
                    int i18 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width = i18 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.a) {
                int i21 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        g gVar;
        boolean z2 = this.A;
        boolean z3 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.A = z3;
        if (z2 != z3) {
            this.B = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (!(!this.A || (gVar = this.t) == null || size == this.B)) {
            this.B = size;
            gVar.K(true);
        }
        int childCount = getChildCount();
        if (!this.A || childCount <= 0) {
            for (int i4 = 0; i4 < childCount; i4++) {
                c cVar = (c) getChildAt(i4).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        K(i2, i3);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.x.G(z2);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.E = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.x.I(drawable);
    }

    public void setOverflowReserved(boolean z2) {
        this.w = z2;
    }

    public void setPopupTheme(int i2) {
        if (this.v != i2) {
            this.v = i2;
            if (i2 == 0) {
                this.u = getContext();
            } else {
                this.u = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(c cVar) {
        this.x = cVar;
        cVar.H(this);
    }

    public void z() {
        c cVar = this.x;
        if (cVar != null) {
            cVar.y();
        }
    }
}
