package com.facebook.y0.m0.n;

import m.y.d.l;
import org.json.JSONObject;

public final class c {
    private final String a;
    private final int b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2033d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2034e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2035f;

    /* renamed from: g  reason: collision with root package name */
    private final String f2036g;

    /* renamed from: h  reason: collision with root package name */
    private final int f2037h;

    public enum a {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f2044e;

        private a(int i2) {
            this.f2044e = i2;
        }

        public final int c() {
            return this.f2044e;
        }
    }

    public c(JSONObject jSONObject) {
        l.d(jSONObject, "component");
        String string = jSONObject.getString("class_name");
        l.c(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.a = string;
        this.b = jSONObject.optInt("index", -1);
        this.c = jSONObject.optInt("id");
        String optString = jSONObject.optString("text");
        l.c(optString, "component.optString(PATH_TEXT_KEY)");
        this.f2033d = optString;
        String optString2 = jSONObject.optString("tag");
        l.c(optString2, "component.optString(PATH_TAG_KEY)");
        this.f2034e = optString2;
        String optString3 = jSONObject.optString("description");
        l.c(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f2035f = optString3;
        String optString4 = jSONObject.optString("hint");
        l.c(optString4, "component.optString(PATH_HINT_KEY)");
        this.f2036g = optString4;
        this.f2037h = jSONObject.optInt("match_bitmask");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.f2035f;
    }

    public final String c() {
        return this.f2036g;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public final int f() {
        return this.f2037h;
    }

    public final String g() {
        return this.f2034e;
    }

    public final String h() {
        return this.f2033d;
    }
}
