package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.h0;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.g;
import e.e.b;
import f.e.a.c.d.a.f;
import f.e.a.c.g.i;
import f.e.a.c.g.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public class e implements Handler.Callback {

    /* renamed from: r  reason: collision with root package name */
    public static final Status f2416r = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final Status f2417s = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */
    public static final Object t = new Object();
    private static e u;
    /* access modifiers changed from: private */
    public long a = 5000;
    /* access modifiers changed from: private */
    public long b = 120000;
    /* access modifiers changed from: private */
    public long c = 10000;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f2418d = false;

    /* renamed from: e  reason: collision with root package name */
    private r f2419e;

    /* renamed from: f  reason: collision with root package name */
    private t f2420f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Context f2421g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final d f2422h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final h0 f2423i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicInteger f2424j = new AtomicInteger(1);

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f2425k = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final Map<b<?>, z<?>> f2426l = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public r f2427m = null;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Set<b<?>> f2428n = new b();

    /* renamed from: o  reason: collision with root package name */
    private final Set<b<?>> f2429o = new b();
    /* access modifiers changed from: private */
    @NotOnlyInitialized

    /* renamed from: p  reason: collision with root package name */
    public final Handler f2430p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public volatile boolean f2431q = true;

    private e(Context context, Looper looper, d dVar) {
        this.f2421g = context;
        f fVar = new f(looper, this);
        this.f2430p = fVar;
        this.f2422h = dVar;
        this.f2423i = new h0(dVar);
        if (g.a(context)) {
            this.f2431q = false;
        }
        fVar.sendMessage(fVar.obtainMessage(6));
    }

    /* access modifiers changed from: private */
    public static Status h(b<?> bVar, a aVar) {
        String b2 = bVar.b();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 63 + String.valueOf(valueOf).length());
        sb.append("API: ");
        sb.append(b2);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(aVar, sb.toString());
    }

    private final z<?> i(com.google.android.gms.common.api.e<?> eVar) {
        b<?> d2 = eVar.d();
        z<?> zVar = this.f2426l.get(d2);
        if (zVar == null) {
            zVar = new z<>(this, eVar);
            this.f2426l.put(d2, zVar);
        }
        if (zVar.P()) {
            this.f2429o.add(d2);
        }
        zVar.E();
        return zVar;
    }

    private final t j() {
        if (this.f2420f == null) {
            this.f2420f = s.a(this.f2421g);
        }
        return this.f2420f;
    }

    private final void k() {
        r rVar = this.f2419e;
        if (rVar != null) {
            if (rVar.b() > 0 || f()) {
                j().a(rVar);
            }
            this.f2419e = null;
        }
    }

    private final <T> void l(j<T> jVar, int i2, com.google.android.gms.common.api.e eVar) {
        h0 b2;
        if (i2 != 0 && (b2 = h0.b(this, i2, eVar.d())) != null) {
            i<T> a2 = jVar.a();
            Handler handler = this.f2430p;
            handler.getClass();
            a2.c(new t(handler), b2);
        }
    }

    public static e x(Context context) {
        e eVar;
        synchronized (t) {
            if (u == null) {
                u = new e(context.getApplicationContext(), h.c().getLooper(), d.k());
            }
            eVar = u;
        }
        return eVar;
    }

    public final <O extends a.d, ResultT> void D(com.google.android.gms.common.api.e<O> eVar, int i2, n<a.b, ResultT> nVar, j<ResultT> jVar, m mVar) {
        l(jVar, nVar.d(), eVar);
        w0 w0Var = new w0(i2, nVar, jVar, mVar);
        Handler handler = this.f2430p;
        handler.sendMessage(handler.obtainMessage(4, new l0(w0Var, this.f2425k.get(), eVar)));
    }

    /* access modifiers changed from: package-private */
    public final void E(l lVar, int i2, long j2, int i3) {
        Handler handler = this.f2430p;
        handler.sendMessage(handler.obtainMessage(18, new i0(lVar, i2, j2, i3)));
    }

    public final void F(com.google.android.gms.common.a aVar, int i2) {
        if (!g(aVar, i2)) {
            Handler handler = this.f2430p;
            handler.sendMessage(handler.obtainMessage(5, i2, 0, aVar));
        }
    }

    public final void a() {
        Handler handler = this.f2430p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void b(com.google.android.gms.common.api.e<?> eVar) {
        Handler handler = this.f2430p;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void c(r rVar) {
        synchronized (t) {
            if (this.f2427m != rVar) {
                this.f2427m = rVar;
                this.f2428n.clear();
            }
            this.f2428n.addAll(rVar.t());
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(r rVar) {
        synchronized (t) {
            if (this.f2427m == rVar) {
                this.f2427m = null;
                this.f2428n.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        if (this.f2418d) {
            return false;
        }
        p a2 = o.b().a();
        if (a2 != null && !a2.d()) {
            return false;
        }
        int a3 = this.f2423i.a(this.f2421g, 203400000);
        return a3 == -1 || a3 == 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean g(com.google.android.gms.common.a aVar, int i2) {
        return this.f2422h.u(this.f2421g, aVar, i2);
    }

    public final boolean handleMessage(Message message) {
        j<Boolean> jVar;
        Boolean bool;
        int i2 = message.what;
        long j2 = 300000;
        z zVar = null;
        switch (i2) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                }
                this.c = j2;
                this.f2430p.removeMessages(12);
                for (b<?> obtainMessage : this.f2426l.keySet()) {
                    Handler handler = this.f2430p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.c);
                }
                break;
            case 2:
                z0 z0Var = (z0) message.obj;
                Iterator<b<?>> it = z0Var.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        b next = it.next();
                        z zVar2 = this.f2426l.get(next);
                        if (zVar2 == null) {
                            z0Var.b(next, new com.google.android.gms.common.a(13), (String) null);
                            break;
                        } else if (zVar2.O()) {
                            z0Var.b(next, com.google.android.gms.common.a.f2366i, zVar2.v().k());
                        } else {
                            com.google.android.gms.common.a t2 = zVar2.t();
                            if (t2 != null) {
                                z0Var.b(next, t2, (String) null);
                            } else {
                                zVar2.J(z0Var);
                                zVar2.E();
                            }
                        }
                    }
                }
            case 3:
                for (z next2 : this.f2426l.values()) {
                    next2.D();
                    next2.E();
                }
                break;
            case 4:
            case 8:
            case 13:
                l0 l0Var = (l0) message.obj;
                z<?> zVar3 = this.f2426l.get(l0Var.c.d());
                if (zVar3 == null) {
                    zVar3 = i(l0Var.c);
                }
                if (zVar3.P() && this.f2425k.get() != l0Var.b) {
                    l0Var.a.a(f2416r);
                    zVar3.L();
                    break;
                } else {
                    zVar3.F(l0Var.a);
                    break;
                }
            case 5:
                int i3 = message.arg1;
                com.google.android.gms.common.a aVar = (com.google.android.gms.common.a) message.obj;
                Iterator<z<?>> it2 = this.f2426l.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        z next3 = it2.next();
                        if (next3.r() == i3) {
                            zVar = next3;
                        }
                    }
                }
                if (zVar != null) {
                    if (aVar.b() != 13) {
                        zVar.g(h(zVar.c, aVar));
                        break;
                    } else {
                        String d2 = this.f2422h.d(aVar.b());
                        String c2 = aVar.c();
                        StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 69 + String.valueOf(c2).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(d2);
                        sb.append(": ");
                        sb.append(c2);
                        zVar.g(new Status(17, sb.toString()));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i3);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f2421g.getApplicationContext() instanceof Application) {
                    c.c((Application) this.f2421g.getApplicationContext());
                    c.b().a(new u(this));
                    if (!c.b().e(true)) {
                        this.c = 300000;
                        break;
                    }
                }
                break;
            case 7:
                i((com.google.android.gms.common.api.e) message.obj);
                break;
            case 9:
                if (this.f2426l.containsKey(message.obj)) {
                    this.f2426l.get(message.obj).K();
                    break;
                }
                break;
            case 10:
                for (b<?> remove : this.f2429o) {
                    z remove2 = this.f2426l.remove(remove);
                    if (remove2 != null) {
                        remove2.L();
                    }
                }
                this.f2429o.clear();
                break;
            case 11:
                if (this.f2426l.containsKey(message.obj)) {
                    this.f2426l.get(message.obj).M();
                    break;
                }
                break;
            case 12:
                if (this.f2426l.containsKey(message.obj)) {
                    this.f2426l.get(message.obj).d();
                    break;
                }
                break;
            case 14:
                s sVar = (s) message.obj;
                b<?> a2 = sVar.a();
                if (!this.f2426l.containsKey(a2)) {
                    jVar = sVar.b();
                    bool = Boolean.FALSE;
                } else {
                    boolean N = this.f2426l.get(a2).q(false);
                    jVar = sVar.b();
                    bool = Boolean.valueOf(N);
                }
                jVar.c(bool);
                break;
            case 15:
                b0 b0Var = (b0) message.obj;
                if (this.f2426l.containsKey(b0Var.a)) {
                    z.B(this.f2426l.get(b0Var.a), b0Var);
                    break;
                }
                break;
            case 16:
                b0 b0Var2 = (b0) message.obj;
                if (this.f2426l.containsKey(b0Var2.a)) {
                    z.C(this.f2426l.get(b0Var2.a), b0Var2);
                    break;
                }
                break;
            case 17:
                k();
                break;
            case 18:
                i0 i0Var = (i0) message.obj;
                if (i0Var.c != 0) {
                    r rVar = this.f2419e;
                    if (rVar != null) {
                        List<l> c3 = rVar.c();
                        if (rVar.b() != i0Var.b || (c3 != null && c3.size() >= i0Var.f2444d)) {
                            this.f2430p.removeMessages(17);
                            k();
                        } else {
                            this.f2419e.d(i0Var.a);
                        }
                    }
                    if (this.f2419e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(i0Var.a);
                        this.f2419e = new r(i0Var.b, arrayList);
                        Handler handler2 = this.f2430p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), i0Var.c);
                        break;
                    }
                } else {
                    j().a(new r(i0Var.b, Arrays.asList(new l[]{i0Var.a})));
                    break;
                }
                break;
            case 19:
                this.f2418d = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    public final int m() {
        return this.f2424j.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public final z w(b<?> bVar) {
        return this.f2426l.get(bVar);
    }
}
