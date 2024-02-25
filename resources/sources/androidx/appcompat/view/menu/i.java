package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import e.a.h;
import e.f.l.a.b;
import e.f.r.e;

public final class i implements b {
    private View A;
    private e B;
    private MenuItem.OnActionExpandListener C;
    private boolean D = false;
    private ContextMenu.ContextMenuInfo E;
    private final int a;
    private final int b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f353d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f354e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f355f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f356g;

    /* renamed from: h  reason: collision with root package name */
    private char f357h;

    /* renamed from: i  reason: collision with root package name */
    private int f358i = 4096;

    /* renamed from: j  reason: collision with root package name */
    private char f359j;

    /* renamed from: k  reason: collision with root package name */
    private int f360k = 4096;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f361l;

    /* renamed from: m  reason: collision with root package name */
    private int f362m = 0;

    /* renamed from: n  reason: collision with root package name */
    g f363n;

    /* renamed from: o  reason: collision with root package name */
    private r f364o;

    /* renamed from: p  reason: collision with root package name */
    private Runnable f365p;

    /* renamed from: q  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f366q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f367r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f368s;
    private ColorStateList t = null;
    private PorterDuff.Mode u = null;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;
    private int y = 16;
    private int z = 0;

    class a implements e.b {
        a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            i iVar = i.this;
            iVar.f363n.J(iVar);
        }
    }

    i(g gVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f363n = gVar;
        this.a = i3;
        this.b = i2;
        this.c = i4;
        this.f353d = i5;
        this.f354e = charSequence;
        this.z = i6;
    }

    private static void d(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.x && (this.v || this.w)) {
            drawable = androidx.core.graphics.drawable.a.p(drawable).mutate();
            if (this.v) {
                androidx.core.graphics.drawable.a.n(drawable, this.t);
            }
            if (this.w) {
                androidx.core.graphics.drawable.a.o(drawable, this.u);
            }
            this.x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f363n.H() && g() != 0;
    }

    public boolean B() {
        return (this.z & 4) == 4;
    }

    public b a(e eVar) {
        e eVar2 = this.B;
        if (eVar2 != null) {
            eVar2.h();
        }
        this.A = null;
        this.B = eVar;
        this.f363n.K(true);
        e eVar3 = this.B;
        if (eVar3 != null) {
            eVar3.j(new a());
        }
        return this;
    }

    public e b() {
        return this.B;
    }

    public void c() {
        this.f363n.I(this);
    }

    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f363n.f(this);
        }
        return false;
    }

    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f363n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f353d;
    }

    /* access modifiers changed from: package-private */
    public char g() {
        return this.f363n.G() ? this.f359j : this.f357h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        e eVar = this.B;
        if (eVar == null) {
            return null;
        }
        View d2 = eVar.d(this);
        this.A = d2;
        return d2;
    }

    public int getAlphabeticModifiers() {
        return this.f360k;
    }

    public char getAlphabeticShortcut() {
        return this.f359j;
    }

    public CharSequence getContentDescription() {
        return this.f367r;
    }

