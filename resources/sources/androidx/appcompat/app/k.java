package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.x0;
import e.a.n.i;
import e.f.r.y;
import java.util.ArrayList;

class k extends a {
    d0 a;
    boolean b;
    Window.Callback c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f206d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f207e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<a.b> f208f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f209g = new a();

    /* renamed from: h  reason: collision with root package name */
    private final Toolbar.f f210h;

    class a implements Runnable {
        a() {
        }

        public void run() {
            k.this.y();
        }
    }

    class b implements Toolbar.f {
        b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return k.this.c.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements m.a {

        /* renamed from: e  reason: collision with root package name */
        private boolean f212e;

        c() {
        }

        public void a(g gVar, boolean z) {
            if (!this.f212e) {
                this.f212e = true;
                k.this.a.h();
                Window.Callback callback = k.this.c;
                if (callback != null) {
                    callback.onPanelClosed(108, gVar);
                }
                this.f212e = false;
            }
        }

        public boolean b(g gVar) {
            Window.Callback callback = k.this.c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }
    }

    private final class d implements g.a {
        d() {
        }

        public boolean a(g gVar, MenuItem menuItem) {
            return false;
        }

        public void b(g gVar) {
            k kVar = k.this;
            if (kVar.c == null) {
                return;
            }
            if (kVar.a.b()) {
                k.this.c.onPanelClosed(108, gVar);
            } else if (k.this.c.onPreparePanel(0, (View) null, gVar)) {
                k.this.c.onMenuOpened(108, gVar);
            }
        }
    }

    private class e extends i {
        public e(Window.Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i2) {
            return i2 == 0 ? new View(k.this.a.getContext()) : super.onCreatePanelView(i2);
        }

        public boolean onPreparePanel(int i2, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i2, view, menu);
            if (onPreparePanel) {
                k kVar = k.this;
                if (!kVar.b) {
                    kVar.a.c();
                    k.this.b = true;
                }
            }
            return onPreparePanel;
        }
    }

    k(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f210h = bVar;
        this.a = new x0(toolbar, false);
        e eVar = new e(callback);
        this.c = eVar;
        this.a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.a.setWindowTitle(charSequence);
    }

    private Menu w() {
        if (!this.f206d) {
            this.a.i(new c(), new d());
            this.f206d = true;
        }
        return this.a.q();
    }

    public boolean g() {
        return this.a.e();
    }

    public boolean h() {
        if (!this.a.n()) {
            return false;
        }
        this.a.collapseActionView();
        return true;
    }

    public void i(boolean z) {
        if (z != this.f207e) {
            this.f207e = z;
            int size = this.f208f.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f208f.get(i2).a(z);
            }
        }
    }

    public int j() {
        return this.a.p();
    }

    public Context k() {
        return this.a.getContext();
    }

    public boolean l() {
        this.a.l().removeCallbacks(this.f209g);
        y.N(this.a.l(), this.f209g);
        return true;
    }

    public void m(Configuration configuration) {
        super.m(configuration);
    }

    /* access modifiers changed from: package-private */
    public void n() {
        this.a.l().removeCallbacks(this.f209g);
    }

    public boolean o(int i2, KeyEvent keyEvent) {
        Menu w = w();
        if (w == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        w.setQwertyMode(z);
        return w.performShortcut(i2, keyEvent, 0);
    }

    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    public boolean q() {
        return this.a.f();
    }

    public void r(boolean z) {
    }

    public void s(boolean z) {
        z(z ? 8 : 0, 8);
    }

    public void t(boolean z) {
    }

    public void u(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    public Window.Callback x() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public void y() {
        Menu w = w();
        g gVar = w instanceof g ? (g) w : null;
        if (gVar != null) {
            gVar.d0();
        }
        try {
            w.clear();
            if (!this.c.onCreatePanelMenu(0, w) || !this.c.onPreparePanel(0, (View) null, w)) {
                w.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.c0();
            }
        }
    }

    public void z(int i2, int i3) {
        this.a.o((i2 & i3) | ((~i3) & this.a.p()));
    }
}
