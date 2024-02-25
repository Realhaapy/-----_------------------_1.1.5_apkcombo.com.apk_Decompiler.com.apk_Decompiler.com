package e.q;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import e.f.r.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class o {
    private static m a = new b();
    private static ThreadLocal<WeakReference<e.e.a<ViewGroup, ArrayList<m>>>> b = new ThreadLocal<>();
    static ArrayList<ViewGroup> c = new ArrayList<>();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: e  reason: collision with root package name */
        m f3629e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f3630f;

        /* renamed from: e.q.o$a$a  reason: collision with other inner class name */
        class C0097a extends n {
            final /* synthetic */ e.e.a a;

            C0097a(e.e.a aVar) {
                this.a = aVar;
            }

            public void e(m mVar) {
                ((ArrayList) this.a.get(a.this.f3630f)).remove(mVar);
                mVar.T(this);
            }
        }

        a(m mVar, ViewGroup viewGroup) {
            this.f3629e = mVar;
            this.f3630f = viewGroup;
        }

        private void a() {
            this.f3630f.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f3630f.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            a();
            if (!o.c.remove(this.f3630f)) {
                return true;
            }
            e.e.a<ViewGroup, ArrayList<m>> b = o.b();
            ArrayList arrayList = b.get(this.f3630f);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b.put(this.f3630f, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f3629e);
            this.f3629e.b(new C0097a(b));
            this.f3629e.n(this.f3630f, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).V(this.f3630f);
                }
            }
            this.f3629e.S(this.f3630f);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            a();
            o.c.remove(this.f3630f);
            ArrayList arrayList = o.b().get(this.f3630f);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).V(this.f3630f);
                }
            }
            this.f3629e.p(true);
        }
    }

    public static void a(ViewGroup viewGroup, m mVar) {
        if (!c.contains(viewGroup) && y.D(viewGroup)) {
            c.add(viewGroup);
            if (mVar == null) {
                mVar = a;
            }
            m q2 = mVar.clone();
            d(viewGroup, q2);
            l.c(viewGroup, (l) null);
            c(viewGroup, q2);
        }
    }

    static e.e.a<ViewGroup, ArrayList<m>> b() {
        e.e.a<ViewGroup, ArrayList<m>> aVar;
        WeakReference weakReference = b.get();
        if (weakReference != null && (aVar = (e.e.a) weakReference.get()) != null) {
            return aVar;
        }
        e.e.a<ViewGroup, ArrayList<m>> aVar2 = new e.e.a<>();
        b.set(new WeakReference(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, m mVar) {
        if (mVar != null && viewGroup != null) {
            a aVar = new a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void d(ViewGroup viewGroup, m mVar) {
        ArrayList arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((m) it.next()).R(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.n(viewGroup, true);
        }
        l b2 = l.b(viewGroup);
        if (b2 != null) {
            b2.a();
        }
    }
}
