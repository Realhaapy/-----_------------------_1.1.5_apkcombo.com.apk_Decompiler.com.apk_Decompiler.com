package f.e.c.a.z.a;

final class p {
    static final Class<?> a = c();

    public static q a() {
        q b = b("getEmptyRegistry");
        return b != null ? b : q.f4163d;
    }

    private static final q b(String str) {
        Class<?> cls = a;
        if (cls == null) {
            return null;
        }
        try {
            return (q) cls.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
