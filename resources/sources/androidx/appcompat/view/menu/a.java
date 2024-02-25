package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import e.f.l.a.b;
import e.f.r.e;

public class a implements b {
    private final int a;
    private final int b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f271d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f272e;

    /* renamed from: f  reason: collision with root package name */
    private Intent f273f;

    /* renamed from: g  reason: collision with root package name */
    private char f274g;

    /* renamed from: h  reason: collision with root package name */
    private int f275h = 4096;

    /* renamed from: i  reason: collision with root package name */
    private char f276i;

    /* renamed from: j  reason: collision with root package name */
    private int f277j = 4096;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f278k;

    /* renamed from: l  reason: collision with root package name */
    private Context f279l;

    /* renamed from: m  reason: collision with root package name */
    private CharSequence f280m;

    /* renamed from: n  reason: collision with root package name */
    private CharSequence f281n;

    /* renamed from: o  reason: collision with root package name */
    private ColorStateList f282o = null;

    /* renamed from: p  reason: collision with root package name */
    private PorterDuff.Mode f283p = null;

    /* renamed from: q  reason: collision with root package name */
    private boolean f284q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f285r = false;

    /* renamed from: s  reason: collision with root package name */
    private int f286s = 16;

    public a(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f279l = context;
        this.a = i3;
        this.b = i2;
        this.c = i5;
        this.f271d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f278k;
        if (drawable == null) {
            return;
        }
        if (this.f284q || this.f285r) {
            Drawable p2 = androidx.core.graphics.drawable.a.p(drawable);
            this.f278k = p2;
            Drawable mutate = p2.mutate();
            this.f278k = mutate;
            if (this.f284q) {
                androidx.core.graphics.drawable.a.n(mutate, this.f282o);
            }
            if (this.f285r) {
                androidx.core.graphics.drawable.a.o(this.f278k, this.f283p);
            }
        }
    }

    public b a(e eVar) {
        throw new UnsupportedOperationException();
    }

    public e b() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    public b d(int i2) {
        throw new UnsupportedOperationException();
    }

    public b e(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    public b f(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f277j;
    }

    public char getAlphabeticShortcut() {
        return this.f276i;
    }

    public CharSequence getContentDescription() {
        return this.f280m;
    }

    public int getGroupId() {
        return this.b;
    }

    public Drawable getIcon() {
        return this.f278k;
    }

    public ColorStateList getIconTintList() {
        return this.f282o;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f283p;
    }

    public Intent getIntent() {
        return this.f273f;
    }

    public int getItemId() {
        return this.a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f275h;
    }

    public char getNumericShortcut() {
        return this.f274g;
    }

    public int getOrder() {
        return this.c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f271d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f272e;
        return charSequence != null ? charSequence : this.f271d;
    }

    public CharSequence getTooltipText() {
        return this.f281n;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f286s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f286s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f286s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f286s & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
        d(i2);
        throw null;
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        e(view);
        throw null;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f276i = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f276i = Character.toLowerCase(c2);
        this.f277j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f286s = z | (this.f286s & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f286s = (z ? 2 : 0) | (this.f286s & -3);
        return this;
    }

    public b setContentDescription(CharSequence charSequence) {
        this.f280m = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f286s = (z ? 16 : 0) | (this.f286s & -17);
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.f278k = e.f.j.a.f(this.f279l, i2);
        c();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f278k = drawable;
        c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f282o = colorStateList;
        this.f284q = true;
        c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f283p = mode;
        this.f285r = true;
        c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f273f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f274g = c2;
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f274g = c2;
        this.f275h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f274g = c2;
        this.f276i = Character.toLowerCase(c3);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f274g = c2;
        this.f275h = KeyEvent.normalizeMetaState(i2);
        this.f276i = Character.toLowerCase(c3);
        this.f277j = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    public void setShowAsAction(int i2) {
    }

    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        f(i2);
        return this;
    }

    public MenuItem setTitle(int i2) {
        this.f271d = this.f279l.getResources().getString(i2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f271d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f272e = charSequence;
        return this;
    }

    public b setTooltipText(CharSequence charSequence) {
        this.f281n = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i2 = 8;
        int i3 = this.f286s & 8;
        if (z) {
            i2 = 0;
        }
        this.f286s = i3 | i2;
        return this;
    }
}
