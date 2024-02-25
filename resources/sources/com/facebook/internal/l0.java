package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import m.y.d.l;
import org.json.JSONObject;

public final class l0 {
    public static final l0 a = new l0();
    private static final ConcurrentHashMap<String, JSONObject> b = new ConcurrentHashMap<>();

    private l0() {
    }

    public static final JSONObject a(String str) {
        l.d(str, "accessToken");
        return b.get(str);
    }

    public static final void b(String str, JSONObject jSONObject) {
        l.d(str, "key");
        l.d(jSONObject, "value");
        b.put(str, jSONObject);
    }
}
