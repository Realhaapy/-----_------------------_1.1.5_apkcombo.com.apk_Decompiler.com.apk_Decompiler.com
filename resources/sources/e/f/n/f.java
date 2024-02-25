package e.f.n;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

final class f implements g {
    private static final Locale[] b = new Locale[0];
    private final Locale[] a;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        e.b("en-Latn");
    }

    f(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.a = b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < localeArr.length) {
            Locale locale = localeArr[i2];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    b(sb, locale2);
                    if (i2 < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
                i2++;
            } else {
                throw new NullPointerException("list[" + i2 + "] is null");
            }
        }
        this.a = (Locale[]) arrayList.toArray(new Locale[0]);
        sb.toString();
    }

    static void b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Locale[] localeArr = ((f) obj).a;
        if (this.a.length != localeArr.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            Locale[] localeArr2 = this.a;
            if (i2 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i2].equals(localeArr[i2])) {
                return false;
            }
            i2++;
        }
    }

    public Locale get(int i2) {
        if (i2 >= 0) {
            Locale[] localeArr = this.a;
            if (i2 < localeArr.length) {
                return localeArr[i2];
            }
        }
        return null;
    }

    public int hashCode() {
        int i2 = 1;
        for (Locale hashCode : this.a) {
            i2 = (i2 * 31) + hashCode.hashCode();
        }
        return i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.a;
            if (i2 < localeArr.length) {
                sb.append(localeArr[i2]);
                if (i2 < this.a.length - 1) {
                    sb.append(',');
                }
                i2++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
