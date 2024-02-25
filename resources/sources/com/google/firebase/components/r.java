package com.google.firebase.components;

import android.util.Log;
import com.google.firebase.p.c;
import com.google.firebase.p.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public class r extends l implements com.google.firebase.n.a {

    /* renamed from: g  reason: collision with root package name */
    private static final com.google.firebase.r.b<Set<Object>> f2619g = i.a;
    private final Map<m<?>, com.google.firebase.r.b<?>> a;
    private final Map<Class<?>, com.google.firebase.r.b<?>> b;
    private final Map<Class<?>, z<?>> c;

    /* renamed from: d  reason: collision with root package name */
    private final List<com.google.firebase.r.b<q>> f2620d;

    /* renamed from: e  reason: collision with root package name */
    private final w f2621e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<Boolean> f2622f;

    public static final class b {
        private final Executor a;
        private final List<com.google.firebase.r.b<q>> b = new ArrayList();
        private final List<m<?>> c = new ArrayList();

        b(Executor executor) {
            this.a = executor;
        }

        static /* synthetic */ q e(q qVar) {
            return qVar;
        }

        public b a(m<?> mVar) {
            this.c.add(mVar);
            return this;
        }

        public b b(q qVar) {
            this.b.add(new e(qVar));
            return this;
        }

        public b c(Collection<com.google.firebase.r.b<q>> collection) {
            this.b.addAll(collection);
            return this;
        }

        public r d() {
            return new r(this.a, this.b, this.c);
        }
    }

    private r(Executor executor, Iterable<com.google.firebase.r.b<q>> iterable, Collection<m<?>> collection) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.f2622f = new AtomicReference<>();
        w wVar = new w(executor);
        this.f2621e = wVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m.n(wVar, w.class, d.class, c.class));
        arrayList.add(m.n(this, com.google.firebase.n.a.class, new Class[0]));
        for (m next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        this.f2620d = h(iterable);
        e(arrayList);
    }

    public static b d(Executor executor) {
        return new b(executor);
    }

    private void e(List<m<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator<com.google.firebase.r.b<q>> it = this.f2620d.iterator();
            while (it.hasNext()) {
                try {
                    q qVar = (q) it.next().get();
                    if (qVar != null) {
                        list.addAll(qVar.getComponents());
                        it.remove();
                    }
                } catch (x e2) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            if (this.a.isEmpty()) {
                s.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.a.keySet());
                arrayList2.addAll(list);
                s.a(arrayList2);
            }
            for (m next : list) {
                this.a.put(next, new y(new d(this, next)));
            }
            arrayList.addAll(o(list));
            arrayList.addAll(p());
            n();
        }
        for (Runnable run : arrayList) {
            run.run();
        }
        m();
    }

    private void f(Map<m<?>, com.google.firebase.r.b<?>> map, boolean z) {
        for (Map.Entry next : map.entrySet()) {
            m mVar = (m) next.getKey();
            com.google.firebase.r.b bVar = (com.google.firebase.r.b) next.getValue();
            if (mVar.i() || (mVar.j() && z)) {
                bVar.get();
            }
        }
        this.f2621e.d();
    }

    private static <T> List<T> h(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Object j(m mVar) {
        return mVar.d().a(new d0(mVar, this));
    }

    private void m() {
        Boolean bool = this.f2622f.get();
        if (bool != null) {
            f(this.a, bool.booleanValue());
        }
    }

    private void n() {
        Map map;
        Class<?> b2;
        Object a2;
        for (m next : this.a.keySet()) {
            Iterator<t> it = next.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    t next2 = it.next();
                    if (next2.f() && !this.c.containsKey(next2.b())) {
                        map = this.c;
                        b2 = next2.b();
                        a2 = z.b(Collections.emptySet());
                    } else if (this.b.containsKey(next2.b())) {
                        continue;
                    } else if (next2.e()) {
                        throw new a0(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.b()}));
                    } else if (!next2.f()) {
                        map = this.b;
                        b2 = next2.b();
                        a2 = b0.a();
                    }
                    map.put(b2, a2);
                }
            }
        }
    }

    private List<Runnable> o(List<m<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (m next : list) {
            if (next.k()) {
                com.google.firebase.r.b bVar = this.a.get(next);
                for (Class cls : next.e()) {
                    if (!this.b.containsKey(cls)) {
                        this.b.put(cls, bVar);
                    } else {
                        arrayList.add(new g((b0) this.b.get(cls), bVar));
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> p() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.a.entrySet()) {
            m mVar = (m) next.getKey();
            if (!mVar.k()) {
                com.google.firebase.r.b bVar = (com.google.firebase.r.b) next.getValue();
                for (Class cls : mVar.e()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(bVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.c.containsKey(entry.getKey())) {
                this.c.put((Class) entry.getKey(), z.b((Collection) entry.getValue()));
            } else {
                z zVar = this.c.get(entry.getKey());
                for (com.google.firebase.r.b fVar : (Set) entry.getValue()) {
                    arrayList.add(new f(zVar, fVar));
                }
            }
        }
        return arrayList;
    }

    public synchronized <T> com.google.firebase.r.b<T> b(Class<T> cls) {
        c0.c(cls, "Null interface requested.");
        return this.b.get(cls);
    }

    public synchronized <T> com.google.firebase.r.b<Set<T>> c(Class<T> cls) {
        z zVar = this.c.get(cls);
        if (zVar != null) {
            return zVar;
        }
        return f2619g;
    }

    public void g(boolean z) {
        HashMap hashMap;
        if (this.f2622f.compareAndSet((Object) null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.a);
            }
            f(hashMap, z);
        }
    }
}
