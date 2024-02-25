package f.e.c.a.z.a;

final class p0 {
    private static final n0 a = c();
    private static final n0 b = new o0();

    static n0 a() {
        return a;
    }

    static n0 b() {
        return b;
    }

    private static n0 c() {
        try {
            return (n0) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
