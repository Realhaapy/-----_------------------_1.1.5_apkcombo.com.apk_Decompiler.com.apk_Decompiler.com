package e.q;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.z;
import e.f.n.b;
import e.q.m;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
public class e extends z {

    class a extends m.e {
        a(e eVar, Rect rect) {
        }
    }

    class b implements m.f {
        final /* synthetic */ View a;
        final /* synthetic */ ArrayList b;

        b(e eVar, View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        public void a(m mVar) {
            mVar.T(this);
            mVar.b(this);
        }

        public void b(m mVar) {
        }

        public void c(m mVar) {
        }

        public void d(m mVar) {
        }

        public void e(m mVar) {
            mVar.T(this);
            this.a.setVisibility(8);
            int size = this.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) this.b.get(i2)).setVisibility(0);
            }
        }
    }

    class c extends n {
        final /* synthetic */ Object a;
        final /* synthetic */ ArrayList b;
        final /* synthetic */ Object c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f3593d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f3594e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f3595f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.b = arrayList;
            this.c = obj2;
            this.f3593d = arrayList2;
            this.f3594e = obj3;
            this.f3595f = arrayList3;
        }

        public void a(m mVar) {
            Object obj = this.a;
            if (obj != null) {
                e.this.q(obj, this.b, (ArrayList<View>) null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                e.this.q(obj2, this.f3593d, (ArrayList<View>) null);
            }
            Object obj3 = this.f3594e;
            if (obj3 != null) {
                e.this.q(obj3, this.f3595f, (ArrayList<View>) null);
            }
        }

        public void e(m mVar) {
            mVar.T(this);
        }
    }

    class d implements b.C0072b {
        final /* synthetic */ m a;

        d(e eVar, m mVar) {
            this.a = mVar;
        }

        public void a() {
            this.a.i();
        }
    }

    /* renamed from: e.q.e$e  reason: collision with other inner class name */
    class C0096e implements m.f {
        final /* synthetic */ Runnable a;

        C0096e(e eVar, Runnable runnable) {
            this.a = runnable;
        }

        public void a(m mVar) {
        }

        public void b(m mVar) {
        }

        public void c(m mVar) {
        }

        public void d(m mVar) {
        }

        public void e(m mVar) {
            this.a.run();
        }
    }

    class f extends m.e {
        f(e eVar, Rect rect) {
        }
    }

    private static boolean C(m mVar) {
        return !z.l(mVar.D()) || !z.l(mVar.E()) || !z.l(mVar.F());
    }

    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        q qVar = (q) obj;
        if (qVar != null) {
            qVar.G().clear();
            qVar.G().addAll(arrayList2);
            q(qVar, arrayList, arrayList2);
        }
    }

    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        q qVar = new q();
        qVar.i0((m) obj);
        return qVar;
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((m) obj).d(view);
        }
    }

    public void b(Object obj, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        if (mVar != null) {
            int i2 = 0;
            if (mVar instanceof q) {
                q qVar = (q) mVar;
                int l0 = qVar.l0();
                while (i2 < l0) {
                    b(qVar.k0(i2), arrayList);
                    i2++;
                }
            } else if (!C(mVar) && z.l(mVar.G())) {
                int size = arrayList.size();
                while (i2 < size) {
                    mVar.d(arrayList.get(i2));
                    i2++;
                }
            }
        }
    }

    public void c(ViewGroup viewGroup, Object obj) {
        o.a(viewGroup, (m) obj);
    }

    public boolean e(Object obj) {
        return obj instanceof m;
    }

    public Object g(Object obj) {
        if (obj != null) {
            return ((m) obj).clone();
        }
        return null;
    }

    public Object m(Object obj, Object obj2, Object obj3) {
        m mVar = (m) obj;
        m mVar2 = (m) obj2;
        m mVar3 = (m) obj3;
        if (mVar != null && mVar2 != null) {
            q qVar = new q();
            qVar.i0(mVar);
            qVar.i0(mVar2);
            qVar.q0(1);
            mVar = qVar;
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        q qVar2 = new q();
        if (mVar != null) {
            qVar2.i0(mVar);
        }
        qVar2.i0(mVar3);
        return qVar2;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        q qVar = new q();
        if (obj != null) {
            qVar.i0((m) obj);
        }
        if (obj2 != null) {
            qVar.i0((m) obj2);
        }
        if (obj3 != null) {
            qVar.i0((m) obj3);
        }
        return qVar;
    }

    public void p(Object obj, View view) {
        if (obj != null) {
            ((m) obj).U(view);
        }
    }

    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        m mVar = (m) obj;
        int i2 = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int l0 = qVar.l0();
            while (i2 < l0) {
                q(qVar.k0(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!C(mVar)) {
            List<View> G = mVar.G();
            if (G.size() == arrayList.size() && G.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i2 < size) {
                    mVar.d(arrayList2.get(i2));
                    i2++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    mVar.U(arrayList.get(size2));
                }
            }
        }
    }

    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((m) obj).b(new b(this, view, arrayList));
    }

    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((m) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((m) obj).Z(new f(this, rect));
        }
    }

    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((m) obj).Z(new a(this, rect));
        }
    }

    public void w(Fragment fragment, Object obj, e.f.n.b bVar, Runnable runnable) {
        m mVar = (m) obj;
        bVar.c(new d(this, mVar));
        mVar.b(new C0096e(this, runnable));
    }

    public void z(Object obj, View view, ArrayList<View> arrayList) {
        q qVar = (q) obj;
        List<View> G = qVar.G();
        G.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            z.d(G, arrayList.get(i2));
        }
        G.add(view);
        arrayList.add(view);
        b(qVar, arrayList);
    }
}
