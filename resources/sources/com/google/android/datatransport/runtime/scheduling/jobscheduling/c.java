package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ JobInfoSchedulerService f2324e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ JobParameters f2325f;

    public /* synthetic */ c(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f2324e = jobInfoSchedulerService;
        this.f2325f = jobParameters;
    }

    public final void run() {
        this.f2324e.b(this.f2325f);
    }
}
