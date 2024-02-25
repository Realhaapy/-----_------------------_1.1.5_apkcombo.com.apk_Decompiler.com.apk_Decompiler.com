package com.facebook.y0.p0;

import com.facebook.g0;
import com.facebook.internal.b0;
import com.facebook.y0.r0.h;
import java.util.List;
import java.util.Map;
import m.y.d.l;
import org.json.JSONObject;

public final class a {
    public static final a a = new a();
    private static boolean b;
    private static boolean c;

    private a() {
    }

    public static final void a() {
        Class<a> cls = a.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                b = true;
                b0 b0Var = b0.a;
                g0 g0Var = g0.a;
                c = b0.b("FBSDKFeatureIntegritySample", g0.d(), false);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    private final String b(String str) {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            h hVar = h.a;
            String[] q2 = h.q(h.a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (q2 == null) {
                return "none";
            }
            String str2 = q2[0];
            return str2 == null ? "none" : str2;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }

    public static final void c(Map<String, String> map) {
        Class<a> cls = a.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                l.d(map, "parameters");
                if (b && !map.isEmpty()) {
                    try {
                        List<T> D = r.D(map.keySet());
                        JSONObject jSONObject = new JSONObject();
                        for (T t : D) {
                            String str = map.get(t);
                            if (str != null) {
                                String str2 = str;
                                a aVar = a;
                                if (aVar.d(t) || aVar.d(str2)) {
                                    map.remove(t);
                                    if (!c) {
                                        str2 = "";
                                    }
                                    jSONObject.put(t, str2);
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                        }
                        if (jSONObject.length() != 0) {
                            String jSONObject2 = jSONObject.toString();
                            l.c(jSONObject2, "restrictiveParamJson.toString()");
                            map.put("_onDeviceParams", jSONObject2);
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    private final boolean d(String str) {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return false;
        }
        try {
            return !l.a("none", b(str));
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return false;
        }
    }
}
