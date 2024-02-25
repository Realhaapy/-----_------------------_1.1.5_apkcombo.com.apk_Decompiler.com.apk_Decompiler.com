package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import f.e.a.a.i.w.b.b;
import l.a.a;

public final class j implements b<i> {
    private final a<Context> a;
    private final a<f.e.a.a.i.c0.a> b;
    private final a<f.e.a.a.i.c0.a> c;

    public j(a<Context> aVar, a<f.e.a.a.i.c0.a> aVar2, a<f.e.a.a.i.c0.a> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public static j a(a<Context> aVar, a<f.e.a.a.i.c0.a> aVar2, a<f.e.a.a.i.c0.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, f.e.a.a.i.c0.a aVar, f.e.a.a.i.c0.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    /* renamed from: b */
    public i get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
