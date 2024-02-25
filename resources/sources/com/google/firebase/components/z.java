package com.google.firebase.components;

import com.google.firebase.r.b;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class z<T> implements b<Set<T>> {
    private volatile Set<b<T>> a = Collections.newSetFromMap(new ConcurrentHashMap());
    private volatile Set<T> b = null;

    z(Collection<b<T>> collection) {
        this.a.addAll(collection);
    }

    static z<?> b(Collection<b<?>> collection) {
        return new z<>((Set) collection);
    }

    private synchronized void d() {
        for (b<T> bVar : this.a) {
            this.b.add(bVar.get());
        }
        this.a = null;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(b<T> bVar) {
        Set set;
        T t;
        if (this.b == null) {
            set = this.a;
            t = bVar;
        } else {
            set = this.b;
            t = bVar.get();
        }
        set.add(t);
    }

    /* renamed from: c */
    public Set<T> get() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}
