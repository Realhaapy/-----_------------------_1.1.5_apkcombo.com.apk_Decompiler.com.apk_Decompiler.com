package f.e.a.c.b;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ r f3861e;

    public /* synthetic */ m(r rVar) {
        this.f3861e = rVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r3 = java.lang.String.valueOf(r1);
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r3).length() + 8);
        r5.append("Sending ");
        r5.append(r3);
        android.util.Log.d("MessengerIpcClient", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        r3 = r0.f3869f.a;
        r4 = r0.b;
        r5 = android.os.Message.obtain();
        r5.what = r1.c;
        r5.arg1 = r1.a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.b());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.f3870d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0.c.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a5, code lost:
        r0.a(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            f.e.a.c.b.r r0 = r8.f3861e
        L_0x0002:
            monitor-enter(r0)
            int r1 = r0.a     // Catch:{ all -> 0x00ae }
            r2 = 2
            if (r1 == r2) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x000a:
            java.util.Queue<f.e.a.c.b.u<?>> r1 = r0.f3867d     // Catch:{ all -> 0x00ae }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00ae }
            if (r1 == 0) goto L_0x0017
            r0.f()     // Catch:{ all -> 0x00ae }
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x0017:
            java.util.Queue<f.e.a.c.b.u<?>> r1 = r0.f3867d     // Catch:{ all -> 0x00ae }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00ae }
            f.e.a.c.b.u r1 = (f.e.a.c.b.u) r1     // Catch:{ all -> 0x00ae }
            android.util.SparseArray<f.e.a.c.b.u<?>> r3 = r0.f3868e     // Catch:{ all -> 0x00ae }
            int r4 = r1.a     // Catch:{ all -> 0x00ae }
            r3.put(r4, r1)     // Catch:{ all -> 0x00ae }
            f.e.a.c.b.x r3 = r0.f3869f     // Catch:{ all -> 0x00ae }
            java.util.concurrent.ScheduledExecutorService r3 = r3.b     // Catch:{ all -> 0x00ae }
            f.e.a.c.b.p r4 = new f.e.a.c.b.p     // Catch:{ all -> 0x00ae }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x00ae }
            r5 = 30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00ae }
            r3.schedule(r4, r5, r7)     // Catch:{ all -> 0x00ae }
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x0066
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 8
            r5.<init>(r4)
            java.lang.String r4 = "Sending "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "MessengerIpcClient"
            java.lang.String r4 = r5.toString()
            android.util.Log.d(r3, r4)
        L_0x0066:
            f.e.a.c.b.x r3 = r0.f3869f
            android.content.Context r3 = r3.a
            android.os.Messenger r4 = r0.b
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.c
            r5.what = r6
            int r6 = r1.a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "oneWay"
            boolean r7 = r1.b()
            r4.putBoolean(r6, r7)
            java.lang.String r6 = "pkg"
            java.lang.String r3 = r3.getPackageName()
            r4.putString(r6, r3)
            java.lang.String r3 = "data"
            android.os.Bundle r1 = r1.f3870d
            r4.putBundle(r3, r1)
            r5.setData(r4)
            f.e.a.c.b.s r1 = r0.c     // Catch:{ RemoteException -> 0x00a4 }
            r1.a(r5)     // Catch:{ RemoteException -> 0x00a4 }
            goto L_0x0002
        L_0x00a4:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.a(r2, r1)
            goto L_0x0002
        L_0x00ae:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a.c.b.m.run():void");
    }
}
