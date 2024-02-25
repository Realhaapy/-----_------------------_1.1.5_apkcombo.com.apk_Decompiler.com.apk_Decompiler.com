package m.y;

import m.b0.c;
import m.y.d.d;
import m.y.d.l;
import m.y.d.q;

public final class a {
    public static final <T> Class<T> a(c<T> cVar) {
        String name;
        l.d(cVar, "<this>");
        Class<?> b = ((d) cVar).b();
        if (!b.isPrimitive() || (name = b.getName()) == null) {
            return b;
        }
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? b : Double.class;
            case 104431:
                return !name.equals("int") ? b : Integer.class;
            case 3039496:
                return !name.equals("byte") ? b : Byte.class;
            case 3052374:
                return !name.equals("char") ? b : Character.class;
            case 3327612:
                return !name.equals("long") ? b : Long.class;
            case 3625364:
                return !name.equals("void") ? b : Void.class;
            case 64711720:
                return !name.equals("boolean") ? b : Boolean.class;
            case 97526364:
                return !name.equals("float") ? b : Float.class;
            case 109413500:
                return !name.equals("short") ? b : Short.class;
            default:
                return b;
        }
    }

    public static final <T> c<T> b(Class<T> cls) {
        l.d(cls, "<this>");
        return q.b(cls);
    }
}
