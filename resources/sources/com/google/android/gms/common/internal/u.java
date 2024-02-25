package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.a;

public class u implements a.d {
    public static final u b = c().a();
    private final String a;

    public static class a {
        private String a;

        /* synthetic */ a(y yVar) {
        }

        public u a() {
            return new u(this.a, (z) null);
        }
    }

    /* synthetic */ u(String str, z zVar) {
        this.a = str;
    }

    public static a c() {
        return new a((y) null);
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        String str = this.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        return m.a(this.a, ((u) obj).a);
    }

    public final int hashCode() {
        return m.b(this.a);
    }
}
