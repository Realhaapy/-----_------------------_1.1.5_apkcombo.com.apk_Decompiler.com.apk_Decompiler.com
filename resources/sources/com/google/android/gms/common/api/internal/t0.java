package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import f.e.a.c.g.j;

abstract class t0<T> extends g0 {
    protected final j<T> b;

    public t0(int i2, j<T> jVar) {
        super(i2);
        this.b = jVar;
    }

    public final void a(Status status) {
        this.b.d(new b(status));
    }

    public final void b(Exception exc) {
        this.b.d(exc);
    }

    public final void c(z<?> zVar) {
        try {
            h(zVar);
        } catch (DeadObjectException e2) {
            a(y0.e(e2));
            throw e2;
        } catch (RemoteException e3) {
            a(y0.e(e3));
        } catch (RuntimeException e4) {
            this.b.d(e4);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void h(z<?> zVar);
}
