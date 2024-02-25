package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import e.f.r.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class g implements e.f.l.a.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};
    private final Context a;
    private final Resources b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f333d;

    /* renamed from: e  reason: collision with root package name */
    private a f334e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<i> f335f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<i> f336g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f337h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<i> f338i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<i> f339j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f340k;

    /* renamed from: l  reason: collision with root package name */
    private int f341l = 0;

    /* renamed from: m  reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f342m;

    /* renamed from: n  reason: collision with root package name */
    CharSequence f343n;

    /* renamed from: o  reason: collision with root package name */
    Drawable f344o;

    /* renamed from: p  reason: collision with root package name */
    View f345p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f346q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f347r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f348s = false;
    private boolean t = false;
    private boolean u = false;
    private ArrayList<i> v = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<m>> w = new CopyOnWriteArrayList<>();
    private i x;
    private boolean y = false;
    private boolean z;

    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    public interface b {
        boolean a(i iVar);
    }

    public g(Context context) {
        this.a = context;
        this.b = context.getResources();
        this.f335f = new ArrayList<>();
        this.f336g = new ArrayList<>();
        this.f337h = true;
        this.f338i = new ArrayList<>();
        this.f339j = new ArrayList<>();
        this.f340k = true;
        b0(true);
    }

    private static int B(int i2) {
        int i3 = (-65536 & i2) >> 16;
        if (i3 >= 0) {
            int[] iArr = A;
            if (i3 < iArr.length) {
                return (i2 & 65535) | (iArr[i3] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i2, boolean z2) {
        if (i2 >= 0 && i2 < this.f335f.size()) {
            this.f335f.remove(i2);
            if (z2) {
                K(true);
            }
        }
    }

    private void W(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources C = C();
        if (view != null) {
            this.f345p = view;
            this.f343n = null;
            this.f344o = null;
        } else {
            if (i2 > 0) {
                this.f343n = C.getText(i2);
            } else if (charSequence != null) {
                this.f343n = charSequence;
            }
            if (i3 > 0) {
                this.f344o = e.f.j.a.f(u(), i3);
            } else if (drawable != null) {
                this.f344o = drawable;
            }
            this.f345p = null;
        }
        K(false);
    }

    private void b0(boolean z2) {
        boolean z3 = true;
        if (!z2 || this.b.getConfiguration().keyboard == 1 || !z.b(ViewConfiguration.get(this.a), this.a)) {
            z3 = false;
        }
        this.f333d = z3;
    }

    private i g(int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        return new i(this, i2, i3, i4, i5, charSequence, i6);
    }

    private void i(boolean z2) {
        if (!this.w.isEmpty()) {
            d0();
            Iterator<WeakReference<m>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.w.remove(next);
                } else {
                    mVar.e(z2);
                }
            }
            c0();
        }
    }

    private boolean j(r rVar, m mVar) {
        boolean z2 = false;
        if (this.w.isEmpty()) {
            return false;
        }
        if (mVar != null) {
            z2 = mVar.d(rVar);
        }
        Iterator<WeakReference<m>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            m mVar2 = (m) next.get();
            if (mVar2 == null) {
                this.w.remove(next);
            } else if (!z2) {
                z2 = mVar2.d(rVar);
            }
        }
        return z2;
    }

    private static int n(ArrayList<i> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public Resources C() {
        return this.b;
    }

    public g D() {
        return this;
    }

    public ArrayList<i> E() {
        if (!this.f337h) {
            return this.f336g;
        }
        this.f336g.clear();
        int size = this.f335f.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f335f.get(i2);
            if (iVar.isVisible()) {
                this.f336g.add(iVar);
            }
        }
        this.f337h = false;
        this.f340k = true;
        return this.f336g;
    }

    public boolean F() {
        return this.y;
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        return this.c;
    }

    public boolean H() {
        return this.f333d;
    }

    /* access modifiers changed from: package-private */
    public void I(i iVar) {
        this.f340k = true;
        K(true);
    }

    /* access modifiers changed from: package-private */
    public void J(i iVar) {
        this.f337h = true;
        K(true);
    }

    public void K(boolean z2) {
        if (!this.f346q) {
            if (z2) {
                this.f337h = true;
                this.f340k = true;
            }
            i(z2);
            return;
        }
        this.f347r = true;
        if (z2) {
            this.f348s = true;
        }
    }

    public boolean L(MenuItem menuItem, int i2) {
        return M(menuItem, (m) null, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean M(android.view.MenuItem r7, androidx.appcompat.view.menu.m r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.i r7 = (androidx.appcompat.view.menu.i) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.k()
            e.f.r.e r2 = r7.b()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.a()
            if (r4 == 0) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            boolean r5 = r7.j()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.e(r3)
            goto L_0x006b
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x006b
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.e(r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            androidx.appcompat.view.menu.r r9 = new androidx.appcompat.view.menu.r
            android.content.Context r0 = r6.u()
            r9.<init>(r0, r6, r7)
            r7.x(r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.r r7 = (androidx.appcompat.view.menu.r) r7
            if (r4 == 0) goto L_0x0063
            r2.f(r7)
        L_0x0063:
            boolean r7 = r6.j(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.g.M(android.view.MenuItem, androidx.appcompat.view.menu.m, int):boolean");
    }

    public void O(m mVar) {
        Iterator<WeakReference<m>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            m mVar2 = (m) next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.w.remove(next);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(t());
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((r) item.getSubMenu()).P(bundle);
                }
            }
            int i3 = bundle.getInt("android:menu:expandedactionview");
            if (i3 > 0 && (findItem = findItem(i3)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f334e = aVar;
    }

    public g S(int i2) {
        this.f341l = i2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f335f.size();
        d0();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f335f.get(i2);
            if (iVar.getGroupId() == groupId && iVar.m() && iVar.isCheckable()) {
                iVar.s(iVar == menuItem);
            }
        }
        c0();
    }

    /* access modifiers changed from: protected */
    public g U(int i2) {
        W(0, (CharSequence) null, i2, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public g V(Drawable drawable) {
        W(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public g X(int i2) {
        W(i2, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public g Y(CharSequence charSequence) {
        W(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public g Z(View view) {
        W(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int B = B(i4);
        i g2 = g(i2, i3, i4, B, charSequence, this.f341l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f342m;
        if (contextMenuInfo != null) {
            g2.v(contextMenuInfo);
        }
        ArrayList<i> arrayList = this.f335f;
        arrayList.add(n(arrayList, B), g2);
        K(true);
        return g2;
    }

    public void a0(boolean z2) {
        this.z = z2;
    }

    public MenuItem add(int i2) {
        return a(0, 0, 0, this.b.getString(i2));
    }

    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.b.getString(i5));
    }

    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, (CharSequence) this.b.getString(i2));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, (CharSequence) this.b.getString(i5));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        i iVar = (i) a(i2, i3, i4, charSequence);
        r rVar = new r(this.a, this, iVar);
        iVar.x(rVar);
        return rVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(m mVar) {
        c(mVar, this.a);
    }

    public void c(m mVar, Context context) {
        this.w.add(new WeakReference(mVar));
        mVar.c(context, this);
        this.f340k = true;
    }

    public void c0() {
        this.f346q = false;
        if (this.f347r) {
            this.f347r = false;
            K(this.f348s);
        }
    }

    public void clear() {
        i iVar = this.x;
        if (iVar != null) {
            f(iVar);
        }
        this.f335f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f344o = null;
        this.f343n = null;
        this.f345p = null;
        K(false);
    }

    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f334e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (!this.f346q) {
            this.f346q = true;
            this.f347r = false;
            this.f348s = false;
        }
    }

    public final void e(boolean z2) {
        if (!this.u) {
            this.u = true;
            Iterator<WeakReference<m>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.w.remove(next);
                } else {
                    mVar.a(this, z2);
                }
            }
            this.u = false;
        }
    }

    public boolean f(i iVar) {
        boolean z2 = false;
        if (!this.w.isEmpty() && this.x == iVar) {
            d0();
            Iterator<WeakReference<m>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.w.remove(next);
                } else {
                    z2 = mVar.h(this, iVar);
                    if (z2) {
                        break;
                    }
                }
            }
            c0();
            if (z2) {
                this.x = null;
            }
        }
        return z2;
    }

    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f335f.get(i3);
            if (iVar.getItemId() == i2) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.getSubMenu().findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public MenuItem getItem(int i2) {
        return this.f335f.get(i2);
    }

    /* access modifiers changed from: package-private */
    public boolean h(g gVar, MenuItem menuItem) {
        a aVar = this.f334e;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    public boolean hasVisibleItems() {
        if (this.z) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f335f.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return p(i2, keyEvent) != null;
    }

    public boolean k(i iVar) {
        boolean z2 = false;
        if (this.w.isEmpty()) {
            return false;
        }
        d0();
        Iterator<WeakReference<m>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            m mVar = (m) next.get();
            if (mVar == null) {
                this.w.remove(next);
            } else {
                z2 = mVar.i(this, iVar);
                if (z2) {
                    break;
                }
            }
        }
        c0();
        if (z2) {
            this.x = iVar;
        }
        return z2;
    }

    public int l(int i2) {
        return m(i2, 0);
    }

    public int m(int i2, int i3) {
        int size = size();
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < size) {
            if (this.f335f.get(i3).getGroupId() == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public int o(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f335f.get(i3).getItemId() == i2) {
                return i3;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public i p(int i2, KeyEvent keyEvent) {
        ArrayList<i> arrayList = this.v;
        arrayList.clear();
        q(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean G = G();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = arrayList.get(i3);
            char alphabeticShortcut = G ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (G && alphabeticShortcut == 8 && i2 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return L(findItem(i2), i3);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        i p2 = p(i2, keyEvent);
        boolean L = p2 != null ? L(p2, i3) : false;
        if ((i3 & 2) != 0) {
            e(true);
        }
        return L;
    }

    /* access modifiers changed from: package-private */
    public void q(List<i> list, int i2, KeyEvent keyEvent) {
        boolean G = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f335f.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar = this.f335f.get(i3);
                if (iVar.hasSubMenu()) {
                    ((g) iVar.getSubMenu()).q(list, i2, keyEvent);
                }
                char alphabeticShortcut = G ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((G ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == 8 && i2 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<i> E = E();
        if (this.f340k) {
            Iterator<WeakReference<m>> it = this.w.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.w.remove(next);
                } else {
                    z2 |= mVar.g();
                }
            }
            if (z2) {
                this.f338i.clear();
                this.f339j.clear();
                int size = E.size();
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar = E.get(i2);
                    (iVar.l() ? this.f338i : this.f339j).add(iVar);
                }
            } else {
                this.f338i.clear();
                this.f339j.clear();
                this.f339j.addAll(E());
            }
            this.f340k = false;
        }
    }

    public void removeGroup(int i2) {
        int l2 = l(i2);
        if (l2 >= 0) {
            int size = this.f335f.size() - l2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size || this.f335f.get(l2).getGroupId() != i2) {
                    K(true);
                } else {
                    N(l2, false);
                    i3 = i4;
                }
            }
            K(true);
        }
    }

    public void removeItem(int i2) {
        N(o(i2), true);
    }

    public ArrayList<i> s() {
        r();
        return this.f338i;
    }

    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int size = this.f335f.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f335f.get(i3);
            if (iVar.getGroupId() == i2) {
                iVar.t(z3);
                iVar.setCheckable(z2);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.y = z2;
    }

    public void setGroupEnabled(int i2, boolean z2) {
        int size = this.f335f.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f335f.get(i3);
            if (iVar.getGroupId() == i2) {
                iVar.setEnabled(z2);
            }
        }
    }

    public void setGroupVisible(int i2, boolean z2) {
        int size = this.f335f.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f335f.get(i3);
            if (iVar.getGroupId() == i2 && iVar.y(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            K(true);
        }
    }

    public void setQwertyMode(boolean z2) {
        this.c = z2;
        K(false);
    }

    public int size() {
        return this.f335f.size();
    }

    /* access modifiers changed from: protected */
    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.a;
    }

    public i v() {
        return this.x;
    }

    public Drawable w() {
        return this.f344o;
    }

    public CharSequence x() {
        return this.f343n;
    }

    public View y() {
        return this.f345p;
    }

    public ArrayList<i> z() {
        r();
        return this.f339j;
    }
}
