package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.e;
import e.b.a.b.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class i extends e {
    private e.b.a.b.a<g, a> a;
    private e.c b;
    private final WeakReference<h> c;

    /* renamed from: d  reason: collision with root package name */
    private int f1219d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1220e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1221f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<e.c> f1222g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f1223h;

    static class a {
        e.c a;
        f b;

        a(g gVar, e.c cVar) {
            this.b = k.f(gVar);
            this.a = cVar;
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar, e.b bVar) {
            e.c c = bVar.c();
            this.a = i.k(this.a, c);
            this.b.a(hVar, bVar);
            this.a = c;
        }
    }

    public i(h hVar) {
        this(hVar, true);
    }

    private i(h hVar, boolean z) {
        this.a = new e.b.a.b.a<>();
        this.f1219d = 0;
        this.f1220e = false;
        this.f1221f = false;
        this.f1222g = new ArrayList<>();
        this.c = new WeakReference<>(hVar);
        this.b = e.c.INITIALIZED;
        this.f1223h = z;
    }

    private void d(h hVar) {
        Iterator<Map.Entry<g, a>> h2 = this.a.h();
        while (h2.hasNext() && !this.f1221f) {
            Map.Entry next = h2.next();
            a aVar = (a) next.getValue();
            while (aVar.a.compareTo(this.b) > 0 && !this.f1221f && this.a.contains(next.getKey())) {
                e.b a2 = e.b.a(aVar.a);
                if (a2 != null) {
                    n(a2.c());
                    aVar.a(hVar, a2);
                    m();
                } else {
                    throw new IllegalStateException("no event down from " + aVar.a);
                }
            }
        }
    }

    private e.c e(g gVar) {
        Map.Entry<g, a> p2 = this.a.p(gVar);
        e.c cVar = null;
        e.c cVar2 = p2 != null ? p2.getValue().a : null;
        if (!this.f1222g.isEmpty()) {
            ArrayList<e.c> arrayList = this.f1222g;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return k(k(this.b, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    private void f(String str) {
        if (this.f1223h && !e.b.a.a.a.b().a()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    private void g(h hVar) {
        b<K, V>.d k2 = this.a.k();
        while (k2.hasNext() && !this.f1221f) {
            Map.Entry entry = (Map.Entry) k2.next();
            a aVar = (a) entry.getValue();
            while (aVar.a.compareTo(this.b) < 0 && !this.f1221f && this.a.contains(entry.getKey())) {
                n(aVar.a);
                e.b d2 = e.b.d(aVar.a);
                if (d2 != null) {
                    aVar.a(hVar, d2);
                    m();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.a);
                }
            }
        }
    }

    private boolean i() {
        if (this.a.size() == 0) {
            return true;
        }
        e.c cVar = this.a.i().getValue().a;
        e.c cVar2 = this.a.l().getValue().a;
        return cVar == cVar2 && this.b == cVar2;
    }

    static e.c k(e.c cVar, e.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    private void l(e.c cVar) {
        if (this.b != cVar) {
            this.b = cVar;
            if (this.f1220e || this.f1219d != 0) {
                this.f1221f = true;
                return;
            }
            this.f1220e = true;
            p();
            this.f1220e = false;
        }
    }

    private void m() {
        ArrayList<e.c> arrayList = this.f1222g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void n(e.c cVar) {
        this.f1222g.add(cVar);
    }

    private void p() {
        h hVar = (h) this.c.get();
        if (hVar != null) {
            while (true) {
                boolean i2 = i();
                this.f1221f = false;
                if (!i2) {
                    if (this.b.compareTo(this.a.i().getValue().a) < 0) {
                        d(hVar);
                    }
                    Map.Entry<g, a> l2 = this.a.l();
                    if (!this.f1221f && l2 != null && this.b.compareTo(l2.getValue().a) > 0) {
                        g(hVar);
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }

    public void a(g gVar) {
        h hVar;
        f("addObserver");
        e.c cVar = this.b;
        e.c cVar2 = e.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = e.c.INITIALIZED;
        }
        a aVar = new a(gVar, cVar2);
        if (this.a.n(gVar, aVar) == null && (hVar = (h) this.c.get()) != null) {
            boolean z = this.f1219d != 0 || this.f1220e;
            e.c e2 = e(gVar);
            this.f1219d++;
            while (aVar.a.compareTo(e2) < 0 && this.a.contains(gVar)) {
                n(aVar.a);
                e.b d2 = e.b.d(aVar.a);
                if (d2 != null) {
                    aVar.a(hVar, d2);
                    m();
                    e2 = e(gVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.a);
                }
            }
            if (!z) {
                p();
            }
            this.f1219d--;
        }
    }

    public e.c b() {
        return this.b;
    }

    public void c(g gVar) {
        f("removeObserver");
        this.a.o(gVar);
    }

    public void h(e.b bVar) {
        f("handleLifecycleEvent");
        l(bVar.c());
    }

    @Deprecated
    public void j(e.c cVar) {
        f("markState");
        o(cVar);
    }

    public void o(e.c cVar) {
        f("setCurrentState");
        l(cVar);
    }
}
