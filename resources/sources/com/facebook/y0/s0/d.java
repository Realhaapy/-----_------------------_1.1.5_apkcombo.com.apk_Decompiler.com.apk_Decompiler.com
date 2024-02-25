package com.facebook.y0.s0;

import android.os.Bundle;
import com.facebook.internal.c0;
import com.facebook.internal.d0;
import com.facebook.internal.o0;
import com.facebook.internal.s0.n.a;
import com.facebook.y0.s0.e;
import com.facebook.y0.v;
import java.util.List;
import m.y.d.l;
import org.json.JSONArray;

public final class d {
    public static final d a = new d();
    private static final String b;

    static {
        String simpleName = e.class.getSimpleName();
        l.c(simpleName, "RemoteServiceWrapper::class.java.simpleName");
        b = simpleName;
    }

    private d() {
    }

    public static final Bundle a(e.a aVar, String str, List<v> list) {
        Class<d> cls = d.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(aVar, "eventType");
            l.d(str, "applicationId");
            l.d(list, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", aVar.toString());
            bundle.putString("app_id", str);
            if (e.a.CUSTOM_APP_EVENTS == aVar) {
                JSONArray b2 = a.b(list, str);
                if (b2.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", b2.toString());
            }
            return bundle;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    private final JSONArray b(List<v> list, String str) {
        if (a.d(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<T> F = r.F(list);
            com.facebook.y0.n0.a aVar = com.facebook.y0.n0.a.a;
            com.facebook.y0.n0.a.d(F);
            boolean c = c(str);
            for (T t : F) {
                if (!t.g()) {
                    o0 o0Var = o0.a;
                    o0.e0(b, l.j("Event with invalid checksum: ", t));
                } else if ((!t.h()) || (t.h() && c)) {
                    jSONArray.put(t.e());
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    private final boolean c(String str) {
        if (a.d(this)) {
            return false;
        }
        try {
            d0 d0Var = d0.a;
            c0 n2 = d0.n(str, false);
            if (n2 != null) {
                return n2.l();
            }
            return false;
        } catch (Throwable th) {
            a.b(th, this);
            return false;
        }
    }
}
