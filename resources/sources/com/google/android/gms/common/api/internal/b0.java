package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.m;

final class b0 {
    /* access modifiers changed from: private */
    public final b<?> a;
    /* access modifiers changed from: private */
    public final c b;

    /* synthetic */ b0(b bVar, c cVar, a0 a0Var) {
        this.a = bVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof b0)) {
            b0 b0Var = (b0) obj;
            return m.a(this.a, b0Var.a) && m.a(this.b, b0Var.b);
        }
    }

    public final int hashCode() {
        return m.b(this.a, this.b);
    }

    public final String toString() {
        m.a c = m.c(this);
        c.a("key", this.a);
        c.a("feature", this.b);
        return c.toString();
    }
}
