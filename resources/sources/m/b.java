package m;

import java.io.PrintWriter;
import java.io.StringWriter;
import m.y.d.l;

class b {
    public static void a(Throwable th, Throwable th2) {
        l.d(th, "<this>");
        l.d(th2, "exception");
        if (th != th2) {
            m.w.b.a.a(th, th2);
        }
    }

    public static String b(Throwable th) {
        l.d(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        l.c(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
