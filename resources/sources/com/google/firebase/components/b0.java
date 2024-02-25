package com.google.firebase.components;

import com.google.firebase.r.a;
import com.google.firebase.r.b;

class b0<T> implements b<T> {
    private static final a<Object> c = k.a;

    /* renamed from: d  reason: collision with root package name */
    private static final b<Object> f2603d = j.a;
    private a<T> a;
    private volatile b<T> b;

    private b0(a<T> aVar, b<T> bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    static <T> b0<T> a() {
        return new b0<>(c, f2603d);
    }

    static /* synthetic */ void b(b bVar) {
    }

    static /* synthetic */ Object c() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void d(b<T> bVar) {
        a<T> aVar;
        if (this.b == f2603d) {
            synchronized (this) {
                aVar = this.a;
                this.a = null;
                this.b = bVar;
            }
            aVar.a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    public T get() {
        return this.b.get();
    }
}