    public int getGroupId() {
        return this.b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f361l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f362m == 0) {
            return null;
        }
        Drawable d2 = e.a.k.a.a.d(this.f363n.u(), this.f362m);
        this.f362m = 0;
        this.f361l = d2;
        return e(d2);
    }

    public ColorStateList getIconTintList() {
        return this.t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    public Intent getIntent() {
        return this.f356g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    public int getNumericModifiers() {
        return this.f358i;
    }

    public char getNumericShortcut() {
        return this.f357h;
    }

    public int getOrder() {
        return this.c;
    }

    public SubMenu getSubMenu() {
        return this.f364o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f354e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f355f;
        if (charSequence == null) {
            charSequence = this.f354e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f368s;
    }

    /* access modifiers changed from: package-private */
    public String h() {
        int i2;
        char g2 = g();
        if (g2 == 0) {
            return "";
        }
        Resources resources = this.f363n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f363n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(h.abc_prepend_shortcut_label));
        }
        int i3 = this.f363n.G() ? this.f360k : this.f358i;
        d(sb, i3, 65536, resources.getString(h.abc_menu_meta_shortcut_label));
        d(sb, i3, 4096, resources.getString(h.abc_menu_ctrl_shortcut_label));
        d(sb, i3, 2, resources.getString(h.abc_menu_alt_shortcut_label));
        d(sb, i3, 1, resources.getString(h.abc_menu_shift_shortcut_label));
        d(sb, i3, 4, resources.getString(h.abc_menu_sym_shortcut_label));
        d(sb, i3, 8, resources.getString(h.abc_menu_function_shortcut_label));
        if (g2 == 8) {
            i2 = h.abc_menu_delete_shortcut_label;
        } else if (g2 == 10) {
            i2 = h.abc_menu_enter_shortcut_label;
        } else if (g2 != ' ') {
            sb.append(g2);
            return sb.toString();
        } else {
            i2 = h.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i2));
        return sb.toString();
    }

    public boolean hasSubMenu() {
        return this.f364o != null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence i(n.a aVar) {
        return (aVar == null || !aVar.a()) ? getTitle() : getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.D;
    }

    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    public boolean isVisible() {
        e eVar = this.B;
        return (eVar == null || !eVar.g()) ? (this.y & 8) == 0 : (this.y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        e eVar;
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null && (eVar = this.B) != null) {
            this.A = eVar.d(this);
        }
        return this.A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f366q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.f363n;
        if (gVar.h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f365p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f356g != null) {
            try {
                this.f363n.u().startActivity(this.f356g);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        e eVar = this.B;
        return eVar != null && eVar.e();
    }

    public boolean l() {
        return (this.y & 32) == 32;
    }

    public boolean m() {
        return (this.y & 4) != 0;
    }

    public boolean n() {
        return (this.z & 1) == 1;
    }

    public boolean o() {
        return (this.z & 2) == 2;
    }

    public b p(int i2) {
        Context u2 = this.f363n.u();
        q(LayoutInflater.from(u2).inflate(i2, new LinearLayout(u2), false));
        return this;
    }

    public b q(View view) {
        int i2;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i2 = this.a) > 0) {
            view.setId(i2);
        }
        this.f363n.I(this);
        return this;
    }

    public void r(boolean z2) {
        this.D = z2;
        this.f363n.K(false);
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z2) {
        int i2 = this.y;
        int i3 = (z2 ? 2 : 0) | (i2 & -3);
        this.y = i3;
        if (i2 != i3) {
            this.f363n.K(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
        p(i2);
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        q(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f359j == c2) {
            return this;
        }
        this.f359j = Character.toLowerCase(c2);
        this.f363n.K(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f359j == c2 && this.f360k == i2) {
            return this;
        }
        this.f359j = Character.toLowerCase(c2);
        this.f360k = KeyEvent.normalizeMetaState(i2);
        this.f363n.K(false);
        return this;
    }

    public MenuItem setCheckable(boolean z2) {
        int i2 = this.y;
        boolean z3 = z2 | (i2 & true);
        this.y = z3 ? 1 : 0;
        if (i2 != z3) {
            this.f363n.K(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z2) {
        if ((this.y & 4) != 0) {
            this.f363n.T(this);
        } else {
            s(z2);
        }
        return this;
    }

    public b setContentDescription(CharSequence charSequence) {
        this.f367r = charSequence;
        this.f363n.K(false);
        return this;
    }

    public MenuItem setEnabled(boolean z2) {
        this.y = z2 ? this.y | 16 : this.y & -17;
        this.f363n.K(false);
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.f361l = null;
        this.f362m = i2;
        this.x = true;
        this.f363n.K(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f362m = 0;
        this.f361l = drawable;
        this.x = true;
        this.f363n.K(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.x = true;
        this.f363n.K(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.u = mode;
        this.w = true;
        this.x = true;
        this.f363n.K(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f356g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        if (this.f357h == c2) {
            return this;
        }
        this.f357h = c2;
        this.f363n.K(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f357h == c2 && this.f358i == i2) {
            return this;
        }
        this.f357h = c2;
        this.f358i = KeyEvent.normalizeMetaState(i2);
        this.f363n.K(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f366q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f357h = c2;
        this.f359j = Character.toLowerCase(c3);
        this.f363n.K(false);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f357h = c2;
        this.f358i = KeyEvent.normalizeMetaState(i2);
        this.f359j = Character.toLowerCase(c3);
        this.f360k = KeyEvent.normalizeMetaState(i3);
        this.f363n.K(false);
        return this;
    }

    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.z = i2;
            this.f363n.I(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        w(i2);
        return this;
    }

    public MenuItem setTitle(int i2) {
        setTitle((CharSequence) this.f363n.u().getString(i2));
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f354e = charSequence;
        this.f363n.K(false);
        r rVar = this.f364o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f355f = charSequence;
        this.f363n.K(false);
        return this;
    }

    public b setTooltipText(CharSequence charSequence) {
        this.f368s = charSequence;
        this.f363n.K(false);
        return this;
    }

    public MenuItem setVisible(boolean z2) {
        if (y(z2)) {
            this.f363n.J(this);
        }
        return this;
    }

    public void t(boolean z2) {
        this.y = (z2 ? 4 : 0) | (this.y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f354e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z2) {
        this.y = z2 ? this.y | 32 : this.y & -33;
    }

    /* access modifiers changed from: package-private */
    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    public b w(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public void x(r rVar) {
        this.f364o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    public boolean y(boolean z2) {
        int i2 = this.y;
        int i3 = (z2 ? 0 : 8) | (i2 & -9);
        this.y = i3;
        return i2 != i3;
    }

    public boolean z() {
        return this.f363n.A();
    }
}
