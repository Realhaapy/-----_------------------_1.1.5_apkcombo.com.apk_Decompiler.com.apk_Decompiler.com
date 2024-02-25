package f.c.a;

import f.c.a.n;
import io.flutter.plugin.common.MethodChannel;

public final /* synthetic */ class h implements n.c {
    public final /* synthetic */ MethodChannel.Result a;

    public /* synthetic */ h(MethodChannel.Result result) {
        this.a = result;
    }

    public final void a(boolean z) {
        this.a.success(Boolean.valueOf(z));
    }
}
