package com.google.android.datatransport.cct.f;

import com.google.auto.value.AutoValue;
import com.google.firebase.o.a;
import com.google.firebase.o.i.d;
import java.util.List;

@AutoValue
public abstract class j {
    public static j a(List<m> list) {
        return new d(list);
    }

    public static a b() {
        d dVar = new d();
        dVar.g(b.a);
        dVar.h(true);
        return dVar.f();
    }

    public abstract List<m> c();
}
