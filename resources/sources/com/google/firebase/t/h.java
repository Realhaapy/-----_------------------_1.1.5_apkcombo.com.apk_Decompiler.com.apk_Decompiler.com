package com.google.firebase.t;

import android.content.Context;
import com.google.firebase.components.m;
import com.google.firebase.components.t;

public class h {

    public interface a<T> {
        String a(T t);
    }

    public static m<?> a(String str, String str2) {
        return m.g(g.a(str, str2), g.class);
    }

    public static m<?> b(String str, a<Context> aVar) {
        m.b<g> h2 = m.h(g.class);
        h2.b(t.i(Context.class));
        h2.f(new b(str, aVar));
        return h2.d();
    }
}
