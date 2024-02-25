package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import e.f.l.a.a;

public class o extends c implements Menu {

    /* renamed from: d  reason: collision with root package name */
    private final a f384d;

    public o(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f384d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(int i2) {
        return c(this.f384d.add(i2));
    }

    public MenuItem add(int i2, int i3, int i4, int i5) {
        return c(this.f384d.add(i2, i3, i4, i5));
    }

    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return c(this.f384d.add(i2, i3, i4, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return c(this.f384d.add(charSequence));
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f384d.addIntentOptions(i2, i3, i4, componentName, intentArr, intent, i5, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i6 = 0; i6 < length; i6++) {
                menuItemArr2[i6] = c(menuItemArr3[i6]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i2) {
        return d(this.f384d.addSubMenu(i2));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return d(this.f384d.addSubMenu(i2, i3, i4, i5));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        return d(this.f384d.addSubMenu(i2, i3, i4, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f384d.addSubMenu(charSequence));
    }

    public void clear() {
        e();
        this.f384d.clear();
    }

    public void close() {
        this.f384d.close();
    }

    public MenuItem findItem(int i2) {
        return c(this.f384d.findItem(i2));
    }

    public MenuItem getItem(int i2) {
        return c(this.f384d.getItem(i2));
    }

    public boolean hasVisibleItems() {
        return this.f384d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return this.f384d.isShortcutKey(i2, keyEvent);
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return this.f384d.performIdentifierAction(i2, i3);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        return this.f384d.performShortcut(i2, keyEvent, i3);
    }

    public void removeGroup(int i2) {
        f(i2);
        this.f384d.removeGroup(i2);
    }

    public void removeItem(int i2) {
        g(i2);
        this.f384d.removeItem(i2);
    }

    public void setGroupCheckable(int i2, boolean z, boolean z2) {
        this.f384d.setGroupCheckable(i2, z, z2);
    }

    public void setGroupEnabled(int i2, boolean z) {
        this.f384d.setGroupEnabled(i2, z);
    }

    public void setGroupVisible(int i2, boolean z) {
        this.f384d.setGroupVisible(i2, z);
    }

    public void setQwertyMode(boolean z) {
        this.f384d.setQwertyMode(z);
    }

    public int size() {
        return this.f384d.size();
    }
}
