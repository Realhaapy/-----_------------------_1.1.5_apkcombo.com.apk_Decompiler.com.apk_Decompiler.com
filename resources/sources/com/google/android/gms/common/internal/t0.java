package com.google.android.gms.common.internal;

import android.os.Looper;
import android.os.Message;
import f.e.a.c.d.c.e;

final class t0 extends e {
    final /* synthetic */ c a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t0(c cVar, Looper looper) {
        super(looper);
        this.a = cVar;
    }

    private static final void a(Message message) {
        u0 u0Var = (u0) message.obj;
        u0Var.b();
        u0Var.e();
    }

    private static final boolean b(Message message) {
        int i2 = message.what;
        return i2 == 2 || i2 == 1 || i2 == 7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            com.google.android.gms.common.internal.c r0 = r7.a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.v
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L_0x0016
            boolean r0 = b(r8)
            if (r0 == 0) goto L_0x0015
            a(r8)
        L_0x0015:
            return
        L_0x0016:
            int r0 = r8.what
            r1 = 4
            r2 = 1
            r3 = 5
            if (r0 == r2) goto L_0x002e
            r4 = 7
            if (r0 == r4) goto L_0x002e
            if (r0 != r1) goto L_0x002a
            com.google.android.gms.common.internal.c r0 = r7.a
            boolean r0 = r0.s()
            if (r0 == 0) goto L_0x002e
        L_0x002a:
            int r0 = r8.what
            if (r0 != r3) goto L_0x0036
        L_0x002e:
            com.google.android.gms.common.internal.c r0 = r7.a
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x0122
        L_0x0036:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L_0x007e
            com.google.android.gms.common.internal.c r0 = r7.a
            com.google.android.gms.common.a r1 = new com.google.android.gms.common.a
            int r8 = r8.arg2
            r1.<init>(r8)
            r0.f2512s = r1
            com.google.android.gms.common.internal.c r8 = r7.a
            boolean r8 = com.google.android.gms.common.internal.c.f0(r8)
            if (r8 == 0) goto L_0x005f
            com.google.android.gms.common.internal.c r8 = r7.a
            boolean r0 = r8.t
            if (r0 == 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            r8.g0(r5, null)
            return
        L_0x005f:
            com.google.android.gms.common.internal.c r8 = r7.a
            com.google.android.gms.common.a r0 = r8.f2512s
            if (r0 == 0) goto L_0x006c
            com.google.android.gms.common.a r8 = r8.f2512s
            goto L_0x0071
        L_0x006c:
            com.google.android.gms.common.a r8 = new com.google.android.gms.common.a
            r8.<init>(r4)
        L_0x0071:
            com.google.android.gms.common.internal.c r0 = r7.a
            com.google.android.gms.common.internal.c$c r0 = r0.f2502i
            r0.a(r8)
            com.google.android.gms.common.internal.c r0 = r7.a
            r0.K(r8)
            return
        L_0x007e:
            if (r0 != r3) goto L_0x009f
            com.google.android.gms.common.internal.c r8 = r7.a
            com.google.android.gms.common.a r0 = r8.f2512s
            if (r0 == 0) goto L_0x008d
            com.google.android.gms.common.a r8 = r8.f2512s
            goto L_0x0092
        L_0x008d:
            com.google.android.gms.common.a r8 = new com.google.android.gms.common.a
            r8.<init>(r4)
        L_0x0092:
            com.google.android.gms.common.internal.c r0 = r7.a
            com.google.android.gms.common.internal.c$c r0 = r0.f2502i
            r0.a(r8)
            com.google.android.gms.common.internal.c r0 = r7.a
            r0.K(r8)
            return
        L_0x009f:
            if (r0 != r5) goto L_0x00be
            java.lang.Object r0 = r8.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00aa
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00aa:
            com.google.android.gms.common.a r0 = new com.google.android.gms.common.a
            int r8 = r8.arg2
            r0.<init>(r8, r6)
            com.google.android.gms.common.internal.c r8 = r7.a
            com.google.android.gms.common.internal.c$c r8 = r8.f2502i
            r8.a(r0)
            com.google.android.gms.common.internal.c r8 = r7.a
            r8.K(r0)
            return
        L_0x00be:
            r1 = 6
            if (r0 != r1) goto L_0x00e4
            com.google.android.gms.common.internal.c r0 = r7.a
            r0.g0(r3, null)
            com.google.android.gms.common.internal.c r0 = r7.a
            com.google.android.gms.common.internal.c$a r1 = r0.f2507n
            if (r1 == 0) goto L_0x00d7
            com.google.android.gms.common.internal.c$a r0 = r0.f2507n
            int r1 = r8.arg2
            r0.a(r1)
        L_0x00d7:
            com.google.android.gms.common.internal.c r0 = r7.a
            int r8 = r8.arg2
            r0.L(r8)
            com.google.android.gms.common.internal.c r8 = r7.a
            com.google.android.gms.common.internal.c.e0(r8, r3, r2, r6)
            return
        L_0x00e4:
            r1 = 2
            if (r0 != r1) goto L_0x00f4
            com.google.android.gms.common.internal.c r0 = r7.a
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x00f0
            goto L_0x00f4
        L_0x00f0:
            a(r8)
            return
        L_0x00f4:
            boolean r0 = b(r8)
            if (r0 == 0) goto L_0x0102
            java.lang.Object r8 = r8.obj
            com.google.android.gms.common.internal.u0 r8 = (com.google.android.gms.common.internal.u0) r8
            r8.c()
            return
        L_0x0102:
            int r8 = r8.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 45
            r0.<init>(r1)
            java.lang.String r1 = "Don't know how to handle message: "
            r0.append(r1)
            r0.append(r8)
            java.lang.Exception r8 = new java.lang.Exception
            r8.<init>()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r0, r8)
            return
        L_0x0122:
            a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.t0.handleMessage(android.os.Message):void");
    }
}
