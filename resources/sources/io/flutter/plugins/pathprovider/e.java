package io.flutter.plugins.pathprovider;

import io.flutter.plugins.pathprovider.PathProviderPlugin;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {
    public final /* synthetic */ PathProviderPlugin.PathProviderPlatformThread a;

    public /* synthetic */ e(PathProviderPlugin.PathProviderPlatformThread pathProviderPlatformThread) {
        this.a = pathProviderPlatformThread;
    }

    public final Object call() {
        return this.a.e();
    }
}
