package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.l;
import com.google.android.gms.common.util.j;
import com.google.firebase.messaging.h0;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class j0 {
    private final ExecutorService a;
    private final Context b;
    private final s0 c;

    public j0(Context context, s0 s0Var, ExecutorService executorService) {
        this.a = executorService;
        this.b = context;
        this.c = s0Var;
    }

    private boolean b() {
        if (((KeyguardManager) this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!j.e()) {
            SystemClock.sleep(10);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == myPid) {
                return next.importance == 100;
            }
        }
        return false;
    }

    private void c(h0.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.b.getSystemService("notification")).notify(aVar.b, aVar.c, aVar.a.b());
    }

    private p0 d() {
        p0 g2 = p0.g(this.c.p("gcm.n.image"));
        if (g2 != null) {
            g2.B(this.a);
        }
        return g2;
    }

    private void e(l.e eVar, p0 p0Var) {
        if (p0Var != null) {
            try {
                Bitmap bitmap = (Bitmap) f.e.a.c.g.l.b(p0Var.o(), 5, TimeUnit.SECONDS);
                eVar.A(bitmap);
                l.b bVar = new l.b();
                bVar.z(bitmap);
                bVar.y((Bitmap) null);
                eVar.M(bVar);
            } catch (ExecutionException e2) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e2.getCause());
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                p0Var.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                p0Var.close();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        if (this.c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        p0 d2 = d();
        h0.a f2 = h0.f(this.b, this.c);
        e(f2.a, d2);
        c(f2);
        return true;
    }
}
