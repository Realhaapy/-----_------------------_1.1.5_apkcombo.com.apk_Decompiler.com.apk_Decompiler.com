package m.y.d;

import java.util.Arrays;
import m.r;

public class l {
    private l() {
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj == null) {
            k();
            throw null;
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str + " must not be null");
            h(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            l(str);
            throw null;
        }
    }

    public static int e(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int f(long j2, long j3) {
        int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        return i2 == 0 ? 0 : 1;
    }

    private static String g(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    private static <T extends Throwable> T h(T t) {
        i(t, l.class.getName());
        return t;
    }

    static <T extends Throwable> T i(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
        return t;
    }

    public static String j(String str, Object obj) {
        return str + obj;
    }

    public static void k() {
        NullPointerException nullPointerException = new NullPointerException();
        h(nullPointerException);
        throw nullPointerException;
    }

    private static void l(String str) {
        NullPointerException nullPointerException = new NullPointerException(g(str));
        h(nullPointerException);
        throw nullPointerException;
    }

    public static void m(String str) {
        r rVar = new r(str);
        h(rVar);
        throw rVar;
    }

    public static void n(String str) {
        m("lateinit property " + str + " has not been initialized");
        throw null;
    }
}
