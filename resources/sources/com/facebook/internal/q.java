package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.g0;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import m.y.d.g;
import m.y.d.l;

public final class q {

    /* renamed from: f  reason: collision with root package name */
    public static final a f1478f = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final String f1479g = "com.facebook.internal.q";

    /* renamed from: h  reason: collision with root package name */
    public static q f1480h;
    /* access modifiers changed from: private */
    public String a;
    /* access modifiers changed from: private */
    public long b;
    /* access modifiers changed from: private */
    public String c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public String f1481d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f1482e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final q a(q qVar) {
            qVar.b = System.currentTimeMillis();
            q.f1480h = qVar;
            return qVar;
        }

        private final q b(Context context) {
            q c = c(context);
            if (c != null) {
                return c;
            }
            q d2 = d(context);
            return d2 == null ? new q() : d2;
        }

        private final q c(Context context) {
            Object M;
            try {
                if (!g(context)) {
                    return null;
                }
                o0 o0Var = o0.a;
                boolean z = false;
                Method F = o0.F("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                if (F == null || (M = o0.M((Object) null, F, context)) == null) {
                    return null;
                }
                Method E = o0.E(M.getClass(), "getId", new Class[0]);
                Method E2 = o0.E(M.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (E != null) {
                    if (E2 != null) {
                        q qVar = new q();
                        qVar.a = (String) o0.M(M, E, new Object[0]);
                        Boolean bool = (Boolean) o0.M(M, E2, new Object[0]);
                        if (bool != null) {
                            z = bool.booleanValue();
                        }
                        qVar.f1482e = z;
                        return qVar;
                    }
                }
                return null;
            } catch (Exception e2) {
                o0 o0Var2 = o0.a;
                o0.d0("android_id", e2);
                return null;
            }
        }

        private final q d(Context context) {
            c cVar = new c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, cVar, 1)) {
                    try {
                        b bVar = new b(cVar.a());
                        q qVar = new q();
                        qVar.a = bVar.a();
                        qVar.f1482e = bVar.b();
                        return qVar;
                    } catch (Exception e2) {
                        o0 o0Var = o0.a;
                        o0.d0("android_id", e2);
                    } finally {
                        context.unbindService(cVar);
                    }
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        private final String f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getInstallerPackageName(context.getPackageName());
        }

