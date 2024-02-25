package f.e.a.c.b;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.n.a;
import f.e.a.c.d.b.e;
import f.e.a.c.g.i;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class x {

    /* renamed from: e  reason: collision with root package name */
    private static x f3871e;
    /* access modifiers changed from: private */
    public final Context a;
    /* access modifiers changed from: private */
    public final ScheduledExecutorService b;
    private r c = new r(this, (q) null);

    /* renamed from: d  reason: collision with root package name */
    private int f3872d = 1;

    x(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized x b(Context context) {
        x xVar;
        synchronized (x.class) {
            if (f3871e == null) {
                e.a();
                f3871e = new x(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new a("MessengerIpcClient"))));
            }
            xVar = f3871e;
        }
        return xVar;
    }

    private final synchronized int f() {
        int i2;
        i2 = this.f3872d;
        this.f3872d = i2 + 1;
        return i2;
    }

    private final synchronized <T> i<T> g(u<T> uVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(uVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.c.g(uVar)) {
            r rVar = new r(this, (q) null);
            this.c = rVar;
            rVar.g(uVar);
        }
        return uVar.b.a();
    }

    public final i<Void> c(int i2, Bundle bundle) {
        return g(new t(f(), 2, bundle));
    }

    public final i<Bundle> d(int i2, Bundle bundle) {
        return g(new w(f(), 1, bundle));
    }
}
