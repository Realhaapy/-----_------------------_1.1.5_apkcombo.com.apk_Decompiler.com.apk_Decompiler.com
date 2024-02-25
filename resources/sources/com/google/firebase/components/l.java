package com.google.firebase.components;

import com.google.firebase.r.b;
import java.util.Set;

abstract class l implements n {
    l() {
    }

    public <T> Set<T> a(Class<T> cls) {
        return c(cls).get();
    }

    public <T> T get(Class<T> cls) {
        b<T> b = b(cls);
        if (b == null) {
            return null;
        }
        return b.get();
    }
}
