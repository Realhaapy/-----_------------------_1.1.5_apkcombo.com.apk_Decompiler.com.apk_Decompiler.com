package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import m.y.d.l;

public abstract class k0 implements ServiceConnection {
    private final Context a;
    private final Handler b;
    private b c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1455d;

    /* renamed from: e  reason: collision with root package name */
    private Messenger f1456e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1457f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1458g;

    /* renamed from: h  reason: collision with root package name */
    private final String f1459h;

    /* renamed from: i  reason: collision with root package name */
    private final int f1460i;

    /* renamed from: j  reason: collision with root package name */
    private final String f1461j;

    public static final class a extends Handler {
        final /* synthetic */ k0 a;

        a(k0 k0Var) {
            this.a = k0Var;
        }

        public void handleMessage(Message message) {
            if (!com.facebook.internal.s0.n.a.d(this)) {
                try {
                    l.d(message, "message");
                    this.a.d(message);
                } catch (Throwable th) {
                    com.facebook.internal.s0.n.a.b(th, this);
                }
            }
        }
    }

    public interface b {
        void a(Bundle bundle);
    }

    public k0(Context context, int i2, int i3, int i4, String str, String str2) {
        l.d(context, "context");
        l.d(str, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.f1457f = i2;
        this.f1458g = i3;
        this.f1459h = str;
        this.f1460i = i4;
        this.f1461j = str2;
        this.b = new a(this);
    }

    private final void a(Bundle bundle) {
        if (this.f1455d) {
            this.f1455d = false;
            b bVar = this.c;
            if (bVar != null) {
                bVar.a(bundle);
            }
        }
    }

    private final void f() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f1459h);
        String str = this.f1461j;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        e(bundle);
        Message obtain = Message.obtain((Handler) null, this.f1457f);
        obtain.arg1 = this.f1460i;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.b);
        try {
            Messenger messenger = this.f1456e;
            if (messenger != null) {
                messenger.send(obtain);
            }
        } catch (RemoteException unused) {
            a((Bundle) null);
        }
    }

    public final void b() {
        this.f1455d = false;
    }

    /* access modifiers changed from: protected */
    public final Context c() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final void d(Message message) {
        l.d(message, "message");
        if (message.what == this.f1458g) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                data = null;
            }
            a(data);
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void e(Bundle bundle);

    public final void g(b bVar) {
        this.c = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f1455d     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            com.facebook.internal.j0 r0 = com.facebook.internal.j0.a     // Catch:{ all -> 0x002d }
            int r0 = r3.f1460i     // Catch:{ all -> 0x002d }
            int r0 = com.facebook.internal.j0.r(r0)     // Catch:{ all -> 0x002d }
            r2 = -1
            if (r0 != r2) goto L_0x0015
            monitor-exit(r3)
            return r1
        L_0x0015:
            android.content.Context r0 = r3.c()     // Catch:{ all -> 0x002d }
            android.content.Intent r0 = com.facebook.internal.j0.k(r0)     // Catch:{ all -> 0x002d }
            r2 = 1
            if (r0 != 0) goto L_0x0021
            goto L_0x002b
        L_0x0021:
            r3.f1455d = r2     // Catch:{ all -> 0x002d }
            android.content.Context r1 = r3.c()     // Catch:{ all -> 0x002d }
            r1.bindService(r0, r3, r2)     // Catch:{ all -> 0x002d }
            r1 = 1
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.k0.h():boolean");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        l.d(componentName, "name");
        l.d(iBinder, "service");
        this.f1456e = new Messenger(iBinder);
        f();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        l.d(componentName, "name");
        this.f1456e = null;
        try {
            this.a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a((Bundle) null);
    }
}
