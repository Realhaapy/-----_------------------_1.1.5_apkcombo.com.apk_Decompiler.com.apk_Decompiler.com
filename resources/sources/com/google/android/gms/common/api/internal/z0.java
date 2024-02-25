package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.c;
import e.e.a;
import f.e.a.c.g.j;
import java.util.Map;
import java.util.Set;

public final class z0 {
    private final a<b<?>, com.google.android.gms.common.a> a;
    private final a<b<?>, String> b;
    private final j<Map<b<?>, String>> c;

    /* renamed from: d  reason: collision with root package name */
    private int f2487d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2488e;

    public final Set<b<?>> a() {
        return this.a.keySet();
    }

    public final void b(b<?> bVar, com.google.android.gms.common.a aVar, String str) {
        this.a.put(bVar, aVar);
        this.b.put(bVar, str);
        this.f2487d--;
        if (!aVar.f()) {
            this.f2488e = true;
        }
        if (this.f2487d != 0) {
            return;
        }
        if (this.f2488e) {
            this.c.b(new c(this.a));
            return;
        }
        this.c.c(this.b);
    }
}
