package com.google.firebase.components;

import com.google.firebase.r.b;

public class y<T> implements b<T> {
    private static final Object c = new Object();
    private volatile Object a = c;
    private volatile b<T> b;

    public y(b<T> bVar) {
        this.b = bVar;
    }

    public T get() {
        T t = this.a;
        T t2 = c;
        if (t == t2) {
            synchronized (this) {
                t = this.a;
                if (t == t2) {
                    t = this.b.get();
                    this.a = t;
                    this.b = null;
                }
            }
        }
        return t;
    }
}
