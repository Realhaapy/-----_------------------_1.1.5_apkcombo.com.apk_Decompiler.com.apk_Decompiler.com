package e.f.r;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class g0 {
    public static final g0 b = (Build.VERSION.SDK_INT >= 30 ? k.f3423q : l.b);
    private final l a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    static class a {
        private static Field a;
        private static Field b;
        private static Field c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f3404d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
            }
        }

        public static g0 a(View view) {
            if (f3404d && view.isAttachedToWindow()) {
                try {
                    Object obj = a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) b.get(obj);
                        Rect rect2 = (Rect) c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            b bVar = new b();
                            bVar.b(e.f.k.b.c(rect));
                            bVar.c(e.f.k.b.c(rect2));
                            g0 a2 = bVar.a();
                            a2.r(a2);
                            a2.d(view.getRootView());
                            return a2;
                        }
                    }
                } catch (IllegalAccessException e2) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
                }
            }
            return null;
        }
    }

    public static final class b {
        private final f a;

        public b() {
            int i2 = Build.VERSION.SDK_INT;
            this.a = i2 >= 30 ? new e() : i2 >= 29 ? new d() : i2 >= 20 ? new c() : new f();
        }

        public b(g0 g0Var) {
            int i2 = Build.VERSION.SDK_INT;
            this.a = i2 >= 30 ? new e(g0Var) : i2 >= 29 ? new d(g0Var) : i2 >= 20 ? new c(g0Var) : new f(g0Var);
        }

        public g0 a() {
            return this.a.b();
        }

        @Deprecated
        public b b(e.f.k.b bVar) {
            this.a.d(bVar);
            return this;
        }

        @Deprecated
        public b c(e.f.k.b bVar) {
            this.a.f(bVar);
            return this;
        }
    }

    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private static Field f3405e = null;

        /* renamed from: f  reason: collision with root package name */
        private static boolean f3406f = false;

        /* renamed from: g  reason: collision with root package name */
        private static Constructor<WindowInsets> f3407g = null;

        /* renamed from: h  reason: collision with root package name */
        private static boolean f3408h = false;
        private WindowInsets c;

        /* renamed from: d  reason: collision with root package name */
        private e.f.k.b f3409d;

        c() {
            this.c = h();
        }

        c(g0 g0Var) {
            super(g0Var);
            this.c = g0Var.t();
        }

        private static WindowInsets h() {
            if (!f3406f) {
                try {
                    f3405e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f3406f = true;
            }
            Field field = f3405e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f3408h) {
                try {
                    f3407g = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f3408h = true;
            }
            Constructor<WindowInsets> constructor = f3407g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public g0 b() {
            a();
            g0 u = g0.u(this.c);
            u.p(this.b);
            u.s(this.f3409d);
            return u;
        }

        /* access modifiers changed from: package-private */
        public void d(e.f.k.b bVar) {
            this.f3409d = bVar;
        }

        /* access modifiers changed from: package-private */
        public void f(e.f.k.b bVar) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(bVar.a, bVar.b, bVar.c, bVar.f3352d);
            }
        }
    }

    private static class d extends f {
        final WindowInsets.Builder c;

        d() {
            this.c = new WindowInsets.Builder();
        }

        d(g0 g0Var) {
            super(g0Var);
            WindowInsets.Builder builder;
            WindowInsets t = g0Var.t();
            if (t == null) {
                builder = new WindowInsets.Builder();
            }
            this.c = builder;
        }

        /* access modifiers changed from: package-private */
        public g0 b() {
            a();
            g0 u = g0.u(this.c.build());
            u.p(this.b);
            return u;
        }

        /* access modifiers changed from: package-private */
        public void c(e.f.k.b bVar) {
            this.c.setMandatorySystemGestureInsets(bVar.e());
        }

        /* access modifiers changed from: package-private */
        public void d(e.f.k.b bVar) {
            this.c.setStableInsets(bVar.e());
        }

        /* access modifiers changed from: package-private */
        public void e(e.f.k.b bVar) {
            this.c.setSystemGestureInsets(bVar.e());
        }

        /* access modifiers changed from: package-private */
        public void f(e.f.k.b bVar) {
            this.c.setSystemWindowInsets(bVar.e());
        }

        /* access modifiers changed from: package-private */
        public void g(e.f.k.b bVar) {
            this.c.setTappableElementInsets(bVar.e());
        }
    }

    private static class e extends d {
        e() {
        }

        e(g0 g0Var) {
            super(g0Var);
        }
    }

    private static class f {
        private final g0 a;
        e.f.k.b[] b;

        f() {
            this(new g0((g0) null));
        }

        f(g0 g0Var) {
            this.a = g0Var;
        }

        /* access modifiers changed from: protected */
        public final void a() {
            e.f.k.b[] bVarArr = this.b;
            if (bVarArr != null) {
                e.f.k.b bVar = bVarArr[m.a(1)];
                e.f.k.b bVar2 = this.b[m.a(2)];
                if (bVar2 == null) {
                    bVar2 = this.a.f(2);
                }
                if (bVar == null) {
                    bVar = this.a.f(1);
                }
                f(e.f.k.b.a(bVar, bVar2));
                e.f.k.b bVar3 = this.b[m.a(16)];
                if (bVar3 != null) {
                    e(bVar3);
                }
                e.f.k.b bVar4 = this.b[m.a(32)];
                if (bVar4 != null) {
                    c(bVar4);
                }
                e.f.k.b bVar5 = this.b[m.a(64)];
                if (bVar5 != null) {
                    g(bVar5);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public g0 b() {
            a();
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public void c(e.f.k.b bVar) {
        }

        /* access modifiers changed from: package-private */
        public void d(e.f.k.b bVar) {
        }

        /* access modifiers changed from: package-private */
        public void e(e.f.k.b bVar) {
        }

        /* access modifiers changed from: package-private */
        public void f(e.f.k.b bVar) {
        }

        /* access modifiers changed from: package-private */
        public void g(e.f.k.b bVar) {
        }
    }

    private static class g extends l {

        /* renamed from: h  reason: collision with root package name */
        private static boolean f3410h = false;

        /* renamed from: i  reason: collision with root package name */
        private static Method f3411i;

        /* renamed from: j  reason: collision with root package name */
        private static Class<?> f3412j;

        /* renamed from: k  reason: collision with root package name */
        private static Field f3413k;

        /* renamed from: l  reason: collision with root package name */
        private static Field f3414l;
        final WindowInsets c;

        /* renamed from: d  reason: collision with root package name */
        private e.f.k.b[] f3415d;

        /* renamed from: e  reason: collision with root package name */
        private e.f.k.b f3416e;

        /* renamed from: f  reason: collision with root package name */
        private g0 f3417f;

        /* renamed from: g  reason: collision with root package name */
        e.f.k.b f3418g;

        g(g0 g0Var, WindowInsets windowInsets) {
            super(g0Var);
            this.f3416e = null;
            this.c = windowInsets;
        }

        g(g0 g0Var, g gVar) {
            this(g0Var, new WindowInsets(gVar.c));
        }

        @SuppressLint({"WrongConstant"})
        private e.f.k.b t(int i2, boolean z) {
            e.f.k.b bVar = e.f.k.b.f3351e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    bVar = e.f.k.b.a(bVar, u(i3, z));
                }
            }
            return bVar;
        }

        private e.f.k.b v() {
            g0 g0Var = this.f3417f;
            return g0Var != null ? g0Var.g() : e.f.k.b.f3351e;
        }

        private e.f.k.b w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f3410h) {
                    x();
                }
                Method method = f3411i;
                if (!(method == null || f3412j == null || f3413k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f3413k.get(f3414l.get(invoke));
                        if (rect != null) {
                            return e.f.k.b.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e2) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                f3411i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3412j = cls;
                f3413k = cls.getDeclaredField("mVisibleInsets");
                f3414l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f3413k.setAccessible(true);
                f3414l.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
            f3410h = true;
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
            e.f.k.b w = w(view);
            if (w == null) {
                w = e.f.k.b.f3351e;
            }
            q(w);
        }

        /* access modifiers changed from: package-private */
        public void e(g0 g0Var) {
            g0Var.r(this.f3417f);
            g0Var.q(this.f3418g);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f3418g, ((g) obj).f3418g);
        }

        public e.f.k.b g(int i2) {
            return t(i2, false);
        }

        /* access modifiers changed from: package-private */
        public final e.f.k.b k() {
            if (this.f3416e == null) {
                this.f3416e = e.f.k.b.b(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.f3416e;
        }

        /* access modifiers changed from: package-private */
        public g0 m(int i2, int i3, int i4, int i5) {
            b bVar = new b(g0.u(this.c));
            bVar.c(g0.m(k(), i2, i3, i4, i5));
            bVar.b(g0.m(i(), i2, i3, i4, i5));
            return bVar.a();
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return this.c.isRound();
        }

        public void p(e.f.k.b[] bVarArr) {
            this.f3415d = bVarArr;
        }

        /* access modifiers changed from: package-private */
        public void q(e.f.k.b bVar) {
            this.f3418g = bVar;
        }

        /* access modifiers changed from: package-private */
        public void r(g0 g0Var) {
            this.f3417f = g0Var;
        }

        /* access modifiers changed from: protected */
        public e.f.k.b u(int i2, boolean z) {
            int i3;
            if (i2 == 1) {
                return z ? e.f.k.b.b(0, Math.max(v().b, k().b), 0, 0) : e.f.k.b.b(0, k().b, 0, 0);
            }
            e.f.k.b bVar = null;
            if (i2 != 2) {
                if (i2 == 8) {
                    e.f.k.b[] bVarArr = this.f3415d;
                    if (bVarArr != null) {
                        bVar = bVarArr[m.a(8)];
                    }
                    if (bVar != null) {
                        return bVar;
                    }
                    e.f.k.b k2 = k();
                    e.f.k.b v = v();
                    int i4 = k2.f3352d;
                    if (i4 > v.f3352d) {
                        return e.f.k.b.b(0, 0, 0, i4);
                    }
                    e.f.k.b bVar2 = this.f3418g;
                    return (bVar2 == null || bVar2.equals(e.f.k.b.f3351e) || (i3 = this.f3418g.f3352d) <= v.f3352d) ? e.f.k.b.f3351e : e.f.k.b.b(0, 0, 0, i3);
                } else if (i2 == 16) {
                    return j();
                } else {
                    if (i2 == 32) {
                        return h();
                    }
                    if (i2 == 64) {
                        return l();
                    }
                    if (i2 != 128) {
                        return e.f.k.b.f3351e;
                    }
                    g0 g0Var = this.f3417f;
                    g e2 = g0Var != null ? g0Var.e() : f();
                    return e2 != null ? e.f.k.b.b(e2.b(), e2.d(), e2.c(), e2.a()) : e.f.k.b.f3351e;
                }
            } else if (z) {
                e.f.k.b v2 = v();
                e.f.k.b i5 = i();
                return e.f.k.b.b(Math.max(v2.a, i5.a), 0, Math.max(v2.c, i5.c), Math.max(v2.f3352d, i5.f3352d));
            } else {
                e.f.k.b k3 = k();
                g0 g0Var2 = this.f3417f;
                if (g0Var2 != null) {
                    bVar = g0Var2.g();
                }
                int i6 = k3.f3352d;
                if (bVar != null) {
                    i6 = Math.min(i6, bVar.f3352d);
                }
                return e.f.k.b.b(k3.a, 0, k3.c, i6);
            }
        }
    }

    private static class h extends g {

        /* renamed from: m  reason: collision with root package name */
        private e.f.k.b f3419m = null;

        h(g0 g0Var, WindowInsets windowInsets) {
            super(g0Var, windowInsets);
        }

        h(g0 g0Var, h hVar) {
            super(g0Var, (g) hVar);
            this.f3419m = hVar.f3419m;
        }

        /* access modifiers changed from: package-private */
        public g0 b() {
            return g0.u(this.c.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        public g0 c() {
            return g0.u(this.c.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        public final e.f.k.b i() {
            if (this.f3419m == null) {
                this.f3419m = e.f.k.b.b(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.f3419m;
        }

        /* access modifiers changed from: package-private */
        public boolean n() {
            return this.c.isConsumed();
        }

        public void s(e.f.k.b bVar) {
            this.f3419m = bVar;
        }
    }

    private static class i extends h {
        i(g0 g0Var, WindowInsets windowInsets) {
            super(g0Var, windowInsets);
        }

        i(g0 g0Var, i iVar) {
            super(g0Var, (h) iVar);
        }

        /* access modifiers changed from: package-private */
        public g0 a() {
            return g0.u(this.c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.c, iVar.c) && Objects.equals(this.f3418g, iVar.f3418g);
        }

        /* access modifiers changed from: package-private */
        public g f() {
            return g.e(this.c.getDisplayCutout());
        }

        public int hashCode() {
            return this.c.hashCode();
        }
    }

    private static class j extends i {

        /* renamed from: n  reason: collision with root package name */
        private e.f.k.b f3420n = null;

        /* renamed from: o  reason: collision with root package name */
        private e.f.k.b f3421o = null;

        /* renamed from: p  reason: collision with root package name */
        private e.f.k.b f3422p = null;

        j(g0 g0Var, WindowInsets windowInsets) {
            super(g0Var, windowInsets);
        }

        j(g0 g0Var, j jVar) {
            super(g0Var, (i) jVar);
        }

        /* access modifiers changed from: package-private */
        public e.f.k.b h() {
            if (this.f3421o == null) {
                this.f3421o = e.f.k.b.d(this.c.getMandatorySystemGestureInsets());
            }
            return this.f3421o;
        }

        /* access modifiers changed from: package-private */
        public e.f.k.b j() {
            if (this.f3420n == null) {
                this.f3420n = e.f.k.b.d(this.c.getSystemGestureInsets());
            }
            return this.f3420n;
        }

        /* access modifiers changed from: package-private */
        public e.f.k.b l() {
            if (this.f3422p == null) {
                this.f3422p = e.f.k.b.d(this.c.getTappableElementInsets());
            }
            return this.f3422p;
        }

        /* access modifiers changed from: package-private */
        public g0 m(int i2, int i3, int i4, int i5) {
            return g0.u(this.c.inset(i2, i3, i4, i5));
        }

        public void s(e.f.k.b bVar) {
        }
    }

    private static class k extends j {

        /* renamed from: q  reason: collision with root package name */
        static final g0 f3423q = g0.u(WindowInsets.CONSUMED);

        k(g0 g0Var, WindowInsets windowInsets) {
            super(g0Var, windowInsets);
        }

        k(g0 g0Var, k kVar) {
            super(g0Var, (j) kVar);
        }

        /* access modifiers changed from: package-private */
        public final void d(View view) {
        }

        public e.f.k.b g(int i2) {
            return e.f.k.b.d(this.c.getInsets(n.a(i2)));
        }
    }

    private static class l {
        static final g0 b = new b().a().a().b().c();
        final g0 a;

        l(g0 g0Var) {
            this.a = g0Var;
        }

        /* access modifiers changed from: package-private */
        public g0 a() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public g0 b() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public g0 c() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
        }

        /* access modifiers changed from: package-private */
        public void e(g0 g0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && e.f.q.c.a(k(), lVar.k()) && e.f.q.c.a(i(), lVar.i()) && e.f.q.c.a(f(), lVar.f());
        }

        /* access modifiers changed from: package-private */
        public g f() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public e.f.k.b g(int i2) {
            return e.f.k.b.f3351e;
        }

        /* access modifiers changed from: package-private */
        public e.f.k.b h() {
            return k();
        }

        public int hashCode() {
            return e.f.q.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        /* access modifiers changed from: package-private */
        public e.f.k.b i() {
            return e.f.k.b.f3351e;
        }

        /* access modifiers changed from: package-private */
        public e.f.k.b j() {
            return k();
        }

        /* access modifiers changed from: package-private */
        public e.f.k.b k() {
            return e.f.k.b.f3351e;
        }

        /* access modifiers changed from: package-private */
        public e.f.k.b l() {
            return k();
        }

        /* access modifiers changed from: package-private */
        public g0 m(int i2, int i3, int i4, int i5) {
            return b;
        }

        /* access modifiers changed from: package-private */
        public boolean n() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return false;
        }

        public void p(e.f.k.b[] bVarArr) {
        }

        /* access modifiers changed from: package-private */
        public void q(e.f.k.b bVar) {
        }

        /* access modifiers changed from: package-private */
        public void r(g0 g0Var) {
        }

        public void s(e.f.k.b bVar) {
        }
    }

    public static final class m {
        static int a(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 4) {
                return 2;
            }
            if (i2 == 8) {
                return 3;
            }
            if (i2 == 16) {
                return 4;
            }
            if (i2 == 32) {
                return 5;
            }
            if (i2 == 64) {
                return 6;
            }
            if (i2 == 128) {
                return 7;
            }
            if (i2 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i2);
        }
    }

    private static final class n {
        static int a(int i2) {
            int i3;
            int i4 = 0;
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i2 & i5) != 0) {
                    if (i5 == 1) {
                        i3 = WindowInsets.Type.statusBars();
                    } else if (i5 == 2) {
                        i3 = WindowInsets.Type.navigationBars();
                    } else if (i5 == 4) {
                        i3 = WindowInsets.Type.captionBar();
                    } else if (i5 == 8) {
                        i3 = WindowInsets.Type.ime();
                    } else if (i5 == 16) {
                        i3 = WindowInsets.Type.systemGestures();
                    } else if (i5 == 32) {
                        i3 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i5 == 64) {
                        i3 = WindowInsets.Type.tappableElement();
                    } else if (i5 == 128) {
                        i3 = WindowInsets.Type.displayCutout();
                    }
                    i4 |= i3;
                }
            }
            return i4;
        }
    }

    private g0(WindowInsets windowInsets) {
        l gVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            gVar = new k(this, windowInsets);
        } else if (i2 >= 29) {
            gVar = new j(this, windowInsets);
        } else if (i2 >= 28) {
            gVar = new i(this, windowInsets);
        } else if (i2 >= 21) {
            gVar = new h(this, windowInsets);
        } else if (i2 >= 20) {
            gVar = new g(this, windowInsets);
        } else {
            this.a = new l(this);
            return;
        }
        this.a = gVar;
    }

    public g0(g0 g0Var) {
        if (g0Var != null) {
            l lVar = g0Var.a;
            int i2 = Build.VERSION.SDK_INT;
            this.a = (i2 < 30 || !(lVar instanceof k)) ? (i2 < 29 || !(lVar instanceof j)) ? (i2 < 28 || !(lVar instanceof i)) ? (i2 < 21 || !(lVar instanceof h)) ? (i2 < 20 || !(lVar instanceof g)) ? new l(this) : new g(this, (g) lVar) : new h(this, (h) lVar) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
            lVar.e(this);
            return;
        }
        this.a = new l(this);
    }

    static e.f.k.b m(e.f.k.b bVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, bVar.a - i2);
        int max2 = Math.max(0, bVar.b - i3);
        int max3 = Math.max(0, bVar.c - i4);
        int max4 = Math.max(0, bVar.f3352d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? bVar : e.f.k.b.b(max, max2, max3, max4);
    }

    public static g0 u(WindowInsets windowInsets) {
        return v(windowInsets, (View) null);
    }

    public static g0 v(WindowInsets windowInsets, View view) {
        e.f.q.d.d(windowInsets);
        g0 g0Var = new g0(windowInsets);
        if (view != null && y.C(view)) {
            g0Var.r(y.v(view));
            g0Var.d(view.getRootView());
        }
        return g0Var;
    }

    @Deprecated
    public g0 a() {
        return this.a.a();
    }

    @Deprecated
    public g0 b() {
        return this.a.b();
    }

    @Deprecated
    public g0 c() {
        return this.a.c();
    }

    /* access modifiers changed from: package-private */
    public void d(View view) {
        this.a.d(view);
    }

    public g e() {
        return this.a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        return e.f.q.c.a(this.a, ((g0) obj).a);
    }

    public e.f.k.b f(int i2) {
        return this.a.g(i2);
    }

    @Deprecated
    public e.f.k.b g() {
        return this.a.i();
    }

    @Deprecated
    public int h() {
        return this.a.k().f3352d;
    }

    public int hashCode() {
        l lVar = this.a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.a.k().a;
    }

    @Deprecated
    public int j() {
        return this.a.k().c;
    }

    @Deprecated
    public int k() {
        return this.a.k().b;
    }

    public g0 l(int i2, int i3, int i4, int i5) {
        return this.a.m(i2, i3, i4, i5);
    }

    public boolean n() {
        return this.a.n();
    }

    @Deprecated
    public g0 o(int i2, int i3, int i4, int i5) {
        b bVar = new b(this);
        bVar.c(e.f.k.b.b(i2, i3, i4, i5));
        return bVar.a();
    }

    /* access modifiers changed from: package-private */
    public void p(e.f.k.b[] bVarArr) {
        this.a.p(bVarArr);
    }

    /* access modifiers changed from: package-private */
    public void q(e.f.k.b bVar) {
        this.a.q(bVar);
    }

    /* access modifiers changed from: package-private */
    public void r(g0 g0Var) {
        this.a.r(g0Var);
    }

    /* access modifiers changed from: package-private */
    public void s(e.f.k.b bVar) {
        this.a.s(bVar);
    }

    public WindowInsets t() {
        l lVar = this.a;
        if (lVar instanceof g) {
            return ((g) lVar).c;
        }
        return null;
    }
}
