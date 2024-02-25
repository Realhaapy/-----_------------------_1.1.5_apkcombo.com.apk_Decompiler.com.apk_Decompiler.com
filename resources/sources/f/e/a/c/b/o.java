package f.e.a.c.b;

import android.os.IBinder;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ r f3863e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ IBinder f3864f;

    public /* synthetic */ o(r rVar, IBinder iBinder) {
        this.f3863e = rVar;
        this.f3864f = iBinder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0020, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0021, code lost:
        r0.a(0, r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002b, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x000a, B:9:0x000f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            f.e.a.c.b.r r0 = r4.f3863e
            android.os.IBinder r1 = r4.f3864f
            monitor-enter(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000f
            java.lang.String r1 = "Null service connection"
            r0.a(r2, r1)     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x000f:
            f.e.a.c.b.s r3 = new f.e.a.c.b.s     // Catch:{ RemoteException -> 0x0020 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0020 }
            r0.c = r3     // Catch:{ RemoteException -> 0x0020 }
            r1 = 2
            r0.a = r1     // Catch:{ all -> 0x001e }
            r0.c()     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r1 = move-exception
            goto L_0x002a
        L_0x0020:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x001e }
            r0.a(r2, r1)     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a.c.b.o.run():void");
    }
}
