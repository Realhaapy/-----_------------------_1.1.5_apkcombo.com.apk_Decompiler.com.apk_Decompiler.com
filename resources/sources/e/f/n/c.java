package e.f.n;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

public final class c {

    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static e a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.d(a.a(configuration));
        }
        return e.a(configuration.locale);
    }
}
