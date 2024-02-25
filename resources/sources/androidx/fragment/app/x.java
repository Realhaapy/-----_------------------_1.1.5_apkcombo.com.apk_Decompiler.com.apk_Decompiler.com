package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.r;
import e.f.r.w;
import e.f.r.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class x {
    private static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    static final z b = (Build.VERSION.SDK_INT >= 21 ? new y() : null);
    static final z c = x();

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f1138e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Fragment f1139f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e.f.n.b f1140g;

        a(g gVar, Fragment fragment, e.f.n.b bVar) {
            this.f1138e = gVar;
            this.f1139f = fragment;
            this.f1140g = bVar;
        }

        public void run() {
            this.f1138e.a(this.f1139f, this.f1140g);
        }
    }

    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f1141e;

        b(ArrayList arrayList) {
            this.f1141e = arrayList;
        }

        public void run() {
            x.B(this.f1141e, 4);
        }
    }

    class c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f1142e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Fragment f1143f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e.f.n.b f1144g;

        c(g gVar, Fragment fragment, e.f.n.b bVar) {
            this.f1142e = gVar;
            this.f1143f = fragment;
            this.f1144g = bVar;
        }

        public void run() {
            this.f1142e.a(this.f1143f, this.f1144g);
        }
    }

    class d implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f1145e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ z f1146f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f1147g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f1148h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ArrayList f1149i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ArrayList f1150j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ArrayList f1151k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Object f1152l;

        d(Object obj, z zVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f1145e = obj;
            this.f1146f = zVar;
            this.f1147g = view;
            this.f1148h = fragment;
            this.f1149i = arrayList;
            this.f1150j = arrayList2;
            this.f1151k = arrayList3;
            this.f1152l = obj2;
        }

        public void run() {
            Object obj = this.f1145e;
            if (obj != null) {
                this.f1146f.p(obj, this.f1147g);
                this.f1150j.addAll(x.k(this.f1146f, this.f1145e, this.f1148h, this.f1149i, this.f1147g));
            }
            if (this.f1151k != null) {
                if (this.f1152l != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f1147g);
                    this.f1146f.q(this.f1152l, this.f1151k, arrayList);
                }
                this.f1151k.clear();
                this.f1151k.add(this.f1147g);
            }
        }
    }

    class e implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Fragment f1153e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Fragment f1154f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f1155g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e.e.a f1156h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ View f1157i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ z f1158j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Rect f1159k;

        e(Fragment fragment, Fragment fragment2, boolean z, e.e.a aVar, View view, z zVar, Rect rect) {
            this.f1153e = fragment;
            this.f1154f = fragment2;
            this.f1155g = z;
            this.f1156h = aVar;
            this.f1157i = view;
            this.f1158j = zVar;
            this.f1159k = rect;
        }

        public void run() {
            x.f(this.f1153e, this.f1154f, this.f1155g, this.f1156h, false);
            View view = this.f1157i;
            if (view != null) {
                this.f1158j.k(view, this.f1159k);
            }
        }
    }

    class f implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z f1160e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e.e.a f1161f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Object f1162g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f1163h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ArrayList f1164i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ View f1165j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Fragment f1166k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Fragment f1167l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f1168m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ ArrayList f1169n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Object f1170o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Rect f1171p;

        f(z zVar, e.e.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f1160e = zVar;
            this.f1161f = aVar;
            this.f1162g = obj;
            this.f1163h = hVar;
            this.f1164i = arrayList;
            this.f1165j = view;
            this.f1166k = fragment;
            this.f1167l = fragment2;
            this.f1168m = z;
            this.f1169n = arrayList2;
            this.f1170o = obj2;
            this.f1171p = rect;
        }

        public void run() {
            e.e.a<String, View> h2 = x.h(this.f1160e, this.f1161f, this.f1162g, this.f1163h);
            if (h2 != null) {
                this.f1164i.addAll(h2.values());
                this.f1164i.add(this.f1165j);
            }
            x.f(this.f1166k, this.f1167l, this.f1168m, h2, false);
            Object obj = this.f1162g;
            if (obj != null) {
                this.f1160e.A(obj, this.f1169n, this.f1164i);
                View t = x.t(h2, this.f1163h, this.f1170o, this.f1168m);
                if (t != null) {
                    this.f1160e.k(t, this.f1171p);
                }
            }
        }
    }

    interface g {
        void a(Fragment fragment, e.f.n.b bVar);

        void b(Fragment fragment, e.f.n.b bVar);
    }

    static class h {
        public Fragment a;
        public boolean b;
        public a c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f1172d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1173e;

        /* renamed from: f  reason: collision with root package name */
        public a f1174f;

        h() {
        }
    }

    private static void A(z zVar, Object obj, Object obj2, e.e.a<String, View> aVar, boolean z, a aVar2) {
        ArrayList<String> arrayList = aVar2.f1129m;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z ? aVar2.f1130n : aVar2.f1129m).get(0));
            zVar.v(obj, view);
            if (obj2 != null) {
                zVar.v(obj2, view);
            }
        }
    }

    static void B(ArrayList<View> arrayList, int i2) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i2);
            }
        }
    }

    static void C(Context context, g gVar, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, boolean z, g gVar2) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i4 = i2; i4 < i3; i4++) {
            a aVar = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                e(aVar, sparseArray, z);
            } else {
                c(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                int keyAt = sparseArray.keyAt(i5);
                e.e.a<String, String> d2 = d(keyAt, arrayList, arrayList2, i2, i3);
                h hVar = (h) sparseArray.valueAt(i5);
                if (gVar.d() && (viewGroup = (ViewGroup) gVar.c(keyAt)) != null) {
                    if (z) {
                        o(viewGroup, hVar, view, d2, gVar2);
                    } else {
                        n(viewGroup, hVar, view, d2, gVar2);
                    }
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, e.e.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m2 = aVar.m(size);
            if (collection.contains(y.x(m2))) {
                arrayList.add(m2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.mAdded != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0088, code lost:
        if (r0.mHidden == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(androidx.fragment.app.a r8, androidx.fragment.app.w.a r9, android.util.SparseArray<androidx.fragment.app.x.h> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.mContainerId
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = a
            int r9 = r9.a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007d
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007d
            r9 = 0
            r3 = 0
        L_0x002a:
            r4 = 0
            goto L_0x0090
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L_0x008c
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x008c
            goto L_0x008a
        L_0x003c:
            boolean r9 = r0.mHidden
            goto L_0x008d
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.mHidden
            if (r9 == 0) goto L_0x0070
        L_0x004d:
            goto L_0x006e
        L_0x004e:
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0057:
            boolean r9 = r0.mAdded
            if (r12 == 0) goto L_0x0072
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r0.mView
            if (r9 == 0) goto L_0x0070
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0070
            float r9 = r0.mPostponedAlpha
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0070
        L_0x006e:
            r9 = 1
            goto L_0x0079
        L_0x0070:
            r9 = 0
            goto L_0x0079
        L_0x0072:
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0070
            goto L_0x006e
        L_0x0079:
            r4 = r9
            r9 = 1
            r3 = 0
            goto L_0x0090
        L_0x007d:
            if (r12 == 0) goto L_0x0082
            boolean r9 = r0.mIsNewlyAdded
            goto L_0x008d
        L_0x0082:
            boolean r9 = r0.mAdded
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x008c
        L_0x008a:
            r9 = 1
            goto L_0x008d
        L_0x008c:
            r9 = 0
        L_0x008d:
            r2 = r9
            r9 = 0
            goto L_0x002a
        L_0x0090:
            java.lang.Object r5 = r10.get(r1)
            androidx.fragment.app.x$h r5 = (androidx.fragment.app.x.h) r5
            if (r2 == 0) goto L_0x00a2
            androidx.fragment.app.x$h r5 = p(r5, r10, r1)
            r5.a = r0
            r5.b = r11
            r5.c = r8
        L_0x00a2:
            r2 = 0
            if (r12 != 0) goto L_0x00c3
            if (r3 == 0) goto L_0x00c3
            if (r5 == 0) goto L_0x00af
            androidx.fragment.app.Fragment r3 = r5.f1172d
            if (r3 != r0) goto L_0x00af
            r5.f1172d = r2
        L_0x00af:
            boolean r3 = r8.f1131o
            if (r3 != 0) goto L_0x00c3
            androidx.fragment.app.n r3 = r8.f968q
            androidx.fragment.app.u r6 = r3.w(r0)
            androidx.fragment.app.v r7 = r3.r0()
            r7.p(r6)
            r3.R0(r0)
        L_0x00c3:
            if (r4 == 0) goto L_0x00d5
            if (r5 == 0) goto L_0x00cb
            androidx.fragment.app.Fragment r3 = r5.f1172d
            if (r3 != 0) goto L_0x00d5
        L_0x00cb:
            androidx.fragment.app.x$h r5 = p(r5, r10, r1)
            r5.f1172d = r0
            r5.f1173e = r11
            r5.f1174f = r8
        L_0x00d5:
            if (r12 != 0) goto L_0x00e1
            if (r9 == 0) goto L_0x00e1
            if (r5 == 0) goto L_0x00e1
            androidx.fragment.app.Fragment r8 = r5.a
            if (r8 != r0) goto L_0x00e1
            r5.a = r2
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.x.b(androidx.fragment.app.a, androidx.fragment.app.w$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(a aVar, SparseArray<h> sparseArray, boolean z) {
        int size = aVar.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            b(aVar, aVar.a.get(i2), sparseArray, false, z);
        }
    }

    private static e.e.a<String, String> d(int i2, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        e.e.a<String, String> aVar = new e.e.a<>();
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            a aVar2 = arrayList.get(i5);
            if (aVar2.u(i2)) {
                boolean booleanValue = arrayList2.get(i5).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f1129m;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f1129m;
                        arrayList4 = aVar2.f1130n;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f1129m;
                        arrayList3 = aVar2.f1130n;
                        arrayList4 = arrayList6;
                    }
                    for (int i6 = 0; i6 < size; i6++) {
                        String str = arrayList4.get(i6);
                        String str2 = arrayList3.get(i6);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(a aVar, SparseArray<h> sparseArray, boolean z) {
        if (aVar.f968q.o0().d()) {
            for (int size = aVar.a.size() - 1; size >= 0; size--) {
                b(aVar, aVar.a.get(size), sparseArray, true, z);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z, e.e.a<String, View> aVar, boolean z2) {
        r enterTransitionCallback = z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(aVar.i(i2));
                arrayList.add(aVar.m(i2));
            }
            if (z2) {
                enterTransitionCallback.f(arrayList2, arrayList, (List<View>) null);
            } else {
                enterTransitionCallback.e(arrayList2, arrayList, (List<View>) null);
            }
        }
    }

    private static boolean g(z zVar, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!zVar.e(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    static e.e.a<String, View> h(z zVar, e.e.a<String, String> aVar, Object obj, h hVar) {
        r rVar;
        ArrayList<String> arrayList;
        String q2;
        Fragment fragment = hVar.a;
        View view = fragment.getView();
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        e.e.a<String, View> aVar2 = new e.e.a<>();
        zVar.j(aVar2, view);
        a aVar3 = hVar.c;
        if (hVar.b) {
            rVar = fragment.getExitTransitionCallback();
            arrayList = aVar3.f1129m;
        } else {
            rVar = fragment.getEnterTransitionCallback();
            arrayList = aVar3.f1130n;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
            aVar2.o(aVar.values());
        }
        if (rVar != null) {
            rVar.c(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view2 = aVar2.get(str);
                if (view2 == null) {
                    String q3 = q(aVar, str);
                    if (q3 != null) {
                        aVar.remove(q3);
                    }
                } else if (!str.equals(y.x(view2)) && (q2 = q(aVar, str)) != null) {
                    aVar.put(q2, y.x(view2));
                }
            }
        } else {
            y(aVar, aVar2);
        }
        return aVar2;
    }

    private static e.e.a<String, View> i(z zVar, e.e.a<String, String> aVar, Object obj, h hVar) {
        r rVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f1172d;
        e.e.a<String, View> aVar2 = new e.e.a<>();
        zVar.j(aVar2, fragment.requireView());
        a aVar3 = hVar.f1174f;
        if (hVar.f1173e) {
            rVar = fragment.getEnterTransitionCallback();
            arrayList = aVar3.f1130n;
        } else {
            rVar = fragment.getExitTransitionCallback();
            arrayList = aVar3.f1129m;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
        }
        if (rVar != null) {
            rVar.c(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(y.x(view))) {
                    aVar.put(y.x(view), aVar.remove(str));
                }
            }
        } else {
            aVar.o(aVar2.keySet());
        }
        return aVar2;
    }

    private static z j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        z zVar = b;
        if (zVar != null && g(zVar, arrayList)) {
            return zVar;
        }
        z zVar2 = c;
        if (zVar2 != null && g(zVar2, arrayList)) {
            return zVar2;
        }
        if (zVar == null && zVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(z zVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            zVar.f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        zVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(z zVar, ViewGroup viewGroup, View view, e.e.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        e.e.a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        z zVar2 = zVar;
        h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = hVar2.a;
        Fragment fragment2 = hVar2.f1172d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = u(zVar2, fragment, fragment2, z);
            aVar2 = aVar;
        }
        e.e.a<String, View> i2 = i(zVar2, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(i2.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        f(fragment, fragment2, z, i2, true);
        if (obj4 != null) {
            rect = new Rect();
            zVar2.z(obj4, view, arrayList3);
            A(zVar, obj4, obj2, i2, hVar2.f1173e, hVar2.f1174f);
            if (obj5 != null) {
                zVar2.u(obj5, rect);
            }
        } else {
            rect = null;
        }
        f fVar = r0;
        f fVar2 = new f(zVar, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        w.a(viewGroup, fVar);
        return obj4;
    }

    private static Object m(z zVar, ViewGroup viewGroup, View view, e.e.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        z zVar2 = zVar;
        View view3 = view;
        e.e.a<String, String> aVar2 = aVar;
        h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj4 = obj;
        Fragment fragment = hVar2.a;
        Fragment fragment2 = hVar2.f1172d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.b;
        Object u = aVar.isEmpty() ? null : u(zVar, fragment, fragment2, z);
        e.e.a<String, View> i2 = i(zVar, aVar2, u, hVar2);
        e.e.a<String, View> h2 = h(zVar, aVar2, u, hVar2);
        if (aVar.isEmpty()) {
            if (i2 != null) {
                i2.clear();
            }
            if (h2 != null) {
                h2.clear();
            }
            obj3 = null;
        } else {
            a(arrayList3, i2, aVar.keySet());
            a(arrayList4, h2, aVar.values());
            obj3 = u;
        }
        if (obj4 == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, i2, true);
        if (obj3 != null) {
            arrayList4.add(view3);
            zVar.z(obj3, view3, arrayList3);
            A(zVar, obj3, obj2, i2, hVar2.f1173e, hVar2.f1174f);
            Rect rect2 = new Rect();
            View t = t(h2, hVar2, obj4, z);
            if (t != null) {
                zVar.u(obj4, rect2);
            }
            rect = rect2;
            view2 = t;
        } else {
            view2 = null;
            rect = null;
        }
        w.a(viewGroup, new e(fragment, fragment2, z, h2, view2, zVar, rect));
        return obj3;
    }

    private static void n(ViewGroup viewGroup, h hVar, View view, e.e.a<String, String> aVar, g gVar) {
        Object obj;
        ViewGroup viewGroup2 = viewGroup;
        h hVar2 = hVar;
        View view2 = view;
        e.e.a<String, String> aVar2 = aVar;
        g gVar2 = gVar;
        Fragment fragment = hVar2.a;
        Fragment fragment2 = hVar2.f1172d;
        z j2 = j(fragment2, fragment);
        if (j2 != null) {
            boolean z = hVar2.b;
            boolean z2 = hVar2.f1173e;
            Object r2 = r(j2, fragment, z);
            Object s2 = s(j2, fragment2, z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = s2;
            z zVar = j2;
            Object l2 = l(j2, viewGroup, view, aVar, hVar, arrayList, arrayList2, r2, obj2);
            Object obj3 = r2;
            if (obj3 == null && l2 == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList<View> k2 = k(zVar, obj, fragment2, arrayList4, view2);
            if (k2 == null || k2.isEmpty()) {
                obj = null;
            }
            Object obj4 = obj;
            zVar.a(obj3, view2);
            Object v = v(zVar, obj3, obj4, l2, fragment, hVar2.b);
            if (!(fragment2 == null || k2 == null || (k2.size() <= 0 && arrayList4.size() <= 0))) {
                e.f.n.b bVar = new e.f.n.b();
                gVar2.b(fragment2, bVar);
                zVar.w(fragment2, v, bVar, new c(gVar2, fragment2, bVar));
            }
            if (v != null) {
                ArrayList arrayList5 = new ArrayList();
                z zVar2 = zVar;
                zVar2.t(v, obj3, arrayList5, obj4, k2, l2, arrayList2);
                z(zVar2, viewGroup, fragment, view, arrayList2, obj3, arrayList5, obj4, k2);
                ViewGroup viewGroup3 = viewGroup;
                z zVar3 = zVar;
                ArrayList arrayList6 = arrayList2;
                zVar3.x(viewGroup3, arrayList6, aVar2);
                zVar3.c(viewGroup3, v);
                zVar3.s(viewGroup3, arrayList6, aVar2);
            }
        }
    }

    private static void o(ViewGroup viewGroup, h hVar, View view, e.e.a<String, String> aVar, g gVar) {
        Object obj;
        h hVar2 = hVar;
        View view2 = view;
        g gVar2 = gVar;
        Fragment fragment = hVar2.a;
        Fragment fragment2 = hVar2.f1172d;
        z j2 = j(fragment2, fragment);
        if (j2 != null) {
            boolean z = hVar2.b;
            boolean z2 = hVar2.f1173e;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object r2 = r(j2, fragment, z);
            Object s2 = s(j2, fragment2, z2);
            ArrayList arrayList3 = arrayList2;
            Object m2 = m(j2, viewGroup, view, aVar, hVar, arrayList2, arrayList, r2, s2);
            Object obj2 = r2;
            if (obj2 == null && m2 == null) {
                obj = s2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = s2;
            }
            ArrayList<View> k2 = k(j2, obj, fragment2, arrayList3, view2);
            ArrayList<View> k3 = k(j2, obj2, fragment, arrayList, view2);
            B(k3, 4);
            Fragment fragment3 = fragment;
            ArrayList<View> arrayList4 = k2;
            Object v = v(j2, obj2, obj, m2, fragment3, z);
            if (!(fragment2 == null || arrayList4 == null || (arrayList4.size() <= 0 && arrayList3.size() <= 0))) {
                e.f.n.b bVar = new e.f.n.b();
                g gVar3 = gVar;
                gVar3.b(fragment2, bVar);
                j2.w(fragment2, v, bVar, new a(gVar3, fragment2, bVar));
            }
            if (v != null) {
                w(j2, obj, fragment2, arrayList4);
                ArrayList<String> o2 = j2.o(arrayList);
                z zVar = j2;
                zVar.t(v, obj2, k3, obj, arrayList4, m2, arrayList);
                ViewGroup viewGroup2 = viewGroup;
                j2.c(viewGroup2, v);
                zVar.y(viewGroup2, arrayList3, arrayList, o2, aVar);
                B(k3, 0);
                j2.A(m2, arrayList3, arrayList);
            }
        }
    }

    private static h p(h hVar, SparseArray<h> sparseArray, int i2) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i2, hVar2);
        return hVar2;
    }

    static String q(e.e.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equals(aVar.m(i2))) {
                return aVar.i(i2);
            }
        }
        return null;
    }

    private static Object r(z zVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return zVar.g(z ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    private static Object s(z zVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return zVar.g(z ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    static View t(e.e.a<String, View> aVar, h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        a aVar2 = hVar.c;
        if (obj == null || aVar == null || (arrayList = aVar2.f1129m) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.f1129m : aVar2.f1130n).get(0));
    }

    private static Object u(z zVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return zVar.B(zVar.g(z ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    private static Object v(z zVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() ? zVar.n(obj2, obj, obj3) : zVar.m(obj2, obj, obj3);
    }

    private static void w(z zVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            zVar.r(obj, fragment.getView(), arrayList);
            w.a(fragment.mContainer, new b(arrayList));
        }
    }

    private static z x() {
        try {
            return (z) Class.forName("e.q.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static void y(e.e.a<String, String> aVar, e.e.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    private static void z(z zVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        w.a(viewGroup, new d(obj, zVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
