package f.e.e.l;

import f.e.e.a;
import f.e.e.c;
import f.e.e.g;
import f.e.e.j.b;
import java.util.Map;

public final class o implements g {
    private final j a = new j();

    public b a(String str, a aVar, int i2, int i3, Map<c, ?> map) {
        if (aVar == a.UPC_A) {
            return this.a.a("0".concat(String.valueOf(str)), a.EAN_13, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }
}
