package e.f.k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import e.f.j.f.g;
import e.f.o.g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

class f extends j {
    private static final Class<?> b;
    private static final Constructor<?> c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f3356d;

    /* renamed from: e  reason: collision with root package name */
    private static final Method f3357e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method2 = null;
            method = null;
        }
        c = constructor;
        b = cls;
        f3356d = method;
        f3357e = method2;
    }

    f() {
    }

    private static boolean k(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z) {
        try {
            return ((Boolean) f3356d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3357e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean m() {
        Method method = f3356d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object n() {
        try {
            return c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Typeface b(Context context, g.c cVar, Resources resources, int i2) {
        Object n2 = n();
        if (n2 == null) {
            return null;
        }
        for (g.d dVar : cVar.a()) {
            ByteBuffer b2 = k.b(context, resources, dVar.b());
            if (b2 == null || !k(n2, b2, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return l(n2);
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i2) {
        Object n2 = n();
        if (n2 == null) {
            return null;
        }
        e.e.g gVar = new e.e.g();
        for (g.b bVar : bVarArr) {
            Uri d2 = bVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d2);
            if (byteBuffer == null) {
                byteBuffer = k.f(context, cancellationSignal, d2);
                gVar.put(d2, byteBuffer);
            }
            if (byteBuffer == null || !k(n2, byteBuffer, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface l2 = l(n2);
        if (l2 == null) {
            return null;
        }
        return Typeface.create(l2, i2);
    }
}
