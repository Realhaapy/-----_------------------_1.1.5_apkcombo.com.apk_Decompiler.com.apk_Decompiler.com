package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import e.e.h;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

public final class m0 {

    /* renamed from: h  reason: collision with root package name */
    private static final PorterDuff.Mode f626h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i  reason: collision with root package name */
    private static m0 f627i;

    /* renamed from: j  reason: collision with root package name */
    private static final c f628j = new c(6);
    private WeakHashMap<Context, h<ColorStateList>> a;
    private e.e.g<String, e> b;
    private h<String> c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap<Context, e.e.d<WeakReference<Drawable.ConstantState>>> f629d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f630e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f631f;

    /* renamed from: g  reason: collision with root package name */
    private f f632g;

    static class a implements e {
        a() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return e.a.l.a.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    private static class b implements e {
        b() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return e.r.a.a.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    private static class c extends e.e.e<Integer, PorterDuffColorFilter> {
        public c(int i2) {
            super(i2);
        }

        private static int h(int i2, PorterDuff.Mode mode) {
            return ((i2 + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter i(int i2, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(h(i2, mode)));
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter j(int i2, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(h(i2, mode)), porterDuffColorFilter);
        }
    }

    static class d implements e {
        d() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception e2) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e2);
                }
            }
            return null;
        }
    }

    private interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface f {
        boolean a(Context context, int i2, Drawable drawable);

        PorterDuff.Mode b(int i2);

        Drawable c(m0 m0Var, Context context, int i2);

        ColorStateList d(Context context, int i2);

        boolean e(Context context, int i2, Drawable drawable);
    }

    private static class g implements e {
        g() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return e.r.a.a.h.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    private void a(String str, e eVar) {
        if (this.b == null) {
            this.b = new e.e.g<>();
        }
        this.b.put(str, eVar);
    }

    private synchronized boolean b(Context context, long j2, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            e.e.d dVar = this.f629d.get(context);
            if (dVar == null) {
                dVar = new e.e.d();
                this.f629d.put(context, dVar);
            }
            dVar.l(j2, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private void c(Context context, int i2, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap<>();
        }
        h hVar = this.a.get(context);
        if (hVar == null) {
            hVar = new h();
            this.a.put(context, hVar);
        }
        hVar.b(i2, colorStateList);
    }

    private void d(Context context) {
        if (!this.f631f) {
            this.f631f = true;
            Drawable j2 = j(context, e.a.m.a.abc_vector_test);
            if (j2 == null || !q(j2)) {
                this.f631f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private static long e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable f(Context context, int i2) {
        if (this.f630e == null) {
            this.f630e = new TypedValue();
        }
        TypedValue typedValue = this.f630e;
        context.getResources().getValue(i2, typedValue, true);
        long e2 = e(typedValue);
        Drawable i3 = i(context, e2);
        if (i3 != null) {
            return i3;
        }
        f fVar = this.f632g;
        Drawable c2 = fVar == null ? null : fVar.c(this, context, i2);
        if (c2 != null) {
            c2.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e2, c2);
        }
        return c2;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized m0 h() {
        m0 m0Var;
        synchronized (m0.class) {
            if (f627i == null) {
                m0 m0Var2 = new m0();
                f627i = m0Var2;
                p(m0Var2);
            }
            m0Var = f627i;
        }
        return m0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable i(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, e.e.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f629d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            e.e.d r0 = (e.e.d) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.h(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.m(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m0.i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public static synchronized PorterDuffColorFilter l(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter i3;
        synchronized (m0.class) {
            c cVar = f628j;
            i3 = cVar.i(i2, mode);
            if (i3 == null) {
                i3 = new PorterDuffColorFilter(i2, mode);
                cVar.j(i2, mode, i3);
            }
        }
        return i3;
    }

    private ColorStateList n(Context context, int i2) {
        h hVar;
        WeakHashMap<Context, h<ColorStateList>> weakHashMap = this.a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.h(i2);
    }

    private static void p(m0 m0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            m0Var.a("vector", new g());
            m0Var.a("animated-vector", new b());
            m0Var.a("animated-selector", new a());
            m0Var.a("drawable", new d());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof e.r.a.a.h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable r(android.content.Context r11, int r12) {
        /*
            r10 = this;
            e.e.g<java.lang.String, androidx.appcompat.widget.m0$e> r0 = r10.b
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            e.e.h<java.lang.String> r0 = r10.c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.h(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            e.e.g<java.lang.String, androidx.appcompat.widget.m0$e> r3 = r10.b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            e.e.h r0 = new e.e.h
            r0.<init>()
            r10.c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f630e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f630e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f630e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = e(r0)
            android.graphics.drawable.Drawable r6 = r10.i(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            e.e.h<java.lang.String> r8 = r10.c     // Catch:{ Exception -> 0x00a2 }
            r8.b(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            e.e.g<java.lang.String, androidx.appcompat.widget.m0$e> r8 = r10.b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.m0$e r3 = (androidx.appcompat.widget.m0.e) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.b(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            e.e.h<java.lang.String> r11 = r10.c
            r11.b(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m0.r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    private Drawable v(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList m2 = m(context, i2);
        if (m2 != null) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable p2 = androidx.core.graphics.drawable.a.p(drawable);
            androidx.core.graphics.drawable.a.n(p2, m2);
            PorterDuff.Mode o2 = o(i2);
            if (o2 == null) {
                return p2;
            }
            androidx.core.graphics.drawable.a.o(p2, o2);
            return p2;
        }
        f fVar = this.f632g;
        if ((fVar == null || !fVar.e(context, i2, drawable)) && !x(context, i2, drawable) && z) {
            return null;
        }
        return drawable;
    }

    static void w(Drawable drawable, u0 u0Var, int[] iArr) {
        if (!e0.a(drawable) || drawable.mutate() == drawable) {
            boolean z = u0Var.f677d;
            if (z || u0Var.c) {
                drawable.setColorFilter(g(z ? u0Var.a : null, u0Var.c ? u0Var.b : f626h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public synchronized Drawable j(Context context, int i2) {
        return k(context, i2, false);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable k(Context context, int i2, boolean z) {
        Drawable r2;
        d(context);
        r2 = r(context, i2);
        if (r2 == null) {
            r2 = f(context, i2);
        }
        if (r2 == null) {
            r2 = e.f.j.a.f(context, i2);
        }
        if (r2 != null) {
            r2 = v(context, i2, z, r2);
        }
        if (r2 != null) {
            e0.b(r2);
        }
        return r2;
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList m(Context context, int i2) {
        ColorStateList n2;
        n2 = n(context, i2);
        if (n2 == null) {
            f fVar = this.f632g;
            n2 = fVar == null ? null : fVar.d(context, i2);
            if (n2 != null) {
                c(context, i2, n2);
            }
        }
        return n2;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode o(int i2) {
        f fVar = this.f632g;
        if (fVar == null) {
            return null;
        }
        return fVar.b(i2);
    }

    public synchronized void s(Context context) {
        e.e.d dVar = this.f629d.get(context);
        if (dVar != null) {
            dVar.d();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable t(Context context, b1 b1Var, int i2) {
        Drawable r2 = r(context, i2);
        if (r2 == null) {
            r2 = b1Var.d(i2);
        }
        if (r2 == null) {
            return null;
        }
        return v(context, i2, false, r2);
    }

    public synchronized void u(f fVar) {
        this.f632g = fVar;
    }

    /* access modifiers changed from: package-private */
    public boolean x(Context context, int i2, Drawable drawable) {
        f fVar = this.f632g;
        return fVar != null && fVar.a(context, i2, drawable);
    }
}
