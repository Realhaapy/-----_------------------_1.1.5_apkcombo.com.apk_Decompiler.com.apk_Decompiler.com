package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.m;
import e.a.g;

class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: e  reason: collision with root package name */
    private g f349e;

    /* renamed from: f  reason: collision with root package name */
    private b f350f;

    /* renamed from: g  reason: collision with root package name */
    e f351g;

    /* renamed from: h  reason: collision with root package name */
    private m.a f352h;

    public h(g gVar) {
        this.f349e = gVar;
    }

    public void a(g gVar, boolean z) {
        if (z || gVar == this.f349e) {
            c();
        }
        m.a aVar = this.f352h;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    public boolean b(g gVar) {
        m.a aVar = this.f352h;
        if (aVar != null) {
            return aVar.b(gVar);
        }
        return false;
    }

    public void c() {
        b bVar = this.f350f;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        g gVar = this.f349e;
        b.a aVar = new b.a(gVar.u());
        e eVar = new e(aVar.b(), g.abc_list_menu_item_layout);
        this.f351g = eVar;
        eVar.j(this);
        this.f349e.b(this.f351g);
        aVar.c(this.f351g.b(), this);
        View y = gVar.y();
        if (y != null) {
            aVar.d(y);
        } else {
            aVar.e(gVar.w());
            aVar.h(gVar.x());
        }
        aVar.f(this);
        b a = aVar.a();
        this.f350f = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f350f.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f350f.show();
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f349e.L((i) this.f351g.b().getItem(i2), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f351g.a(this.f349e, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f350f.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f350f.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f349e.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f349e.performShortcut(i2, keyEvent, 0);
    }
}
