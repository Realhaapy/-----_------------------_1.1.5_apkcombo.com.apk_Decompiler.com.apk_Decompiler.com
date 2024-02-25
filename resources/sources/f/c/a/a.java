package f.c.a;

import f.c.a.n;
import io.flutter.plugin.common.MethodChannel;

public final /* synthetic */ class a implements n.a {
    public final /* synthetic */ MethodChannel.Result a;

    public /* synthetic */ a(MethodChannel.Result result) {
        this.a = result;
    }

    public final void a(int i2) {
        this.a.success(Integer.valueOf(i2));
    }
}
