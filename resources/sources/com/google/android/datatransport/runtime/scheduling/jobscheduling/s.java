package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import f.e.a.a.i.a0.j.j0;
import f.e.a.a.i.d0.a;
import f.e.a.a.i.p;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

public class s implements y {
    private final Context a;
    private final j0 b;
    private final t c;

    public s(Context context, j0 j0Var, t tVar) {
        this.a = context;
        this.b = j0Var;
        this.c = tVar;
    }

    private boolean d(JobScheduler jobScheduler, int i2, int i3) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i4 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i2) {
                return i4 >= i3;
            }
        }
        return false;
    }

    public void a(p pVar, int i2) {
        b(pVar, i2, false);
    }

    public void b(p pVar, int i2, boolean z) {
        ComponentName componentName = new ComponentName(this.a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
        int c2 = c(pVar);
        if (z || !d(jobScheduler, c2, i2)) {
            long D = this.b.D(pVar);
            t tVar = this.c;
            JobInfo.Builder builder = new JobInfo.Builder(c2, componentName);
            tVar.c(builder, pVar.d(), D, i2);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i2);
            persistableBundle.putString("backendName", pVar.b());
            persistableBundle.putInt("priority", a.a(pVar.d()));
            if (pVar.c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
            }
            builder.setExtras(persistableBundle);
            f.e.a.a.i.y.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(c2), Long.valueOf(this.c.g(pVar.d(), D, i2)), Long.valueOf(D), Integer.valueOf(i2));
            jobScheduler.schedule(builder.build());
            return;
        }
        f.e.a.a.i.y.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
    }

    /* access modifiers changed from: package-private */
    public int c(p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }
}
