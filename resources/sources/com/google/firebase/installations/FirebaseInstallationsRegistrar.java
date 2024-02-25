package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.m;
import com.google.firebase.components.n;
import com.google.firebase.components.q;
import com.google.firebase.components.t;
import com.google.firebase.h;
import com.google.firebase.q.i;
import com.google.firebase.q.j;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseInstallationsRegistrar implements q {
    static /* synthetic */ h a(n nVar) {
        return new g((h) nVar.get(h.class), nVar.b(j.class));
    }

    public List<m<?>> getComponents() {
        m.b<h> a = m.a(h.class);
        a.b(t.i(h.class));
        a.b(t.h(j.class));
        a.f(d.a);
        return Arrays.asList(new m[]{a.d(), i.a(), com.google.firebase.t.h.a("fire-installations", "17.0.1")});
    }
}
