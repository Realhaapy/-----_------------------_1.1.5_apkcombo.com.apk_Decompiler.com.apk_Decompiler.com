package m.y.d;

import m.b0.c;
import m.b0.d;
import m.b0.e;

public class q {
    private static final r a;
    private static final c[] b = new c[0];

    static {
        r rVar = null;
        try {
            rVar = (r) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (rVar == null) {
            rVar = new r();
        }
        a = rVar;
    }

    public static e a(i iVar) {
        a.a(iVar);
        return iVar;
    }

    public static c b(Class cls) {
        return a.b(cls);
    }

    public static d c(Class cls) {
        return a.c(cls, "");
    }

    public static String d(h hVar) {
        return a.d(hVar);
    }

    public static String e(m mVar) {
        return a.e(mVar);
    }
}
