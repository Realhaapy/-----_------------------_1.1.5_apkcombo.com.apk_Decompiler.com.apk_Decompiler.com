package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.r;
import androidx.fragment.app.c0;
import androidx.fragment.app.f;
import e.f.n.b;
import e.f.r.w;
import e.f.r.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class c extends c0 {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.c0$e$c[] r0 = androidx.fragment.app.c0.e.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.a.<clinit>():void");
        }
    }

    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f990e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c0.e f991f;

        b(List list, c0.e eVar) {
            this.f990e = list;
            this.f991f = eVar;
        }

        public void run() {
            if (this.f990e.contains(this.f991f)) {
                this.f990e.remove(this.f991f);
                c.this.s(this.f991f);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c  reason: collision with other inner class name */
    class C0018c extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ boolean c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c0.e f993d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f994e;

        C0018c(c cVar, ViewGroup viewGroup, View view, boolean z, c0.e eVar, k kVar) {
            this.a = viewGroup;
            this.b = view;
            this.c = z;
            this.f993d = eVar;
            this.f994e = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            if (this.c) {
                this.f993d.e().a(this.b);
            }
            this.f994e.a();
        }
    }

    class d implements b.C0072b {
        final /* synthetic */ Animator a;

        d(c cVar, Animator animator) {
            this.a = animator;
        }

        public void a() {
            this.a.end();
        }
    }

    class e implements Animation.AnimationListener {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ k c;

        class a implements Runnable {
            a() {
            }

            public void run() {
                e eVar = e.this;
                eVar.a.endViewTransition(eVar.b);
                e.this.c.a();
            }
        }

        e(c cVar, ViewGroup viewGroup, View view, k kVar) {
            this.a = viewGroup;
            this.b = view;
            this.c = kVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class f implements b.C0072b {
        final /* synthetic */ View a;
        final /* synthetic */ ViewGroup b;
        final /* synthetic */ k c;

        f(c cVar, View view, ViewGroup viewGroup, k kVar) {
            this.a = view;
            this.b = viewGroup;
            this.c = kVar;
        }

        public void a() {
            this.a.clearAnimation();
            this.b.endViewTransition(this.a);
            this.c.a();
        }
    }

    class g implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c0.e f996e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c0.e f997f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f998g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e.e.a f999h;

        g(c cVar, c0.e eVar, c0.e eVar2, boolean z, e.e.a aVar) {
            this.f996e = eVar;
            this.f997f = eVar2;
            this.f998g = z;
            this.f999h = aVar;
        }

        public void run() {
            x.f(this.f996e.f(), this.f997f.f(), this.f998g, this.f999h, false);
        }
    }

    class h implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z f1000e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f1001f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Rect f1002g;

        h(c cVar, z zVar, View view, Rect rect) {
            this.f1000e = zVar;
            this.f1001f = view;
            this.f1002g = rect;
        }

        public void run() {
            this.f1000e.k(this.f1001f, this.f1002g);
        }
    }

    class i implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f1003e;

        i(c cVar, ArrayList arrayList) {
            this.f1003e = arrayList;
        }

        public void run() {
            x.B(this.f1003e, 4);
        }
    }

    class j implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f1004e;

        j(c cVar, m mVar) {
            this.f1004e = mVar;
        }

        public void run() {
            this.f1004e.a();
        }
    }

    private static class k extends l {
        private boolean c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f1005d = false;

        /* renamed from: e  reason: collision with root package name */
        private f.d f1006e;

        k(c0.e eVar, e.f.n.b bVar, boolean z) {
            super(eVar, bVar);
            this.c = z;
        }

        /* access modifiers changed from: package-private */
        public f.d e(Context context) {
            if (this.f1005d) {
                return this.f1006e;
            }
            f.d c2 = f.c(context, b().f(), b().e() == c0.e.c.VISIBLE, this.c);
            this.f1006e = c2;
            this.f1005d = true;
            return c2;
        }
    }

    private static class l {
        private final c0.e a;
        private final e.f.n.b b;

        l(c0.e eVar, e.f.n.b bVar) {
            this.a = eVar;
            this.b = bVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.a.d(this.b);
        }

        /* access modifiers changed from: package-private */
        public c0.e b() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public e.f.n.b c() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
            r2 = androidx.fragment.app.c0.e.c.VISIBLE;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean d() {
            /*
                r3 = this;
                androidx.fragment.app.c0$e r0 = r3.a
                androidx.fragment.app.Fragment r0 = r0.f()
                android.view.View r0 = r0.mView
                androidx.fragment.app.c0$e$c r0 = androidx.fragment.app.c0.e.c.d(r0)
                androidx.fragment.app.c0$e r1 = r3.a
                androidx.fragment.app.c0$e$c r1 = r1.e()
                if (r0 == r1) goto L_0x001d
                androidx.fragment.app.c0$e$c r2 = androidx.fragment.app.c0.e.c.VISIBLE
                if (r0 == r2) goto L_0x001b
                if (r1 == r2) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r0 = 0
                goto L_0x001e
            L_0x001d:
                r0 = 1
            L_0x001e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.l.d():boolean");
        }
    }

    private static class m extends l {
        private final Object c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f1007d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f1008e;

        m(c0.e eVar, e.f.n.b bVar, boolean z, boolean z2) {
            super(eVar, bVar);
            boolean z3;
            Object obj;
            if (eVar.e() == c0.e.c.VISIBLE) {
                Fragment f2 = eVar.f();
                this.c = z ? f2.getReenterTransition() : f2.getEnterTransition();
                Fragment f3 = eVar.f();
                z3 = z ? f3.getAllowReturnTransitionOverlap() : f3.getAllowEnterTransitionOverlap();
            } else {
                Fragment f4 = eVar.f();
                this.c = z ? f4.getReturnTransition() : f4.getExitTransition();
                z3 = true;
            }
            this.f1007d = z3;
            if (z2) {
                Fragment f5 = eVar.f();
                obj = z ? f5.getSharedElementReturnTransition() : f5.getSharedElementEnterTransition();
            } else {
                obj = null;
            }
            this.f1008e = obj;
        }

        private z f(Object obj) {
            if (obj == null) {
                return null;
            }
            z zVar = x.b;
            if (zVar != null && zVar.e(obj)) {
                return zVar;
            }
            z zVar2 = x.c;
            if (zVar2 != null && zVar2.e(obj)) {
                return zVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* access modifiers changed from: package-private */
        public z e() {
            z f2 = f(this.c);
            z f3 = f(this.f1008e);
            if (f2 == null || f3 == null || f2 == f3) {
                return f2 != null ? f2 : f3;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.c + " which uses a different Transition  type than its shared element transition " + this.f1008e);
        }

        public Object g() {
            return this.f1008e;
        }

        /* access modifiers changed from: package-private */
        public Object h() {
            return this.c;
        }

        public boolean i() {
            return this.f1008e != null;
        }

        /* access modifiers changed from: package-private */
        public boolean j() {
            return this.f1007d;
        }
    }

    c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List<k> list, List<c0.e> list2, boolean z, Map<c0.e, Boolean> map) {
        StringBuilder sb;
        String str;
        f.d e2;
        ViewGroup m2 = m();
        Context context = m2.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (k next : list) {
            if (!next.d() && (e2 = next.e(context)) != null) {
                Animator animator = e2.b;
                if (animator == null) {
                    arrayList.add(next);
                } else {
                    c0.e b2 = next.b();
                    Fragment f2 = b2.f();
                    if (Boolean.TRUE.equals(map.get(b2))) {
                        if (n.F0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + f2 + " as this Fragment was involved in a Transition.");
                        }
                        next.a();
                    } else {
                        boolean z3 = b2.e() == c0.e.c.GONE;
                        List<c0.e> list3 = list2;
                        if (z3) {
                            list3.remove(b2);
                        }
                        View view = f2.mView;
                        m2.startViewTransition(view);
                        C0018c cVar = r0;
                        C0018c cVar2 = new C0018c(this, m2, view, z3, b2, next);
                        animator.addListener(cVar);
                        animator.setTarget(view);
                        animator.start();
                        next.c().c(new d(this, animator));
                        z2 = true;
                    }
                }
            } else {
                next.a();
            }
            Map<c0.e, Boolean> map2 = map;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            c0.e b3 = kVar.b();
            Fragment f3 = b3.f();
            if (z) {
                if (n.F0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f3);
                    str = " as Animations cannot run alongside Transitions.";
                }
                kVar.a();
            } else if (z2) {
                if (n.F0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f3);
                    str = " as Animations cannot run alongside Animators.";
                }
                kVar.a();
            } else {
                View view2 = f3.mView;
                f.d e3 = kVar.e(context);
                e.f.q.d.d(e3);
                Animation animation = e3.a;
                e.f.q.d.d(animation);
                Animation animation2 = animation;
                if (b3.e() != c0.e.c.REMOVED) {
                    view2.startAnimation(animation2);
                    kVar.a();
                } else {
                    m2.startViewTransition(view2);
                    f.e eVar = new f.e(animation2, m2, view2);
                    eVar.setAnimationListener(new e(this, m2, view2, kVar));
                    view2.startAnimation(eVar);
                }
                kVar.c().c(new f(this, view2, m2, kVar));
            }
            sb.append(str);
            Log.v("FragmentManager", sb.toString());
            kVar.a();
        }
    }

    private Map<c0.e, Boolean> x(List<m> list, List<c0.e> list2, boolean z, c0.e eVar, c0.e eVar2) {
        View view;
        View view2;
        Boolean bool;
        ArrayList arrayList;
        View view3;
        Object obj;
        e.e.a aVar;
        Boolean bool2;
        ArrayList arrayList2;
        Boolean bool3;
        HashMap hashMap;
        c0.e eVar3;
        z zVar;
        Rect rect;
        ArrayList arrayList3;
        View view4;
        r rVar;
        r rVar2;
        Boolean bool4;
        View view5;
        View view6;
        String q2;
        Boolean bool5;
        boolean z2 = z;
        c0.e eVar4 = eVar;
        c0.e eVar5 = eVar2;
        Boolean bool6 = Boolean.TRUE;
        Boolean bool7 = Boolean.FALSE;
        HashMap hashMap2 = new HashMap();
        z zVar2 = null;
        for (m next : list) {
            if (!next.d()) {
                z e2 = next.e();
                if (zVar2 == null) {
                    zVar2 = e2;
                } else if (!(e2 == null || zVar2 == e2)) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + next.b().f() + " returned Transition " + next.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (zVar2 == null) {
            for (m next2 : list) {
                hashMap2.put(next2.b(), bool7);
                next2.a();
            }
            return hashMap2;
        }
        View view7 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        e.e.a aVar2 = new e.e.a();
        Iterator<m> it = list.iterator();
        Object obj2 = null;
        View view8 = null;
        boolean z3 = false;
        while (true) {
            view = view8;
            if (!it.hasNext()) {
                break;
            }
            m next3 = it.next();
            if (!next3.i() || eVar4 == null || eVar5 == null) {
                aVar = aVar2;
                arrayList3 = arrayList4;
                bool2 = bool7;
                hashMap = hashMap2;
                view4 = view7;
                zVar = zVar2;
                arrayList2 = arrayList5;
                rect = rect2;
                eVar3 = eVar4;
                bool3 = bool6;
                view8 = view;
            } else {
                Object B = zVar2.B(zVar2.g(next3.g()));
                ArrayList<String> sharedElementSourceNames = eVar2.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.f().getSharedElementSourceNames();
                Object obj3 = B;
                ArrayList<String> sharedElementTargetNames = eVar.f().getSharedElementTargetNames();
                Rect rect3 = rect2;
                bool2 = bool7;
                int i2 = 0;
                while (i2 < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i2));
                    ArrayList<String> arrayList6 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i2));
                    }
                    i2++;
                    sharedElementTargetNames = arrayList6;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.f().getSharedElementTargetNames();
                Fragment f2 = eVar.f();
                if (!z2) {
                    rVar2 = f2.getExitTransitionCallback();
                    rVar = eVar2.f().getEnterTransitionCallback();
                } else {
                    rVar2 = f2.getEnterTransitionCallback();
                    rVar = eVar2.f().getExitTransitionCallback();
                }
                int i3 = 0;
                for (int size = sharedElementSourceNames.size(); i3 < size; size = size) {
                    aVar2.put(sharedElementSourceNames.get(i3), sharedElementTargetNames2.get(i3));
                    i3++;
                    c0.e eVar6 = eVar;
                }
                e.e.a aVar3 = new e.e.a();
                u(aVar3, eVar.f().mView);
                aVar3.o(sharedElementSourceNames);
                if (rVar2 != null) {
                    rVar2.c(sharedElementSourceNames, aVar3);
                    int size2 = sharedElementSourceNames.size() - 1;
                    while (size2 >= 0) {
                        String str = sharedElementSourceNames.get(size2);
                        View view9 = (View) aVar3.get(str);
                        if (view9 == null) {
                            aVar2.remove(str);
                            bool5 = bool6;
                        } else {
                            bool5 = bool6;
                            if (!str.equals(y.x(view9))) {
                                aVar2.put(y.x(view9), (String) aVar2.remove(str));
                            }
                        }
                        size2--;
                        bool6 = bool5;
                    }
                    bool4 = bool6;
                } else {
                    bool4 = bool6;
                    aVar2.o(aVar3.keySet());
                }
                e.e.a aVar4 = new e.e.a();
                u(aVar4, eVar2.f().mView);
                aVar4.o(sharedElementTargetNames2);
                aVar4.o(aVar2.values());
                if (rVar != null) {
                    rVar.c(sharedElementTargetNames2, aVar4);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str2 = sharedElementTargetNames2.get(size3);
                        View view10 = (View) aVar4.get(str2);
                        if (view10 == null) {
                            String q3 = x.q(aVar2, str2);
                            if (q3 != null) {
                                aVar2.remove(q3);
                            }
                        } else if (!str2.equals(y.x(view10)) && (q2 = x.q(aVar2, str2)) != null) {
                            aVar2.put(q2, y.x(view10));
                        }
                    }
                } else {
                    x.y(aVar2, aVar4);
                }
                v(aVar3, aVar2.keySet());
                v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList4.clear();
                    arrayList5.clear();
                    eVar3 = eVar;
                    eVar5 = eVar2;
                    aVar = aVar2;
                    arrayList3 = arrayList4;
                    hashMap = hashMap2;
                    view4 = view7;
                    zVar = zVar2;
                    view8 = view;
                    bool3 = bool4;
                    obj2 = null;
                    arrayList2 = arrayList5;
                    rect = rect3;
                } else {
                    x.f(eVar2.f(), eVar.f(), z2, aVar3, true);
                    Object obj4 = obj3;
                    g gVar = r0;
                    aVar = aVar2;
                    HashMap hashMap3 = hashMap2;
                    arrayList2 = arrayList5;
                    View view11 = view7;
                    ArrayList arrayList7 = arrayList4;
                    Rect rect4 = rect3;
                    ArrayList<String> arrayList8 = sharedElementTargetNames2;
                    ViewGroup m2 = m();
                    g gVar2 = new g(this, eVar2, eVar, z, aVar4);
                    w.a(m2, gVar);
                    for (View t : aVar3.values()) {
                        t(arrayList7, t);
                    }
                    if (!sharedElementSourceNames.isEmpty()) {
                        View view12 = (View) aVar3.get(sharedElementSourceNames.get(0));
                        zVar2.v(obj4, view12);
                        view8 = view12;
                    } else {
                        view8 = view;
                    }
                    for (View t2 : aVar4.values()) {
                        t(arrayList2, t2);
                    }
                    if (arrayList8.isEmpty() || (view6 = (View) aVar4.get(arrayList8.get(0))) == null) {
                        rect = rect4;
                        view5 = view11;
                    } else {
                        rect = rect4;
                        w.a(m(), new h(this, zVar2, view6, rect));
                        view5 = view11;
                        z3 = true;
                    }
                    zVar2.z(obj4, view5, arrayList7);
                    view4 = view5;
                    arrayList3 = arrayList7;
                    zVar = zVar2;
                    zVar2.t(obj4, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null, obj4, arrayList2);
                    eVar3 = eVar;
                    bool3 = bool4;
                    hashMap = hashMap3;
                    hashMap.put(eVar3, bool3);
                    eVar5 = eVar2;
                    hashMap.put(eVar5, bool3);
                    obj2 = obj4;
                }
            }
            view7 = view4;
            zVar2 = zVar;
            bool6 = bool3;
            bool7 = bool2;
            arrayList4 = arrayList3;
            eVar4 = eVar3;
            aVar2 = aVar;
            rect2 = rect;
            arrayList5 = arrayList2;
            hashMap2 = hashMap;
            z2 = z;
        }
        e.e.a aVar5 = aVar2;
        ArrayList arrayList9 = arrayList4;
        Boolean bool8 = bool7;
        HashMap hashMap4 = hashMap2;
        View view13 = view7;
        z zVar3 = zVar2;
        ArrayList arrayList10 = arrayList5;
        Rect rect5 = rect2;
        c0.e eVar7 = eVar4;
        Boolean bool9 = bool6;
        ArrayList arrayList11 = new ArrayList();
        Iterator<m> it2 = list.iterator();
        Object obj5 = null;
        Object obj6 = null;
        while (it2.hasNext()) {
            m next4 = it2.next();
            if (next4.d()) {
                hashMap4.put(next4.b(), bool8);
                next4.a();
                it2 = it2;
            } else {
                Iterator<m> it3 = it2;
                Boolean bool10 = bool8;
                Object g2 = zVar3.g(next4.h());
                Object obj7 = obj5;
                c0.e b2 = next4.b();
                boolean z4 = obj2 != null && (b2 == eVar7 || b2 == eVar5);
                if (g2 == null) {
                    if (!z4) {
                        hashMap4.put(b2, bool10);
                        next4.a();
                    }
                    view2 = view13;
                    arrayList = arrayList9;
                    bool = bool10;
                    view3 = view;
                    obj5 = obj7;
                } else {
                    bool = bool10;
                    ArrayList arrayList12 = new ArrayList();
                    Object obj8 = obj6;
                    t(arrayList12, b2.f().mView);
                    if (z4) {
                        if (b2 == eVar7) {
                            arrayList12.removeAll(arrayList9);
                        } else {
                            arrayList12.removeAll(arrayList10);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        zVar3.a(g2, view13);
                        view2 = view13;
                        arrayList = arrayList9;
                        obj = obj8;
                    } else {
                        zVar3.b(g2, arrayList12);
                        Object obj9 = g2;
                        view2 = view13;
                        Object obj10 = obj9;
                        obj = obj8;
                        zVar3.t(obj9, obj10, arrayList12, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null);
                        if (b2.e() == c0.e.c.GONE) {
                            list2.remove(b2);
                            g2 = obj10;
                            zVar3.r(g2, b2.f().mView, arrayList12);
                            arrayList = arrayList9;
                            w.a(m(), new i(this, arrayList12));
                        } else {
                            arrayList = arrayList9;
                            g2 = obj10;
                        }
                    }
                    if (b2.e() == c0.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z3) {
                            zVar3.u(g2, rect5);
                        }
                        view3 = view;
                    } else {
                        view3 = view;
                        zVar3.v(g2, view3);
                    }
                    hashMap4.put(b2, bool9);
                    obj5 = obj7;
                    if (next4.j()) {
                        obj5 = zVar3.n(obj5, g2, (Object) null);
                    } else {
                        obj = zVar3.n(obj, g2, (Object) null);
                    }
                    obj6 = obj;
                }
                it2 = it3;
                view = view3;
                arrayList9 = arrayList;
                bool8 = bool;
                view13 = view2;
            }
        }
        ArrayList arrayList13 = arrayList9;
        Object m3 = zVar3.m(obj5, obj6, obj2);
        for (m next5 : list) {
            if (!next5.d()) {
                Object h2 = next5.h();
                c0.e b3 = next5.b();
                boolean z5 = obj2 != null && (b3 == eVar7 || b3 == eVar5);
                if (h2 != null || z5) {
                    if (!y.D(m())) {
                        if (n.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + b3);
                        }
                        next5.a();
                    } else {
                        zVar3.w(next5.b().f(), m3, next5.c(), new j(this, next5));
                    }
                }
            }
        }
        if (!y.D(m())) {
            return hashMap4;
        }
        x.B(arrayList11, 4);
        ArrayList<String> o2 = zVar3.o(arrayList10);
        zVar3.c(m(), m3);
        zVar3.y(m(), arrayList13, arrayList10, o2, aVar5);
        x.B(arrayList11, 0);
        zVar3.A(obj2, arrayList13, arrayList10);
        return hashMap4;
    }

    /* access modifiers changed from: package-private */
    public void f(List<c0.e> list, boolean z) {
        c0.e eVar = null;
        c0.e eVar2 = null;
        for (c0.e next : list) {
            c0.e.c d2 = c0.e.c.d(next.f().mView);
            int i2 = a.a[next.e().ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (d2 == c0.e.c.VISIBLE && eVar == null) {
                    eVar = next;
                }
            } else if (i2 == 4 && d2 != c0.e.c.VISIBLE) {
                eVar2 = next;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<c0.e> arrayList3 = new ArrayList<>(list);
        for (c0.e next2 : list) {
            e.f.n.b bVar = new e.f.n.b();
            next2.j(bVar);
            arrayList.add(new k(next2, bVar, z));
            e.f.n.b bVar2 = new e.f.n.b();
            next2.j(bVar2);
            boolean z2 = false;
            if (z) {
                if (next2 != eVar) {
                    arrayList2.add(new m(next2, bVar2, z, z2));
                    next2.a(new b(arrayList3, next2));
                }
            } else if (next2 != eVar2) {
                arrayList2.add(new m(next2, bVar2, z, z2));
                next2.a(new b(arrayList3, next2));
            }
            z2 = true;
            arrayList2.add(new m(next2, bVar2, z, z2));
            next2.a(new b(arrayList3, next2));
        }
        Map<c0.e, Boolean> x = x(arrayList2, arrayList3, z, eVar, eVar2);
        w(arrayList, arrayList3, x.containsValue(Boolean.TRUE), x);
        for (c0.e s2 : arrayList3) {
            s(s2);
        }
        arrayList3.clear();
    }

    /* access modifiers changed from: package-private */
    public void s(c0.e eVar) {
        eVar.e().a(eVar.f().mView);
    }

    /* access modifiers changed from: package-private */
    public void t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            if (!arrayList.contains(view) && y.x(view) != null) {
                arrayList.add(view);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    t(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(Map<String, View> map, View view) {
        String x = y.x(view);
        if (x != null) {
            map.put(x, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v(e.e.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(y.x((View) it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
