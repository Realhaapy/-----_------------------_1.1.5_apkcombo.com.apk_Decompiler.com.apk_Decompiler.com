package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import e.f.r.e;
import java.util.ArrayList;

class c extends androidx.appcompat.view.menu.b implements e.a {
    e A;
    a B;
    C0012c C;
    private b D;
    final f E = new f();
    int F;

    /* renamed from: m  reason: collision with root package name */
    d f525m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f526n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f527o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f528p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f529q;

    /* renamed from: r  reason: collision with root package name */
    private int f530r;

    /* renamed from: s  reason: collision with root package name */
    private int f531s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private final SparseBooleanArray z = new SparseBooleanArray();

    private class a extends l {
        public a(Context context, r rVar, View view) {
            super(context, rVar, view, false, e.a.a.actionOverflowMenuStyle);
            if (!((i) rVar.getItem()).l()) {
                View view2 = c.this.f525m;
                f(view2 == null ? (View) c.this.f294l : view2);
            }
            j(c.this.E);
        }

        /* access modifiers changed from: protected */
        public void e() {
            c cVar = c.this;
            cVar.B = null;
            cVar.F = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        public p a() {
            a aVar = c.this.B;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    private class C0012c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private e f533e;

        public C0012c(e eVar) {
            this.f533e = eVar;
        }

        public void run() {
            if (c.this.f289g != null) {
                c.this.f289g.d();
            }
            View view = (View) c.this.f294l;
            if (!(view == null || view.getWindowToken() == null || !this.f533e.m())) {
                c.this.A = this.f533e;
            }
            c.this.C = null;
        }
    }

    private class d extends AppCompatImageView implements ActionMenuView.a {

        class a extends h0 {
            a(View view, c cVar) {
                super(view);
            }

            public p b() {
                e eVar = c.this.A;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            public boolean c() {
                c.this.K();
                return true;
            }

            public boolean d() {
                c cVar = c.this;
                if (cVar.C != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, e.a.a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            y0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        public boolean b() {
            return false;
        }

        public boolean c() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.k(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    private class e extends l {
        public e(Context context, g gVar, View view, boolean z) {
            super(context, gVar, view, z, e.a.a.actionOverflowMenuStyle);
            h(8388613);
            j(c.this.E);
        }

        /* access modifiers changed from: protected */
        public void e() {
            if (c.this.f289g != null) {
                c.this.f289g.close();
            }
            c.this.A = null;
            super.e();
        }
    }

    private class f implements m.a {
        f() {
        }

        public void a(g gVar, boolean z) {
            if (gVar instanceof r) {
                gVar.D().e(false);
            }
            m.a m2 = c.this.m();
            if (m2 != null) {
                m2.a(gVar, z);
            }
        }

        public boolean b(g gVar) {
            if (gVar == c.this.f289g) {
                return false;
            }
            c.this.F = ((r) gVar).getItem().getItemId();
            m.a m2 = c.this.m();
            if (m2 != null) {
                return m2.b(gVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, e.a.g.abc_action_menu_layout, e.a.g.abc_action_menu_item_layout);
    }

    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f294l;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f525m;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f527o) {
            return this.f526n;
        }
        return null;
    }

    public boolean B() {
        n nVar;
        C0012c cVar = this.C;
        if (cVar == null || (nVar = this.f294l) == null) {
            e eVar = this.A;
            if (eVar == null) {
                return false;
            }
            eVar.b();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.C = null;
        return true;
    }

    public boolean C() {
        a aVar = this.B;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.C != null || E();
    }

    public boolean E() {
        e eVar = this.A;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.u) {
            this.t = e.a.n.a.b(this.f288f).d();
        }
        g gVar = this.f289g;
        if (gVar != null) {
            gVar.K(true);
        }
    }

    public void G(boolean z2) {
        this.x = z2;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f294l = actionMenuView;
        actionMenuView.b(this.f289g);
    }

    public void I(Drawable drawable) {
        d dVar = this.f525m;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f527o = true;
        this.f526n = drawable;
    }

    public void J(boolean z2) {
        this.f528p = z2;
        this.f529q = true;
    }

    public boolean K() {
        g gVar;
        if (!this.f528p || E() || (gVar = this.f289g) == null || this.f294l == null || this.C != null || gVar.z().isEmpty()) {
            return false;
        }
        C0012c cVar = new C0012c(new e(this.f288f, this.f289g, this.f525m, true));
        this.C = cVar;
        ((View) this.f294l).post(cVar);
        return true;
    }

    public void a(g gVar, boolean z2) {
        y();
        super.a(gVar, z2);
    }

    public void c(Context context, g gVar) {
        super.c(context, gVar);
        Resources resources = context.getResources();
        e.a.n.a b2 = e.a.n.a.b(context);
        if (!this.f529q) {
            this.f528p = b2.h();
        }
        if (!this.w) {
            this.f530r = b2.c();
        }
        if (!this.u) {
            this.t = b2.d();
        }
        int i2 = this.f530r;
        if (this.f528p) {
            if (this.f525m == null) {
                d dVar = new d(this.f287e);
                this.f525m = dVar;
                if (this.f527o) {
                    dVar.setImageDrawable(this.f526n);
                    this.f526n = null;
                    this.f527o = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f525m.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i2 -= this.f525m.getMeasuredWidth();
        } else {
            this.f525m = null;
        }
        this.f531s = i2;
        this.y = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public boolean d(r rVar) {
        boolean z2 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        r rVar2 = rVar;
        while (rVar2.e0() != this.f289g) {
            rVar2 = (r) rVar2.e0();
        }
        View z3 = z(rVar2.getItem());
        if (z3 == null) {
            return false;
        }
        rVar.getItem().getItemId();
        int size = rVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        a aVar = new a(this.f288f, rVar, z3);
        this.B = aVar;
        aVar.g(z2);
        this.B.k();
        super.d(rVar);
        return true;
    }

    public void e(boolean z2) {
        n nVar;
        super.e(z2);
        ((View) this.f294l).requestLayout();
        g gVar = this.f289g;
        boolean z3 = false;
        if (gVar != null) {
            ArrayList<i> s2 = gVar.s();
            int size = s2.size();
            for (int i2 = 0; i2 < size; i2++) {
                e.f.r.e b2 = s2.get(i2).b();
                if (b2 != null) {
                    b2.i(this);
                }
            }
        }
        g gVar2 = this.f289g;
        ArrayList<i> z4 = gVar2 != null ? gVar2.z() : null;
        if (this.f528p && z4 != null) {
            int size2 = z4.size();
            if (size2 == 1) {
                z3 = !z4.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        d dVar = this.f525m;
        if (z3) {
            if (dVar == null) {
                this.f525m = new d(this.f287e);
            }
            ViewGroup viewGroup = (ViewGroup) this.f525m.getParent();
            if (viewGroup != this.f294l) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f525m);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f294l;
                actionMenuView.addView(this.f525m, actionMenuView.D());
            }
        } else if (dVar != null && dVar.getParent() == (nVar = this.f294l)) {
            ((ViewGroup) nVar).removeView(this.f525m);
        }
        ((ActionMenuView) this.f294l).setOverflowReserved(this.f528p);
    }

    public void f(i iVar, n.a aVar) {
        aVar.d(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f294l);
        if (this.D == null) {
            this.D = new b();
        }
        actionMenuItemView.setPopupCallback(this.D);
    }

    public boolean g() {
        int i2;
        ArrayList<i> arrayList;
        int i3;
        int i4;
        int i5;
        c cVar = this;
        g gVar = cVar.f289g;
        View view = null;
        int i6 = 0;
        if (gVar != null) {
            arrayList = gVar.E();
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = 0;
        }
        int i7 = cVar.t;
        int i8 = cVar.f531s;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f294l;
        boolean z2 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i2; i11++) {
            i iVar = arrayList.get(i11);
            if (iVar.o()) {
                i9++;
            } else if (iVar.n()) {
                i10++;
            } else {
                z2 = true;
            }
            if (cVar.x && iVar.isActionViewExpanded()) {
                i7 = 0;
            }
        }
        if (cVar.f528p && (z2 || i10 + i9 > i7)) {
            i7--;
        }
        int i12 = i7 - i9;
        SparseBooleanArray sparseBooleanArray = cVar.z;
        sparseBooleanArray.clear();
        if (cVar.v) {
            int i13 = cVar.y;
            i3 = i8 / i13;
            i4 = i13 + ((i8 % i13) / i3);
        } else {
            i4 = 0;
            i3 = 0;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < i2) {
            i iVar2 = arrayList.get(i14);
            if (iVar2.o()) {
                View n2 = cVar.n(iVar2, view, viewGroup);
                if (cVar.v) {
                    i3 -= ActionMenuView.J(n2, i4, i3, makeMeasureSpec, i6);
                } else {
                    n2.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n2.getMeasuredWidth();
                i8 -= measuredWidth;
                if (i15 == 0) {
                    i15 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.u(true);
                i5 = i2;
            } else if (iVar2.n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i12 > 0 || z3) && i8 > 0 && (!cVar.v || i3 > 0);
                boolean z5 = z4;
                i5 = i2;
                if (z4) {
                    View n3 = cVar.n(iVar2, (View) null, viewGroup);
                    if (cVar.v) {
                        int J = ActionMenuView.J(n3, i4, i3, makeMeasureSpec, 0);
                        i3 -= J;
                        if (J == 0) {
                            z5 = false;
                        }
                    } else {
                        n3.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z6 = z5;
                    int measuredWidth2 = n3.getMeasuredWidth();
                    i8 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    z4 = z6 & (!cVar.v ? i8 + i15 > 0 : i8 >= 0);
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    int i16 = 0;
                    while (i16 < i14) {
                        i iVar3 = arrayList.get(i16);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.l()) {
                                i12++;
                            }
                            iVar3.u(false);
                        }
                        i16++;
                    }
                }
                if (z4) {
                    i12--;
                }
                iVar2.u(z4);
            } else {
                i5 = i2;
                iVar2.u(false);
                i14++;
                view = null;
                cVar = this;
                i2 = i5;
                i6 = 0;
            }
            i14++;
            view = null;
            cVar = this;
            i2 = i5;
            i6 = 0;
        }
        return true;
    }

    public boolean l(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.f525m) {
            return false;
        }
        return super.l(viewGroup, i2);
    }

    public View n(i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.j()) {
            actionView = super.n(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.m(layoutParams));
        }
        return actionView;
    }

    public n o(ViewGroup viewGroup) {
        n nVar = this.f294l;
        n o2 = super.o(viewGroup);
        if (nVar != o2) {
            ((ActionMenuView) o2).setPresenter(this);
        }
        return o2;
    }

    public boolean q(int i2, i iVar) {
        return iVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
