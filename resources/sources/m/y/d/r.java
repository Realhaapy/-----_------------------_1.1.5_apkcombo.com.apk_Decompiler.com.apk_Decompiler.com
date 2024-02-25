package m.y.d;

import m.b0.c;
import m.b0.d;
import m.b0.e;

public class r {
    public e a(i iVar) {
        return iVar;
    }

    public c b(Class cls) {
        return new e(cls);
    }

    public d c(Class cls, String str) {
        return new n(cls, str);
    }

    public String d(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String e(m mVar) {
        return d(mVar);
    }
}
