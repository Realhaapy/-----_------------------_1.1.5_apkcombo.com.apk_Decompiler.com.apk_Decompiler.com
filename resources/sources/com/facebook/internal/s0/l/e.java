package com.facebook.internal.s0.l;

import com.facebook.g0;
import com.facebook.internal.o0;
import com.facebook.internal.s0.i;
import com.facebook.internal.s0.k;
import com.facebook.internal.s0.n.a;
import com.facebook.m0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import m.t.w;
import m.y.d.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {
    public static final e a = new e();
    private static final AtomicBoolean b = new AtomicBoolean(false);

    private e() {
    }

    public static final synchronized void a() {
        Class<e> cls = e.class;
        synchronized (cls) {
            if (!a.d(cls)) {
                try {
                    if (!b.getAndSet(true)) {
                        g0 g0Var = g0.a;
                        if (g0.g()) {
                            d();
                        }
                        d dVar = d.a;
                        d.d();
                    }
                } catch (Throwable th) {
                    a.b(th, cls);
                }
            }
        }
    }

    public static final void d() {
        Class<e> cls = e.class;
        if (!a.d(cls)) {
            try {
                o0 o0Var = o0.a;
                if (!o0.S()) {
                    k kVar = k.a;
                    File[] k2 = k.k();
                    ArrayList arrayList = new ArrayList(k2.length);
                    for (File d2 : k2) {
                        i.a aVar = i.a.a;
                        arrayList.add(i.a.d(d2));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next : arrayList) {
                        if (((i) next).f()) {
                            arrayList2.add(next);
                        }
                    }
                    List B = r.B(arrayList2, c.a);
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = f.g(0, Math.min(B.size(), 5)).iterator();
                    while (it.hasNext()) {
                        jSONArray.put(B.get(((w) it).b()));
                    }
                    k kVar2 = k.a;
                    k.r("anr_reports", jSONArray, new b(B));
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final int e(i iVar, i iVar2) {
        Class<e> cls = e.class;
        if (a.d(cls)) {
            return 0;
        }
        try {
            l.c(iVar2, "o2");
            return iVar.b(iVar2);
        } catch (Throwable th) {
            a.b(th, cls);
            return 0;
        }
    }

    /* access modifiers changed from: private */
    public static final void f(List list, m0 m0Var) {
        Class<e> cls = e.class;
        if (!a.d(cls)) {
            try {
                l.d(list, "$validReports");
                l.d(m0Var, "response");
                try {
                    if (m0Var.b() == null) {
                        JSONObject d2 = m0Var.d();
                        if (l.a(d2 == null ? null : Boolean.valueOf(d2.getBoolean("success")), Boolean.TRUE)) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((i) it.next()).a();
                            }
                        }
                    }
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }
}
