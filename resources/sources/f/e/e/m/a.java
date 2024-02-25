package f.e.e.m;

import f.e.e.c;
import f.e.e.g;
import f.e.e.j.b;
import f.e.e.m.b.d;
import f.e.e.m.b.e;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

public final class a implements g {
    private static b b(byte[][] bArr, int i2) {
        int i3 = i2 * 2;
        b bVar = new b(bArr[0].length + i3, bArr.length + i3);
        bVar.d();
        int h2 = (bVar.h() - i2) - 1;
        int i4 = 0;
        while (i4 < bArr.length) {
            byte[] bArr2 = bArr[i4];
            for (int i5 = 0; i5 < bArr[0].length; i5++) {
                if (bArr2[i5] == 1) {
                    bVar.j(i5 + i2, h2);
                }
            }
            i4++;
            h2--;
        }
        return bVar;
    }

    private static b c(e eVar, String str, int i2, int i3, int i4, int i5) {
        boolean z;
        eVar.e(str, i2);
        byte[][] b = eVar.f().b(1, 4);
        if ((i4 > i3) != (b[0].length < b.length)) {
            b = d(b);
            z = true;
        } else {
            z = false;
        }
        int length = i3 / b[0].length;
        int length2 = i4 / b.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return b(b, i5);
        }
        byte[][] b2 = eVar.f().b(length, length << 2);
        if (z) {
            b2 = d(b2);
        }
        return b(b2, i5);
    }

    private static byte[][] d(byte[][] bArr) {
        int length = bArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = bArr.length;
        iArr[0] = length;
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, iArr);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int length2 = (bArr.length - i2) - 1;
            for (int i3 = 0; i3 < bArr[0].length; i3++) {
                bArr2[i3][length2] = bArr[i2][i3];
            }
        }
        return bArr2;
    }

    public b a(String str, f.e.e.a aVar, int i2, int i3, Map<c, ?> map) {
        int i4;
        int i5;
        if (aVar == f.e.e.a.PDF_417) {
            e eVar = new e();
            int i6 = 30;
            int i7 = 2;
            if (map != null) {
                c cVar = c.PDF417_COMPACT;
                if (map.containsKey(cVar)) {
                    eVar.h(Boolean.valueOf(map.get(cVar).toString()).booleanValue());
                }
                c cVar2 = c.PDF417_COMPACTION;
                if (map.containsKey(cVar2)) {
                    eVar.i(f.e.e.m.b.c.valueOf(map.get(cVar2).toString()));
                }
                c cVar3 = c.PDF417_DIMENSIONS;
                if (map.containsKey(cVar3)) {
                    d dVar = (d) map.get(cVar3);
                    eVar.j(dVar.a(), dVar.c(), dVar.b(), dVar.d());
                }
                c cVar4 = c.MARGIN;
                if (map.containsKey(cVar4)) {
                    i6 = Integer.parseInt(map.get(cVar4).toString());
                }
                c cVar5 = c.ERROR_CORRECTION;
                if (map.containsKey(cVar5)) {
                    i7 = Integer.parseInt(map.get(cVar5).toString());
                }
                c cVar6 = c.CHARACTER_SET;
                if (map.containsKey(cVar6)) {
                    eVar.k(Charset.forName(map.get(cVar6).toString()));
                }
                i4 = i6;
                i5 = i7;
            } else {
                i5 = 2;
                i4 = 30;
            }
            return c(eVar, str, i5, i2, i3, i4);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(aVar)));
    }
}
