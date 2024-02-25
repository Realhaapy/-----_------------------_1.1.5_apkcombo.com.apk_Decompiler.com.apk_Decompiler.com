package com.google.android.gms.common.internal.w;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.u;
import f.e.a.c.g.i;

public final class d extends e<u> implements t {

    /* renamed from: i  reason: collision with root package name */
    private static final a.g<e> f2590i;

    /* renamed from: j  reason: collision with root package name */
    private static final a.C0039a<e, u> f2591j;

    /* renamed from: k  reason: collision with root package name */
    private static final a<u> f2592k;

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f2593l = 0;

    static {
        a.g<e> gVar = new a.g<>();
        f2590i = gVar;
        c cVar = new c();
        f2591j = cVar;
        f2592k = new a<>("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, u uVar) {
        super(context, f2592k, uVar, e.a.c);
    }

    public final i<Void> a(r rVar) {
        n.a a = n.a();
        a.d(f.e.a.c.d.a.d.a);
        a.c(false);
        a.b(new b(rVar));
        return c(a.a());
    }
}
