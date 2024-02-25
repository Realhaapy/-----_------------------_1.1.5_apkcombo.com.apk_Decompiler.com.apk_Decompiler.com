package com.facebook.internal.s0.o;

import com.facebook.g0;
import com.facebook.internal.o0;
import com.facebook.internal.s0.k;
import com.facebook.m0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import m.d0.f;
import m.y.d.l;
import m.y.d.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {
    public static final e a = new e();

    private e() {
    }

    public static final void a() {
        g0 g0Var = g0.a;
        if (g0.g()) {
            h();
        }
    }

    public static final File[] e() {
        k kVar = k.a;
        File c = k.c();
        if (c == null) {
            return new File[0];
        }
        File[] listFiles = c.listFiles(c.a);
        l.c(listFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
        return listFiles;
    }

    /* access modifiers changed from: private */
    public static final boolean f(File file, String str) {
        l.c(str, "name");
        s sVar = s.a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
        l.c(format, "java.lang.String.format(format, *args)");
        return new f(format).a(str);
    }

    public static final void g(String str) {
        try {
            new d(str).e();
        } catch (Exception unused) {
        }
    }

    public static final void h() {
        o0 o0Var = o0.a;
        if (!o0.S()) {
            File[] e2 = e();
            ArrayList arrayList = new ArrayList();
            int length = e2.length;
            int i2 = 0;
            int i3 = 0;
            while (i3 < length) {
                File file = e2[i3];
                i3++;
                d dVar = new d(file);
                if (dVar.d()) {
                    arrayList.add(dVar);
                }
            }
            n.l(arrayList, a.a);
            JSONArray jSONArray = new JSONArray();
            while (i2 < arrayList.size() && i2 < 1000) {
                jSONArray.put(arrayList.get(i2));
                i2++;
            }
            k kVar = k.a;
            k.r("error_reports", jSONArray, new b(arrayList));
        }
    }

    /* access modifiers changed from: private */
    public static final int i(d dVar, d dVar2) {
        l.c(dVar2, "o2");
        return dVar.b(dVar2);
    }

    /* access modifiers changed from: private */
    public static final void j(ArrayList arrayList, m0 m0Var) {
        l.d(arrayList, "$validReports");
        l.d(m0Var, "response");
        try {
            if (m0Var.b() == null) {
                JSONObject d2 = m0Var.d();
                if (l.a(d2 == null ? null : Boolean.valueOf(d2.getBoolean("success")), Boolean.TRUE)) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).a();
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }
}
