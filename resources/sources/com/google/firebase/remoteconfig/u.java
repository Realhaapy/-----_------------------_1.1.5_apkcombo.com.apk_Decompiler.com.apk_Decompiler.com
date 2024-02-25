package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.f;
import com.google.firebase.h;
import com.google.firebase.l.c;
import com.google.firebase.m.a.a;
import com.google.firebase.r.b;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.j;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.n;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.r;
import f.e.a.c.g.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class u {

    /* renamed from: j  reason: collision with root package name */
    private static final e f2919j = f.c();

    /* renamed from: k  reason: collision with root package name */
    private static final Random f2920k = new Random();
    private final Map<String, m> a;
    private final Context b;
    private final ExecutorService c;

    /* renamed from: d  reason: collision with root package name */
    private final h f2921d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.firebase.installations.h f2922e;

    /* renamed from: f  reason: collision with root package name */
    private final c f2923f;

    /* renamed from: g  reason: collision with root package name */
    private final b<a> f2924g;

    /* renamed from: h  reason: collision with root package name */
    private final String f2925h;

    /* renamed from: i  reason: collision with root package name */
    private Map<String, String> f2926i;

    u(Context context, h hVar, com.google.firebase.installations.h hVar2, c cVar, b<a> bVar) {
        this(context, Executors.newCachedThreadPool(), hVar, hVar2, cVar, bVar, true);
    }

    protected u(Context context, ExecutorService executorService, h hVar, com.google.firebase.installations.h hVar2, c cVar, b<a> bVar, boolean z) {
        this.a = new HashMap();
        this.f2926i = new HashMap();
        this.b = context;
        this.c = executorService;
        this.f2921d = hVar;
        this.f2922e = hVar2;
        this.f2923f = cVar;
        this.f2924g = bVar;
        this.f2925h = hVar.o().c();
        if (z) {
            l.d(executorService, new h(this));
        }
    }

    private j c(String str, String str2) {
        return j.f(Executors.newCachedThreadPool(), o.c(this.b, String.format("%s_%s_%s_%s.json", new Object[]{"frc", this.f2925h, str, str2})));
    }

    private m g(j jVar, j jVar2) {
        return new m(this.c, jVar, jVar2);
    }

    static n h(Context context, String str, String str2) {
        return new n(context.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", str, str2, "settings"}), 0));
    }

    private static r i(h hVar, String str, b<a> bVar) {
        if (!k(hVar) || !str.equals("firebase")) {
            return null;
        }
        return new r(bVar);
    }

    private static boolean j(h hVar, String str) {
        return str.equals("firebase") && k(hVar);
    }

    private static boolean k(h hVar) {
        return hVar.n().equals("[DEFAULT]");
    }

    static /* synthetic */ a l() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public synchronized m a(h hVar, String str, com.google.firebase.installations.h hVar2, c cVar, Executor executor, j jVar, j jVar2, j jVar3, com.google.firebase.remoteconfig.internal.l lVar, m mVar, n nVar) {
        m mVar2;
        String str2 = str;
        synchronized (this) {
            if (!this.a.containsKey(str2)) {
                m mVar3 = new m(this.b, hVar, hVar2, j(hVar, str) ? cVar : null, executor, jVar, jVar2, jVar3, lVar, mVar, nVar);
                mVar3.w();
                this.a.put(str2, mVar3);
            }
            mVar2 = this.a.get(str2);
        }
        return mVar2;
    }

    public synchronized m b(String str) {
        j c2;
        j c3;
        j c4;
        n h2;
        m g2;
        c2 = c(str, "fetch");
        c3 = c(str, "activate");
        c4 = c(str, "defaults");
        h2 = h(this.b, this.f2925h, str);
        g2 = g(c3, c4);
        r i2 = i(this.f2921d, str, this.f2924g);
        if (i2 != null) {
            Objects.requireNonNull(i2);
            g2.a(new k(i2));
        }
        return a(this.f2921d, str, this.f2922e, this.f2923f, this.c, c2, c3, c4, e(str, c2, h2), g2, h2);
    }

    /* access modifiers changed from: package-private */
    public m d() {
        return b("firebase");
    }

    /* access modifiers changed from: package-private */
    public synchronized com.google.firebase.remoteconfig.internal.l e(String str, j jVar, n nVar) {
        return new com.google.firebase.remoteconfig.internal.l(this.f2922e, k(this.f2921d) ? this.f2924g : i.a, this.c, f2919j, f2920k, jVar, f(this.f2921d.o().b(), str, nVar), nVar, this.f2926i);
    }

    /* access modifiers changed from: package-private */
    public ConfigFetchHttpClient f(String str, String str2, n nVar) {
        return new ConfigFetchHttpClient(this.b, this.f2921d.o().c(), str, str2, nVar.b(), nVar.b());
    }
}
