package com.facebook.y0.o0;

import android.content.Context;
import com.facebook.internal.s0.n.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import m.y.d.l;

public final class m {
    public static final m a = new m();

    private m() {
    }

    public static final Class<?> a(String str) {
        Class<m> cls = m.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(str, "className");
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final Class<?> b(Context context, String str) {
        Class<m> cls = m.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(context, "context");
            l.d(str, "className");
            try {
                return context.getClassLoader().loadClass(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final Method c(Class<?> cls, String str, Class<?>... clsArr) {
        Class<m> cls2 = m.class;
        if (a.d(cls2)) {
            return null;
        }
        try {
            l.d(cls, "clazz");
            l.d(str, "methodName");
            l.d(clsArr, "args");
            try {
                return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            a.b(th, cls2);
            return null;
        }
    }

    public static final Method d(Class<?> cls, String str, Class<?>... clsArr) {
        Class<m> cls2 = m.class;
        if (a.d(cls2)) {
            return null;
        }
        try {
            l.d(cls, "clazz");
            l.d(str, "methodName");
            l.d(clsArr, "args");
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            a.b(th, cls2);
            return null;
        }
    }

    public static final Object e(Class<?> cls, Method method, Object obj, Object... objArr) {
        Class<m> cls2 = m.class;
        if (a.d(cls2)) {
            return null;
        }
        try {
            l.d(cls, "clazz");
            l.d(method, "method");
            l.d(objArr, "args");
            if (obj != null) {
                obj = cls.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            a.b(th, cls2);
            return null;
        }
    }
}
