package e.f.n;

import android.os.LocaleList;
import java.util.Locale;

final class h implements g {
    private final LocaleList a;

    h(Object obj) {
        this.a = (LocaleList) obj;
    }

    public Object a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this.a.equals(((g) obj).a());
    }

    public Locale get(int i2) {
        return this.a.get(i2);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
