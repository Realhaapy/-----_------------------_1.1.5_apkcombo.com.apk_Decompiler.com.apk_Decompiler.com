package com.google.firebase.messaging;

import f.e.a.c.g.d;
import f.e.a.c.g.i;
import java.util.concurrent.ScheduledFuture;

public final /* synthetic */ class e0 implements d {
    public final /* synthetic */ ScheduledFuture a;

    public /* synthetic */ e0(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    public final void a(i iVar) {
        this.a.cancel(false);
    }
}
