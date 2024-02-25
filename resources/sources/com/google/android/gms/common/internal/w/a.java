package com.google.android.gms.common.internal.w;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.r;
import f.e.a.c.d.a.c;

public final class a extends f.e.a.c.d.a.a implements IInterface {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void d0(r rVar) {
        Parcel a = a();
        c.b(a, rVar);
        c(1, a);
    }
}
