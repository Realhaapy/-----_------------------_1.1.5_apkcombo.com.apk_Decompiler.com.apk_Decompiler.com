package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.f.r.a0;
import e.f.r.w;
import e.f.r.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
public abstract class z {

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f1179e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f1180f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f1181g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ArrayList f1182h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ArrayList f1183i;

        a(z zVar, int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f1179e = i2;
            this.f1180f = arrayList;
            this.f1181g = arrayList2;
            this.f1182h = arrayList3;
            this.f1183i = arrayList4;
        }

        public void run() {
            for (int i2 = 0; i2 < this.f1179e; i2++) {
                y.c0((View) this.f1180f.get(i2), (String) this.f1181g.get(i2));
                y.c0((View) this.f1182h.get(i2), (String) this.f1183i.get(i2));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f1184e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Map f1185f;

        b(z zVar, ArrayList arrayList, Map map) {
            this.f1184e = arrayList;
            this.f1185f = map;
        }

        public void run() {
            int size = this.f1184e.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f1184e.get(i2);
                String x = y.x(view);
                if (x != null) {
                    y.c0(view, z.i(this.f1185f, x));
                }
            }
        }
    }

    class c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f1186e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Map f1187f;

        c(z zVar, ArrayList arrayList, Map map) {
            this.f1186e = arrayList;
            this.f1187f = map;
        }

        public void run() {
            int size = this.f1186e.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f1186e.get(i2);
                y.c0(view, (String) this.f1187f.get(y.x(view)));
            }
        }
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (!h(list, view, size)) {
            if (y.x(view) != null) {
                list.add(view);
            }
            for (int i2 = size; i2 < list.size(); i2++) {
                View view2 = list.get(i2);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = viewGroup.getChildAt(i3);
                        if (!h(list, childAt, size) && y.x(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    private static boolean h(List<View> list, View view, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (list.get(i3) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    /* access modifiers changed from: package-private */
    public void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean a2 = a0.a(viewGroup2);
                viewGroup = viewGroup2;
                if (!a2) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        f(arrayList, viewGroup2.getChildAt(i2));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    public abstract Object g(Object obj);

    /* access modifiers changed from: package-private */
    public void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String x = y.x(view);
            if (x != null) {
                map.put(x, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    j(map, viewGroup.getChildAt(i2));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void k(View view, Rect rect) {
        if (y.C(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    public ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = arrayList.get(i2);
            arrayList2.add(y.x(view));
            y.c0(view, (String) null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    /* access modifiers changed from: package-private */
    public void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        w.a(viewGroup, new c(this, arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public void w(Fragment fragment, Object obj, e.f.n.b bVar, Runnable runnable) {
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    public void x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        w.a(view, new b(this, arrayList, map));
    }

    /* access modifiers changed from: package-private */
    public void y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = arrayList.get(i2);
            String x = y.x(view2);
            arrayList4.add(x);
            if (x != null) {
                y.c0(view2, (String) null);
                String str = map.get(x);
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i3))) {
                        y.c0(arrayList2.get(i3), x);
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        w.a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList<View> arrayList);
}