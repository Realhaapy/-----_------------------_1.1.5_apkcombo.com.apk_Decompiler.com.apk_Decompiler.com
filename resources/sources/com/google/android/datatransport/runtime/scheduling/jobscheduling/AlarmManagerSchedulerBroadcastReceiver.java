package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import f.e.a.a.i.d0.a;
import f.e.a.a.i.p;
import f.e.a.a.i.t;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    static /* synthetic */ void a() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i2 = intent.getExtras().getInt("attemptNumber");
        t.f(context);
        p.a a = p.a();
        a.b(queryParameter);
        a.d(a.b(intValue));
        if (queryParameter2 != null) {
            a.c(Base64.decode(queryParameter2, 0));
        }
        t.c().e().v(a.a(), i2, a.f2323e);
    }
}
