package e.f.p;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

public final class f {
    private static final Locale a = new Locale("", "");

    static class a {
        static int a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    private static int a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    public static int b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return a.a(locale);
        }
        if (locale == null || locale.equals(a)) {
            return 0;
        }
        String c = b.c(locale);
        return c == null ? a(locale) : (c.equalsIgnoreCase("Arab") || c.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
