package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class s {

    private static class b {
        private final m<?> a;
        private final Set<b> b = new HashSet();
        private final Set<b> c = new HashSet();

        b(m<?> mVar) {
            this.a = mVar;
        }

        /* access modifiers changed from: package-private */
        public void a(b bVar) {
            this.b.add(bVar);
        }

        /* access modifiers changed from: package-private */
        public void b(b bVar) {
            this.c.add(bVar);
        }

        /* access modifiers changed from: package-private */
        public m<?> c() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public Set<b> d() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return this.b.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return this.c.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public void g(b bVar) {
            this.c.remove(bVar);
        }
    }

    private static class c {
        private final Class<?> a;
        /* access modifiers changed from: private */
        public final boolean b;

        private c(Class<?> cls, boolean z) {
            this.a = cls;
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b == this.b;
        }

        public int hashCode() {
            return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
        }
    }

    static void a(List<m<?>> list) {
        Set<b> c2 = c(list);
        Set<b> b2 = b(c2);
        int i2 = 0;
        while (!b2.isEmpty()) {
            b next = b2.iterator().next();
            b2.remove(next);
            i2++;
            for (b next2 : next.d()) {
                next2.g(next);
                if (next2.f()) {
                    b2.add(next2);
                }
            }
        }
        if (i2 != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (b next3 : c2) {
                if (!next3.f() && !next3.e()) {
                    arrayList.add(next3.c());
                }
            }
            throw new u(arrayList);
        }
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b next : set) {
            if (next.f()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<m<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        for (m next : list) {
            b bVar = new b(next);
            Iterator it = next.e().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    c cVar = new c(cls, !next.k());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (set2.isEmpty() || cVar.b) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<b> it2 : hashMap.values()) {
            for (b bVar2 : it2) {
                for (t next2 : bVar2.c().c()) {
                    if (next2.d() && (set = (Set) hashMap.get(new c(next2.b(), next2.f()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
