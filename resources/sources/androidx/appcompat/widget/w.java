package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.p;
import e.f.r.x;
import e.f.r.y;

public class w extends Spinner implements x {

    /* renamed from: m  reason: collision with root package name */
    private static final int[] f684m = {16843505};

    /* renamed from: e  reason: collision with root package name */
    private final e f685e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f686f;

    /* renamed from: g  reason: collision with root package name */
    private h0 f687g;

    /* renamed from: h  reason: collision with root package name */
    private SpinnerAdapter f688h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f689i;

    /* renamed from: j  reason: collision with root package name */
    private g f690j;

    /* renamed from: k  reason: collision with root package name */
    int f691k;

    /* renamed from: l  reason: collision with root package name */
    final Rect f692l;

    class a extends h0 {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ e f693n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.f693n = eVar;
        }

        public p b() {
            return this.f693n;
        }

        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (w.this.getInternalPopup().b()) {
                return true;
            }
            w.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        public void onGlobalLayout() {
            if (!w.this.getInternalPopup().b()) {
                w.this.b();
            }
            ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    class c implements g, DialogInterface.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        androidx.appcompat.app.b f696e;

        /* renamed from: f  reason: collision with root package name */
        private ListAdapter f697f;

        /* renamed from: g  reason: collision with root package name */
        private CharSequence f698g;

        c() {
        }

        public int a() {
            return 0;
        }

        public boolean b() {
            androidx.appcompat.app.b bVar = this.f696e;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f696e;
            if (bVar != null) {
                bVar.dismiss();
                this.f696e = null;
            }
        }

        public Drawable e() {
            return null;
        }

        public void g(CharSequence charSequence) {
            this.f698g = charSequence;
        }

        public void h(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public void i(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public void j(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public void k(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public void l(int i2, int i3) {
            if (this.f697f != null) {
                b.a aVar = new b.a(w.this.getPopupContext());
                CharSequence charSequence = this.f698g;
                if (charSequence != null) {
                    aVar.h(charSequence);
                }
                aVar.g(this.f697f, w.this.getSelectedItemPosition(), this);
                androidx.appcompat.app.b a = aVar.a();
                this.f696e = a;
                ListView h2 = a.h();
                if (Build.VERSION.SDK_INT >= 17) {
                    h2.setTextDirection(i2);
                    h2.setTextAlignment(i3);
                }
                this.f696e.show();
            }
        }

        public int m() {
            return 0;
        }

        public CharSequence n() {
            return this.f698g;
        }

        public void o(ListAdapter listAdapter) {
            this.f697f = listAdapter;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            w.this.setSelection(i2);
            if (w.this.getOnItemClickListener() != null) {
                w.this.performItemClick((View) null, i2, this.f697f.getItemId(i2));
            }
            dismiss();
        }
    }

    private static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: e  reason: collision with root package name */
        private SpinnerAdapter f700e;

        /* renamed from: f  reason: collision with root package name */
        private ListAdapter f701f;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f700e = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f701f = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof s0) {
                s0 s0Var = (s0) spinnerAdapter;
                if (s0Var.getDropDownViewTheme() == null) {
                    s0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f701f;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f700e;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f700e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.f700e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.f700e;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i2);
        }

        public int getItemViewType(int i2) {
            return 0;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            return getDropDownView(i2, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f700e;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f701f;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f700e;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f700e;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class e extends j0 implements g {
        private CharSequence M;
        ListAdapter N;
        private final Rect O = new Rect();
        private int P;

        class a implements AdapterView.OnItemClickListener {
            a(w wVar) {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                w.this.setSelection(i2);
                if (w.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    w.this.performItemClick(view, i2, eVar.N.getItemId(i2));
                }
                e.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.P(w.this)) {
                    e.this.dismiss();
                    return;
                }
                e.this.N();
                e.super.show();
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f704e;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f704e = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f704e);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            y(w.this);
            E(true);
            J(0);
            G(new a(w.this));
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void N() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.e()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.widget.w r1 = androidx.appcompat.widget.w.this
                android.graphics.Rect r1 = r1.f692l
                r0.getPadding(r1)
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                boolean r0 = androidx.appcompat.widget.c1.b(r0)
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                android.graphics.Rect r0 = r0.f692l
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                android.graphics.Rect r0 = r0.f692l
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                android.graphics.Rect r0 = r0.f692l
                r0.right = r1
                r0.left = r1
            L_0x002e:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.w r2 = androidx.appcompat.widget.w.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.w r3 = androidx.appcompat.widget.w.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.w r4 = androidx.appcompat.widget.w.this
                int r5 = r4.f691k
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.N
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.e()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.w r5 = androidx.appcompat.widget.w.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.w r6 = androidx.appcompat.widget.w.this
                android.graphics.Rect r6 = r6.f692l
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.A(r4)
                goto L_0x0085
            L_0x0082:
                r8.A(r5)
            L_0x0085:
                androidx.appcompat.widget.w r4 = androidx.appcompat.widget.w.this
                boolean r4 = androidx.appcompat.widget.c1.b(r4)
                if (r4 == 0) goto L_0x009a
                int r3 = r3 - r2
                int r0 = r8.u()
                int r3 = r3 - r0
                int r0 = r8.O()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L_0x00a0
            L_0x009a:
                int r2 = r8.O()
                int r0 = r0 + r2
                int r1 = r1 + r0
            L_0x00a0:
                r8.k(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w.e.N():void");
        }

        public int O() {
            return this.P;
        }

        /* access modifiers changed from: package-private */
        public boolean P(View view) {
            return y.C(view) && view.getGlobalVisibleRect(this.O);
        }

        public void g(CharSequence charSequence) {
            this.M = charSequence;
        }

        public void j(int i2) {
            this.P = i2;
        }

        public void l(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            boolean b2 = b();
            N();
            D(2);
            super.show();
            ListView f2 = f();
            f2.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                f2.setTextDirection(i2);
                f2.setTextAlignment(i3);
            }
            K(w.this.getSelectedItemPosition());
            if (!b2 && (viewTreeObserver = w.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                F(new c(bVar));
            }
        }

        public CharSequence n() {
            return this.M;
        }

        public void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.N = listAdapter;
        }
    }

    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        boolean f706e;

        class a implements Parcelable.Creator<f> {
            a() {
            }

            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            /* renamed from: b */
            public f[] newArray(int i2) {
                return new f[i2];
            }
        }

        f(Parcel parcel) {
            super(parcel);
            this.f706e = parcel.readByte() != 0;
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f706e ? (byte) 1 : 0);
        }
    }

    interface g {
        int a();

        boolean b();

        void dismiss();

        Drawable e();

        void g(CharSequence charSequence);

        void h(Drawable drawable);

        void i(int i2);

        void j(int i2);

        void k(int i2);

        void l(int i2, int i3);

        int m();

        CharSequence n();

        void o(ListAdapter listAdapter);
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.a.spinnerStyle);
    }

    public w(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public w(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r11 != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        if (r11 != null) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[SYNTHETIC, Splitter:B:10:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f692l = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.r0.a(r6, r0)
            int[] r0 = e.a.j.l2
            r1 = 0
            androidx.appcompat.widget.w0 r0 = androidx.appcompat.widget.w0.u(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f685e = r2
            if (r11 == 0) goto L_0x0029
            e.a.n.d r2 = new e.a.n.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
        L_0x0026:
            r6.f686f = r2
            goto L_0x0039
        L_0x0029:
            int r11 = e.a.j.q2
            int r11 = r0.m(r11, r1)
            if (r11 == 0) goto L_0x0037
            e.a.n.d r2 = new e.a.n.d
            r2.<init>((android.content.Context) r7, (int) r11)
            goto L_0x0026
        L_0x0037:
            r6.f686f = r7
        L_0x0039:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x006b
            int[] r11 = f684m     // Catch:{ Exception -> 0x0057, all -> 0x0055 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0057, all -> 0x0055 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0053 }
            if (r3 == 0) goto L_0x004d
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0053 }
        L_0x004d:
            if (r11 == 0) goto L_0x006b
        L_0x004f:
            r11.recycle()
            goto L_0x006b
        L_0x0053:
            r3 = move-exception
            goto L_0x0059
        L_0x0055:
            r7 = move-exception
            goto L_0x0065
        L_0x0057:
            r3 = move-exception
            r11 = r2
        L_0x0059:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x006b
            goto L_0x004f
        L_0x0063:
            r7 = move-exception
            r2 = r11
        L_0x0065:
            if (r2 == 0) goto L_0x006a
            r2.recycle()
        L_0x006a:
            throw r7
        L_0x006b:
            r11 = 1
            if (r10 == 0) goto L_0x00a8
            if (r10 == r11) goto L_0x0071
            goto L_0x00b8
        L_0x0071:
            androidx.appcompat.widget.w$e r10 = new androidx.appcompat.widget.w$e
            android.content.Context r3 = r6.f686f
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f686f
            int[] r4 = e.a.j.l2
            androidx.appcompat.widget.w0 r1 = androidx.appcompat.widget.w0.u(r3, r8, r4, r9, r1)
            int r3 = e.a.j.p2
            r4 = -2
            int r3 = r1.l(r3, r4)
            r6.f691k = r3
            int r3 = e.a.j.n2
            android.graphics.drawable.Drawable r3 = r1.f(r3)
            r10.h(r3)
            int r3 = e.a.j.o2
            java.lang.String r3 = r0.n(r3)
            r10.g(r3)
            r1.v()
            r6.f690j = r10
            androidx.appcompat.widget.w$a r1 = new androidx.appcompat.widget.w$a
            r1.<init>(r6, r10)
            r6.f687g = r1
            goto L_0x00b8
        L_0x00a8:
            androidx.appcompat.widget.w$c r10 = new androidx.appcompat.widget.w$c
            r10.<init>()
            r6.f690j = r10
            int r1 = e.a.j.o2
            java.lang.String r1 = r0.n(r1)
            r10.g(r1)
        L_0x00b8:
            int r10 = e.a.j.m2
            java.lang.CharSequence[] r10 = r0.p(r10)
            if (r10 == 0) goto L_0x00d0
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = e.a.g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00d0:
            r0.v()
            r6.f689i = r11
            android.widget.SpinnerAdapter r7 = r6.f688h
            if (r7 == 0) goto L_0x00de
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f688h = r2
        L_0x00de:
            androidx.appcompat.widget.e r7 = r6.f685e
            r7.e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: package-private */
    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.f692l);
        Rect rect = this.f692l;
        return i3 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f690j.l(getTextDirection(), getTextAlignment());
        } else {
            this.f690j.l(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f685e;
        if (eVar != null) {
            eVar.b();
        }
    }

    public int getDropDownHorizontalOffset() {
        g gVar = this.f690j;
        if (gVar != null) {
            return gVar.a();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        g gVar = this.f690j;
        if (gVar != null) {
            return gVar.m();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f690j != null) {
            return this.f691k;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final g getInternalPopup() {
        return this.f690j;
    }

    public Drawable getPopupBackground() {
        g gVar = this.f690j;
        if (gVar != null) {
            return gVar.e();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f686f;
    }

    public CharSequence getPrompt() {
        g gVar = this.f690j;
        return gVar != null ? gVar.n() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f685e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f685e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f690j;
        if (gVar != null && gVar.b()) {
            this.f690j.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f690j != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.f706e && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f690j;
        fVar.f706e = gVar != null && gVar.b();
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var = this.f687g;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        g gVar = this.f690j;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.b()) {
            return true;
        }
        b();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f689i) {
            this.f688h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f690j != null) {
            Context context = this.f686f;
            if (context == null) {
                context = getContext();
            }
            this.f690j.o(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f685e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f685e;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        g gVar = this.f690j;
        if (gVar != null) {
            gVar.j(i2);
            this.f690j.k(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    public void setDropDownVerticalOffset(int i2) {
        g gVar = this.f690j;
        if (gVar != null) {
            gVar.i(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public void setDropDownWidth(int i2) {
        if (this.f690j != null) {
            this.f691k = i2;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f690j;
        if (gVar != null) {
            gVar.h(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(e.a.k.a.a.d(getPopupContext(), i2));
    }

    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f690j;
        if (gVar != null) {
            gVar.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f685e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f685e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }
}
