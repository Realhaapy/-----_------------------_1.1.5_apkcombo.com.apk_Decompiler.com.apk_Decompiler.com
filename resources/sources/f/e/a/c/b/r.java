package f.e.a.c.b;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.k.a;
import f.e.a.c.d.b.f;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

final class r implements ServiceConnection {
    int a = 0;
    final Messenger b = new Messenger(new f(Looper.getMainLooper(), new k(this)));
    s c;

    /* renamed from: d  reason: collision with root package name */
    final Queue<u<?>> f3867d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    final SparseArray<u<?>> f3868e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ x f3869f;

    /* synthetic */ r(x xVar, q qVar) {
        this.f3869f = xVar;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i2, String str) {
        b(i2, str, (Throwable) null);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(int i2, String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i3 = this.a;
        if (i3 == 0) {
            throw new IllegalStateException();
        } else if (i3 == 1 || i3 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            a.b().c(this.f3869f.a, this);
            v vVar = new v(i2, str, th);
            for (u c2 : this.f3867d) {
                c2.c(vVar);
            }
            this.f3867d.clear();
            for (int i4 = 0; i4 < this.f3868e.size(); i4++) {
                this.f3868e.valueAt(i4).c(vVar);
            }
            this.f3868e.clear();
        } else if (i3 == 3) {
            this.a = 4;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f3869f.b.execute(new m(this));
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.a == 1) {
            a(1, "Timed out while binding");
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void e(int i2) {
        u uVar = this.f3868e.get(i2);
        if (uVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i2);
            Log.w("MessengerIpcClient", sb.toString());
            this.f3868e.remove(i2);
            uVar.c(new v(3, "Timed out waiting for response", (Throwable) null));
            f();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void f() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.a     // Catch:{ all -> 0x0039 }
            r1 = 2
            if (r0 != r1) goto L_0x0037
            java.util.Queue<f.e.a.c.b.u<?>> r0 = r2.f3867d     // Catch:{ all -> 0x0039 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0037
            android.util.SparseArray<f.e.a.c.b.u<?>> r0 = r2.f3868e     // Catch:{ all -> 0x0039 }
            int r0 = r0.size()     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r1 = "Finished handling requests, unbinding"
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x0039 }
        L_0x0025:
            r0 = 3
            r2.a = r0     // Catch:{ all -> 0x0039 }
            com.google.android.gms.common.k.a r0 = com.google.android.gms.common.k.a.b()     // Catch:{ all -> 0x0039 }
            f.e.a.c.b.x r1 = r2.f3869f     // Catch:{ all -> 0x0039 }
            android.content.Context r1 = r1.a     // Catch:{ all -> 0x0039 }
            r0.c(r1, r2)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x0037:
            monitor-exit(r2)
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a.c.b.r.f():void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean g(u<?> uVar) {
        int i2 = this.a;
        if (i2 == 0) {
            this.f3867d.add(uVar);
            n.j(this.a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (!a.b().a(this.f3869f.a, intent, this, 1)) {
                    a(0, "Unable to bind to service");
                } else {
                    this.f3869f.b.schedule(new n(this), 30, TimeUnit.SECONDS);
                }
            } catch (SecurityException e2) {
                b(0, "Unable to bind to service", e2);
            }
        } else if (i2 == 1) {
            this.f3867d.add(uVar);
            return true;
        } else if (i2 != 2) {
            return false;
        } else {
            this.f3867d.add(uVar);
            c();
            return true;
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f3869f.b.execute(new o(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f3869f.b.execute(new l(this));
    }
}
