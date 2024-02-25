package com.google.firebase.components;

import com.google.firebase.p.a;
import com.google.firebase.p.b;
import com.google.firebase.p.c;
import com.google.firebase.p.d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

class w implements d, c {
    private final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> a = new HashMap();
    private Queue<a<?>> b = new ArrayDeque();
    private final Executor c;

    w(Executor executor) {
        this.c = executor;
    }

    private synchronized Set<Map.Entry<b<Object>, Executor>> e(a<?> aVar) {
        Map map;
        map = this.a.get(aVar.a());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    public <T> void a(Class<T> cls, b<? super T> bVar) {
        g(cls, this.c, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new com.google.firebase.components.h(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        r0 = e(r5).iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.google.firebase.p.a<?> r5) {
        /*
            r4 = this;
            com.google.firebase.components.c0.b(r5)
            monitor-enter(r4)
            java.util.Queue<com.google.firebase.p.a<?>> r0 = r4.b     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000d
            r0.add(r5)     // Catch:{ all -> 0x0032 }
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            return
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            java.util.Set r0 = r4.e(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            com.google.firebase.components.h r3 = new com.google.firebase.components.h
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0016
        L_0x0031:
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.w.b(com.google.firebase.p.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> void c(java.lang.Class<T> r2, com.google.firebase.p.b<? super T> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.firebase.components.c0.b(r2)     // Catch:{ all -> 0x0029 }
            com.google.firebase.components.c0.b(r3)     // Catch:{ all -> 0x0029 }
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.p.b<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.a     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0011
            monitor-exit(r1)
            return
        L_0x0011:
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.p.b<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.a     // Catch:{ all -> 0x0029 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0029 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x0029 }
            r0.remove(r3)     // Catch:{ all -> 0x0029 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x0027
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.p.b<java.lang.Object>, java.util.concurrent.Executor>> r3 = r1.a     // Catch:{ all -> 0x0029 }
            r3.remove(r2)     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.w.c(java.lang.Class, com.google.firebase.p.b):void");
    }

    /* access modifiers changed from: package-private */
    public void d() {
        Queue<a<?>> queue;
        synchronized (this) {
            queue = this.b;
            if (queue != null) {
                this.b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (a b2 : queue) {
                b(b2);
            }
        }
    }

    public synchronized <T> void g(Class<T> cls, Executor executor, b<? super T> bVar) {
        c0.b(cls);
        c0.b(bVar);
        c0.b(executor);
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, new ConcurrentHashMap());
        }
        this.a.get(cls).put(bVar, executor);
    }
}
