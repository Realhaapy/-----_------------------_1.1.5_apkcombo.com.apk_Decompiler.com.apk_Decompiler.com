package e.a.k.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.m0;
import e.f.j.f.e;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
public final class a {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    private static final WeakHashMap<Context, SparseArray<C0061a>> b = new WeakHashMap<>(0);
    private static final Object c = new Object();

    /* renamed from: e.a.k.a.a$a  reason: collision with other inner class name */
    private static class C0061a {
        final ColorStateList a;
        final Configuration b;

        C0061a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.b = configuration;
        }
    }

    private static void a(Context context, int i2, ColorStateList colorStateList) {
        synchronized (c) {
            WeakHashMap<Context, SparseArray<C0061a>> weakHashMap = b;
            SparseArray sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i2, new C0061a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList b(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<e.a.k.a.a$a>> r1 = b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            e.a.k.a.a$a r2 = (e.a.k.a.a.C0061a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.k.a.a.b(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static ColorStateList c(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i2);
        }
        ColorStateList b2 = b(context, i2);
        if (b2 != null) {
            return b2;
        }
        ColorStateList f2 = f(context, i2);
        if (f2 == null) {
            return e.f.j.a.e(context, i2);
        }
        a(context, i2, f2);
        return f2;
    }

    public static Drawable d(Context context, int i2) {
        return m0.h().j(context, i2);
    }

    private static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList f(Context context, int i2) {
        if (g(context, i2)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return e.a(resources, resources.getXml(i2), context.getTheme());
        } catch (Exception e2) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    private static boolean g(Context context, int i2) {
        Resources resources = context.getResources();
        TypedValue e2 = e();
        resources.getValue(i2, e2, true);
        int i3 = e2.type;
        return i3 >= 28 && i3 <= 31;
    }
}
