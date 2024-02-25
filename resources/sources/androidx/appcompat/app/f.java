package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.w0;
import androidx.lifecycle.e;
import e.a.n.b;
import e.a.n.f;
import e.f.j.f.j;
import e.f.r.d0;
import e.f.r.e0;
import e.f.r.g0;
import e.f.r.i;
import e.f.r.y;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

class f extends e implements g.a, LayoutInflater.Factory2 {
    private static final e.e.g<String, Integer> f0 = new e.e.g<>();
    private static final boolean g0;
    private static final int[] h0 = {16842836};
    private static final boolean i0 = (!"robolectric".equals(Build.FINGERPRINT));
    private static final boolean j0;
    private static boolean k0 = true;
    private TextView A;
    private View B;
    private boolean C;
    private boolean D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    boolean I;
    private boolean J;
    private t[] K;
    private t L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    boolean Q;
    private int R;
    private int S;
    private boolean T;
    private boolean U;
    private p V;
    private p W;
    boolean X;
    int Y;
    private final Runnable Z;
    private boolean a0;
    private Rect b0;
    private Rect c0;
    private h d0;
    private i e0;

    /* renamed from: h  reason: collision with root package name */
    final Object f156h;

    /* renamed from: i  reason: collision with root package name */
    final Context f157i;

    /* renamed from: j  reason: collision with root package name */
    Window f158j;

    /* renamed from: k  reason: collision with root package name */
    private n f159k;

    /* renamed from: l  reason: collision with root package name */
    final d f160l;

    /* renamed from: m  reason: collision with root package name */
    a f161m;

    /* renamed from: n  reason: collision with root package name */
    MenuInflater f162n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f163o;

    /* renamed from: p  reason: collision with root package name */
    private c0 f164p;

    /* renamed from: q  reason: collision with root package name */
    private h f165q;

    /* renamed from: r  reason: collision with root package name */
    private u f166r;

    /* renamed from: s  reason: collision with root package name */
    e.a.n.b f167s;
    ActionBarContextView t;
    PopupWindow u;
    Runnable v;
    e.f.r.c0 w;
    private boolean x;
    private boolean y;
    ViewGroup z;

