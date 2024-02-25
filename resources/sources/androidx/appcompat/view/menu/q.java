package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.l0;
import e.a.d;
import e.a.g;
import e.f.r.y;

final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {
    private static final int z = g.abc_popup_menu_item_layout;

    /* renamed from: f  reason: collision with root package name */
    private final Context f385f;

    /* renamed from: g  reason: collision with root package name */
    private final g f386g;

    /* renamed from: h  reason: collision with root package name */
    private final f f387h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f388i;

    /* renamed from: j  reason: collision with root package name */
    private final int f389j;

    /* renamed from: k  reason: collision with root package name */
    private final int f390k;

    /* renamed from: l  reason: collision with root package name */
    private final int f391l;

    /* renamed from: m  reason: collision with root package name */
    final l0 f392m;

    /* renamed from: n  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f393n = new a();

    /* renamed from: o  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f394o = new b();

    /* renamed from: p  reason: collision with root package name */
    private PopupWindow.OnDismissListener f395p;

    /* renamed from: q  reason: collision with root package name */
    private View f396q;

    /* renamed from: r  reason: collision with root package name */
    View f397r;

    /* renamed from: s  reason: collision with root package name */
    private m.a f398s;
    ViewTreeObserver t;
    private boolean u;
    private boolean v;
    private int w;
    private int x = 0;
    private boolean y;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (q.this.b() && !q.this.f392m.w()) {
                View view = q.this.f397r;
                if (view == null || !view.isShown()) {
                    q.this.dismiss();
                } else {
                    q.this.f392m.show();
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
            ViewTreeObserver viewTreeObserver = q.this.t;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.t = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.t.removeGlobalOnLayoutListener(qVar.f393n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i2, int i3, boolean z2) {
        this.f385f = context;
        this.f386g = gVar;
        this.f388i = z2;
        this.f387h = new f(gVar, LayoutInflater.from(context), z2, z);
        this.f390k = i2;
        this.f391l = i3;
        Resources resources = context.getResources();
        this.f389j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
        this.f396q = view;
        this.f392m = new l0(context, (AttributeSet) null, i2, i3);
        gVar.c(this, context);
    }

    private boolean y() {
        View view;
        if (b()) {
            return true;
        }
        if (this.u || (view = this.f396q) == null) {
            return false;
        }
        this.f397r = view;
        this.f392m.F(this);
        this.f392m.G(this);
        this.f392m.E(true);
        View view2 = this.f397r;
        boolean z2 = this.t == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.t = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f393n);
        }
        view2.addOnAttachStateChangeListener(this.f394o);
        this.f392m.y(view2);
        this.f392m.B(this.x);
        if (!this.v) {
            this.w = k.n(this.f387h, (ViewGroup) null, this.f385f, this.f389j);
            this.v = true;
        }
        this.f392m.A(this.w);
        this.f392m.D(2);
        this.f392m.C(m());
        this.f392m.show();
        ListView f2 = this.f392m.f();
        f2.setOnKeyListener(this);
        if (this.y && this.f386g.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f385f).inflate(g.abc_popup_menu_header_item_layout, f2, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f386g.x());
            }
            frameLayout.setEnabled(false);
            f2.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f392m.o(this.f387h);
        this.f392m.show();
        return true;
    }

    public void a(g gVar, boolean z2) {
        if (gVar == this.f386g) {
            dismiss();
            m.a aVar = this.f398s;
            if (aVar != null) {
                aVar.a(gVar, z2);
            }
        }
    }

    public boolean b() {
        return !this.u && this.f392m.b();
    }

    public boolean d(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f385f, rVar, this.f397r, this.f388i, this.f390k, this.f391l);
            lVar.j(this.f398s);
            lVar.g(k.w(rVar));
            lVar.i(this.f395p);
            this.f395p = null;
            this.f386g.e(false);
            int a2 = this.f392m.a();
            int m2 = this.f392m.m();
            if ((Gravity.getAbsoluteGravity(this.x, y.s(this.f396q)) & 7) == 5) {
                a2 += this.f396q.getWidth();
            }
            if (lVar.n(a2, m2)) {
                m.a aVar = this.f398s;
                if (aVar == null) {
                    return true;
                }
                aVar.b(rVar);
                return true;
            }
        }
        return false;
    }

    public void dismiss() {
        if (b()) {
            this.f392m.dismiss();
        }
    }

    public void e(boolean z2) {
        this.v = false;
        f fVar = this.f387h;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    public ListView f() {
        return this.f392m.f();
    }

    public boolean g() {
        return false;
    }

    public void j(m.a aVar) {
        this.f398s = aVar;
    }

    public void k(g gVar) {
    }

    public void o(View view) {
        this.f396q = view;
    }

    public void onDismiss() {
        this.u = true;
        this.f386g.close();
        ViewTreeObserver viewTreeObserver = this.t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.t = this.f397r.getViewTreeObserver();
            }
            this.t.removeGlobalOnLayoutListener(this.f393n);
            this.t = null;
        }
        this.f397r.removeOnAttachStateChangeListener(this.f394o);
        PopupWindow.OnDismissListener onDismissListener = this.f395p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f387h.d(z2);
    }

    public void r(int i2) {
        this.x = i2;
    }

    public void s(int i2) {
        this.f392m.k(i2);
    }

    public void show() {
        if (!y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f395p = onDismissListener;
    }

    public void u(boolean z2) {
        this.y = z2;
    }

    public void v(int i2) {
        this.f392m.i(i2);
    }
}
