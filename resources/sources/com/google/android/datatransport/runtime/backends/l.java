package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import f.e.a.a.i.w.b.b;
import l.a.a;

public final class l implements b<k> {
    private final a<Context> a;
    private final a<i> b;

    public l(a<Context> aVar, a<i> aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public static l a(a<Context> aVar, a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    /* renamed from: b */
    public k get() {
        return c(this.a.get(), this.b.get());
    }
}
