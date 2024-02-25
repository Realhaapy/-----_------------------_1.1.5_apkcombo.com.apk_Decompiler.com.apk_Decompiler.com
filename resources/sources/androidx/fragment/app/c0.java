package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import e.f.n.b;
import e.f.r.y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

abstract class c0 {
    private final ViewGroup a;
    final ArrayList<e> b = new ArrayList<>();
    final ArrayList<e> c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    boolean f1009d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f1010e = false;

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f1011e;

        a(d dVar) {
            this.f1011e = dVar;
        }

        public void run() {
            if (c0.this.b.contains(this.f1011e)) {
                this.f1011e.e().a(this.f1011e.f().mView);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f1013e;

        b(d dVar) {
            this.f1013e = dVar;
        }

        public void run() {
            c0.this.b.remove(this.f1013e);
            c0.this.c.remove(this.f1013e);
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.c0$e$b[] r0 = androidx.fragment.app.c0.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                androidx.fragment.app.c0$e$b r2 = androidx.fragment.app.c0.e.b.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.c0$e$b r3 = androidx.fragment.app.c0.e.b.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.c0$e$b r4 = androidx.fragment.app.c0.e.b.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.c0$e$c[] r3 = androidx.fragment.app.c0.e.c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                a = r3
                androidx.fragment.app.c0$e$c r4 = androidx.fragment.app.c0.e.c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.c0$e$c r3 = androidx.fragment.app.c0.e.c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c0.c.<clinit>():void");
        }
    }

    private static class d extends e {

        /* renamed from: h  reason: collision with root package name */
        private final u f1015h;

        d(e.c cVar, e.b bVar, u uVar, e.f.n.b bVar2) {
            super(cVar, bVar, uVar.k(), bVar2);
            this.f1015h = uVar;
        }

        public void c() {
            super.c();
            this.f1015h.m();
        }

        /* access modifiers changed from: package-private */
        public void l() {
            if (g() == e.b.ADDING) {
                Fragment k2 = this.f1015h.k();
                View findFocus = k2.mView.findFocus();
                if (findFocus != null) {
                    k2.setFocusedView(findFocus);
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k2);
                    }
                }
                View requireView = f().requireView();
                if (requireView.getParent() == null) {
                    this.f1015h.b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(k2.getPostOnViewCreatedAlpha());
            }
        }
    }

    static class e {
        private c a;
        private b b;
        private final Fragment c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Runnable> f1016d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private final HashSet<e.f.n.b> f1017e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        private boolean f1018f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f1019g = false;

        class a implements b.C0072b {
            a() {
            }

            public void a() {
                e.this.b();
            }
        }

        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static c c(int i2) {
                if (i2 == 0) {
                    return VISIBLE;
                }
                if (i2 == 4) {
                    return INVISIBLE;
                }
                if (i2 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i2);
            }

            static c d(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : c(view.getVisibility());
            }

            /* access modifiers changed from: package-private */
            public void a(View view) {
                int i2;
                int i3 = c.a[ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (n.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                        }
                        i2 = 0;
                    } else if (i3 == 3) {
                        if (n.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        i2 = 8;
                    } else if (i3 == 4) {
                        if (n.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    } else {
                        return;
                    }
                    view.setVisibility(i2);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        e(c cVar, b bVar, Fragment fragment, e.f.n.b bVar2) {
            this.a = cVar;
            this.b = bVar;
            this.c = fragment;
            bVar2.c(new a());
        }

        /* access modifiers changed from: package-private */
        public final void a(Runnable runnable) {
            this.f1016d.add(runnable);
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            if (!h()) {
                this.f1018f = true;
                if (this.f1017e.isEmpty()) {
                    c();
                    return;
                }
                Iterator it = new ArrayList(this.f1017e).iterator();
                while (it.hasNext()) {
                    ((e.f.n.b) it.next()).a();
                }
            }
        }

        public void c() {
            if (!this.f1019g) {
                if (n.F0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f1019g = true;
                for (Runnable run : this.f1016d) {
                    run.run();
                }
            }
        }

        public final void d(e.f.n.b bVar) {
            if (this.f1017e.remove(bVar) && this.f1017e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.a;
        }

        public final Fragment f() {
            return this.c;
        }

        /* access modifiers changed from: package-private */
        public b g() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public final boolean h() {
            return this.f1018f;
        }

        /* access modifiers changed from: package-private */
        public final boolean i() {
            return this.f1019g;
        }

        public final void j(e.f.n.b bVar) {
            l();
            this.f1017e.add(bVar);
        }

        /* access modifiers changed from: package-private */
        public final void k(c cVar, b bVar) {
            b bVar2;
            int i2 = c.b[bVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
                    }
                    this.a = c.REMOVED;
                    bVar2 = b.REMOVING;
                } else if (i2 == 3 && this.a != c.REMOVED) {
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + " -> " + cVar + ". ");
                    }
                    this.a = cVar;
                    return;
                } else {
                    return;
                }
            } else if (this.a == c.REMOVED) {
                if (n.F0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
                }
                this.a = c.VISIBLE;
                bVar2 = b.ADDING;
            } else {
                return;
            }
            this.b = bVar2;
        }

        /* access modifiers changed from: package-private */
        public void l() {
        }

        public String toString() {
            return "Operation " + "{" + Integer.toHexString(System.identityHashCode(this)) + "} " + "{" + "mFinalState = " + this.a + "} " + "{" + "mLifecycleImpact = " + this.b + "} " + "{" + "mFragment = " + this.c + "}";
        }
    }

