package f.e.d.y;

import java.lang.reflect.Type;

public final class k {
    public static boolean a(Type type) {
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }
}
