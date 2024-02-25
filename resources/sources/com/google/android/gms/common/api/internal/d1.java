package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.a;
import com.google.android.gms.common.d;
import f.e.a.c.d.a.f;
import java.util.concurrent.atomic.AtomicReference;

public abstract class d1 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: f  reason: collision with root package name */
    protected volatile boolean f2412f;

    /* renamed from: g  reason: collision with root package name */
    protected final AtomicReference<a1> f2413g = new AtomicReference<>((Object) null);

    /* renamed from: h  reason: collision with root package name */
    private final Handler f2414h = new f(Looper.getMainLooper());

    /* renamed from: i  reason: collision with root package name */
    protected final d f2415i;

    d1(g gVar, d dVar) {
        super(gVar);
        this.f2415i = dVar;
    }

    /* access modifiers changed from: private */
    public final void l(a aVar, int i2) {
        this.f2413g.set((Object) null);
        m(aVar, i2);
    }

    /* access modifiers changed from: private */
    public final void o() {
        this.f2413g.set((Object) null);
        n();
    }

    private static final int p(a1 a1Var) {
        if (a1Var == null) {
            return -1;
        }
        return a1Var.a();
    }

    public final void e(int i2, int i3, Intent intent) {
        a1 a1Var = this.f2413g.get();
        if (i2 != 1) {
            if (i2 == 2) {
                int e2 = this.f2415i.e(b());
                if (e2 == 0) {
                    o();
                    return;
                } else if (a1Var != null) {
                    if (a1Var.b().b() == 18 && e2 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i3 == -1) {
            o();
            return;
        } else if (i3 == 0) {
            if (a1Var != null) {
                int i4 = 13;
                if (intent != null) {
                    i4 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                l(new a(i4, (PendingIntent) null, a1Var.b().toString()), p(a1Var));
                return;
            }
            return;
        }
        if (a1Var != null) {
            l(a1Var.b(), a1Var.a());
        }
    }

    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f2413g.set(bundle.getBoolean("resolving_error", false) ? new a1(new a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void i(Bundle bundle) {
        super.i(bundle);
        a1 a1Var = this.f2413g.get();
        if (a1Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", a1Var.a());
            bundle.putInt("failed_status", a1Var.b().b());
            bundle.putParcelable("failed_resolution", a1Var.b().d());
        }
    }

    public void j() {
        super.j();
        this.f2412f = true;
    }

    public void k() {
        super.k();
        this.f2412f = false;
    }

    /* access modifiers changed from: protected */
    public abstract void m(a aVar, int i2);

    /* access modifiers changed from: protected */
    public abstract void n();

    public final void onCancel(DialogInterface dialogInterface) {
        l(new a(13, (PendingIntent) null), p(this.f2413g.get()));
    }

    public final void s(a aVar, int i2) {
        a1 a1Var = new a1(aVar, i2);
        if (this.f2413g.compareAndSet((Object) null, a1Var)) {
            this.f2414h.post(new c1(this, a1Var));
        }
    }
}
