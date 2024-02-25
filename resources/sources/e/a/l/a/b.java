package e.a.l.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

class b extends Drawable implements Drawable.Callback {

    /* renamed from: e  reason: collision with root package name */
    private d f3118e;

    /* renamed from: f  reason: collision with root package name */
    private Rect f3119f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f3120g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f3121h;

    /* renamed from: i  reason: collision with root package name */
    private int f3122i = 255;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3123j;

    /* renamed from: k  reason: collision with root package name */
    private int f3124k = -1;

    /* renamed from: l  reason: collision with root package name */
    private boolean f3125l;

    /* renamed from: m  reason: collision with root package name */
    private Runnable f3126m;

    /* renamed from: n  reason: collision with root package name */
    private long f3127n;

    /* renamed from: o  reason: collision with root package name */
    private long f3128o;

    /* renamed from: p  reason: collision with root package name */
    private c f3129p;

    class a implements Runnable {
        a() {
        }

        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: e.a.l.a.b$b  reason: collision with other inner class name */
    private static class C0063b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    static class c implements Drawable.Callback {

        /* renamed from: e  reason: collision with root package name */
        private Drawable.Callback f3131e;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f3131e;
            this.f3131e = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f3131e = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.f3131e;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f3131e;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    static abstract class d extends Drawable.ConstantState {
        int A = 0;
        int B = 0;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;
        final b a;
        Resources b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        int f3132d;

        /* renamed from: e  reason: collision with root package name */
        int f3133e;

        /* renamed from: f  reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f3134f;

        /* renamed from: g  reason: collision with root package name */
        Drawable[] f3135g;

        /* renamed from: h  reason: collision with root package name */
        int f3136h;

        /* renamed from: i  reason: collision with root package name */
        boolean f3137i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f3138j;

        /* renamed from: k  reason: collision with root package name */
        Rect f3139k;

        /* renamed from: l  reason: collision with root package name */
        boolean f3140l = false;

        /* renamed from: m  reason: collision with root package name */
        boolean f3141m;

        /* renamed from: n  reason: collision with root package name */
        int f3142n;

        /* renamed from: o  reason: collision with root package name */
        int f3143o;

        /* renamed from: p  reason: collision with root package name */
        int f3144p;

        /* renamed from: q  reason: collision with root package name */
        int f3145q;

        /* renamed from: r  reason: collision with root package name */
        boolean f3146r;

        /* renamed from: s  reason: collision with root package name */
        int f3147s;
        boolean t;
        boolean u;
        boolean v;
        boolean w;
        boolean x = true;
        boolean y;
        int z;

        d(d dVar, b bVar, Resources resources) {
            this.a = bVar;
            Rect rect = null;
            this.b = resources != null ? resources : dVar != null ? dVar.b : null;
            int f2 = b.f(resources, dVar != null ? dVar.c : 0);
            this.c = f2;
            if (dVar != null) {
                this.f3132d = dVar.f3132d;
                this.f3133e = dVar.f3133e;
                this.v = true;
                this.w = true;
                this.f3137i = dVar.f3137i;
                this.f3140l = dVar.f3140l;
                this.x = dVar.x;
                this.y = dVar.y;
                this.z = dVar.z;
                this.A = dVar.A;
                this.B = dVar.B;
                this.C = dVar.C;
                this.D = dVar.D;
                this.E = dVar.E;
                this.F = dVar.F;
                this.G = dVar.G;
                this.H = dVar.H;
                this.I = dVar.I;
                if (dVar.c == f2) {
                    if (dVar.f3138j) {
                        this.f3139k = dVar.f3139k != null ? new Rect(dVar.f3139k) : rect;
                        this.f3138j = true;
                    }
                    if (dVar.f3141m) {
                        this.f3142n = dVar.f3142n;
                        this.f3143o = dVar.f3143o;
                        this.f3144p = dVar.f3144p;
                        this.f3145q = dVar.f3145q;
                        this.f3141m = true;
                    }
                }
                if (dVar.f3146r) {
                    this.f3147s = dVar.f3147s;
                    this.f3146r = true;
                }
                if (dVar.t) {
                    this.u = dVar.u;
                    this.t = true;
                }
                Drawable[] drawableArr = dVar.f3135g;
                this.f3135g = new Drawable[drawableArr.length];
                this.f3136h = dVar.f3136h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f3134f;
                this.f3134f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f3136h);
                int i2 = this.f3136h;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null) {
                        Drawable.ConstantState constantState = drawableArr[i3].getConstantState();
                        if (constantState != null) {
                            this.f3134f.put(i3, constantState);
                        } else {
                            this.f3135g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f3135g = new Drawable[10];
            this.f3136h = 0;
        }

        private void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f3134f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f3135g[this.f3134f.keyAt(i2)] = s(this.f3134f.valueAt(i2).newDrawable(this.b));
                }
                this.f3134f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.l(drawable, this.z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i2 = this.f3136h;
            if (i2 >= this.f3135g.length) {
                o(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.a);
            this.f3135g[i2] = drawable;
            this.f3136h++;
            this.f3133e = drawable.getChangingConfigurations() | this.f3133e;
            p();
            this.f3139k = null;
            this.f3138j = false;
            this.f3141m = false;
            this.v = false;
            return i2;
        }

        /* access modifiers changed from: package-private */
        public final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i2 = this.f3136h;
                Drawable[] drawableArr = this.f3135g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null && androidx.core.graphics.drawable.a.b(drawableArr[i3])) {
                        androidx.core.graphics.drawable.a.a(drawableArr[i3], theme);
                        this.f3133e |= drawableArr[i3].getChangingConfigurations();
                    }
                }
                y(C0063b.c(theme));
            }
        }

