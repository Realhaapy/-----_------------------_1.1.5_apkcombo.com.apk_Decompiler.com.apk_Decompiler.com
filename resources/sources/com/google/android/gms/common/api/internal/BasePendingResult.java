package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.n;
import f.e.a.c.d.a.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends k> extends h<R> {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f2389l = 0;
    private final Object a = new Object();
    protected final a<R> b = new a<>(Looper.getMainLooper());
    private final CountDownLatch c = new CountDownLatch(1);

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<h.a> f2390d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private l<? super R> f2391e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<u0> f2392f = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public R f2393g;

    /* renamed from: h  reason: collision with root package name */
    private Status f2394h;

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f2395i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f2396j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f2397k;
    @KeepName
    private g1 mResultGuardian;

    public static class a<R extends k> extends f {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(l<? super R> lVar, R r2) {
            int i2 = BasePendingResult.f2389l;
            n.h(lVar);
            sendMessage(obtainMessage(1, new Pair(lVar, r2)));
        }

        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                Pair pair = (Pair) message.obj;
                l lVar = (l) pair.first;
                k kVar = (k) pair.second;
                try {
                    lVar.a(kVar);
                } catch (RuntimeException e2) {
                    BasePendingResult.h(kVar);
                    throw e2;
                }
            } else if (i2 != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i2);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).b(Status.f2375k);
            }
        }
    }

    static {
        new e1();
    }

    @Deprecated
    BasePendingResult() {
        new WeakReference((Object) null);
    }

    private final R e() {
        R r2;
        synchronized (this.a) {
            n.k(!this.f2395i, "Result has already been consumed.");
            n.k(c(), "Result is not ready.");
            r2 = this.f2393g;
            this.f2393g = null;
            this.f2391e = null;
            this.f2395i = true;
        }
        u0 andSet = this.f2392f.getAndSet((Object) null);
        if (andSet != null) {
            andSet.a.a.remove(this);
        }
        n.h(r2);
        return (k) r2;
    }

    private final void f(R r2) {
        this.f2393g = r2;
        this.f2394h = r2.a();
        this.c.countDown();
        if (this.f2396j) {
            this.f2391e = null;
        } else {
            l<? super R> lVar = this.f2391e;
            if (lVar != null) {
                this.b.removeMessages(2);
                this.b.a(lVar, e());
            } else if (this.f2393g instanceof i) {
                this.mResultGuardian = new g1(this, (f1) null);
            }
        }
        ArrayList<h.a> arrayList = this.f2390d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).a(this.f2394h);
        }
        this.f2390d.clear();
    }

    public static void h(k kVar) {
        if (kVar instanceof i) {
            try {
                ((i) kVar).release();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(kVar);
                String.valueOf(valueOf).length();
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(valueOf)), e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract R a(Status status);

    @Deprecated
    public final void b(Status status) {
        synchronized (this.a) {
            if (!c()) {
                d(a(status));
                this.f2397k = true;
            }
        }
    }

    public final boolean c() {
        return this.c.getCount() == 0;
    }

    public final void d(R r2) {
        synchronized (this.a) {
            if (this.f2397k || this.f2396j) {
                h(r2);
                return;
            }
            c();
            n.k(!c(), "Results have already been set");
            n.k(!this.f2395i, "Result has already been consumed");
            f(r2);
        }
    }
}
