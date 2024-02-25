package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.c;
import f.e.a.c.g.j;

public final class w0<ResultT> extends g0 {
    private final n<a.b, ResultT> b;
    private final j<ResultT> c;

    /* renamed from: d  reason: collision with root package name */
    private final m f2475d;

    public w0(int i2, n<a.b, ResultT> nVar, j<ResultT> jVar, m mVar) {
        super(i2);
        this.c = jVar;
        this.b = nVar;
        this.f2475d = mVar;
        if (i2 == 2 && nVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        this.c.d(this.f2475d.a(status));
    }

    public final void b(Exception exc) {
        this.c.d(exc);
    }

    public final void c(z<?> zVar) {
        try {
            this.b.b(zVar.v(), this.c);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            a(y0.e(e3));
        } catch (RuntimeException e4) {
            this.c.d(e4);
        }
    }

    public final void d(q qVar, boolean z) {
        qVar.b(this.c, z);
    }

    public final boolean f(z<?> zVar) {
        return this.b.c();
    }

    public final c[] g(z<?> zVar) {
        return this.b.e();
    }
}
