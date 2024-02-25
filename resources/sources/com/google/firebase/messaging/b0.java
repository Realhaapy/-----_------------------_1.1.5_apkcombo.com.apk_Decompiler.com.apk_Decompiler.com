package com.google.firebase.messaging;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

public final /* synthetic */ class b0 implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ScheduledExecutorService b;
    public final /* synthetic */ FirebaseMessaging c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r0 f2717d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ o0 f2718e;

    public /* synthetic */ b0(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, r0 r0Var, o0 o0Var) {
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = firebaseMessaging;
        this.f2717d = r0Var;
        this.f2718e = o0Var;
    }

    public final Object call() {
        return g1.i(this.a, this.b, this.c, this.f2717d, this.f2718e);
    }
}
