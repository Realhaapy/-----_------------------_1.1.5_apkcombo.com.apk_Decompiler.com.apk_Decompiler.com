package f.h.a.f;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

public class e extends a {
    final MethodCall a;
    final a b;

    class a implements g {
        final MethodChannel.Result a;

        a(e eVar, MethodChannel.Result result) {
            this.a = result;
        }

        public void error(String str, String str2, Object obj) {
            this.a.error(str, str2, obj);
        }

        public void success(Object obj) {
            this.a.success(obj);
        }
    }

    public e(MethodCall methodCall, MethodChannel.Result result) {
        this.a = methodCall;
        this.b = new a(this, result);
    }

    public <T> T a(String str) {
        return this.a.argument(str);
    }

    public g i() {
        return this.b;
    }
}
