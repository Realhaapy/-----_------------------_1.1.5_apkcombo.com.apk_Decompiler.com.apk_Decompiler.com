package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import e.f.l.a.c;

class s extends o implements SubMenu {

    /* renamed from: e  reason: collision with root package name */
    private final c f401e;

    s(Context context, c cVar) {
        super(context, cVar);
        this.f401e = cVar;
    }

    public void clearHeader() {
        this.f401e.clearHeader();
    }

    public MenuItem getItem() {
        return c(this.f401e.getItem());
    }

    public SubMenu setHeaderIcon(int i2) {
        this.f401e.setHeaderIcon(i2);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f401e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i2) {
        this.f401e.setHeaderTitle(i2);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f401e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f401e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i2) {
        this.f401e.setIcon(i2);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f401e.setIcon(drawable);
        return this;
    }
}
