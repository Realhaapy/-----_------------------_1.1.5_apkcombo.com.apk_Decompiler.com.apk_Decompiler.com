package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.m;
import com.google.firebase.components.q;
import com.google.firebase.components.t;
import com.google.firebase.t.h;
import f.e.a.a.g;
import java.util.Arrays;
import java.util.List;

@Keep
public class TransportRegistrar implements q {
    public List<m<?>> getComponents() {
        m.b<g> a = m.a(g.class);
        a.b(t.i(Context.class));
        a.f(a.a);
        return Arrays.asList(new m[]{a.d(), h.a("fire-transport", "18.1.5")});
    }
}
