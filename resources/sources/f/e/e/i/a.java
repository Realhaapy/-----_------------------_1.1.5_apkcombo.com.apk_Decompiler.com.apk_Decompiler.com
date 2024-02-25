package f.e.e.i;

import f.e.e.g;
import f.e.e.i.b.c;
import f.e.e.j.b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public final class a implements g {
    private static b b(String str, f.e.e.a aVar, int i2, int i3, Charset charset, int i4, int i5) {
        if (aVar == f.e.e.a.AZTEC) {
            return c(c.d(str.getBytes(charset), i4, i5), i2, i3);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(aVar)));
    }

    private static b c(f.e.e.i.b.a aVar, int i2, int i3) {
        b a = aVar.a();
        if (a != null) {
            int i4 = a.i();
            int h2 = a.h();
            int max = Math.max(i2, i4);
            int max2 = Math.max(i3, h2);
            int min = Math.min(max / i4, max2 / h2);
            int i5 = (max - (i4 * min)) / 2;
            int i6 = (max2 - (h2 * min)) / 2;
            b bVar = new b(max, max2);
            int i7 = 0;
            while (i7 < h2) {
                int i8 = i5;
                int i9 = 0;
                while (i9 < i4) {
                    if (a.f(i9, i7)) {
                        bVar.k(i8, i6, min, min);
                    }
                    i9++;
                    i8 += min;
                }
                i7++;
                i6 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    public b a(String str, f.e.e.a aVar, int i2, int i3, Map<f.e.e.c, ?> map) {
        int i4;
        int i5;
        Charset charset;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        int i6 = 33;
        if (map != null) {
            f.e.e.c cVar = f.e.e.c.CHARACTER_SET;
            if (map.containsKey(cVar)) {
                charset2 = Charset.forName(map.get(cVar).toString());
            }
            f.e.e.c cVar2 = f.e.e.c.ERROR_CORRECTION;
            if (map.containsKey(cVar2)) {
                i6 = Integer.parseInt(map.get(cVar2).toString());
            }
            f.e.e.c cVar3 = f.e.e.c.AZTEC_LAYERS;
            if (map.containsKey(cVar3)) {
                charset = charset2;
                i5 = i6;
                i4 = Integer.parseInt(map.get(cVar3).toString());
                return b(str, aVar, i2, i3, charset, i5, i4);
            }
            charset = charset2;
            i5 = i6;
        } else {
            charset = charset2;
            i5 = 33;
        }
        i4 = 0;
        return b(str, aVar, i2, i3, charset, i5, i4);
    }
}
