package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.g;

public class r extends g implements SubMenu {
    private g B;
    private i C;

    public r(Context context, g gVar, i iVar) {
        super(context);
        this.B = gVar;
        this.C = iVar;
    }

    public g D() {
        return this.B.D();
    }

    public boolean F() {
        return this.B.F();
    }

    public boolean G() {
        return this.B.G();
    }

    public boolean H() {
        return this.B.H();
    }

    public void R(g.a aVar) {
        this.B.R(aVar);
    }

    public Menu e0() {
        return this.B;
    }

    public boolean f(i iVar) {
        return this.B.f(iVar);
    }

    public MenuItem getItem() {
        return this.C;
    }

    /* access modifiers changed from: package-private */
    public boolean h(g gVar, MenuItem menuItem) {
        return super.h(gVar, menuItem) || this.B.h(gVar, menuItem);
    }

    public boolean k(i iVar) {
        return this.B.k(iVar);
    }

    public void setGroupDividerEnabled(boolean z) {
        this.B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(int i2) {
        super.U(i2);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.V(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i2) {
        super.X(i2);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.Y(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.Z(view);
        return this;
    }

    public SubMenu setIcon(int i2) {
        this.C.setIcon(i2);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.B.setQwertyMode(z);
    }

    public String t() {
        i iVar = this.C;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.t() + ":" + itemId;
    }
}
