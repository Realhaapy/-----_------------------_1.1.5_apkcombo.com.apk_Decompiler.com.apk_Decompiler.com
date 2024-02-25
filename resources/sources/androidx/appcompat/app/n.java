package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.p0;
import e.a.f;
import e.a.j;
import e.a.n.b;
import e.a.n.h;
import e.f.r.c0;
import e.f.r.e0;
import e.f.r.f0;
import e.f.r.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class n extends a implements ActionBarOverlayLayout.d {
    private static final Interpolator B = new AccelerateInterpolator();
    private static final Interpolator C = new DecelerateInterpolator();
    final f0 A = new c();
    Context a;
    private Context b;
    ActionBarOverlayLayout c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarContainer f221d;

    /* renamed from: e  reason: collision with root package name */
    d0 f222e;

    /* renamed from: f  reason: collision with root package name */
    ActionBarContextView f223f;

    /* renamed from: g  reason: collision with root package name */
    View f224g;

    /* renamed from: h  reason: collision with root package name */
    p0 f225h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f226i;

    /* renamed from: j  reason: collision with root package name */
    d f227j;

    /* renamed from: k  reason: collision with root package name */
    e.a.n.b f228k;

    /* renamed from: l  reason: collision with root package name */
    b.a f229l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f230m;

    /* renamed from: n  reason: collision with root package name */
    private ArrayList<a.b> f231n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    private boolean f232o;

    /* renamed from: p  reason: collision with root package name */
    private int f233p = 0;

    /* renamed from: q  reason: collision with root package name */
    boolean f234q = true;

    /* renamed from: r  reason: collision with root package name */
    boolean f235r;

    /* renamed from: s  reason: collision with root package name */
    boolean f236s;
    private boolean t;
    private boolean u = true;
    h v;
    private boolean w;
    boolean x;
    final e.f.r.d0 y = new a();
    final e.f.r.d0 z = new b();

    class a extends e0 {
        a() {
        }

        public void b(View view) {
            View view2;
            n nVar = n.this;
            if (nVar.f234q && (view2 = nVar.f224g) != null) {
                view2.setTranslationY(0.0f);
                n.this.f221d.setTranslationY(0.0f);
            }
            n.this.f221d.setVisibility(8);
            n.this.f221d.setTransitioning(false);
            n nVar2 = n.this;
            nVar2.v = null;
            nVar2.y();
            ActionBarOverlayLayout actionBarOverlayLayout = n.this.c;
            if (actionBarOverlayLayout != null) {
                y.P(actionBarOverlayLayout);
            }
        }
    }

    class b extends e0 {
        b() {
        }

        public void b(View view) {
            n nVar = n.this;
            nVar.v = null;
            nVar.f221d.requestLayout();
        }
    }

    class c implements f0 {
        c() {
        }

        public void a(View view) {
            ((View) n.this.f221d.getParent()).invalidate();
        }
    }

    public class d extends e.a.n.b implements g.a {

        /* renamed from: g  reason: collision with root package name */
        private final Context f237g;

        /* renamed from: h  reason: collision with root package name */
        private final g f238h;

        /* renamed from: i  reason: collision with root package name */
        private b.a f239i;

        /* renamed from: j  reason: collision with root package name */
        private WeakReference<View> f240j;

        public d(Context context, b.a aVar) {
            this.f237g = context;
            this.f239i = aVar;
            g gVar = new g(context);
            gVar.S(1);
            this.f238h = gVar;
            gVar.R(this);
        }

        public boolean a(g gVar, MenuItem menuItem) {
            b.a aVar = this.f239i;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        public void b(g gVar) {
            if (this.f239i != null) {
                k();
                n.this.f223f.l();
            }
        }

        public void c() {
            n nVar = n.this;
            if (nVar.f227j == this) {
                if (!n.x(nVar.f235r, nVar.f236s, false)) {
                    n nVar2 = n.this;
                    nVar2.f228k = this;
                    nVar2.f229l = this.f239i;
                } else {
                    this.f239i.b(this);
                }
                this.f239i = null;
                n.this.w(false);
                n.this.f223f.g();
                n.this.f222e.l().sendAccessibilityEvent(32);
                n nVar3 = n.this;
                nVar3.c.setHideOnContentScrollEnabled(nVar3.x);
                n.this.f227j = null;
            }
        }

        public View d() {
            WeakReference<View> weakReference = this.f240j;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.f238h;
        }

        public MenuInflater f() {
            return new e.a.n.g(this.f237g);
        }

        public CharSequence g() {
            return n.this.f223f.getSubtitle();
        }

        public CharSequence i() {
            return n.this.f223f.getTitle();
        }

        public void k() {
            if (n.this.f227j == this) {
                this.f238h.d0();
                try {
                    this.f239i.a(this, this.f238h);
                } finally {
                    this.f238h.c0();
                }
            }
        }

        public boolean l() {
            return n.this.f223f.j();
        }

        public void m(View view) {
            n.this.f223f.setCustomView(view);
            this.f240j = new WeakReference<>(view);
        }

        public void n(int i2) {
            o(n.this.a.getResources().getString(i2));
        }

        public void o(CharSequence charSequence) {
            n.this.f223f.setSubtitle(charSequence);
        }

        public void q(int i2) {
            r(n.this.a.getResources().getString(i2));
        }

        public void r(CharSequence charSequence) {
            n.this.f223f.setTitle(charSequence);
        }

        public void s(boolean z) {
            super.s(z);
            n.this.f223f.setTitleOptional(z);
        }

        public boolean t() {
            this.f238h.d0();
            try {
                return this.f239i.d(this, this.f238h);
            } finally {
                this.f238h.c0();
            }
        }
    }

    public n(Activity activity, boolean z2) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        E(decorView);
        if (!z2) {
            this.f224g = decorView.findViewById(16908290);
        }
    }

    public n(Dialog dialog) {
        new ArrayList();
        E(dialog.getWindow().getDecorView());
    }

    private d0 B(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void D() {
        if (this.t) {
            this.t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            N(false);
        }
    }

    private void E(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(f.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f222e = B(view.findViewById(f.action_bar));
        this.f223f = (ActionBarContextView) view.findViewById(f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(f.action_bar_container);
        this.f221d = actionBarContainer;
        d0 d0Var = this.f222e;
        if (d0Var == null || this.f223f == null || actionBarContainer == null) {
            throw new IllegalStateException(n.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = d0Var.getContext();
        boolean z2 = (this.f222e.p() & 4) != 0;
        if (z2) {
            this.f226i = true;
        }
        e.a.n.a b2 = e.a.n.a.b(this.a);
        K(b2.a() || z2);
        I(b2.g());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes((AttributeSet) null, j.a, e.a.a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(j.f3108k, false)) {
            J(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.f3106i, 0);
        if (dimensionPixelSize != 0) {
            H((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void I(boolean z2) {
        this.f232o = z2;
        if (!z2) {
            this.f222e.k((p0) null);
            this.f221d.setTabContainer(this.f225h);
        } else {
            this.f221d.setTabContainer((p0) null);
            this.f222e.k(this.f225h);
        }
        boolean z3 = true;
        boolean z4 = C() == 2;
        p0 p0Var = this.f225h;
        if (p0Var != null) {
            if (z4) {
                p0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    y.P(actionBarOverlayLayout);
                }
            } else {
                p0Var.setVisibility(8);
            }
        }
        this.f222e.w(!this.f232o && z4);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
        if (this.f232o || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z3);
    }

    private boolean L() {
        return y.D(this.f221d);
    }

    private void M() {
        if (!this.t) {
            this.t = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            N(false);
        }
    }

    private void N(boolean z2) {
        if (x(this.f235r, this.f236s, this.t)) {
            if (!this.u) {
                this.u = true;
                A(z2);
            }
        } else if (this.u) {
            this.u = false;
            z(z2);
        }
    }

    static boolean x(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return true;
        }
        return !z2 && !z3;
    }

    public void A(boolean z2) {
        View view;
        View view2;
        h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        this.f221d.setVisibility(0);
        if (this.f233p != 0 || (!this.w && !z2)) {
            this.f221d.setAlpha(1.0f);
            this.f221d.setTranslationY(0.0f);
            if (this.f234q && (view = this.f224g) != null) {
                view.setTranslationY(0.0f);
            }
            this.z.b((View) null);
        } else {
            this.f221d.setTranslationY(0.0f);
            float f2 = (float) (-this.f221d.getHeight());
            if (z2) {
                int[] iArr = {0, 0};
                this.f221d.getLocationInWindow(iArr);
                f2 -= (float) iArr[1];
            }
            this.f221d.setTranslationY(f2);
            h hVar2 = new h();
            c0 b2 = y.b(this.f221d);
            b2.l(0.0f);
            b2.j(this.A);
            hVar2.c(b2);
            if (this.f234q && (view2 = this.f224g) != null) {
                view2.setTranslationY(f2);
                c0 b3 = y.b(this.f224g);
                b3.l(0.0f);
                hVar2.c(b3);
            }
            hVar2.f(C);
            hVar2.e(250);
            hVar2.g(this.z);
            this.v = hVar2;
            hVar2.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            y.P(actionBarOverlayLayout);
        }
    }

    public int C() {
        return this.f222e.s();
    }

    public void F(boolean z2) {
        G(z2 ? 4 : 0, 4);
    }

    public void G(int i2, int i3) {
        int p2 = this.f222e.p();
        if ((i3 & 4) != 0) {
            this.f226i = true;
        }
        this.f222e.o((i2 & i3) | ((~i3) & p2));
    }

    public void H(float f2) {
        y.X(this.f221d, f2);
    }

    public void J(boolean z2) {
        if (!z2 || this.c.w()) {
            this.x = z2;
            this.c.setHideOnContentScrollEnabled(z2);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void K(boolean z2) {
        this.f222e.m(z2);
    }

    public void a() {
        if (this.f236s) {
            this.f236s = false;
            N(true);
        }
    }

    public void b() {
        h hVar = this.v;
        if (hVar != null) {
            hVar.a();
            this.v = null;
        }
    }

    public void c(int i2) {
        this.f233p = i2;
    }

    public void d() {
    }

    public void e(boolean z2) {
        this.f234q = z2;
    }

    public void f() {
        if (!this.f236s) {
            this.f236s = true;
            N(true);
        }
    }

    public boolean h() {
        d0 d0Var = this.f222e;
        if (d0Var == null || !d0Var.n()) {
            return false;
        }
        this.f222e.collapseActionView();
        return true;
    }

    public void i(boolean z2) {
        if (z2 != this.f230m) {
            this.f230m = z2;
            int size = this.f231n.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f231n.get(i2).a(z2);
            }
        }
    }

    public int j() {
        return this.f222e.p();
    }

    public Context k() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(e.a.a.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.b = new ContextThemeWrapper(this.a, i2);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    public void m(Configuration configuration) {
        I(e.a.n.a.b(this.a).g());
    }

    public boolean o(int i2, KeyEvent keyEvent) {
        Menu e2;
        d dVar = this.f227j;
        if (dVar == null || (e2 = dVar.e()) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        e2.setQwertyMode(z2);
        return e2.performShortcut(i2, keyEvent, 0);
    }

    public void r(boolean z2) {
        if (!this.f226i) {
            F(z2);
        }
    }

    public void s(boolean z2) {
        G(z2 ? 8 : 0, 8);
    }

    public void t(boolean z2) {
        h hVar;
        this.w = z2;
        if (!z2 && (hVar = this.v) != null) {
            hVar.a();
        }
    }

    public void u(CharSequence charSequence) {
        this.f222e.setWindowTitle(charSequence);
    }

    public e.a.n.b v(b.a aVar) {
        d dVar = this.f227j;
        if (dVar != null) {
            dVar.c();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f223f.k();
        d dVar2 = new d(this.f223f.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f227j = dVar2;
        dVar2.k();
        this.f223f.h(dVar2);
        w(true);
        this.f223f.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void w(boolean z2) {
        c0 c0Var;
        c0 c0Var2;
        if (z2) {
            M();
        } else {
            D();
        }
        if (L()) {
            if (z2) {
                c0Var = this.f222e.t(4, 100);
                c0Var2 = this.f223f.f(0, 200);
            } else {
                c0Var2 = this.f222e.t(0, 200);
                c0Var = this.f223f.f(8, 100);
            }
            h hVar = new h();
            hVar.d(c0Var, c0Var2);
            hVar.h();
        } else if (z2) {
            this.f222e.j(4);
            this.f223f.setVisibility(0);
        } else {
            this.f222e.j(0);
            this.f223f.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public void y() {
        b.a aVar = this.f229l;
        if (aVar != null) {
            aVar.b(this.f228k);
            this.f228k = null;
            this.f229l = null;
        }
    }

    public void z(boolean z2) {
        View view;
        h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f233p != 0 || (!this.w && !z2)) {
            this.y.b((View) null);
            return;
        }
        this.f221d.setAlpha(1.0f);
        this.f221d.setTransitioning(true);
        h hVar2 = new h();
        float f2 = (float) (-this.f221d.getHeight());
        if (z2) {
            int[] iArr = {0, 0};
            this.f221d.getLocationInWindow(iArr);
            f2 -= (float) iArr[1];
        }
        c0 b2 = y.b(this.f221d);
        b2.l(f2);
        b2.j(this.A);
        hVar2.c(b2);
        if (this.f234q && (view = this.f224g) != null) {
            c0 b3 = y.b(view);
            b3.l(f2);
            hVar2.c(b3);
        }
        hVar2.f(B);
        hVar2.e(250);
        hVar2.g(this.y);
        this.v = hVar2;
        hVar2.h();
    }
}
