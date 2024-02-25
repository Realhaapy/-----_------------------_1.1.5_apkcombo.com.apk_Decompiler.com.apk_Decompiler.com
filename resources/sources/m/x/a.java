package m.x;

import java.io.InputStream;
import java.io.OutputStream;
import m.y.d.l;

public final class a {
    public static final long a(InputStream inputStream, OutputStream outputStream, int i2) {
        l.d(inputStream, "<this>");
        l.d(outputStream, "out");
        byte[] bArr = new byte[i2];
        int read = inputStream.read(bArr);
        long j2 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j2 += (long) read;
            read = inputStream.read(bArr);
        }
        return j2;
    }

    public static /* synthetic */ long b(InputStream inputStream, OutputStream outputStream, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 8192;
        }
        return a(inputStream, outputStream, i2);
    }
}
