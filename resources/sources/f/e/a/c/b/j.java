package f.e.a.c.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b f3855e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Intent f3856f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Context f3857g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f3858h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f3859i;

    public /* synthetic */ j(b bVar, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f3855e = bVar;
        this.f3856f = intent;
        this.f3857g = context;
        this.f3858h = z;
        this.f3859i = pendingResult;
    }

    public final void run() {
        this.f3855e.d(this.f3856f, this.f3857g, this.f3858h, this.f3859i);
    }
}
