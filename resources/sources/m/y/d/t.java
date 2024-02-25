package m.y.d;

import java.util.List;
import m.y.c.b;
import m.y.c.c;
import m.y.c.d;
import m.y.c.e;
import m.y.c.f;
import m.y.c.g;
import m.y.c.h;
import m.y.c.i;
import m.y.c.j;
import m.y.c.k;
import m.y.c.l;
import m.y.c.m;
import m.y.c.n;
import m.y.c.o;
import m.y.c.p;
import m.y.c.q;
import m.y.c.r;
import m.y.c.s;
import m.y.c.u;
import m.y.c.v;
import m.y.c.w;
import m.y.d.u.a;

public class t {
    public static List a(Object obj) {
        if (!(obj instanceof a)) {
            return c(obj);
        }
        h(obj, "kotlin.collections.MutableList");
        throw null;
    }

    public static Object b(Object obj, int i2) {
        if (obj == null || e(obj, i2)) {
            return obj;
        }
        h(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static List c(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e2) {
            g(e2);
            throw null;
        }
    }

    public static int d(Object obj) {
        if (obj instanceof h) {
            return ((h) obj).getArity();
        }
        if (obj instanceof m.y.c.a) {
            return 0;
        }
        if (obj instanceof l) {
            return 1;
        }
        if (obj instanceof p) {
            return 2;
        }
        if (obj instanceof q) {
            return 3;
        }
        if (obj instanceof r) {
            return 4;
        }
        if (obj instanceof s) {
            return 5;
        }
        if (obj instanceof m.y.c.t) {
            return 6;
        }
        if (obj instanceof u) {
            return 7;
        }
        if (obj instanceof v) {
            return 8;
        }
        if (obj instanceof w) {
            return 9;
        }
        if (obj instanceof b) {
            return 10;
        }
        if (obj instanceof c) {
            return 11;
        }
        if (obj instanceof d) {
            return 12;
        }
        if (obj instanceof e) {
            return 13;
        }
        if (obj instanceof f) {
            return 14;
        }
        if (obj instanceof g) {
            return 15;
        }
        if (obj instanceof h) {
            return 16;
        }
        if (obj instanceof i) {
            return 17;
        }
        if (obj instanceof j) {
            return 18;
        }
        if (obj instanceof k) {
            return 19;
        }
        if (obj instanceof m) {
            return 20;
        }
        if (obj instanceof n) {
            return 21;
        }
        return obj instanceof o ? 22 : -1;
    }

    public static boolean e(Object obj, int i2) {
        return (obj instanceof m.c) && d(obj) == i2;
    }

    private static <T extends Throwable> T f(T t) {
        l.i(t, t.class.getName());
        return t;
    }

    public static ClassCastException g(ClassCastException classCastException) {
        f(classCastException);
        throw classCastException;
    }

    public static void h(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        i(name + " cannot be cast to " + str);
        throw null;
    }

    public static void i(String str) {
        g(new ClassCastException(str));
        throw null;
    }
}
