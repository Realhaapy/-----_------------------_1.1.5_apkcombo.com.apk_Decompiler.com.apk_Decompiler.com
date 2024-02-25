package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

public class u extends v {

    /* renamed from: e  reason: collision with root package name */
    private final List<m<?>> f2623e;

    public u(List<m<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f2623e = list;
    }
}
