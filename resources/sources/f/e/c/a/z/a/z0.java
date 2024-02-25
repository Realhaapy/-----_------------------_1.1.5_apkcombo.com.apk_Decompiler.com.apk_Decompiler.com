package f.e.c.a.z.a;

final class z0 {
    private static final x0 a = c();
    private static final x0 b = new y0();

    static x0 a() {
        return a;
    }

    static x0 b() {
        return b;
    }

    private static x0 c() {
        try {
            return (x0) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
