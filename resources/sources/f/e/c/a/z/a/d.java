package f.e.c.a.z.a;

final class d {
    private static final Class<?> a = a("libcore.io.Memory");
    private static final boolean b = (a("org.robolectric.Robolectric") != null);

    private static <T> Class<T> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return a;
    }

    static boolean c() {
        return a != null && !b;
    }
}
