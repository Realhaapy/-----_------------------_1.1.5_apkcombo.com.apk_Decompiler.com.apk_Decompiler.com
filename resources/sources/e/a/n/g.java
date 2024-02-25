package e.a.n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.w0;
import e.f.r.e;
import e.f.r.l;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class<?>[] f3174e;

    /* renamed from: f  reason: collision with root package name */
    static final Class<?>[] f3175f;
    final Object[] a;
    final Object[] b;
    Context c;

    /* renamed from: d  reason: collision with root package name */
    private Object f3176d;

    private static class a implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] c = {MenuItem.class};
        private Object a;
        private Method b;

        public a(Object obj, String str) {
            this.a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, c);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.b.invoke(this.a, new Object[]{menuItem})).booleanValue();
                }
                this.b.invoke(this.a, new Object[]{menuItem});
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    private class b {
        e A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;
        private Menu a;
        private int b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private int f3177d;

        /* renamed from: e  reason: collision with root package name */
        private int f3178e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f3179f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f3180g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f3181h;

        /* renamed from: i  reason: collision with root package name */
        private int f3182i;

        /* renamed from: j  reason: collision with root package name */
        private int f3183j;

        /* renamed from: k  reason: collision with root package name */
        private CharSequence f3184k;

        /* renamed from: l  reason: collision with root package name */
        private CharSequence f3185l;

        /* renamed from: m  reason: collision with root package name */
        private int f3186m;

        /* renamed from: n  reason: collision with root package name */
        private char f3187n;

        /* renamed from: o  reason: collision with root package name */
        private int f3188o;

        /* renamed from: p  reason: collision with root package name */
        private char f3189p;

        /* renamed from: q  reason: collision with root package name */
        private int f3190q;

        /* renamed from: r  reason: collision with root package name */
        private int f3191r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f3192s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.f3192s).setVisible(this.t).setEnabled(this.u).setCheckable(this.f3191r >= 1).setTitleCondensed(this.f3185l).setIcon(this.f3186m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (!g.this.c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f3191r >= 2) {
                if (menuItem instanceof i) {
                    ((i) menuItem).t(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).h(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f3174e, g.this.a));
                z2 = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (!z2) {
                    menuItem.setActionView(i3);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            e eVar = this.A;
            if (eVar != null) {
                l.a(menuItem, eVar);
            }
            l.c(menuItem, this.B);
            l.g(menuItem, this.C);
            l.b(menuItem, this.f3187n, this.f3188o);
            l.f(menuItem, this.f3189p, this.f3190q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                l.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                l.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f3181h = true;
            i(this.a.add(this.b, this.f3182i, this.f3183j, this.f3184k));
        }

        public SubMenu b() {
            this.f3181h = true;
            SubMenu addSubMenu = this.a.addSubMenu(this.b, this.f3182i, this.f3183j, this.f3184k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f3181h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.c.obtainStyledAttributes(attributeSet, e.a.j.d1);
            this.b = obtainStyledAttributes.getResourceId(e.a.j.f1, 0);
            this.c = obtainStyledAttributes.getInt(e.a.j.h1, 0);
            this.f3177d = obtainStyledAttributes.getInt(e.a.j.i1, 0);
            this.f3178e = obtainStyledAttributes.getInt(e.a.j.j1, 0);
            this.f3179f = obtainStyledAttributes.getBoolean(e.a.j.g1, true);
            this.f3180g = obtainStyledAttributes.getBoolean(e.a.j.e1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            w0 t2 = w0.t(g.this.c, attributeSet, e.a.j.k1);
            this.f3182i = t2.m(e.a.j.n1, 0);
            this.f3183j = (t2.j(e.a.j.q1, this.c) & -65536) | (t2.j(e.a.j.r1, this.f3177d) & 65535);
            this.f3184k = t2.o(e.a.j.s1);
            this.f3185l = t2.o(e.a.j.t1);
            this.f3186m = t2.m(e.a.j.l1, 0);
            this.f3187n = c(t2.n(e.a.j.u1));
            this.f3188o = t2.j(e.a.j.B1, 4096);
            this.f3189p = c(t2.n(e.a.j.v1));
            this.f3190q = t2.j(e.a.j.F1, 4096);
            int i2 = e.a.j.w1;
            this.f3191r = t2.r(i2) ? t2.a(i2, false) : this.f3178e;
            this.f3192s = t2.a(e.a.j.o1, false);
            this.t = t2.a(e.a.j.p1, this.f3179f);
            this.u = t2.a(e.a.j.m1, this.f3180g);
            this.v = t2.j(e.a.j.G1, -1);
            this.z = t2.n(e.a.j.x1);
            this.w = t2.m(e.a.j.y1, 0);
            this.x = t2.n(e.a.j.A1);
            String n2 = t2.n(e.a.j.z1);
            this.y = n2;
            boolean z2 = n2 != null;
            if (z2 && this.w == 0 && this.x == null) {
                this.A = (e) e(n2, g.f3175f, g.this.b);
            } else {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = t2.o(e.a.j.C1);
            this.C = t2.o(e.a.j.H1);
            int i3 = e.a.j.E1;
            if (t2.r(i3)) {
                this.E = e0.d(t2.j(i3, -1), this.E);
            } else {
                this.E = null;
            }
            int i4 = e.a.j.D1;
            if (t2.r(i4)) {
                this.D = t2.c(i4);
            } else {
                this.D = null;
            }
            t2.v();
            this.f3181h = false;
        }

        public void h() {
            this.b = 0;
            this.c = 0;
            this.f3177d = 0;
            this.f3178e = 0;
            this.f3179f = true;
            this.f3180g = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f3174e = r0
            f3175f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.n.g.<clinit>():void");
    }

    public g(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.h();
                        } else if (name2.equals("item")) {
                            if (!bVar.d()) {
                                e eVar = bVar.A;
                                if (eVar == null || !eVar.a()) {
                                    bVar.a();
                                } else {
                                    bVar.b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.g(attributeSet);
                    } else if (name3.equals("menu")) {
                        c(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object b() {
        if (this.f3176d == null) {
            this.f3176d = a(this.c);
        }
        return this.f3176d;
    }

    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof e.f.l.a.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.c.getResources().getLayout(i2);
            c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
