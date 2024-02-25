package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.m;
import com.google.firebase.components.n;
import com.google.firebase.components.q;
import com.google.firebase.components.t;
import com.google.firebase.h;
import com.google.firebase.iid.a.a;
import com.google.firebase.p.d;
import com.google.firebase.q.k;
import com.google.firebase.t.i;
import f.e.a.a.g;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseMessagingRegistrar implements q {
    static /* synthetic */ FirebaseMessaging a(n nVar) {
        return new FirebaseMessaging((h) nVar.get(h.class), (a) nVar.get(a.class), nVar.b(i.class), nVar.b(k.class), (com.google.firebase.installations.h) nVar.get(com.google.firebase.installations.h.class), (g) nVar.get(g.class), (d) nVar.get(d.class));
    }

    @Keep
    public List<m<?>> getComponents() {
        m.b<FirebaseMessaging> a = m.a(FirebaseMessaging.class);
        a.b(t.i(h.class));
        a.b(t.g(a.class));
        a.b(t.h(i.class));
        a.b(t.h(k.class));
        a.b(t.g(g.class));
        a.b(t.i(com.google.firebase.installations.h.class));
        a.b(t.i(d.class));
        a.f(u.a);
        a.c();
        return Arrays.asList(new m[]{a.d(), com.google.firebase.t.h.a("fire-fcm", "23.0.6")});
    }
}
