package f.c.a;

import f.c.a.n;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;

public final /* synthetic */ class g implements n.b {
    public final /* synthetic */ MethodChannel.Result a;

    public /* synthetic */ g(MethodChannel.Result result) {
        this.a = result;
    }

    public final void a(Map map) {
        this.a.success(map);
    }
}
