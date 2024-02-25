package io.flutter.plugins.pathprovider;

import io.flutter.plugins.pathprovider.PathProviderPlugin;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {
    public final /* synthetic */ PathProviderPlugin.PathProviderPlatformThread a;

    public /* synthetic */ b(PathProviderPlugin.PathProviderPlatformThread pathProviderPlatformThread) {
        this.a = pathProviderPlatformThread;
    }

    public final Object call() {
        return this.a.g();
    }
}
