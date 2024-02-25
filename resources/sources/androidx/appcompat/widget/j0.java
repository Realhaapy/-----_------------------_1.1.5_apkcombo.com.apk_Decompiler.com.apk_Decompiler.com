package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.p;
import androidx.core.widget.h;
import e.a.j;
import e.f.r.y;
import java.lang.reflect.Method;

public class j0 implements p {
    private static Method J;
    private static Method K;
    private static Method L;
    final f A;
    private final e B;
    private final d C;
    private final b D;
    final Handler E;
    private final Rect F;
    private Rect G;
    private boolean H;
    PopupWindow I;

    /* renamed from: e  reason: collision with root package name */
    private Context f600e;

    /* renamed from: f  reason: collision with root package name */
    private ListAdapter f601f;

    /* renamed from: g  reason: collision with root package name */
    f0 f602g;

    /* renamed from: h  reason: collision with root package name */
    private int f603h;

    /* renamed from: i  reason: collision with root package name */
    private int f604i;

    /* renamed from: j  reason: collision with root package name */
    private int f605j;

    /* renamed from: k  reason: collision with root package name */
    private int f606k;

    /* renamed from: l  reason: collision with root package name */
    private int f607l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f608m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f609n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f610o;

    /* renamed from: p  reason: collision with root package name */
    private int f611p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f612q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f613r;

    /* renamed from: s  reason: collision with root package name */
    int f614s;
    private View t;
    private int u;
    private DataSetObserver v;
    private View w;
    private Drawable x;
    private AdapterView.OnItemClickListener y;
    private AdapterView.OnItemSelectedListener z;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            f0 f0Var;
            if (i2 != -1 && (f0Var = j0.this.f602g) != null) {
                f0Var.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void run() {
            j0.this.q();
        }
    }

    private class c extends DataSetObserver {
        c() {
        }

        public void onChanged() {
            if (j0.this.b()) {
                j0.this.show();
            }
        }

        public void onInvalidated() {
            j0.this.dismiss();
        }
    }

