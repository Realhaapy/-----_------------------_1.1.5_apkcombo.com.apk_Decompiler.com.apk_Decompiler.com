package f.c.a;

import f.c.a.p;
import io.flutter.plugin.common.MethodChannel;

public final /* synthetic */ class f implements p.a {
    public final /* synthetic */ MethodChannel.Result a;

    public /* synthetic */ f(MethodChannel.Result result) {
        this.a = result;
    }

    public final void a(int i2) {
        this.a.success(Integer.valueOf(i2));
    }
}
