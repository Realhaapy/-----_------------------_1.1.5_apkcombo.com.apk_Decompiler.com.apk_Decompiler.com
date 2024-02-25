package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.util.b;
import f.e.a.c.g.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public final class z<O extends a.d> implements f, g {
    private final Queue<y0> a = new LinkedList();
    /* access modifiers changed from: private */
    @NotOnlyInitialized
    public final a.f b;
    /* access modifiers changed from: private */
    public final b<O> c;

    /* renamed from: d  reason: collision with root package name */
    private final q f2477d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<z0> f2478e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Map<h<?>, m0> f2479f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final int f2480g;

    /* renamed from: h  reason: collision with root package name */
    private final q0 f2481h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2482i;

    /* renamed from: j  reason: collision with root package name */
    private final List<b0> f2483j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private com.google.android.gms.common.a f2484k = null;

    /* renamed from: l  reason: collision with root package name */
    private int f2485l = 0;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ e f2486m;

    public z(e eVar, e<O> eVar2) {
        this.f2486m = eVar;
        a.f g2 = eVar2.g(eVar.f2430p.getLooper(), this);
        this.b = g2;
        this.c = eVar2.d();
        this.f2477d = new q();
        this.f2480g = eVar2.f();
        if (g2.o()) {
            this.f2481h = eVar2.h(eVar.f2421g, eVar.f2430p);
        } else {
            this.f2481h = null;
        }
    }

    static /* bridge */ /* synthetic */ void B(z zVar, b0 b0Var) {
        if (!zVar.f2483j.contains(b0Var) || zVar.f2482i) {
            return;
        }
        if (!zVar.b.b()) {
            zVar.E();
        } else {
            zVar.i();
        }
    }

    static /* bridge */ /* synthetic */ void C(z zVar, b0 b0Var) {
        c[] g2;
        if (zVar.f2483j.remove(b0Var)) {
            zVar.f2486m.f2430p.removeMessages(15, b0Var);
            zVar.f2486m.f2430p.removeMessages(16, b0Var);
            c a2 = b0Var.b;
            ArrayList arrayList = new ArrayList(zVar.a.size());
            for (y0 y0Var : zVar.a) {
                if ((y0Var instanceof g0) && (g2 = ((g0) y0Var).g(zVar)) != null && b.b(g2, a2)) {
                    arrayList.add(y0Var);
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                y0 y0Var2 = (y0) arrayList.get(i2);
                zVar.a.remove(y0Var2);
                y0Var2.b(new m(a2));
            }
        }
    }

    private final c e(c[] cVarArr) {
        if (!(cVarArr == null || cVarArr.length == 0)) {
            c[] j2 = this.b.j();
            if (j2 == null) {
                j2 = new c[0];
            }
            e.e.a aVar = new e.e.a(r3);
            for (c cVar : j2) {
                aVar.put(cVar.b(), Long.valueOf(cVar.c()));
            }
            for (c cVar2 : cVarArr) {
                Long l2 = (Long) aVar.get(cVar2.b());
                if (l2 == null || l2.longValue() < cVar2.c()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    private final void f(com.google.android.gms.common.a aVar) {
        for (z0 b2 : this.f2478e) {
            b2.b(this.c, aVar, com.google.android.gms.common.internal.m.a(aVar, com.google.android.gms.common.a.f2366i) ? this.b.k() : null);
        }
        this.f2478e.clear();
    }

    /* access modifiers changed from: private */
    public final void g(Status status) {
        n.c(this.f2486m.f2430p);
        h(status, (Exception) null, false);
    }

    private final void h(Status status, Exception exc, boolean z) {
        n.c(this.f2486m.f2430p);
        boolean z2 = false;
        boolean z3 = status == null;
        if (exc == null) {
            z2 = true;
        }
        if (z3 != z2) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                y0 y0Var = (y0) it.next();
                if (!z || y0Var.a == 2) {
                    if (status != null) {
                        y0Var.a(status);
                    } else {
                        y0Var.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void i() {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            y0 y0Var = (y0) arrayList.get(i2);
            if (this.b.b()) {
                if (o(y0Var)) {
                    this.a.remove(y0Var);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void j() {
        D();
        f(com.google.android.gms.common.a.f2366i);
        n();
        Iterator<m0> it = this.f2479f.values().iterator();
        while (it.hasNext()) {
            m0 next = it.next();
            if (e(next.a.b()) == null) {
                try {
                    next.a.c(this.b, new j());
                } catch (DeadObjectException unused) {
                    a(3);
                    this.b.e("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                }
            }
            it.remove();
        }
        i();
        l();
    }

    /* access modifiers changed from: private */
    public final void k(int i2) {
        D();
        this.f2482i = true;
        this.f2477d.c(i2, this.b.l());
        e eVar = this.f2486m;
        eVar.f2430p.sendMessageDelayed(Message.obtain(eVar.f2430p, 9, this.c), this.f2486m.a);
        e eVar2 = this.f2486m;
        eVar2.f2430p.sendMessageDelayed(Message.obtain(eVar2.f2430p, 11, this.c), this.f2486m.b);
        this.f2486m.f2423i.c();
        for (m0 m0Var : this.f2479f.values()) {
            m0Var.c.run();
        }
    }

    private final void l() {
        this.f2486m.f2430p.removeMessages(12, this.c);
        e eVar = this.f2486m;
        eVar.f2430p.sendMessageDelayed(eVar.f2430p.obtainMessage(12, this.c), this.f2486m.c);
    }

    private final void m(y0 y0Var) {
        y0Var.d(this.f2477d, P());
        try {
            y0Var.c(this);
        } catch (DeadObjectException unused) {
            a(1);
            this.b.e("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void n() {
        if (this.f2482i) {
            this.f2486m.f2430p.removeMessages(11, this.c);
            this.f2486m.f2430p.removeMessages(9, this.c);
            this.f2482i = false;
        }
    }

    private final boolean o(y0 y0Var) {
        if (!(y0Var instanceof g0)) {
            m(y0Var);
            return true;
        }
        g0 g0Var = (g0) y0Var;
        c e2 = e(g0Var.g(this));
        if (e2 == null) {
            m(y0Var);
            return true;
        }
        String name = this.b.getClass().getName();
        String b2 = e2.b();
        long c2 = e2.c();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(b2).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(b2);
        sb.append(", ");
        sb.append(c2);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f2486m.f2431q || !g0Var.f(this)) {
            g0Var.b(new m(e2));
            return true;
        }
        b0 b0Var = new b0(this.c, e2, (a0) null);
        int indexOf = this.f2483j.indexOf(b0Var);
        if (indexOf >= 0) {
            b0 b0Var2 = this.f2483j.get(indexOf);
            this.f2486m.f2430p.removeMessages(15, b0Var2);
            e eVar = this.f2486m;
            eVar.f2430p.sendMessageDelayed(Message.obtain(eVar.f2430p, 15, b0Var2), this.f2486m.a);
            return false;
        }
        this.f2483j.add(b0Var);
        e eVar2 = this.f2486m;
        eVar2.f2430p.sendMessageDelayed(Message.obtain(eVar2.f2430p, 15, b0Var), this.f2486m.a);
        e eVar3 = this.f2486m;
        eVar3.f2430p.sendMessageDelayed(Message.obtain(eVar3.f2430p, 16, b0Var), this.f2486m.b);
        com.google.android.gms.common.a aVar = new com.google.android.gms.common.a(2, (PendingIntent) null);
        if (p(aVar)) {
            return false;
        }
        this.f2486m.g(aVar, this.f2480g);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean p(com.google.android.gms.common.a r4) {
        /*
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.e.t
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.e r1 = r3.f2486m     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.r r2 = r1.f2427m     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0027
            java.util.Set r1 = r1.f2428n     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.b<O> r2 = r3.c     // Catch:{ all -> 0x002a }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.common.api.internal.e r1 = r3.f2486m     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.r r1 = r1.f2427m     // Catch:{ all -> 0x002a }
            int r2 = r3.f2480g     // Catch:{ all -> 0x002a }
            r1.s(r4, r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 1
            return r4
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 0
            return r4
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.z.p(com.google.android.gms.common.a):boolean");
    }

    /* access modifiers changed from: private */
    public final boolean q(boolean z) {
        n.c(this.f2486m.f2430p);
        if (!this.b.b() || this.f2479f.size() != 0) {
            return false;
        }
        if (this.f2477d.e()) {
            if (z) {
                l();
            }
            return false;
        }
        this.b.e("Timing out service connection.");
        return true;
    }

    public final void D() {
        n.c(this.f2486m.f2430p);
        this.f2484k = null;
    }

    public final void E() {
        com.google.android.gms.common.a aVar;
        n.c(this.f2486m.f2430p);
        if (!this.b.b() && !this.b.i()) {
            try {
                e eVar = this.f2486m;
                int b2 = eVar.f2423i.b(eVar.f2421g, this.b);
                if (b2 != 0) {
                    com.google.android.gms.common.a aVar2 = new com.google.android.gms.common.a(b2, (PendingIntent) null);
                    String name = this.b.getClass().getName();
                    String obj = aVar2.toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 35 + obj.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(obj);
                    Log.w("GoogleApiManager", sb.toString());
                    H(aVar2, (Exception) null);
                    return;
                }
                e eVar2 = this.f2486m;
                a.f fVar = this.b;
                d0 d0Var = new d0(eVar2, fVar, this.c);
                if (fVar.o()) {
                    q0 q0Var = this.f2481h;
                    n.h(q0Var);
                    q0Var.g0(d0Var);
                }
                try {
                    this.b.m(d0Var);
                } catch (SecurityException e2) {
                    e = e2;
                    aVar = new com.google.android.gms.common.a(10);
                    H(aVar, e);
                }
            } catch (IllegalStateException e3) {
                e = e3;
                aVar = new com.google.android.gms.common.a(10);
                H(aVar, e);
            }
        }
    }

    public final void F(y0 y0Var) {
        n.c(this.f2486m.f2430p);
        if (!this.b.b()) {
            this.a.add(y0Var);
            com.google.android.gms.common.a aVar = this.f2484k;
            if (aVar == null || !aVar.e()) {
                E();
            } else {
                H(this.f2484k, (Exception) null);
            }
        } else if (o(y0Var)) {
            l();
        } else {
            this.a.add(y0Var);
        }
    }

    /* access modifiers changed from: package-private */
    public final void G() {
        this.f2485l++;
    }

    public final void H(com.google.android.gms.common.a aVar, Exception exc) {
        n.c(this.f2486m.f2430p);
        q0 q0Var = this.f2481h;
        if (q0Var != null) {
            q0Var.h0();
        }
        D();
        this.f2486m.f2423i.c();
        f(aVar);
        if ((this.b instanceof com.google.android.gms.common.internal.w.e) && aVar.b() != 24) {
            this.f2486m.f2418d = true;
            e eVar = this.f2486m;
            eVar.f2430p.sendMessageDelayed(eVar.f2430p.obtainMessage(19), 300000);
        }
        if (aVar.b() == 4) {
            g(e.f2417s);
        } else if (this.a.isEmpty()) {
            this.f2484k = aVar;
        } else if (exc != null) {
            n.c(this.f2486m.f2430p);
            h((Status) null, exc, false);
        } else if (this.f2486m.f2431q) {
            h(e.h(this.c, aVar), (Exception) null, true);
            if (!this.a.isEmpty() && !p(aVar) && !this.f2486m.g(aVar, this.f2480g)) {
                if (aVar.b() == 18) {
                    this.f2482i = true;
                }
                if (this.f2482i) {
                    e eVar2 = this.f2486m;
                    eVar2.f2430p.sendMessageDelayed(Message.obtain(eVar2.f2430p, 9, this.c), this.f2486m.a);
                    return;
                }
                g(e.h(this.c, aVar));
            }
        } else {
            g(e.h(this.c, aVar));
        }
    }

    public final void I(com.google.android.gms.common.a aVar) {
        n.c(this.f2486m.f2430p);
        a.f fVar = this.b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 25 + String.valueOf(valueOf).length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        fVar.e(sb.toString());
        H(aVar, (Exception) null);
    }

    public final void J(z0 z0Var) {
        n.c(this.f2486m.f2430p);
        this.f2478e.add(z0Var);
    }

    public final void K() {
        n.c(this.f2486m.f2430p);
        if (this.f2482i) {
            E();
        }
    }

    public final void L() {
        n.c(this.f2486m.f2430p);
        g(e.f2416r);
        this.f2477d.d();
        for (h x0Var : (h[]) this.f2479f.keySet().toArray(new h[0])) {
            F(new x0(x0Var, new j()));
        }
        f(new com.google.android.gms.common.a(4));
        if (this.b.b()) {
            this.b.a(new y(this));
        }
    }

    public final void M() {
        n.c(this.f2486m.f2430p);
        if (this.f2482i) {
            n();
            e eVar = this.f2486m;
            g(eVar.f2422h.e(eVar.f2421g) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.b.e("Timing out connection while resuming.");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean O() {
        return this.b.b();
    }

    public final boolean P() {
        return this.b.o();
    }

    public final void a(int i2) {
        if (Looper.myLooper() == this.f2486m.f2430p.getLooper()) {
            k(i2);
        } else {
            this.f2486m.f2430p.post(new w(this, i2));
        }
    }

    public final void b(com.google.android.gms.common.a aVar) {
        H(aVar, (Exception) null);
    }

    public final void c(Bundle bundle) {
        if (Looper.myLooper() == this.f2486m.f2430p.getLooper()) {
            j();
        } else {
            this.f2486m.f2430p.post(new v(this));
        }
    }

    public final boolean d() {
        return q(true);
    }

    public final int r() {
        return this.f2480g;
    }

    /* access modifiers changed from: package-private */
    public final int s() {
        return this.f2485l;
    }

    public final com.google.android.gms.common.a t() {
        n.c(this.f2486m.f2430p);
        return this.f2484k;
    }

    public final a.f v() {
        return this.b;
    }

    public final Map<h<?>, m0> x() {
        return this.f2479f;
    }
}