    private class d implements AbsListView.OnScrollListener {
        d() {
        }

        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 == 1 && !j0.this.v() && j0.this.I.getContentView() != null) {
                j0 j0Var = j0.this;
                j0Var.E.removeCallbacks(j0Var.A);
                j0.this.A.run();
            }
        }
    }

    private class e implements View.OnTouchListener {
        e() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = j0.this.I) != null && popupWindow.isShowing() && x >= 0 && x < j0.this.I.getWidth() && y >= 0 && y < j0.this.I.getHeight()) {
                j0 j0Var = j0.this;
                j0Var.E.postDelayed(j0Var.A, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                j0 j0Var2 = j0.this;
                j0Var2.E.removeCallbacks(j0Var2.A);
                return false;
            }
        }
    }

    private class f implements Runnable {
        f() {
        }

        public void run() {
            f0 f0Var = j0.this.f602g;
            if (f0Var != null && y.C(f0Var) && j0.this.f602g.getCount() > j0.this.f602g.getChildCount()) {
                int childCount = j0.this.f602g.getChildCount();
                j0 j0Var = j0.this;
                if (childCount <= j0Var.f614s) {
                    j0Var.I.setInputMethodMode(2);
                    j0.this.show();
                }
            }
        }
    }

    static {
        Class cls = Boolean.TYPE;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 28) {
            try {
                J = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{cls});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                L = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (i2 <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                K = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, cls});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public j0(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public j0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f603h = -2;
        this.f604i = -2;
        this.f607l = 1002;
        this.f611p = 0;
        this.f612q = false;
        this.f613r = false;
        this.f614s = Integer.MAX_VALUE;
        this.u = 0;
        this.A = new f();
        this.B = new e();
        this.C = new d();
        this.D = new b();
        this.F = new Rect();
        this.f600e = context;
        this.E = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a1, i2, i3);
        this.f605j = obtainStyledAttributes.getDimensionPixelOffset(j.b1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(j.c1, 0);
        this.f606k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f608m = true;
        }
        obtainStyledAttributes.recycle();
        p pVar = new p(context, attributeSet, i2, i3);
        this.I = pVar;
        pVar.setInputMethodMode(1);
    }

    private void I(boolean z2) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = J;
            if (method != null) {
                try {
                    method.invoke(this.I, new Object[]{Boolean.valueOf(z2)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.I.setIsClippedToScreen(z2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: androidx.appcompat.widget.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: androidx.appcompat.widget.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int p() {
        /*
            r12 = this;
            androidx.appcompat.widget.f0 r0 = r12.f602g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00b8
            android.content.Context r0 = r12.f600e
            boolean r5 = r12.H
            r5 = r5 ^ r3
            androidx.appcompat.widget.f0 r5 = r12.r(r0, r5)
            r12.f602g = r5
            android.graphics.drawable.Drawable r6 = r12.x
            if (r6 == 0) goto L_0x001b
            r5.setSelector(r6)
        L_0x001b:
            androidx.appcompat.widget.f0 r5 = r12.f602g
            android.widget.ListAdapter r6 = r12.f601f
            r5.setAdapter(r6)
            androidx.appcompat.widget.f0 r5 = r12.f602g
            android.widget.AdapterView$OnItemClickListener r6 = r12.y
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.f0 r5 = r12.f602g
            r5.setFocusable(r3)
            androidx.appcompat.widget.f0 r5 = r12.f602g
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.f0 r5 = r12.f602g
            androidx.appcompat.widget.j0$a r6 = new androidx.appcompat.widget.j0$a
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.f0 r5 = r12.f602g
            androidx.appcompat.widget.j0$d r6 = r12.C
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.z
            if (r5 == 0) goto L_0x004d
            androidx.appcompat.widget.f0 r6 = r12.f602g
            r6.setOnItemSelectedListener(r5)
        L_0x004d:
            androidx.appcompat.widget.f0 r5 = r12.f602g
            android.view.View r6 = r12.t
            if (r6 == 0) goto L_0x00b1
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.u
            if (r8 == 0) goto L_0x0088
            if (r8 == r3) goto L_0x0081
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.u
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x008e
        L_0x0081:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x008e
        L_0x0088:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x008e:
            int r0 = r12.f604i
            if (r0 < 0) goto L_0x0095
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0097
        L_0x0095:
            r0 = 0
            r5 = 0
        L_0x0097:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b2
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            android.widget.PopupWindow r6 = r12.I
            r6.setContentView(r5)
            goto L_0x00d6
        L_0x00b8:
            android.widget.PopupWindow r0 = r12.I
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.t
            if (r0 == 0) goto L_0x00d5
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00d6
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            android.widget.PopupWindow r5 = r12.I
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f2
            android.graphics.Rect r6 = r12.F
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.F
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f608m
            if (r7 != 0) goto L_0x00f8
            int r6 = -r6
            r12.f606k = r6
            goto L_0x00f8
        L_0x00f2:
            android.graphics.Rect r5 = r12.F
            r5.setEmpty()
            r5 = 0
        L_0x00f8:
            android.widget.PopupWindow r6 = r12.I
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            r3 = 0
        L_0x0103:
            android.view.View r4 = r12.s()
            int r6 = r12.f606k
            int r3 = r12.t(r4, r6, r3)
            boolean r4 = r12.f612q
            if (r4 != 0) goto L_0x015b
            int r4 = r12.f603h
            if (r4 != r2) goto L_0x0116
            goto L_0x015b
        L_0x0116:
            int r4 = r12.f604i
            r6 = -2
            if (r4 == r6) goto L_0x0124
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x0124
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x013c
        L_0x0124:
            android.content.Context r2 = r12.f600e
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.F
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x013c:
            r7 = r1
            androidx.appcompat.widget.f0 r6 = r12.f602g
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0159
            androidx.appcompat.widget.f0 r2 = r12.f602g
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.f0 r3 = r12.f602g
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0159:
            int r1 = r1 + r0
            return r1
        L_0x015b:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.p():int");
    }

    private int t(View view, int i2, boolean z2) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.I.getMaxAvailableHeight(view, i2, z2);
        }
        Method method = K;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.I, new Object[]{view, Integer.valueOf(i2), Boolean.valueOf(z2)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.I.getMaxAvailableHeight(view, i2);
    }

    private void x() {
        View view = this.t;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.t);
            }
        }
    }

    public void A(int i2) {
        Drawable background = this.I.getBackground();
        if (background != null) {
            background.getPadding(this.F);
            Rect rect = this.F;
            this.f604i = rect.left + rect.right + i2;
            return;
        }
        L(i2);
    }

    public void B(int i2) {
        this.f611p = i2;
    }

    public void C(Rect rect) {
        this.G = rect != null ? new Rect(rect) : null;
    }

    public void D(int i2) {
        this.I.setInputMethodMode(i2);
    }

    public void E(boolean z2) {
        this.H = z2;
        this.I.setFocusable(z2);
    }

    public void F(PopupWindow.OnDismissListener onDismissListener) {
        this.I.setOnDismissListener(onDismissListener);
    }

    public void G(AdapterView.OnItemClickListener onItemClickListener) {
        this.y = onItemClickListener;
    }

    public void H(boolean z2) {
        this.f610o = true;
        this.f609n = z2;
    }

    public void J(int i2) {
        this.u = i2;
    }

    public void K(int i2) {
        f0 f0Var = this.f602g;
        if (b() && f0Var != null) {
            f0Var.setListSelectionHidden(false);
            f0Var.setSelection(i2);
            if (f0Var.getChoiceMode() != 0) {
                f0Var.setItemChecked(i2, true);
            }
        }
    }

    public void L(int i2) {
        this.f604i = i2;
    }

    public int a() {
        return this.f605j;
    }

    public boolean b() {
        return this.I.isShowing();
    }

    public void dismiss() {
        this.I.dismiss();
        x();
        this.I.setContentView((View) null);
        this.f602g = null;
        this.E.removeCallbacks(this.A);
    }

    public Drawable e() {
        return this.I.getBackground();
    }

    public ListView f() {
        return this.f602g;
    }

    public void h(Drawable drawable) {
        this.I.setBackgroundDrawable(drawable);
    }

    public void i(int i2) {
        this.f606k = i2;
        this.f608m = true;
    }

    public void k(int i2) {
        this.f605j = i2;
    }

    public int m() {
        if (!this.f608m) {
            return 0;
        }
        return this.f606k;
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.v;
        if (dataSetObserver == null) {
            this.v = new c();
        } else {
            ListAdapter listAdapter2 = this.f601f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f601f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.v);
        }
        f0 f0Var = this.f602g;
        if (f0Var != null) {
            f0Var.setAdapter(this.f601f);
        }
    }

    public void q() {
        f0 f0Var = this.f602g;
        if (f0Var != null) {
            f0Var.setListSelectionHidden(true);
            f0Var.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public f0 r(Context context, boolean z2) {
        return new f0(context, z2);
    }

    public View s() {
        return this.w;
    }

    public void show() {
        int p2 = p();
        boolean v2 = v();
        h.b(this.I, this.f607l);
        boolean z2 = true;
        if (!this.I.isShowing()) {
            int i2 = this.f604i;
            if (i2 == -1) {
                i2 = -1;
            } else if (i2 == -2) {
                i2 = s().getWidth();
            }
            int i3 = this.f603h;
            if (i3 == -1) {
                p2 = -1;
            } else if (i3 != -2) {
                p2 = i3;
            }
            this.I.setWidth(i2);
            this.I.setHeight(p2);
            I(true);
            this.I.setOutsideTouchable(!this.f613r && !this.f612q);
            this.I.setTouchInterceptor(this.B);
            if (this.f610o) {
                h.a(this.I, this.f609n);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = L;
                if (method != null) {
                    try {
                        method.invoke(this.I, new Object[]{this.G});
                    } catch (Exception e2) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                    }
                }
            } else {
                this.I.setEpicenterBounds(this.G);
            }
            h.c(this.I, s(), this.f605j, this.f606k, this.f611p);
            this.f602g.setSelection(-1);
            if (!this.H || this.f602g.isInTouchMode()) {
                q();
            }
            if (!this.H) {
                this.E.post(this.D);
            }
        } else if (y.C(s())) {
            int i4 = this.f604i;
            if (i4 == -1) {
                i4 = -1;
            } else if (i4 == -2) {
                i4 = s().getWidth();
            }
            int i5 = this.f603h;
            if (i5 == -1) {
                if (!v2) {
                    p2 = -1;
                }
                if (v2) {
                    this.I.setWidth(this.f604i == -1 ? -1 : 0);
                    this.I.setHeight(0);
                } else {
                    this.I.setWidth(this.f604i == -1 ? -1 : 0);
                    this.I.setHeight(-1);
                }
            } else if (i5 != -2) {
                p2 = i5;
            }
            PopupWindow popupWindow = this.I;
            if (this.f613r || this.f612q) {
                z2 = false;
            }
            popupWindow.setOutsideTouchable(z2);
            this.I.update(s(), this.f605j, this.f606k, i4 < 0 ? -1 : i4, p2 < 0 ? -1 : p2);
        }
    }

    public int u() {
        return this.f604i;
    }

    public boolean v() {
        return this.I.getInputMethodMode() == 2;
    }

    public boolean w() {
        return this.H;
    }

    public void y(View view) {
        this.w = view;
    }

    public void z(int i2) {
        this.I.setAnimationStyle(i2);
    }
}