        public boolean c() {
            if (this.v) {
                return this.w;
            }
            e();
            this.v = true;
            int i2 = this.f3136h;
            Drawable[] drawableArr = this.f3135g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i2 = this.f3136h;
            Drawable[] drawableArr = this.f3135g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f3134f.get(i3);
                    if (constantState != null && C0063b.a(constantState)) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void d() {
            this.f3141m = true;
            e();
            int i2 = this.f3136h;
            Drawable[] drawableArr = this.f3135g;
            this.f3143o = -1;
            this.f3142n = -1;
            this.f3145q = 0;
            this.f3144p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f3142n) {
                    this.f3142n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f3143o) {
                    this.f3143o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f3144p) {
                    this.f3144p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f3145q) {
                    this.f3145q = minimumHeight;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final int f() {
            return this.f3135g.length;
        }

        public final Drawable g(int i2) {
            int indexOfKey;
            Drawable drawable = this.f3135g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f3134f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable s2 = s(this.f3134f.valueAt(indexOfKey).newDrawable(this.b));
            this.f3135g[i2] = s2;
            this.f3134f.removeAt(indexOfKey);
            if (this.f3134f.size() == 0) {
                this.f3134f = null;
            }
            return s2;
        }

        public int getChangingConfigurations() {
            return this.f3132d | this.f3133e;
        }

        public final int h() {
            return this.f3136h;
        }

        public final int i() {
            if (!this.f3141m) {
                d();
            }
            return this.f3143o;
        }

        public final int j() {
            if (!this.f3141m) {
                d();
            }
            return this.f3145q;
        }

        public final int k() {
            if (!this.f3141m) {
                d();
            }
            return this.f3144p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f3137i) {
                return null;
            }
            Rect rect2 = this.f3139k;
            if (rect2 != null || this.f3138j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i2 = this.f3136h;
            Drawable[] drawableArr = this.f3135g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i4 = rect3.left;
                    if (i4 > rect.left) {
                        rect.left = i4;
                    }
                    int i5 = rect3.top;
                    if (i5 > rect.top) {
                        rect.top = i5;
                    }
                    int i6 = rect3.right;
                    if (i6 > rect.right) {
                        rect.right = i6;
                    }
                    int i7 = rect3.bottom;
                    if (i7 > rect.bottom) {
                        rect.bottom = i7;
                    }
                }
            }
            this.f3138j = true;
            this.f3139k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f3141m) {
                d();
            }
            return this.f3142n;
        }

        public final int n() {
            if (this.f3146r) {
                return this.f3147s;
            }
            e();
            int i2 = this.f3136h;
            Drawable[] drawableArr = this.f3135g;
            int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i3 = 1; i3 < i2; i3++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
            }
            this.f3147s = opacity;
            this.f3146r = true;
            return opacity;
        }

        public void o(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            Drawable[] drawableArr2 = this.f3135g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
            }
            this.f3135g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        public void p() {
            this.f3146r = false;
            this.t = false;
        }

        public final boolean q() {
            return this.f3140l;
        }

        /* access modifiers changed from: package-private */
        public abstract void r();

        public final void t(boolean z2) {
            this.f3140l = z2;
        }

        public final void u(int i2) {
            this.A = i2;
        }

        public final void v(int i2) {
            this.B = i2;
        }

        /* access modifiers changed from: package-private */
        public final boolean w(int i2, int i3) {
            int i4 = this.f3136h;
            Drawable[] drawableArr = this.f3135g;
            boolean z2 = false;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5] != null) {
                    boolean l2 = Build.VERSION.SDK_INT >= 23 ? androidx.core.graphics.drawable.a.l(drawableArr[i5], i2) : false;
                    if (i5 == i3) {
                        z2 = l2;
                    }
                }
            }
            this.z = i2;
            return z2;
        }

        public final void x(boolean z2) {
            this.f3137i = z2;
        }

        /* access modifiers changed from: package-private */
        public final void y(Resources resources) {
            if (resources != null) {
                this.b = resources;
                int f2 = b.f(resources, this.c);
                int i2 = this.c;
                this.c = f2;
                if (i2 != f2) {
                    this.f3141m = false;
                    this.f3138j = false;
                }
            }
        }
    }

    b() {
    }

    private void d(Drawable drawable) {
        if (this.f3129p == null) {
            this.f3129p = new c();
        }
        c cVar = this.f3129p;
        cVar.b(drawable.getCallback());
        drawable.setCallback(cVar);
        try {
            if (this.f3118e.A <= 0 && this.f3123j) {
                drawable.setAlpha(this.f3122i);
            }
            d dVar = this.f3118e;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    androidx.core.graphics.drawable.a.n(drawable, dVar.F);
                }
                d dVar2 = this.f3118e;
                if (dVar2.I) {
                    androidx.core.graphics.drawable.a.o(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f3118e.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                androidx.core.graphics.drawable.a.l(drawable, androidx.core.graphics.drawable.a.e(this));
            }
            if (i2 >= 19) {
                androidx.core.graphics.drawable.a.i(drawable, this.f3118e.C);
            }
            Rect rect = this.f3119f;
            if (i2 >= 21 && rect != null) {
                androidx.core.graphics.drawable.a.k(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f3129p.a());
        }
    }

    private boolean e() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    static int f(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f3123j = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f3120g
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f3127n
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f3122i
            r3.setAlpha(r9)
            goto L_0x0036
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            e.a.l.a.b$d r9 = r13.f3118e
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f3122i
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x0039
        L_0x0036:
            r13.f3127n = r7
        L_0x0038:
            r3 = 0
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f3121h
            if (r9 == 0) goto L_0x0061
            long r10 = r13.f3128o
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x004e
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f3121h = r0
            goto L_0x0061
        L_0x004e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            e.a.l.a.b$d r4 = r13.f3118e
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f3122i
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.f3128o = r7
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.f3126m
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.l.a.b.a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f3118e.b(theme);
    }

    /* access modifiers changed from: package-private */
    public d b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f3124k;
    }

    public boolean canApplyTheme() {
        return this.f3118e.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f3120g;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f3121h;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f3124k
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            e.a.l.a.b$d r0 = r9.f3118e
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f3121h
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f3120g
            if (r0 == 0) goto L_0x0029
            r9.f3121h = r0
            e.a.l.a.b$d r0 = r9.f3118e
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f3128o = r0
            goto L_0x0035
        L_0x0029:
            r9.f3121h = r4
            r9.f3128o = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f3120g
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            e.a.l.a.b$d r0 = r9.f3118e
            int r1 = r0.f3136h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f3120g = r0
            r9.f3124k = r10
            if (r0 == 0) goto L_0x005a
            e.a.l.a.b$d r10 = r9.f3118e
            int r10 = r10.A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f3127n = r2
        L_0x0051:
            r9.d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f3120g = r4
            r10 = -1
            r9.f3124k = r10
        L_0x005a:
            long r0 = r9.f3127n
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f3128o
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f3126m
            if (r0 != 0) goto L_0x0073
            e.a.l.a.b$a r0 = new e.a.l.a.b$a
            r0.<init>()
            r9.f3126m = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.l.a.b.g(int):boolean");
    }

    public int getAlpha() {
        return this.f3122i;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f3118e.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f3118e.c()) {
            return null;
        }
        this.f3118e.f3132d = getChangingConfigurations();
        return this.f3118e;
    }

    public Drawable getCurrent() {
        return this.f3120g;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f3119f;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f3118e.q()) {
            return this.f3118e.i();
        }
        Drawable drawable = this.f3120g;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f3118e.q()) {
            return this.f3118e.m();
        }
        Drawable drawable = this.f3120g;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f3118e.q()) {
            return this.f3118e.j();
        }
        Drawable drawable = this.f3120g;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f3118e.q()) {
            return this.f3118e.k();
        }
        Drawable drawable = this.f3120g;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f3120g;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f3118e.n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f3120g;
        if (drawable != null) {
            C0063b.b(drawable, outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect l2 = this.f3118e.l();
        if (l2 != null) {
            rect.set(l2);
            z = (l2.right | ((l2.left | l2.top) | l2.bottom)) != 0;
        } else {
            Drawable drawable = this.f3120g;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public void h(d dVar) {
        this.f3118e = dVar;
        int i2 = this.f3124k;
        if (i2 >= 0) {
            Drawable g2 = dVar.g(i2);
            this.f3120g = g2;
            if (g2 != null) {
                d(g2);
            }
        }
        this.f3121h = null;
    }

    /* access modifiers changed from: package-private */
    public final void i(Resources resources) {
        this.f3118e.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f3118e;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable == this.f3120g && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f3118e.C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f3121h;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f3121h = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f3120g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f3123j) {
                this.f3120g.setAlpha(this.f3122i);
            }
        }
        if (this.f3128o != 0) {
            this.f3128o = 0;
            z = true;
        }
        if (this.f3127n != 0) {
            this.f3127n = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f3125l && super.mutate() == this) {
            d b = b();
            b.r();
            h(b);
            this.f3125l = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3121h;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f3120g;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        return this.f3118e.w(i2, c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f3121h;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f3120g;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3121h;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f3120g;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.f3120g && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (!this.f3123j || this.f3122i != i2) {
            this.f3123j = true;
            this.f3122i = i2;
            Drawable drawable = this.f3120g;
            if (drawable == null) {
                return;
            }
            if (this.f3127n == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        d dVar = this.f3118e;
        if (dVar.C != z) {
            dVar.C = z;
            Drawable drawable = this.f3120g;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.i(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f3118e;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f3120g;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        d dVar = this.f3118e;
        if (dVar.x != z) {
            dVar.x = z;
            Drawable drawable = this.f3120g;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f3120g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, f2, f3);
        }
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f3119f;
        if (rect == null) {
            this.f3119f = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f3120g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, i2, i3, i4, i5);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f3118e;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            androidx.core.graphics.drawable.a.n(this.f3120g, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f3118e;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            androidx.core.graphics.drawable.a.o(this.f3120g, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f3121h;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f3120g;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f3120g && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
