package m.d0;

import java.nio.charset.Charset;
import m.y.d.l;

public final class d {
    public static final Charset a;

    static {
        Charset forName = Charset.forName("UTF-8");
        l.c(forName, "forName(\"UTF-8\")");
        a = forName;
        l.c(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        l.c(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        l.c(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        l.c(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        l.c(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
