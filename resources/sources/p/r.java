package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p.e0.c;

public final class r {
    private final String[] a;

    public static final class a {
        final List<String> a = new ArrayList(20);

        public a a(String str, String str2) {
            r.a(str);
            r.b(str2, str);
            c(str, str2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public a b(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                c(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            } else if (str.startsWith(":")) {
                c("", str.substring(1));
                return this;
            } else {
                c("", str);
                return this;
            }
        }

        /* access modifiers changed from: package-private */
        public a c(String str, String str2) {
            this.a.add(str);
            this.a.add(str2.trim());
            return this;
        }

        public r d() {
            return new r(this);
        }

        public a e(String str) {
            int i2 = 0;
            while (i2 < this.a.size()) {
                if (str.equalsIgnoreCase(this.a.get(i2))) {
                    this.a.remove(i2);
                    this.a.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }

        public a f(String str, String str2) {
            r.a(str);
            r.b(str2, str);
            e(str);
            c(str, str2);
            return this;
        }
    }

    r(a aVar) {
        List<String> list = aVar.a;
        this.a = (String[]) list.toArray(new String[list.size()]);
    }

    static void a(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!str.isEmpty()) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(c.p("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty");
    }

    static void b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i2 = 0;
            while (i2 < length) {
                char charAt = str.charAt(i2);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i2++;
                } else {
                    throw new IllegalArgumentException(c.p("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }

    private static String d(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public String c(String str) {
        return d(this.a, str);
    }

    public String e(int i2) {
        return this.a[i2 * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && Arrays.equals(((r) obj).a, this.a);
    }

    public a f() {
        a aVar = new a();
        Collections.addAll(aVar.a, this.a);
        return aVar;
    }

    public int g() {
        return this.a.length / 2;
    }

    public String h(int i2) {
        return this.a[(i2 * 2) + 1];
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public List<String> i(String str) {
        int g2 = g();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < g2; i2++) {
            if (str.equalsIgnoreCase(e(i2))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(h(i2));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int g2 = g();
        for (int i2 = 0; i2 < g2; i2++) {
            sb.append(e(i2));
            sb.append(": ");
            sb.append(h(i2));
            sb.append("\n");
        }
        return sb.toString();
    }
}
