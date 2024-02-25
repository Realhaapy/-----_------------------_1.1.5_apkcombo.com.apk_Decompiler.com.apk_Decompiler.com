package com.google.firebase.components;

import com.google.firebase.r.b;
import java.util.Set;

public interface n {
    <T> Set<T> a(Class<T> cls);

    <T> b<T> b(Class<T> cls);

    <T> b<Set<T>> c(Class<T> cls);

    <T> T get(Class<T> cls);
}
