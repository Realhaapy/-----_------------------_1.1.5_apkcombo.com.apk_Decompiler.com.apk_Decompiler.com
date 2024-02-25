package m.x;

import java.io.ByteArrayOutputStream;
import m.y.d.l;

final class c extends ByteArrayOutputStream {
    public c(int i2) {
        super(i2);
    }

    public final byte[] a() {
        byte[] bArr = this.buf;
        l.c(bArr, "buf");
        return bArr;
    }
}
