package f.h.a;

import io.flutter.plugin.common.MethodCall;

public class b {
    static Integer a(MethodCall methodCall) {
        return (Integer) methodCall.argument("logLevel");
    }

    static boolean b(int i2) {
        return i2 >= 1;
    }

    static boolean c(int i2) {
        return i2 >= 2;
    }
}
