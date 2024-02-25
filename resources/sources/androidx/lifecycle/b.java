package androidx.lifecycle;

import androidx.lifecycle.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class b {
    static b c = new b();
    private final Map<Class<?>, a> a = new HashMap();
    private final Map<Class<?>, Boolean> b = new HashMap();

    static class a {
        final Map<e.b, List<C0021b>> a = new HashMap();
        final Map<C0021b, e.b> b;

        a(Map<C0021b, e.b> map) {
            this.b = map;
            for (Map.Entry next : map.entrySet()) {
                e.b bVar = (e.b) next.getValue();
                List list = this.a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.a.put(bVar, list);
                }
                list.add(next.getKey());
            }
        }

        private static void b(List<C0021b> list, h hVar, e.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(hVar, bVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar, e.b bVar, Object obj) {
            b(this.a.get(bVar), hVar, bVar, obj);
            b(this.a.get(e.b.ON_ANY), hVar, bVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.b$b  reason: collision with other inner class name */
    static final class C0021b {
        final int a;
        final Method b;

        C0021b(int i2, Method method) {
            this.a = i2;
            this.b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar, e.b bVar, Object obj) {
            try {
                int i2 = this.a;
                if (i2 == 0) {
                    this.b.invoke(obj, new Object[0]);
                } else if (i2 == 1) {
                    this.b.invoke(obj, new Object[]{hVar});
                } else if (i2 == 2) {
                    this.b.invoke(obj, new Object[]{hVar, bVar});
                }
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0021b)) {
                return false;
            }
            C0021b bVar = (C0021b) obj;
            return this.a == bVar.a && this.b.getName().equals(bVar.b.getName());
        }

        public int hashCode() {
            return (this.a * 31) + this.b.getName().hashCode();
        }
    }

    b() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i2;
        a c2;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c2 = c(superclass)) == null)) {
            hashMap.putAll(c2.b);
        }
        for (Class c3 : cls.getInterfaces()) {
            for (Map.Entry next : c(c3).b.entrySet()) {
                e(hashMap, (C0021b) next.getKey(), (e.b) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            o oVar = (o) method.getAnnotation(o.class);
            if (oVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else if (parameterTypes[0].isAssignableFrom(h.class)) {
                    i2 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                e.b value = oVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(e.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == e.b.ON_ANY) {
                        i2 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new C0021b(i2, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.a.put(cls, aVar);
        this.b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    private void e(Map<C0021b, e.b> map, C0021b bVar, e.b bVar2, Class<?> cls) {
        e.b bVar3 = map.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
        } else if (bVar3 == null) {
            map.put(bVar, bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public a c(Class<?> cls) {
        a aVar = this.a.get(cls);
        return aVar != null ? aVar : a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean d(Class<?> cls) {
        Boolean bool = this.b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b2 = b(cls);
        for (Method annotation : b2) {
            if (((o) annotation.getAnnotation(o.class)) != null) {
                a(cls, b2);
                return true;
            }
        }
        this.b.put(cls, Boolean.FALSE);
        return false;
    }
}
