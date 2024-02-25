package com.google.firebase.t;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class e {
    private static volatile e b;
    private final Set<g> a = new HashSet();

    e() {
    }

    public static e a() {
        e eVar = b;
        if (eVar == null) {
            synchronized (e.class) {
                eVar = b;
                if (eVar == null) {
                    eVar = new e();
                    b = eVar;
                }
            }
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public Set<g> b() {
        Set<g> unmodifiableSet;
        synchronized (this.a) {
            unmodifiableSet = Collections.unmodifiableSet(this.a);
        }
        return unmodifiableSet;
    }
}
