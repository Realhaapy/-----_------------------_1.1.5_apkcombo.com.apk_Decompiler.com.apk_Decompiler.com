package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import e.f.r.y;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends i0 implements e.a.n.c {
    static final n u0 = (Build.VERSION.SDK_INT < 29 ? new n() : null);
    final ImageView A;
    private final View B;
    private p C;
    private Rect D;
    private Rect E;
    private int[] F;
    private int[] G;
    private final ImageView H;
    private final Drawable I;
    private final int J;
    private final int K;
    private final Intent L;
    private final Intent M;
    private final CharSequence N;
    private l O;
    private k P;
    View.OnFocusChangeListener Q;
    private m R;
    private View.OnClickListener S;
    private boolean T;
    private boolean U;
    e.g.a.a V;
    private boolean W;
    private CharSequence a0;
    private boolean b0;
    private boolean c0;
    private int d0;
    private boolean e0;
    private CharSequence f0;
    private CharSequence g0;
    private boolean h0;
    private int i0;
    SearchableInfo j0;
    private Bundle k0;
    private final Runnable l0;
    private Runnable m0;
    private final WeakHashMap<String, Drawable.ConstantState> n0;
    private final View.OnClickListener o0;
    View.OnKeyListener p0;
    private final TextView.OnEditorActionListener q0;
    private final AdapterView.OnItemClickListener r0;
    private final AdapterView.OnItemSelectedListener s0;
    final SearchAutoComplete t;
    private TextWatcher t0;
    private final View u;
    private final View v;
    private final View w;
    final ImageView x;
    final ImageView y;
    final ImageView z;

    public static class SearchAutoComplete extends d {

        /* renamed from: h  reason: collision with root package name */
        private int f457h;

        /* renamed from: i  reason: collision with root package name */
        private SearchView f458i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f459j;

        /* renamed from: k  reason: collision with root package name */
        final Runnable f460k;

        class a implements Runnable {
            a() {
            }

            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, e.a.a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.f460k = new a();
            this.f457h = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.u0.c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (this.f459j) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f459j = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f457h <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f459j) {
                removeCallbacks(this.f460k);
                post(this.f460k);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i2, Rect rect) {
            super.onFocusChanged(z, i2, rect);
            this.f458i.X();
        }

        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f458i.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f458i.hasFocus() && getVisibility() == 0) {
                this.f459j = true;
                if (SearchView.K(getContext())) {
                    a();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f459j = false;
                removeCallbacks(this.f460k);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f459j = false;
                removeCallbacks(this.f460k);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f459j = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f458i = searchView;
        }

        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f457h = i2;
        }
    }

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            SearchView.this.W(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            SearchView.this.d0();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            e.g.a.a aVar = SearchView.this.V;
            if (aVar instanceof q0) {
                aVar.a((Cursor) null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.Q;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            SearchView.this.z();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.x) {
                searchView.T();
            } else if (view == searchView.z) {
                searchView.P();
            } else if (view == searchView.y) {
                searchView.U();
            } else if (view == searchView.A) {
                searchView.Y();
            } else if (view == searchView.t) {
                searchView.F();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.j0 == null) {
                return false;
            }
            if (searchView.t.isPopupShowing() && SearchView.this.t.getListSelection() != -1) {
                return SearchView.this.V(view, i2, keyEvent);
            }
            if (SearchView.this.t.b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.N(0, (String) null, searchView2.t.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            SearchView.this.U();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.Q(i2, 0, (String) null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.R(i2);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
        boolean a();
    }

    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    public interface m {
        boolean a(int i2);

        boolean b(int i2);
    }

    private static class n {
        private Method a = null;
        private Method b = null;
        private Method c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        n() {
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: package-private */
        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    static class o extends e.h.a.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        boolean f469g;

        class a implements Parcelable.ClassLoaderCreator<o> {
            a() {
            }

            /* renamed from: a */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            /* renamed from: c */
            public o[] newArray(int i2) {
                return new o[i2];
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f469g = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f469g + "}";
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Boolean.valueOf(this.f469g));
        }
    }

    private static class p extends TouchDelegate {
        private final View a;
        private final Rect b = new Rect();
        private final Rect c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        private final Rect f470d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        private final int f471e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f472f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f471e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.f470d.set(rect);
            Rect rect3 = this.f470d;
            int i2 = this.f471e;
            rect3.inset(-i2, -i2);
            this.c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f472f
                r7.f472f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f472f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f470d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f472f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x006e
                if (r2 == 0) goto L_0x005b
                android.graphics.Rect r2 = r7.c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005b
                android.view.View r0 = r7.a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0064
            L_0x005b:
                android.graphics.Rect r2 = r7.c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0064:
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                android.view.View r0 = r7.a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x006e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.a.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.D = new Rect();
        this.E = new Rect();
        this.F = new int[2];
        this.G = new int[2];
        this.l0 = new b();
        this.m0 = new c();
        this.n0 = new WeakHashMap<>();
        f fVar = new f();
        this.o0 = fVar;
        this.p0 = new g();
        h hVar = new h();
        this.q0 = hVar;
        i iVar = new i();
        this.r0 = iVar;
        j jVar = new j();
        this.s0 = jVar;
        this.t0 = new a();
        w0 u2 = w0.u(context, attributeSet, e.a.j.T1, i2, 0);
        LayoutInflater.from(context).inflate(u2.m(e.a.j.d2, e.a.g.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(e.a.f.search_src_text);
        this.t = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.u = findViewById(e.a.f.search_edit_frame);
        View findViewById = findViewById(e.a.f.search_plate);
        this.v = findViewById;
        View findViewById2 = findViewById(e.a.f.submit_area);
        this.w = findViewById2;
        ImageView imageView = (ImageView) findViewById(e.a.f.search_button);
        this.x = imageView;
        ImageView imageView2 = (ImageView) findViewById(e.a.f.search_go_btn);
        this.y = imageView2;
        ImageView imageView3 = (ImageView) findViewById(e.a.f.search_close_btn);
        this.z = imageView3;
        ImageView imageView4 = (ImageView) findViewById(e.a.f.search_voice_btn);
        this.A = imageView4;
        ImageView imageView5 = (ImageView) findViewById(e.a.f.search_mag_icon);
        this.H = imageView5;
        y.T(findViewById, u2.f(e.a.j.e2));
        y.T(findViewById2, u2.f(e.a.j.i2));
        int i3 = e.a.j.h2;
        imageView.setImageDrawable(u2.f(i3));
        imageView2.setImageDrawable(u2.f(e.a.j.b2));
        imageView3.setImageDrawable(u2.f(e.a.j.Y1));
        imageView4.setImageDrawable(u2.f(e.a.j.k2));
        imageView5.setImageDrawable(u2.f(i3));
        this.I = u2.f(e.a.j.g2);
        y0.a(imageView, getResources().getString(e.a.h.abc_searchview_description_search));
        this.J = u2.m(e.a.j.j2, e.a.g.abc_search_dropdown_item_icons_2line);
        this.K = u2.m(e.a.j.Z1, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.t0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.p0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(u2.a(e.a.j.c2, true));
        int e2 = u2.e(e.a.j.V1, -1);
        if (e2 != -1) {
            setMaxWidth(e2);
        }
        this.N = u2.o(e.a.j.a2);
        this.a0 = u2.o(e.a.j.f2);
        int j2 = u2.j(e.a.j.X1, -1);
        if (j2 != -1) {
            setImeOptions(j2);
        }
        int j3 = u2.j(e.a.j.W1, -1);
        if (j3 != -1) {
            setInputType(j3);
        }
        setFocusable(u2.a(e.a.j.U1, true));
        u2.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.L = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.M = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.B = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        i0(this.T);
        e0();
    }

    private Intent A(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.g0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.k0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.j0.getSearchActivity());
        return intent;
    }

    private Intent B(Cursor cursor, int i2, String str) {
        int i3;
        String o2;
        try {
            String o3 = q0.o(cursor, "suggest_intent_action");
            if (o3 == null) {
                o3 = this.j0.getSuggestIntentAction();
            }
            if (o3 == null) {
                o3 = "android.intent.action.SEARCH";
            }
            String str2 = o3;
            String o4 = q0.o(cursor, "suggest_intent_data");
            if (o4 == null) {
                o4 = this.j0.getSuggestIntentData();
            }
            if (!(o4 == null || (o2 = q0.o(cursor, "suggest_intent_data_id")) == null)) {
                o4 = o4 + "/" + Uri.encode(o2);
            }
            return A(str2, o4 == null ? null : Uri.parse(o4), q0.o(cursor, "suggest_intent_extra_data"), q0.o(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e2) {
            try {
                i3 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i3 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            return null;
        }
    }

    private Intent C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.k0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i2 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i2 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i2);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void E() {
        this.t.dismissDropDown();
    }

    private void G(View view, Rect rect) {
        view.getLocationInWindow(this.F);
        getLocationInWindow(this.G);
        int[] iArr = this.F;
        int i2 = iArr[1];
        int[] iArr2 = this.G;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    private CharSequence H(CharSequence charSequence) {
        if (!this.T || this.I == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.t.getTextSize()) * 1.25d);
        this.I.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.I), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean I() {
        SearchableInfo searchableInfo = this.j0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.j0.getVoiceSearchLaunchWebSearch()) {
            intent = this.L;
        } else if (this.j0.getVoiceSearchLaunchRecognizer()) {
            intent = this.M;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean L() {
        return (this.W || this.e0) && !J();
    }

    private void M(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e2) {
                Log.e("SearchView", "Failed launch activity: " + intent, e2);
            }
        }
    }

    private boolean O(int i2, int i3, String str) {
        Cursor b2 = this.V.b();
        if (b2 == null || !b2.moveToPosition(i2)) {
            return false;
        }
        M(B(b2, i3, str));
        return true;
    }

    private void Z() {
        post(this.l0);
    }

    private void a0(int i2) {
        CharSequence c2;
        Editable text = this.t.getText();
        Cursor b2 = this.V.b();
        if (b2 != null) {
            if (!b2.moveToPosition(i2) || (c2 = this.V.c(b2)) == null) {
                setQuery(text);
            } else {
                setQuery(c2);
            }
        }
    }

    private void c0() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.t.getText());
        int i2 = 0;
        if (!z3 && (!this.T || this.h0)) {
            z2 = false;
        }
        ImageView imageView = this.z;
        if (!z2) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.z.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.t;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(H(queryHint));
    }

    private void f0() {
        this.t.setThreshold(this.j0.getSuggestThreshold());
        this.t.setImeOptions(this.j0.getImeOptions());
        int inputType = this.j0.getInputType();
        int i2 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.j0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.t.setInputType(inputType);
        e.g.a.a aVar = this.V;
        if (aVar != null) {
            aVar.a((Cursor) null);
        }
        if (this.j0.getSuggestAuthority() != null) {
            q0 q0Var = new q0(getContext(), this, this.j0, this.n0);
            this.V = q0Var;
            this.t.setAdapter(q0Var);
            q0 q0Var2 = (q0) this.V;
            if (this.b0) {
                i2 = 2;
            }
            q0Var2.x(i2);
        }
    }

    private void g0() {
        this.w.setVisibility((!L() || !(this.y.getVisibility() == 0 || this.A.getVisibility() == 0)) ? 8 : 0);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(e.a.d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(e.a.d.abc_search_view_preferred_width);
    }

    private void h0(boolean z2) {
        this.y.setVisibility((!this.W || !L() || !hasFocus() || (!z2 && this.e0)) ? 8 : 0);
    }

    private void i0(boolean z2) {
        this.U = z2;
        int i2 = 0;
        int i3 = z2 ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.t.getText());
        this.x.setVisibility(i3);
        h0(z3);
        this.u.setVisibility(z2 ? 8 : 0);
        if (this.H.getDrawable() == null || this.T) {
            i2 = 8;
        }
        this.H.setVisibility(i2);
        c0();
        j0(!z3);
        g0();
    }

    private void j0(boolean z2) {
        int i2 = 8;
        if (this.e0 && !J() && z2) {
            this.y.setVisibility(8);
            i2 = 0;
        }
        this.A.setVisibility(i2);
    }

    private void setQuery(CharSequence charSequence) {
        this.t.setText(charSequence);
        this.t.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    public void F() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.t.refreshAutoCompleteResults();
            return;
        }
        n nVar = u0;
        nVar.b(this.t);
        nVar.a(this.t);
    }

    public boolean J() {
        return this.U;
    }

    /* access modifiers changed from: package-private */
    public void N(int i2, String str, String str2) {
        getContext().startActivity(A("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i2, str));
    }

    /* access modifiers changed from: package-private */
    public void P() {
        if (!TextUtils.isEmpty(this.t.getText())) {
            this.t.setText("");
            this.t.requestFocus();
            this.t.setImeVisibility(true);
        } else if (this.T) {
            k kVar = this.P;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                i0(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Q(int i2, int i3, String str) {
        m mVar = this.R;
        if (mVar != null && mVar.b(i2)) {
            return false;
        }
        O(i2, 0, (String) null);
        this.t.setImeVisibility(false);
        E();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean R(int i2) {
        m mVar = this.R;
        if (mVar != null && mVar.a(i2)) {
            return false;
        }
        a0(i2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    public void T() {
        i0(false);
        this.t.requestFocus();
        this.t.setImeVisibility(true);
        View.OnClickListener onClickListener = this.S;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void U() {
        Editable text = this.t.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            l lVar = this.O;
            if (lVar == null || !lVar.b(text.toString())) {
                if (this.j0 != null) {
                    N(0, (String) null, text.toString());
                }
                this.t.setImeVisibility(false);
                E();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean V(View view, int i2, KeyEvent keyEvent) {
        if (this.j0 != null && this.V != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return Q(this.t.getListSelection(), 0, (String) null);
            }
            if (i2 == 21 || i2 == 22) {
                this.t.setSelection(i2 == 21 ? 0 : this.t.length());
                this.t.setListSelection(0);
                this.t.clearListSelection();
                this.t.a();
                return true;
            } else if (i2 != 19 || this.t.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void W(CharSequence charSequence) {
        Editable text = this.t.getText();
        this.g0 = text;
        boolean z2 = !TextUtils.isEmpty(text);
        h0(z2);
        j0(!z2);
        c0();
        g0();
        if (this.O != null && !TextUtils.equals(charSequence, this.f0)) {
            this.O.a(charSequence.toString());
        }
        this.f0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    public void X() {
        i0(J());
        Z();
        if (this.t.hasFocus()) {
            F();
        }
    }

    /* access modifiers changed from: package-private */
    public void Y() {
        Intent C2;
        SearchableInfo searchableInfo = this.j0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    C2 = D(this.L, searchableInfo);
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    C2 = C(this.M, searchableInfo);
                } else {
                    return;
                }
                getContext().startActivity(C2);
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public void b0(CharSequence charSequence, boolean z2) {
        this.t.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.t;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.g0 = charSequence;
        }
        if (z2 && !TextUtils.isEmpty(charSequence)) {
            U();
        }
    }

    public void c() {
        if (!this.h0) {
            this.h0 = true;
            int imeOptions = this.t.getImeOptions();
            this.i0 = imeOptions;
            this.t.setImeOptions(imeOptions | 33554432);
            this.t.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.c0 = true;
        super.clearFocus();
        this.t.clearFocus();
        this.t.setImeVisibility(false);
        this.c0 = false;
    }

    public void d() {
        b0("", false);
        clearFocus();
        i0(true);
        this.t.setImeOptions(this.i0);
        this.h0 = false;
    }

    /* access modifiers changed from: package-private */
    public void d0() {
        int[] iArr = this.t.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.v.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.w.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.t.getImeOptions();
    }

    public int getInputType() {
        return this.t.getInputType();
    }

    public int getMaxWidth() {
        return this.d0;
    }

    public CharSequence getQuery() {
        return this.t.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.a0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.j0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.N : getContext().getText(this.j0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.K;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.J;
    }

    public e.g.a.a getSuggestionsAdapter() {
        return this.V;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.l0);
        post(this.m0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            G(this.t, this.D);
            Rect rect = this.E;
            Rect rect2 = this.D;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            p pVar = this.C;
            if (pVar == null) {
                p pVar2 = new p(this.E, this.D, this.t);
                this.C = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.a(this.E, this.D);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 <= 0) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.J()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r4, r5)
            return
        L_0x000a:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002c
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            int r0 = r3.d0
            if (r0 <= 0) goto L_0x0039
            goto L_0x0030
        L_0x0022:
            int r4 = r3.d0
            if (r4 <= 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            int r4 = r3.getPreferredWidth()
            goto L_0x0039
        L_0x002c:
            int r0 = r3.d0
            if (r0 <= 0) goto L_0x0031
        L_0x0030:
            goto L_0x0035
        L_0x0031:
            int r0 = r3.getPreferredWidth()
        L_0x0035:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0039:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004b
            if (r0 == 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            int r5 = r3.getPreferredHeight()
            goto L_0x0053
        L_0x004b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0053:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        i0(oVar.f469g);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f469g = J();
        return oVar;
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        Z();
    }

    public boolean requestFocus(int i2, Rect rect) {
        if (this.c0 || !isFocusable()) {
            return false;
        }
        if (J()) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.t.requestFocus(i2, rect);
        if (requestFocus) {
            i0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.k0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            P();
        } else {
            T();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.T != z2) {
            this.T = z2;
            i0(z2);
            e0();
        }
    }

    public void setImeOptions(int i2) {
        this.t.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.t.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.d0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.P = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.Q = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.O = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.S = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.R = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.a0 = charSequence;
        e0();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.b0 = z2;
        e.g.a.a aVar = this.V;
        if (aVar instanceof q0) {
            ((q0) aVar).x(z2 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.j0 = searchableInfo;
        if (searchableInfo != null) {
            f0();
            e0();
        }
        boolean I2 = I();
        this.e0 = I2;
        if (I2) {
            this.t.setPrivateImeOptions("nm");
        }
        i0(J());
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.W = z2;
        i0(J());
    }

    public void setSuggestionsAdapter(e.g.a.a aVar) {
        this.V = aVar;
        this.t.setAdapter(aVar);
    }

    /* access modifiers changed from: package-private */
    public void z() {
        if (this.B.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.v.getPaddingLeft();
            Rect rect = new Rect();
            boolean b2 = c1.b(this);
            int dimensionPixelSize = this.T ? resources.getDimensionPixelSize(e.a.d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(e.a.d.abc_dropdownitem_text_padding_left) : 0;
            this.t.getDropDownBackground().getPadding(rect);
            int i2 = rect.left;
            this.t.setDropDownHorizontalOffset(b2 ? -i2 : paddingLeft - (i2 + dimensionPixelSize));
            this.t.setDropDownWidth((((this.B.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
