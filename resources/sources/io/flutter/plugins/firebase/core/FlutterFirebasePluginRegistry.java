package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import com.google.firebase.h;
import f.e.a.c.g.i;
import f.e.a.c.g.j;
import f.e.a.c.g.l;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

@Keep
public class FlutterFirebasePluginRegistry {
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    static /* synthetic */ void a(j jVar) {
        try {
            for (Map.Entry<String, FlutterFirebasePlugin> value : registeredPlugins.entrySet()) {
                l.a(((FlutterFirebasePlugin) value.getValue()).didReinitializeFirebaseCore());
            }
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    static /* synthetic */ void b(h hVar, j jVar) {
        try {
            Map<String, FlutterFirebasePlugin> map = registeredPlugins;
            HashMap hashMap = new HashMap(map.size());
            for (Map.Entry next : map.entrySet()) {
                hashMap.put((String) next.getKey(), l.a(((FlutterFirebasePlugin) next.getValue()).getPluginConstantsForFirebaseApp(hVar)));
            }
            jVar.c(hashMap);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    static i<Void> didReinitializeFirebaseCore() {
        j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new j(jVar));
        return jVar.a();
    }

    static i<Map<String, Object>> getPluginConstantsForFirebaseApp(h hVar) {
        j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new i(hVar, jVar));
        return jVar.a();
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put(str, flutterFirebasePlugin);
    }
}
