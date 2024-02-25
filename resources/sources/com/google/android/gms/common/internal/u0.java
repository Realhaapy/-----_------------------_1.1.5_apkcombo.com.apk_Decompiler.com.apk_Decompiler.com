package com.google.android.gms.common.internal;

import android.util.Log;

public abstract class u0<TListener> {
    private TListener a;
    private boolean b = false;
    final /* synthetic */ c c;

    public u0(c cVar, TListener tlistener) {
        this.c = cVar;
        this.a = tlistener;
    }

    /* access modifiers changed from: protected */
    public abstract void a(TListener tlistener);

    /* access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.a;
            if (this.b) {
                String obj = toString();
                StringBuilder sb = new StringBuilder(obj.length() + 47);
                sb.append("Callback proxy ");
                sb.append(obj);
                sb.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb.toString());
            }
        }
        if (tlistener != null) {
            try {
                a(tlistener);
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        synchronized (this) {
            this.b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.c.f2504k) {
            this.c.f2504k.remove(this);
        }
    }
}
