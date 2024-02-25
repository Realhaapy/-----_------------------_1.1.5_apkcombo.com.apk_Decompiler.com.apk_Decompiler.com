package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.k1;
import f.e.a.c.g.i;

class j1 extends Binder {
    private final a a;

    interface a {
        i<Void> a(Intent intent);
    }

    j1(a aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: package-private */
    public void b(k1.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.a.a(aVar.a).c(x.f2848e, new c0(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
