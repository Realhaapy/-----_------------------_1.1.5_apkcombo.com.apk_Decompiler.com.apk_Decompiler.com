package m.d0;

import m.y.d.l;

class s extends r {
    public static final String j0(String str, int i2) {
        l.d(str, "<this>");
        if (i2 >= 0) {
            String substring = str.substring(f.c(i2, str.length()));
            l.c(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }
}
