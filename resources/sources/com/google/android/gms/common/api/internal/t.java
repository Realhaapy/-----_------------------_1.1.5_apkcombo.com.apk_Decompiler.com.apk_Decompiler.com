package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

public final /* synthetic */ class t implements Executor {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Handler f2471e;

    public /* synthetic */ t(Handler handler) {
        this.f2471e = handler;
    }

    public final void execute(Runnable runnable) {
        this.f2471e.post(runnable);
    }
}
