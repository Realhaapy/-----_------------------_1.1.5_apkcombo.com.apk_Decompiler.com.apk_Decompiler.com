package f.c.a;

import f.c.a.j;
import io.flutter.plugin.common.MethodChannel;

public final /* synthetic */ class i implements j.a {
    public final /* synthetic */ MethodChannel.Result a;

    public /* synthetic */ i(MethodChannel.Result result) {
        this.a = result;
    }

    public final void a(boolean z) {
        this.a.success(Boolean.valueOf(z));
    }
}
