package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.l0;
import e.a.g;
import e.f.r.h;
import e.f.r.y;
import java.util.ArrayList;
import java.util.List;

final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int F = g.abc_cascading_menu_item_layout;
    private boolean A;
    private m.a B;
    ViewTreeObserver C;
    private PopupWindow.OnDismissListener D;
    boolean E;

    /* renamed from: f  reason: collision with root package name */
    private final Context f295f;

    /* renamed from: g  reason: collision with root package name */
    private final int f296g;

    /* renamed from: h  reason: collision with root package name */
    private final int f297h;

    /* renamed from: i  reason: collision with root package name */
    private final int f298i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f299j;

    /* renamed from: k  reason: collision with root package name */
    final Handler f300k;

    /* renamed from: l  reason: collision with root package name */
    private final List<g> f301l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    final List<C0010d> f302m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f303n = new a();

    /* renamed from: o  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f304o = new b();

    /* renamed from: p  reason: collision with root package name */
    private final k0 f305p = new c();

    /* renamed from: q  reason: collision with root package name */
    private int f306q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f307r = 0;

    /* renamed from: s  reason: collision with root package name */
    private View f308s;
    View t;
    private int u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private boolean z;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (d.this.b() && d.this.f302m.size() > 0 && !d.this.f302m.get(0).a.w()) {
                View view = d.this.t;
                if (view == null || !view.isShown()) {
                    d.this.dismiss();
                    return;
                }
                for (C0010d dVar : d.this.f302m) {
                    dVar.a.show();
                }
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.C;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.C = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.C.removeGlobalOnLayoutListener(dVar.f303n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements k0 {

        class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C0010d f312e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ MenuItem f313f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ g f314g;

            a(C0010d dVar, MenuItem menuItem, g gVar) {
                this.f312e = dVar;
                this.f313f = menuItem;
                this.f314g = gVar;
            }

            public void run() {
                C0010d dVar = this.f312e;
                if (dVar != null) {
                    d.this.E = true;
                    dVar.b.e(false);
                    d.this.E = false;
                }
                if (this.f313f.isEnabled() && this.f313f.hasSubMenu()) {
                    this.f314g.L(this.f313f, 4);
                }
            }
        }

        c() {
        }

        public void c(g gVar, MenuItem menuItem) {
            C0010d dVar = null;
            d.this.f300k.removeCallbacksAndMessages((Object) null);
            int size = d.this.f302m.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (gVar == d.this.f302m.get(i2).b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                int i3 = i2 + 1;
                if (i3 < d.this.f302m.size()) {
                    dVar = d.this.f302m.get(i3);
                }
                d.this.f300k.postAtTime(new a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        public void d(g gVar, MenuItem menuItem) {
            d.this.f300k.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d  reason: collision with other inner class name */
    private static class C0010d {
        public final l0 a;
        public final g b;
        public final int c;

        public C0010d(l0 l0Var, g gVar, int i2) {
            this.a = l0Var;
            this.b = gVar;
            this.c = i2;
        }

        public ListView a() {
            return this.a.f();
        }
    }

    public d(Context context, View view, int i2, int i3, boolean z2) {
        this.f295f = context;
        this.f308s = view;
        this.f297h = i2;
        this.f298i = i3;
        this.f299j = z2;
        this.z = false;
        this.u = C();
        Resources resources = context.getResources();
        this.f296g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(e.a.d.abc_config_prefDialogWidth));
        this.f300k = new Handler();
    }

    private MenuItem A(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = gVar.getItem(i2);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View B(C0010d dVar, g gVar) {
        int i2;
        f fVar;
        int firstVisiblePosition;
        MenuItem A2 = A(dVar.b, gVar);
        if (A2 == null) {
            return null;
        }
        ListView a2 = dVar.a();
        ListAdapter adapter = a2.getAdapter();
        int i3 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i2 = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i2 = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i3 >= count) {
                i3 = -1;
                break;
            } else if (A2 == fVar.getItem(i3)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 != -1 && (firstVisiblePosition = (i3 + i2) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int C() {
        return y.s(this.f308s) == 1 ? 0 : 1;
    }

    private int D(int i2) {
        List<C0010d> list = this.f302m;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.t.getWindowVisibleDisplayFrame(rect);
        return this.u == 1 ? (iArr[0] + a2.getWidth()) + i2 > rect.right ? 0 : 1 : iArr[0] - i2 < 0 ? 1 : 0;
    }

    private void E(g gVar) {
        View view;
        C0010d dVar;
        int i2;
        int i3;
        int i4;
        LayoutInflater from = LayoutInflater.from(this.f295f);
        f fVar = new f(gVar, from, this.f299j, F);
        if (!b() && this.z) {
            fVar.d(true);
        } else if (b()) {
            fVar.d(k.w(gVar));
        }
        int n2 = k.n(fVar, (ViewGroup) null, this.f295f, this.f296g);
        l0 y2 = y();
        y2.o(fVar);
        y2.A(n2);
        y2.B(this.f307r);
        if (this.f302m.size() > 0) {
            List<C0010d> list = this.f302m;
            dVar = list.get(list.size() - 1);
            view = B(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            y2.P(false);
            y2.M((Object) null);
            int D2 = D(n2);
            boolean z2 = D2 == 1;
            this.u = D2;
            if (Build.VERSION.SDK_INT >= 26) {
                y2.y(view);
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.f308s.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f307r & 7) == 5) {
                    iArr[0] = iArr[0] + this.f308s.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.f307r & 5) != 5) {
                if (z2) {
                    n2 = view.getWidth();
                }
                i4 = i2 - n2;
                y2.k(i4);
                y2.H(true);
                y2.i(i3);
            } else if (!z2) {
                n2 = view.getWidth();
                i4 = i2 - n2;
                y2.k(i4);
                y2.H(true);
                y2.i(i3);
            }
            i4 = i2 + n2;
            y2.k(i4);
            y2.H(true);
            y2.i(i3);
        } else {
            if (this.v) {
                y2.k(this.x);
            }
            if (this.w) {
                y2.i(this.y);
            }
            y2.C(m());
        }
        this.f302m.add(new C0010d(y2, gVar, this.u));
        y2.show();
        ListView f2 = y2.f();
        f2.setOnKeyListener(this);
        if (dVar == null && this.A && gVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(g.abc_popup_menu_header_item_layout, f2, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.x());
            f2.addHeaderView(frameLayout, (Object) null, false);
            y2.show();
        }
    }

    private l0 y() {
        l0 l0Var = new l0(this.f295f, (AttributeSet) null, this.f297h, this.f298i);
        l0Var.O(this.f305p);
        l0Var.G(this);
        l0Var.F(this);
        l0Var.y(this.f308s);
        l0Var.B(this.f307r);
        l0Var.E(true);
        l0Var.D(2);
        return l0Var;
    }

    private int z(g gVar) {
        int size = this.f302m.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (gVar == this.f302m.get(i2).b) {
                return i2;
            }
        }
        return -1;
    }

    public void a(g gVar, boolean z2) {
        int z3 = z(gVar);
        if (z3 >= 0) {
            int i2 = z3 + 1;
            if (i2 < this.f302m.size()) {
                this.f302m.get(i2).b.e(false);
            }
            C0010d remove = this.f302m.remove(z3);
            remove.b.O(this);
            if (this.E) {
                remove.a.N((Object) null);
                remove.a.z(0);
            }
            remove.a.dismiss();
            int size = this.f302m.size();
            this.u = size > 0 ? this.f302m.get(size - 1).c : C();
            if (size == 0) {
                dismiss();
                m.a aVar = this.B;
                if (aVar != null) {
                    aVar.a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.C;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.C.removeGlobalOnLayoutListener(this.f303n);
                    }
                    this.C = null;
                }
                this.t.removeOnAttachStateChangeListener(this.f304o);
                this.D.onDismiss();
            } else if (z2) {
                this.f302m.get(0).b.e(false);
            }
        }
    }

    public boolean b() {
        return this.f302m.size() > 0 && this.f302m.get(0).a.b();
    }

    public boolean d(r rVar) {
        for (C0010d next : this.f302m) {
            if (rVar == next.b) {
                next.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        k(rVar);
        m.a aVar = this.B;
        if (aVar != null) {
            aVar.b(rVar);
        }
        return true;
    }

    public void dismiss() {
        int size = this.f302m.size();
        if (size > 0) {
            C0010d[] dVarArr = (C0010d[]) this.f302m.toArray(new C0010d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0010d dVar = dVarArr[i2];
                if (dVar.a.b()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    public void e(boolean z2) {
        for (C0010d a2 : this.f302m) {
            k.x(a2.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public ListView f() {
        if (this.f302m.isEmpty()) {
            return null;
        }
        List<C0010d> list = this.f302m;
        return list.get(list.size() - 1).a();
    }

    public boolean g() {
        return false;
    }

    public void j(m.a aVar) {
        this.B = aVar;
    }

    public void k(g gVar) {
        gVar.c(this, this.f295f);
        if (b()) {
            E(gVar);
        } else {
            this.f301l.add(gVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean l() {
        return false;
    }

    public void o(View view) {
        if (this.f308s != view) {
            this.f308s = view;
            this.f307r = h.a(this.f306q, y.s(view));
        }
    }

    public void onDismiss() {
        C0010d dVar;
        int size = this.f302m.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f302m.get(i2);
            if (!dVar.a.b()) {
                break;
            }
            i2++;
        }
        if (dVar != null) {
            dVar.b.e(false);
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void q(boolean z2) {
        this.z = z2;
    }

    public void r(int i2) {
        if (this.f306q != i2) {
            this.f306q = i2;
            this.f307r = h.a(i2, y.s(this.f308s));
        }
    }

    public void s(int i2) {
        this.v = true;
        this.x = i2;
    }

    public void show() {
        if (!b()) {
            for (g E2 : this.f301l) {
                E(E2);
            }
            this.f301l.clear();
            View view = this.f308s;
            this.t = view;
            if (view != null) {
                boolean z2 = this.C == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.C = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f303n);
                }
                this.t.addOnAttachStateChangeListener(this.f304o);
            }
        }
    }

    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    public void u(boolean z2) {
        this.A = z2;
    }

    public void v(int i2) {
        this.w = true;
        this.y = i2;
    }
}
