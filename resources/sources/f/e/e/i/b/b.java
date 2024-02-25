package f.e.e.i.b;

import f.e.e.j.a;

final class b extends g {
    private final short c;

    /* renamed from: d  reason: collision with root package name */
    private final short f4460d;

    b(g gVar, int i2, int i3) {
        super(gVar);
        this.c = (short) i2;
        this.f4460d = (short) i3;
    }

    public void c(a aVar, byte[] bArr) {
        int i2;
        int i3 = 0;
        while (true) {
            short s2 = this.f4460d;
            if (i3 < s2) {
                if (i3 == 0 || (i3 == 31 && s2 <= 62)) {
                    int i4 = 5;
                    aVar.e(31, 5);
                    short s3 = this.f4460d;
                    if (s3 > 62) {
                        i2 = s3 - 31;
                        i4 = 16;
                    } else if (i3 == 0) {
                        aVar.e(Math.min(s3, 31), 5);
                    } else {
                        i2 = s3 - 31;
                    }
                    aVar.e(i2, i4);
                }
                aVar.e(bArr[this.c + i3], 8);
                i3++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.c);
        sb.append("::");
        sb.append((this.c + this.f4460d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
