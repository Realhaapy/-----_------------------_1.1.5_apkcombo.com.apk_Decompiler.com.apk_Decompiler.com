package io.flutter.plugins.pathprovider;

import io.flutter.plugins.pathprovider.PathProviderPlugin;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {
    public final /* synthetic */ PathProviderPlugin.PathProviderPlatformThread a;

    public /* synthetic */ g(PathProviderPlugin.PathProviderPlatformThread pathProviderPlatformThread) {
        this.a = pathProviderPlatformThread;
    }

    public final Object call() {
        return this.a.c();
    }
}
