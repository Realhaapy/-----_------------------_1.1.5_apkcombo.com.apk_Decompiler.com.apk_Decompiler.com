package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.m;
import com.google.firebase.components.n;
import com.google.firebase.components.q;
import com.google.firebase.components.t;
import com.google.firebase.m.a.a;
import com.google.firebase.t.h;
import java.util.Arrays;
import java.util.List;

@Keep
public class AbtRegistrar implements q {
    static /* synthetic */ b a(n nVar) {
        return new b((Context) nVar.get(Context.class), nVar.b(a.class));
    }

    public List<m<?>> getComponents() {
        m.b<b> a = m.a(b.class);
        a.b(t.i(Context.class));
        a.b(t.h(a.class));
        a.f(a.a);
        return Arrays.asList(new m[]{a.d(), h.a("fire-abt", "21.0.1")});
    }
}
