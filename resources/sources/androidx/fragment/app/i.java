package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.v;
import e.f.q.d;

public class i {
    private final k<?> a;

    private i(k<?> kVar) {
        this.a = kVar;
    }

    public static i b(k<?> kVar) {
        d.e(kVar, "callbacks == null");
        return new i(kVar);
    }

    public void a(Fragment fragment) {
        k<?> kVar = this.a;
        kVar.f1064h.k(kVar, kVar, fragment);
    }

    public void c() {
        this.a.f1064h.z();
    }

    public void d(Configuration configuration) {
        this.a.f1064h.B(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.a.f1064h.C(menuItem);
    }

    public void f() {
        this.a.f1064h.D();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.a.f1064h.E(menu, menuInflater);
    }

    public void h() {
        this.a.f1064h.F();
    }

    public void i() {
        this.a.f1064h.H();
    }

    public void j(boolean z) {
        this.a.f1064h.I(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.a.f1064h.K(menuItem);
    }

    public void l(Menu menu) {
        this.a.f1064h.L(menu);
    }

    public void m() {
        this.a.f1064h.N();
    }

    public void n(boolean z) {
        this.a.f1064h.O(z);
    }

    public boolean o(Menu menu) {
        return this.a.f1064h.P(menu);
    }

    public void p() {
        this.a.f1064h.R();
    }

    public void q() {
        this.a.f1064h.S();
    }

    public void r() {
        this.a.f1064h.U();
    }

    public boolean s() {
        return this.a.f1064h.b0(true);
    }

    public n t() {
        return this.a.f1064h;
    }

    public void u() {
        this.a.f1064h.T0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.f1064h.u0().onCreateView(view, str, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        k<?> kVar = this.a;
        if (kVar instanceof v) {
            kVar.f1064h.g1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public Parcelable x() {
        return this.a.f1064h.i1();
    }
}
