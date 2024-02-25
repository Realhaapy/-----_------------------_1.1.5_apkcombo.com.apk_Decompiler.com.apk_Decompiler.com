package f.d.a.d;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import m.y.d.l;

public final class a {
    public static final a a = new a();

    private a() {
    }

    private final int a(byte[] bArr) {
        return new e.i.a.a((InputStream) new ByteArrayInputStream(bArr)).n();
    }

    public final int b(byte[] bArr) {
        l.d(bArr, "_bytes");
        try {
            return a(bArr);
        } catch (Exception unused) {
            return 0;
        }
    }
}
