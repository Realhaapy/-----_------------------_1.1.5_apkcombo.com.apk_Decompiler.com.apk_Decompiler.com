package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import e.e.g;
import e.f.l.a.b;

abstract class c {
    final Context a;
    private g<b, MenuItem> b;
    private g<e.f.l.a.c, SubMenu> c;

    c(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.b == null) {
            this.b = new g<>();
        }
        MenuItem menuItem2 = this.b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.a, bVar);
        this.b.put(bVar, jVar);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof e.f.l.a.c)) {
            return subMenu;
        }
        e.f.l.a.c cVar = (e.f.l.a.c) subMenu;
        if (this.c == null) {
            this.c = new g<>();
        }
        SubMenu subMenu2 = this.c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.a, cVar);
        this.c.put(cVar, sVar);
        return sVar;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        g<b, MenuItem> gVar = this.b;
        if (gVar != null) {
            gVar.clear();
        }
        g<e.f.l.a.c, SubMenu> gVar2 = this.c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(int i2) {
        if (this.b != null) {
            int i3 = 0;
            while (i3 < this.b.size()) {
                if (this.b.i(i3).getGroupId() == i2) {
                    this.b.k(i3);
                    i3--;
                }
                i3++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void g(int i2) {
        if (this.b != null) {
            for (int i3 = 0; i3 < this.b.size(); i3++) {
                if (this.b.i(i3).getItemId() == i2) {
                    this.b.k(i3);
                    return;
                }
            }
        }
    }
}
