package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import e.a.e;
import e.a.f;
import e.a.h;
import e.a.j;
import e.f.r.c0;
import e.f.r.e0;
import e.f.r.y;

public class x0 implements d0 {
    Toolbar a;
    private int b;
    private View c;

    /* renamed from: d  reason: collision with root package name */
    private View f707d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f708e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f709f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f710g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f711h;

    /* renamed from: i  reason: collision with root package name */
    CharSequence f712i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f713j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f714k;

    /* renamed from: l  reason: collision with root package name */
    Window.Callback f715l;

    /* renamed from: m  reason: collision with root package name */
    boolean f716m;

    /* renamed from: n  reason: collision with root package name */
    private c f717n;

    /* renamed from: o  reason: collision with root package name */
    private int f718o;

    /* renamed from: p  reason: collision with root package name */
    private int f719p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f720q;

    class a implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final androidx.appcompat.view.menu.a f721e;

        a() {
            this.f721e = new androidx.appcompat.view.menu.a(x0.this.a.getContext(), 0, 16908332, 0, 0, x0.this.f712i);
        }

        public void onClick(View view) {
            x0 x0Var = x0.this;
            Window.Callback callback = x0Var.f715l;
            if (callback != null && x0Var.f716m) {
                callback.onMenuItemSelected(0, this.f721e);
            }
        }
    }

    class b extends e0 {
        private boolean a = false;
        final /* synthetic */ int b;

        b(int i2) {
            this.b = i2;
        }

        public void a(View view) {
            this.a = true;
        }

        public void b(View view) {
            if (!this.a) {
                x0.this.a.setVisibility(this.b);
            }
        }

        public void c(View view) {
            x0.this.a.setVisibility(0);
        }
    }

    public x0(Toolbar toolbar, boolean z) {
        this(toolbar, z, h.abc_action_bar_up_description, e.abc_ic_ab_back_material);
    }

    public x0(Toolbar toolbar, boolean z, int i2, int i3) {
        Drawable drawable;
        this.f718o = 0;
        this.f719p = 0;
        this.a = toolbar;
        this.f712i = toolbar.getTitle();
        this.f713j = toolbar.getSubtitle();
        this.f711h = this.f712i != null;
        this.f710g = toolbar.getNavigationIcon();
        w0 u = w0.u(toolbar.getContext(), (AttributeSet) null, j.a, e.a.a.actionBarStyle, 0);
        this.f720q = u.f(j.f3109l);
        if (z) {
            CharSequence o2 = u.o(j.f3115r);
            if (!TextUtils.isEmpty(o2)) {
                F(o2);
            }
            CharSequence o3 = u.o(j.f3113p);
            if (!TextUtils.isEmpty(o3)) {
                E(o3);
            }
            Drawable f2 = u.f(j.f3111n);
            if (f2 != null) {
                A(f2);
            }
            Drawable f3 = u.f(j.f3110m);
            if (f3 != null) {
                setIcon(f3);
            }
            if (this.f710g == null && (drawable = this.f720q) != null) {
                D(drawable);
            }
            o(u.j(j.f3105h, 0));
            int m2 = u.m(j.f3104g, 0);
            if (m2 != 0) {
                y(LayoutInflater.from(this.a.getContext()).inflate(m2, this.a, false));
                o(this.b | 16);
            }
            int l2 = u.l(j.f3107j, 0);
            if (l2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = l2;
                this.a.setLayoutParams(layoutParams);
            }
            int d2 = u.d(j.f3103f, -1);
            int d3 = u.d(j.f3102e, -1);
            if (d2 >= 0 || d3 >= 0) {
                this.a.H(Math.max(d2, 0), Math.max(d3, 0));
            }
            int m3 = u.m(j.f3116s, 0);
            if (m3 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.L(toolbar2.getContext(), m3);
            }
            int m4 = u.m(j.f3114q, 0);
            if (m4 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.K(toolbar3.getContext(), m4);
            }
            int m5 = u.m(j.f3112o, 0);
            if (m5 != 0) {
                this.a.setPopupTheme(m5);
            }
        } else {
            this.b = x();
        }
        u.v();
        z(i2);
        this.f714k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    private void G(CharSequence charSequence) {
        this.f712i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    private void H() {
        if ((this.b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f714k)) {
            this.a.setNavigationContentDescription(this.f719p);
        } else {
            this.a.setNavigationContentDescription(this.f714k);
        }
    }

    private void I() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.b & 4) != 0) {
            toolbar = this.a;
            drawable = this.f710g;
            if (drawable == null) {
                drawable = this.f720q;
            }
        } else {
            toolbar = this.a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void J() {
        Drawable drawable;
        int i2 = this.b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f709f) == null) {
            drawable = this.f708e;
        }
        this.a.setLogo(drawable);
    }

    private int x() {
        if (this.a.getNavigationIcon() == null) {
            return 11;
        }
        this.f720q = this.a.getNavigationIcon();
        return 15;
    }

    public void A(Drawable drawable) {
        this.f709f = drawable;
        J();
    }

    public void B(int i2) {
        C(i2 == 0 ? null : getContext().getString(i2));
    }

    public void C(CharSequence charSequence) {
        this.f714k = charSequence;
        H();
    }

    public void D(Drawable drawable) {
        this.f710g = drawable;
        I();
    }

    public void E(CharSequence charSequence) {
        this.f713j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    public void F(CharSequence charSequence) {
        this.f711h = true;
        G(charSequence);
    }

    public void a(Menu menu, m.a aVar) {
        if (this.f717n == null) {
            c cVar = new c(this.a.getContext());
            this.f717n = cVar;
            cVar.p(f.action_menu_presenter);
        }
        this.f717n.j(aVar);
        this.a.I((g) menu, this.f717n);
    }

    public boolean b() {
        return this.a.A();
    }

    public void c() {
        this.f716m = true;
    }

    public void collapseActionView() {
        this.a.e();
    }

    public boolean d() {
        return this.a.z();
    }

    public boolean e() {
        return this.a.w();
    }

    public boolean f() {
        return this.a.O();
    }

    public boolean g() {
        return this.a.d();
    }

    public Context getContext() {
        return this.a.getContext();
    }

    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    public void h() {
        this.a.f();
    }

    public void i(m.a aVar, g.a aVar2) {
        this.a.J(aVar, aVar2);
    }

    public void j(int i2) {
        this.a.setVisibility(i2);
    }

    public void k(p0 p0Var) {
        Toolbar toolbar;
        View view = this.c;
        if (view != null && view.getParent() == (toolbar = this.a)) {
            toolbar.removeView(this.c);
        }
        this.c = p0Var;
        if (p0Var != null && this.f718o == 2) {
            this.a.addView(p0Var, 0);
            Toolbar.e eVar = (Toolbar.e) this.c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.a = 8388691;
            p0Var.setAllowCollapse(true);
        }
    }

    public ViewGroup l() {
        return this.a;
    }

    public void m(boolean z) {
    }

    public boolean n() {
        return this.a.v();
    }

    public void o(int i2) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i3 = this.b ^ i2;
        this.b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i3 & 3) != 0) {
                J();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.setTitle(this.f712i);
                    toolbar = this.a;
                    charSequence = this.f713j;
                } else {
                    charSequence = null;
                    this.a.setTitle((CharSequence) null);
                    toolbar = this.a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) != 0 && (view = this.f707d) != null) {
                if ((i2 & 16) != 0) {
                    this.a.addView(view);
                } else {
                    this.a.removeView(view);
                }
            }
        }
    }

    public int p() {
        return this.b;
    }

    public Menu q() {
        return this.a.getMenu();
    }

    public void r(int i2) {
        A(i2 != 0 ? e.a.k.a.a.d(getContext(), i2) : null);
    }

    public int s() {
        return this.f718o;
    }

    public void setIcon(int i2) {
        setIcon(i2 != 0 ? e.a.k.a.a.d(getContext(), i2) : null);
    }

    public void setIcon(Drawable drawable) {
        this.f708e = drawable;
        J();
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f715l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f711h) {
            G(charSequence);
        }
    }

    public c0 t(int i2, long j2) {
        c0 b2 = y.b(this.a);
        b2.a(i2 == 0 ? 1.0f : 0.0f);
        b2.e(j2);
        b2.g(new b(i2));
        return b2;
    }

    public void u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void w(boolean z) {
        this.a.setCollapsible(z);
    }

    public void y(View view) {
        View view2 = this.f707d;
        if (!(view2 == null || (this.b & 16) == 0)) {
            this.a.removeView(view2);
        }
        this.f707d = view;
        if (view != null && (this.b & 16) != 0) {
            this.a.addView(view);
        }
    }

    public void z(int i2) {
        if (i2 != this.f719p) {
            this.f719p = i2;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                B(this.f719p);
            }
        }
    }
}
