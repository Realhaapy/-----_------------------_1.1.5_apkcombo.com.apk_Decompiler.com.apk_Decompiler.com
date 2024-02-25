package com.facebook.internal.s0.m;

import android.util.Log;
import com.facebook.g0;
import com.facebook.internal.o0;
import com.facebook.internal.s0.h;
import com.facebook.internal.s0.i;
import com.facebook.internal.s0.k;
import com.facebook.m0;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m.t.w;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements Thread.UncaughtExceptionHandler {
    public static final a b = new a((g) null);
    /* access modifiers changed from: private */
    public static final String c = c.class.getCanonicalName();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static c f1519d;
    private final Thread.UncaughtExceptionHandler a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final void d() {
            o0 o0Var = o0.a;
            if (!o0.S()) {
                k kVar = k.a;
                File[] o2 = k.o();
                ArrayList arrayList = new ArrayList(o2.length);
                for (File d2 : o2) {
                    i.a aVar = i.a.a;
                    arrayList.add(i.a.d(d2));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object next : arrayList) {
                    if (((i) next).f()) {
                        arrayList2.add(next);
                    }
                }
                List B = r.B(arrayList2, b.a);
                JSONArray jSONArray = new JSONArray();
                Iterator it = f.g(0, Math.min(B.size(), 5)).iterator();
                while (it.hasNext()) {
                    jSONArray.put(B.get(((w) it).b()));
                }
                k kVar2 = k.a;
                k.r("crash_reports", jSONArray, new a(B));
            }
        }

        /* access modifiers changed from: private */
        public static final int e(i iVar, i iVar2) {
            l.c(iVar2, "o2");
            return iVar.b(iVar2);
        }

        /* access modifiers changed from: private */
        public static final void f(List list, m0 m0Var) {
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
        }

        public final synchronized void a() {
            g0 g0Var = g0.a;
            if (g0.g()) {
                d();
            }
            if (c.f1519d != null) {
                Log.w(c.c, "Already enabled!");
                return;
            }
            c.f1519d = new c(Thread.getDefaultUncaughtExceptionHandler(), (g) null);
            Thread.setDefaultUncaughtExceptionHandler(c.f1519d);
        }
    }

    private c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    public /* synthetic */ c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, g gVar) {
        this(uncaughtExceptionHandler);
    }

    public void uncaughtException(Thread thread, Throwable th) {
        l.d(thread, "t");
        l.d(th, "e");
        k kVar = k.a;
        if (k.f(th)) {
            h hVar = h.a;
            h.b(th);
            i.a aVar = i.a.a;
            i.a.b(th, i.c.CrashReport).g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
