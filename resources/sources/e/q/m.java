package e.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import e.e.g;
import e.f.r.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class m implements Cloneable {
    private static final int[] K = {2, 1, 3, 4};
    private static final g L = new a();
    private static ThreadLocal<e.e.a<Animator, d>> M = new ThreadLocal<>();
    ArrayList<Animator> A = new ArrayList<>();
    private int B = 0;
    private boolean C = false;
    private boolean D = false;
    private ArrayList<f> E = null;
    private ArrayList<Animator> F = new ArrayList<>();
    p G;
    private e H;
    private e.e.a<String, String> I;
    private g J = L;

    /* renamed from: e  reason: collision with root package name */
    private String f3612e = getClass().getName();

    /* renamed from: f  reason: collision with root package name */
    private long f3613f = -1;

    /* renamed from: g  reason: collision with root package name */
    long f3614g = -1;

    /* renamed from: h  reason: collision with root package name */
    private TimeInterpolator f3615h = null;

    /* renamed from: i  reason: collision with root package name */
    ArrayList<Integer> f3616i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    ArrayList<View> f3617j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<String> f3618k = null;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<Class<?>> f3619l = null;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<Integer> f3620m = null;

    /* renamed from: n  reason: collision with root package name */
    private ArrayList<View> f3621n = null;

    /* renamed from: o  reason: collision with root package name */
    private ArrayList<Class<?>> f3622o = null;

    /* renamed from: p  reason: collision with root package name */
    private ArrayList<String> f3623p = null;

    /* renamed from: q  reason: collision with root package name */
    private ArrayList<Integer> f3624q = null;

    /* renamed from: r  reason: collision with root package name */
    private ArrayList<View> f3625r = null;

    /* renamed from: s  reason: collision with root package name */
    private ArrayList<Class<?>> f3626s = null;
    private t t = new t();
    private t u = new t();
    q v = null;
    private int[] w = K;
    private ArrayList<s> x;
    private ArrayList<s> y;
    boolean z = false;

    class a extends g {
        a() {
        }

        public Path a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    class b extends AnimatorListenerAdapter {
        final /* synthetic */ e.e.a a;

        b(e.e.a aVar) {
            this.a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.remove(animator);
            m.this.A.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            m.this.A.add(animator);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            m.this.t();
            animator.removeListener(this);
        }
    }

    private static class d {
        View a;
        String b;
        s c;

        /* renamed from: d  reason: collision with root package name */
        m0 f3627d;

        /* renamed from: e  reason: collision with root package name */
        m f3628e;

        d(View view, String str, m mVar, m0 m0Var, s sVar) {
            this.a = view;
            this.b = str;
            this.c = sVar;
            this.f3627d = m0Var;
            this.f3628e = mVar;
        }
    }

    public static abstract class e {
    }

    public interface f {
        void a(m mVar);

        void b(m mVar);

        void c(m mVar);

        void d(m mVar);

        void e(m mVar);
    }

    private static e.e.a<Animator, d> B() {
        e.e.a<Animator, d> aVar = M.get();
        if (aVar != null) {
            return aVar;
        }
        e.e.a<Animator, d> aVar2 = new e.e.a<>();
        M.set(aVar2);
        return aVar2;
    }

    private static boolean L(s sVar, s sVar2, String str) {
        Object obj = sVar.a.get(str);
        Object obj2 = sVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void M(e.e.a<View, s> aVar, e.e.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            View valueAt = sparseArray.valueAt(i2);
            if (valueAt != null && K(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i2))) != null && K(view)) {
                s sVar = aVar.get(valueAt);
                s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.x.add(sVar);
                    this.y.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void N(e.e.a<View, s> aVar, e.e.a<View, s> aVar2) {
        s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View i2 = aVar.i(size);
            if (i2 != null && K(i2) && (remove = aVar2.remove(i2)) != null && K(remove.b)) {
                this.x.add(aVar.k(size));
                this.y.add(remove);
            }
        }
    }

    private void O(e.e.a<View, s> aVar, e.e.a<View, s> aVar2, e.e.d<View> dVar, e.e.d<View> dVar2) {
        View h2;
        int n2 = dVar.n();
        for (int i2 = 0; i2 < n2; i2++) {
            View p2 = dVar.p(i2);
            if (p2 != null && K(p2) && (h2 = dVar2.h(dVar.k(i2))) != null && K(h2)) {
                s sVar = aVar.get(p2);
                s sVar2 = aVar2.get(h2);
                if (!(sVar == null || sVar2 == null)) {
                    this.x.add(sVar);
                    this.y.add(sVar2);
                    aVar.remove(p2);
                    aVar2.remove(h2);
                }
            }
        }
    }

    private void P(e.e.a<View, s> aVar, e.e.a<View, s> aVar2, e.e.a<String, View> aVar3, e.e.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i2 = 0; i2 < size; i2++) {
            View m2 = aVar3.m(i2);
            if (m2 != null && K(m2) && (view = aVar4.get(aVar3.i(i2))) != null && K(view)) {
                s sVar = aVar.get(m2);
                s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.x.add(sVar);
                    this.y.add(sVar2);
                    aVar.remove(m2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void Q(t tVar, t tVar2) {
        e.e.a aVar = new e.e.a((g) tVar.a);
        e.e.a aVar2 = new e.e.a((g) tVar2.a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.w;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 == 1) {
                    N(aVar, aVar2);
                } else if (i3 == 2) {
                    P(aVar, aVar2, tVar.f3631d, tVar2.f3631d);
                } else if (i3 == 3) {
                    M(aVar, aVar2, tVar.b, tVar2.b);
                } else if (i3 == 4) {
                    O(aVar, aVar2, tVar.c, tVar2.c);
                }
                i2++;
            } else {
                e(aVar, aVar2);
                return;
            }
        }
    }

    private void W(Animator animator, e.e.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            h(animator);
        }
    }

    private void e(e.e.a<View, s> aVar, e.e.a<View, s> aVar2) {
        for (int i2 = 0; i2 < aVar.size(); i2++) {
            s m2 = aVar.m(i2);
            if (K(m2.b)) {
                this.x.add(m2);
                this.y.add((Object) null);
            }
        }
        for (int i3 = 0; i3 < aVar2.size(); i3++) {
            s m3 = aVar2.m(i3);
            if (K(m3.b)) {
                this.y.add(m3);
                this.x.add((Object) null);
            }
        }
    }

    private static void f(t tVar, View view, s sVar) {
        tVar.a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.b.indexOfKey(id) >= 0) {
                tVar.b.put(id, (Object) null);
            } else {
                tVar.b.put(id, view);
            }
        }
        String x2 = y.x(view);
        if (x2 != null) {
            if (tVar.f3631d.containsKey(x2)) {
                tVar.f3631d.put(x2, null);
            } else {
                tVar.f3631d.put(x2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.c.j(itemIdAtPosition) >= 0) {
                    View h2 = tVar.c.h(itemIdAtPosition);
                    if (h2 != null) {
                        y.Y(h2, false);
                        tVar.c.l(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                y.Y(view, true);
                tVar.c.l(itemIdAtPosition, view);
            }
        }
    }

    private void k(View view, boolean z2) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f3620m;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f3621n;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f3622o;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            if (!this.f3622o.get(i2).isInstance(view)) {
                                i2++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        s sVar = new s(view);
                        if (z2) {
                            m(sVar);
                        } else {
                            j(sVar);
                        }
                        sVar.c.add(this);
                        l(sVar);
                        f(z2 ? this.t : this.u, view, sVar);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f3624q;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f3625r;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f3626s;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i3 = 0;
                                    while (i3 < size2) {
                                        if (!this.f3626s.get(i3).isInstance(view)) {
                                            i3++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                    k(viewGroup.getChildAt(i4), z2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public p A() {
        return this.G;
    }

    public long C() {
        return this.f3613f;
    }

    public List<Integer> D() {
        return this.f3616i;
    }

    public List<String> E() {
        return this.f3618k;
    }

    public List<Class<?>> F() {
        return this.f3619l;
    }

    public List<View> G() {
        return this.f3617j;
    }

    public String[] H() {
        return null;
    }

    public s I(View view, boolean z2) {
        q qVar = this.v;
        if (qVar != null) {
            return qVar.I(view, z2);
        }
        return (z2 ? this.t : this.u).a.get(view);
    }

    public boolean J(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] H2 = H();
        if (H2 != null) {
            int length = H2.length;
            int i2 = 0;
            while (i2 < length) {
                if (!L(sVar, sVar2, H2[i2])) {
                    i2++;
                }
            }
            return false;
        }
        for (String L2 : sVar.a.keySet()) {
            if (L(sVar, sVar2, L2)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean K(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f3620m;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f3621n;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f3622o;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f3622o.get(i2).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f3623p != null && y.x(view) != null && this.f3623p.contains(y.x(view))) {
            return false;
        }
        if ((this.f3616i.size() == 0 && this.f3617j.size() == 0 && (((arrayList = this.f3619l) == null || arrayList.isEmpty()) && ((arrayList2 = this.f3618k) == null || arrayList2.isEmpty()))) || this.f3616i.contains(Integer.valueOf(id)) || this.f3617j.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f3618k;
        if (arrayList6 != null && arrayList6.contains(y.x(view))) {
            return true;
        }
        if (this.f3619l != null) {
            for (int i3 = 0; i3 < this.f3619l.size(); i3++) {
                if (this.f3619l.get(i3).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void R(View view) {
        if (!this.D) {
            for (int size = this.A.size() - 1; size >= 0; size--) {
                a.b(this.A.get(size));
            }
            ArrayList<f> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((f) arrayList2.get(i2)).c(this);
                }
            }
            this.C = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void S(ViewGroup viewGroup) {
        d dVar;
        this.x = new ArrayList<>();
        this.y = new ArrayList<>();
        Q(this.t, this.u);
        e.e.a<Animator, d> B2 = B();
        int size = B2.size();
        m0 d2 = c0.d(viewGroup);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator i3 = B2.i(i2);
            if (!(i3 == null || (dVar = B2.get(i3)) == null || dVar.a == null || !d2.equals(dVar.f3627d))) {
                s sVar = dVar.c;
                View view = dVar.a;
                s I2 = I(view, true);
                s x2 = x(view, true);
                if (I2 == null && x2 == null) {
                    x2 = this.u.a.get(view);
                }
                if (!(I2 == null && x2 == null) && dVar.f3628e.J(sVar, x2)) {
                    if (i3.isRunning() || i3.isStarted()) {
                        i3.cancel();
                    } else {
                        B2.remove(i3);
                    }
                }
            }
        }
        s(viewGroup, this.t, this.u, this.x, this.y);
        X();
    }

    public m T(f fVar) {
        ArrayList<f> arrayList = this.E;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.E.size() == 0) {
            this.E = null;
        }
        return this;
    }

    public m U(View view) {
        this.f3617j.remove(view);
        return this;
    }

    public void V(View view) {
        if (this.C) {
            if (!this.D) {
                for (int size = this.A.size() - 1; size >= 0; size--) {
                    a.c(this.A.get(size));
                }
                ArrayList<f> arrayList = this.E;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.E.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((f) arrayList2.get(i2)).d(this);
                    }
                }
            }
            this.C = false;
        }
    }

    /* access modifiers changed from: protected */
    public void X() {
        e0();
        e.e.a<Animator, d> B2 = B();
        Iterator<Animator> it = this.F.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (B2.containsKey(next)) {
                e0();
                W(next, B2);
            }
        }
        this.F.clear();
        t();
    }

    public m Y(long j2) {
        this.f3614g = j2;
        return this;
    }

    public void Z(e eVar) {
        this.H = eVar;
    }

    public m a0(TimeInterpolator timeInterpolator) {
        this.f3615h = timeInterpolator;
        return this;
    }

    public m b(f fVar) {
        if (this.E == null) {
            this.E = new ArrayList<>();
        }
        this.E.add(fVar);
        return this;
    }

    public void b0(g gVar) {
        if (gVar == null) {
            gVar = L;
        }
        this.J = gVar;
    }

    public void c0(p pVar) {
    }

    public m d(View view) {
        this.f3617j.add(view);
        return this;
    }

    public m d0(long j2) {
        this.f3613f = j2;
        return this;
    }

    /* access modifiers changed from: protected */
    public void e0() {
        if (this.B == 0) {
            ArrayList<f> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).a(this);
                }
            }
            this.D = false;
        }
        this.B++;
    }

    /* access modifiers changed from: package-private */
    public String f0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f3614g != -1) {
            str2 = str2 + "dur(" + this.f3614g + ") ";
        }
        if (this.f3613f != -1) {
            str2 = str2 + "dly(" + this.f3613f + ") ";
        }
        if (this.f3615h != null) {
            str2 = str2 + "interp(" + this.f3615h + ") ";
        }
        if (this.f3616i.size() <= 0 && this.f3617j.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f3616i.size() > 0) {
            for (int i2 = 0; i2 < this.f3616i.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f3616i.get(i2);
            }
        }
        if (this.f3617j.size() > 0) {
            for (int i3 = 0; i3 < this.f3617j.size(); i3++) {
                if (i3 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f3617j.get(i3);
            }
        }
        return str3 + ")";
    }

    /* access modifiers changed from: protected */
    public void h(Animator animator) {
        if (animator == null) {
            t();
            return;
        }
        if (u() >= 0) {
            animator.setDuration(u());
        }
        if (C() >= 0) {
            animator.setStartDelay(C() + animator.getStartDelay());
        }
        if (w() != null) {
            animator.setInterpolator(w());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* access modifiers changed from: protected */
    public void i() {
        for (int size = this.A.size() - 1; size >= 0; size--) {
            this.A.get(size).cancel();
        }
        ArrayList<f> arrayList = this.E;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.E.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((f) arrayList2.get(i2)).b(this);
            }
        }
    }

    public abstract void j(s sVar);

    /* access modifiers changed from: package-private */
    public void l(s sVar) {
        String[] b2;
        if (this.G != null && !sVar.a.isEmpty() && (b2 = this.G.b()) != null) {
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= b2.length) {
                    z2 = true;
                    break;
                } else if (!sVar.a.containsKey(b2[i2])) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z2) {
                this.G.a(sVar);
            }
        }
    }

    public abstract void m(s sVar);

    /* access modifiers changed from: package-private */
    public void n(ViewGroup viewGroup, boolean z2) {
        e.e.a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        p(z2);
        if ((this.f3616i.size() > 0 || this.f3617j.size() > 0) && (((arrayList = this.f3618k) == null || arrayList.isEmpty()) && ((arrayList2 = this.f3619l) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.f3616i.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.f3616i.get(i2).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z2) {
                        m(sVar);
                    } else {
                        j(sVar);
                    }
                    sVar.c.add(this);
                    l(sVar);
                    f(z2 ? this.t : this.u, findViewById, sVar);
                }
            }
            for (int i3 = 0; i3 < this.f3617j.size(); i3++) {
                View view = this.f3617j.get(i3);
                s sVar2 = new s(view);
                if (z2) {
                    m(sVar2);
                } else {
                    j(sVar2);
                }
                sVar2.c.add(this);
                l(sVar2);
                f(z2 ? this.t : this.u, view, sVar2);
            }
        } else {
            k(viewGroup, z2);
        }
        if (!z2 && (aVar = this.I) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList3.add(this.t.f3631d.remove(this.I.i(i4)));
            }
            for (int i5 = 0; i5 < size; i5++) {
                View view2 = (View) arrayList3.get(i5);
                if (view2 != null) {
                    this.t.f3631d.put(this.I.m(i5), view2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p(boolean z2) {
        t tVar;
        if (z2) {
            this.t.a.clear();
            this.t.b.clear();
            tVar = this.t;
        } else {
            this.u.a.clear();
            this.u.b.clear();
            tVar = this.u;
        }
        tVar.c.d();
    }

    /* renamed from: q */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.F = new ArrayList<>();
            mVar.t = new t();
            mVar.u = new t();
            mVar.x = null;
            mVar.y = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator r(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void s(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        int i2;
        int i3;
        Animator r2;
        View view;
        Animator animator;
        s sVar;
        s sVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        e.e.a<Animator, d> B2 = B();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j2 = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < size) {
            s sVar3 = arrayList.get(i4);
            s sVar4 = arrayList2.get(i4);
            if (sVar3 != null && !sVar3.c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null)) {
                if ((sVar3 == null || sVar4 == null || J(sVar3, sVar4)) && (r2 = r(viewGroup2, sVar3, sVar4)) != null) {
                    if (sVar4 != null) {
                        view = sVar4.b;
                        String[] H2 = H();
                        if (H2 != null && H2.length > 0) {
                            sVar2 = new s(view);
                            Animator animator3 = r2;
                            i3 = size;
                            s sVar5 = tVar2.a.get(view);
                            if (sVar5 != null) {
                                int i5 = 0;
                                while (i5 < H2.length) {
                                    sVar2.a.put(H2[i5], sVar5.a.get(H2[i5]));
                                    i5++;
                                    ArrayList<s> arrayList3 = arrayList2;
                                    i4 = i4;
                                    sVar5 = sVar5;
                                }
                            }
                            i2 = i4;
                            int size2 = B2.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                d dVar = B2.get(B2.i(i6));
                                if (dVar.c != null && dVar.a == view && dVar.b.equals(y()) && dVar.c.equals(sVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i3 = size;
                            i2 = i4;
                            animator2 = r2;
                            sVar2 = null;
                        }
                        animator = animator2;
                        sVar = sVar2;
                    } else {
                        i3 = size;
                        i2 = i4;
                        view = sVar3.b;
                        animator = r2;
                        sVar = null;
                    }
                    if (animator != null) {
                        p pVar = this.G;
                        if (pVar != null) {
                            long c2 = pVar.c(viewGroup2, this, sVar3, sVar4);
                            sparseIntArray.put(this.F.size(), (int) c2);
                            j2 = Math.min(c2, j2);
                        }
                        B2.put(animator, new d(view, y(), this, c0.d(viewGroup), sVar));
                        this.F.add(animator);
                        j2 = j2;
                    }
                    i4 = i2 + 1;
                    size = i3;
                }
            }
            i3 = size;
            i2 = i4;
            i4 = i2 + 1;
            size = i3;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator4 = this.F.get(sparseIntArray.keyAt(i7));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i7)) - j2) + animator4.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void t() {
        int i2 = this.B - 1;
        this.B = i2;
        if (i2 == 0) {
            ArrayList<f> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((f) arrayList2.get(i3)).e(this);
                }
            }
            for (int i4 = 0; i4 < this.t.c.n(); i4++) {
                View p2 = this.t.c.p(i4);
                if (p2 != null) {
                    y.Y(p2, false);
                }
            }
            for (int i5 = 0; i5 < this.u.c.n(); i5++) {
                View p3 = this.u.c.p(i5);
                if (p3 != null) {
                    y.Y(p3, false);
                }
            }
            this.D = true;
        }
    }

    public String toString() {
        return f0("");
    }

    public long u() {
        return this.f3614g;
    }

    public e v() {
        return this.H;
    }

    public TimeInterpolator w() {
        return this.f3615h;
    }

    /* access modifiers changed from: package-private */
    public s x(View view, boolean z2) {
        q qVar = this.v;
        if (qVar != null) {
            return qVar.x(view, z2);
        }
        ArrayList<s> arrayList = z2 ? this.x : this.y;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            s sVar = arrayList.get(i3);
            if (sVar == null) {
                return null;
            }
            if (sVar.b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 < 0) {
            return null;
        }
        return (z2 ? this.y : this.x).get(i2);
    }

    public String y() {
        return this.f3612e;
    }

    public g z() {
        return this.J;
    }
}
