package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class c<T extends IInterface> {
    private static final com.google.android.gms.common.c[] w = new com.google.android.gms.common.c[0];
    private volatile String a = null;
    k1 b;
    private final Context c;

    /* renamed from: d  reason: collision with root package name */
    private final h f2497d;

    /* renamed from: e  reason: collision with root package name */
    final Handler f2498e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f2499f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Object f2500g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public k f2501h;

    /* renamed from: i  reason: collision with root package name */
    protected C0042c f2502i;

    /* renamed from: j  reason: collision with root package name */
    private T f2503j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<u0<?>> f2504k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    private w0 f2505l;

    /* renamed from: m  reason: collision with root package name */
    private int f2506m = 1;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final a f2507n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final b f2508o;

    /* renamed from: p  reason: collision with root package name */
    private final int f2509p;

    /* renamed from: q  reason: collision with root package name */
    private final String f2510q;

    /* renamed from: r  reason: collision with root package name */
    private volatile String f2511r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public com.google.android.gms.common.a f2512s = null;
    /* access modifiers changed from: private */
    public boolean t = false;
    private volatile z0 u = null;
    protected AtomicInteger v = new AtomicInteger(0);

    public interface a {
        void a(int i2);

        void c(Bundle bundle);
    }

    public interface b {
        void b(com.google.android.gms.common.a aVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c  reason: collision with other inner class name */
    public interface C0042c {
        void a(com.google.android.gms.common.a aVar);
    }

    protected class d implements C0042c {
        public d() {
        }

        public final void a(com.google.android.gms.common.a aVar) {
            if (aVar.f()) {
                c cVar = c.this;
                cVar.d((i) null, cVar.B());
            } else if (c.this.f2508o != null) {
                c.this.f2508o.b(aVar);
            }
        }
    }

    public interface e {
        void a();
    }

    protected c(Context context, Looper looper, h hVar, com.google.android.gms.common.e eVar, int i2, a aVar, b bVar, String str) {
        n.i(context, "Context must not be null");
        this.c = context;
        n.i(looper, "Looper must not be null");
        n.i(hVar, "Supervisor must not be null");
        this.f2497d = hVar;
        n.i(eVar, "API availability must not be null");
        this.f2498e = new t0(this, looper);
        this.f2509p = i2;
        this.f2507n = aVar;
        this.f2508o = bVar;
        this.f2510q = str;
    }

    static /* bridge */ /* synthetic */ void a0(c cVar, z0 z0Var) {
        cVar.u = z0Var;
        if (cVar.Q()) {
            e eVar = z0Var.f2600h;
            o.b().c(eVar == null ? null : eVar.g());
        }
    }

    static /* bridge */ /* synthetic */ void b0(c cVar, int i2) {
        int i3;
        int i4;
        synchronized (cVar.f2499f) {
            i3 = cVar.f2506m;
        }
        if (i3 == 3) {
            cVar.t = true;
            i4 = 5;
        } else {
            i4 = 4;
        }
        Handler handler = cVar.f2498e;
        handler.sendMessage(handler.obtainMessage(i4, cVar.v.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean e0(c cVar, int i2, int i3, IInterface iInterface) {
        synchronized (cVar.f2499f) {
            if (cVar.f2506m != i2) {
                return false;
            }
            cVar.g0(i3, iInterface);
            return true;
        }
    }

    static /* bridge */ /* synthetic */ boolean f0(c cVar) {
        if (cVar.t || TextUtils.isEmpty(cVar.D()) || TextUtils.isEmpty(cVar.A())) {
            return false;
        }
        try {
            Class.forName(cVar.D());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public final void g0(int i2, T t2) {
        k1 k1Var;
        boolean z = false;
        if ((i2 == 4) == (t2 != null)) {
            z = true;
        }
        n.a(z);
        synchronized (this.f2499f) {
            this.f2506m = i2;
            this.f2503j = t2;
            if (i2 == 1) {
                w0 w0Var = this.f2505l;
                if (w0Var != null) {
                    h hVar = this.f2497d;
                    String c2 = this.b.c();
                    n.h(c2);
                    hVar.e(c2, this.b.b(), this.b.a(), w0Var, V(), this.b.d());
                    this.f2505l = null;
                }
            } else if (i2 == 2 || i2 == 3) {
                w0 w0Var2 = this.f2505l;
                if (!(w0Var2 == null || (k1Var = this.b) == null)) {
                    String c3 = k1Var.c();
                    String b2 = k1Var.b();
                    StringBuilder sb = new StringBuilder(String.valueOf(c3).length() + 70 + String.valueOf(b2).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(c3);
                    sb.append(" on ");
                    sb.append(b2);
                    Log.e("GmsClient", sb.toString());
                    h hVar2 = this.f2497d;
                    String c4 = this.b.c();
                    n.h(c4);
                    hVar2.e(c4, this.b.b(), this.b.a(), w0Var2, V(), this.b.d());
                    this.v.incrementAndGet();
                }
                w0 w0Var3 = new w0(this, this.v.get());
                this.f2505l = w0Var3;
                k1 k1Var2 = (this.f2506m != 3 || A() == null) ? new k1(F(), E(), false, h.a(), H()) : new k1(x().getPackageName(), A(), true, h.a(), false);
                this.b = k1Var2;
                if (!k1Var2.d() || h() >= 17895000) {
                    h hVar3 = this.f2497d;
                    String c5 = this.b.c();
                    n.h(c5);
                    if (!hVar3.f(new d1(c5, this.b.b(), this.b.a(), this.b.d()), w0Var3, V(), v())) {
                        String c6 = this.b.c();
                        String b3 = this.b.b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(c6).length() + 34 + String.valueOf(b3).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(c6);
                        sb2.append(" on ");
                        sb2.append(b3);
                        Log.w("GmsClient", sb2.toString());
                        c0(16, (Bundle) null, this.v.get());
                    }
                } else {
                    String valueOf = String.valueOf(this.b.c());
                    throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
            } else if (i2 == 4) {
                n.h(t2);
                J(t2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public String A() {
        return null;
    }

    /* access modifiers changed from: protected */
    public Set<Scope> B() {
        return Collections.emptySet();
    }

    public final T C() {
        T t2;
        synchronized (this.f2499f) {
            if (this.f2506m != 5) {
                q();
                t2 = this.f2503j;
                n.i(t2, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t2;
    }

    /* access modifiers changed from: protected */
    public abstract String D();

    /* access modifiers changed from: protected */
    public abstract String E();

    /* access modifiers changed from: protected */
    public String F() {
        return "com.google.android.gms";
    }

    public e G() {
        z0 z0Var = this.u;
        if (z0Var == null) {
            return null;
        }
        return z0Var.f2600h;
    }

    /* access modifiers changed from: protected */
    public boolean H() {
        return h() >= 211700000;
    }

    public boolean I() {
        return this.u != null;
    }

    /* access modifiers changed from: protected */
    public void J(T t2) {
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void K(com.google.android.gms.common.a aVar) {
        aVar.b();
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void L(int i2) {
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void M(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.f2498e;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new x0(this, i2, iBinder, bundle)));
    }

    public boolean N() {
        return false;
    }

    public void O(String str) {
        this.f2511r = str;
    }

    public void P(int i2) {
        Handler handler = this.f2498e;
        handler.sendMessage(handler.obtainMessage(6, this.v.get(), i2));
    }

    public boolean Q() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final String V() {
        String str = this.f2510q;
        return str == null ? this.c.getClass().getName() : str;
    }

    public void a(e eVar) {
        eVar.a();
    }

    public boolean b() {
        boolean z;
        synchronized (this.f2499f) {
            z = this.f2506m == 4;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public final void c0(int i2, Bundle bundle, int i3) {
        Handler handler = this.f2498e;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new y0(this, i2, (Bundle) null)));
    }

    public void d(i iVar, Set<Scope> set) {
        Bundle z = z();
        f fVar = new f(this.f2509p, this.f2511r);
        fVar.f2541h = this.c.getPackageName();
        fVar.f2544k = z;
        if (set != null) {
            fVar.f2543j = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (o()) {
            Account t2 = t();
            if (t2 == null) {
                t2 = new Account("<<default account>>", "com.google");
            }
            fVar.f2545l = t2;
            if (iVar != null) {
                fVar.f2542i = iVar.asBinder();
            }
        } else if (N()) {
            fVar.f2545l = t();
        }
        fVar.f2546m = w;
        fVar.f2547n = u();
        if (Q()) {
            fVar.f2550q = true;
        }
        try {
            synchronized (this.f2500g) {
                k kVar = this.f2501h;
                if (kVar != null) {
                    kVar.z(new v0(this, this.v.get()), fVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            P(3);
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException | RuntimeException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            M(8, (IBinder) null, (Bundle) null, this.v.get());
        }
    }

    public void e(String str) {
        this.a = str;
        n();
    }

    public boolean f() {
        return true;
    }

    public int h() {
        return com.google.android.gms.common.e.a;
    }

    public boolean i() {
        boolean z;
        synchronized (this.f2499f) {
            int i2 = this.f2506m;
            z = true;
            if (i2 != 2) {
                if (i2 != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    public final com.google.android.gms.common.c[] j() {
        z0 z0Var = this.u;
        if (z0Var == null) {
            return null;
        }
        return z0Var.f2598f;
    }

    public String k() {
        k1 k1Var;
        if (b() && (k1Var = this.b) != null) {
            return k1Var.b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public String l() {
        return this.a;
    }

    public void m(C0042c cVar) {
        n.i(cVar, "Connection progress callbacks cannot be null.");
        this.f2502i = cVar;
        g0(2, (IInterface) null);
    }

    public void n() {
        this.v.incrementAndGet();
        synchronized (this.f2504k) {
            int size = this.f2504k.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f2504k.get(i2).d();
            }
            this.f2504k.clear();
        }
        synchronized (this.f2500g) {
            this.f2501h = null;
        }
        g0(1, (IInterface) null);
    }

    public boolean o() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void q() {
        if (!b()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    public abstract T r(IBinder iBinder);

    /* access modifiers changed from: protected */
    public boolean s() {
        return false;
    }

    public Account t() {
        return null;
    }

    public com.google.android.gms.common.c[] u() {
        return w;
    }

    /* access modifiers changed from: protected */
    public Executor v() {
        return null;
    }

    public Bundle w() {
        return null;
    }

    public final Context x() {
        return this.c;
    }

    public int y() {
        return this.f2509p;
    }

    /* access modifiers changed from: protected */
    public Bundle z() {
        return new Bundle();
    }
}