    class a implements Thread.UncaughtExceptionHandler {
        final /* synthetic */ Thread.UncaughtExceptionHandler a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.a.uncaughtException(thread, notFoundException);
                return;
            }
            this.a.uncaughtException(thread, th);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            f fVar = f.this;
            if ((fVar.Y & 1) != 0) {
                fVar.W(0);
            }
            f fVar2 = f.this;
            if ((fVar2.Y & 4096) != 0) {
                fVar2.W(108);
            }
            f fVar3 = f.this;
            fVar3.X = false;
            fVar3.Y = 0;
        }
    }

    class c implements e.f.r.t {
        c() {
        }

        public g0 a(View view, g0 g0Var) {
            int k2 = g0Var.k();
            int N0 = f.this.N0(g0Var, (Rect) null);
            if (k2 != N0) {
                g0Var = g0Var.o(g0Var.i(), N0, g0Var.j(), g0Var.h());
            }
            return y.J(view, g0Var);
        }
    }

    class d implements g0.a {
        d() {
        }

        public void a(Rect rect) {
            rect.top = f.this.N0((e.f.r.g0) null, rect);
        }
    }

    class e implements ContentFrameLayout.a {
        e() {
        }

        public void a() {
        }

        public void onDetachedFromWindow() {
            f.this.U();
        }
    }

    /* renamed from: androidx.appcompat.app.f$f  reason: collision with other inner class name */
    class C0009f implements Runnable {

        /* renamed from: androidx.appcompat.app.f$f$a */
        class a extends e0 {
            a() {
            }

            public void b(View view) {
                f.this.t.setAlpha(1.0f);
                f.this.w.g((d0) null);
                f.this.w = null;
            }

            public void c(View view) {
                f.this.t.setVisibility(0);
            }
        }

        C0009f() {
        }

        public void run() {
            f fVar = f.this;
            fVar.u.showAtLocation(fVar.t, 55, 0, 0);
            f.this.X();
            if (f.this.F0()) {
                f.this.t.setAlpha(0.0f);
                f fVar2 = f.this;
                e.f.r.c0 b = y.b(fVar2.t);
                b.a(1.0f);
                fVar2.w = b;
                f.this.w.g(new a());
                return;
            }
            f.this.t.setAlpha(1.0f);
            f.this.t.setVisibility(0);
        }
    }

    class g extends e0 {
        g() {
        }

        public void b(View view) {
            f.this.t.setAlpha(1.0f);
            f.this.w.g((d0) null);
            f.this.w = null;
        }

        public void c(View view) {
            f.this.t.setVisibility(0);
            f.this.t.sendAccessibilityEvent(32);
            if (f.this.t.getParent() instanceof View) {
                y.P((View) f.this.t.getParent());
            }
        }
    }

    private final class h implements m.a {
        h() {
        }

        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            f.this.N(gVar);
        }

        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback h0 = f.this.h0();
            if (h0 == null) {
                return true;
            }
            h0.onMenuOpened(108, gVar);
            return true;
        }
    }

    class i implements b.a {
        private b.a a;

        class a extends e0 {
            a() {
            }

            public void b(View view) {
                f.this.t.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.u;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.t.getParent() instanceof View) {
                    y.P((View) f.this.t.getParent());
                }
                f.this.t.k();
                f.this.w.g((d0) null);
                f fVar2 = f.this;
                fVar2.w = null;
                y.P(fVar2.z);
            }
        }

        public i(b.a aVar) {
            this.a = aVar;
        }

        public boolean a(e.a.n.b bVar, Menu menu) {
            y.P(f.this.z);
            return this.a.a(bVar, menu);
        }

        public void b(e.a.n.b bVar) {
            this.a.b(bVar);
            f fVar = f.this;
            if (fVar.u != null) {
                fVar.f158j.getDecorView().removeCallbacks(f.this.v);
            }
            f fVar2 = f.this;
            if (fVar2.t != null) {
                fVar2.X();
                f fVar3 = f.this;
                e.f.r.c0 b2 = y.b(fVar3.t);
                b2.a(0.0f);
                fVar3.w = b2;
                f.this.w.g(new a());
            }
            f fVar4 = f.this;
            d dVar = fVar4.f160l;
            if (dVar != null) {
                dVar.b(fVar4.f167s);
            }
            f fVar5 = f.this;
            fVar5.f167s = null;
            y.P(fVar5.z);
        }

        public boolean c(e.a.n.b bVar, MenuItem menuItem) {
            return this.a.c(bVar, menuItem);
        }

        public boolean d(e.a.n.b bVar, Menu menu) {
            return this.a.d(bVar, menu);
        }
    }

    static class j {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i2 = configuration.densityDpi;
            int i3 = configuration2.densityDpi;
            if (i2 != i3) {
                configuration3.densityDpi = i3;
            }
        }
    }

    static class k {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    static class m {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i2 = configuration.colorMode & 3;
            int i3 = configuration2.colorMode;
            if (i2 != (i3 & 3)) {
                configuration3.colorMode |= i3 & 3;
            }
            int i4 = configuration.colorMode & 12;
            int i5 = configuration2.colorMode;
            if (i4 != (i5 & 12)) {
                configuration3.colorMode |= i5 & 12;
            }
        }
    }

    class n extends e.a.n.i {
        n(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        public final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(f.this.f157i, callback);
            e.a.n.b H0 = f.this.H0(aVar);
            if (H0 != null) {
                return aVar.e(H0);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.V(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || f.this.t0(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i2, Menu menu) {
            super.onMenuOpened(i2, menu);
            f.this.w0(i2);
            return true;
        }

        public void onPanelClosed(int i2, Menu menu) {
            super.onPanelClosed(i2, menu);
            f.this.x0(i2);
        }

        public boolean onPreparePanel(int i2, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i2 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i2, view, menu);
            if (gVar != null) {
                gVar.a0(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            androidx.appcompat.view.menu.g gVar;
            t f0 = f.this.f0(0, true);
            if (f0 == null || (gVar = f0.f181j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i2);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return f.this.o0() ? b(callback) : super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            return (!f.this.o0() || i2 != 0) ? super.onWindowStartingActionMode(callback, i2) : b(callback);
        }
    }

    private class o extends p {
        private final PowerManager c;

        o(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !k.a(this.c)) ? 1 : 2;
        }

        public void d() {
            f.this.H();
        }
    }

    abstract class p {
        private BroadcastReceiver a;

        class a extends BroadcastReceiver {
            a() {
            }

            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        p() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    f.this.f157i.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public abstract IntentFilter b();

        /* access modifiers changed from: package-private */
        public abstract int c();

        /* access modifiers changed from: package-private */
        public abstract void d();

        /* access modifiers changed from: package-private */
        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 != null && b2.countActions() != 0) {
                if (this.a == null) {
                    this.a = new a();
                }
                f.this.f157i.registerReceiver(this.a, b2);
            }
        }
    }

    private class q extends p {
        private final m c;

        q(m mVar) {
            super();
            this.c = mVar;
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public int c() {
            return this.c.d() ? 2 : 1;
        }

        public void d() {
            f.this.H();
        }
    }

    private static class r {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    private class s extends ContentFrameLayout {
        public s(Context context) {
            super(context);
        }

        private boolean c(int i2, int i3) {
            return i2 < -5 || i3 < -5 || i2 > getWidth() + 5 || i3 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.V(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            f.this.P(0);
            return true;
        }

        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(e.a.k.a.a.d(getContext(), i2));
        }
    }

    protected static final class t {
        int a;
        int b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        int f175d;

        /* renamed from: e  reason: collision with root package name */
        int f176e;

        /* renamed from: f  reason: collision with root package name */
        int f177f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f178g;

        /* renamed from: h  reason: collision with root package name */
        View f179h;

        /* renamed from: i  reason: collision with root package name */
        View f180i;

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.view.menu.g f181j;

        /* renamed from: k  reason: collision with root package name */
        androidx.appcompat.view.menu.e f182k;

        /* renamed from: l  reason: collision with root package name */
        Context f183l;

        /* renamed from: m  reason: collision with root package name */
        boolean f184m;

        /* renamed from: n  reason: collision with root package name */
        boolean f185n;

        /* renamed from: o  reason: collision with root package name */
        boolean f186o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f187p;

        /* renamed from: q  reason: collision with root package name */
        boolean f188q = false;

        /* renamed from: r  reason: collision with root package name */
        boolean f189r;

        /* renamed from: s  reason: collision with root package name */
        Bundle f190s;

        t(int i2) {
            this.a = i2;
        }

        /* access modifiers changed from: package-private */
        public androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.f181j == null) {
                return null;
            }
            if (this.f182k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f183l, e.a.g.abc_list_menu_item_layout);
                this.f182k = eVar;
                eVar.j(aVar);
                this.f181j.b(this.f182k);
            }
            return this.f182k.f(this.f178g);
        }

        public boolean b() {
            if (this.f179h == null) {
                return false;
            }
            return this.f180i != null || this.f182k.b().getCount() > 0;
        }

        /* access modifiers changed from: package-private */
        public void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f181j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.O(this.f182k);
                }
                this.f181j = gVar;
                if (gVar != null && (eVar = this.f182k) != null) {
                    gVar.b(eVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(e.a.a.actionBarPopupTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            }
            newTheme.resolveAttribute(e.a.a.panelMenuListTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 == 0) {
                i3 = e.a.i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i3, true);
            e.a.n.d dVar = new e.a.n.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f183l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(e.a.j.u0);
            this.b = obtainStyledAttributes.getResourceId(e.a.j.x0, 0);
            this.f177f = obtainStyledAttributes.getResourceId(e.a.j.w0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    private final class u implements m.a {
        u() {
        }

        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            androidx.appcompat.view.menu.g D = gVar.D();
            boolean z2 = D != gVar;
            f fVar = f.this;
            if (z2) {
                gVar = D;
            }
            t a0 = fVar.a0(gVar);
            if (a0 == null) {
                return;
            }
            if (z2) {
                f.this.M(a0.a, a0, D);
                f.this.Q(a0, true);
                return;
            }
            f.this.Q(a0, z);
        }

        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback h0;
            if (gVar != gVar.D()) {
                return true;
            }
            f fVar = f.this;
            if (!fVar.E || (h0 = fVar.h0()) == null || f.this.Q) {
                return true;
            }
            h0.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        boolean z3 = i2 < 21;
        g0 = z3;
        if (i2 >= 17) {
            z2 = true;
        }
        j0 = z2;
        if (z3 && !k0) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    f(Activity activity, d dVar) {
        this(activity, (Window) null, dVar, activity);
    }

    f(Dialog dialog, d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        r3 = f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private f(android.content.Context r3, android.view.Window r4, androidx.appcompat.app.d r5, java.lang.Object r6) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.w = r0
            r0 = 1
            r2.x = r0
            r0 = -100
            r2.R = r0
            androidx.appcompat.app.f$b r1 = new androidx.appcompat.app.f$b
            r1.<init>()
            r2.Z = r1
            r2.f157i = r3
            r2.f160l = r5
            r2.f156h = r6
            boolean r3 = r6 instanceof android.app.Dialog
            if (r3 == 0) goto L_0x002e
            androidx.appcompat.app.c r3 = r2.K0()
            if (r3 == 0) goto L_0x002e
            androidx.appcompat.app.e r3 = r3.e()
            int r3 = r3.k()
            r2.R = r3
        L_0x002e:
            int r3 = r2.R
            if (r3 != r0) goto L_0x0055
            e.e.g<java.lang.String, java.lang.Integer> r3 = f0
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r3.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0055
            int r5 = r5.intValue()
            r2.R = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r3.remove(r5)
        L_0x0055:
            if (r4 == 0) goto L_0x005a
            r2.K(r4)
        L_0x005a:
            androidx.appcompat.widget.j.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.<init>(android.content.Context, android.view.Window, androidx.appcompat.app.d, java.lang.Object):void");
    }

    private boolean B0(t tVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.g gVar;
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((tVar.f184m || C0(tVar, keyEvent)) && (gVar = tVar.f181j) != null) {
            z2 = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z2 && (i3 & 1) == 0 && this.f164p == null) {
            Q(tVar, true);
        }
        return z2;
    }

    private boolean C0(t tVar, KeyEvent keyEvent) {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        c0 c0Var4;
        if (this.Q) {
            return false;
        }
        if (tVar.f184m) {
            return true;
        }
        t tVar2 = this.L;
        if (!(tVar2 == null || tVar2 == tVar)) {
            Q(tVar2, false);
        }
        Window.Callback h02 = h0();
        if (h02 != null) {
            tVar.f180i = h02.onCreatePanelView(tVar.a);
        }
        int i2 = tVar.a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (c0Var4 = this.f164p) != null) {
            c0Var4.c();
        }
        if (tVar.f180i == null && (!z2 || !(A0() instanceof k))) {
            androidx.appcompat.view.menu.g gVar = tVar.f181j;
            if (gVar == null || tVar.f189r) {
                if (gVar == null && (!l0(tVar) || tVar.f181j == null)) {
                    return false;
                }
                if (z2 && (c0Var3 = this.f164p) != null) {
                    if (this.f165q == null) {
                        this.f165q = new h();
                    }
                    c0Var3.a(tVar.f181j, this.f165q);
                }
                tVar.f181j.d0();
                if (!h02.onCreatePanelMenu(tVar.a, tVar.f181j)) {
                    tVar.c((androidx.appcompat.view.menu.g) null);
                    if (z2 && (c0Var2 = this.f164p) != null) {
                        c0Var2.a((Menu) null, this.f165q);
                    }
                    return false;
                }
                tVar.f189r = false;
            }
            tVar.f181j.d0();
            Bundle bundle = tVar.f190s;
            if (bundle != null) {
                tVar.f181j.P(bundle);
                tVar.f190s = null;
            }
            if (!h02.onPreparePanel(0, tVar.f180i, tVar.f181j)) {
                if (z2 && (c0Var = this.f164p) != null) {
                    c0Var.a((Menu) null, this.f165q);
                }
                tVar.f181j.c0();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            tVar.f187p = z3;
            tVar.f181j.setQwertyMode(z3);
            tVar.f181j.c0();
        }
        tVar.f184m = true;
        tVar.f185n = false;
        this.L = tVar;
        return true;
    }

    private void D0(boolean z2) {
        c0 c0Var = this.f164p;
        if (c0Var == null || !c0Var.g() || (ViewConfiguration.get(this.f157i).hasPermanentMenuKey() && !this.f164p.d())) {
            t f02 = f0(0, true);
            f02.f188q = true;
            Q(f02, false);
            z0(f02, (KeyEvent) null);
            return;
        }
        Window.Callback h02 = h0();
        if (this.f164p.b() && z2) {
            this.f164p.e();
            if (!this.Q) {
                h02.onPanelClosed(108, f0(0, true).f181j);
            }
        } else if (h02 != null && !this.Q) {
            if (this.X && (this.Y & 1) != 0) {
                this.f158j.getDecorView().removeCallbacks(this.Z);
                this.Z.run();
            }
            t f03 = f0(0, true);
            androidx.appcompat.view.menu.g gVar = f03.f181j;
            if (gVar != null && !f03.f189r && h02.onPreparePanel(0, f03.f180i, gVar)) {
                h02.onMenuOpened(108, f03.f181j);
                this.f164p.f();
            }
        }
    }

    private int E0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i2 != 9) {
            return i2;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    private boolean G0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f158j.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || y.C((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean I(boolean z2) {
        if (this.Q) {
            return false;
        }
        int L2 = L();
        boolean L0 = L0(p0(this.f157i, L2), z2);
        if (L2 == 0) {
            e0(this.f157i).e();
        } else {
            p pVar = this.V;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (L2 == 3) {
            d0(this.f157i).e();
        } else {
            p pVar2 = this.W;
            if (pVar2 != null) {
                pVar2.a();
            }
        }
        return L0;
    }

    private void J() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.z.findViewById(16908290);
        View decorView = this.f158j.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f157i.obtainStyledAttributes(e.a.j.u0);
        obtainStyledAttributes.getValue(e.a.j.G0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(e.a.j.H0, contentFrameLayout.getMinWidthMinor());
        int i2 = e.a.j.E0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = e.a.j.F0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = e.a.j.C0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = e.a.j.D0;
        if (obtainStyledAttributes.hasValue(i5)) {
            obtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void J0() {
        if (this.y) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void K(Window window) {
        if (this.f158j == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof n)) {
                n nVar = new n(callback);
                this.f159k = nVar;
                window.setCallback(nVar);
                w0 t2 = w0.t(this.f157i, (AttributeSet) null, h0);
                Drawable g2 = t2.g(0);
                if (g2 != null) {
                    window.setBackgroundDrawable(g2);
                }
                t2.v();
                this.f158j = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private c K0() {
        Context context = this.f157i;
        while (context != null) {
            if (!(context instanceof c)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (c) context;
            }
        }
        return null;
    }

    private int L() {
        int i2 = this.R;
        return i2 != -100 ? i2 : e.j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean L0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f157i
            r1 = 0
            android.content.res.Configuration r0 = r6.R(r0, r7, r1)
            boolean r2 = r6.n0()
            android.content.Context r3 = r6.f157i
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L_0x0047
            if (r8 == 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            boolean r8 = r6.N
            if (r8 == 0) goto L_0x0047
            boolean r8 = i0
            if (r8 != 0) goto L_0x0030
            boolean r8 = r6.O
            if (r8 == 0) goto L_0x0047
        L_0x0030:
            java.lang.Object r8 = r6.f156h
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0047
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L_0x0047
            java.lang.Object r8 = r6.f156h
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.c.r(r8)
            r8 = 1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            if (r8 != 0) goto L_0x0050
            if (r3 == r0) goto L_0x0050
            r6.M0(r0, r2, r1)
            goto L_0x0051
        L_0x0050:
            r4 = r8
        L_0x0051:
            if (r4 == 0) goto L_0x005e
            java.lang.Object r8 = r6.f156h
            boolean r0 = r8 instanceof androidx.appcompat.app.c
            if (r0 == 0) goto L_0x005e
            androidx.appcompat.app.c r8 = (androidx.appcompat.app.c) r8
            r8.i(r7)
        L_0x005e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.L0(int, boolean):boolean");
    }

    private void M0(int i2, boolean z2, Configuration configuration) {
        Resources resources = this.f157i.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            j.a(resources);
        }
        int i4 = this.S;
        if (i4 != 0) {
            this.f157i.setTheme(i4);
            if (i3 >= 23) {
                this.f157i.getTheme().applyStyle(this.S, true);
            }
        }
        if (z2) {
            Object obj = this.f156h;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.h) {
                    if (!((androidx.lifecycle.h) activity).getLifecycle().b().a(e.c.STARTED)) {
                        return;
                    }
                } else if (!this.P) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    private void O() {
        p pVar = this.V;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.W;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    private void O0(View view) {
        int i2;
        Context context;
        if ((y.y(view) & 8192) != 0) {
            context = this.f157i;
            i2 = e.a.c.abc_decor_view_status_guard_light;
        } else {
            context = this.f157i;
            i2 = e.a.c.abc_decor_view_status_guard;
        }
        view.setBackgroundColor(e.f.j.a.d(context, i2));
    }

    private Configuration R(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & -49);
        return configuration2;
    }

    private ViewGroup S() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f157i.obtainStyledAttributes(e.a.j.u0);
        int i2 = e.a.j.z0;
        if (obtainStyledAttributes.hasValue(i2)) {
            if (obtainStyledAttributes.getBoolean(e.a.j.I0, false)) {
                z(1);
            } else if (obtainStyledAttributes.getBoolean(i2, false)) {
                z(108);
            }
            if (obtainStyledAttributes.getBoolean(e.a.j.A0, false)) {
                z(109);
            }
            if (obtainStyledAttributes.getBoolean(e.a.j.B0, false)) {
                z(10);
            }
            this.H = obtainStyledAttributes.getBoolean(e.a.j.v0, false);
            obtainStyledAttributes.recycle();
            Z();
            this.f158j.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f157i);
            if (this.I) {
                viewGroup = (ViewGroup) from.inflate(this.G ? e.a.g.abc_screen_simple_overlay_action_mode : e.a.g.abc_screen_simple, (ViewGroup) null);
            } else if (this.H) {
                viewGroup = (ViewGroup) from.inflate(e.a.g.abc_dialog_title_material, (ViewGroup) null);
                this.F = false;
                this.E = false;
            } else if (this.E) {
                TypedValue typedValue = new TypedValue();
                this.f157i.getTheme().resolveAttribute(e.a.a.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new e.a.n.d(this.f157i, typedValue.resourceId) : this.f157i).inflate(e.a.g.abc_screen_toolbar, (ViewGroup) null);
                c0 c0Var = (c0) viewGroup.findViewById(e.a.f.decor_content_parent);
                this.f164p = c0Var;
                c0Var.setWindowCallback(h0());
                if (this.F) {
                    this.f164p.k(109);
                }
                if (this.C) {
                    this.f164p.k(2);
                }
                if (this.D) {
                    this.f164p.k(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    y.a0(viewGroup, new c());
                } else if (viewGroup instanceof androidx.appcompat.widget.g0) {
                    ((androidx.appcompat.widget.g0) viewGroup).setOnFitSystemWindowsListener(new d());
                }
                if (this.f164p == null) {
                    this.A = (TextView) viewGroup.findViewById(e.a.f.M);
                }
                c1.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(e.a.f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f158j.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f158j.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.E + ", windowActionBarOverlay: " + this.F + ", android:windowIsFloating: " + this.H + ", windowActionModeOverlay: " + this.G + ", windowNoTitle: " + this.I + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void Y() {
        if (!this.y) {
            this.z = S();
            CharSequence g02 = g0();
            if (!TextUtils.isEmpty(g02)) {
                c0 c0Var = this.f164p;
                if (c0Var != null) {
                    c0Var.setWindowTitle(g02);
                } else if (A0() != null) {
                    A0().u(g02);
                } else {
                    TextView textView = this.A;
                    if (textView != null) {
                        textView.setText(g02);
                    }
                }
            }
            J();
            y0(this.z);
            this.y = true;
            t f02 = f0(0, false);
            if (this.Q) {
                return;
            }
            if (f02 == null || f02.f181j == null) {
                m0(108);
            }
        }
    }

    private void Z() {
        if (this.f158j == null) {
            Object obj = this.f156h;
            if (obj instanceof Activity) {
                K(((Activity) obj).getWindow());
            }
        }
        if (this.f158j == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration b0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                l.a(configuration, configuration2, configuration3);
            } else if (!e.f.q.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i7 = configuration.touchscreen;
            int i8 = configuration2.touchscreen;
            if (i7 != i8) {
                configuration3.touchscreen = i8;
            }
            int i9 = configuration.keyboard;
            int i10 = configuration2.keyboard;
            if (i9 != i10) {
                configuration3.keyboard = i10;
            }
            int i11 = configuration.keyboardHidden;
            int i12 = configuration2.keyboardHidden;
            if (i11 != i12) {
                configuration3.keyboardHidden = i12;
            }
            int i13 = configuration.navigation;
            int i14 = configuration2.navigation;
            if (i13 != i14) {
                configuration3.navigation = i14;
            }
            int i15 = configuration.navigationHidden;
            int i16 = configuration2.navigationHidden;
            if (i15 != i16) {
                configuration3.navigationHidden = i16;
            }
            int i17 = configuration.orientation;
            int i18 = configuration2.orientation;
            if (i17 != i18) {
                configuration3.orientation = i18;
            }
            int i19 = configuration.screenLayout & 15;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 15)) {
                configuration3.screenLayout |= i20 & 15;
            }
            int i21 = configuration.screenLayout & 192;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 192)) {
                configuration3.screenLayout |= i22 & 192;
            }
            int i23 = configuration.screenLayout & 48;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 48)) {
                configuration3.screenLayout |= i24 & 48;
            }
            int i25 = configuration.screenLayout & 768;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 768)) {
                configuration3.screenLayout |= i26 & 768;
            }
            if (i6 >= 26) {
                m.a(configuration, configuration2, configuration3);
            }
            int i27 = configuration.uiMode & 15;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 15)) {
                configuration3.uiMode |= i28 & 15;
            }
            int i29 = configuration.uiMode & 48;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 48)) {
                configuration3.uiMode |= i30 & 48;
            }
            int i31 = configuration.screenWidthDp;
            int i32 = configuration2.screenWidthDp;
            if (i31 != i32) {
                configuration3.screenWidthDp = i32;
            }
            int i33 = configuration.screenHeightDp;
            int i34 = configuration2.screenHeightDp;
            if (i33 != i34) {
                configuration3.screenHeightDp = i34;
            }
            int i35 = configuration.smallestScreenWidthDp;
            int i36 = configuration2.smallestScreenWidthDp;
            if (i35 != i36) {
                configuration3.smallestScreenWidthDp = i36;
            }
            if (i6 >= 17) {
                j.b(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    private p d0(Context context) {
        if (this.W == null) {
            this.W = new o(context);
        }
        return this.W;
    }

    private p e0(Context context) {
        if (this.V == null) {
            this.V = new q(m.a(context));
        }
        return this.V;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i0() {
        /*
            r3 = this;
            r3.Y()
            boolean r0 = r3.E
            if (r0 == 0) goto L_0x0037
            androidx.appcompat.app.a r0 = r3.f161m
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.f156h
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            androidx.appcompat.app.n r0 = new androidx.appcompat.app.n
            java.lang.Object r1 = r3.f156h
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.F
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f161m = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            androidx.appcompat.app.n r0 = new androidx.appcompat.app.n
            java.lang.Object r1 = r3.f156h
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x002e:
            androidx.appcompat.app.a r0 = r3.f161m
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.a0
            r0.r(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.i0():void");
    }

    private boolean j0(t tVar) {
        View view = tVar.f180i;
        if (view != null) {
            tVar.f179h = view;
            return true;
        } else if (tVar.f181j == null) {
            return false;
        } else {
            if (this.f166r == null) {
                this.f166r = new u();
            }
            View view2 = (View) tVar.a(this.f166r);
            tVar.f179h = view2;
            return view2 != null;
        }
    }

    private boolean k0(t tVar) {
        tVar.d(c0());
        tVar.f178g = new s(tVar.f183l);
        tVar.c = 81;
        return true;
    }

    private boolean l0(t tVar) {
        Context context = this.f157i;
        int i2 = tVar.a;
        if ((i2 == 0 || i2 == 108) && this.f164p != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(e.a.a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(e.a.a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(e.a.a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                e.a.n.d dVar = new e.a.n.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.R(this);
        tVar.c(gVar);
        return true;
    }

    private void m0(int i2) {
        this.Y = (1 << i2) | this.Y;
        if (!this.X) {
            y.N(this.f158j.getDecorView(), this.Z);
            this.X = true;
        }
    }

    private boolean n0() {
        if (!this.U && (this.f156h instanceof Activity)) {
            PackageManager packageManager = this.f157i.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f157i, this.f156h.getClass()), i2 >= 29 ? 269221888 : i2 >= 24 ? 786432 : 0);
                this.T = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.T = false;
            }
        }
        this.U = true;
        return this.T;
    }

    private boolean s0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        t f02 = f0(i2, true);
        if (!f02.f186o) {
            return C0(f02, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean v0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            e.a.n.b r0 = r4.f167s
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.f$t r2 = r4.f0(r5, r0)
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.c0 r5 = r4.f164p
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.f157i
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.c0 r5 = r4.f164p
            boolean r5 = r5.b()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.Q
            if (r5 != 0) goto L_0x0062
            boolean r5 = r4.C0(r2, r6)
            if (r5 == 0) goto L_0x0062
            androidx.appcompat.widget.c0 r5 = r4.f164p
            boolean r0 = r5.f()
            goto L_0x0068
        L_0x003c:
            androidx.appcompat.widget.c0 r5 = r4.f164p
            boolean r0 = r5.e()
            goto L_0x0068
        L_0x0043:
            boolean r5 = r2.f186o
            if (r5 != 0) goto L_0x0064
            boolean r3 = r2.f185n
            if (r3 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r5 = r2.f184m
            if (r5 == 0) goto L_0x0062
            boolean r5 = r2.f189r
            if (r5 == 0) goto L_0x005b
            r2.f184m = r1
            boolean r5 = r4.C0(r2, r6)
            goto L_0x005c
        L_0x005b:
            r5 = 1
        L_0x005c:
            if (r5 == 0) goto L_0x0062
            r4.z0(r2, r6)
            goto L_0x0068
        L_0x0062:
            r0 = 0
            goto L_0x0068
        L_0x0064:
            r4.Q(r2, r0)
            r0 = r5
        L_0x0068:
            if (r0 == 0) goto L_0x0085
            android.content.Context r5 = r4.f157i
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.v0(int, android.view.KeyEvent):boolean");
    }

    private void z0(t tVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (!tVar.f186o && !this.Q) {
            if (tVar.a == 0) {
                if ((this.f157i.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback h02 = h0();
            if (h02 == null || h02.onMenuOpened(tVar.a, tVar.f181j)) {
                WindowManager windowManager = (WindowManager) this.f157i.getSystemService("window");
                if (windowManager != null && C0(tVar, keyEvent)) {
                    ViewGroup viewGroup = tVar.f178g;
                    if (viewGroup == null || tVar.f188q) {
                        if (viewGroup == null) {
                            if (!k0(tVar) || tVar.f178g == null) {
                                return;
                            }
                        } else if (tVar.f188q && viewGroup.getChildCount() > 0) {
                            tVar.f178g.removeAllViews();
                        }
                        if (!j0(tVar) || !tVar.b()) {
                            tVar.f188q = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = tVar.f179h.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        tVar.f178g.setBackgroundResource(tVar.b);
                        ViewParent parent = tVar.f179h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(tVar.f179h);
                        }
                        tVar.f178g.addView(tVar.f179h, layoutParams2);
                        if (!tVar.f179h.hasFocus()) {
                            tVar.f179h.requestFocus();
                        }
                    } else {
                        View view = tVar.f180i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i2 = -1;
                            tVar.f185n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, tVar.f175d, tVar.f176e, 1002, 8519680, -3);
                            layoutParams3.gravity = tVar.c;
                            layoutParams3.windowAnimations = tVar.f177f;
                            windowManager.addView(tVar.f178g, layoutParams3);
                            tVar.f186o = true;
                            return;
                        }
                    }
                    i2 = -2;
                    tVar.f185n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, tVar.f175d, tVar.f176e, 1002, 8519680, -3);
                    layoutParams32.gravity = tVar.c;
                    layoutParams32.windowAnimations = tVar.f177f;
                    windowManager.addView(tVar.f178g, layoutParams32);
                    tVar.f186o = true;
                    return;
                }
                return;
            }
            Q(tVar, true);
        }
    }

    /* access modifiers changed from: package-private */
    public final a A0() {
        return this.f161m;
    }

    public void B(int i2) {
        Y();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f157i).inflate(i2, viewGroup);
        this.f159k.a().onContentChanged();
    }

    public void C(View view) {
        Y();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f159k.a().onContentChanged();
    }

    public void D(View view, ViewGroup.LayoutParams layoutParams) {
        Y();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f159k.a().onContentChanged();
    }

    public void E(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (this.f156h instanceof Activity) {
            a m2 = m();
            if (!(m2 instanceof n)) {
                this.f162n = null;
                if (m2 != null) {
                    m2.n();
                }
                if (toolbar != null) {
                    k kVar = new k(toolbar, g0(), this.f159k);
                    this.f161m = kVar;
                    window = this.f158j;
                    callback = kVar.x();
                } else {
                    this.f161m = null;
                    window = this.f158j;
                    callback = this.f159k;
                }
                window.setCallback(callback);
                o();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public void F(int i2) {
        this.S = i2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.z;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean F0() {
        /*
            r1 = this;
            boolean r0 = r1.y
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.z
            if (r0 == 0) goto L_0x0010
            boolean r0 = e.f.r.y.D(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.F0():boolean");
    }

    public final void G(CharSequence charSequence) {
        this.f163o = charSequence;
        c0 c0Var = this.f164p;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
        } else if (A0() != null) {
            A0().u(charSequence);
        } else {
            TextView textView = this.A;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public boolean H() {
        return I(true);
    }

    public e.a.n.b H0(b.a aVar) {
        d dVar;
        if (aVar != null) {
            e.a.n.b bVar = this.f167s;
            if (bVar != null) {
                bVar.c();
            }
            i iVar = new i(aVar);
            a m2 = m();
            if (m2 != null) {
                e.a.n.b v2 = m2.v(iVar);
                this.f167s = v2;
                if (!(v2 == null || (dVar = this.f160l) == null)) {
                    dVar.a(v2);
                }
            }
            if (this.f167s == null) {
                this.f167s = I0(iVar);
            }
            return this.f167s;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e.a.n.b I0(e.a.n.b.a r8) {
        /*
            r7 = this;
            r7.X()
            e.a.n.b r0 = r7.f167s
            if (r0 == 0) goto L_0x000a
            r0.c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.f.i
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.f$i r0 = new androidx.appcompat.app.f$i
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.d r0 = r7.f160l
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.Q
            if (r2 != 0) goto L_0x0022
            e.a.n.b r0 = r0.d(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f167s = r0
            goto L_0x0161
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.t
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.H
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f157i
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = e.a.a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f157i
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            e.a.n.d r4 = new e.a.n.d
            android.content.Context r6 = r7.f157i
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f157i
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.t = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = e.a.a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.u = r5
            r6 = 2
            androidx.core.widget.h.b(r5, r6)
            android.widget.PopupWindow r5 = r7.u
            androidx.appcompat.widget.ActionBarContextView r6 = r7.t
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.u
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = e.a.a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.t
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.u
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.f$f r0 = new androidx.appcompat.app.f$f
            r0.<init>()
            r7.v = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.z
            int r4 = e.a.f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.c0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.t = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.t
            if (r0 == 0) goto L_0x0161
            r7.X()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.t
            r0.k()
            e.a.n.e r0 = new e.a.n.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.t
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.t
            android.widget.PopupWindow r6 = r7.u
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.e()
            boolean r8 = r8.d(r0, r3)
            if (r8 == 0) goto L_0x015f
            r0.k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            r8.h(r0)
            r7.f167s = r0
            boolean r8 = r7.F0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x0129
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            e.f.r.c0 r8 = e.f.r.y.b(r8)
            r8.a(r0)
            r7.w = r8
            androidx.appcompat.app.f$g r0 = new androidx.appcompat.app.f$g
            r0.<init>()
            r8.g(r0)
            goto L_0x014f
        L_0x0129:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x014f
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            e.f.r.y.P(r8)
        L_0x014f:
            android.widget.PopupWindow r8 = r7.u
            if (r8 == 0) goto L_0x0161
            android.view.Window r8 = r7.f158j
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.v
            r8.post(r0)
            goto L_0x0161
        L_0x015f:
            r7.f167s = r1
        L_0x0161:
            e.a.n.b r8 = r7.f167s
            if (r8 == 0) goto L_0x016c
            androidx.appcompat.app.d r0 = r7.f160l
            if (r0 == 0) goto L_0x016c
            r0.a(r8)
        L_0x016c:
            e.a.n.b r8 = r7.f167s
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.I0(e.a.n.b$a):e.a.n.b");
    }

    /* access modifiers changed from: package-private */
    public void M(int i2, t tVar, Menu menu) {
        if (menu == null) {
            if (tVar == null && i2 >= 0) {
                t[] tVarArr = this.K;
                if (i2 < tVarArr.length) {
                    tVar = tVarArr[i2];
                }
            }
            if (tVar != null) {
                menu = tVar.f181j;
            }
        }
        if ((tVar == null || tVar.f186o) && !this.Q) {
            this.f159k.a().onPanelClosed(i2, menu);
        }
    }

    /* access modifiers changed from: package-private */
    public void N(androidx.appcompat.view.menu.g gVar) {
        if (!this.J) {
            this.J = true;
            this.f164p.l();
            Window.Callback h02 = h0();
            if (h02 != null && !this.Q) {
                h02.onPanelClosed(108, gVar);
            }
            this.J = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final int N0(e.f.r.g0 g0Var, Rect rect) {
        boolean z2;
        boolean z3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        int i3 = 0;
        int k2 = g0Var != null ? g0Var.k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.t;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
            boolean z4 = true;
            if (this.t.isShown()) {
                if (this.b0 == null) {
                    this.b0 = new Rect();
                    this.c0 = new Rect();
                }
                Rect rect2 = this.b0;
                Rect rect3 = this.c0;
                if (g0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(g0Var.i(), g0Var.k(), g0Var.j(), g0Var.h());
                }
                c1.a(this.z, rect2, rect3);
                int i4 = rect2.top;
                int i5 = rect2.left;
                int i6 = rect2.right;
                e.f.r.g0 v2 = y.v(this.z);
                int i7 = v2 == null ? 0 : v2.i();
                int j2 = v2 == null ? 0 : v2.j();
                if (marginLayoutParams2.topMargin == i4 && marginLayoutParams2.leftMargin == i5 && marginLayoutParams2.rightMargin == i6) {
                    z3 = false;
                } else {
                    marginLayoutParams2.topMargin = i4;
                    marginLayoutParams2.leftMargin = i5;
                    marginLayoutParams2.rightMargin = i6;
                    z3 = true;
                }
                if (i4 <= 0 || this.B != null) {
                    View view = this.B;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i2 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i7 && marginLayoutParams.rightMargin == j2))) {
                        marginLayoutParams.height = i2;
                        marginLayoutParams.leftMargin = i7;
                        marginLayoutParams.rightMargin = j2;
                        this.B.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f157i);
                    this.B = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i7;
                    layoutParams.rightMargin = j2;
                    this.z.addView(this.B, -1, layoutParams);
                }
                View view3 = this.B;
                if (view3 == null) {
                    z4 = false;
                }
                if (z4 && view3.getVisibility() != 0) {
                    O0(this.B);
                }
                if (!this.G && z4) {
                    k2 = 0;
                }
                z2 = z4;
                z4 = z3;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z4 = false;
            }
            if (z4) {
                this.t.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.B;
        if (view4 != null) {
            if (!z2) {
                i3 = 8;
            }
            view4.setVisibility(i3);
        }
        return k2;
    }

    /* access modifiers changed from: package-private */
    public void P(int i2) {
        Q(f0(i2, true), true);
    }

    /* access modifiers changed from: package-private */
    public void Q(t tVar, boolean z2) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (!z2 || tVar.a != 0 || (c0Var = this.f164p) == null || !c0Var.b()) {
            WindowManager windowManager = (WindowManager) this.f157i.getSystemService("window");
            if (!(windowManager == null || !tVar.f186o || (viewGroup = tVar.f178g) == null)) {
                windowManager.removeView(viewGroup);
                if (z2) {
                    M(tVar.a, tVar, (Menu) null);
                }
            }
            tVar.f184m = false;
            tVar.f185n = false;
            tVar.f186o = false;
            tVar.f179h = null;
            tVar.f188q = true;
            if (this.L == tVar) {
                this.L = null;
                return;
            }
            return;
        }
        N(tVar.f181j);
    }

    public View T(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        h hVar;
        boolean z3 = false;
        if (this.d0 == null) {
            String string = this.f157i.obtainStyledAttributes(e.a.j.u0).getString(e.a.j.y0);
            if (string == null) {
                hVar = new h();
            } else {
                try {
                    this.d0 = (h) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    hVar = new h();
                }
            }
            this.d0 = hVar;
        }
        boolean z4 = g0;
        if (z4) {
            if (this.e0 == null) {
                this.e0 = new i();
            }
            if (this.e0.a(attributeSet)) {
                z2 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    z3 = G0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z3 = true;
                }
                z2 = z3;
            }
        } else {
            z2 = false;
        }
        return this.d0.q(view, str, context, attributeSet, z2, z4, true, b1.c());
    }

    /* access modifiers changed from: package-private */
    public void U() {
        androidx.appcompat.view.menu.g gVar;
        c0 c0Var = this.f164p;
        if (c0Var != null) {
            c0Var.l();
        }
        if (this.u != null) {
            this.f158j.getDecorView().removeCallbacks(this.v);
            if (this.u.isShowing()) {
                try {
                    this.u.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.u = null;
        }
        X();
        t f02 = f0(0, false);
        if (f02 != null && (gVar = f02.f181j) != null) {
            gVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean V(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f156h;
        boolean z2 = true;
        if (((obj instanceof i.a) || (obj instanceof g)) && (decorView = this.f158j.getDecorView()) != null && e.f.r.i.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f159k.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z2 = false;
        }
        return z2 ? r0(keyCode, keyEvent) : u0(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public void W(int i2) {
        t f02;
        t f03 = f0(i2, true);
        if (f03.f181j != null) {
            Bundle bundle = new Bundle();
            f03.f181j.Q(bundle);
            if (bundle.size() > 0) {
                f03.f190s = bundle;
            }
            f03.f181j.d0();
            f03.f181j.clear();
        }
        f03.f189r = true;
        f03.f188q = true;
        if ((i2 == 108 || i2 == 0) && this.f164p != null && (f02 = f0(0, false)) != null) {
            f02.f184m = false;
            C0(f02, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void X() {
        e.f.r.c0 c0Var = this.w;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        t a02;
        Window.Callback h02 = h0();
        if (h02 == null || this.Q || (a02 = a0(gVar.D())) == null) {
            return false;
        }
        return h02.onMenuItemSelected(a02.a, menuItem);
    }

    /* access modifiers changed from: package-private */
    public t a0(Menu menu) {
        t[] tVarArr = this.K;
        int length = tVarArr != null ? tVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            t tVar = tVarArr[i2];
            if (tVar != null && tVar.f181j == menu) {
                return tVar;
            }
        }
        return null;
    }

    public void b(androidx.appcompat.view.menu.g gVar) {
        D0(true);
    }

    /* access modifiers changed from: package-private */
    public final Context c0() {
        a m2 = m();
        Context k2 = m2 != null ? m2.k() : null;
        return k2 == null ? this.f157i : k2;
    }

    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        Y();
        ((ViewGroup) this.z.findViewById(16908290)).addView(view, layoutParams);
        this.f159k.a().onContentChanged();
    }

    public Context f(Context context) {
        boolean z2 = true;
        this.N = true;
        int p0 = p0(context, L());
        Configuration configuration = null;
        if (j0 && (context instanceof ContextThemeWrapper)) {
            try {
                r.a((ContextThemeWrapper) context, R(context, p0, (Configuration) null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof e.a.n.d) {
            try {
                ((e.a.n.d) context).a(R(context, p0, (Configuration) null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!i0) {
            super.f(context);
            return context;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = j.a(context, configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = b0(configuration3, configuration4);
            }
        }
        Configuration R2 = R(context, p0, configuration);
        e.a.n.d dVar = new e.a.n.d(context, e.a.i.Theme_AppCompat_Empty);
        dVar.a(R2);
        boolean z3 = false;
        try {
            if (context.getTheme() == null) {
                z2 = false;
            }
            z3 = z2;
        } catch (NullPointerException unused3) {
        }
        if (z3) {
            j.f.a(dVar.getTheme());
        }
        super.f(dVar);
        return dVar;
    }

    /* access modifiers changed from: protected */
    public t f0(int i2, boolean z2) {
        t[] tVarArr = this.K;
        if (tVarArr == null || tVarArr.length <= i2) {
            t[] tVarArr2 = new t[(i2 + 1)];
            if (tVarArr != null) {
                System.arraycopy(tVarArr, 0, tVarArr2, 0, tVarArr.length);
            }
            this.K = tVarArr2;
            tVarArr = tVarArr2;
        }
        t tVar = tVarArr[i2];
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(i2);
        tVarArr[i2] = tVar2;
        return tVar2;
    }

    /* access modifiers changed from: package-private */
    public final CharSequence g0() {
        Object obj = this.f156h;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f163o;
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback h0() {
        return this.f158j.getCallback();
    }

    public <T extends View> T i(int i2) {
        Y();
        return this.f158j.findViewById(i2);
    }

    public int k() {
        return this.R;
    }

    public MenuInflater l() {
        if (this.f162n == null) {
            i0();
            a aVar = this.f161m;
            this.f162n = new e.a.n.g(aVar != null ? aVar.k() : this.f157i);
        }
        return this.f162n;
    }

    public a m() {
        i0();
        return this.f161m;
    }

    public void n() {
        LayoutInflater from = LayoutInflater.from(this.f157i);
        if (from.getFactory() == null) {
            e.f.r.j.b(from, this);
        } else if (!(from.getFactory2() instanceof f)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public void o() {
        a m2 = m();
        if (m2 == null || !m2.l()) {
            m0(0);
        }
    }

    public boolean o0() {
        return this.x;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return T(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public void p(Configuration configuration) {
        a m2;
        if (this.E && this.y && (m2 = m()) != null) {
            m2.m(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.f157i);
        I(false);
    }

    /* access modifiers changed from: package-private */
    public int p0(Context context, int i2) {
        p e02;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (!(i2 == 1 || i2 == 2)) {
                    if (i2 == 3) {
                        e02 = d0(context);
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                e02 = e0(context);
            }
            return e02.c();
        }
        return i2;
    }

    public void q(Bundle bundle) {
        this.N = true;
        I(false);
        Z();
        Object obj = this.f156h;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.j.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a A0 = A0();
                if (A0 == null) {
                    this.a0 = true;
                } else {
                    A0.r(true);
                }
            }
            e.c(this);
        }
        this.O = true;
    }

    /* access modifiers changed from: package-private */
    public boolean q0() {
        e.a.n.b bVar = this.f167s;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        a m2 = m();
        return m2 != null && m2.h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void r() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f156h
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.e.x(r3)
        L_0x0009:
            boolean r0 = r3.X
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f158j
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.Z
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 0
            r3.P = r0
            r0 = 1
            r3.Q = r0
            int r0 = r3.R
            r1 = -100
            if (r0 == r1) goto L_0x0048
            java.lang.Object r0 = r3.f156h
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0048
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0048
            e.e.g<java.lang.String, java.lang.Integer> r0 = f0
            java.lang.Object r1 = r3.f156h
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.R
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0057
        L_0x0048:
            e.e.g<java.lang.String, java.lang.Integer> r0 = f0
            java.lang.Object r1 = r3.f156h
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0057:
            androidx.appcompat.app.a r0 = r3.f161m
            if (r0 == 0) goto L_0x005e
            r0.n()
        L_0x005e:
            r3.O()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.r():void");
    }

    /* access modifiers changed from: package-private */
    public boolean r0(int i2, KeyEvent keyEvent) {
        boolean z2 = true;
        if (i2 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z2 = false;
            }
            this.M = z2;
        } else if (i2 == 82) {
            s0(0, keyEvent);
            return true;
        }
        return false;
    }

    public void s(Bundle bundle) {
        Y();
    }

    public void t() {
        a m2 = m();
        if (m2 != null) {
            m2.t(true);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean t0(int i2, KeyEvent keyEvent) {
        a m2 = m();
        if (m2 != null && m2.o(i2, keyEvent)) {
            return true;
        }
        t tVar = this.L;
        if (tVar == null || !B0(tVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.L == null) {
                t f02 = f0(0, true);
                C0(f02, keyEvent);
                boolean B0 = B0(f02, keyEvent.getKeyCode(), keyEvent, 1);
                f02.f184m = false;
                if (B0) {
                    return true;
                }
            }
            return false;
        }
        t tVar2 = this.L;
        if (tVar2 != null) {
            tVar2.f185n = true;
        }
        return true;
    }

    public void u(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public boolean u0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z2 = this.M;
            this.M = false;
            t f02 = f0(0, false);
            if (f02 != null && f02.f186o) {
                if (!z2) {
                    Q(f02, true);
                }
                return true;
            } else if (q0()) {
                return true;
            }
        } else if (i2 == 82) {
            v0(0, keyEvent);
            return true;
        }
        return false;
    }

    public void v() {
        this.P = true;
        H();
    }

    public void w() {
        this.P = false;
        a m2 = m();
        if (m2 != null) {
            m2.t(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void w0(int i2) {
        a m2;
        if (i2 == 108 && (m2 = m()) != null) {
            m2.i(true);
        }
    }

    /* access modifiers changed from: package-private */
    public void x0(int i2) {
        if (i2 == 108) {
            a m2 = m();
            if (m2 != null) {
                m2.i(false);
            }
        } else if (i2 == 0) {
            t f02 = f0(i2, true);
            if (f02.f186o) {
                Q(f02, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void y0(ViewGroup viewGroup) {
    }

    public boolean z(int i2) {
        int E0 = E0(i2);
        if (this.I && E0 == 108) {
            return false;
        }
        if (this.E && E0 == 1) {
            this.E = false;
        }
        if (E0 == 1) {
            J0();
            this.I = true;
            return true;
        } else if (E0 == 2) {
            J0();
            this.C = true;
            return true;
        } else if (E0 == 5) {
            J0();
            this.D = true;
            return true;
        } else if (E0 == 10) {
            J0();
            this.G = true;
            return true;
        } else if (E0 == 108) {
            J0();
            this.E = true;
            return true;
        } else if (E0 != 109) {
            return this.f158j.requestFeature(E0);
        } else {
            J0();
            this.F = true;
            return true;
        }
    }
}
