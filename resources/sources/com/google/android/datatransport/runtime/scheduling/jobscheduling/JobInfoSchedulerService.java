package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import f.e.a.a.i.d0.a;
import f.e.a.a.i.p;
import f.e.a.a.i.t;

public class JobInfoSchedulerService extends JobService {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i2 = jobParameters.getExtras().getInt("priority");
        int i3 = jobParameters.getExtras().getInt("attemptNumber");
        t.f(getApplicationContext());
        p.a a = p.a();
        a.b(string);
        a.d(a.b(i2));
        if (string2 != null) {
            a.c(Base64.decode(string2, 0));
        }
        t.c().e().v(a.a(), i3, new c(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
