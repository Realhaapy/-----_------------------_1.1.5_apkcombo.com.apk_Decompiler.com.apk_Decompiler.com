package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.n;
import com.google.firebase.h;
import com.google.firebase.installations.i;
import com.google.firebase.installations.q.d;
import com.google.firebase.installations.r.c;
import com.google.firebase.installations.r.f;
import com.google.firebase.q.j;
import f.e.a.c.g.i;
import f.e.a.c.g.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class g implements h {

    /* renamed from: m  reason: collision with root package name */
    private static final Object f2640m = new Object();

    /* renamed from: n  reason: collision with root package name */
    private static final ThreadFactory f2641n = new a();
    private final h a;
    private final c b;
    private final com.google.firebase.installations.q.c c;

    /* renamed from: d  reason: collision with root package name */
    private final o f2642d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.firebase.installations.q.b f2643e;

    /* renamed from: f  reason: collision with root package name */
    private final m f2644f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f2645g;

    /* renamed from: h  reason: collision with root package name */
    private final ExecutorService f2646h;

    /* renamed from: i  reason: collision with root package name */
    private final ExecutorService f2647i;

    /* renamed from: j  reason: collision with root package name */
    private String f2648j;

    /* renamed from: k  reason: collision with root package name */
    private Set<com.google.firebase.installations.p.a> f2649k;

    /* renamed from: l  reason: collision with root package name */
    private final List<n> f2650l;

    class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.a.getAndIncrement())}));
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.google.firebase.installations.r.f$b[] r0 = com.google.firebase.installations.r.f.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                com.google.firebase.installations.r.f$b r2 = com.google.firebase.installations.r.f.b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.installations.r.f$b r3 = com.google.firebase.installations.r.f.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.installations.r.f$b r3 = com.google.firebase.installations.r.f.b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.firebase.installations.r.d$b[] r2 = com.google.firebase.installations.r.d.b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                a = r2
                com.google.firebase.installations.r.d$b r3 = com.google.firebase.installations.r.d.b.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.installations.r.d$b r2 = com.google.firebase.installations.r.d.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.g.b.<clinit>():void");
        }
    }

    g(h hVar, com.google.firebase.r.b<j> bVar) {
        this(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f2641n), hVar, new c(hVar.j(), bVar), new com.google.firebase.installations.q.c(hVar), o.c(), new com.google.firebase.installations.q.b(hVar), new m());
    }

    g(ExecutorService executorService, h hVar, c cVar, com.google.firebase.installations.q.c cVar2, o oVar, com.google.firebase.installations.q.b bVar, m mVar) {
        this.f2645g = new Object();
        this.f2649k = new HashSet();
        this.f2650l = new ArrayList();
        this.a = hVar;
        this.b = cVar;
        this.c = cVar2;
        this.f2642d = oVar;
        this.f2643e = bVar;
        this.f2644f = mVar;
        this.f2646h = executorService;
        this.f2647i = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f2641n);
    }

    private void A(d dVar) {
        synchronized (this.f2645g) {
            Iterator<n> it = this.f2650l.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void B(String str) {
        this.f2648j = str;
    }

    private synchronized void C(d dVar, d dVar2) {
        if (this.f2649k.size() != 0 && !dVar.d().equals(dVar2.d())) {
            for (com.google.firebase.installations.p.a a2 : this.f2649k) {
                a2.a(dVar2.d());
            }
        }
    }

    private i<l> c() {
        f.e.a.c.g.j jVar = new f.e.a.c.g.j();
        e(new j(this.f2642d, jVar));
        return jVar.a();
    }

    private i<String> d() {
        f.e.a.c.g.j jVar = new f.e.a.c.g.j();
        e(new k(jVar));
        return jVar.a();
    }

    private void e(n nVar) {
        synchronized (this.f2645g) {
            this.f2650l.add(nVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.q.d r0 = r2.m()
            boolean r1 = r0.i()     // Catch:{ i -> 0x005c }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.l()     // Catch:{ i -> 0x005c }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.o r3 = r2.f2642d     // Catch:{ i -> 0x005c }
            boolean r3 = r3.f(r0)     // Catch:{ i -> 0x005c }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            com.google.firebase.installations.q.d r3 = r2.h(r0)     // Catch:{ i -> 0x005c }
            goto L_0x0026
        L_0x0022:
            com.google.firebase.installations.q.d r3 = r2.y(r0)     // Catch:{ i -> 0x005c }
        L_0x0026:
            r2.p(r3)
            r2.C(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r3.d()
            r2.B(r0)
        L_0x0039:
            boolean r0 = r3.i()
            if (r0 == 0) goto L_0x004a
            com.google.firebase.installations.i r3 = new com.google.firebase.installations.i
            com.google.firebase.installations.i$a r0 = com.google.firebase.installations.i.a.BAD_CONFIG
            r3.<init>(r0)
        L_0x0046:
            r2.z(r3)
            goto L_0x005b
        L_0x004a:
            boolean r0 = r3.j()
            if (r0 == 0) goto L_0x0058
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            goto L_0x0046
        L_0x0058:
            r2.A(r3)
        L_0x005b:
            return
        L_0x005c:
            r3 = move-exception
            r2.z(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.g.q(boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void u(boolean z) {
        d n2 = n();
        if (z) {
            n2 = n2.p();
        }
        A(n2);
        this.f2647i.execute(new a(this, z));
    }

    private d h(d dVar) {
        f e2 = this.b.e(i(), dVar.d(), o(), dVar.f());
        int i2 = b.b[e2.b().ordinal()];
        if (i2 == 1) {
            return dVar.o(e2.c(), e2.d(), this.f2642d.b());
        } else if (i2 == 2) {
            return dVar.q("BAD CONFIG");
        } else {
            if (i2 == 3) {
                B((String) null);
                return dVar.r();
            }
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
    }

    private synchronized String k() {
        return this.f2648j;
    }

    public static g l(h hVar) {
        n.b(hVar != null, "Null is not a valid value of FirebaseApp.");
        return (g) hVar.h(h.class);
    }

    private d m() {
        d d2;
        synchronized (f2640m) {
            f a2 = f.a(this.a.j(), "generatefid.lock");
            try {
                d2 = this.c.d();
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.b();
                }
                throw th;
            }
        }
        return d2;
    }

    private d n() {
        d d2;
        synchronized (f2640m) {
            f a2 = f.a(this.a.j(), "generatefid.lock");
            try {
                d2 = this.c.d();
                if (d2.j()) {
                    String x = x(d2);
                    com.google.firebase.installations.q.c cVar = this.c;
                    d2 = d2.t(x);
                    cVar.b(d2);
                }
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.b();
                }
                throw th;
            }
        }
        return d2;
    }

    private void p(d dVar) {
        synchronized (f2640m) {
            f a2 = f.a(this.a.j(), "generatefid.lock");
            try {
                this.c.b(dVar);
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.b();
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void t() {
        u(false);
    }

    private void w() {
        n.e(j(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n.e(o(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n.e(i(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n.b(o.h(j()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n.b(o.g(i()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String x(d dVar) {
        if ((!this.a.n().equals("CHIME_ANDROID_SDK") && !this.a.v()) || !dVar.m()) {
            return this.f2644f.a();
        }
        String f2 = this.f2643e.f();
        return TextUtils.isEmpty(f2) ? this.f2644f.a() : f2;
    }

    private d y(d dVar) {
        com.google.firebase.installations.r.d d2 = this.b.d(i(), dVar.d(), o(), j(), (dVar.d() == null || dVar.d().length() != 11) ? null : this.f2643e.i());
        int i2 = b.a[d2.e().ordinal()];
        if (i2 == 1) {
            return dVar.s(d2.c(), d2.d(), this.f2642d.b(), d2.b().c(), d2.b().d());
        } else if (i2 == 2) {
            return dVar.q("BAD CONFIG");
        } else {
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
    }

    private void z(Exception exc) {
        synchronized (this.f2645g) {
            Iterator<n> it = this.f2650l.iterator();
            while (it.hasNext()) {
                if (it.next().a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public f.e.a.c.g.i<String> a() {
        w();
        String k2 = k();
        if (k2 != null) {
            return l.f(k2);
        }
        f.e.a.c.g.i<String> d2 = d();
        this.f2646h.execute(new b(this));
        return d2;
    }

    public f.e.a.c.g.i<l> b(boolean z) {
        w();
        f.e.a.c.g.i<l> c2 = c();
        this.f2646h.execute(new c(this, z));
        return c2;
    }

    /* access modifiers changed from: package-private */
    public String i() {
        return this.a.o().b();
    }

    /* access modifiers changed from: package-private */
    public String j() {
        return this.a.o().c();
    }

    /* access modifiers changed from: package-private */
    public String o() {
        return this.a.o().g();
    }
}
