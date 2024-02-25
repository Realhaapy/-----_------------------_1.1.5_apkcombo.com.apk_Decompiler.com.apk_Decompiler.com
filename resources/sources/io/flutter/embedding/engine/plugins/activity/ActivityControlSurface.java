package io.flutter.embedding.engine.plugins.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.e;
import io.flutter.embedding.android.ExclusiveAppComponent;

public interface ActivityControlSurface {
    void attachToActivity(ExclusiveAppComponent<Activity> exclusiveAppComponent, e eVar);

    void detachFromActivity();

    void detachFromActivityForConfigChanges();

    boolean onActivityResult(int i2, int i3, Intent intent);

    void onNewIntent(Intent intent);

    boolean onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);

    void onRestoreInstanceState(Bundle bundle);

    void onSaveInstanceState(Bundle bundle);

    void onUserLeaveHint();
}
