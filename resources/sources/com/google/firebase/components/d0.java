package com.google.firebase.components;

import com.google.firebase.p.c;
import com.google.firebase.r.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class d0 extends l {
    private final Set<Class<?>> a;
    private final Set<Class<?>> b;
    private final Set<Class<?>> c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Class<?>> f2604d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<Class<?>> f2605e;

    /* renamed from: f  reason: collision with root package name */
    private final n f2606f;

    private static class a implements c {
        private final Set<Class<?>> a;
        private final c b;

        public a(Set<Class<?>> set, c cVar) {
            this.a = set;
            this.b = cVar;
        }

        public void b(com.google.firebase.p.a<?> aVar) {
            if (this.a.contains(aVar.a())) {
                this.b.b(aVar);
            } else {
                throw new v(String.format("Attempting to publish an undeclared event %s.", new Object[]{aVar}));
            }
        }
    }

    d0(m<?> mVar, n nVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (t next : mVar.c()) {
            if (next.d()) {
                boolean f2 = next.f();
                Class<?> b2 = next.b();
                if (f2) {
                    hashSet4.add(b2);
                } else {
                    hashSet.add(b2);
                }
            } else if (next.c()) {
                hashSet3.add(next.b());
            } else {
                boolean f3 = next.f();
                Class<?> b3 = next.b();
                if (f3) {
                    hashSet5.add(b3);
                } else {
                    hashSet2.add(b3);
                }
            }
        }
        if (!mVar.f().isEmpty()) {
            hashSet.add(c.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.c = Collections.unmodifiableSet(hashSet4);
        this.f2604d = Collections.unmodifiableSet(hashSet5);
        this.f2605e = mVar.f();
        this.f2606f = nVar;
    }

    public <T> Set<T> a(Class<T> cls) {
        if (this.c.contains(cls)) {
            return this.f2606f.a(cls);
        }
        throw new v(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    public <T> b<T> b(Class<T> cls) {
        if (this.b.contains(cls)) {
            return this.f2606f.b(cls);
        }
        throw new v(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public <T> b<Set<T>> c(Class<T> cls) {
        if (this.f2604d.contains(cls)) {
            return this.f2606f.c(cls);
        }
        throw new v(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    public <T> T get(Class<T> cls) {
        if (this.a.contains(cls)) {
            T t = this.f2606f.get(cls);
            return !cls.equals(c.class) ? t : new a(this.f2605e, (c) t);
        }
        throw new v(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }
}
