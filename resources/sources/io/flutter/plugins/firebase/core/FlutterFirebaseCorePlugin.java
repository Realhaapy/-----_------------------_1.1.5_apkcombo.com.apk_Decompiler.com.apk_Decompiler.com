package io.flutter.plugins.firebase.core;

import android.content.Context;
import com.google.firebase.h;
import com.google.firebase.k;
import f.e.a.c.g.i;
import f.e.a.c.g.j;
import f.e.a.c.g.l;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlutterFirebaseCorePlugin implements FlutterPlugin, GeneratedAndroidFirebaseCore.FirebaseCoreHostApi, GeneratedAndroidFirebaseCore.FirebaseAppHostApi {
    private Context applicationContext;
    private boolean coreInitialized = false;

    static /* synthetic */ void a(String str, j jVar) {
        try {
            try {
                h.m(str).g();
            } catch (IllegalStateException unused) {
            }
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void c(h hVar, j jVar) {
        try {
            GeneratedAndroidFirebaseCore.PigeonInitializeResponse.Builder builder = new GeneratedAndroidFirebaseCore.PigeonInitializeResponse.Builder();
            builder.setName(hVar.n());
            builder.setOptions(firebaseOptionsToMap(hVar.o()));
            builder.setIsAutomaticDataCollectionEnabled(Boolean.valueOf(hVar.u()));
            builder.setPluginConstants((Map) l.a(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(hVar)));
            jVar.c(builder.build());
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x003d */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void e(io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.PigeonFirebaseOptions r3, java.lang.String r4, f.e.a.c.g.j r5) {
        /*
            r2 = this;
            com.google.firebase.k$b r0 = new com.google.firebase.k$b     // Catch:{ Exception -> 0x0051 }
            r0.<init>()     // Catch:{ Exception -> 0x0051 }
            java.lang.String r1 = r3.getApiKey()     // Catch:{ Exception -> 0x0051 }
            r0.b(r1)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r1 = r3.getAppId()     // Catch:{ Exception -> 0x0051 }
            r0.c(r1)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r1 = r3.getDatabaseURL()     // Catch:{ Exception -> 0x0051 }
            r0.d(r1)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r1 = r3.getMessagingSenderId()     // Catch:{ Exception -> 0x0051 }
            r0.f(r1)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r1 = r3.getProjectId()     // Catch:{ Exception -> 0x0051 }
            r0.g(r1)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r1 = r3.getStorageBucket()     // Catch:{ Exception -> 0x0051 }
            r0.h(r1)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r3 = r3.getTrackingId()     // Catch:{ Exception -> 0x0051 }
            r0.e(r3)     // Catch:{ Exception -> 0x0051 }
            com.google.firebase.k r3 = r0.a()     // Catch:{ Exception -> 0x0051 }
            android.os.Looper.prepare()     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            android.content.Context r0 = r2.applicationContext     // Catch:{ Exception -> 0x0051 }
            com.google.firebase.h r3 = com.google.firebase.h.t(r0, r3, r4)     // Catch:{ Exception -> 0x0051 }
            f.e.a.c.g.i r3 = r2.firebaseAppToMap(r3)     // Catch:{ Exception -> 0x0051 }
            java.lang.Object r3 = f.e.a.c.g.l.a(r3)     // Catch:{ Exception -> 0x0051 }
            io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore$PigeonInitializeResponse r3 = (io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.PigeonInitializeResponse) r3     // Catch:{ Exception -> 0x0051 }
            r5.c(r3)     // Catch:{ Exception -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            r3 = move-exception
            r5.b(r3)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin.e(io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore$PigeonFirebaseOptions, java.lang.String, f.e.a.c.g.j):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void g(j jVar) {
        try {
            if (!this.coreInitialized) {
                this.coreInitialized = true;
            } else {
                l.a(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            }
            List<h> k2 = h.k(this.applicationContext);
            ArrayList arrayList = new ArrayList(k2.size());
            for (h firebaseAppToMap : k2) {
                arrayList.add((GeneratedAndroidFirebaseCore.PigeonInitializeResponse) l.a(firebaseAppToMap(firebaseAppToMap)));
            }
            jVar.c(arrayList);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    private i<GeneratedAndroidFirebaseCore.PigeonInitializeResponse> firebaseAppToMap(h hVar) {
        j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new h(this, hVar, jVar));
        return jVar.a();
    }

    private GeneratedAndroidFirebaseCore.PigeonFirebaseOptions firebaseOptionsToMap(k kVar) {
        GeneratedAndroidFirebaseCore.PigeonFirebaseOptions.Builder builder = new GeneratedAndroidFirebaseCore.PigeonFirebaseOptions.Builder();
        builder.setApiKey(kVar.b());
        builder.setAppId(kVar.c());
        if (kVar.f() != null) {
            builder.setMessagingSenderId(kVar.f());
        }
        if (kVar.g() != null) {
            builder.setProjectId(kVar.g());
        }
        builder.setDatabaseURL(kVar.d());
        builder.setStorageBucket(kVar.h());
        builder.setTrackingId(kVar.e());
        return builder.build();
    }

    static /* synthetic */ void h(GeneratedAndroidFirebaseCore.Result result, i iVar) {
        if (iVar.m()) {
            result.success(iVar.i());
        } else {
            result.error(iVar.h());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void j(j jVar) {
        try {
            k a = k.a(this.applicationContext);
            if (a == null) {
                jVar.c(null);
            } else {
                jVar.c(firebaseOptionsToMap(a));
            }
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    static /* synthetic */ void k(String str, Boolean bool, j jVar) {
        try {
            h.m(str).E(bool);
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    static /* synthetic */ void l(String str, Boolean bool, j jVar) {
        try {
            h.m(str).D(bool.booleanValue());
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    private <T> void listenToResponse(j<T> jVar, GeneratedAndroidFirebaseCore.Result<T> result) {
        jVar.a().b(new d(result));
    }

    public void delete(String str, GeneratedAndroidFirebaseCore.Result<Void> result) {
        j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new e(str, jVar));
        listenToResponse(jVar, result);
    }

    public void initializeApp(String str, GeneratedAndroidFirebaseCore.PigeonFirebaseOptions pigeonFirebaseOptions, GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.PigeonInitializeResponse> result) {
        j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, pigeonFirebaseOptions, str, jVar));
        listenToResponse(jVar, result);
    }

    public void initializeCore(GeneratedAndroidFirebaseCore.Result<List<GeneratedAndroidFirebaseCore.PigeonInitializeResponse>> result) {
        j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(this, jVar));
        listenToResponse(jVar, result);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        s.e(flutterPluginBinding.getBinaryMessenger(), this);
        q.e(flutterPluginBinding.getBinaryMessenger(), this);
        this.applicationContext = flutterPluginBinding.getApplicationContext();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.applicationContext = null;
        s.e(flutterPluginBinding.getBinaryMessenger(), (GeneratedAndroidFirebaseCore.FirebaseCoreHostApi) null);
        q.e(flutterPluginBinding.getBinaryMessenger(), (GeneratedAndroidFirebaseCore.FirebaseAppHostApi) null);
    }

    public void optionsFromResource(GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.PigeonFirebaseOptions> result) {
        j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(this, jVar));
        listenToResponse(jVar, result);
    }

    public void setAutomaticDataCollectionEnabled(String str, Boolean bool, GeneratedAndroidFirebaseCore.Result<Void> result) {
        j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new a(str, bool, jVar));
        listenToResponse(jVar, result);
    }

    public void setAutomaticResourceManagementEnabled(String str, Boolean bool, GeneratedAndroidFirebaseCore.Result<Void> result) {
        j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(str, bool, jVar));
        listenToResponse(jVar, result);
    }
}
