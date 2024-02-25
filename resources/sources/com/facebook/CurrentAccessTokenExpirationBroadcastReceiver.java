package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import m.y.d.l;

public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        l.d(context, "context");
        l.d(intent, "intent");
        if (l.a("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction())) {
            g0 g0Var = g0.a;
            if (g0.v()) {
                w.f1771f.e().c();
            }
        }
    }
}
