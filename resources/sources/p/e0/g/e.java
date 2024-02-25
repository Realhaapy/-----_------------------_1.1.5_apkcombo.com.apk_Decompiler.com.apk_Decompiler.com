package p.e0.g;

import java.util.List;
import p.a0;
import p.l;
import p.m;
import p.r;
import p.s;
import q.f;

public final class e {
    static {
        f.j("\"\\");
        f.j("\t ,=");
    }

    public static long a(r rVar) {
        return h(rVar.c("Content-Length"));
    }

    public static long b(a0 a0Var) {
        return a(a0Var.B());
    }

    public static boolean c(a0 a0Var) {
        if (a0Var.O().f().equals("HEAD")) {
            return false;
        }
        int g2 = a0Var.g();
        return (((g2 >= 100 && g2 < 200) || g2 == 204 || g2 == 304) && b(a0Var) == -1 && !"chunked".equalsIgnoreCase(a0Var.v("Transfer-Encoding"))) ? false : true;
    }

    public static int d(String str, int i2) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public static void e(m mVar, s sVar, r rVar) {
        if (mVar != m.a) {
            List<l> f2 = l.f(sVar, rVar);
            if (!f2.isEmpty()) {
                mVar.b(sVar, f2);
            }
        }
    }

    public static int f(String str, int i2, String str2) {
        while (i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            i2++;
        }
        return i2;
    }

    public static int g(String str, int i2) {
        while (i2 < str.length() && ((r0 = str.charAt(i2)) == ' ' || r0 == 9)) {
            i2++;
        }
        return i2;
    }

    private static long h(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
