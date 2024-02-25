package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.a;

abstract class n0 extends u0<Boolean> {

    /* renamed from: d  reason: collision with root package name */
    public final int f2580d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f2581e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ c f2582f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected n0(c cVar, int i2, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f2582f = cVar;
        this.f2580d = i2;
        this.f2581e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f2580d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.g()
            if (r3 != 0) goto L_0x001b
            com.google.android.gms.common.internal.c r3 = r2.f2582f
            r3.g0(r0, null)
            com.google.android.gms.common.a r3 = new com.google.android.gms.common.a
            r0 = 8
            r3.<init>(r0, r1)
        L_0x0018:
            r2.f(r3)
        L_0x001b:
            return
        L_0x001c:
            com.google.android.gms.common.internal.c r3 = r2.f2582f
            r3.g0(r0, null)
            android.os.Bundle r3 = r2.f2581e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            com.google.android.gms.common.a r3 = new com.google.android.gms.common.a
            int r0 = r2.f2580d
            r3.<init>(r0, r1)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.n0.a(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }

    /* access modifiers changed from: protected */
    public abstract void f(a aVar);

    /* access modifiers changed from: protected */
    public abstract boolean g();
}