    c0(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, u uVar) {
        synchronized (this.b) {
            e.f.n.b bVar2 = new e.f.n.b();
            e h2 = h(uVar.k());
            if (h2 != null) {
                h2.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, uVar, bVar2);
            this.b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    private e h(Fragment fragment) {
        Iterator<e> it = this.b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        Iterator<e> it = this.c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    static c0 n(ViewGroup viewGroup, n nVar) {
        return o(viewGroup, nVar.y0());
    }

    static c0 o(ViewGroup viewGroup, d0 d0Var) {
        int i2 = e.j.b.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i2);
        if (tag instanceof c0) {
            return (c0) tag;
        }
        c0 a2 = d0Var.a(viewGroup);
        viewGroup.setTag(i2, a2);
        return a2;
    }

    private void q() {
        Iterator<e> it = this.b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.c(next.f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(e.c cVar, u uVar) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + uVar.k());
        }
        a(cVar, e.b.ADDING, uVar);
    }

    /* access modifiers changed from: package-private */
    public void c(u uVar) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + uVar.k());
        }
        a(e.c.GONE, e.b.NONE, uVar);
    }

    /* access modifiers changed from: package-private */
    public void d(u uVar) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + uVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, uVar);
    }

    /* access modifiers changed from: package-private */
    public void e(u uVar) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + uVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, uVar);
    }

    /* access modifiers changed from: package-private */
    public abstract void f(List<e> list, boolean z);

    /* access modifiers changed from: package-private */
    public void g() {
        if (!this.f1010e) {
            if (!y.C(this.a)) {
                j();
                this.f1009d = false;
                return;
            }
            synchronized (this.b) {
                if (!this.b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.c);
                    this.c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (n.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((e) it2.next()).l();
                    }
                    f(arrayList2, this.f1009d);
                    this.f1009d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        String str;
        String str2;
        boolean C = y.C(this.a);
        synchronized (this.b) {
            q();
            Iterator<e> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            Iterator it2 = new ArrayList(this.c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (n.F0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (C) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.b();
            }
            Iterator it3 = new ArrayList(this.b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (n.F0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (C) {
                        str = "";
                    } else {
                        str = "Container " + this.a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        if (this.f1010e) {
            this.f1010e = false;
            g();
        }
    }

    /* access modifiers changed from: package-private */
    public e.b l(u uVar) {
        e h2 = h(uVar.k());
        if (h2 != null) {
            return h2.g();
        }
        e i2 = i(uVar.k());
        if (i2 != null) {
            return i2.g();
        }
        return null;
    }

    public ViewGroup m() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        synchronized (this.b) {
            q();
            this.f1010e = false;
            int size = this.b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.b.get(size);
                e.c d2 = e.c.d(eVar.f().mView);
                e.c e2 = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (e2 == cVar && d2 != cVar) {
                    this.f1010e = eVar.f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r(boolean z) {
        this.f1009d = z;
    }
}
