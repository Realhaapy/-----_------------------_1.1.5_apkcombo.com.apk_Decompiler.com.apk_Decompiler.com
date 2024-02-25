package io.flutter.plugins.firebase.messaging;

import android.content.Intent;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.w0;
import e.n.a.a;

public class FlutterFirebaseMessagingService extends FirebaseMessagingService {
    public void onMessageReceived(w0 w0Var) {
    }

    public void onNewToken(String str) {
        Intent intent = new Intent("io.flutter.plugins.firebase.messaging.TOKEN");
        intent.putExtra("token", str);
        a.b(getApplicationContext()).d(intent);
    }
}
