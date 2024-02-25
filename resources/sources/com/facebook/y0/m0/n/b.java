package com.facebook.y0.m0.n;

import java.util.ArrayList;
import java.util.List;
import m.y.d.l;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {
    private final String a;
    private final String b;
    private final List<c> c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2032d;

    public b(JSONObject jSONObject) {
        l.d(jSONObject, "component");
        String string = jSONObject.getString("name");
        l.c(string, "component.getString(PARAMETER_NAME_KEY)");
        this.a = string;
        String optString = jSONObject.optString("value");
        l.c(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.b = optString;
        String optString2 = jSONObject.optString("path_type", "absolute");
        l.c(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.f2032d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            int i2 = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    l.c(jSONObject2, "jsonPathArray.getJSONObject(i)");
                    arrayList.add(new c(jSONObject2));
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
        }
        this.c = arrayList;
    }

    public final String a() {
        return this.a;
    }

    public final List<c> b() {
        return this.c;
    }

    public final String c() {
        return this.f2032d;
    }

    public final String d() {
        return this.b;
    }
}
