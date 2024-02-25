package e.f.p;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class b {
    private static Method a;
    private static Method b;

    static class a {
        static String a(Locale locale) {
            return locale.getScript();
        }
    }

    /* renamed from: e.f.p.b$b  reason: collision with other inner class name */
    static class C0076b {
        static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        Class<String> cls = String.class;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            try {
                Class<?> cls2 = Class.forName("libcore.icu.ICU");
                a = cls2.getMethod("getScript", new Class[]{cls});
                b = cls2.getMethod("addLikelySubtags", new Class[]{cls});
            } catch (Exception e2) {
                a = null;
                b = null;
                Log.w("ICUCompat", e2);
            }
        } else if (i2 < 24) {
            try {
                b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e3) {
                throw new IllegalStateException(e3);
            }
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = b;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return locale2;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String b(String str) {
        try {
            Method method = a;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return null;
    }

    public static String c(Locale locale) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            return C0076b.c(C0076b.a(C0076b.b(locale)));
        }
        if (i2 >= 21) {
            try {
                return a.a((Locale) b.invoke((Object) null, new Object[]{locale}));
            } catch (IllegalAccessException | InvocationTargetException e2) {
                Log.w("ICUCompat", e2);
                return a.a(locale);
            }
        } else {
            String a2 = a(locale);
            if (a2 != null) {
                return b(a2);
            }
            return null;
        }
    }
}
