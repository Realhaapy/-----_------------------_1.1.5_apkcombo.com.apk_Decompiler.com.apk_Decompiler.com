package io.flutter.embedding.engine.plugins.service;

import android.app.Service;
import androidx.lifecycle.e;

public interface ServiceControlSurface {
    void attachToService(Service service, e eVar, boolean z);

    void detachFromService();

    void onMoveToBackground();

    void onMoveToForeground();
}
