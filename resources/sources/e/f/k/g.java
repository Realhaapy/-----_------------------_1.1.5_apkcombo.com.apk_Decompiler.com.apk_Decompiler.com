package e.f.k;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import e.f.j.f.g;
import e.f.o.g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

public class g extends e {

    /* renamed from: g  reason: collision with root package name */
    protected final Class<?> f3358g;

    /* renamed from: h  reason: collision with root package name */
    protected final Constructor<?> f3359h;

    /* renamed from: i  reason: collision with root package name */
    protected final Method f3360i;

    /* renamed from: j  reason: collision with root package name */
    protected final Method f3361j;

    /* renamed from: k  reason: collision with root package name */
    protected final Method f3362k;

    /* renamed from: l  reason: collision with root package name */
    protected final Method f3363l;

    /* renamed from: m  reason: collision with root package name */
    protected final Method f3364m;

    public g() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> y = y();
            constructor = z(y);
            method4 = v(y);
            method3 = w(y);
            method2 = A(y);
            method = u(y);
            Class<?> cls2 = y;
            method5 = x(y);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f3358g = cls;
        this.f3359h = constructor;
        this.f3360i = method4;
        this.f3361j = method3;
        this.f3362k = method2;
        this.f3363l = method;
        this.f3364m = method5;
    }

    private Object o() {
        try {
            return this.f3359h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void p(Object obj) {
        try {
            this.f3363l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean q(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f3360i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean r(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        try {
            return ((Boolean) this.f3361j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Integer.valueOf(i4)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean s(Object obj) {
        try {
            return ((Boolean) this.f3362k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean t() {
        if (this.f3360i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f3360i != null;
    }

    /* access modifiers changed from: protected */
    public Method A(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    public Typeface b(Context context, g.c cVar, Resources resources, int i2) {
        if (!t()) {
            return super.b(context, cVar, resources, i2);
        }
        Object o2 = o();
        if (o2 == null) {
            return null;
        }
        for (g.d dVar : cVar.a()) {
            if (!q(context, o2, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                p(o2);
                return null;
            }
        }
        if (!s(o2)) {
            return null;
        }
        return l(o2);
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i2) {
        Typeface l2;
        ParcelFileDescriptor openFileDescriptor;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!t()) {
            g.b h2 = h(bVarArr, i2);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(h2.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h2.e()).setItalic(h2.f()).build();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map<Uri, ByteBuffer> h3 = k.h(context, bVarArr, cancellationSignal);
            Object o2 = o();
            if (o2 == null) {
                return null;
            }
            boolean z = false;
            for (g.b bVar : bVarArr) {
                ByteBuffer byteBuffer = h3.get(bVar.d());
                if (byteBuffer != null) {
                    if (!r(o2, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                        p(o2);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                p(o2);
                return null;
            } else if (s(o2) && (l2 = l(o2)) != null) {
                return Typeface.create(l2, i2);
            } else {
                return null;
            }
        }
        throw th;
    }

    public Typeface e(Context context, Resources resources, int i2, String str, int i3) {
        if (!t()) {
            return super.e(context, resources, i2, str, i3);
        }
        Object o2 = o();
        if (o2 == null) {
            return null;
        }
        if (!q(context, o2, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            p(o2);
            return null;
        } else if (!s(o2)) {
            return null;
        } else {
            return l(o2);
        }
    }

    /* access modifiers changed from: protected */
    public Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3358g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3364m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Method u(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method v(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    public Method w(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    public Method x(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    public Class<?> y() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    public Constructor<?> z(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }
}
