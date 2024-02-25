package e.a.n;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import e.a.n.b;
import e.e.g;
import java.util.ArrayList;

public class f extends ActionMode {
    final Context a;
    final b b;

    public static class a implements b.a {
        final ActionMode.Callback a;
        final Context b;
        final ArrayList<f> c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        final g<Menu, Menu> f3173d = new g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f3173d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.b, (e.f.l.a.a) menu);
            this.f3173d.put(menu, oVar);
            return oVar;
        }

        public boolean a(b bVar, Menu menu) {
            return this.a.onPrepareActionMode(e(bVar), f(menu));
        }

        public void b(b bVar) {
            this.a.onDestroyActionMode(e(bVar));
        }

        public boolean c(b bVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(bVar), new j(this.b, (e.f.l.a.b) menuItem));
        }

        public boolean d(b bVar, Menu menu) {
            return this.a.onCreateActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = this.c.get(i2);
                if (fVar != null && fVar.b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.b, bVar);
            this.c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.a = context;
        this.b = bVar;
    }

    public void finish() {
        this.b.c();
    }

    public View getCustomView() {
        return this.b.d();
    }

    public Menu getMenu() {
        return new o(this.a, (e.f.l.a.a) this.b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    public CharSequence getSubtitle() {
        return this.b.g();
    }

    public Object getTag() {
        return this.b.h();
    }

    public CharSequence getTitle() {
        return this.b.i();
    }

    public boolean getTitleOptionalHint() {
        return this.b.j();
    }

    public void invalidate() {
        this.b.k();
    }

    public boolean isTitleOptional() {
        return this.b.l();
    }

    public void setCustomView(View view) {
        this.b.m(view);
    }

    public void setSubtitle(int i2) {
        this.b.n(i2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    public void setTag(Object obj) {
        this.b.p(obj);
    }

    public void setTitle(int i2) {
        this.b.q(i2);
    }

    public void setTitle(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.b.s(z);
    }
}
