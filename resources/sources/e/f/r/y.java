package e.f.r;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import e.f.r.d;
import e.f.r.g0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class y {
    private static Field a;
    private static boolean b;
    private static WeakHashMap<View, String> c;

    /* renamed from: d  reason: collision with root package name */
    private static WeakHashMap<View, c0> f3438d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Field f3439e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f3440f = false;

    /* renamed from: g  reason: collision with root package name */
    private static ThreadLocal<Rect> f3441g;

    /* renamed from: h  reason: collision with root package name */
    private static final v f3442h = a.f3398e;

    class a extends f<Boolean> {
        a(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Boolean c(View view) {
            return Boolean.valueOf(o.d(view));
        }
    }

    class b extends f<CharSequence> {
        b(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public CharSequence c(View view) {
            return o.b(view);
        }
    }

    class c extends f<CharSequence> {
        c(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public CharSequence c(View view) {
            return q.a(view);
        }
    }

    class d extends f<Boolean> {
        d(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Boolean c(View view) {
            return Boolean.valueOf(o.c(view));
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: e  reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f3443e = new WeakHashMap<>();

        e() {
        }

        private void a(View view, boolean z) {
            boolean z2 = view.isShown() && view.getWindowVisibility() == 0;
            if (z != z2) {
                y.G(view, z2 ? 16 : 32);
                this.f3443e.put(view, Boolean.valueOf(z2));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f3443e.entrySet()) {
                    a((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f<T> {
        private final int a;
        private final Class<T> b;
        private final int c;

        f(int i2, Class<T> cls, int i3) {
            this(i2, cls, 0, i3);
        }

        f(int i2, Class<T> cls, int i3, int i4) {
            this.a = i2;
            this.b = cls;
            this.c = i4;
        }

        private boolean a() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        /* access modifiers changed from: package-private */
        public abstract T c(View view);

        /* access modifiers changed from: package-private */
        public T d(View view) {
            if (b()) {
                return c(view);
            }
            if (!a()) {
                return null;
            }
            T tag = view.getTag(this.a);
            if (this.b.isInstance(tag)) {
                return tag;
            }
            return null;
        }
    }

    static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i2, Bundle bundle) {
            return view.performAccessibilityAction(i2, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i2, int i3, int i4, int i5) {
            view.postInvalidateOnAnimation(i2, i3, i4, i5);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j2) {
            view.postOnAnimationDelayed(runnable, j2);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        static void s(View view, int i2) {
            view.setImportantForAccessibility(i2);
        }
    }

    static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i2) {
            view.setLabelFor(i2);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i2) {
            view.setLayoutDirection(i2);
        }

        static void k(View view, int i2, int i3, int i4, int i5) {
            view.setPaddingRelative(i2, i3, i4, i5);
        }
    }

    static class j {
        static Rect a(View view) {
            return view.getClipBounds();
        }

        static boolean b(View view) {
            return view.isInLayout();
        }

        static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static class k {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i2) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i2);
        }

        static void f(View view, int i2) {
            view.setAccessibilityLiveRegion(i2);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i2) {
            accessibilityEvent.setContentChangeTypes(i2);
        }
    }

    static class l {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class m {

        class a implements View.OnApplyWindowInsetsListener {
            g0 a = null;
            final /* synthetic */ View b;
            final /* synthetic */ t c;

            a(View view, t tVar) {
                this.b = view;
                this.c = tVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                g0 v = g0.v(windowInsets, view);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 30) {
                    m.a(windowInsets, this.b);
                    if (v.equals(this.a)) {
                        return this.c.a(view, v).t();
                    }
                }
                this.a = v;
                g0 a2 = this.c.a(view, v);
                if (i2 >= 30) {
                    return a2.t();
                }
                y.P(view);
                return a2.t();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(e.f.e.C);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static g0 b(View view, g0 g0Var, Rect rect) {
            WindowInsets t = g0Var.t();
            if (t != null) {
                return g0.v(view.computeSystemWindowInsets(t, rect), view);
            }
            rect.setEmpty();
            return g0Var;
        }

        static boolean c(View view, float f2, float f3, boolean z) {
            return view.dispatchNestedFling(f2, f3, z);
        }

        static boolean d(View view, float f2, float f3) {
            return view.dispatchNestedPreFling(f2, f3);
        }

        static boolean e(View view, int i2, int i3, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
        }

        static boolean f(View view, int i2, int i3, int i4, int i5, int[] iArr) {
            return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static g0 j(View view) {
            return g0.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f2) {
            view.setElevation(f2);
        }

        static void t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        static void u(View view, t tVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(e.f.e.u, tVar);
            }
            if (tVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(e.f.e.C));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, tVar));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f2) {
            view.setTranslationZ(f2);
        }

        static void x(View view, float f2) {
            view.setZ(f2);
        }

        static boolean y(View view, int i2) {
            return view.startNestedScroll(i2);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    private static class n {
        public static g0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            g0 u = g0.u(rootWindowInsets);
            u.r(u);
            u.d(view.getRootView());
            return u;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i2) {
            view.setScrollIndicators(i2);
        }

        static void d(View view, int i2, int i3) {
            view.setScrollIndicators(i2, i3);
        }
    }

    static class o {
        static void a(View view, t tVar) {
            int i2 = e.f.e.B;
            e.e.g gVar = (e.e.g) view.getTag(i2);
            if (gVar == null) {
                gVar = new e.e.g();
                view.setTag(i2, gVar);
            }
            Objects.requireNonNull(tVar);
            c cVar = new c(tVar);
            gVar.put(tVar, cVar);
            view.addOnUnhandledKeyEventListener(cVar);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, t tVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            e.e.g gVar = (e.e.g) view.getTag(e.f.e.B);
            if (gVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(tVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        static <T> T f(View view, int i2) {
            return view.requireViewById(i2);
        }

        static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    private static class p {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }

        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    private static class q {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class r {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static f b(View view, f fVar) {
            ContentInfo f2 = fVar.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f2);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f2 ? fVar : f.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, u uVar) {
            if (uVar == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new s(uVar));
            }
        }
    }

    private static final class s implements OnReceiveContentListener {
        private final u a;

        s(u uVar) {
            this.a = uVar;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            f g2 = f.g(contentInfo);
            f a2 = this.a.a(view, g2);
            if (a2 == null) {
                return null;
            }
            return a2 == g2 ? contentInfo : a2.f();
        }
    }

    public interface t {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    static class u {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f3444d = new ArrayList<>();
        private WeakHashMap<View, Boolean> a = null;
        private SparseArray<WeakReference<View>> b = null;
        private WeakReference<KeyEvent> c = null;

        u() {
        }

        static u a(View view) {
            int i2 = e.f.e.A;
            u uVar = (u) view.getTag(i2);
            if (uVar != null) {
                return uVar;
            }
            u uVar2 = new u();
            view.setTag(i2, uVar2);
            return uVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c2 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c2 != null) {
                            return c2;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.b == null) {
                this.b = new SparseArray<>();
            }
            return this.b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(e.f.e.B);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((t) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            Boolean bool = Boolean.TRUE;
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f3444d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.a == null) {
                        this.a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f3444d;
                        View view = (View) arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.a.put(view, bool);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.a.put((View) parent, bool);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c2 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c2));
                }
            }
            return c2 != null;
        }

        /* access modifiers changed from: package-private */
        public boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> d2 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d2.valueAt(indexOfKey);
                d2.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d2.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && y.C(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    static {
        new AtomicInteger(1);
        new e();
    }

    public static boolean A(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.h(view);
        }
        return true;
    }

    public static boolean B(View view) {
        Boolean d2 = a().d(view);
        return d2 != null && d2.booleanValue();
    }

    public static boolean C(View view) {
        return Build.VERSION.SDK_INT >= 19 ? k.b(view) : view.getWindowToken() != null;
    }

    public static boolean D(View view) {
        return Build.VERSION.SDK_INT >= 19 ? k.c(view) : view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean E(View view) {
        Boolean d2 = R().d(view);
        return d2 != null && d2.booleanValue();
    }

    static /* synthetic */ f F(f fVar) {
        return fVar;
    }

    static void G(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = l(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i3 = 32;
            if (k(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i3 = 2048;
                }
                obtain.setEventType(i3);
                k.g(obtain, i2);
                if (z) {
                    obtain.getText().add(l(view));
                    d0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i2 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                k.g(obtain2, i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(l(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static void H(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetLeftAndRight(i2);
        } else if (i3 >= 21) {
            Rect p2 = p();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                p2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !p2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            c(view, i2);
            if (z && p2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(p2);
            }
        } else {
            c(view, i2);
        }
    }

    public static void I(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetTopAndBottom(i2);
        } else if (i3 >= 21) {
            Rect p2 = p();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                p2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !p2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            d(view, i2);
            if (z && p2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(p2);
            }
        } else {
            d(view, i2);
        }
    }

    public static g0 J(View view, g0 g0Var) {
        WindowInsets t2;
        if (Build.VERSION.SDK_INT >= 21 && (t2 = g0Var.t()) != null) {
            WindowInsets b2 = l.b(view, t2);
            if (!b2.equals(t2)) {
                return g0.v(b2, view);
            }
        }
        return g0Var;
    }

    private static f<CharSequence> K() {
        return new b(e.f.e.t, CharSequence.class, 8, 28);
    }

    public static f L(View view, f fVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + fVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return r.b(view, fVar);
        }
        u uVar = (u) view.getTag(e.f.e.v);
        if (uVar == null) {
            return q(view).a(fVar);
        }
        f a2 = uVar.a(view, fVar);
        if (a2 == null) {
            return null;
        }
        return q(view).a(a2);
    }

    public static void M(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.k(view);
        } else {
            view.postInvalidate();
        }
    }

    public static void N(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.m(view, runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    @SuppressLint({"LambdaLast"})
    public static void O(View view, Runnable runnable, long j2) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.n(view, runnable, j2);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j2);
        }
    }

    public static void P(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            l.c(view);
        } else if (i2 >= 16) {
            h.p(view);
        }
    }

    public static void Q(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            p.c(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    private static f<Boolean> R() {
        return new a(e.f.e.x, Boolean.class, 28);
    }

    public static void S(View view, d dVar) {
        if (dVar == null && (i(view) instanceof d.a)) {
            dVar = new d();
        }
        view.setAccessibilityDelegate(dVar == null ? null : dVar.d());
    }

    public static void T(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.q(view, drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static void U(View view, ColorStateList colorStateList) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            m.q(view, colorStateList);
            if (i2 == 21) {
                Drawable background = view.getBackground();
                boolean z = (m.g(view) == null && m.h(view) == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    h.q(view, background);
                }
            }
        } else if (view instanceof x) {
            ((x) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static void V(View view, PorterDuff.Mode mode) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            m.r(view, mode);
            if (i2 == 21) {
                Drawable background = view.getBackground();
                boolean z = (m.g(view) == null && m.h(view) == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    h.q(view, background);
                }
            }
        } else if (view instanceof x) {
            ((x) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static void W(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            j.c(view, rect);
        }
    }

    public static void X(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.s(view, f2);
        }
    }

    public static void Y(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.r(view, z);
        }
    }

    public static void Z(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 19) {
            if (i3 < 16) {
                return;
            }
            if (i2 == 4) {
                i2 = 2;
            }
        }
        h.s(view, i2);
    }

    private static f<Boolean> a() {
        return new d(e.f.e.f3314s, Boolean.class, 28);
    }

    public static void a0(View view, t tVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.u(view, tVar);
        }
    }

    public static c0 b(View view) {
        if (f3438d == null) {
            f3438d = new WeakHashMap<>();
        }
        c0 c0Var = f3438d.get(view);
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0(view);
        f3438d.put(view, c0Var2);
        return c0Var2;
    }

    public static void b0(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.d(view, i2, i3);
        }
    }

    private static void c(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            g0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                g0((View) parent);
            }
        }
    }

    public static void c0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.v(view, str);
            return;
        }
        if (c == null) {
            c = new WeakHashMap<>();
        }
        c.put(view, str);
    }

    private static void d(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            g0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                g0((View) parent);
            }
        }
    }

    private static void d0(View view) {
        if (r(view) == 0) {
            Z(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (r((View) parent) == 4) {
                Z(view, 2);
                return;
            }
        }
    }

    public static g0 e(View view, g0 g0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? m.b(view, g0Var, rect) : g0Var;
    }

    private static f<CharSequence> e0() {
        return new c(e.f.e.y, CharSequence.class, 64, 30);
    }

    public static g0 f(View view, g0 g0Var) {
        WindowInsets t2;
        if (Build.VERSION.SDK_INT >= 21 && (t2 = g0Var.t()) != null) {
            WindowInsets a2 = l.a(view, t2);
            if (!a2.equals(t2)) {
                return g0.v(a2, view);
            }
        }
        return g0Var;
    }

    public static void f0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.z(view);
        } else if (view instanceof n) {
            ((n) view).stopNestedScroll();
        }
    }

    static boolean g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return u.a(view).b(view, keyEvent);
    }

    private static void g0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return u.a(view).f(keyEvent);
    }

    private static View.AccessibilityDelegate i(View view) {
        return Build.VERSION.SDK_INT >= 29 ? p.a(view) : j(view);
    }

    private static View.AccessibilityDelegate j(View view) {
        if (f3440f) {
            return null;
        }
        if (f3439e == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3439e = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3440f = true;
                return null;
            }
        }
        try {
            Object obj = f3439e.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3440f = true;
            return null;
        }
    }

    public static int k(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return k.a(view);
        }
        return 0;
    }

    public static CharSequence l(View view) {
        return K().d(view);
    }

    public static ColorStateList m(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.g(view);
        }
        if (view instanceof x) {
            return ((x) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static PorterDuff.Mode n(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.h(view);
        }
        if (view instanceof x) {
            return ((x) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static Rect o(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return j.a(view);
        }
        return null;
    }

    private static Rect p() {
        if (f3441g == null) {
            f3441g = new ThreadLocal<>();
        }
        Rect rect = f3441g.get();
        if (rect == null) {
            rect = new Rect();
            f3441g.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    private static v q(View view) {
        return view instanceof v ? (v) view : f3442h;
    }

    public static int r(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.c(view);
        }
        return 0;
    }

    public static int s(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.d(view);
        }
        return 0;
    }

    public static int t(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.d(view);
        }
        if (!b) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            b = true;
        }
        Field field = a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static String[] u(View view) {
        return Build.VERSION.SDK_INT >= 31 ? r.a(view) : (String[]) view.getTag(e.f.e.w);
    }

    public static g0 v(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return n.a(view);
        }
        if (i2 >= 21) {
            return m.j(view);
        }
        return null;
    }

    public static CharSequence w(View view) {
        return e0().d(view);
    }

    public static String x(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.k(view);
        }
        WeakHashMap<View, String> weakHashMap = c;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    @Deprecated
    public static int y(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.g(view);
        }
        return 0;
    }

    public static boolean z(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return g.a(view);
        }
        return false;
    }
}
