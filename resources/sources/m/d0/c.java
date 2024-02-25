package m.d0;

class c extends b {
    public static int d(char c) {
        int b = b.b(c, 10);
        if (b >= 0) {
            return b;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    public static final boolean e(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
