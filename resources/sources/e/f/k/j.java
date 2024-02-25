package e.f.k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import e.f.j.f.g;
import e.f.o.g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

class j {
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, g.c> a = new ConcurrentHashMap<>();

    class a implements c<g.b> {
        a(j jVar) {
        }

        /* renamed from: c */
        public int a(g.b bVar) {
            return bVar.e();
        }

        /* renamed from: d */
        public boolean b(g.b bVar) {
            return bVar.f();
        }
    }

    class b implements c<g.d> {
        b(j jVar) {
        }

        /* renamed from: c */
        public int a(g.d dVar) {
            return dVar.e();
        }

        /* renamed from: d */
        public boolean b(g.d dVar) {
            return dVar.f();
        }
    }

    private interface c<T> {
        int a(T t);

        boolean b(T t);
    }

    j() {
    }

    private void a(Typeface typeface, g.c cVar) {
        long j2 = j(typeface);
        if (j2 != 0) {
            this.a.put(Long.valueOf(j2), cVar);
        }
    }

    private g.d f(g.c cVar, int i2) {
        return (g.d) g(cVar.a(), i2, new b(this));
    }

    private static <T> T g(T[] tArr, int i2, c<T> cVar) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.a(t2) - i3) * 2) + (cVar.b(t2) == z ? 0 : 1);
            if (t == null || i4 > abs) {
                t = t2;
                i4 = abs;
            }
        }
        return t;
    }

    private static long j(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        } catch (IllegalAccessException e3) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e3);
            return 0;
        }
    }

    public Typeface b(Context context, g.c cVar, Resources resources, int i2) {
        g.d f2 = f(cVar, i2);
        if (f2 == null) {
            return null;
        }
        Typeface d2 = d.d(context, resources, f2.b(), f2.a(), 0, i2);
        a(d2, cVar);
        return d2;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i2) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(h(bVarArr, i2).d());
            try {
                Typeface d2 = d(context, inputStream);
                k.a(inputStream);
                return d2;
            } catch (IOException unused) {
                k.a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                k.a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            k.a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            k.a(inputStream2);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public Typeface d(Context context, InputStream inputStream) {
        File e2 = k.e(context);
        if (e2 == null) {
            return null;
        }
        try {
            if (!k.d(e2, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e2.getPath());
            e2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e2.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i2, String str, int i3) {
        File e2 = k.e(context);
        if (e2 == null) {
            return null;
        }
        try {
            if (!k.c(e2, resources, i2)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e2.getPath());
            e2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e2.delete();
        }
    }

    /* access modifiers changed from: protected */
    public g.b h(g.b[] bVarArr, int i2) {
        return (g.b) g(bVarArr, i2, new a(this));
    }

    /* access modifiers changed from: package-private */
    public g.c i(Typeface typeface) {
        long j2 = j(typeface);
        if (j2 == 0) {
            return null;
        }
        return this.a.get(Long.valueOf(j2));
    }
}