        private final boolean g(Context context) {
            o0 o0Var = o0.a;
            Method F = o0.F("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (F == null) {
                return false;
            }
            Object M = o0.M((Object) null, F, context);
            return (M instanceof Integer) && l.a(M, 0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0080 A[Catch:{ Exception -> 0x00f0, all -> 0x00ee }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0085 A[Catch:{ Exception -> 0x00f0, all -> 0x00ee }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0089 A[Catch:{ Exception -> 0x00f0, all -> 0x00ee }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0104  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x010d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.facebook.internal.q e(android.content.Context r13) {
            /*
                r12 = this;
                java.lang.String r0 = "limit_tracking"
                java.lang.String r1 = "androidid"
                java.lang.String r2 = "aid"
                java.lang.String r3 = "context"
                m.y.d.l.d(r13, r3)
                com.facebook.internal.q r3 = r12.b(r13)
                r4 = 0
                android.os.Looper r5 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                android.os.Looper r6 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                boolean r5 = m.y.d.l.a(r5, r6)     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                if (r5 != 0) goto L_0x00e6
                com.facebook.internal.q r5 = com.facebook.internal.q.f1480h     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                if (r5 == 0) goto L_0x0033
                long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                long r8 = r5.b     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                long r6 = r6 - r8
                r8 = 3600000(0x36ee80, double:1.7786363E-317)
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 >= 0) goto L_0x0033
                return r5
            L_0x0033:
                java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                android.content.pm.PackageManager r5 = r13.getPackageManager()     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                java.lang.String r6 = "com.facebook.katana.provider.AttributionIdProvider"
                r8 = 0
                android.content.pm.ProviderInfo r5 = r5.resolveContentProvider(r6, r8)     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                android.content.pm.PackageManager r6 = r13.getPackageManager()     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                java.lang.String r9 = "com.facebook.wakizashi.provider.AttributionIdProvider"
                android.content.pm.ProviderInfo r6 = r6.resolveContentProvider(r9, r8)     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                if (r5 == 0) goto L_0x0065
                com.facebook.internal.y r8 = com.facebook.internal.y.a     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                java.lang.String r5 = r5.packageName     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                java.lang.String r8 = "contentProviderInfo.packageName"
                m.y.d.l.c(r5, r8)     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                boolean r5 = com.facebook.internal.y.a(r13, r5)     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                if (r5 == 0) goto L_0x0065
                java.lang.String r5 = "content://com.facebook.katana.provider.AttributionIdProvider"
            L_0x005f:
                android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                r6 = r5
                goto L_0x007a
            L_0x0065:
                if (r6 == 0) goto L_0x0079
                com.facebook.internal.y r5 = com.facebook.internal.y.a     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                java.lang.String r5 = r6.packageName     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                java.lang.String r6 = "wakizashiProviderInfo.packageName"
                m.y.d.l.c(r5, r6)     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                boolean r5 = com.facebook.internal.y.a(r13, r5)     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                if (r5 == 0) goto L_0x0079
                java.lang.String r5 = "content://com.facebook.wakizashi.provider.AttributionIdProvider"
                goto L_0x005f
            L_0x0079:
                r6 = r4
            L_0x007a:
                java.lang.String r5 = r12.f(r13)     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                if (r5 == 0) goto L_0x0083
                r3.f1481d = r5     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
            L_0x0083:
                if (r6 != 0) goto L_0x0089
                r12.a(r3)     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                return r3
            L_0x0089:
                android.content.ContentResolver r5 = r13.getContentResolver()     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                r8 = 0
                r9 = 0
                r10 = 0
                android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                if (r13 == 0) goto L_0x00d3
                boolean r5 = r13.moveToFirst()     // Catch:{ Exception -> 0x00e1, all -> 0x00dd }
                if (r5 != 0) goto L_0x009d
                goto L_0x00d3
            L_0x009d:
                int r2 = r13.getColumnIndex(r2)     // Catch:{ Exception -> 0x00e1, all -> 0x00dd }
                int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x00e1, all -> 0x00dd }
                int r0 = r13.getColumnIndex(r0)     // Catch:{ Exception -> 0x00e1, all -> 0x00dd }
                java.lang.String r2 = r13.getString(r2)     // Catch:{ Exception -> 0x00e1, all -> 0x00dd }
                r3.c = r2     // Catch:{ Exception -> 0x00e1, all -> 0x00dd }
                if (r1 <= 0) goto L_0x00cc
                if (r0 <= 0) goto L_0x00cc
                java.lang.String r2 = r3.h()     // Catch:{ Exception -> 0x00e1, all -> 0x00dd }
                if (r2 != 0) goto L_0x00cc
                java.lang.String r1 = r13.getString(r1)     // Catch:{ Exception -> 0x00e1, all -> 0x00dd }
                r3.a = r1     // Catch:{ Exception -> 0x00e1, all -> 0x00dd }
                java.lang.String r0 = r13.getString(r0)     // Catch:{ Exception -> 0x00e1, all -> 0x00dd }
                boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ Exception -> 0x00e1, all -> 0x00dd }
                r3.f1482e = r0     // Catch:{ Exception -> 0x00e1, all -> 0x00dd }
            L_0x00cc:
                r13.close()
                r12.a(r3)
                return r3
            L_0x00d3:
                r12.a(r3)     // Catch:{ Exception -> 0x00e1, all -> 0x00dd }
                if (r13 != 0) goto L_0x00d9
                goto L_0x00dc
            L_0x00d9:
                r13.close()
            L_0x00dc:
                return r3
            L_0x00dd:
                r0 = move-exception
                r4 = r13
                r13 = r0
                goto L_0x010a
            L_0x00e1:
                r0 = move-exception
                r11 = r0
                r0 = r13
                r13 = r11
                goto L_0x00f2
            L_0x00e6:
                com.facebook.c0 r13 = new com.facebook.c0     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                java.lang.String r0 = "getAttributionIdentifiers cannot be called on the main thread."
                r13.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
                throw r13     // Catch:{ Exception -> 0x00f0, all -> 0x00ee }
            L_0x00ee:
                r13 = move-exception
                goto L_0x010a
            L_0x00f0:
                r13 = move-exception
                r0 = r4
            L_0x00f2:
                com.facebook.internal.o0 r1 = com.facebook.internal.o0.a     // Catch:{ all -> 0x0108 }
                java.lang.String r1 = com.facebook.internal.q.f1479g     // Catch:{ all -> 0x0108 }
                java.lang.String r2 = "Caught unexpected exception in getAttributionId(): "
                java.lang.String r13 = m.y.d.l.j(r2, r13)     // Catch:{ all -> 0x0108 }
                com.facebook.internal.o0.e0(r1, r13)     // Catch:{ all -> 0x0108 }
                if (r0 != 0) goto L_0x0104
                goto L_0x0107
            L_0x0104:
                r0.close()
            L_0x0107:
                return r4
            L_0x0108:
                r13 = move-exception
                r4 = r0
            L_0x010a:
                if (r4 != 0) goto L_0x010d
                goto L_0x0110
            L_0x010d:
                r4.close()
            L_0x0110:
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.q.a.e(android.content.Context):com.facebook.internal.q");
        }

        public final boolean h(Context context) {
            l.d(context, "context");
            q e2 = e(context);
            return e2 != null && e2.k();
        }
    }

    private static final class b implements IInterface {
        private final IBinder a;

        public b(IBinder iBinder) {
            l.d(iBinder, "binder");
            this.a = iBinder;
        }

        public final String a() {
            Parcel obtain = Parcel.obtain();
            l.c(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            l.c(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.a;
        }

        public final boolean b() {
            Parcel obtain = Parcel.obtain();
            l.c(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            l.c(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    private static final class c implements ServiceConnection {
        private final AtomicBoolean a = new AtomicBoolean(false);
        private final BlockingQueue<IBinder> b = new LinkedBlockingDeque();

        public final IBinder a() {
            if (!this.a.compareAndSet(true, true)) {
                IBinder take = this.b.take();
                l.c(take, "queue.take()");
                return take;
            }
            throw new IllegalStateException("Binder already consumed".toString());
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public final String h() {
        g0 g0Var = g0.a;
        if (!g0.v() || !g0.b()) {
            return null;
        }
        return this.a;
    }

    public final String i() {
        return this.f1481d;
    }

    public final String j() {
        return this.c;
    }

    public final boolean k() {
        return this.f1482e;
    }
}
