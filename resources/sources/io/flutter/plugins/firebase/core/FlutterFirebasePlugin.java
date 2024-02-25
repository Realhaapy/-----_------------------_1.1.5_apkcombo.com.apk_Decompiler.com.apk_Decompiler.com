package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import com.google.firebase.h;
import f.e.a.c.g.i;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Keep
public interface FlutterFirebasePlugin {
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    i<Void> didReinitializeFirebaseCore();

    i<Map<String, Object>> getPluginConstantsForFirebaseApp(h hVar);
}
