package io.flutter.plugins.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.messaging.w0;
import e.n.a.a;
import java.util.HashMap;

public class FlutterFirebaseMessagingReceiver extends BroadcastReceiver {
    private static final String TAG = "FLTFireMsgReceiver";
    static HashMap<String, w0> notifications = new HashMap<>();

    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "broadcast received for message");
        if (ContextHolder.getApplicationContext() == null) {
            ContextHolder.setApplicationContext(context.getApplicationContext());
        }
        if (intent.getExtras() == null) {
            Log.d(TAG, "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
            return;
        }
        w0 w0Var = new w0(intent.getExtras());
        if (w0Var.h() != null) {
            notifications.put(w0Var.e(), w0Var);
            FlutterFirebaseMessagingStore.getInstance().storeFirebaseMessage(w0Var);
        }
        if (FlutterFirebaseMessagingUtils.isApplicationForeground(context)) {
            Intent intent2 = new Intent("io.flutter.plugins.firebase.messaging.NOTIFICATION");
            intent2.putExtra("notification", w0Var);
            a.b(context).d(intent2);
            return;
        }
        Intent intent3 = new Intent(context, FlutterFirebaseMessagingBackgroundService.class);
        intent3.putExtra("notification", w0Var);
        FlutterFirebaseMessagingBackgroundService.enqueueMessageProcessing(context, intent3);
    }
}
