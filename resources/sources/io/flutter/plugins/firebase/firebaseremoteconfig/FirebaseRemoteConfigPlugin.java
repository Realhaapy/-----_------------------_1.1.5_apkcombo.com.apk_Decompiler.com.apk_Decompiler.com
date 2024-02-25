package io.flutter.plugins.firebase.firebaseremoteconfig;

import com.google.firebase.h;
import com.google.firebase.remoteconfig.m;
import com.google.firebase.remoteconfig.n;
import com.google.firebase.remoteconfig.p;
import com.google.firebase.remoteconfig.s;
import com.google.firebase.remoteconfig.t;
import f.e.a.c.g.i;
import f.e.a.c.g.l;
import io.flutter.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FirebaseRemoteConfigPlugin implements FlutterFirebasePlugin, MethodChannel.MethodCallHandler, FlutterPlugin {
    static final String METHOD_CHANNEL = "plugins.flutter.io/firebase_remote_config";
    static final String TAG = "FRCPlugin";
    private MethodChannel channel;

    static /* synthetic */ Void a() {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Map c(m mVar) {
        HashMap hashMap = new HashMap(getConfigProperties(mVar));
        hashMap.put("parameters", parseParameters(mVar.e()));
        return hashMap;
    }

    private Map<String, Object> createRemoteConfigValueMap(t tVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("value", tVar.b());
        hashMap.put("source", mapValueSource(tVar.a()));
        return hashMap;
    }

    static /* synthetic */ void d(MethodChannel.Result result, i iVar) {
        String str;
        if (iVar.m()) {
            result.success(iVar.i());
            return;
        }
        Exception h2 = iVar.h();
        HashMap hashMap = new HashMap();
        if (h2 instanceof p) {
            hashMap.put("code", "throttled");
            str = "frequency of requests exceeds throttled limits";
        } else if (h2 instanceof n) {
            hashMap.put("code", "internal");
            str = "internal remote config fetch error";
        } else {
            hashMap.put("code", "unknown");
            str = "unknown remote config error";
        }
        hashMap.put("message", str);
        result.error("firebase_remote_config", h2 != null ? h2.getMessage() : null, hashMap);
    }

    private Map<String, Object> getConfigProperties(m mVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("fetchTimeout", Long.valueOf(mVar.f().b().a()));
        hashMap.put("minimumFetchInterval", Long.valueOf(mVar.f().b().b()));
        hashMap.put("lastFetchTime", Long.valueOf(mVar.f().a()));
        hashMap.put("lastFetchStatus", mapLastFetchStatus(mVar.f().c()));
        Log.d(TAG, "Sending fetchTimeout: " + hashMap.get("fetchTimeout"));
        return hashMap;
    }

    private m getRemoteConfig(Map<String, Object> map) {
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        return m.g(h.m((String) obj));
    }

    private String mapLastFetchStatus(int i2) {
        return i2 != -1 ? i2 != 0 ? i2 != 2 ? "failure" : "throttled" : "noFetchYet" : "success";
    }

    private String mapValueSource(int i2) {
        return i2 != 1 ? i2 != 2 ? "static" : "remote" : "default";
    }

    private Map<String, Object> parseParameters(Map<String, t> map) {
        HashMap hashMap = new HashMap();
        for (String next : map.keySet()) {
            hashMap.put(next, createRemoteConfigValueMap(map.get(next)));
        }
        return hashMap;
    }

    private void setupChannel(BinaryMessenger binaryMessenger) {
        FlutterFirebasePluginRegistry.registerPlugin(METHOD_CHANNEL, this);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, METHOD_CHANNEL);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    private void tearDownChannel() {
        this.channel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.channel = null;
    }

    public i<Void> didReinitializeFirebaseCore() {
        return l.c(a.a);
    }

    public i<Map<String, Object>> getPluginConstantsForFirebaseApp(h hVar) {
        return l.d(FlutterFirebasePlugin.cachedThreadPool, new c(this, m.g(hVar)));
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        setupChannel(flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        tearDownChannel();
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        i iVar;
        Object configProperties;
        m remoteConfig = getRemoteConfig((Map) methodCall.arguments());
        String str = methodCall.method;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1145383109:
                if (str.equals("RemoteConfig#ensureInitialized")) {
                    c = 0;
                    break;
                }
                break;
            case -967766516:
                if (str.equals("RemoteConfig#setConfigSettings")) {
                    c = 1;
                    break;
                }
                break;
            case -824350930:
                if (str.equals("RemoteConfig#getProperties")) {
                    c = 2;
                    break;
                }
                break;
            case 2948543:
                if (str.equals("RemoteConfig#fetch")) {
                    c = 3;
                    break;
                }
                break;
            case 47629262:
                if (str.equals("RemoteConfig#activate")) {
                    c = 4;
                    break;
                }
                break;
            case 120001542:
                if (str.equals("RemoteConfig#getAll")) {
                    c = 5;
                    break;
                }
                break;
            case 198105259:
                if (str.equals("RemoteConfig#fetchAndActivate")) {
                    c = 6;
                    break;
                }
                break;
            case 1069772825:
                if (str.equals("RemoteConfig#setDefaults")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                iVar = l.h(remoteConfig.b());
                break;
            case 1:
                Integer num = (Integer) methodCall.argument("fetchTimeout");
                Objects.requireNonNull(num);
                int intValue = num.intValue();
                Integer num2 = (Integer) methodCall.argument("minimumFetchInterval");
                Objects.requireNonNull(num2);
                int intValue2 = num2.intValue();
                s.b bVar = new s.b();
                bVar.d((long) intValue);
                bVar.e((long) intValue2);
                iVar = remoteConfig.t(bVar.c());
                break;
            case 2:
                configProperties = getConfigProperties(remoteConfig);
                break;
            case 3:
                iVar = remoteConfig.c();
                break;
            case 4:
                iVar = remoteConfig.a();
                break;
            case 5:
                configProperties = parseParameters(remoteConfig.e());
                break;
            case 6:
                iVar = remoteConfig.d();
                break;
            case 7:
                Map map = (Map) methodCall.argument("defaults");
                Objects.requireNonNull(map);
                iVar = remoteConfig.u(map);
                break;
            default:
                result.notImplemented();
                return;
        }
        iVar = l.f(configProperties);
        iVar.b(new b(result));
    }
}
