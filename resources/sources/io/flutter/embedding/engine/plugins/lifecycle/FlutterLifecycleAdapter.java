package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.lifecycle.e;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;

public class FlutterLifecycleAdapter {
    private static final String TAG = "FlutterLifecycleAdapter";

    public static e getActivityLifecycle(ActivityPluginBinding activityPluginBinding) {
        return ((HiddenLifecycleReference) activityPluginBinding.getLifecycle()).getLifecycle();
    }
}
