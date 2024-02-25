package e.f.r;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import e.f.e;
import e.f.r.i0.b;
import e.f.r.i0.c;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class d {
    private static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate a;
    private final View.AccessibilityDelegate b;

    static final class a extends View.AccessibilityDelegate {
        final d a;

        a(d dVar) {
            this.a = dVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            c b = this.a.b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.a();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            e.f.r.i0.b P = e.f.r.i0.b.P(accessibilityNodeInfo);
            P.L(y.E(view));
            P.J(y.B(view));
            P.K(y.l(view));
            P.N(y.w(view));
            this.a.g(view, P);
            P.c(accessibilityNodeInfo.getText(), view);
            List<b.a> c = d.c(view);
            for (int i2 = 0; i2 < c.size(); i2++) {
                P.a(c.get(i2));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.a.j(view, i2, bundle);
        }

        public void sendAccessibilityEvent(View view, int i2) {
            this.a.l(view, i2);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.m(view, accessibilityEvent);
        }
    }

    static class b {
        static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i2, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i2, bundle);
        }
    }

    public d() {
        this(c);
    }

    public d(View.AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
        this.b = new a(this);
    }

    static List<b.a> c(View view) {
        List<b.a> list = (List) view.getTag(e.f3312q);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] l2 = e.f.r.i0.b.l(view.createAccessibilityNodeInfo().getText());
            int i2 = 0;
            while (l2 != null && i2 < l2.length) {
                if (clickableSpan.equals(l2[i2])) {
                    return true;
                }
                i2++;
            }
        }
        return false;
    }

    private boolean k(int i2, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(e.f3313r);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i2)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public c b(View view) {
        AccessibilityNodeProvider a2;
        if (Build.VERSION.SDK_INT < 16 || (a2 = b.a(this.a, view)) == null) {
            return null;
        }
        return new c(a2);
    }

    /* access modifiers changed from: package-private */
    public View.AccessibilityDelegate d() {
        return this.b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, e.f.r.i0.b bVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, bVar.O());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i2, Bundle bundle) {
        List<b.a> c2 = c(view);
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= c2.size()) {
                break;
            }
            b.a aVar = c2.get(i3);
            if (aVar.a() == i2) {
                z = aVar.c(view, bundle);
                break;
            }
            i3++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = b.b(this.a, view, i2, bundle);
        }
        return (z || i2 != e.a || bundle == null) ? z : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i2) {
        this.a.sendAccessibilityEvent(view, i2);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
