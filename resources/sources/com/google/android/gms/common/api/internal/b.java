package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.internal.m;

public final class b<O extends a.d> {
    private final int a;
    private final a<O> b;
    private final O c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2399d;

    private b(a<O> aVar, O o2, String str) {
        this.b = aVar;
        this.c = o2;
        this.f2399d = str;
        this.a = m.b(aVar, o2, str);
    }

    public static <O extends a.d> b<O> a(a<O> aVar, O o2, String str) {
        return new b<>(aVar, o2, str);
    }

    public final String b() {
        return this.b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.b, bVar.b) && m.a(this.c, bVar.c) && m.a(this.f2399d, bVar.f2399d);
    }

    public final int hashCode() {
        return this.a;
    }
}
