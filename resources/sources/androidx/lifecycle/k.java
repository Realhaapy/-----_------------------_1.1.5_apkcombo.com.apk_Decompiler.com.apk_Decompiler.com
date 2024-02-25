package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class k {
    private static Map<Class<?>, Integer> a = new HashMap();
    private static Map<Class<?>, List<Constructor<? extends d>>> b = new HashMap();

    private static d a(Constructor<? extends d> constructor, Object obj) {
        try {
            return (d) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static Constructor<? extends d> b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c = c(canonicalName);
            if (!name.isEmpty()) {
                c = name + "." + c;
            }
            Constructor<?> declaredConstructor = Class.forName(c).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    private static int d(Class<?> cls) {
        Integer num = a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g2 = g(cls);
        a.put(cls, Integer.valueOf(g2));
        return g2;
    }

    private static boolean e(Class<?> cls) {
        return cls != null && g.class.isAssignableFrom(cls);
    }

    static f f(Object obj) {
        boolean z = obj instanceof f;
        boolean z2 = obj instanceof c;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((c) obj, (f) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((c) obj, (f) null);
        }
        if (z) {
            return (f) obj;
        }
        Class<?> cls = obj.getClass();
        if (d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a((Constructor) list.get(0), obj));
        }
        d[] dVarArr = new d[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            dVarArr[i2] = a((Constructor) list.get(i2), obj);
        }
        return new CompositeGeneratedAdaptersObserver(dVarArr);
    }

    private static int g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends d> b2 = b(cls);
        if (b2 != null) {
            b.put(cls, Collections.singletonList(b2));
            return 2;
        } else if (b.c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (e(superclass)) {
                if (d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (e(cls2)) {
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            b.put(cls, arrayList);
            return 2;
        }
    }
}
