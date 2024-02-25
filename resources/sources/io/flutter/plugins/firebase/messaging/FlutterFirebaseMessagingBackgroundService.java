package io.flutter.plugins.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.w0;
import io.flutter.embedding.engine.FlutterShellArgs;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class FlutterFirebaseMessagingBackgroundService extends JobIntentService {
    private static final String TAG = "FLTFireMsgService";
    private static FlutterFirebaseMessagingBackgroundExecutor flutterBackgroundExecutor;
    private static final List<Intent> messagingQueue = Collections.synchronizedList(new LinkedList());

    public static void enqueueMessageProcessing(Context context, Intent intent) {
        Class<FlutterFirebaseMessagingBackgroundService> cls = FlutterFirebaseMessagingBackgroundService.class;
        boolean z = true;
        if (((w0) intent.getExtras().get("notification")).i() != 1) {
            z = false;
        }
        JobIntentService.enqueueWork(context, (Class) cls, 2020, intent, z);
    }

    static void onInitialized() {
        Log.i(TAG, "FlutterFirebaseMessagingBackgroundService started!");
        List<Intent> list = messagingQueue;
        synchronized (list) {
            for (Intent executeDartCallbackInBackgroundIsolate : list) {
                flutterBackgroundExecutor.executeDartCallbackInBackgroundIsolate(executeDartCallbackInBackgroundIsolate, (CountDownLatch) null);
            }
            messagingQueue.clear();
        }
    }

    public static void setCallbackDispatcher(long j2) {
        FlutterFirebaseMessagingBackgroundExecutor.setCallbackDispatcher(j2);
    }

    public static void setUserCallbackHandle(long j2) {
        FlutterFirebaseMessagingBackgroundExecutor.setUserCallbackHandle(j2);
    }

    public static void startBackgroundIsolate(long j2, FlutterShellArgs flutterShellArgs) {
        if (flutterBackgroundExecutor != null) {
            Log.w(TAG, "Attempted to start a duplicate background isolate. Returning...");
            return;
        }
        FlutterFirebaseMessagingBackgroundExecutor flutterFirebaseMessagingBackgroundExecutor = new FlutterFirebaseMessagingBackgroundExecutor();
        flutterBackgroundExecutor = flutterFirebaseMessagingBackgroundExecutor;
        flutterFirebaseMessagingBackgroundExecutor.startBackgroundIsolate(j2, flutterShellArgs);
    }

    public /* bridge */ /* synthetic */ boolean isStopped() {
        return super.isStopped();
    }

    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    public void onCreate() {
        super.onCreate();
        if (flutterBackgroundExecutor == null) {
            flutterBackgroundExecutor = new FlutterFirebaseMessagingBackgroundExecutor();
        }
        flutterBackgroundExecutor.startBackgroundIsolate();
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onHandleWork(Intent intent) {
        if (!flutterBackgroundExecutor.isDartBackgroundHandlerRegistered()) {
            Log.w(TAG, "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        List<Intent> list = messagingQueue;
        synchronized (list) {
            if (flutterBackgroundExecutor.isNotRunning()) {
                Log.i(TAG, "Service has not yet started, messages will be queued.");
                list.add(intent);
                return;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Handler(getMainLooper()).post(new c(intent, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e2) {
                Log.i(TAG, "Exception waiting to execute Dart callback", e2);
            }
        }
    }

    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i2, int i3) {
        return super.onStartCommand(intent, i2, i3);
    }

    public /* bridge */ /* synthetic */ boolean onStopCurrentWork() {
        return super.onStopCurrentWork();
    }

    public /* bridge */ /* synthetic */ void setInterruptIfStopped(boolean z) {
        super.setInterruptIfStopped(z);
    }
}
