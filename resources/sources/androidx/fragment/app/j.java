package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import e.e.g;

public class j {
    private static final g<ClassLoader, g<String, Class<?>>> a = new g<>();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class<?> c(ClassLoader classLoader, String str) {
        g<ClassLoader, g<String, Class<?>>> gVar = a;
        g gVar2 = gVar.get(classLoader);
        if (gVar2 == null) {
            gVar2 = new g();
            gVar.put(classLoader, gVar2);
        }
        Class<?> cls = (Class) gVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gVar2.put(str, cls2);
        return cls2;
    }

    public static Class<? extends Fragment> d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.j("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        } catch (ClassCastException e3) {
            throw new Fragment.j("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e3);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        throw null;
    }
}
