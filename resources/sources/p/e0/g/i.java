package p.e0.g;

import java.net.Proxy;
import p.s;
import p.y;

public final class i {
    public static String a(y yVar, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(yVar.f());
        sb.append(' ');
        boolean b = b(yVar, type);
        s h2 = yVar.h();
        if (b) {
            sb.append(h2);
        } else {
            sb.append(c(h2));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    private static boolean b(y yVar, Proxy.Type type) {
        return !yVar.e() && type == Proxy.Type.HTTP;
    }

    public static String c(s sVar) {
        String g2 = sVar.g();
        String i2 = sVar.i();
        if (i2 == null) {
            return g2;
        }
        return g2 + '?' + i2;
    }
}
