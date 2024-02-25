package kotlinx.coroutines.internal;

import m.m;
import m.n;

public final class k {
    private static final boolean a;

    static {
        Object obj;
        try {
            m.a aVar = m.f5014e;
            obj = Class.forName("android.os.Build");
            m.a(obj);
        } catch (Throwable th) {
            m.a aVar2 = m.f5014e;
            obj = n.a(th);
            m.a(obj);
        }
        a = m.d(obj);
    }

    public static final boolean a() {
        return a;
    }
}
