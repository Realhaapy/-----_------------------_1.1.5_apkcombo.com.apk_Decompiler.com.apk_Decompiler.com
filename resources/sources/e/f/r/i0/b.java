package e.f.r.i0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import e.f.r.i0.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b {

    /* renamed from: d  reason: collision with root package name */
    private static int f3428d;
    private final AccessibilityNodeInfo a;
    public int b = -1;
    private int c = -1;

    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static final a f3429d = new a(4096, (CharSequence) null);

        /* renamed from: e  reason: collision with root package name */
        public static final a f3430e = new a(8192, (CharSequence) null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f3431f;

        /* renamed from: g  reason: collision with root package name */
        public static final a f3432g;
        final Object a;
        private final Class<? extends e.a> b;
        protected final e c;

        static {
            Class<e.c> cls = e.c.class;
            Class<e.b> cls2 = e.b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new a(1, (CharSequence) null);
            new a(2, (CharSequence) null);
            new a(4, (CharSequence) null);
            new a(8, (CharSequence) null);
            new a(16, (CharSequence) null);
            new a(32, (CharSequence) null);
            new a(64, (CharSequence) null);
            new a(128, (CharSequence) null);
            new a(256, (CharSequence) null, cls2);
            new a(512, (CharSequence) null, cls2);
            new a(1024, (CharSequence) null, cls);
            new a(2048, (CharSequence) null, cls);
            new a(16384, (CharSequence) null);
            new a(32768, (CharSequence) null);
            new a(65536, (CharSequence) null);
            new a(131072, (CharSequence) null, e.g.class);
            new a(262144, (CharSequence) null);
            new a(524288, (CharSequence) null);
            new a(1048576, (CharSequence) null);
            new a(2097152, (CharSequence) null, e.h.class);
            int i2 = Build.VERSION.SDK_INT;
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (e) null, (Class<? extends e.a>) null);
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (e) null, e.C0080e.class);
            f3431f = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (e) null, (Class<? extends e.a>) null);
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (e) null, (Class<? extends e.a>) null);
            f3432g = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (e) null, (Class<? extends e.a>) null);
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (e) null, (Class<? extends e.a>) null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (e) null, (Class<? extends e.a>) null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (e) null, (Class<? extends e.a>) null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (e) null, (Class<? extends e.a>) null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (e) null, (Class<? extends e.a>) null);
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (e) null, (Class<? extends e.a>) null);
            new a(i2 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (e) null, e.f.class);
            new a(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (e) null, e.d.class);
            new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (e) null, (Class<? extends e.a>) null);
            new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (e) null, (Class<? extends e.a>) null);
            new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (e) null, (Class<? extends e.a>) null);
            if (i2 >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            new a(accessibilityAction, 16908372, (CharSequence) null, (e) null, (Class<? extends e.a>) null);
        }

        public a(int i2, CharSequence charSequence) {
            this((Object) null, i2, charSequence, (e) null, (Class<? extends e.a>) null);
        }

        private a(int i2, CharSequence charSequence, Class<? extends e.a> cls) {
            this((Object) null, i2, charSequence, (e) null, cls);
        }

        a(Object obj) {
            this(obj, 0, (CharSequence) null, (e) null, (Class<? extends e.a>) null);
        }

        a(Object obj, int i2, CharSequence charSequence, e eVar, Class<? extends e.a> cls) {
            this.c = eVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            }
            this.a = obj;
            this.b = cls;
        }

        public int a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
            }
            return 0;
        }

        public CharSequence b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getLabel();
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                e.f.r.i0.e r0 = r4.c
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends e.f.r.i0.e$a> r2 = r4.b
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                e.f.r.i0.e$a r1 = (e.f.r.i0.e.a) r1     // Catch:{ Exception -> 0x0020 }
                r1.a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends e.f.r.i0.e$a> r1 = r4.b
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                e.f.r.i0.e r6 = r4.c
                boolean r5 = r6.a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: e.f.r.i0.b.a.c(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.a;
            Object obj3 = ((a) obj).a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    private b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    private void G(View view) {
        SparseArray<WeakReference<ClickableSpan>> q2 = q(view);
        if (q2 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < q2.size(); i2++) {
                if (q2.valueAt(i2).get() == null) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                q2.remove(((Integer) arrayList.get(i3)).intValue());
            }
        }
    }

    private void H(int i2, boolean z) {
        Bundle n2 = n();
        if (n2 != null) {
            int i3 = n2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i2);
            if (!z) {
                i2 = 0;
            }
            n2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
        }
    }

    public static b P(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new b(accessibilityNodeInfo);
    }

    private void b(ClickableSpan clickableSpan, Spanned spanned, int i2) {
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
    }

    private void d() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private List<Integer> e(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private static String g(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                switch (i2) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i2) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    public static ClickableSpan[] l(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> o(View view) {
        SparseArray<WeakReference<ClickableSpan>> q2 = q(view);
        if (q2 != null) {
            return q2;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(e.f.e.f3313r, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> q(View view) {
        return (SparseArray) view.getTag(e.f.e.f3313r);
    }

    private boolean t() {
        return !e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int u(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i2).get())) {
                    return sparseArray.keyAt(i2);
                }
            }
        }
        int i3 = f3428d;
        f3428d = i3 + 1;
        return i3;
    }

    public boolean A() {
        return this.a.isFocused();
    }

    public boolean B() {
        return this.a.isLongClickable();
    }

    public boolean C() {
        return this.a.isPassword();
    }

    public boolean D() {
        return this.a.isScrollable();
    }

    public boolean E() {
        return this.a.isSelected();
    }

    public boolean F(int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.a.performAction(i2, bundle);
        }
        return false;
    }

    public void I(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public void J(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setHeading(z);
        } else {
            H(2, z);
        }
    }

    public void K(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            this.a.setPaneTitle(charSequence);
        } else if (i2 >= 19) {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void L(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setScreenReaderFocusable(z);
        } else {
            H(1, z);
        }
    }

    public void M(boolean z) {
        this.a.setScrollable(z);
    }

    public void N(CharSequence charSequence) {
        if (e.f.n.a.a()) {
            this.a.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public AccessibilityNodeInfo O() {
        return this.a;
    }

    public void a(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
        }
    }

    public void c(CharSequence charSequence, View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19 && i2 < 26) {
            d();
            G(view);
            ClickableSpan[] l2 = l(charSequence);
            if (l2 != null && l2.length > 0) {
                n().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", e.f.e.a);
                SparseArray<WeakReference<ClickableSpan>> o2 = o(view);
                int i3 = 0;
                while (l2 != null && i3 < l2.length) {
                    int u = u(l2[i3], o2);
                    o2.put(u, new WeakReference(l2[i3]));
                    b(l2[i3], (Spanned) charSequence, u);
                    i3++;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (bVar.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(bVar.a)) {
            return false;
        }
        return this.c == bVar.c && this.b == bVar.b;
    }

    public List<a> f() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.a.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new a(actionList.get(i2)));
        }
        return arrayList;
    }

    public int h() {
        return this.a.getActions();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @Deprecated
    public void i(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public void j(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public CharSequence k() {
        return this.a.getClassName();
    }

    public CharSequence m() {
        return this.a.getContentDescription();
    }

    public Bundle n() {
        return Build.VERSION.SDK_INT >= 19 ? this.a.getExtras() : new Bundle();
    }

    public CharSequence p() {
        return this.a.getPackageName();
    }

    public CharSequence r() {
        if (!t()) {
            return this.a.getText();
        }
        List<Integer> e2 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> e3 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> e4 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> e5 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
        for (int i2 = 0; i2 < e2.size(); i2++) {
            spannableString.setSpan(new a(e5.get(i2).intValue(), this, n().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), e2.get(i2).intValue(), e3.get(i2).intValue(), e4.get(i2).intValue());
        }
        return spannableString;
    }

    public String s() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.a.getViewIdResourceName();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        i(rect);
        sb.append("; boundsInParent: " + rect);
        j(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(p());
        sb.append("; className: ");
        sb.append(k());
        sb.append("; text: ");
        sb.append(r());
        sb.append("; contentDescription: ");
        sb.append(m());
        sb.append("; viewId: ");
        sb.append(s());
        sb.append("; checkable: ");
        sb.append(v());
        sb.append("; checked: ");
        sb.append(w());
        sb.append("; focusable: ");
        sb.append(z());
        sb.append("; focused: ");
        sb.append(A());
        sb.append("; selected: ");
        sb.append(E());
        sb.append("; clickable: ");
        sb.append(x());
        sb.append("; longClickable: ");
        sb.append(B());
        sb.append("; enabled: ");
        sb.append(y());
        sb.append("; password: ");
        sb.append(C());
        sb.append("; scrollable: " + D());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> f2 = f();
            for (int i2 = 0; i2 < f2.size(); i2++) {
                a aVar = f2.get(i2);
                String g2 = g(aVar.a());
                if (g2.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                    g2 = aVar.b().toString();
                }
                sb.append(g2);
                if (i2 != f2.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int h2 = h();
            while (h2 != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(h2);
                h2 &= ~numberOfTrailingZeros;
                sb.append(g(numberOfTrailingZeros));
                if (h2 != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean v() {
        return this.a.isCheckable();
    }

    public boolean w() {
        return this.a.isChecked();
    }

    public boolean x() {
        return this.a.isClickable();
    }

    public boolean y() {
        return this.a.isEnabled();
    }

    public boolean z() {
        return this.a.isFocusable();
    }
}
