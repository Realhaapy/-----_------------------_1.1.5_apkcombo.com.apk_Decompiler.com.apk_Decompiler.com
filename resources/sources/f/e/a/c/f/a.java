package f.e.a.c.f;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.f;
import com.google.android.gms.common.util.l;
import com.google.android.gms.common.util.m;
import f.e.a.c.d.e.b;
import f.e.a.c.d.e.c;
import f.e.a.c.d.e.h;
import f.e.a.c.d.e.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class a {

    /* renamed from: p  reason: collision with root package name */
    private static final long f3935p = TimeUnit.DAYS.toMillis(366);

    /* renamed from: q  reason: collision with root package name */
    private static volatile ScheduledExecutorService f3936q = null;

    /* renamed from: r  reason: collision with root package name */
    private static final Object f3937r = new Object();

    /* renamed from: s  reason: collision with root package name */
    private static volatile e f3938s = new c();
    private final Object a = new Object();
    private final PowerManager.WakeLock b;
    private int c = 0;

    /* renamed from: d  reason: collision with root package name */
    private Future<?> f3939d;

    /* renamed from: e  reason: collision with root package name */
    private long f3940e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<f> f3941f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private boolean f3942g = true;

    /* renamed from: h  reason: collision with root package name */
    private int f3943h;

    /* renamed from: i  reason: collision with root package name */
    b f3944i;

    /* renamed from: j  reason: collision with root package name */
    private e f3945j = f.c();

    /* renamed from: k  reason: collision with root package name */
    private WorkSource f3946k;

    /* renamed from: l  reason: collision with root package name */
    private final String f3947l;

    /* renamed from: m  reason: collision with root package name */
    private final Map<String, d> f3948m = new HashMap();

    /* renamed from: n  reason: collision with root package name */
    private AtomicInteger f3949n = new AtomicInteger(0);

    /* renamed from: o  reason: collision with root package name */
    private final ScheduledExecutorService f3950o;

    public a(Context context, int i2, String str) {
        String packageName = context.getPackageName();
        n.i(context, "WakeLock: context must not be null");
        n.e(str, "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        this.f3944i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.f3947l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        } else {
            this.f3947l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("expected a non-null reference", 0, 29);
            throw new i(sb.toString());
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i2, str);
        this.b = newWakeLock;
        if (m.c(context)) {
            WorkSource b2 = m.b(context, l.a(packageName) ? context.getPackageName() : packageName);
            this.f3946k = b2;
            if (b2 != null) {
                i(newWakeLock, b2);
            }
        }
        ScheduledExecutorService scheduledExecutorService = f3936q;
        if (scheduledExecutorService == null) {
            synchronized (f3937r) {
                scheduledExecutorService = f3936q;
                if (scheduledExecutorService == null) {
                    h.a();
                    scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    f3936q = scheduledExecutorService;
                }
            }
        }
        this.f3950o = scheduledExecutorService;
    }

    public static /* synthetic */ void e(a aVar) {
        synchronized (aVar.a) {
            if (aVar.b()) {
                Log.e("WakeLock", String.valueOf(aVar.f3947l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.g();
                if (aVar.b()) {
                    aVar.c = 1;
                    aVar.h(0);
                }
            }
        }
    }

    private final String f(String str) {
        if (!this.f3942g || !TextUtils.isEmpty((CharSequence) null)) {
        }
        return null;
    }

    private final void g() {
        if (!this.f3941f.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f3941f);
            this.f3941f.clear();
            if (arrayList.size() > 0) {
                f fVar = (f) arrayList.get(0);
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        if (r5.f3944i != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        r5.f3944i = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0084, code lost:
        if (r5.f3944i != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void h(int r6) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.a
            monitor-enter(r6)
            boolean r0 = r5.b()     // Catch:{ all -> 0x00a2 }
            if (r0 != 0) goto L_0x000b
            monitor-exit(r6)     // Catch:{ all -> 0x00a2 }
            return
        L_0x000b:
            boolean r0 = r5.f3942g     // Catch:{ all -> 0x00a2 }
            r1 = 0
            if (r0 == 0) goto L_0x001b
            int r0 = r5.c     // Catch:{ all -> 0x00a2 }
            int r0 = r0 + -1
            r5.c = r0     // Catch:{ all -> 0x00a2 }
            if (r0 > 0) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            monitor-exit(r6)     // Catch:{ all -> 0x00a2 }
            return
        L_0x001b:
            r5.c = r1     // Catch:{ all -> 0x00a2 }
        L_0x001d:
            r5.g()     // Catch:{ all -> 0x00a2 }
            java.util.Map<java.lang.String, f.e.a.c.f.d> r0 = r5.f3948m     // Catch:{ all -> 0x00a2 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00a2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00a2 }
        L_0x002a:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x00a2 }
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x00a2 }
            f.e.a.c.f.d r2 = (f.e.a.c.f.d) r2     // Catch:{ all -> 0x00a2 }
            r2.a = r1     // Catch:{ all -> 0x00a2 }
            goto L_0x002a
        L_0x0039:
            java.util.Map<java.lang.String, f.e.a.c.f.d> r0 = r5.f3948m     // Catch:{ all -> 0x00a2 }
            r0.clear()     // Catch:{ all -> 0x00a2 }
            java.util.concurrent.Future<?> r0 = r5.f3939d     // Catch:{ all -> 0x00a2 }
            r2 = 0
            if (r0 == 0) goto L_0x004c
            r0.cancel(r1)     // Catch:{ all -> 0x00a2 }
            r5.f3939d = r2     // Catch:{ all -> 0x00a2 }
            r3 = 0
            r5.f3940e = r3     // Catch:{ all -> 0x00a2 }
        L_0x004c:
            r5.f3943h = r1     // Catch:{ all -> 0x00a2 }
            android.os.PowerManager$WakeLock r0 = r5.b     // Catch:{ all -> 0x00a2 }
            boolean r0 = r0.isHeld()     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x008f
            android.os.PowerManager$WakeLock r0 = r5.b     // Catch:{ RuntimeException -> 0x0064 }
            r0.release()     // Catch:{ RuntimeException -> 0x0064 }
            f.e.a.c.d.e.b r0 = r5.f3944i     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x00a0
        L_0x005f:
            r5.f3944i = r2     // Catch:{ all -> 0x00a2 }
            goto L_0x00a0
        L_0x0062:
            r0 = move-exception
            goto L_0x0088
        L_0x0064:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()     // Catch:{ all -> 0x0062 }
            java.lang.Class<java.lang.RuntimeException> r3 = java.lang.RuntimeException.class
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0087
            java.lang.String r1 = "WakeLock"
            java.lang.String r3 = r5.f3947l     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = " failed to release!"
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x0062 }
            android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x0062 }
            f.e.a.c.d.e.b r0 = r5.f3944i     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x00a0
            goto L_0x005f
        L_0x0087:
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x0088:
            f.e.a.c.d.e.b r1 = r5.f3944i     // Catch:{ all -> 0x00a2 }
            if (r1 == 0) goto L_0x008e
            r5.f3944i = r2     // Catch:{ all -> 0x00a2 }
        L_0x008e:
            throw r0     // Catch:{ all -> 0x00a2 }
        L_0x008f:
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r5.f3947l     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00a2 }
            java.lang.String r2 = " should be held!"
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x00a2 }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x00a2 }
        L_0x00a0:
            monitor-exit(r6)     // Catch:{ all -> 0x00a2 }
            return
        L_0x00a2:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00a2 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a.c.f.a.h(int):void");
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
            Log.wtf("WakeLock", e2.toString());
        }
    }

    public void a(long j2) {
        this.f3949n.incrementAndGet();
        long j3 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f3935p), 1);
        if (j2 > 0) {
            max = Math.min(j2, max);
        }
        synchronized (this.a) {
            if (!b()) {
                this.f3944i = b.a(false, (c) null);
                this.b.acquire();
                this.f3945j.b();
            }
            this.c++;
            this.f3943h++;
            f((String) null);
            d dVar = this.f3948m.get((Object) null);
            if (dVar == null) {
                dVar = new d((c) null);
                this.f3948m.put((Object) null, dVar);
            }
            dVar.a++;
            long b2 = this.f3945j.b();
            if (Long.MAX_VALUE - b2 > max) {
                j3 = b2 + max;
            }
            if (j3 > this.f3940e) {
                this.f3940e = j3;
                Future<?> future = this.f3939d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f3939d = this.f3950o.schedule(new b(this), max, TimeUnit.MILLISECONDS);
            }
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.c > 0;
        }
        return z;
    }

    public void c() {
        if (this.f3949n.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f3947l).concat(" release without a matched acquire!"));
        }
        synchronized (this.a) {
            f((String) null);
            if (this.f3948m.containsKey((Object) null)) {
                d dVar = this.f3948m.get((Object) null);
                if (dVar != null) {
                    int i2 = dVar.a - 1;
                    dVar.a = i2;
                    if (i2 == 0) {
                        this.f3948m.remove((Object) null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f3947l).concat(" counter does not exist"));
            }
            h(0);
        }
    }

    public void d(boolean z) {
        synchronized (this.a) {
            this.f3942g = z;
        }
    }
}
