package io.flutter.plugins.pathprovider;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import f.e.b.b.a.b;
import f.e.b.b.a.c;
import f.e.b.b.a.f;
import f.e.b.b.a.g;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodCodec;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.common.StandardMethodCodec;
import io.flutter.util.PathUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class PathProviderPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {
    static final String TAG = "PathProviderPlugin";
    private MethodChannel channel;
    private Context context;
    private PathProviderImpl impl;

    private class PathProviderBackgroundThread implements PathProviderImpl {
        private PathProviderBackgroundThread() {
        }

        public void getApplicationDocumentsDirectory(MethodChannel.Result result) {
            result.success(PathProviderPlugin.this.getPathProviderApplicationDocumentsDirectory());
        }

        public void getApplicationSupportDirectory(MethodChannel.Result result) {
            result.success(PathProviderPlugin.this.getApplicationSupportDirectory());
        }

        public void getExternalCacheDirectories(MethodChannel.Result result) {
            result.success(PathProviderPlugin.this.getPathProviderExternalCacheDirectories());
        }

        public void getExternalStorageDirectories(String str, MethodChannel.Result result) {
            result.success(PathProviderPlugin.this.getPathProviderExternalStorageDirectories(str));
        }

        public void getStorageDirectory(MethodChannel.Result result) {
            result.success(PathProviderPlugin.this.getPathProviderStorageDirectory());
        }

        public void getTemporaryDirectory(MethodChannel.Result result) {
            result.success(PathProviderPlugin.this.getPathProviderTemporaryDirectory());
        }
    }

    private interface PathProviderImpl {
        void getApplicationDocumentsDirectory(MethodChannel.Result result);

        void getApplicationSupportDirectory(MethodChannel.Result result);

        void getExternalCacheDirectories(MethodChannel.Result result);

        void getExternalStorageDirectories(String str, MethodChannel.Result result);

        void getStorageDirectory(MethodChannel.Result result);

        void getTemporaryDirectory(MethodChannel.Result result);
    }

    private class PathProviderPlatformThread implements PathProviderImpl {
        private final Executor executor;
        private final Executor uiThreadExecutor;

        private PathProviderPlatformThread() {
            this.uiThreadExecutor = new UiThreadExecutor();
            g gVar = new g();
            gVar.e("path-provider-background-%d");
            gVar.f(5);
            this.executor = Executors.newSingleThreadExecutor(gVar.b());
        }

        static /* synthetic */ void a(f fVar, Callable callable) {
            try {
                fVar.z(callable.call());
            } catch (Throwable th) {
                fVar.A(th);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ String c() {
            return PathProviderPlugin.this.getPathProviderApplicationDocumentsDirectory();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ String e() {
            return PathProviderPlugin.this.getApplicationSupportDirectory();
        }

        private <T> void executeInBackground(Callable<T> callable, final MethodChannel.Result result) {
            f C = f.C();
            c.a(C, new b<T>() {
                public void onFailure(Throwable th) {
                    result.error(th.getClass().getName(), th.getMessage(), (Object) null);
                }

                public void onSuccess(T t) {
                    result.success(t);
                }
            }, this.uiThreadExecutor);
            this.executor.execute(new a(C, callable));
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ List g() {
            return PathProviderPlugin.this.getPathProviderExternalCacheDirectories();
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ List i(String str) {
            return PathProviderPlugin.this.getPathProviderExternalStorageDirectories(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ String k() {
            return PathProviderPlugin.this.getPathProviderStorageDirectory();
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ String m() {
            return PathProviderPlugin.this.getPathProviderTemporaryDirectory();
        }

        public void getApplicationDocumentsDirectory(MethodChannel.Result result) {
            executeInBackground(new g(this), result);
        }

        public void getApplicationSupportDirectory(MethodChannel.Result result) {
            executeInBackground(new e(this), result);
        }

        public void getExternalCacheDirectories(MethodChannel.Result result) {
            executeInBackground(new b(this), result);
        }

        public void getExternalStorageDirectories(String str, MethodChannel.Result result) {
            executeInBackground(new f(this, str), result);
        }

        public void getStorageDirectory(MethodChannel.Result result) {
            executeInBackground(new d(this), result);
        }

        public void getTemporaryDirectory(MethodChannel.Result result) {
            executeInBackground(new c(this), result);
        }
    }

    private static class UiThreadExecutor implements Executor {
        private final Handler handler;

        private UiThreadExecutor() {
            this.handler = new Handler(Looper.getMainLooper());
        }

        public void execute(Runnable runnable) {
            this.handler.post(runnable);
        }
    }

    /* access modifiers changed from: private */
    public String getApplicationSupportDirectory() {
        return PathUtils.getFilesDir(this.context);
    }

    /* access modifiers changed from: private */
    public String getPathProviderApplicationDocumentsDirectory() {
        return PathUtils.getDataDirectory(this.context);
    }

    /* access modifiers changed from: private */
    public List<String> getPathProviderExternalCacheDirectories() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.context.getExternalCacheDirs()) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalCacheDir = this.context.getExternalCacheDir();
            if (externalCacheDir != null) {
                arrayList.add(externalCacheDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public List<String> getPathProviderExternalStorageDirectories(String str) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.context.getExternalFilesDirs(str)) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalFilesDir = this.context.getExternalFilesDir(str);
            if (externalFilesDir != null) {
                arrayList.add(externalFilesDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public String getPathProviderStorageDirectory() {
        File externalFilesDir = this.context.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    /* access modifiers changed from: private */
    public String getPathProviderTemporaryDirectory() {
        return this.context.getCacheDir().getPath();
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        new PathProviderPlugin().setup(registrar.messenger(), registrar.context());
    }

    private void setup(BinaryMessenger binaryMessenger, Context context2) {
        try {
            Class<?> cls = Class.forName("io.flutter.plugin.common.MethodChannel");
            Class<?> cls2 = Class.forName("io.flutter.plugin.common.BinaryMessenger$TaskQueue");
            Object invoke = binaryMessenger.getClass().getMethod("makeBackgroundTaskQueue", new Class[0]).invoke(binaryMessenger, new Object[0]);
            this.channel = (MethodChannel) cls.getConstructor(new Class[]{BinaryMessenger.class, String.class, MethodCodec.class, cls2}).newInstance(new Object[]{binaryMessenger, "plugins.flutter.io/path_provider", StandardMethodCodec.INSTANCE, invoke});
            this.impl = new PathProviderBackgroundThread();
            Log.d(TAG, "Use TaskQueues.");
        } catch (Exception unused) {
            this.channel = new MethodChannel(binaryMessenger, "plugins.flutter.io/path_provider");
            this.impl = new PathProviderPlatformThread();
            Log.d(TAG, "Don't use TaskQueues.");
        }
        this.context = context2;
        this.channel.setMethodCallHandler(this);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        setup(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.channel = null;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1832373352:
                if (str.equals("getApplicationSupportDirectory")) {
                    c = 0;
                    break;
                }
                break;
            case -1208689078:
                if (str.equals("getExternalCacheDirectories")) {
                    c = 1;
                    break;
                }
                break;
            case 299667825:
                if (str.equals("getExternalStorageDirectories")) {
                    c = 2;
                    break;
                }
                break;
            case 1200320591:
                if (str.equals("getApplicationDocumentsDirectory")) {
                    c = 3;
                    break;
                }
                break;
            case 1252916648:
                if (str.equals("getStorageDirectory")) {
                    c = 4;
                    break;
                }
                break;
            case 1711844626:
                if (str.equals("getTemporaryDirectory")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.impl.getApplicationSupportDirectory(result);
                return;
            case 1:
                this.impl.getExternalCacheDirectories(result);
                return;
            case 2:
                this.impl.getExternalStorageDirectories(StorageDirectoryMapper.androidType((Integer) methodCall.argument("type")), result);
                return;
            case 3:
                this.impl.getApplicationDocumentsDirectory(result);
                return;
            case 4:
                this.impl.getStorageDirectory(result);
                return;
            case 5:
                this.impl.getTemporaryDirectory(result);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
