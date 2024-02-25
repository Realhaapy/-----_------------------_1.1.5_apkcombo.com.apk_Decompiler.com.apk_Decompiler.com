package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.e;
import com.google.firebase.installations.h;
import com.google.firebase.r.b;
import com.google.firebase.remoteconfig.internal.n;
import com.google.firebase.remoteconfig.n;
import com.google.firebase.remoteconfig.o;
import com.google.firebase.remoteconfig.p;
import com.google.firebase.remoteconfig.r;
import f.e.a.c.g.i;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class l {

    /* renamed from: j  reason: collision with root package name */
    public static final long f2899j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k  reason: collision with root package name */
    static final int[] f2900k = {2, 4, 8, 16, 32, 64, 128, 256};
    private final h a;
    private final b<com.google.firebase.m.a.a> b;
    private final Executor c;

    /* renamed from: d  reason: collision with root package name */
    private final e f2901d;

    /* renamed from: e  reason: collision with root package name */
    private final Random f2902e;

    /* renamed from: f  reason: collision with root package name */
    private final j f2903f;

    /* renamed from: g  reason: collision with root package name */
    private final ConfigFetchHttpClient f2904g;

    /* renamed from: h  reason: collision with root package name */
    private final n f2905h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, String> f2906i;

    public static class a {
        private final int a;
        private final k b;
        private final String c;

        private a(Date date, int i2, k kVar, String str) {
            this.a = i2;
            this.b = kVar;
            this.c = str;
        }

        public static a a(Date date) {
            return new a(date, 1, (k) null, (String) null);
        }

        public static a b(k kVar, String str) {
            return new a(kVar.e(), 0, kVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, (k) null, (String) null);
        }

        public k d() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public String e() {
            return this.c;
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return this.a;
        }
    }

    public l(h hVar, b<com.google.firebase.m.a.a> bVar, Executor executor, e eVar, Random random, j jVar, ConfigFetchHttpClient configFetchHttpClient, n nVar, Map<String, String> map) {
        this.a = hVar;
        this.b = bVar;
        this.c = executor;
        this.f2901d = eVar;
        this.f2902e = random;
        this.f2903f = jVar;
        this.f2904g = configFetchHttpClient;
        this.f2905h = nVar;
        this.f2906i = map;
    }

    private boolean a(long j2, Date date) {
        Date e2 = this.f2905h.e();
        if (e2.equals(n.f2909d)) {
            return false;
        }
        return date.before(new Date(e2.getTime() + TimeUnit.SECONDS.toMillis(j2)));
    }

    private r b(r rVar) {
        String str;
        int a2 = rVar.a();
        if (a2 == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (a2 == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else if (a2 == 429) {
            throw new n("The throttled response from the server was not handled correctly by the FRC SDK.");
        } else if (a2 != 500) {
            switch (a2) {
                case 502:
                case 503:
                case 504:
                    str = "The server is unavailable. Please try again later.";
                    break;
                default:
                    str = "The server returned an unexpected error.";
                    break;
            }
        } else {
            str = "There was an internal server error.";
        }
        int a3 = rVar.a();
        return new r(a3, "Fetch failed: " + str, rVar);
    }

    private String c(long j2) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j2))});
    }

    private a f(String str, String str2, Date date) {
        try {
            a fetch = this.f2904g.fetch(this.f2904g.d(), str, str2, l(), this.f2905h.d(), this.f2906i, j(), date);
            if (fetch.e() != null) {
                this.f2905h.j(fetch.e());
            }
            this.f2905h.g();
            return fetch;
        } catch (r e2) {
            n.a v = v(e2.a(), date);
            if (u(v, e2.a())) {
                throw new p(v.a().getTime());
            }
            throw b(e2);
        }
    }

    private i<a> g(String str, String str2, Date date) {
        try {
            a f2 = f(str, str2, date);
            return f2.f() != 0 ? f.e.a.c.g.l.f(f2) : this.f2903f.k(f2.d()).o(this.c, new f(f2));
        } catch (o e2) {
            return f.e.a.c.g.l.e(e2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public i<a> n(i<k> iVar, long j2) {
        i<TContinuationResult> iVar2;
        Date date = new Date(this.f2901d.a());
        if (iVar.m() && a(j2, date)) {
            return f.e.a.c.g.l.f(a.c(date));
        }
        Date i2 = i(date);
        if (i2 != null) {
            iVar2 = f.e.a.c.g.l.e(new p(c(i2.getTime() - date.getTime()), i2.getTime()));
        } else {
            i<String> a2 = this.a.a();
            i<com.google.firebase.installations.l> b2 = this.a.b(false);
            iVar2 = f.e.a.c.g.l.j(a2, b2).g(this.c, new c(this, a2, b2, date));
        }
        return iVar2.g(this.c, new e(this, date));
    }

    private Date i(Date date) {
        Date a2 = this.f2905h.a().a();
        if (date.before(a2)) {
            return a2;
        }
        return null;
    }

    private Long j() {
        com.google.firebase.m.a.a aVar = this.b.get();
        if (aVar == null) {
            return null;
        }
        return (Long) aVar.a(true).get("_fot");
    }

    private long k(int i2) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f2900k;
        long millis = timeUnit.toMillis((long) iArr[Math.min(i2, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f2902e.nextInt((int) millis));
    }

    private Map<String, String> l() {
        HashMap hashMap = new HashMap();
        com.google.firebase.m.a.a aVar = this.b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry next : aVar.a(false).entrySet()) {
            hashMap.put((String) next.getKey(), next.getValue().toString());
        }
        return hashMap;
    }

    private boolean m(int i2) {
        return i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ i r(i iVar, i iVar2, Date date, i iVar3) {
        return !iVar.m() ? f.e.a.c.g.l.e(new com.google.firebase.remoteconfig.n("Firebase Installations failed to get installation ID for fetch.", iVar.h())) : !iVar2.m() ? f.e.a.c.g.l.e(new com.google.firebase.remoteconfig.n("Firebase Installations failed to get installation auth token for fetch.", iVar2.h())) : g((String) iVar.i(), ((com.google.firebase.installations.l) iVar2.i()).b(), date);
    }

    private /* synthetic */ i s(Date date, i iVar) {
        x(iVar, date);
        return iVar;
    }

    private boolean u(n.a aVar, int i2) {
        return aVar.b() > 1 || i2 == 429;
    }

    private n.a v(int i2, Date date) {
        if (m(i2)) {
            w(date);
        }
        return this.f2905h.a();
    }

    private void w(Date date) {
        int b2 = this.f2905h.a().b() + 1;
        this.f2905h.h(b2, new Date(date.getTime() + k(b2)));
    }

    private void x(i<a> iVar, Date date) {
        if (iVar.m()) {
            this.f2905h.l(date);
            return;
        }
        Exception h2 = iVar.h();
        if (h2 != null) {
            if (h2 instanceof p) {
                this.f2905h.m();
            } else {
                this.f2905h.k();
            }
        }
    }

    public i<a> d() {
        return e(this.f2905h.f());
    }

    public i<a> e(long j2) {
        return this.f2903f.c().g(this.c, new d(this, j2));
    }

    public /* synthetic */ i t(Date date, i iVar) {
        s(date, iVar);
        return iVar;
    }
}
