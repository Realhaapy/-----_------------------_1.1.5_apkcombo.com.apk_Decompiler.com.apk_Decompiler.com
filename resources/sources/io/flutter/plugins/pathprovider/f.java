package io.flutter.plugins.pathprovider;

import io.flutter.plugins.pathprovider.PathProviderPlugin;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {
    public final /* synthetic */ PathProviderPlugin.PathProviderPlatformThread a;
    public final /* synthetic */ String b;

    public /* synthetic */ f(PathProviderPlugin.PathProviderPlatformThread pathProviderPlatformThread, String str) {
        this.a = pathProviderPlatformThread;
        this.b = str;
    }

    public final Object call() {
        return this.a.i(this.b);
    }
}
