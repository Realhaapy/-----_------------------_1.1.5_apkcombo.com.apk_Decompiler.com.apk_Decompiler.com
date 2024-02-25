package io.flutter.plugins.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.m;
import com.google.firebase.components.q;
import com.google.firebase.t.h;
import java.util.Collections;
import java.util.List;

@Keep
public class FlutterFirebaseAppRegistrar implements q {
    public List<m<?>> getComponents() {
        return Collections.singletonList(h.a(BuildConfig.LIBRARY_NAME, BuildConfig.LIBRARY_VERSION));
    }
}