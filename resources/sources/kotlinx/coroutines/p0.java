package kotlinx.coroutines;

import kotlinx.coroutines.internal.g;
import m.m;
import m.n;
import m.v.d;

public final class p0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(d<?> dVar) {
        String str;
        if (dVar instanceof g) {
            return dVar.toString();
        }
        try {
            m.a aVar = m.f5014e;
            String str2 = dVar + '@' + b(dVar);
            m.a(str2);
            str = str2;
        } catch (Throwable th) {
            m.a aVar2 = m.f5014e;
            Object a = n.a(th);
            m.a(a);
            str = a;
        }
        Throwable b = m.b(str);
        String str3 = str;
        if (b != null) {
            str3 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) str3;
    }
}
