package e.a.n;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import e.a.n.b;
import java.lang.ref.WeakReference;

public class e extends b implements g.a {

    /* renamed from: g  reason: collision with root package name */
    private Context f3167g;

    /* renamed from: h  reason: collision with root package name */
    private ActionBarContextView f3168h;

    /* renamed from: i  reason: collision with root package name */
    private b.a f3169i;

    /* renamed from: j  reason: collision with root package name */
    private WeakReference<View> f3170j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3171k;

    /* renamed from: l  reason: collision with root package name */
    private g f3172l;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.f3167g = context;
        this.f3168h = actionBarContextView;
        this.f3169i = aVar;
        g gVar = new g(actionBarContextView.getContext());
        gVar.S(1);
        this.f3172l = gVar;
        gVar.R(this);
    }

    public boolean a(g gVar, MenuItem menuItem) {
        return this.f3169i.c(this, menuItem);
    }

    public void b(g gVar) {
        k();
        this.f3168h.l();
    }

    public void c() {
        if (!this.f3171k) {
            this.f3171k = true;
            this.f3168h.sendAccessibilityEvent(32);
            this.f3169i.b(this);
        }
    }

    public View d() {
        WeakReference<View> weakReference = this.f3170j;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public Menu e() {
        return this.f3172l;
    }

    public MenuInflater f() {
        return new g(this.f3168h.getContext());
    }

    public CharSequence g() {
        return this.f3168h.getSubtitle();
    }

    public CharSequence i() {
        return this.f3168h.getTitle();
    }

    public void k() {
        this.f3169i.a(this, this.f3172l);
    }

    public boolean l() {
        return this.f3168h.j();
    }

    public void m(View view) {
        this.f3168h.setCustomView(view);
        this.f3170j = view != null ? new WeakReference<>(view) : null;
    }

    public void n(int i2) {
        o(this.f3167g.getString(i2));
    }

    public void o(CharSequence charSequence) {
        this.f3168h.setSubtitle(charSequence);
    }

    public void q(int i2) {
        r(this.f3167g.getString(i2));
    }

    public void r(CharSequence charSequence) {
        this.f3168h.setTitle(charSequence);
    }

    public void s(boolean z) {
        super.s(z);
        this.f3168h.setTitleOptional(z);
    }
}
