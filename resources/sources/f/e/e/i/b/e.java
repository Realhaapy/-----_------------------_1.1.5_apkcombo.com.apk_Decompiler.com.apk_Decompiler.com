package f.e.e.i.b;

import f.e.e.j.a;

final class e extends g {
    private final short c;

    /* renamed from: d  reason: collision with root package name */
    private final short f4463d;

    e(g gVar, int i2, int i3) {
        super(gVar);
        this.c = (short) i2;
        this.f4463d = (short) i3;
    }

    /* access modifiers changed from: package-private */
    public void c(a aVar, byte[] bArr) {
        aVar.e(this.c, this.f4463d);
    }

    public String toString() {
        short s2 = this.c;
        short s3 = this.f4463d;
        short s4 = (s2 & ((1 << s3) - 1)) | (1 << s3);
        return "<" + Integer.toBinaryString(s4 | (1 << this.f4463d)).substring(1) + '>';
    }
}
