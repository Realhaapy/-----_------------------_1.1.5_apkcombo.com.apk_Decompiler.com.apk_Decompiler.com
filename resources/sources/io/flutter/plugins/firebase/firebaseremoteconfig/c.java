package io.flutter.plugins.firebase.firebaseremoteconfig;

import com.google.firebase.remoteconfig.m;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ FirebaseRemoteConfigPlugin a;
    public final /* synthetic */ m b;

    public /* synthetic */ c(FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, m mVar) {
        this.a = firebaseRemoteConfigPlugin;
        this.b = mVar;
    }

    public final Object call() {
        return this.a.c(this.b);
    }
}
