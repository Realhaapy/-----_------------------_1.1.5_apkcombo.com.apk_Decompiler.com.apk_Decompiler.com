package m.d0;

import e.a.j;
import java.util.ArrayList;
import java.util.List;
import m.t.h;
import m.y.c.l;
import m.y.d.m;

class i extends h {

    static final class a extends m implements l<String, String> {

        /* renamed from: e  reason: collision with root package name */
        public static final a f5002e = new a();

        a() {
            super(1);
        }

        public final String a(String str) {
            m.y.d.l.d(str, "line");
            return str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            a(str);
            return str;
        }
    }

    static final class b extends m implements l<String, String> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f5003e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f5003e = str;
        }

        /* renamed from: a */
        public final String invoke(String str) {
            m.y.d.l.d(str, "line");
            return m.y.d.l.j(this.f5003e, str);
        }
    }

    private static final l<String, String> b(String str) {
        return str.length() == 0 ? a.f5002e : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            int i3 = i2 + 1;
            if (!b.c(str.charAt(i2))) {
                break;
            }
            i2 = i3;
        }
        return i2 == -1 ? str.length() : i2;
    }

    public static final String d(String str, String str2) {
        m.y.d.l.d(str, "<this>");
        m.y.d.l.d(str2, "newIndent");
        List<String> N = q.N(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (T next : N) {
            if (!p.m((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(k.j(arrayList, 10));
        for (String c : arrayList) {
            arrayList2.add(Integer.valueOf(c(c)));
        }
        Integer num = (Integer) r.x(arrayList2);
        int i2 = 0;
        int intValue = num == null ? 0 : num.intValue();
        int length = str.length() + (str2.length() * N.size());
        l<String, String> b2 = b(str2);
        int f2 = j.f(N);
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : N) {
            int i3 = i2 + 1;
            String str3 = null;
            if (i2 >= 0) {
                String str4 = (String) next2;
                if (!(i2 == 0 || i2 == f2) || !p.m(str4)) {
                    String j0 = s.j0(str4, intValue);
                    str3 = j0 == null ? str4 : b2.invoke(j0);
                }
                if (str3 != null) {
                    arrayList3.add(str3);
                }
                i2 = i3;
            } else {
                h.i();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(length);
        Appendable unused = r.s(arrayList3, sb, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, j.G0, (Object) null);
        String sb2 = sb.toString();
        m.y.d.l.c(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    public static String e(String str) {
        m.y.d.l.d(str, "<this>");
        return d(str, "");
    }
}
