package io.flutter.plugins.firebase.messaging;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.o;
import com.google.firebase.h;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.w0;
import e.n.a.a;
import f.e.a.c.g.i;
import f.e.a.c.g.j;
import f.e.a.c.g.l;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FlutterFirebaseMessagingPlugin extends BroadcastReceiver implements FlutterFirebasePlugin, MethodChannel.MethodCallHandler, PluginRegistry.NewIntentListener, FlutterPlugin, ActivityAware {
    private MethodChannel channel;
    private final HashMap<String, Boolean> consumedInitialMessages = new HashMap<>();
    private w0 initialMessage;
    private Activity mainActivity;

    static /* synthetic */ void a(j jVar) {
        try {
            l.a(FirebaseMessaging.g().d());
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void d(j jVar) {
        try {
            w0 w0Var = this.initialMessage;
            if (w0Var != null) {
                Map<String, Object> remoteMessageToMap = FlutterFirebaseMessagingUtils.remoteMessageToMap(w0Var);
                this.initialMessage = null;
                jVar.c(remoteMessageToMap);
                return;
            }
            Activity activity = this.mainActivity;
            if (activity == null) {
                jVar.c(null);
                return;
            }
            Intent intent = activity.getIntent();
            if (intent != null) {
                if (intent.getExtras() != null) {
                    String string = intent.getExtras().getString("google.message_id");
                    if (string == null) {
                        string = intent.getExtras().getString("message_id");
                    }
                    if (string != null) {
                        if (this.consumedInitialMessages.get(string) == null) {
                            w0 w0Var2 = FlutterFirebaseMessagingReceiver.notifications.get(string);
                            if (w0Var2 == null) {
                                w0Var2 = FlutterFirebaseMessagingStore.getInstance().getFirebaseMessage(string);
                                FlutterFirebaseMessagingStore.getInstance().removeFirebaseMessage(string);
                            }
                            if (w0Var2 == null) {
                                jVar.c(null);
                                return;
                            }
                            this.consumedInitialMessages.put(string, Boolean.TRUE);
                            jVar.c(FlutterFirebaseMessagingUtils.remoteMessageToMap(w0Var2));
                            return;
                        }
                    }
                    jVar.c(null);
                    return;
                }
            }
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    private i<Void> deleteToken() {
        j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(jVar));
        return jVar.a();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void f(j jVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("authorizationStatus", Integer.valueOf(o.e(this.mainActivity).a() ? 1 : 0));
            jVar.c(hashMap);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    static /* synthetic */ void g(h hVar, j jVar) {
        try {
            HashMap hashMap = new HashMap();
            if (hVar.n().equals("[DEFAULT]")) {
                hashMap.put("AUTO_INIT_ENABLED", Boolean.valueOf(FirebaseMessaging.g().n()));
            }
            jVar.c(hashMap);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    private Map<String, Object> getExceptionDetails(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "unknown");
        hashMap.put("message", exc != null ? exc.getMessage() : "An unknown error has occurred.");
        return hashMap;
    }

    private i<Map<String, Object>> getInitialMessage(Map<String, Object> map) {
        j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new l(this, jVar));
        return jVar.a();
    }

    private i<Map<String, Integer>> getPermissions() {
        j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new m(this, jVar));
        return jVar.a();
    }

    private i<Map<String, Object>> getToken() {
        j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(this, jVar));
        return jVar.a();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void i(j jVar) {
        try {
            jVar.c(new HashMap<String, Object>((String) l.a(FirebaseMessaging.g().j())) {
                final /* synthetic */ String val$token;

                {
                    this.val$token = r2;
                    put("token", r2);
                }
            });
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/firebase_messaging");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("io.flutter.plugins.firebase.messaging.TOKEN");
        intentFilter.addAction("io.flutter.plugins.firebase.messaging.NOTIFICATION");
        a.b(ContextHolder.getApplicationContext()).c(this, intentFilter);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void k(MethodChannel.Result result, i iVar) {
        if (iVar.m()) {
            result.success(iVar.i());
            return;
        }
        Exception h2 = iVar.h();
        result.error("firebase_messaging", h2 != null ? h2.getMessage() : null, getExceptionDetails(h2));
    }

    static /* synthetic */ void l(Map map, j jVar) {
        try {
            FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map).H(FlutterFirebaseMessagingUtils.getRemoteMessageForArguments(map));
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void n(Map map, j jVar) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            firebaseMessagingForArguments.I(((Boolean) obj).booleanValue());
            jVar.c(new HashMap<String, Object>(firebaseMessagingForArguments) {
                final /* synthetic */ FirebaseMessaging val$firebaseMessaging;

                {
                    this.val$firebaseMessaging = r2;
                    put("isAutoInitEnabled", Boolean.valueOf(r2.n()));
                }
            });
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    static /* synthetic */ void o(Map map, j jVar) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            l.a(firebaseMessagingForArguments.M((String) obj));
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    static /* synthetic */ void p(Map map, j jVar) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            l.a(firebaseMessagingForArguments.P((String) obj));
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    private i<Void> sendMessage(Map<String, Object> map) {
        j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(map, jVar));
        return jVar.a();
    }

    private i<Map<String, Object>> setAutoInitEnabled(Map<String, Object> map) {
        j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new i(this, map, jVar));
        return jVar.a();
    }

    private i<Void> subscribeToTopic(Map<String, Object> map) {
        j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new k(map, jVar));
        return jVar.a();
    }

    private i<Void> unsubscribeFromTopic(Map<String, Object> map) {
        j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new n(map, jVar));
        return jVar.a();
    }

    public i<Void> didReinitializeFirebaseCore() {
        j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new j(jVar));
        return jVar.a();
    }

    public i<Map<String, Object>> getPluginConstantsForFirebaseApp(h hVar) {
        j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new e(hVar, jVar));
        return jVar.a();
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        Activity activity = activityPluginBinding.getActivity();
        this.mainActivity = activity;
        if (activity.getIntent() != null && this.mainActivity.getIntent().getExtras() != null && (this.mainActivity.getIntent().getFlags() & 1048576) != 1048576) {
            onNewIntent(this.mainActivity.getIntent());
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromActivity() {
        this.mainActivity = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.mainActivity = null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        if (flutterPluginBinding.getApplicationContext() != null) {
            a.b(flutterPluginBinding.getApplicationContext()).e(this);
        }
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        i iVar;
        String str = methodCall.method;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1704007366:
                if (str.equals("Messaging#getInitialMessage")) {
                    c = 0;
                    break;
                }
                break;
            case -1661255137:
                if (str.equals("Messaging#setAutoInitEnabled")) {
                    c = 1;
                    break;
                }
                break;
            case -657665041:
                if (str.equals("Messaging#deleteToken")) {
                    c = 2;
                    break;
                }
                break;
            case 421314579:
                if (str.equals("Messaging#unsubscribeFromTopic")) {
                    c = 3;
                    break;
                }
                break;
            case 506322569:
                if (str.equals("Messaging#subscribeToTopic")) {
                    c = 4;
                    break;
                }
                break;
            case 928431066:
                if (str.equals("Messaging#startBackgroundIsolate")) {
                    c = 5;
                    break;
                }
                break;
            case 1165917248:
                if (str.equals("Messaging#sendMessage")) {
                    c = 6;
                    break;
                }
                break;
            case 1231338975:
                if (str.equals("Messaging#requestPermission")) {
                    c = 7;
                    break;
                }
                break;
            case 1243856389:
                if (str.equals("Messaging#getNotificationSettings")) {
                    c = 8;
                    break;
                }
                break;
            case 1459336962:
                if (str.equals("Messaging#getToken")) {
                    c = 9;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                iVar = getInitialMessage((Map) methodCall.arguments());
                break;
            case 1:
                iVar = setAutoInitEnabled((Map) methodCall.arguments());
                break;
            case 2:
                iVar = deleteToken();
                break;
            case 3:
                iVar = unsubscribeFromTopic((Map) methodCall.arguments());
                break;
            case 4:
                iVar = subscribeToTopic((Map) methodCall.arguments());
                break;
            case 5:
                Map map = (Map) methodCall.arguments;
                Object obj = map.get("pluginCallbackHandle");
                Object obj2 = map.get("userCallbackHandle");
                long longValue = (obj instanceof Long ? (Long) obj : Long.valueOf((long) ((Integer) obj).intValue())).longValue();
                long longValue2 = (obj2 instanceof Long ? (Long) obj2 : Long.valueOf((long) ((Integer) obj2).intValue())).longValue();
                Activity activity = this.mainActivity;
                FlutterShellArgs fromIntent = activity != null ? FlutterShellArgs.fromIntent(activity.getIntent()) : null;
                FlutterFirebaseMessagingBackgroundService.setCallbackDispatcher(longValue);
                FlutterFirebaseMessagingBackgroundService.setUserCallbackHandle(longValue2);
                FlutterFirebaseMessagingBackgroundService.startBackgroundIsolate(longValue, fromIntent);
                iVar = l.f(null);
                break;
            case 6:
                iVar = sendMessage((Map) methodCall.arguments());
                break;
            case 7:
            case 8:
                iVar = getPermissions();
                break;
            case 9:
                iVar = getToken();
                break;
            default:
                result.notImplemented();
                return;
        }
        iVar.b(new h(this, result));
    }

    public boolean onNewIntent(Intent intent) {
        if (intent == null || intent.getExtras() == null) {
            return false;
        }
        String string = intent.getExtras().getString("google.message_id");
        if (string == null) {
            string = intent.getExtras().getString("message_id");
        }
        if (string == null) {
            return false;
        }
        w0 w0Var = FlutterFirebaseMessagingReceiver.notifications.get(string);
        if (w0Var == null) {
            w0Var = FlutterFirebaseMessagingStore.getInstance().getFirebaseMessage(string);
        }
        if (w0Var == null) {
            return false;
        }
        this.initialMessage = w0Var;
        FlutterFirebaseMessagingReceiver.notifications.remove(string);
        this.channel.invokeMethod("Messaging#onMessageOpenedApp", FlutterFirebaseMessagingUtils.remoteMessageToMap(w0Var));
        this.mainActivity.setIntent(intent);
        return true;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        this.mainActivity = activityPluginBinding.getActivity();
    }

    public void onReceive(Context context, Intent intent) {
        w0 w0Var;
        Object remoteMessageToMap;
        MethodChannel methodChannel;
        String str;
        String action = intent.getAction();
        if (action != null) {
            if (action.equals("io.flutter.plugins.firebase.messaging.TOKEN")) {
                remoteMessageToMap = intent.getStringExtra("token");
                methodChannel = this.channel;
                str = "Messaging#onTokenRefresh";
            } else if (action.equals("io.flutter.plugins.firebase.messaging.NOTIFICATION") && (w0Var = (w0) intent.getParcelableExtra("notification")) != null) {
                remoteMessageToMap = FlutterFirebaseMessagingUtils.remoteMessageToMap(w0Var);
                methodChannel = this.channel;
                str = "Messaging#onMessage";
            } else {
                return;
            }
            methodChannel.invokeMethod(str, remoteMessageToMap);
        }
    }
}
