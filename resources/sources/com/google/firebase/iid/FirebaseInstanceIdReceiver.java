package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.l0;
import com.google.firebase.messaging.q0;
import f.e.a.c.b.a;
import f.e.a.c.b.b;
import f.e.a.c.g.l;
import java.util.concurrent.ExecutionException;

public final class FirebaseInstanceIdReceiver extends b {
    private static Intent g(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    /* access modifiers changed from: protected */
    public int b(Context context, a aVar) {
        try {
            return ((Integer) l.a(new l0(context).g(aVar.b()))).intValue();
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e2);
            return 500;
        }
    }

    /* access modifiers changed from: protected */
    public void c(Context context, Bundle bundle) {
        Intent g2 = g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (q0.A(g2)) {
            q0.s(g2);
        }
    }
}
