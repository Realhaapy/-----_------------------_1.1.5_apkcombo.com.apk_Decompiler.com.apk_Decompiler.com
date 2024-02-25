package com.google.firebase.p;

import com.google.firebase.components.c0;

public class a<T> {
    private final Class<T> a;
    private final T b;

    public a(Class<T> cls, T t) {
        c0.b(cls);
        this.a = cls;
        c0.b(t);
        this.b = t;
    }

    public Class<T> a() {
        return this.a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.a, this.b});
    }
}
