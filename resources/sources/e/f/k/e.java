package e.f.k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import e.f.j.f.g;
import e.f.o.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class e extends j {
    private static Class<?> b = null;
    private static Constructor<?> c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Method f3353d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Method f3354e = null;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f3355f = false;

    e() {
    }

    private static boolean k(Object obj, String str, int i2, boolean z) {
        n();
        try {
            return ((Boolean) f3353d.invoke(obj, new Object[]{str, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Typeface l(Object obj) {
        n();
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3354e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private File m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f3355f) {
            f3355f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
                method2 = null;
                cls = null;
                method = null;
            }
            c = constructor;
            b = cls;
            f3353d = method;
            f3354e = method2;
        }
    }

    private static Object o() {
        n();
        try {
            return c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Typeface b(Context context, g.c cVar, Resources resources, int i2) {
        Object o2 = o();
        g.d[] a = cVar.a();
        int length = a.length;
        int i3 = 0;
        while (i3 < length) {
            g.d dVar = a[i3];
            File e2 = k.e(context);
            if (e2 == null) {
                return null;
            }
            try {
                if (!k.c(e2, resources, dVar.b())) {
                    e2.delete();
                    return null;
                } else if (!k(o2, e2.getPath(), dVar.e(), dVar.f())) {
                    return null;
                } else {
                    i3++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e2.delete();
            }
        }
        return l(o2);
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i2) {
        FileInputStream fileInputStream;
        if (bVarArr.length < 1) {
            return null;
        }
        g.b h2 = h(bVarArr, i2);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h2.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File m2 = m(openFileDescriptor);
                if (m2 != null) {
                    if (m2.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(m2);
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                        }
                        return createFromFile;
                    }
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface d2 = super.d(context, fileInputStream);
                fileInputStream.close();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return d2;
            } catch (Throwable th) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
