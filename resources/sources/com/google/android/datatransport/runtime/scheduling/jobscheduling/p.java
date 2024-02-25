package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import f.e.a.a.i.a0.j.j0;
import f.e.a.a.i.c0.a;

public class p implements y {
    private final Context a;
    private final j0 b;
    private AlarmManager c;

    /* renamed from: d  reason: collision with root package name */
    private final t f2332d;

    /* renamed from: e  reason: collision with root package name */
    private final a f2333e;

    p(Context context, j0 j0Var, AlarmManager alarmManager, a aVar, t tVar) {
        this.a = context;
        this.b = j0Var;
        this.c = alarmManager;
        this.f2333e = aVar;
        this.f2332d = tVar;
    }

    public p(Context context, j0 j0Var, a aVar, t tVar) {
        this(context, j0Var, (AlarmManager) context.getSystemService("alarm"), aVar, tVar);
    }

    public void a(f.e.a.a.i.p pVar, int i2) {
        b(pVar, i2, false);
    }

    public void b(f.e.a.a.i.p pVar, int i2, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", pVar.b());
        builder.appendQueryParameter("priority", String.valueOf(f.e.a.a.i.d0.a.a(pVar.d())));
        if (pVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(pVar.c(), 0));
        }
        Intent intent = new Intent(this.a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i2);
        if (z || !c(intent)) {
            long D = this.b.D(pVar);
            long g2 = this.f2332d.g(pVar.d(), D, i2);
            f.e.a.a.i.y.a.c("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", pVar, Long.valueOf(g2), Long.valueOf(D), Integer.valueOf(i2));
            this.c.set(3, this.f2333e.a() + g2, PendingIntent.getBroadcast(this.a, 0, intent, 0));
            return;
        }
        f.e.a.a.i.y.a.b("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
    }

    /* access modifiers changed from: package-private */
    public boolean c(Intent intent) {
        return PendingIntent.getBroadcast(this.a, 0, intent, 536870912) != null;
    }
}
