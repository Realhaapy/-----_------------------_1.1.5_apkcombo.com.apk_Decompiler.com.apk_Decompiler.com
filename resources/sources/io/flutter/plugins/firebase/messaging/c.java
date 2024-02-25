package io.flutter.plugins.firebase.messaging;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Intent f4746e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f4747f;

    public /* synthetic */ c(Intent intent, CountDownLatch countDownLatch) {
        this.f4746e = intent;
        this.f4747f = countDownLatch;
    }

    public final void run() {
        FlutterFirebaseMessagingBackgroundService.flutterBackgroundExecutor.executeDartCallbackInBackgroundIsolate(this.f4746e, this.f4747f);
    }
}
