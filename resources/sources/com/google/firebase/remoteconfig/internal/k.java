package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class k {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Date f2895f = new Date(0);
    private JSONObject a;
    private JSONObject b;
    private Date c;

    /* renamed from: d  reason: collision with root package name */
    private JSONArray f2896d;

    /* renamed from: e  reason: collision with root package name */
    private JSONObject f2897e;

    public static class b {
        private JSONObject a;
        private Date b;
        private JSONArray c;

        /* renamed from: d  reason: collision with root package name */
        private JSONObject f2898d;

        private b() {
            this.a = new JSONObject();
            this.b = k.f2895f;
            this.c = new JSONArray();
            this.f2898d = new JSONObject();
        }

        public k a() {
            return new k(this.a, this.b, this.c, this.f2898d);
        }

        public b b(Map<String, String> map) {
            this.a = new JSONObject(map);
            return this;
        }

        public b c(JSONObject jSONObject) {
            try {
                this.a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(JSONArray jSONArray) {
            try {
                this.c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b e(Date date) {
            this.b = date;
            return this;
        }

        public b f(JSONObject jSONObject) {
            try {
                this.f2898d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }
    }

    private k(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.b = jSONObject;
        this.c = date;
        this.f2896d = jSONArray;
        this.f2897e = jSONObject2;
        this.a = jSONObject3;
    }

    static k b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new k(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject);
    }

    public static b g() {
        return new b();
    }

    public JSONArray c() {
        return this.f2896d;
    }

    public JSONObject d() {
        return this.b;
    }

    public Date e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return this.a.toString().equals(((k) obj).toString());
    }

    public JSONObject f() {
        return this.f2897e;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
