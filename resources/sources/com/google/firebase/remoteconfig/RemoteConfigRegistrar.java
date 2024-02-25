package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.component.b;
import com.google.firebase.components.m;
import com.google.firebase.components.n;
import com.google.firebase.components.q;
import com.google.firebase.components.t;
import com.google.firebase.h;
import com.google.firebase.m.a.a;
import java.util.Arrays;
import java.util.List;

@Keep
public class RemoteConfigRegistrar implements q {
    static /* synthetic */ u a(n nVar) {
        return new u((Context) nVar.get(Context.class), (h) nVar.get(h.class), (com.google.firebase.installations.h) nVar.get(com.google.firebase.installations.h.class), ((b) nVar.get(b.class)).b("frc"), nVar.b(a.class));
    }

    public List<m<?>> getComponents() {
        m.b<u> a = m.a(u.class);
        a.b(t.i(Context.class));
        a.b(t.i(h.class));
        a.b(t.i(com.google.firebase.installations.h.class));
        a.b(t.i(b.class));
        a.b(t.h(a.class));
        a.f(j.a);
        a.e();
        return Arrays.asList(new m[]{a.d(), com.google.firebase.t.h.a("fire-rc", "21.1.1")});
    }
}
