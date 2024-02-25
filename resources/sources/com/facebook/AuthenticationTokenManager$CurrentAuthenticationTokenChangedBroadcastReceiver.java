package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import m.y.d.l;

public final class AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        l.d(context, "context");
        l.d(intent, "intent");
    }
}
