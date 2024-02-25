package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b1;
import androidx.core.app.j;
import androidx.core.app.s;
import androidx.fragment.app.e;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.d;
import e.a.n.b;

public class c extends e implements d, s.a {

    /* renamed from: e  reason: collision with root package name */
    private e f151e;

    /* renamed from: f  reason: collision with root package name */
    private Resources f152f;

    class a implements SavedStateRegistry.b {
        a() {
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            c.this.e().u(bundle);
            return bundle;
        }
    }

    class b implements androidx.activity.d.b {
        b() {
        }

        public void a(Context context) {
            e e2 = c.this.e();
            e2.n();
            e2.q(c.this.getSavedStateRegistry().a("androidx:appcompat"));
        }
    }

    public c() {
        g();
    }

    private void g() {
        getSavedStateRegistry().d("androidx:appcompat", new a());
        addOnContextAvailableListener(new b());
    }

    private void initViewTreeOwners() {
        w.a(getWindow().getDecorView(), this);
        x.a(getWindow().getDecorView(), this);
        d.a(getWindow().getDecorView(), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m(android.view.KeyEvent r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x003e
            boolean r0 = r3.isCtrlPressed()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x003e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003e
            android.view.View r0 = r0.getDecorView()
            boolean r3 = r0.dispatchKeyShortcutEvent(r3)
            if (r3 == 0) goto L_0x003e
            r3 = 1
            return r3
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.c.m(android.view.KeyEvent):boolean");
    }

    public void a(e.a.n.b bVar) {
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        e().d(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(e().f(context));
    }

    public void b(e.a.n.b bVar) {
    }

    public Intent c() {
        return j.a(this);
    }

    public void closeOptionsMenu() {
        a f2 = f();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (f2 == null || !f2.g()) {
            super.closeOptionsMenu();
        }
    }

    public e.a.n.b d(b.a aVar) {
        return null;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a f2 = f();
        if (keyCode != 82 || f2 == null || !f2.p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public e e() {
        if (this.f151e == null) {
            this.f151e = e.g(this, this);
        }
        return this.f151e;
    }

    public a f() {
        return e().m();
    }

    public <T extends View> T findViewById(int i2) {
        return e().i(i2);
    }

    public MenuInflater getMenuInflater() {
        return e().l();
    }

    public Resources getResources() {
        if (this.f152f == null && b1.c()) {
            this.f152f = new b1(this, super.getResources());
        }
        Resources resources = this.f152f;
        return resources == null ? super.getResources() : resources;
    }

    public void h(s sVar) {
        sVar.i(this);
    }

    /* access modifiers changed from: protected */
    public void i(int i2) {
    }

    public void invalidateOptionsMenu() {
        e().o();
    }

    public void j(s sVar) {
    }

    @Deprecated
    public void k() {
    }

    public boolean l() {
        Intent c = c();
        if (c == null) {
            return false;
        }
        if (p(c)) {
            s k2 = s.k(this);
            h(k2);
            j(k2);
            k2.l();
            try {
                androidx.core.app.c.n(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            o(c);
            return true;
        }
    }

    public void n(Toolbar toolbar) {
        e().E(toolbar);
    }

    public void o(Intent intent) {
        j.e(this, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f152f != null) {
            this.f152f.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        e().p(configuration);
    }

    public void onContentChanged() {
        k();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        e().r();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (m(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        a f2 = f();
        if (menuItem.getItemId() != 16908332 || f2 == null || (f2.j() & 4) == 0) {
            return false;
        }
        return l();
    }

    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        e().s(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        e().t();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        e().v();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        e().w();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        e().G(charSequence);
    }

    public void openOptionsMenu() {
        a f2 = f();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (f2 == null || !f2.q()) {
            super.openOptionsMenu();
        }
    }

    public boolean p(Intent intent) {
        return j.f(this, intent);
    }

    public void setContentView(int i2) {
        initViewTreeOwners();
        e().B(i2);
    }

    public void setContentView(View view) {
        initViewTreeOwners();
        e().C(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        e().D(view, layoutParams);
    }

    public void setTheme(int i2) {
        super.setTheme(i2);
        e().F(i2);
    }

    public void supportInvalidateOptionsMenu() {
        e().o();
    }
}
