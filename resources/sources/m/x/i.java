package m.x;

import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import m.y.d.l;

public final class i {
    public static final long a(Reader reader, Writer writer, int i2) {
        l.d(reader, "<this>");
        l.d(writer, "out");
        char[] cArr = new char[i2];
        int read = reader.read(cArr);
        long j2 = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j2 += (long) read;
            read = reader.read(cArr);
        }
        return j2;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 8192;
        }
        return a(reader, writer, i2);
    }

    public static final String c(Reader reader) {
        l.d(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, (Object) null);
        String stringWriter2 = stringWriter.toString();
        l.c(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }
}
