package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.g0;
import m.y.d.g;
import m.y.d.l;

public final class e0 extends u {
    public static final a c = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final Uri a(String str, Bundle bundle) {
            l.d(str, "action");
            if (l.a(str, "oauth")) {
                o0 o0Var = o0.a;
                m0 m0Var = m0.a;
                return o0.e(m0.j(), "oauth/authorize", bundle);
            }
            o0 o0Var2 = o0.a;
            m0 m0Var2 = m0.a;
            String j2 = m0.j();
            StringBuilder sb = new StringBuilder();
            g0 g0Var = g0.a;
            sb.append(g0.m());
            sb.append("/dialog/");
            sb.append(str);
            return o0.e(j2, sb.toString(), bundle);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e0(String str, Bundle bundle) {
        super(str, bundle);
        l.d(str, "action");
        b(c.a(str, bundle == null ? new Bundle() : bundle));
    }
}
