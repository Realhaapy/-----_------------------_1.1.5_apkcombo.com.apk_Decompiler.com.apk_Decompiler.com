package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import e.a.j;
import e.f.r.h;
import e.f.r.k;
import e.f.r.y;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    private int A;
    private CharSequence B;
    private CharSequence C;
    private ColorStateList D;
    private ColorStateList E;
    private boolean F;
    private boolean G;
    private final ArrayList<View> H;
    private final ArrayList<View> I;
    private final int[] J;
    f K;
    private final ActionMenuView.e L;
    private x0 M;
    private c N;
    private d O;
    private m.a P;
    private g.a Q;
    private boolean R;
    private final Runnable S;

    /* renamed from: e  reason: collision with root package name */
    private ActionMenuView f473e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f474f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f475g;

    /* renamed from: h  reason: collision with root package name */
    private ImageButton f476h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f477i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f478j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f479k;

    /* renamed from: l  reason: collision with root package name */
    ImageButton f480l;

    /* renamed from: m  reason: collision with root package name */
    View f481m;

    /* renamed from: n  reason: collision with root package name */
    private Context f482n;

    /* renamed from: o  reason: collision with root package name */
    private int f483o;

    /* renamed from: p  reason: collision with root package name */
    private int f484p;

    /* renamed from: q  reason: collision with root package name */
    private int f485q;

    /* renamed from: r  reason: collision with root package name */
    int f486r;

    /* renamed from: s  reason: collision with root package name */
    private int f487s;
    private int t;
    private int u;
    private int v;
    private int w;
    private o0 x;
    private int y;
    private int z;

    class a implements ActionMenuView.e {
        a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.K;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Toolbar.this.O();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    private class d implements m {

        /* renamed from: e  reason: collision with root package name */
        androidx.appcompat.view.menu.g f490e;

        /* renamed from: f  reason: collision with root package name */
        i f491f;

        d() {
        }

        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
        }

        public void c(Context context, androidx.appcompat.view.menu.g gVar) {
            i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f490e;
            if (!(gVar2 == null || (iVar = this.f491f) == null)) {
                gVar2.f(iVar);
            }
            this.f490e = gVar;
        }

        public boolean d(r rVar) {
            return false;
        }

        public void e(boolean z) {
            if (this.f491f != null) {
                androidx.appcompat.view.menu.g gVar = this.f490e;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        } else if (this.f490e.getItem(i2) == this.f491f) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (!z2) {
                    h(this.f490e, this.f491f);
                }
            }
        }

        public boolean g() {
            return false;
        }

        public boolean h(androidx.appcompat.view.menu.g gVar, i iVar) {
            View view = Toolbar.this.f481m;
            if (view instanceof e.a.n.c) {
                ((e.a.n.c) view).d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f481m);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f480l);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f481m = null;
            toolbar3.a();
            this.f491f = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            return true;
        }

        public boolean i(androidx.appcompat.view.menu.g gVar, i iVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f480l.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f480l);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f480l);
            }
            Toolbar.this.f481m = iVar.getActionView();
            this.f491f = iVar;
            ViewParent parent2 = Toolbar.this.f481m.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f481m);
                }
                e m2 = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m2.a = 8388611 | (toolbar4.f486r & 112);
                m2.b = 2;
                toolbar4.f481m.setLayoutParams(m2);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f481m);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            iVar.r(true);
            View view = Toolbar.this.f481m;
            if (view instanceof e.a.n.c) {
                ((e.a.n.c) view).c();
            }
            return true;
        }
    }

    public static class e extends a.C0008a {
        int b = 0;

        public e(int i2, int i3) {
            super(i2, i3);
            this.a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            a(marginLayoutParams);
        }

        public e(a.C0008a aVar) {
            super(aVar);
        }

        public e(e eVar) {
            super((a.C0008a) eVar);
            this.b = eVar.b;
        }

        /* access modifiers changed from: package-private */
        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class g extends e.h.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        int f493g;

        /* renamed from: h  reason: collision with root package name */
        boolean f494h;

        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i2) {
                return new g[i2];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f493g = parcel.readInt();
            this.f494h = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f493g);
            parcel.writeInt(this.f494h ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A = 8388627;
        this.H = new ArrayList<>();
        this.I = new ArrayList<>();
        this.J = new int[2];
        this.L = new a();
        this.S = new b();
        Context context2 = getContext();
        int[] iArr = j.E2;
        w0 u2 = w0.u(context2, attributeSet, iArr, i2, 0);
        y.Q(this, context, iArr, attributeSet, u2.q(), i2, 0);
        this.f484p = u2.m(j.g3, 0);
        this.f485q = u2.m(j.X2, 0);
        this.A = u2.k(j.F2, this.A);
        this.f486r = u2.k(j.G2, 48);
        int d2 = u2.d(j.a3, 0);
        int i3 = j.f3;
        d2 = u2.r(i3) ? u2.d(i3, d2) : d2;
        this.w = d2;
        this.v = d2;
        this.u = d2;
        this.t = d2;
        int d3 = u2.d(j.d3, -1);
        if (d3 >= 0) {
            this.t = d3;
        }
        int d4 = u2.d(j.c3, -1);
        if (d4 >= 0) {
            this.u = d4;
        }
        int d5 = u2.d(j.e3, -1);
        if (d5 >= 0) {
            this.v = d5;
        }
        int d6 = u2.d(j.b3, -1);
        if (d6 >= 0) {
            this.w = d6;
        }
        this.f487s = u2.e(j.R2, -1);
        int d7 = u2.d(j.N2, Integer.MIN_VALUE);
        int d8 = u2.d(j.J2, Integer.MIN_VALUE);
        int e2 = u2.e(j.L2, 0);
        int e3 = u2.e(j.M2, 0);
        h();
        this.x.e(e2, e3);
        if (!(d7 == Integer.MIN_VALUE && d8 == Integer.MIN_VALUE)) {
            this.x.g(d7, d8);
        }
        this.y = u2.d(j.O2, Integer.MIN_VALUE);
        this.z = u2.d(j.K2, Integer.MIN_VALUE);
        this.f478j = u2.f(j.I2);
        this.f479k = u2.o(j.H2);
        CharSequence o2 = u2.o(j.Z2);
        if (!TextUtils.isEmpty(o2)) {
            setTitle(o2);
        }
        CharSequence o3 = u2.o(j.W2);
        if (!TextUtils.isEmpty(o3)) {
            setSubtitle(o3);
        }
        this.f482n = getContext();
        setPopupTheme(u2.m(j.V2, 0));
        Drawable f2 = u2.f(j.U2);
        if (f2 != null) {
            setNavigationIcon(f2);
        }
        CharSequence o4 = u2.o(j.T2);
        if (!TextUtils.isEmpty(o4)) {
            setNavigationContentDescription(o4);
        }
        Drawable f3 = u2.f(j.P2);
        if (f3 != null) {
            setLogo(f3);
        }
        CharSequence o5 = u2.o(j.Q2);
        if (!TextUtils.isEmpty(o5)) {
            setLogoDescription(o5);
        }
        int i4 = j.h3;
        if (u2.r(i4)) {
            setTitleTextColor(u2.c(i4));
        }
        int i5 = j.Y2;
        if (u2.r(i5)) {
            setSubtitleTextColor(u2.c(i5));
        }
        int i6 = j.S2;
        if (u2.r(i6)) {
            x(u2.m(i6, 0));
        }
        u2.v();
    }

    private int B(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.leftMargin - iArr[0];
        int max = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int q2 = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q2, max + measuredWidth, view.getMeasuredHeight() + q2);
        return max + measuredWidth + eVar.rightMargin;
    }

    private int C(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int q2 = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q2, max, view.getMeasuredHeight() + q2);
        return max - (measuredWidth + eVar.leftMargin);
    }

    private int D(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void E(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void F() {
        removeCallbacks(this.S);
        post(this.S);
    }

    private boolean M() {
        if (!this.R) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (N(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean N(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i2) {
        boolean z2 = y.s(this) == 1;
        int childCount = getChildCount();
        int a2 = h.a(i2, y.s(this));
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.b == 0 && N(childAt) && p(eVar.a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.b == 0 && N(childAt2) && p(eVar2.a) == a2) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e m2 = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        m2.b = 1;
        if (!z2 || this.f481m == null) {
            addView(view, m2);
            return;
        }
        view.setLayoutParams(m2);
        this.I.add(view);
    }

    private MenuInflater getMenuInflater() {
        return new e.a.n.g(getContext());
    }

    private void h() {
        if (this.x == null) {
            this.x = new o0();
        }
    }

    private void i() {
        if (this.f477i == null) {
            this.f477i = new AppCompatImageView(getContext());
        }
    }

    private void j() {
        k();
        if (this.f473e.L() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f473e.getMenu();
            if (this.O == null) {
                this.O = new d();
            }
            this.f473e.setExpandedActionViewsExclusive(true);
            gVar.c(this.O, this.f482n);
        }
    }

    private void k() {
        if (this.f473e == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f473e = actionMenuView;
            actionMenuView.setPopupTheme(this.f483o);
            this.f473e.setOnMenuItemClickListener(this.L);
            this.f473e.M(this.P, this.Q);
            e m2 = generateDefaultLayoutParams();
            m2.a = 8388613 | (this.f486r & 112);
            this.f473e.setLayoutParams(m2);
            c(this.f473e, false);
        }
    }

    private void l() {
        if (this.f476h == null) {
            this.f476h = new m(getContext(), (AttributeSet) null, e.a.a.toolbarNavigationButtonStyle);
            e m2 = generateDefaultLayoutParams();
            m2.a = 8388611 | (this.f486r & 112);
            this.f476h.setLayoutParams(m2);
        }
    }

    private int p(int i2) {
        int s2 = y.s(this);
        int a2 = h.a(i2, s2) & 7;
        return (a2 == 1 || a2 == 3 || a2 == 5) ? a2 : s2 == 1 ? 5 : 3;
    }

    private int q(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int r2 = r(eVar.a);
        if (r2 == 48) {
            return getPaddingTop() - i3;
        }
        if (r2 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = eVar.topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = eVar.bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    private int r(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.A & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return k.b(marginLayoutParams) + k.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            View view = list.get(i4);
            e eVar = (e) view.getLayoutParams();
            int i6 = eVar.leftMargin - i2;
            int i7 = eVar.rightMargin - i3;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i7);
            int max3 = Math.max(0, -i6);
            int max4 = Math.max(0, -i7);
            i5 += max + view.getMeasuredWidth() + max2;
            i4++;
            i3 = max4;
            i2 = max3;
        }
        return i5;
    }

    private boolean y(View view) {
        return view.getParent() == this || this.I.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f473e;
        return actionMenuView != null && actionMenuView.H();
    }

    /* access modifiers changed from: package-private */
    public void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((e) childAt.getLayoutParams()).b == 2 || childAt == this.f473e)) {
                removeViewAt(childCount);
                this.I.add(childAt);
            }
        }
    }

    public void H(int i2, int i3) {
        h();
        this.x.g(i2, i3);
    }

    public void I(androidx.appcompat.view.menu.g gVar, c cVar) {
        if (gVar != null || this.f473e != null) {
            k();
            androidx.appcompat.view.menu.g L2 = this.f473e.L();
            if (L2 != gVar) {
                if (L2 != null) {
                    L2.O(this.N);
                    L2.O(this.O);
                }
                if (this.O == null) {
                    this.O = new d();
                }
                cVar.G(true);
                if (gVar != null) {
                    gVar.c(cVar, this.f482n);
                    gVar.c(this.O, this.f482n);
                } else {
                    cVar.c(this.f482n, (androidx.appcompat.view.menu.g) null);
                    this.O.c(this.f482n, (androidx.appcompat.view.menu.g) null);
                    cVar.e(true);
                    this.O.e(true);
                }
                this.f473e.setPopupTheme(this.f483o);
                this.f473e.setPresenter(cVar);
                this.N = cVar;
            }
        }
    }

    public void J(m.a aVar, g.a aVar2) {
        this.P = aVar;
        this.Q = aVar2;
        ActionMenuView actionMenuView = this.f473e;
        if (actionMenuView != null) {
            actionMenuView.M(aVar, aVar2);
        }
    }

    public void K(Context context, int i2) {
        this.f485q = i2;
        TextView textView = this.f475g;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void L(Context context, int i2) {
        this.f484p = i2;
        TextView textView = this.f474f;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public boolean O() {
        ActionMenuView actionMenuView = this.f473e;
        return actionMenuView != null && actionMenuView.N();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        for (int size = this.I.size() - 1; size >= 0; size--) {
            addView(this.I.get(size));
        }
        this.I.clear();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f473e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f473e
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.I()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.d():boolean");
    }

    public void e() {
        d dVar = this.O;
        i iVar = dVar == null ? null : dVar.f491f;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f473e;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (this.f480l == null) {
            m mVar = new m(getContext(), (AttributeSet) null, e.a.a.toolbarNavigationButtonStyle);
            this.f480l = mVar;
            mVar.setImageDrawable(this.f478j);
            this.f480l.setContentDescription(this.f479k);
            e m2 = generateDefaultLayoutParams();
            m2.a = 8388611 | (this.f486r & 112);
            m2.b = 2;
            this.f480l.setLayoutParams(m2);
            this.f480l.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f480l;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f480l;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o0 o0Var = this.x;
        if (o0Var != null) {
            return o0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.z;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o0 o0Var = this.x;
        if (o0Var != null) {
            return o0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        o0 o0Var = this.x;
        if (o0Var != null) {
            return o0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        o0 o0Var = this.x;
        if (o0Var != null) {
            return o0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.y;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.L();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f473e
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.g r0 = r0.L()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.z
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return y.s(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return y.s(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.y, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f477i;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f477i;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f473e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f476h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f476h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public c getOuterActionMenuPresenter() {
        return this.N;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f473e.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f482n;
    }

    public int getPopupTheme() {
        return this.f483o;
    }

    public CharSequence getSubtitle() {
        return this.C;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f475g;
    }

    public CharSequence getTitle() {
        return this.B;
    }

    public int getTitleMarginBottom() {
        return this.w;
    }

    public int getTitleMarginEnd() {
        return this.u;
    }

    public int getTitleMarginStart() {
        return this.t;
    }

    public int getTitleMarginTop() {
        return this.v;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f474f;
    }

    public d0 getWrapper() {
        if (this.M == null) {
            this.M = new x0(this, true);
        }
        return this.M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0008a ? new e((a.C0008a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.G = false;
        }
        if (!this.G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.G = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.G = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0299 A[LOOP:0: B:106:0x0297->B:107:0x0299, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02bb A[LOOP:1: B:109:0x02b9->B:110:0x02bb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02f4 A[LOOP:2: B:117:0x02f2->B:118:0x02f4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = e.f.r.y.s(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.J
            r11[r2] = r3
            r11[r3] = r3
            int r12 = e.f.r.y.t(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f476h
            boolean r13 = r0.N(r13)
            if (r13 == 0) goto L_0x0053
            android.widget.ImageButton r13 = r0.f476h
            if (r1 == 0) goto L_0x004e
            int r13 = r0.C(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0055
        L_0x004e:
            int r13 = r0.B(r13, r6, r11, r12)
            goto L_0x0054
        L_0x0053:
            r13 = r6
        L_0x0054:
            r14 = r10
        L_0x0055:
            android.widget.ImageButton r15 = r0.f480l
            boolean r15 = r0.N(r15)
            if (r15 == 0) goto L_0x006a
            android.widget.ImageButton r15 = r0.f480l
            if (r1 == 0) goto L_0x0066
            int r14 = r0.C(r15, r14, r11, r12)
            goto L_0x006a
        L_0x0066:
            int r13 = r0.B(r15, r13, r11, r12)
        L_0x006a:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f473e
            boolean r15 = r0.N(r15)
            if (r15 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f473e
            if (r1 == 0) goto L_0x007b
            int r13 = r0.B(r15, r13, r11, r12)
            goto L_0x007f
        L_0x007b:
            int r14 = r0.C(r15, r14, r11, r12)
        L_0x007f:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f481m
            boolean r13 = r0.N(r13)
            if (r13 == 0) goto L_0x00ba
            android.view.View r13 = r0.f481m
            if (r1 == 0) goto L_0x00b6
            int r10 = r0.C(r13, r10, r11, r12)
            goto L_0x00ba
        L_0x00b6:
            int r2 = r0.B(r13, r2, r11, r12)
        L_0x00ba:
            android.widget.ImageView r13 = r0.f477i
            boolean r13 = r0.N(r13)
            if (r13 == 0) goto L_0x00cf
            android.widget.ImageView r13 = r0.f477i
            if (r1 == 0) goto L_0x00cb
            int r10 = r0.C(r13, r10, r11, r12)
            goto L_0x00cf
        L_0x00cb:
            int r2 = r0.B(r13, r2, r11, r12)
        L_0x00cf:
            android.widget.TextView r13 = r0.f474f
            boolean r13 = r0.N(r13)
            android.widget.TextView r14 = r0.f475g
            boolean r14 = r0.N(r14)
            if (r13 == 0) goto L_0x00f6
            android.widget.TextView r15 = r0.f474f
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f474f
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x00f9
        L_0x00f6:
            r23 = r7
            r3 = 0
        L_0x00f9:
            if (r14 == 0) goto L_0x0113
            android.widget.TextView r7 = r0.f475g
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f475g
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x0115
        L_0x0113:
            r16 = r4
        L_0x0115:
            if (r13 != 0) goto L_0x0121
            if (r14 == 0) goto L_0x011a
            goto L_0x0121
        L_0x011a:
            r18 = r6
            r22 = r12
        L_0x011e:
            r1 = 0
            goto L_0x028a
        L_0x0121:
            if (r13 == 0) goto L_0x0126
            android.widget.TextView r4 = r0.f474f
            goto L_0x0128
        L_0x0126:
            android.widget.TextView r4 = r0.f475g
        L_0x0128:
            if (r14 == 0) goto L_0x012d
            android.widget.TextView r7 = r0.f475g
            goto L_0x012f
        L_0x012d:
            android.widget.TextView r7 = r0.f474f
        L_0x012f:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.e) r7
            if (r13 == 0) goto L_0x0145
            android.widget.TextView r15 = r0.f474f
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x014f
        L_0x0145:
            if (r14 == 0) goto L_0x0152
            android.widget.TextView r15 = r0.f475g
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0152
        L_0x014f:
            r17 = 1
            goto L_0x0154
        L_0x0152:
            r17 = 0
        L_0x0154:
            int r15 = r0.A
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x019c
            r6 = 80
            if (r15 == r6) goto L_0x018e
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.v
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0177
            int r6 = r15 + r12
            goto L_0x018c
        L_0x0177:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.w
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x018c
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x018c:
            int r8 = r8 + r6
            goto L_0x01ab
        L_0x018e:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.w
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01ab
        L_0x019c:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.v
            int r8 = r2 + r3
        L_0x01ab:
            if (r1 == 0) goto L_0x021f
            if (r17 == 0) goto L_0x01b2
            int r1 = r0.t
            goto L_0x01b3
        L_0x01b2:
            r1 = 0
        L_0x01b3:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01ea
            android.widget.TextView r1 = r0.f474f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.f474f
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f474f
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f474f
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.u
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01eb
        L_0x01ea:
            r2 = r10
        L_0x01eb:
            if (r14 == 0) goto L_0x0213
            android.widget.TextView r1 = r0.f475g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f475g
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.f475g
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f475g
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.u
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L_0x0214
        L_0x0213:
            r3 = r10
        L_0x0214:
            if (r17 == 0) goto L_0x021b
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L_0x021b:
            r2 = r24
            goto L_0x011e
        L_0x021f:
            if (r17 == 0) goto L_0x0225
            int r7 = r0.t
            r1 = 0
            goto L_0x0227
        L_0x0225:
            r1 = 0
            r7 = 0
        L_0x0227:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x025c
            android.widget.TextView r3 = r0.f474f
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            android.widget.TextView r4 = r0.f474f
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f474f
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f474f
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.u
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x025d
        L_0x025c:
            r4 = r2
        L_0x025d:
            if (r14 == 0) goto L_0x0283
            android.widget.TextView r3 = r0.f475g
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            int r5 = r3.topMargin
            int r8 = r8 + r5
            android.widget.TextView r5 = r0.f475g
            int r5 = r5.getMeasuredWidth()
            int r5 = r5 + r2
            android.widget.TextView r6 = r0.f475g
            int r6 = r6.getMeasuredHeight()
            int r6 = r6 + r8
            android.widget.TextView r7 = r0.f475g
            r7.layout(r2, r8, r5, r6)
            int r6 = r0.u
            int r5 = r5 + r6
            int r3 = r3.bottomMargin
            goto L_0x0284
        L_0x0283:
            r5 = r2
        L_0x0284:
            if (r17 == 0) goto L_0x028a
            int r2 = java.lang.Math.max(r4, r5)
        L_0x028a:
            java.util.ArrayList<android.view.View> r3 = r0.H
            r4 = 3
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.H
            int r3 = r3.size()
            r7 = 0
        L_0x0297:
            if (r7 >= r3) goto L_0x02aa
            java.util.ArrayList<android.view.View> r4 = r0.H
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.B(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x0297
        L_0x02aa:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.H
            r4 = 5
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.H
            int r3 = r3.size()
            r7 = 0
        L_0x02b9:
            if (r7 >= r3) goto L_0x02ca
            java.util.ArrayList<android.view.View> r4 = r0.H
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.C(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02b9
        L_0x02ca:
            java.util.ArrayList<android.view.View> r3 = r0.H
            r4 = 1
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.H
            int r3 = r0.u(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02e5
            goto L_0x02ec
        L_0x02e5:
            if (r3 <= r10) goto L_0x02eb
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02ec
        L_0x02eb:
            r2 = r6
        L_0x02ec:
            java.util.ArrayList<android.view.View> r3 = r0.H
            int r3 = r3.size()
        L_0x02f2:
            if (r1 >= r3) goto L_0x0303
            java.util.ArrayList<android.view.View> r4 = r0.H
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.B(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02f2
        L_0x0303:
            java.util.ArrayList<android.view.View> r1 = r0.H
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.J;
        int i11 = 0;
        if (c1.b(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c3 = 0;
            c2 = 1;
        }
        if (N(this.f476h)) {
            E(this.f476h, i2, 0, i3, 0, this.f487s);
            i6 = this.f476h.getMeasuredWidth() + s(this.f476h);
            i5 = Math.max(0, this.f476h.getMeasuredHeight() + t(this.f476h));
            i4 = View.combineMeasuredStates(0, this.f476h.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (N(this.f480l)) {
            E(this.f480l, i2, 0, i3, 0, this.f487s);
            i6 = this.f480l.getMeasuredWidth() + s(this.f480l);
            i5 = Math.max(i5, this.f480l.getMeasuredHeight() + t(this.f480l));
            i4 = View.combineMeasuredStates(i4, this.f480l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i6);
        iArr[c3] = Math.max(0, currentContentInsetStart - i6);
        if (N(this.f473e)) {
            E(this.f473e, i2, max, i3, 0, this.f487s);
            i7 = this.f473e.getMeasuredWidth() + s(this.f473e);
            i5 = Math.max(i5, this.f473e.getMeasuredHeight() + t(this.f473e));
            i4 = View.combineMeasuredStates(i4, this.f473e.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i7);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i7);
        if (N(this.f481m)) {
            max2 += D(this.f481m, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.f481m.getMeasuredHeight() + t(this.f481m));
            i4 = View.combineMeasuredStates(i4, this.f481m.getMeasuredState());
        }
        if (N(this.f477i)) {
            max2 += D(this.f477i, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.f477i.getMeasuredHeight() + t(this.f477i));
            i4 = View.combineMeasuredStates(i4, this.f477i.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((e) childAt.getLayoutParams()).b == 0 && N(childAt)) {
                max2 += D(childAt, i2, max2, i3, 0, iArr);
                i5 = Math.max(i5, childAt.getMeasuredHeight() + t(childAt));
                i4 = View.combineMeasuredStates(i4, childAt.getMeasuredState());
            }
        }
        int i13 = this.v + this.w;
        int i14 = this.t + this.u;
        if (N(this.f474f)) {
            D(this.f474f, i2, max2 + i14, i3, i13, iArr);
            int measuredWidth = this.f474f.getMeasuredWidth() + s(this.f474f);
            i8 = this.f474f.getMeasuredHeight() + t(this.f474f);
            i10 = View.combineMeasuredStates(i4, this.f474f.getMeasuredState());
            i9 = measuredWidth;
        } else {
            i10 = i4;
            i9 = 0;
            i8 = 0;
        }
        if (N(this.f475g)) {
            int i15 = i8 + i13;
            i9 = Math.max(i9, D(this.f475g, i2, max2 + i14, i3, i15, iArr));
            i8 += this.f475g.getMeasuredHeight() + t(this.f475g);
            i10 = View.combineMeasuredStates(i10, this.f475g.getMeasuredState());
        } else {
            int i16 = i10;
        }
        int max3 = Math.max(i5, i8);
        int paddingLeft = max2 + i9 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (!M()) {
            i11 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f473e;
        androidx.appcompat.view.menu.g L2 = actionMenuView != null ? actionMenuView.L() : null;
        int i2 = gVar.f493g;
        if (!(i2 == 0 || this.O == null || L2 == null || (findItem = L2.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f494h) {
            F();
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i2);
        }
        h();
        o0 o0Var = this.x;
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        o0Var.f(z2);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        i iVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.O;
        if (!(dVar == null || (iVar = dVar.f491f) == null)) {
            gVar.f493g = iVar.getItemId();
        }
        gVar.f494h = A();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.F = false;
        }
        if (!this.F) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.F = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.F = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f480l;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(e.a.k.a.a.d(getContext(), i2));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f480l.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f480l;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f478j);
        }
    }

    public void setCollapsible(boolean z2) {
        this.R = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.z) {
            this.z = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.y) {
            this.y = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(e.a.k.a.a.d(getContext(), i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f477i)) {
                c(this.f477i, true);
            }
        } else {
            ImageView imageView = this.f477i;
            if (imageView != null && y(imageView)) {
                removeView(this.f477i);
                this.I.remove(this.f477i);
            }
        }
        ImageView imageView2 = this.f477i;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f477i;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f476h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(e.a.k.a.a.d(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.f476h)) {
                c(this.f476h, true);
            }
        } else {
            ImageButton imageButton = this.f476h;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f476h);
                this.I.remove(this.f476h);
            }
        }
        ImageButton imageButton2 = this.f476h;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f476h.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.K = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f473e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f483o != i2) {
            this.f483o = i2;
            if (i2 == 0) {
                this.f482n = getContext();
            } else {
                this.f482n = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f475g == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f475g = zVar;
                zVar.setSingleLine();
                this.f475g.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f485q;
                if (i2 != 0) {
                    this.f475g.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.f475g.setTextColor(colorStateList);
                }
            }
            if (!y(this.f475g)) {
                c(this.f475g, true);
            }
        } else {
            TextView textView = this.f475g;
            if (textView != null && y(textView)) {
                removeView(this.f475g);
                this.I.remove(this.f475g);
            }
        }
        TextView textView2 = this.f475g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        TextView textView = this.f475g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f474f == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f474f = zVar;
                zVar.setSingleLine();
                this.f474f.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f484p;
                if (i2 != 0) {
                    this.f474f.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    this.f474f.setTextColor(colorStateList);
                }
            }
            if (!y(this.f474f)) {
                c(this.f474f, true);
            }
        } else {
            TextView textView = this.f474f;
            if (textView != null && y(textView)) {
                removeView(this.f474f);
                this.I.remove(this.f474f);
            }
        }
        TextView textView2 = this.f474f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.B = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.w = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.u = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.t = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.v = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.D = colorStateList;
        TextView textView = this.f474f;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean v() {
        d dVar = this.O;
        return (dVar == null || dVar.f491f == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f473e;
        return actionMenuView != null && actionMenuView.F();
    }

    public void x(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f473e;
        return actionMenuView != null && actionMenuView.G();
    }
}
