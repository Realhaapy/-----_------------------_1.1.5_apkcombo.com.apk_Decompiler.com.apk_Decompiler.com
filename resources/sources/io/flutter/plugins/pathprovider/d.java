package io.flutter.plugins.pathprovider;

import io.flutter.plugins.pathprovider.PathProviderPlugin;
import java.util.concurrent.Callable;

public final /* synthetic */ class d implements Callable {
    public final /* synthetic */ PathProviderPlugin.PathProviderPlatformThread a;

    public /* synthetic */ d(PathProviderPlugin.PathProviderPlatformThread pathProviderPlatformThread) {
        this.a = pathProviderPlatformThread;
    }

    public final Object call() {
        return this.a.k();
    }
}
