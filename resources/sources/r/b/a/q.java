package r.b.a;

import java.io.DataOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import r.b.a.w.d;
import r.b.a.y.f;
import r.b.a.y.g;

public abstract class q implements Serializable {
    private static final long serialVersionUID = 8352817235686L;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        Collections.unmodifiableMap(hashMap);
    }

    q() {
        if (getClass() != r.class && getClass() != s.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static q o(String str) {
        d.i(str, "zoneId");
        if (str.equals("Z")) {
            return r.f5578i;
        }
        if (str.length() == 1) {
            throw new b("Invalid zone: " + str);
        } else if (str.startsWith("+") || str.startsWith("-")) {
            return r.z(str);
        } else {
            if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
                return new s(str, r.f5578i.c());
            }
            if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
                r z = r.z(str.substring(3));
                if (z.y() == 0) {
                    return new s(str.substring(0, 3), z.c());
                }
                return new s(str.substring(0, 3) + z.a(), z.c());
            } else if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                return s.w(str, true);
            } else {
                r z2 = r.z(str.substring(2));
                if (z2.y() == 0) {
                    return new s("UT", z2.c());
                }
                return new s("UT" + z2.a(), z2.c());
            }
        }
    }

    public static q u(String str, r rVar) {
        d.i(str, "prefix");
        d.i(rVar, "offset");
        if (str.length() == 0) {
            return rVar;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("Invalid prefix, must be GMT, UTC or UT: " + str);
        } else if (rVar.y() == 0) {
            return new s(str, rVar.c());
        } else {
            return new s(str + rVar.a(), rVar.c());
        }
    }

    public abstract String a();

    public abstract f c();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return a().equals(((q) obj).a());
        }
        return false;
    }

    public q g() {
        try {
            f c = c();
            if (c.d()) {
                return c.a(e.f5527g);
            }
        } catch (g unused) {
        }
        return this;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a();
    }

    /* access modifiers changed from: package-private */
    public abstract void v(DataOutput dataOutput);
}
