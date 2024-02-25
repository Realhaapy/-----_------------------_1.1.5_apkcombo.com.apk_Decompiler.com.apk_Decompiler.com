package com.facebook.internal.s0;

import com.facebook.g0;
import com.facebook.internal.a0;
import com.facebook.internal.o0;
import com.facebook.internal.s0.i;
import com.facebook.j0;
import com.facebook.l0;
import com.facebook.m0;
import com.facebook.u;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import m.y.d.l;
import m.y.d.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h {
    public static final h a = new h();
    private static boolean b;

    private h() {
    }

    public static final void a() {
        h hVar = a;
        b = true;
        g0 g0Var = g0.a;
        if (g0.g()) {
            hVar.e();
        }
    }

    public static final void b(Throwable th) {
        if (b && !c() && th != null) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th.getStackTrace();
            l.c(stackTrace, "e.stackTrace");
            for (StackTraceElement className : stackTrace) {
                a0 a0Var = a0.a;
                String className2 = className.getClassName();
                l.c(className2, "it.className");
                a0.b d2 = a0.d(className2);
                if (d2 != a0.b.Unknown) {
                    a0.c(d2);
                    hashSet.add(d2.toString());
                }
            }
            g0 g0Var = g0.a;
            if (g0.g() && (!hashSet.isEmpty())) {
                i.a aVar = i.a.a;
                i.a.c(new JSONArray(hashSet)).g();
            }
        }
    }

    public static final boolean c() {
        return false;
    }

    /* access modifiers changed from: private */
    public static final void f(i iVar, m0 m0Var) {
        l.d(iVar, "$instrumentData");
        l.d(m0Var, "response");
        try {
            if (m0Var.b() == null) {
                JSONObject d2 = m0Var.d();
                if (l.a(d2 == null ? null : Boolean.valueOf(d2.getBoolean("success")), Boolean.TRUE)) {
                    iVar.a();
                }
            }
        } catch (JSONException unused) {
        }
    }

    public final void e() {
        o0 o0Var = o0.a;
        if (!o0.S()) {
            k kVar = k.a;
            File[] m2 = k.m();
            ArrayList arrayList = new ArrayList();
            int length = m2.length;
            int i2 = 0;
            while (i2 < length) {
                File file = m2[i2];
                i2++;
                i.a aVar = i.a.a;
                i d2 = i.a.d(file);
                if (d2.f()) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("crash_shield", d2.toString());
                        j0.c cVar = j0.f1546n;
                        s sVar = s.a;
                        g0 g0Var = g0.a;
                        String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{g0.d()}, 1));
                        l.c(format, "java.lang.String.format(format, *args)");
                        arrayList.add(cVar.A((u) null, format, jSONObject, new a(d2)));
                    } catch (JSONException unused) {
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                new l0((Collection<j0>) arrayList).n();
            }
        }
    }
}
