package f.c.a;

import io.flutter.plugin.common.MethodChannel;

public final /* synthetic */ class b implements k {
    public final /* synthetic */ MethodChannel.Result a;

    public /* synthetic */ b(MethodChannel.Result result) {
        this.a = result;
    }

    public final void a(String str, String str2) {
        this.a.error(str, str2, (Object) null);
    }
}
