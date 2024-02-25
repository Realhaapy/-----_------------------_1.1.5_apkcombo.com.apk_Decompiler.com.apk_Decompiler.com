package f.f.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import e.o.a.a;
import e.o.a.b;
import f.f.a.e.c;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class d implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: e  reason: collision with root package name */
    private MethodChannel f4569e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public SharedPreferences f4570f;

    /* renamed from: g  reason: collision with root package name */
    private SharedPreferences f4571g;

    /* renamed from: h  reason: collision with root package name */
    private Charset f4572h;

    /* renamed from: i  reason: collision with root package name */
    private c f4573i;

    /* renamed from: j  reason: collision with root package name */
    private Context f4574j;

    /* renamed from: k  reason: collision with root package name */
    private HandlerThread f4575k;

    /* renamed from: l  reason: collision with root package name */
    private Handler f4576l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f4577m = false;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f4578n = false;

    static class a implements MethodChannel.Result {
        private final MethodChannel.Result a;
        private final Handler b = new Handler(Looper.getMainLooper());

        a(MethodChannel.Result result) {
            this.a = result;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void b(String str, String str2, Object obj) {
            this.a.error(str, str2, obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void d(Object obj) {
            this.a.success(obj);
        }

        public void error(String str, String str2, Object obj) {
            this.b.post(new a(this, str, str2, obj));
        }

        public void notImplemented() {
            Handler handler = this.b;
            MethodChannel.Result result = this.a;
            Objects.requireNonNull(result);
            handler.post(new c(result));
        }

        public void success(Object obj) {
            this.b.post(new b(this, obj));
        }
    }

    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final MethodCall f4579e;

        /* renamed from: f  reason: collision with root package name */
        private final MethodChannel.Result f4580f;

        b(MethodCall methodCall, MethodChannel.Result result) {
            this.f4579e = methodCall;
            this.f4580f = result;
        }

        public void run() {
            MethodChannel.Result result;
            try {
                String str = this.f4579e.method;
                char c = 65535;
                switch (str.hashCode()) {
                    case -1335458389:
                        if (str.equals("delete")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -358737930:
                        if (str.equals("deleteAll")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 3496342:
                        if (str.equals("read")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 113399775:
                        if (str.equals("write")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 208013248:
                        if (str.equals("containsKey")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1080375339:
                        if (str.equals("readAll")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                Object obj = null;
                if (c == 0) {
                    String a = d.this.q(this.f4579e);
                    Map map = (Map) this.f4579e.arguments;
                    d.this.p(map);
                    String str2 = (String) map.get("value");
                    if (str2 != null) {
                        d dVar = d.this;
                        dVar.x(a, str2, dVar.f4577m);
                        result = this.f4580f;
                    } else {
                        this.f4580f.error("null", (String) null, (Object) null);
                        return;
                    }
                } else if (c == 1) {
                    String a2 = d.this.q(this.f4579e);
                    d.this.p((Map) this.f4579e.arguments);
                    if (d.this.f4570f.contains(a2)) {
                        d dVar2 = d.this;
                        obj = dVar2.t(a2, dVar2.f4577m);
                        result = this.f4580f;
                    } else {
                        result = this.f4580f;
                    }
                } else if (c == 2) {
                    d.this.p((Map) this.f4579e.arguments);
                    d dVar3 = d.this;
                    obj = dVar3.u(dVar3.f4577m);
                    result = this.f4580f;
                } else if (c == 3) {
                    String a3 = d.this.q(this.f4579e);
                    d.this.p((Map) this.f4579e.arguments);
                    boolean contains = d.this.f4570f.contains(a3);
                    result = this.f4580f;
                    obj = Boolean.valueOf(contains);
                } else if (c == 4) {
                    String a4 = d.this.q(this.f4579e);
                    d.this.p((Map) this.f4579e.arguments);
                    d.this.n(a4);
                    result = this.f4580f;
                } else if (c != 5) {
                    this.f4580f.notImplemented();
                    return;
                } else {
                    d.this.p((Map) this.f4579e.arguments);
                    d.this.o();
                    result = this.f4580f;
                }
                result.success(obj);
            } catch (Exception e2) {
                if (d.this.f4578n) {
                    d.this.o();
                    this.f4580f.success("Data has been reset");
                    return;
                }
                StringWriter stringWriter = new StringWriter();
                e2.printStackTrace(new PrintWriter(stringWriter));
                this.f4580f.error("Exception encountered", this.f4579e.method, stringWriter.toString());
            }
        }
    }

    private String k(String str) {
        return "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg_" + str;
    }

    private void l(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
            Object value = next.getValue();
            String str = (String) next.getKey();
            if ((value instanceof String) && str.contains("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg")) {
                try {
                    sharedPreferences2.edit().putString(str, m((String) value)).apply();
                    sharedPreferences.edit().remove(str).apply();
                } catch (Exception e2) {
                    Log.e("FlutterSecureStoragePl", "Data migration failed", e2);
                }
            }
        }
    }

    private String m(String str) {
        if (str == null) {
            return null;
        }
        return new String(this.f4573i.b(Base64.decode(str, 0)), this.f4572h);
    }

    /* access modifiers changed from: private */
    public void n(String str) {
        SharedPreferences.Editor edit = this.f4570f.edit();
        edit.remove(str);
        edit.apply();
    }

    /* access modifiers changed from: private */
    public void o() {
        this.f4570f.edit().clear().apply();
    }

    /* access modifiers changed from: private */
    public void p(Map<String, Object> map) {
        Map map2 = (Map) map.get("options");
        if (map2 != null) {
            this.f4577m = w(map2);
            this.f4578n = v(map2);
            if (this.f4573i == null) {
                try {
                    this.f4573i = new f.f.a.e.b(this.f4574j);
                } catch (Exception e2) {
                    Log.e("FlutterSecureStoragePl", "StorageCipher initialization failed", e2);
                }
            }
            if (!this.f4577m || Build.VERSION.SDK_INT < 23) {
                this.f4570f = this.f4571g;
                return;
            }
            try {
                this.f4570f = s(this.f4574j);
            } catch (Exception e3) {
                Log.e("FlutterSecureStoragePl", "EncryptedSharedPreferences initialization failed", e3);
            }
            l(this.f4571g, this.f4570f);
        }
    }

    /* access modifiers changed from: private */
    public String q(MethodCall methodCall) {
        return k((String) ((Map) methodCall.arguments).get("key"));
    }

    private SharedPreferences s(Context context) {
        b.a aVar = new b.a(context);
        aVar.c(new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setEncryptionPaddings(new String[]{"NoPadding"}).setBlockModes(new String[]{"GCM"}).setKeySize(256).build());
        return e.o.a.a.a(context, "FlutterSecureStorage", aVar.a(), a.d.AES256_SIV, a.e.AES256_GCM);
    }

    /* access modifiers changed from: private */
    public String t(String str, boolean z) {
        String string = this.f4570f.getString(str, (String) null);
        return z ? string : m(string);
    }

    /* access modifiers changed from: private */
    public Map<String, String> u(boolean z) {
        Map<String, ?> all = this.f4570f.getAll();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : all.entrySet()) {
            if (((String) next.getKey()).contains("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg")) {
                String replaceFirst = ((String) next.getKey()).replaceFirst("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg_", "");
                String str = (String) next.getValue();
                if (!z) {
                    str = m(str);
                }
                hashMap.put(replaceFirst, str);
            }
        }
        return hashMap;
    }

    private boolean v(Map<String, Object> map) {
        return map.containsKey("resetOnError") && map.get("resetOnError").equals("true");
    }

    private boolean w(Map<String, Object> map) {
        return Build.VERSION.SDK_INT >= 23 && map.containsKey("encryptedSharedPreferences") && map.get("encryptedSharedPreferences").equals("true");
    }

    /* access modifiers changed from: private */
    public void x(String str, String str2, boolean z) {
        SharedPreferences.Editor edit = this.f4570f.edit();
        if (!z) {
            str2 = Base64.encodeToString(this.f4573i.a(str2.getBytes(this.f4572h)), 0);
        }
        edit.putString(str, str2);
        edit.apply();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        r(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        if (this.f4569e != null) {
            this.f4575k.quitSafely();
            this.f4575k = null;
            this.f4569e.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
            this.f4569e = null;
        }
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        this.f4576l.post(new b(methodCall, new a(result)));
    }

    public void r(BinaryMessenger binaryMessenger, Context context) {
        try {
            this.f4574j = context.getApplicationContext();
            this.f4571g = context.getSharedPreferences("FlutterSecureStorage", 0);
            this.f4572h = Charset.forName("UTF-8");
            HandlerThread handlerThread = new HandlerThread("com.it_nomads.fluttersecurestorage.worker");
            this.f4575k = handlerThread;
            handlerThread.start();
            this.f4576l = new Handler(this.f4575k.getLooper());
            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.it_nomads.com/flutter_secure_storage");
            this.f4569e = methodChannel;
            methodChannel.setMethodCallHandler(this);
        } catch (Exception e2) {
            Log.e("FlutterSecureStoragePl", "Registration failed", e2);
        }
    }
}
