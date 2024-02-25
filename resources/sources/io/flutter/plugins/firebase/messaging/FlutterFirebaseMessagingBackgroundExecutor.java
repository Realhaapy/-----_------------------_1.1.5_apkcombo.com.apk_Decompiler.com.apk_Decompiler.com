package io.flutter.plugins.firebase.messaging;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.firebase.messaging.w0;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.FlutterCallbackInformation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public class FlutterFirebaseMessagingBackgroundExecutor implements MethodChannel.MethodCallHandler {
    private static final String CALLBACK_HANDLE_KEY = "callback_handle";
    private static final String TAG = "FLTFireBGExecutor";
    private static final String USER_CALLBACK_HANDLE_KEY = "user_callback_handle";
    private MethodChannel backgroundChannel;
    private FlutterEngine backgroundFlutterEngine;
    private final AtomicBoolean isCallbackDispatcherReady = new AtomicBoolean(false);

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void b(FlutterLoader flutterLoader, FlutterShellArgs flutterShellArgs, long j2) {
        String findAppBundlePath = flutterLoader.findAppBundlePath();
        AssetManager assets = ContextHolder.getApplicationContext().getAssets();
        if (isNotRunning()) {
            if (flutterShellArgs != null) {
                Log.i(TAG, "Creating background FlutterEngine instance, with args: " + Arrays.toString(flutterShellArgs.toArray()));
                this.backgroundFlutterEngine = new FlutterEngine(ContextHolder.getApplicationContext(), flutterShellArgs.toArray());
            } else {
                Log.i(TAG, "Creating background FlutterEngine instance.");
                this.backgroundFlutterEngine = new FlutterEngine(ContextHolder.getApplicationContext());
            }
            FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j2);
            DartExecutor dartExecutor = this.backgroundFlutterEngine.getDartExecutor();
            initializeMethodChannel(dartExecutor);
            dartExecutor.executeDartCallback(new DartExecutor.DartCallback(assets, findAppBundlePath, lookupCallbackInformation));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void d(FlutterLoader flutterLoader, Handler handler, FlutterShellArgs flutterShellArgs, long j2) {
        flutterLoader.startInitialization(ContextHolder.getApplicationContext());
        flutterLoader.ensureInitializationCompleteAsync(ContextHolder.getApplicationContext(), (String[]) null, handler, new b(this, flutterLoader, flutterShellArgs, j2));
    }

    private long getPluginCallbackHandle() {
        return ContextHolder.getApplicationContext().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong(CALLBACK_HANDLE_KEY, 0);
    }

    /* access modifiers changed from: private */
    public long getUserCallbackHandle() {
        return ContextHolder.getApplicationContext().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong(USER_CALLBACK_HANDLE_KEY, 0);
    }

    private void initializeMethodChannel(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/firebase_messaging_background");
        this.backgroundChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    private void onInitialized() {
        this.isCallbackDispatcherReady.set(true);
        FlutterFirebaseMessagingBackgroundService.onInitialized();
    }

    public static void setCallbackDispatcher(long j2) {
        ContextHolder.getApplicationContext().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong(CALLBACK_HANDLE_KEY, j2).apply();
    }

    public static void setUserCallbackHandle(long j2) {
        ContextHolder.getApplicationContext().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong(USER_CALLBACK_HANDLE_KEY, j2).apply();
    }

    public void executeDartCallbackInBackgroundIsolate(Intent intent, final CountDownLatch countDownLatch) {
        if (this.backgroundFlutterEngine == null) {
            Log.i(TAG, "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        AnonymousClass1 r0 = null;
        if (countDownLatch != null) {
            r0 = new MethodChannel.Result() {
                public void error(String str, String str2, Object obj) {
                    countDownLatch.countDown();
                }

                public void notImplemented() {
                    countDownLatch.countDown();
                }

                public void success(Object obj) {
                    countDownLatch.countDown();
                }
            };
        }
        w0 w0Var = (w0) intent.getParcelableExtra("notification");
        if (w0Var != null) {
            this.backgroundChannel.invokeMethod("MessagingBackground#onMessage", new HashMap<String, Object>(FlutterFirebaseMessagingUtils.remoteMessageToMap(w0Var)) {
                final /* synthetic */ Map val$remoteMessageMap;

                {
                    this.val$remoteMessageMap = r4;
                    put("userCallbackHandle", Long.valueOf(FlutterFirebaseMessagingBackgroundExecutor.this.getUserCallbackHandle()));
                    put("message", r4);
                }
            }, r0);
            return;
        }
        Log.e(TAG, "RemoteMessage instance not found in Intent.");
    }

    /* access modifiers changed from: package-private */
    public boolean isDartBackgroundHandlerRegistered() {
        return getPluginCallbackHandle() != 0;
    }

    public boolean isNotRunning() {
        return !this.isCallbackDispatcherReady.get();
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        try {
            if (methodCall.method.equals("MessagingBackground#initialized")) {
                onInitialized();
                result.success(Boolean.TRUE);
                return;
            }
            result.notImplemented();
        } catch (PluginRegistrantException e2) {
            result.error("error", "Flutter FCM error: " + e2.getMessage(), (Object) null);
        }
    }

    public void startBackgroundIsolate() {
        if (isNotRunning()) {
            long pluginCallbackHandle = getPluginCallbackHandle();
            if (pluginCallbackHandle != 0) {
                startBackgroundIsolate(pluginCallbackHandle, (FlutterShellArgs) null);
            }
        }
    }

    public void startBackgroundIsolate(long j2, FlutterShellArgs flutterShellArgs) {
        if (this.backgroundFlutterEngine != null) {
            Log.e(TAG, "Background isolate already started.");
            return;
        }
        FlutterLoader flutterLoader = new FlutterLoader();
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new a(this, flutterLoader, handler, flutterShellArgs, j2));
    }
}
