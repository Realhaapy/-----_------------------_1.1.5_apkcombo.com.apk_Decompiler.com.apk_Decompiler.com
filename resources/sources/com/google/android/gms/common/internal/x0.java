package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.a;

public final class x0 extends n0 {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f2594g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ c f2595h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x0(c cVar, int i2, IBinder iBinder, Bundle bundle) {
        super(cVar, i2, bundle);
        this.f2595h = cVar;
        this.f2594g = iBinder;
    }

    /* access modifiers changed from: protected */
    public final void f(a aVar) {
        if (this.f2595h.f2508o != null) {
            this.f2595h.f2508o.b(aVar);
        }
        this.f2595h.K(aVar);
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        String str;
        try {
            IBinder iBinder = this.f2594g;
            n.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f2595h.D().equals(interfaceDescriptor)) {
                String D = this.f2595h.D();
                StringBuilder sb = new StringBuilder(String.valueOf(D).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(D);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                str = sb.toString();
                Log.w("GmsClient", str);
                return false;
            }
            IInterface r2 = this.f2595h.r(this.f2594g);
            if (r2 == null || (!c.e0(this.f2595h, 2, 4, r2) && !c.e0(this.f2595h, 3, 4, r2))) {
                return false;
            }
            this.f2595h.f2512s = null;
            Bundle w = this.f2595h.w();
            c cVar = this.f2595h;
            if (cVar.f2507n == null) {
                return true;
            }
            cVar.f2507n.c(w);
            return true;
        } catch (RemoteException unused) {
            str = "service probably died";
        }
    }
}
