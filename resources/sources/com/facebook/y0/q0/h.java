package com.facebook.y0.q0;

import android.content.Context;
import com.facebook.internal.i0;
import com.facebook.internal.o0;
import com.facebook.internal.q;
import com.facebook.p0;
import com.facebook.y0.a0;
import java.util.Iterator;
import java.util.Map;
import m.p;
import m.y.d.l;
import org.json.JSONObject;

public final class h {
    public static final h a = new h();
    private static final Map<a, String> b = a0.e(p.a(a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), p.a(a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    public enum a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    private h() {
    }

    public static final JSONObject a(a aVar, q qVar, String str, boolean z, Context context) {
        l.d(aVar, "activityType");
        l.d(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", b.get(aVar));
        String f2 = a0.b.f();
        if (f2 != null) {
            jSONObject.put("app_user_id", f2);
        }
        o0 o0Var = o0.a;
        o0.x0(jSONObject, qVar, str, z, context);
        try {
            o0.y0(jSONObject, context);
        } catch (Exception e2) {
            i0.f1448e.c(p0.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e2.toString());
        }
        o0 o0Var2 = o0.a;
        JSONObject y = o0.y();
        if (y != null) {
            Iterator<String> keys = y.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, y.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
