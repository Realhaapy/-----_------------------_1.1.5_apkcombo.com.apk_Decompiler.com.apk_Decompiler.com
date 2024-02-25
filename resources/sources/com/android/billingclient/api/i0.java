package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import f.e.a.c.d.d.k;
import f.e.a.c.d.d.m;

final class i0 implements ServiceConnection {
    private final Object a = new Object();
    private boolean b = false;
    private f c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ e f1300d;

    /* synthetic */ i0(e eVar, f fVar, h0 h0Var) {
        this.f1300d = eVar;
        this.c = fVar;
    }

    private final void d(h hVar) {
        synchronized (this.a) {
            f fVar = this.c;
            if (fVar != null) {
                fVar.onBillingSetupFinished(hVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        r0 = new android.os.Bundle();
        r0.putString("accountName", (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4 = com.android.billingclient.api.e.C(r11.f1300d).getPackageName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r6 = 17;
        r7 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r6 < 3) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r0 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r7 = com.android.billingclient.api.e.K(r11.f1300d).l(r6, r4, "subs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        r7 = com.android.billingclient.api.e.K(r11.f1300d).K(r6, r4, "subs", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r7 != 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        r6 = r6 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r8 = r11.f1300d;
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        if (r6 < 5) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        com.android.billingclient.api.e.q(r8, r9);
        r8 = r11.f1300d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        if (r6 < 3) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0065, code lost:
        com.android.billingclient.api.e.r(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
        if (r6 >= 3) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        f.e.a.c.d.d.k.l("BillingClient", "In-app billing API does not support subscription on this device.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0071, code lost:
        r6 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0073, code lost:
        if (r6 < 3) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0075, code lost:
        if (r0 != null) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0077, code lost:
        r7 = com.android.billingclient.api.e.K(r11.f1300d).l(r6, r4, "inapp");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0084, code lost:
        r7 = com.android.billingclient.api.e.K(r11.f1300d).K(r6, r4, "inapp", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0090, code lost:
        if (r7 != 0) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0092, code lost:
        com.android.billingclient.api.e.Q(r11.f1300d, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0098, code lost:
        r6 = r6 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009b, code lost:
        r0 = r11.f1300d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a1, code lost:
        if (com.android.billingclient.api.e.B(r0) < 17) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a3, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a5, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a6, code lost:
        com.android.billingclient.api.e.W(r0, r4);
        r0 = r11.f1300d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b1, code lost:
        if (com.android.billingclient.api.e.B(r0) < 16) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b3, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b5, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b6, code lost:
        com.android.billingclient.api.e.V(r0, r4);
        r0 = r11.f1300d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c1, code lost:
        if (com.android.billingclient.api.e.B(r0) < 15) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c3, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c5, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c6, code lost:
        com.android.billingclient.api.e.U(r0, r4);
        r0 = r11.f1300d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d1, code lost:
        if (com.android.billingclient.api.e.B(r0) < 14) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d3, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d5, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d6, code lost:
        com.android.billingclient.api.e.T(r0, r4);
        r0 = r11.f1300d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e1, code lost:
        if (com.android.billingclient.api.e.B(r0) < 12) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e3, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e5, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e6, code lost:
        com.android.billingclient.api.e.S(r0, r4);
        r0 = r11.f1300d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f1, code lost:
        if (com.android.billingclient.api.e.B(r0) < 10) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f3, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f5, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f6, code lost:
        com.android.billingclient.api.e.R(r0, r4);
        r0 = r11.f1300d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0101, code lost:
        if (com.android.billingclient.api.e.B(r0) < 9) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0103, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0105, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0106, code lost:
        com.android.billingclient.api.e.o(r0, r4);
        r0 = r11.f1300d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0111, code lost:
        if (com.android.billingclient.api.e.B(r0) < 8) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0113, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0115, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0116, code lost:
        com.android.billingclient.api.e.Y(r0, r4);
        r0 = r11.f1300d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0120, code lost:
        if (com.android.billingclient.api.e.B(r0) < 6) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0123, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0124, code lost:
        com.android.billingclient.api.e.X(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x012d, code lost:
        if (com.android.billingclient.api.e.B(r11.f1300d) >= 3) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x012f, code lost:
        f.e.a.c.d.d.k.m("BillingClient", "In-app billing API version 3 is not supported on this device.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0136, code lost:
        if (r7 != 0) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0138, code lost:
        com.android.billingclient.api.e.P(r11.f1300d, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x013f, code lost:
        com.android.billingclient.api.e.P(r11.f1300d, 0);
        com.android.billingclient.api.e.p(r11.f1300d, (f.e.a.c.d.d.n) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x014a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x014b, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x014d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x014e, code lost:
        f.e.a.c.d.d.k.n("BillingClient", "Exception while checking if billing is supported; try to reconnect", r0);
        com.android.billingclient.api.e.P(r11.f1300d, 0);
        com.android.billingclient.api.e.p(r11.f1300d, (f.e.a.c.d.d.n) null);
        r7 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0160, code lost:
        if (r7 != 0) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0162, code lost:
        r0 = com.android.billingclient.api.q0.f1314l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0165, code lost:
        r0 = com.android.billingclient.api.q0.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0167, code lost:
        d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x016a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        if (android.text.TextUtils.isEmpty((java.lang.CharSequence) null) != false) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object a() {
        /*
            r11 = this;
            java.lang.Object r0 = r11.a
            monitor-enter(r0)
            boolean r1 = r11.b     // Catch:{ all -> 0x016b }
            r2 = 0
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x016b }
            return r2
        L_0x000a:
            monitor-exit(r0)     // Catch:{ all -> 0x016b }
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x001c
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "accountName"
            r0.putString(r1, r2)
            goto L_0x001d
        L_0x001c:
            r0 = r2
        L_0x001d:
            r1 = 3
            r3 = 0
            com.android.billingclient.api.e r4 = r11.f1300d     // Catch:{ Exception -> 0x014d }
            android.content.Context r4 = r4.f1277e     // Catch:{ Exception -> 0x014d }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ Exception -> 0x014d }
            r5 = 17
            r6 = 17
            r7 = 3
        L_0x002e:
            if (r6 < r1) goto L_0x0051
            if (r0 != 0) goto L_0x003f
            com.android.billingclient.api.e r8 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            f.e.a.c.d.d.n r8 = r8.f1278f     // Catch:{ Exception -> 0x014a }
            java.lang.String r9 = "subs"
            int r7 = r8.l(r6, r4, r9)     // Catch:{ Exception -> 0x014a }
            goto L_0x004b
        L_0x003f:
            com.android.billingclient.api.e r8 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            f.e.a.c.d.d.n r8 = r8.f1278f     // Catch:{ Exception -> 0x014a }
            java.lang.String r9 = "subs"
            int r7 = r8.K(r6, r4, r9, r0)     // Catch:{ Exception -> 0x014a }
        L_0x004b:
            if (r7 != 0) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            int r6 = r6 + -1
            goto L_0x002e
        L_0x0051:
            r6 = 0
        L_0x0052:
            com.android.billingclient.api.e r8 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            r9 = 5
            r10 = 1
            if (r6 < r9) goto L_0x005a
            r9 = 1
            goto L_0x005b
        L_0x005a:
            r9 = 0
        L_0x005b:
            r8.f1281i = r9     // Catch:{ Exception -> 0x014a }
            com.android.billingclient.api.e r8 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            if (r6 < r1) goto L_0x0064
            r9 = 1
            goto L_0x0065
        L_0x0064:
            r9 = 0
        L_0x0065:
            r8.f1280h = r9     // Catch:{ Exception -> 0x014a }
            if (r6 >= r1) goto L_0x0071
            java.lang.String r6 = "BillingClient"
            java.lang.String r8 = "In-app billing API does not support subscription on this device."
            f.e.a.c.d.d.k.l(r6, r8)     // Catch:{ Exception -> 0x014a }
        L_0x0071:
            r6 = 17
        L_0x0073:
            if (r6 < r1) goto L_0x009b
            if (r0 != 0) goto L_0x0084
            com.android.billingclient.api.e r8 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            f.e.a.c.d.d.n r8 = r8.f1278f     // Catch:{ Exception -> 0x014a }
            java.lang.String r9 = "inapp"
            int r7 = r8.l(r6, r4, r9)     // Catch:{ Exception -> 0x014a }
            goto L_0x0090
        L_0x0084:
            com.android.billingclient.api.e r8 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            f.e.a.c.d.d.n r8 = r8.f1278f     // Catch:{ Exception -> 0x014a }
            java.lang.String r9 = "inapp"
            int r7 = r8.K(r6, r4, r9, r0)     // Catch:{ Exception -> 0x014a }
        L_0x0090:
            if (r7 != 0) goto L_0x0098
            com.android.billingclient.api.e r0 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            r0.f1282j = r6     // Catch:{ Exception -> 0x014a }
            goto L_0x009b
        L_0x0098:
            int r6 = r6 + -1
            goto L_0x0073
        L_0x009b:
            com.android.billingclient.api.e r0 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            int r4 = r0.f1282j     // Catch:{ Exception -> 0x014a }
            if (r4 < r5) goto L_0x00a5
            r4 = 1
            goto L_0x00a6
        L_0x00a5:
            r4 = 0
        L_0x00a6:
            r0.f1291s = r4     // Catch:{ Exception -> 0x014a }
            com.android.billingclient.api.e r0 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            int r4 = r0.f1282j     // Catch:{ Exception -> 0x014a }
            r5 = 16
            if (r4 < r5) goto L_0x00b5
            r4 = 1
            goto L_0x00b6
        L_0x00b5:
            r4 = 0
        L_0x00b6:
            r0.f1290r = r4     // Catch:{ Exception -> 0x014a }
            com.android.billingclient.api.e r0 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            int r4 = r0.f1282j     // Catch:{ Exception -> 0x014a }
            r5 = 15
            if (r4 < r5) goto L_0x00c5
            r4 = 1
            goto L_0x00c6
        L_0x00c5:
            r4 = 0
        L_0x00c6:
            r0.f1289q = r4     // Catch:{ Exception -> 0x014a }
            com.android.billingclient.api.e r0 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            int r4 = r0.f1282j     // Catch:{ Exception -> 0x014a }
            r5 = 14
            if (r4 < r5) goto L_0x00d5
            r4 = 1
            goto L_0x00d6
        L_0x00d5:
            r4 = 0
        L_0x00d6:
            r0.f1288p = r4     // Catch:{ Exception -> 0x014a }
            com.android.billingclient.api.e r0 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            int r4 = r0.f1282j     // Catch:{ Exception -> 0x014a }
            r5 = 12
            if (r4 < r5) goto L_0x00e5
            r4 = 1
            goto L_0x00e6
        L_0x00e5:
            r4 = 0
        L_0x00e6:
            r0.f1287o = r4     // Catch:{ Exception -> 0x014a }
            com.android.billingclient.api.e r0 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            int r4 = r0.f1282j     // Catch:{ Exception -> 0x014a }
            r5 = 10
            if (r4 < r5) goto L_0x00f5
            r4 = 1
            goto L_0x00f6
        L_0x00f5:
            r4 = 0
        L_0x00f6:
            r0.f1286n = r4     // Catch:{ Exception -> 0x014a }
            com.android.billingclient.api.e r0 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            int r4 = r0.f1282j     // Catch:{ Exception -> 0x014a }
            r5 = 9
            if (r4 < r5) goto L_0x0105
            r4 = 1
            goto L_0x0106
        L_0x0105:
            r4 = 0
        L_0x0106:
            r0.f1285m = r4     // Catch:{ Exception -> 0x014a }
            com.android.billingclient.api.e r0 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            int r4 = r0.f1282j     // Catch:{ Exception -> 0x014a }
            r5 = 8
            if (r4 < r5) goto L_0x0115
            r4 = 1
            goto L_0x0116
        L_0x0115:
            r4 = 0
        L_0x0116:
            r0.f1284l = r4     // Catch:{ Exception -> 0x014a }
            com.android.billingclient.api.e r0 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            int r4 = r0.f1282j     // Catch:{ Exception -> 0x014a }
            r5 = 6
            if (r4 < r5) goto L_0x0123
            goto L_0x0124
        L_0x0123:
            r10 = 0
        L_0x0124:
            r0.f1283k = r10     // Catch:{ Exception -> 0x014a }
            com.android.billingclient.api.e r0 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            int r0 = r0.f1282j     // Catch:{ Exception -> 0x014a }
            if (r0 >= r1) goto L_0x0136
            java.lang.String r0 = "BillingClient"
            java.lang.String r1 = "In-app billing API version 3 is not supported on this device."
            f.e.a.c.d.d.k.m(r0, r1)     // Catch:{ Exception -> 0x014a }
        L_0x0136:
            if (r7 != 0) goto L_0x013f
            com.android.billingclient.api.e r0 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            r1 = 2
            r0.a = r1     // Catch:{ Exception -> 0x014a }
            goto L_0x0160
        L_0x013f:
            com.android.billingclient.api.e r0 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            r0.a = r3     // Catch:{ Exception -> 0x014a }
            com.android.billingclient.api.e r0 = r11.f1300d     // Catch:{ Exception -> 0x014a }
            r0.f1278f = r2     // Catch:{ Exception -> 0x014a }
            goto L_0x0160
        L_0x014a:
            r0 = move-exception
            r1 = r7
            goto L_0x014e
        L_0x014d:
            r0 = move-exception
        L_0x014e:
            java.lang.String r4 = "BillingClient"
            java.lang.String r5 = "Exception while checking if billing is supported; try to reconnect"
            f.e.a.c.d.d.k.n(r4, r5, r0)
            com.android.billingclient.api.e r0 = r11.f1300d
            r0.a = r3
            com.android.billingclient.api.e r0 = r11.f1300d
            r0.f1278f = r2
            r7 = r1
        L_0x0160:
            if (r7 != 0) goto L_0x0165
            com.android.billingclient.api.h r0 = com.android.billingclient.api.q0.f1314l
            goto L_0x0167
        L_0x0165:
            com.android.billingclient.api.h r0 = com.android.billingclient.api.q0.a
        L_0x0167:
            r11.d(r0)
            return r2
        L_0x016b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x016b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.i0.a():java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        this.f1300d.a = 0;
        this.f1300d.f1278f = null;
        d(q0.f1316n);
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        synchronized (this.a) {
            this.c = null;
            this.b = true;
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        k.l("BillingClient", "Billing service connected.");
        this.f1300d.f1278f = m.a(iBinder);
        e eVar = this.f1300d;
        if (eVar.x(new f0(this), 30000, new g0(this), eVar.t()) == null) {
            d(this.f1300d.v());
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        k.m("BillingClient", "Billing service disconnected.");
        this.f1300d.f1278f = null;
        this.f1300d.a = 0;
        synchronized (this.a) {
            f fVar = this.c;
            if (fVar != null) {
                fVar.onBillingServiceDisconnected();
            }
        }
    }
}
