package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import androidx.fragment.app.w;
import androidx.fragment.app.x;
import androidx.lifecycle.e;
import androidx.lifecycle.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class n {
    private static boolean O = false;
    static boolean P = true;
    private androidx.activity.result.c<androidx.activity.result.e> A;
    private androidx.activity.result.c<String[]> B;
    ArrayDeque<m> C = new ArrayDeque<>();
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private ArrayList<a> I;
    private ArrayList<Boolean> J;
    private ArrayList<Fragment> K;
    private ArrayList<q> L;
    private q M;
    private Runnable N = new g();
    private final ArrayList<o> a = new ArrayList<>();
    private boolean b;
    /* access modifiers changed from: private */
    public final v c = new v();

    /* renamed from: d  reason: collision with root package name */
    ArrayList<a> f1068d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Fragment> f1069e;

    /* renamed from: f  reason: collision with root package name */
    private final l f1070f = new l(this);

    /* renamed from: g  reason: collision with root package name */
    private OnBackPressedDispatcher f1071g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.activity.b f1072h = new c(false);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicInteger f1073i = new AtomicInteger();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Bundle> f1074j = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Object> f1075k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<C0020n> f1076l;

    /* renamed from: m  reason: collision with root package name */
    private Map<Fragment, HashSet<e.f.n.b>> f1077m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n  reason: collision with root package name */
    private final x.g f1078n = new d();

    /* renamed from: o  reason: collision with root package name */
    private final m f1079o = new m(this);

    /* renamed from: p  reason: collision with root package name */
    private final CopyOnWriteArrayList<r> f1080p = new CopyOnWriteArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    int f1081q = -1;

    /* renamed from: r  reason: collision with root package name */
    private k<?> f1082r;

    /* renamed from: s  reason: collision with root package name */
    private g f1083s;
    private Fragment t;
    Fragment u;
    private j v = null;
    private j w = new e();
    private d0 x = null;
    private d0 y = new f(this);
    private androidx.activity.result.c<Intent> z;

    class a implements androidx.activity.result.b<androidx.activity.result.a> {
        a() {
        }

        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            m pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f1086e;
            int i2 = pollFirst.f1087f;
            Fragment i3 = n.this.c.i(str);
            if (i3 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i3.onActivityResult(i2, aVar.b(), aVar.a());
        }
    }

    class b implements androidx.activity.result.b<Map<String, Boolean>> {
        b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            StringBuilder sb;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
            }
            m pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
            } else {
                String str = pollFirst.f1086e;
                int i3 = pollFirst.f1087f;
                Fragment i4 = n.this.c.i(str);
                if (i4 == null) {
                    sb = new StringBuilder();
                    sb.append("Permission request result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    i4.onRequestPermissionsResult(i3, strArr, iArr);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    class c extends androidx.activity.b {
        c(boolean z) {
            super(z);
        }

        public void handleOnBackPressed() {
            n.this.B0();
        }
    }

    class d implements x.g {
        d() {
        }

        public void a(Fragment fragment, e.f.n.b bVar) {
            if (!bVar.b()) {
                n.this.b1(fragment, bVar);
            }
        }

        public void b(Fragment fragment, e.f.n.b bVar) {
            n.this.f(fragment, bVar);
        }
    }

    class e extends j {
        e() {
        }

        public Fragment a(ClassLoader classLoader, String str) {
            return n.this.t0().b(n.this.t0().f(), str, (Bundle) null);
        }
    }

    class f implements d0 {
        f(n nVar) {
        }

        public c0 a(ViewGroup viewGroup) {
            return new c(viewGroup);
        }
    }

    class g implements Runnable {
        g() {
        }

        public void run() {
            n.this.b0(true);
        }
    }

    class h extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ Fragment c;

        h(n nVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.a = viewGroup;
            this.b = view;
            this.c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            animator.removeListener(this);
            Fragment fragment = this.c;
            View view = fragment.mView;
            if (view != null && fragment.mHidden) {
                view.setVisibility(8);
            }
        }
    }

    class i implements r {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Fragment f1085e;

        i(n nVar, Fragment fragment) {
            this.f1085e = fragment;
        }

        public void a(n nVar, Fragment fragment) {
            this.f1085e.onAttachFragment(fragment);
        }
    }

    class j implements androidx.activity.result.b<androidx.activity.result.a> {
        j() {
        }

        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            m pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f1086e;
            int i2 = pollFirst.f1087f;
            Fragment i3 = n.this.c.i(str);
            if (i3 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i3.onActivityResult(i2, aVar.b(), aVar.a());
        }
    }

    static class k extends androidx.activity.result.f.a<androidx.activity.result.e, androidx.activity.result.a> {
        k() {
        }

        /* renamed from: d */
        public Intent a(Context context, androidx.activity.result.e eVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a = eVar.a();
            if (!(a == null || (bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    e.b bVar = new e.b(eVar.d());
                    bVar.b((Intent) null);
                    bVar.c(eVar.c(), eVar.b());
                    eVar = bVar.a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
            if (n.F0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        /* renamed from: e */
        public androidx.activity.result.a c(int i2, Intent intent) {
            return new androidx.activity.result.a(i2, intent);
        }
    }

    public static abstract class l {
        @Deprecated
        public abstract void a(n nVar, Fragment fragment, Bundle bundle);

        public abstract void b(n nVar, Fragment fragment, Context context);

        public abstract void c(n nVar, Fragment fragment, Bundle bundle);

        public abstract void d(n nVar, Fragment fragment);

        public abstract void e(n nVar, Fragment fragment);

        public abstract void f(n nVar, Fragment fragment);

        public abstract void g(n nVar, Fragment fragment, Context context);

        public abstract void h(n nVar, Fragment fragment, Bundle bundle);

        public abstract void i(n nVar, Fragment fragment);

        public abstract void j(n nVar, Fragment fragment, Bundle bundle);

        public abstract void k(n nVar, Fragment fragment);

        public abstract void l(n nVar, Fragment fragment);

        public abstract void m(n nVar, Fragment fragment, View view, Bundle bundle);

        public abstract void n(n nVar, Fragment fragment);
    }

    @SuppressLint({"BanParcelableUsage"})
    static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        String f1086e;

        /* renamed from: f  reason: collision with root package name */
        int f1087f;

        class a implements Parcelable.Creator<m> {
            a() {
            }

            /* renamed from: a */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            /* renamed from: b */
            public m[] newArray(int i2) {
                return new m[i2];
            }
        }

        m(Parcel parcel) {
            this.f1086e = parcel.readString();
            this.f1087f = parcel.readInt();
        }

        m(String str, int i2) {
            this.f1086e = str;
            this.f1087f = i2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f1086e);
            parcel.writeInt(this.f1087f);
        }
    }

    /* renamed from: androidx.fragment.app.n$n  reason: collision with other inner class name */
    public interface C0020n {
        void a();
    }

    interface o {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class p implements o {
        final String a;
        final int b;
        final int c;

        p(String str, int i2, int i3) {
            this.a = str;
            this.b = i2;
            this.c = i3;
        }

        public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = n.this.u;
            if (fragment != null && this.b < 0 && this.a == null && fragment.getChildFragmentManager().X0()) {
                return false;
            }
            return n.this.Z0(arrayList, arrayList2, this.a, this.b, this.c);
        }
    }

    static class q implements Fragment.l {
        final boolean a;
        final a b;
        private int c;

        q(a aVar, boolean z) {
            this.a = z;
            this.b = aVar;
        }

        public void a() {
            int i2 = this.c - 1;
            this.c = i2;
            if (i2 == 0) {
                this.b.f968q.j1();
            }
        }

        public void b() {
            this.c++;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            a aVar = this.b;
            aVar.f968q.u(aVar, this.a, false, false);
        }

        /* access modifiers changed from: package-private */
        public void d() {
            boolean z = this.c > 0;
            for (Fragment next : this.b.f968q.s0()) {
                next.setOnStartEnterTransitionListener((Fragment.l) null);
                if (z && next.isPostponed()) {
                    next.startPostponedEnterTransition();
                }
            }
            a aVar = this.b;
            aVar.f968q.u(aVar, this.a, !z, true);
        }

        public boolean e() {
            return this.c == 0;
        }
    }

    static boolean F0(int i2) {
        return O || Log.isLoggable("FragmentManager", i2);
    }

    private boolean G0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.o();
    }

    private void M(Fragment fragment) {
        if (fragment != null && fragment.equals(g0(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    private void O0(e.e.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment o2 = bVar.o(i2);
            if (!o2.mAdded) {
                View requireView = o2.requireView();
                o2.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private void T(int i2) {
        try {
            this.b = true;
            this.c.d(i2);
            Q0(i2, false);
            if (P) {
                for (c0 j2 : s()) {
                    j2.j();
                }
            }
            this.b = false;
            b0(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    private void W() {
        if (this.H) {
            this.H = false;
            p1();
        }
    }

    private void Y() {
        if (P) {
            for (c0 j2 : s()) {
                j2.j();
            }
        } else if (!this.f1077m.isEmpty()) {
            for (Fragment next : this.f1077m.keySet()) {
                n(next);
                R0(next);
            }
        }
    }

    private boolean Y0(String str, int i2, int i3) {
        b0(false);
        a0(true);
        Fragment fragment = this.u;
        if (fragment != null && i2 < 0 && str == null && fragment.getChildFragmentManager().X0()) {
            return true;
        }
        boolean Z0 = Z0(this.I, this.J, str, i2, i3);
        if (Z0) {
            this.b = true;
            try {
                d1(this.I, this.J);
            } finally {
                q();
            }
        }
        q1();
        W();
        this.c.b();
        return Z0;
    }

    private void a0(boolean z2) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f1082r == null) {
            if (this.G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f1082r.g().getLooper()) {
            if (!z2) {
                p();
            }
            if (this.I == null) {
                this.I = new ArrayList<>();
                this.J = new ArrayList<>();
            }
            this.b = true;
            try {
                f0((ArrayList<a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    private int a1(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, e.e.b<Fragment> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            a aVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.x() && !aVar.v(arrayList, i5 + 1, i3)) {
                if (this.L == null) {
                    this.L = new ArrayList<>();
                }
                q qVar = new q(aVar, booleanValue);
                this.L.add(qVar);
                aVar.z(qVar);
                if (booleanValue) {
                    aVar.q();
                } else {
                    aVar.r(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                d(bVar);
            }
        }
        return i4;
    }

    private void d(e.e.b<Fragment> bVar) {
        int i2 = this.f1081q;
        if (i2 >= 1) {
            int min = Math.min(i2, 5);
            for (Fragment next : this.c.n()) {
                if (next.mState < min) {
                    S0(next, min);
                    if (next.mView != null && !next.mHidden && next.mIsNewlyAdded) {
                        bVar.add(next);
                    }
                }
            }
        }
    }

    private static void d0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            a aVar = arrayList.get(i2);
            boolean z2 = true;
            if (arrayList2.get(i2).booleanValue()) {
                aVar.m(-1);
                if (i2 != i3 - 1) {
                    z2 = false;
                }
                aVar.r(z2);
            } else {
                aVar.m(1);
                aVar.q();
            }
            i2++;
        }
    }

    private void d1(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                f0(arrayList, arrayList2);
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!arrayList.get(i2).f1131o) {
                        if (i3 != i2) {
                            e0(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (arrayList2.get(i2).booleanValue()) {
                            while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).f1131o) {
                                i3++;
                            }
                        }
                        e0(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    e0(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e0(java.util.ArrayList<androidx.fragment.app.a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            r15 = r18
            r5 = r19
            r4 = r20
            r3 = r21
            java.lang.Object r0 = r15.get(r4)
            androidx.fragment.app.a r0 = (androidx.fragment.app.a) r0
            boolean r2 = r0.f1131o
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.K
            if (r0 != 0) goto L_0x001e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.K = r0
            goto L_0x0021
        L_0x001e:
            r0.clear()
        L_0x0021:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.K
            androidx.fragment.app.v r1 = r6.c
            java.util.List r1 = r1.n()
            r0.addAll(r1)
            androidx.fragment.app.Fragment r0 = r17.x0()
            r1 = 0
            r7 = r4
            r16 = 0
        L_0x0034:
            r14 = 1
            if (r7 >= r3) goto L_0x0065
            java.lang.Object r8 = r15.get(r7)
            androidx.fragment.app.a r8 = (androidx.fragment.app.a) r8
            java.lang.Object r9 = r5.get(r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0050
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.K
            androidx.fragment.app.Fragment r0 = r8.s(r9, r0)
            goto L_0x0056
        L_0x0050:
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.K
            androidx.fragment.app.Fragment r0 = r8.A(r9, r0)
        L_0x0056:
            if (r16 != 0) goto L_0x0060
            boolean r8 = r8.f1123g
            if (r8 == 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            r16 = 0
            goto L_0x0062
        L_0x0060:
            r16 = 1
        L_0x0062:
            int r7 = r7 + 1
            goto L_0x0034
        L_0x0065:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.K
            r0.clear()
            if (r2 != 0) goto L_0x00bd
            int r0 = r6.f1081q
            if (r0 < r14) goto L_0x00bd
            boolean r0 = P
            if (r0 == 0) goto L_0x00a4
            r0 = r4
        L_0x0075:
            if (r0 >= r3) goto L_0x00bd
            java.lang.Object r1 = r15.get(r0)
            androidx.fragment.app.a r1 = (androidx.fragment.app.a) r1
            java.util.ArrayList<androidx.fragment.app.w$a> r1 = r1.a
            java.util.Iterator r1 = r1.iterator()
        L_0x0083:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00a1
            java.lang.Object r7 = r1.next()
            androidx.fragment.app.w$a r7 = (androidx.fragment.app.w.a) r7
            androidx.fragment.app.Fragment r7 = r7.b
            if (r7 == 0) goto L_0x0083
            androidx.fragment.app.n r8 = r7.mFragmentManager
            if (r8 == 0) goto L_0x0083
            androidx.fragment.app.u r7 = r6.w(r7)
            androidx.fragment.app.v r8 = r6.c
            r8.p(r7)
            goto L_0x0083
        L_0x00a1:
            int r0 = r0 + 1
            goto L_0x0075
        L_0x00a4:
            androidx.fragment.app.k<?> r0 = r6.f1082r
            android.content.Context r7 = r0.f()
            androidx.fragment.app.g r8 = r6.f1083s
            r13 = 0
            androidx.fragment.app.x$g r0 = r6.f1078n
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r1 = 1
            r14 = r0
            androidx.fragment.app.x.C(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00be
        L_0x00bd:
            r1 = 1
        L_0x00be:
            d0(r18, r19, r20, r21)
            boolean r0 = P
            if (r0 == 0) goto L_0x0143
            int r0 = r3 + -1
            java.lang.Object r0 = r5.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = r4
        L_0x00d2:
            if (r2 >= r3) goto L_0x011c
            java.lang.Object r7 = r15.get(r2)
            androidx.fragment.app.a r7 = (androidx.fragment.app.a) r7
            if (r0 == 0) goto L_0x00fb
            java.util.ArrayList<androidx.fragment.app.w$a> r8 = r7.a
            int r8 = r8.size()
            int r8 = r8 - r1
        L_0x00e3:
            if (r8 < 0) goto L_0x0119
            java.util.ArrayList<androidx.fragment.app.w$a> r9 = r7.a
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.w$a r9 = (androidx.fragment.app.w.a) r9
            androidx.fragment.app.Fragment r9 = r9.b
            if (r9 == 0) goto L_0x00f8
            androidx.fragment.app.u r9 = r6.w(r9)
            r9.m()
        L_0x00f8:
            int r8 = r8 + -1
            goto L_0x00e3
        L_0x00fb:
            java.util.ArrayList<androidx.fragment.app.w$a> r7 = r7.a
            java.util.Iterator r7 = r7.iterator()
        L_0x0101:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0119
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.w$a r8 = (androidx.fragment.app.w.a) r8
            androidx.fragment.app.Fragment r8 = r8.b
            if (r8 == 0) goto L_0x0101
            androidx.fragment.app.u r8 = r6.w(r8)
            r8.m()
            goto L_0x0101
        L_0x0119:
            int r2 = r2 + 1
            goto L_0x00d2
        L_0x011c:
            int r2 = r6.f1081q
            r6.Q0(r2, r1)
            java.util.Set r1 = r6.t(r15, r4, r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0129:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x013f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.c0 r2 = (androidx.fragment.app.c0) r2
            r2.r(r0)
            r2.p()
            r2.g()
            goto L_0x0129
        L_0x013f:
            r0 = r3
            r3 = r5
            goto L_0x0199
        L_0x0143:
            if (r2 == 0) goto L_0x0165
            e.e.b r7 = new e.e.b
            r7.<init>()
            r6.d(r7)
            r0 = r17
            r14 = 1
            r1 = r18
            r8 = r2
            r2 = r19
            r13 = r3
            r3 = r20
            r12 = r4
            r4 = r21
            r11 = r5
            r5 = r7
            int r0 = r0.a1(r1, r2, r3, r4, r5)
            r6.O0(r7)
            goto L_0x016b
        L_0x0165:
            r8 = r2
            r13 = r3
            r12 = r4
            r11 = r5
            r14 = 1
            r0 = r13
        L_0x016b:
            if (r0 == r12) goto L_0x0197
            if (r8 == 0) goto L_0x0197
            int r1 = r6.f1081q
            if (r1 < r14) goto L_0x018e
            androidx.fragment.app.k<?> r1 = r6.f1082r
            android.content.Context r7 = r1.f()
            androidx.fragment.app.g r8 = r6.f1083s
            r1 = 1
            androidx.fragment.app.x$g r2 = r6.f1078n
            r9 = r18
            r10 = r19
            r3 = r11
            r11 = r20
            r12 = r0
            r0 = r13
            r13 = r1
            r1 = 1
            r14 = r2
            androidx.fragment.app.x.C(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0191
        L_0x018e:
            r3 = r11
            r0 = r13
            r1 = 1
        L_0x0191:
            int r2 = r6.f1081q
            r6.Q0(r2, r1)
            goto L_0x0199
        L_0x0197:
            r3 = r11
            r0 = r13
        L_0x0199:
            r1 = r20
        L_0x019b:
            if (r1 >= r0) goto L_0x01bc
            java.lang.Object r2 = r15.get(r1)
            androidx.fragment.app.a r2 = (androidx.fragment.app.a) r2
            java.lang.Object r4 = r3.get(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x01b6
            int r4 = r2.f970s
            if (r4 < 0) goto L_0x01b6
            r4 = -1
            r2.f970s = r4
        L_0x01b6:
            r2.y()
            int r1 = r1 + 1
            goto L_0x019b
        L_0x01bc:
            if (r16 == 0) goto L_0x01c1
            r17.f1()
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.e0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private void f0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<q> arrayList3 = this.L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            q qVar = this.L.get(i2);
            if (arrayList == null || qVar.a || (indexOf2 = arrayList.indexOf(qVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (qVar.e() || (arrayList != null && qVar.b.v(arrayList, 0, arrayList.size()))) {
                    this.L.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || qVar.a || (indexOf = arrayList.indexOf(qVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        qVar.d();
                    }
                }
                i2++;
            } else {
                this.L.remove(i2);
                i2--;
                size--;
            }
            qVar.c();
            i2++;
        }
    }

    private void f1() {
        if (this.f1076l != null) {
            for (int i2 = 0; i2 < this.f1076l.size(); i2++) {
                this.f1076l.get(i2).a();
            }
        }
    }

    static int h1(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void k0() {
        if (P) {
            for (c0 k2 : s()) {
                k2.k();
            }
        } else if (this.L != null) {
            while (!this.L.isEmpty()) {
                this.L.remove(0).d();
            }
        }
    }

    private boolean l0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return false;
            }
            int size = this.a.size();
            boolean z2 = false;
            for (int i2 = 0; i2 < size; i2++) {
                z2 |= this.a.get(i2).a(arrayList, arrayList2);
            }
            this.a.clear();
            this.f1082r.g().removeCallbacks(this.N);
            return z2;
        }
    }

    private void n(Fragment fragment) {
        HashSet hashSet = this.f1077m.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((e.f.n.b) it.next()).a();
            }
            hashSet.clear();
            x(fragment);
            this.f1077m.remove(fragment);
        }
    }

    private q n0(Fragment fragment) {
        return this.M.i(fragment);
    }

    private void n1(Fragment fragment) {
        ViewGroup p0 = p0(fragment);
        if (p0 != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            int i2 = e.j.b.visible_removing_fragment_view_tag;
            if (p0.getTag(i2) == null) {
                p0.setTag(i2, fragment);
            }
            ((Fragment) p0.getTag(i2)).setPopDirection(fragment.getPopDirection());
        }
    }

    private void p() {
        if (K0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private ViewGroup p0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f1083s.d()) {
            View c2 = this.f1083s.c(fragment.mContainerId);
            if (c2 instanceof ViewGroup) {
                return (ViewGroup) c2;
            }
        }
        return null;
    }

    private void p1() {
        for (u V0 : this.c.k()) {
            V0(V0);
        }
    }

    private void q() {
        this.b = false;
        this.J.clear();
        this.I.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (m0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (I0(r3.t) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.setEnabled(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f1072h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void q1() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.n$o> r0 = r3.a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.n$o> r1 = r3.a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.b r1 = r3.f1072h     // Catch:{ all -> 0x002a }
            r1.setEnabled(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.b r0 = r3.f1072h
            int r1 = r3.m0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.t
            boolean r1 = r3.I0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.setEnabled(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.q1():void");
    }

    private Set<c0> s() {
        HashSet hashSet = new HashSet();
        for (u k2 : this.c.k()) {
            ViewGroup viewGroup = k2.k().mContainer;
            if (viewGroup != null) {
                hashSet.add(c0.o(viewGroup, y0()));
            }
        }
        return hashSet;
    }

    private Set<c0> t(ArrayList<a> arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator<w.a> it = arrayList.get(i2).a.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().b;
                if (!(fragment == null || (viewGroup = fragment.mContainer) == null)) {
                    hashSet.add(c0.n(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    private void v(Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            f.d c2 = f.c(this.f1082r.f(), fragment, !fragment.mHidden, fragment.getPopDirection());
            if (c2 == null || (animator = c2.b) == null) {
                if (c2 != null) {
                    fragment.mView.startAnimation(c2.a);
                    c2.a.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    ViewGroup viewGroup = fragment.mContainer;
                    View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    c2.b.addListener(new h(this, viewGroup, view, fragment));
                }
                c2.b.start();
            }
        }
        D0(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    private void x(Fragment fragment) {
        fragment.performDestroyView();
        this.f1079o.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.j(null);
        fragment.mInLayout = false;
    }

    static Fragment z0(View view) {
        Object tag = view.getTag(e.j.b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void A() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(0);
    }

    /* access modifiers changed from: package-private */
    public u A0(Fragment fragment) {
        return this.M.l(fragment);
    }

    /* access modifiers changed from: package-private */
    public void B(Configuration configuration) {
        for (Fragment next : this.c.n()) {
            if (next != null) {
                next.performConfigurationChanged(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void B0() {
        b0(true);
        if (this.f1072h.isEnabled()) {
            X0();
        } else {
            this.f1071g.c();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean C(MenuItem menuItem) {
        if (this.f1081q < 1) {
            return false;
        }
        for (Fragment next : this.c.n()) {
            if (next != null && next.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void C0(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            n1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void D() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(1);
    }

    /* access modifiers changed from: package-private */
    public void D0(Fragment fragment) {
        if (fragment.mAdded && G0(fragment)) {
            this.D = true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean E(Menu menu, MenuInflater menuInflater) {
        if (this.f1081q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (Fragment next : this.c.n()) {
            if (next != null && H0(next) && next.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z2 = true;
            }
        }
        if (this.f1069e != null) {
            for (int i2 = 0; i2 < this.f1069e.size(); i2++) {
                Fragment fragment = this.f1069e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.onDestroyOptionsMenu();
                }
            }
        }
        this.f1069e = arrayList;
        return z2;
    }

    public boolean E0() {
        return this.G;
    }

    /* access modifiers changed from: package-private */
    public void F() {
        this.G = true;
        b0(true);
        Y();
        T(-1);
        this.f1082r = null;
        this.f1083s = null;
        this.t = null;
        if (this.f1071g != null) {
            this.f1072h.remove();
            this.f1071g = null;
        }
        androidx.activity.result.c<Intent> cVar = this.z;
        if (cVar != null) {
            cVar.c();
            this.A.c();
            this.B.c();
        }
    }

    /* access modifiers changed from: package-private */
    public void G() {
        T(1);
    }

    /* access modifiers changed from: package-private */
    public void H() {
        for (Fragment next : this.c.n()) {
            if (next != null) {
                next.performLowMemory();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* access modifiers changed from: package-private */
    public void I(boolean z2) {
        for (Fragment next : this.c.n()) {
            if (next != null) {
                next.performMultiWindowModeChanged(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean I0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        n nVar = fragment.mFragmentManager;
        return fragment.equals(nVar.x0()) && I0(nVar.t);
    }

    /* access modifiers changed from: package-private */
    public void J(Fragment fragment) {
        Iterator<r> it = this.f1080p.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean J0(int i2) {
        return this.f1081q >= i2;
    }

    /* access modifiers changed from: package-private */
    public boolean K(MenuItem menuItem) {
        if (this.f1081q < 1) {
            return false;
        }
        for (Fragment next : this.c.n()) {
            if (next != null && next.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean K0() {
        return this.E || this.F;
    }

    /* access modifiers changed from: package-private */
    public void L(Menu menu) {
        if (this.f1081q >= 1) {
            for (Fragment next : this.c.n()) {
                if (next != null) {
                    next.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void L0(Fragment fragment, String[] strArr, int i2) {
        if (this.B != null) {
            this.C.addLast(new m(fragment.mWho, i2));
            this.B.a(strArr);
            return;
        }
        this.f1082r.j(fragment, strArr, i2);
    }

    /* access modifiers changed from: package-private */
    public void M0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (this.z != null) {
            this.C.addLast(new m(fragment.mWho, i2));
            if (!(intent == null || bundle == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.z.a(intent);
            return;
        }
        this.f1082r.m(fragment, intent, i2, bundle);
    }

    /* access modifiers changed from: package-private */
    public void N() {
        T(5);
    }

    /* access modifiers changed from: package-private */
    public void N0(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        Intent intent2;
        Fragment fragment2 = fragment;
        Bundle bundle2 = bundle;
        if (this.A != null) {
            if (bundle2 != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (F0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle2 + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
            } else {
                intent2 = intent;
            }
            IntentSender intentSender2 = intentSender;
            e.b bVar = new e.b(intentSender);
            bVar.b(intent2);
            bVar.c(i4, i3);
            androidx.activity.result.e a2 = bVar.a();
            int i6 = i2;
            this.C.addLast(new m(fragment2.mWho, i2));
            if (F0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.A.a(a2);
            return;
        }
        IntentSender intentSender3 = intentSender;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        this.f1082r.n(fragment, intentSender, i2, intent, i3, i4, i5, bundle);
    }

    /* access modifiers changed from: package-private */
    public void O(boolean z2) {
        for (Fragment next : this.c.n()) {
            if (next != null) {
                next.performPictureInPictureModeChanged(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean P(Menu menu) {
        boolean z2 = false;
        if (this.f1081q < 1) {
            return false;
        }
        for (Fragment next : this.c.n()) {
            if (next != null && H0(next) && next.performPrepareOptionsMenu(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    public void P0(Fragment fragment) {
        if (this.c.c(fragment.mWho)) {
            R0(fragment);
            View view = fragment.mView;
            if (!(view == null || !fragment.mIsNewlyAdded || fragment.mContainer == null)) {
                float f2 = fragment.mPostponedAlpha;
                if (f2 > 0.0f) {
                    view.setAlpha(f2);
                }
                fragment.mPostponedAlpha = 0.0f;
                fragment.mIsNewlyAdded = false;
                f.d c2 = f.c(this.f1082r.f(), fragment, true, fragment.getPopDirection());
                if (c2 != null) {
                    Animation animation = c2.a;
                    if (animation != null) {
                        fragment.mView.startAnimation(animation);
                    } else {
                        c2.b.setTarget(fragment.mView);
                        c2.b.start();
                    }
                }
            }
            if (fragment.mHiddenChanged) {
                v(fragment);
            }
        } else if (F0(3)) {
            Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f1081q + "since it is not added to " + this);
        }
    }

    /* access modifiers changed from: package-private */
    public void Q() {
        q1();
        M(this.u);
    }

    /* access modifiers changed from: package-private */
    public void Q0(int i2, boolean z2) {
        k<?> kVar;
        if (this.f1082r == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.f1081q) {
            this.f1081q = i2;
            if (P) {
                this.c.r();
            } else {
                for (Fragment P0 : this.c.n()) {
                    P0(P0);
                }
                for (u next : this.c.k()) {
                    Fragment k2 = next.k();
                    if (!k2.mIsNewlyAdded) {
                        P0(k2);
                    }
                    if (k2.mRemoving && !k2.isInBackStack()) {
                        this.c.q(next);
                    }
                }
            }
            p1();
            if (this.D && (kVar = this.f1082r) != null && this.f1081q == 7) {
                kVar.o();
                this.D = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void R() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(7);
    }

    /* access modifiers changed from: package-private */
    public void R0(Fragment fragment) {
        S0(fragment, this.f1081q);
    }

    /* access modifiers changed from: package-private */
    public void S() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(5);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r2 != 5) goto L_0x0164;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void S0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            r10 = this;
            androidx.fragment.app.v r0 = r10.c
            java.lang.String r1 = r11.mWho
            androidx.fragment.app.u r0 = r0.m(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0017
            androidx.fragment.app.u r0 = new androidx.fragment.app.u
            androidx.fragment.app.m r2 = r10.f1079o
            androidx.fragment.app.v r3 = r10.c
            r0.<init>(r2, r3, r11)
            r0.t(r1)
        L_0x0017:
            boolean r2 = r11.mFromLayout
            r3 = 2
            if (r2 == 0) goto L_0x0028
            boolean r2 = r11.mInLayout
            if (r2 == 0) goto L_0x0028
            int r2 = r11.mState
            if (r2 != r3) goto L_0x0028
            int r12 = java.lang.Math.max(r12, r3)
        L_0x0028:
            int r2 = r0.d()
            int r12 = java.lang.Math.min(r12, r2)
            int r2 = r11.mState
            r4 = 3
            java.lang.String r5 = "FragmentManager"
            r6 = -1
            r7 = 5
            r8 = 4
            if (r2 > r12) goto L_0x007c
            if (r2 >= r12) goto L_0x0047
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<e.f.n.b>> r2 = r10.f1077m
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0047
            r10.n(r11)
        L_0x0047:
            int r2 = r11.mState
            if (r2 == r6) goto L_0x0057
            if (r2 == 0) goto L_0x005c
            if (r2 == r1) goto L_0x0061
            if (r2 == r3) goto L_0x006b
            if (r2 == r8) goto L_0x0070
            if (r2 == r7) goto L_0x0075
            goto L_0x0164
        L_0x0057:
            if (r12 <= r6) goto L_0x005c
            r0.c()
        L_0x005c:
            if (r12 <= 0) goto L_0x0061
            r0.e()
        L_0x0061:
            if (r12 <= r6) goto L_0x0066
            r0.j()
        L_0x0066:
            if (r12 <= r1) goto L_0x006b
            r0.f()
        L_0x006b:
            if (r12 <= r3) goto L_0x0070
            r0.a()
        L_0x0070:
            if (r12 <= r8) goto L_0x0075
            r0.u()
        L_0x0075:
            if (r12 <= r7) goto L_0x0164
            r0.p()
            goto L_0x0164
        L_0x007c:
            if (r2 <= r12) goto L_0x0164
            if (r2 == 0) goto L_0x015d
            if (r2 == r1) goto L_0x014f
            if (r2 == r3) goto L_0x00c6
            if (r2 == r8) goto L_0x0097
            if (r2 == r7) goto L_0x0092
            r9 = 7
            if (r2 == r9) goto L_0x008d
            goto L_0x0164
        L_0x008d:
            if (r12 >= r9) goto L_0x0092
            r0.n()
        L_0x0092:
            if (r12 >= r7) goto L_0x0097
            r0.v()
        L_0x0097:
            if (r12 >= r8) goto L_0x00c6
            boolean r2 = F0(r4)
            if (r2 == 0) goto L_0x00b3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "movefrom ACTIVITY_CREATED: "
            r2.append(r7)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r5, r2)
        L_0x00b3:
            android.view.View r2 = r11.mView
            if (r2 == 0) goto L_0x00c6
            androidx.fragment.app.k<?> r2 = r10.f1082r
            boolean r2 = r2.k(r11)
            if (r2 == 0) goto L_0x00c6
            android.util.SparseArray<android.os.Parcelable> r2 = r11.mSavedViewState
            if (r2 != 0) goto L_0x00c6
            r0.s()
        L_0x00c6:
            if (r12 >= r3) goto L_0x014f
            r2 = 0
            android.view.View r7 = r11.mView
            if (r7 == 0) goto L_0x0144
            android.view.ViewGroup r8 = r11.mContainer
            if (r8 == 0) goto L_0x0144
            r8.endViewTransition(r7)
            android.view.View r7 = r11.mView
            r7.clearAnimation()
            boolean r7 = r11.isRemovingParent()
            if (r7 != 0) goto L_0x0144
            int r7 = r10.f1081q
            r8 = 0
            if (r7 <= r6) goto L_0x0105
            boolean r6 = r10.G
            if (r6 != 0) goto L_0x0105
            android.view.View r6 = r11.mView
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0105
            float r6 = r11.mPostponedAlpha
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0105
            androidx.fragment.app.k<?> r2 = r10.f1082r
            android.content.Context r2 = r2.f()
            r6 = 0
            boolean r7 = r11.getPopDirection()
            androidx.fragment.app.f$d r2 = androidx.fragment.app.f.c(r2, r11, r6, r7)
        L_0x0105:
            r11.mPostponedAlpha = r8
            android.view.ViewGroup r6 = r11.mContainer
            android.view.View r7 = r11.mView
            if (r2 == 0) goto L_0x0112
            androidx.fragment.app.x$g r8 = r10.f1078n
            androidx.fragment.app.f.a(r11, r2, r8)
        L_0x0112:
            r6.removeView(r7)
            boolean r2 = F0(r3)
            if (r2 == 0) goto L_0x013f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Removing view "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = " for fragment "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = " from container "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r5, r2)
        L_0x013f:
            android.view.ViewGroup r2 = r11.mContainer
            if (r6 == r2) goto L_0x0144
            return
        L_0x0144:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<e.f.n.b>> r2 = r10.f1077m
            java.lang.Object r2 = r2.get(r11)
            if (r2 != 0) goto L_0x014f
            r0.h()
        L_0x014f:
            if (r12 >= r1) goto L_0x015d
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<e.f.n.b>> r2 = r10.f1077m
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L_0x015a
            goto L_0x015e
        L_0x015a:
            r0.g()
        L_0x015d:
            r1 = r12
        L_0x015e:
            if (r1 >= 0) goto L_0x0163
            r0.i()
        L_0x0163:
            r12 = r1
        L_0x0164:
            int r0 = r11.mState
            if (r0 == r12) goto L_0x0196
            boolean r0 = F0(r4)
            if (r0 == 0) goto L_0x0194
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r11.mState
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r5, r0)
        L_0x0194:
            r11.mState = r12
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.S0(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: package-private */
    public void T0() {
        if (this.f1082r != null) {
            this.E = false;
            this.F = false;
            this.M.o(false);
            for (Fragment next : this.c.n()) {
                if (next != null) {
                    next.noteStateNotSaved();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void U() {
        this.F = true;
        this.M.o(true);
        T(4);
    }

    /* access modifiers changed from: package-private */
    public void U0(h hVar) {
        View view;
        for (u next : this.c.k()) {
            Fragment k2 = next.k();
            if (k2.mContainerId == hVar.getId() && (view = k2.mView) != null && view.getParent() == null) {
                k2.mContainer = hVar;
                next.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void V() {
        T(2);
    }

    /* access modifiers changed from: package-private */
    public void V0(u uVar) {
        Fragment k2 = uVar.k();
        if (!k2.mDeferStart) {
            return;
        }
        if (this.b) {
            this.H = true;
            return;
        }
        k2.mDeferStart = false;
        if (P) {
            uVar.m();
        } else {
            R0(k2);
        }
    }

    public void W0(int i2, int i3) {
        if (i2 >= 0) {
            Z(new p((String) null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public void X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f1069e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f1069e.get(i2).toString());
            }
        }
        ArrayList<a> arrayList2 = this.f1068d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = this.f1068d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.o(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1073i.get());
        synchronized (this.a) {
            int size3 = this.a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size3; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(this.a.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1082r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1083s);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1081q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public boolean X0() {
        return Y0((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    public void Z(o oVar, boolean z2) {
        if (!z2) {
            if (this.f1082r != null) {
                p();
            } else if (this.G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.a) {
            if (this.f1082r != null) {
                this.a.add(oVar);
                j1();
            } else if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Z0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        Boolean bool = Boolean.TRUE;
        ArrayList<a> arrayList3 = this.f1068d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1068d.remove(size));
            arrayList2.add(bool);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    a aVar = this.f1068d.get(size2);
                    if ((str != null && str.equals(aVar.t())) || (i2 >= 0 && i2 == aVar.f970s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = this.f1068d.get(size2);
                        if ((str == null || !str.equals(aVar2.t())) && (i2 < 0 || i2 != aVar2.f970s)) {
                            break;
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.f1068d.size() - 1) {
                return false;
            }
            for (int size3 = this.f1068d.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f1068d.remove(size3));
                arrayList2.add(bool);
            }
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public boolean b0(boolean z2) {
        a0(z2);
        boolean z3 = false;
        while (l0(this.I, this.J)) {
            this.b = true;
            try {
                d1(this.I, this.J);
                q();
                z3 = true;
            } catch (Throwable th) {
                q();
                throw th;
            }
        }
        q1();
        W();
        this.c.b();
        return z3;
    }

    /* access modifiers changed from: package-private */
    public void b1(Fragment fragment, e.f.n.b bVar) {
        HashSet hashSet = this.f1077m.get(fragment);
        if (hashSet != null && hashSet.remove(bVar) && hashSet.isEmpty()) {
            this.f1077m.remove(fragment);
            if (fragment.mState < 5) {
                x(fragment);
                R0(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c0(o oVar, boolean z2) {
        if (!z2 || (this.f1082r != null && !this.G)) {
            a0(z2);
            if (oVar.a(this.I, this.J)) {
                this.b = true;
                try {
                    d1(this.I, this.J);
                } finally {
                    q();
                }
            }
            q1();
            W();
            this.c.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void c1(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z2 = !fragment.isInBackStack();
        if (!fragment.mDetached || z2) {
            this.c.s(fragment);
            if (G0(fragment)) {
                this.D = true;
            }
            fragment.mRemoving = true;
            n1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(a aVar) {
        if (this.f1068d == null) {
            this.f1068d = new ArrayList<>();
        }
        this.f1068d.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void e1(Fragment fragment) {
        this.M.n(fragment);
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment, e.f.n.b bVar) {
        if (this.f1077m.get(fragment) == null) {
            this.f1077m.put(fragment, new HashSet());
        }
        this.f1077m.get(fragment).add(bVar);
    }

    /* access modifiers changed from: package-private */
    public u g(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        u w2 = w(fragment);
        fragment.mFragmentManager = this;
        this.c.p(w2);
        if (!fragment.mDetached) {
            this.c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (G0(fragment)) {
                this.D = true;
            }
        }
        return w2;
    }

    /* access modifiers changed from: package-private */
    public Fragment g0(String str) {
        return this.c.f(str);
    }

    /* access modifiers changed from: package-private */
    public void g1(Parcelable parcelable) {
        u uVar;
        if (parcelable != null) {
            p pVar = (p) parcelable;
            if (pVar.f1089e != null) {
                this.c.t();
                Iterator<t> it = pVar.f1089e.iterator();
                while (it.hasNext()) {
                    t next = it.next();
                    if (next != null) {
                        Fragment h2 = this.M.h(next.f1105f);
                        if (h2 != null) {
                            if (F0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + h2);
                            }
                            uVar = new u(this.f1079o, this.c, h2, next);
                        } else {
                            uVar = new u(this.f1079o, this.c, this.f1082r.f().getClassLoader(), q0(), next);
                        }
                        Fragment k2 = uVar.k();
                        k2.mFragmentManager = this;
                        if (F0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + k2.mWho + "): " + k2);
                        }
                        uVar.o(this.f1082r.f().getClassLoader());
                        this.c.p(uVar);
                        uVar.t(this.f1081q);
                    }
                }
                for (Fragment next2 : this.M.k()) {
                    if (!this.c.c(next2.mWho)) {
                        if (F0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next2 + " that was not found in the set of active Fragments " + pVar.f1089e);
                        }
                        this.M.n(next2);
                        next2.mFragmentManager = this;
                        u uVar2 = new u(this.f1079o, this.c, next2);
                        uVar2.t(1);
                        uVar2.m();
                        next2.mRemoving = true;
                        uVar2.m();
                    }
                }
                this.c.u(pVar.f1090f);
                if (pVar.f1091g != null) {
                    this.f1068d = new ArrayList<>(pVar.f1091g.length);
                    int i2 = 0;
                    while (true) {
                        b[] bVarArr = pVar.f1091g;
                        if (i2 >= bVarArr.length) {
                            break;
                        }
                        a a2 = bVarArr[i2].a(this);
                        if (F0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + a2.f970s + "): " + a2);
                            PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
                            a2.p("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f1068d.add(a2);
                        i2++;
                    }
                } else {
                    this.f1068d = null;
                }
                this.f1073i.set(pVar.f1092h);
                String str = pVar.f1093i;
                if (str != null) {
                    Fragment g0 = g0(str);
                    this.u = g0;
                    M(g0);
                }
                ArrayList<String> arrayList = pVar.f1094j;
                if (arrayList != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        Bundle bundle = pVar.f1095k.get(i3);
                        bundle.setClassLoader(this.f1082r.f().getClassLoader());
                        this.f1074j.put(arrayList.get(i3), bundle);
                    }
                }
                this.C = new ArrayDeque<>(pVar.f1096l);
            }
        }
    }

    public void h(r rVar) {
        this.f1080p.add(rVar);
    }

    public Fragment h0(int i2) {
        return this.c.g(i2);
    }

    /* access modifiers changed from: package-private */
    public void i(Fragment fragment) {
        this.M.f(fragment);
    }

    public Fragment i0(String str) {
        return this.c.h(str);
    }

    /* access modifiers changed from: package-private */
    public Parcelable i1() {
        int size;
        k0();
        Y();
        b0(true);
        this.E = true;
        this.M.o(true);
        ArrayList<t> v2 = this.c.v();
        b[] bVarArr = null;
        if (v2.isEmpty()) {
            if (F0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> w2 = this.c.w();
        ArrayList<a> arrayList = this.f1068d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new b[size];
            for (int i2 = 0; i2 < size; i2++) {
                bVarArr[i2] = new b(this.f1068d.get(i2));
                if (F0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f1068d.get(i2));
                }
            }
        }
        p pVar = new p();
        pVar.f1089e = v2;
        pVar.f1090f = w2;
        pVar.f1091g = bVarArr;
        pVar.f1092h = this.f1073i.get();
        Fragment fragment = this.u;
        if (fragment != null) {
            pVar.f1093i = fragment.mWho;
        }
        pVar.f1094j.addAll(this.f1074j.keySet());
        pVar.f1095k.addAll(this.f1074j.values());
        pVar.f1096l = new ArrayList<>(this.C);
        return pVar;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f1073i.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public Fragment j0(String str) {
        return this.c.i(str);
    }

    /* access modifiers changed from: package-private */
    public void j1() {
        synchronized (this.a) {
            ArrayList<q> arrayList = this.L;
            boolean z2 = false;
            boolean z3 = arrayList != null && !arrayList.isEmpty();
            if (this.a.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.f1082r.g().removeCallbacks(this.N);
                this.f1082r.g().post(this.N);
                q1();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: androidx.activity.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(androidx.fragment.app.k<?> r3, androidx.fragment.app.g r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.k<?> r0 = r2.f1082r
            if (r0 != 0) goto L_0x0103
            r2.f1082r = r3
            r2.f1083s = r4
            r2.t = r5
            if (r5 == 0) goto L_0x0015
            androidx.fragment.app.n$i r4 = new androidx.fragment.app.n$i
            r4.<init>(r2, r5)
        L_0x0011:
            r2.h(r4)
            goto L_0x001d
        L_0x0015:
            boolean r4 = r3 instanceof androidx.fragment.app.r
            if (r4 == 0) goto L_0x001d
            r4 = r3
            androidx.fragment.app.r r4 = (androidx.fragment.app.r) r4
            goto L_0x0011
        L_0x001d:
            androidx.fragment.app.Fragment r4 = r2.t
            if (r4 == 0) goto L_0x0024
            r2.q1()
        L_0x0024:
            boolean r4 = r3 instanceof androidx.activity.c
            if (r4 == 0) goto L_0x0039
            r4 = r3
            androidx.activity.c r4 = (androidx.activity.c) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.f1071g = r0
            if (r5 == 0) goto L_0x0034
            r4 = r5
        L_0x0034:
            androidx.activity.b r1 = r2.f1072h
            r0.a(r4, r1)
        L_0x0039:
            if (r5 == 0) goto L_0x0044
            androidx.fragment.app.n r3 = r5.mFragmentManager
            androidx.fragment.app.q r3 = r3.n0(r5)
        L_0x0041:
            r2.M = r3
            goto L_0x005a
        L_0x0044:
            boolean r4 = r3 instanceof androidx.lifecycle.v
            if (r4 == 0) goto L_0x0053
            androidx.lifecycle.v r3 = (androidx.lifecycle.v) r3
            androidx.lifecycle.u r3 = r3.getViewModelStore()
            androidx.fragment.app.q r3 = androidx.fragment.app.q.j(r3)
            goto L_0x0041
        L_0x0053:
            androidx.fragment.app.q r3 = new androidx.fragment.app.q
            r4 = 0
            r3.<init>(r4)
            goto L_0x0041
        L_0x005a:
            androidx.fragment.app.q r3 = r2.M
            boolean r4 = r2.K0()
            r3.o(r4)
            androidx.fragment.app.v r3 = r2.c
            androidx.fragment.app.q r4 = r2.M
            r3.x(r4)
            androidx.fragment.app.k<?> r3 = r2.f1082r
            boolean r4 = r3 instanceof androidx.activity.result.d
            if (r4 == 0) goto L_0x0102
            androidx.activity.result.d r3 = (androidx.activity.result.d) r3
            androidx.activity.result.ActivityResultRegistry r3 = r3.getActivityResultRegistry()
            if (r5 == 0) goto L_0x008c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.mWho
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x008e
        L_0x008c:
            java.lang.String r4 = ""
        L_0x008e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "FragmentManager:"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartActivityForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.activity.result.f.c r0 = new androidx.activity.result.f.c
            r0.<init>()
            androidx.fragment.app.n$j r1 = new androidx.fragment.app.n$j
            r1.<init>()
            androidx.activity.result.c r5 = r3.i(r5, r0, r1)
            r2.z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartIntentSenderForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.fragment.app.n$k r0 = new androidx.fragment.app.n$k
            r0.<init>()
            androidx.fragment.app.n$a r1 = new androidx.fragment.app.n$a
            r1.<init>()
            androidx.activity.result.c r5 = r3.i(r5, r0, r1)
            r2.A = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "RequestPermissions"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            androidx.activity.result.f.b r5 = new androidx.activity.result.f.b
            r5.<init>()
            androidx.fragment.app.n$b r0 = new androidx.fragment.app.n$b
            r0.<init>()
            androidx.activity.result.c r3 = r3.i(r4, r5, r0)
            r2.B = r3
        L_0x0102:
            return
        L_0x0103:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.k(androidx.fragment.app.k, androidx.fragment.app.g, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    public void k1(Fragment fragment, boolean z2) {
        ViewGroup p0 = p0(fragment);
        if (p0 != null && (p0 instanceof h)) {
            ((h) p0).setDrawDisappearingViewsLast(!z2);
        }
    }

    /* access modifiers changed from: package-private */
    public void l(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.c.a(fragment);
                if (F0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (G0(fragment)) {
                    this.D = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l1(Fragment fragment, e.c cVar) {
        if (!fragment.equals(g0(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.mMaxState = cVar;
    }

    public w m() {
        return new a(this);
    }

    public int m0() {
        ArrayList<a> arrayList = this.f1068d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void m1(Fragment fragment) {
        if (fragment == null || (fragment.equals(g0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.u;
            this.u = fragment;
            M(fragment2);
            M(this.u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        boolean z2 = false;
        for (Fragment next : this.c.l()) {
            if (next != null) {
                z2 = G0(next);
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public g o0() {
        return this.f1083s;
    }

    /* access modifiers changed from: package-private */
    public void o1(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public j q0() {
        j jVar = this.v;
        if (jVar != null) {
            return jVar;
        }
        Fragment fragment = this.t;
        return fragment != null ? fragment.mFragmentManager.q0() : this.w;
    }

    public final void r(String str) {
        this.f1074j.remove(str);
    }

    /* access modifiers changed from: package-private */
    public v r0() {
        return this.c;
    }

    public List<Fragment> s0() {
        return this.c.n();
    }

    /* access modifiers changed from: package-private */
    public k<?> t0() {
        return this.f1082r;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.t;
        } else {
            k<?> kVar = this.f1082r;
            if (kVar != null) {
                sb.append(kVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.f1082r;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public void u(a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.r(z4);
        } else {
            aVar.q();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3 && this.f1081q >= 1) {
            x.C(this.f1082r.f(), this.f1083s, arrayList, arrayList2, 0, 1, true, this.f1078n);
        }
        if (z4) {
            Q0(this.f1081q, true);
        }
        for (Fragment next : this.c.l()) {
            if (next != null && next.mView != null && next.mIsNewlyAdded && aVar.u(next.mContainerId)) {
                float f2 = next.mPostponedAlpha;
                if (f2 > 0.0f) {
                    next.mView.setAlpha(f2);
                }
                if (z4) {
                    next.mPostponedAlpha = 0.0f;
                } else {
                    next.mPostponedAlpha = -1.0f;
                    next.mIsNewlyAdded = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 u0() {
        return this.f1070f;
    }

    /* access modifiers changed from: package-private */
    public m v0() {
        return this.f1079o;
    }

    /* access modifiers changed from: package-private */
    public u w(Fragment fragment) {
        u m2 = this.c.m(fragment.mWho);
        if (m2 != null) {
            return m2;
        }
        u uVar = new u(this.f1079o, this.c, fragment);
        uVar.o(this.f1082r.f().getClassLoader());
        uVar.t(this.f1081q);
        return uVar;
    }

    /* access modifiers changed from: package-private */
    public Fragment w0() {
        return this.t;
    }

    public Fragment x0() {
        return this.u;
    }

    /* access modifiers changed from: package-private */
    public void y(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (F0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.c.s(fragment);
                if (G0(fragment)) {
                    this.D = true;
                }
                n1(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public d0 y0() {
        d0 d0Var = this.x;
        if (d0Var != null) {
            return d0Var;
        }
        Fragment fragment = this.t;
        return fragment != null ? fragment.mFragmentManager.y0() : this.y;
    }

    /* access modifiers changed from: package-private */
    public void z() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(4);
    }
}
