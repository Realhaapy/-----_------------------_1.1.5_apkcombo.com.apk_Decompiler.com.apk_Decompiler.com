package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import e.f.r.e;
import java.lang.reflect.Method;

public class j extends c implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    private final e.f.l.a.b f369d;

    /* renamed from: e  reason: collision with root package name */
    private Method f370e;

    private class a extends e.f.r.e {
        final ActionProvider b;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.b = actionProvider;
        }

        public boolean a() {
            return this.b.hasSubMenu();
        }

        public View c() {
            return this.b.onCreateActionView();
        }

        public boolean e() {
            return this.b.onPerformDefaultAction();
        }

        public void f(SubMenu subMenu) {
            this.b.onPrepareSubMenu(j.this.d(subMenu));
        }
    }

    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d  reason: collision with root package name */
        private e.b f371d;

        b(j jVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public boolean b() {
            return this.b.isVisible();
        }

        public View d(MenuItem menuItem) {
            return this.b.onCreateActionView(menuItem);
        }

        public boolean g() {
            return this.b.overridesItemVisibility();
        }

        public void j(e.b bVar) {
            this.f371d = bVar;
            this.b.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            e.b bVar = this.f371d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    static class c extends FrameLayout implements e.a.n.c {

        /* renamed from: e  reason: collision with root package name */
        final CollapsibleActionView f372e;

        c(View view) {
            super(view.getContext());
            this.f372e = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        public View a() {
            return (View) this.f372e;
        }

        public void c() {
            this.f372e.onActionViewExpanded();
        }

        public void d() {
            this.f372e.onActionViewCollapsed();
        }
    }

    private class d implements MenuItem.OnActionExpandListener {
        private final MenuItem.OnActionExpandListener a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.a.onMenuItemActionCollapse(j.this.c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.a.onMenuItemActionExpand(j.this.c(menuItem));
        }
    }

    private class e implements MenuItem.OnMenuItemClickListener {
        private final MenuItem.OnMenuItemClickListener a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.a.onMenuItemClick(j.this.c(menuItem));
        }
    }

    public j(Context context, e.f.l.a.b bVar) {
        super(context);
        if (bVar != null) {
            this.f369d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f369d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f369d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        e.f.r.e b2 = this.f369d.b();
        if (b2 instanceof a) {
            return ((a) b2).b;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f369d.getActionView();
        return actionView instanceof c ? ((c) actionView).a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f369d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f369d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f369d.getContentDescription();
    }

    public int getGroupId() {
        return this.f369d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f369d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f369d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f369d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f369d.getIntent();
    }

    public int getItemId() {
        return this.f369d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f369d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f369d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f369d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f369d.getOrder();
    }

    public SubMenu getSubMenu() {
        return d(this.f369d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f369d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f369d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f369d.getTooltipText();
    }

    public void h(boolean z) {
        try {
            if (this.f370e == null) {
                this.f370e = this.f369d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f370e.invoke(this.f369d, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    public boolean hasSubMenu() {
        return this.f369d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f369d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f369d.isCheckable();
    }

    public boolean isChecked() {
        return this.f369d.isChecked();
    }

    public boolean isEnabled() {
        return this.f369d.isEnabled();
    }

    public boolean isVisible() {
        return this.f369d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        e.f.r.e bVar = Build.VERSION.SDK_INT >= 16 ? new b(this, this.a, actionProvider) : new a(this.a, actionProvider);
        e.f.l.a.b bVar2 = this.f369d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    public MenuItem setActionView(int i2) {
        this.f369d.setActionView(i2);
        View actionView = this.f369d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f369d.setActionView((View) new c(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f369d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f369d.setAlphabeticShortcut(c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f369d.setAlphabeticShortcut(c2, i2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f369d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f369d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f369d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f369d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.f369d.setIcon(i2);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f369d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f369d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f369d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f369d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f369d.setNumericShortcut(c2);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f369d.setNumericShortcut(c2, i2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f369d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f369d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f369d.setShortcut(c2, c3);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f369d.setShortcut(c2, c3, i2, i3);
        return this;
    }

    public void setShowAsAction(int i2) {
        this.f369d.setShowAsAction(i2);
    }

    public MenuItem setShowAsActionFlags(int i2) {
        this.f369d.setShowAsActionFlags(i2);
        return this;
    }

    public MenuItem setTitle(int i2) {
        this.f369d.setTitle(i2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f369d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f369d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f369d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f369d.setVisible(z);
    }
}
