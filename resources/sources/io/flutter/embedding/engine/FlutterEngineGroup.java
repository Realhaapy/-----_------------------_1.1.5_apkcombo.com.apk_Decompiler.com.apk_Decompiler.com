package io.flutter.embedding.engine;

import android.content.Context;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import java.util.ArrayList;
import java.util.List;

public class FlutterEngineGroup {
    final List<FlutterEngine> activeEngines;

    public static class Options {
        private Context context;
        private DartExecutor.DartEntrypoint dartEntrypoint;
        private List<String> dartEntrypointArgs;
        private String initialRoute;

        public Options(Context context2) {
            this.context = context2;
        }

        public Context getContext() {
            return this.context;
        }

        public DartExecutor.DartEntrypoint getDartEntrypoint() {
            return this.dartEntrypoint;
        }

        public List<String> getDartEntrypointArgs() {
            return this.dartEntrypointArgs;
        }

        public String getInitialRoute() {
            return this.initialRoute;
        }

        public Options setDartEntrypoint(DartExecutor.DartEntrypoint dartEntrypoint2) {
            this.dartEntrypoint = dartEntrypoint2;
            return this;
        }

        public Options setDartEntrypointArgs(List<String> list) {
            this.dartEntrypointArgs = list;
            return this;
        }

        public Options setInitialRoute(String str) {
            this.initialRoute = str;
            return this;
        }
    }

    public FlutterEngineGroup(Context context) {
        this(context, (String[]) null);
    }

    public FlutterEngineGroup(Context context, String[] strArr) {
        this.activeEngines = new ArrayList();
        FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
        if (!flutterLoader.initialized()) {
            flutterLoader.startInitialization(context.getApplicationContext());
            flutterLoader.ensureInitializationComplete(context.getApplicationContext(), strArr);
        }
    }

    public FlutterEngine createAndRunDefaultEngine(Context context) {
        return createAndRunEngine(context, (DartExecutor.DartEntrypoint) null);
    }

    public FlutterEngine createAndRunEngine(Context context, DartExecutor.DartEntrypoint dartEntrypoint) {
        return createAndRunEngine(context, dartEntrypoint, (String) null);
    }

    public FlutterEngine createAndRunEngine(Context context, DartExecutor.DartEntrypoint dartEntrypoint, String str) {
        return createAndRunEngine(new Options(context).setDartEntrypoint(dartEntrypoint).setInitialRoute(str));
    }

    public FlutterEngine createAndRunEngine(Options options) {
        final FlutterEngine flutterEngine;
        Context context = options.getContext();
        DartExecutor.DartEntrypoint dartEntrypoint = options.getDartEntrypoint();
        String initialRoute = options.getInitialRoute();
        List<String> dartEntrypointArgs = options.getDartEntrypointArgs();
        if (dartEntrypoint == null) {
            dartEntrypoint = DartExecutor.DartEntrypoint.createDefault();
        }
        if (this.activeEngines.size() == 0) {
            flutterEngine = createEngine(context);
            if (initialRoute != null) {
                flutterEngine.getNavigationChannel().setInitialRoute(initialRoute);
            }
            flutterEngine.getDartExecutor().executeDartEntrypoint(dartEntrypoint, dartEntrypointArgs);
        } else {
            flutterEngine = this.activeEngines.get(0).spawn(context, dartEntrypoint, initialRoute, dartEntrypointArgs);
        }
        this.activeEngines.add(flutterEngine);
        flutterEngine.addEngineLifecycleListener(new FlutterEngine.EngineLifecycleListener() {
            public void onEngineWillDestroy() {
                FlutterEngineGroup.this.activeEngines.remove(flutterEngine);
            }

            public void onPreEngineRestart() {
            }
        });
        return flutterEngine;
    }

    /* access modifiers changed from: package-private */
    public FlutterEngine createEngine(Context context) {
        return new FlutterEngine(context);
    }
}
