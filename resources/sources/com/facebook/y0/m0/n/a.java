package com.facebook.y0.m0.n;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final b f2023e = new b((g) null);
    private final String a;
    private final List<c> b;
    private final List<b> c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2024d;

    /* renamed from: com.facebook.y0.m0.n.a$a  reason: collision with other inner class name */
    public enum C0031a {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final a a(JSONObject jSONObject) {
            int length;
            l.d(jSONObject, "mapping");
            String string = jSONObject.getString("event_name");
            String string2 = jSONObject.getString("method");
            l.c(string2, "mapping.getString(\"method\")");
            Locale locale = Locale.ENGLISH;
            l.c(locale, "ENGLISH");
            String upperCase = string2.toUpperCase(locale);
            l.c(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            c valueOf = c.valueOf(upperCase);
            String string3 = jSONObject.getString("event_type");
            l.c(string3, "mapping.getString(\"event_type\")");
            l.c(locale, "ENGLISH");
            String upperCase2 = string3.toUpperCase(locale);
            l.c(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            C0031a valueOf2 = C0031a.valueOf(upperCase2);
            String string4 = jSONObject.getString("app_version");
            JSONArray jSONArray = jSONObject.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            int i2 = 0;
            if (length2 > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    l.c(jSONObject2, "jsonPath");
                    arrayList.add(new c(jSONObject2));
                    if (i4 >= length2) {
                        break;
                    }
                    i3 = i4;
                }
            }
            String optString = jSONObject.optString("path_type", "absolute");
            JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                while (true) {
                    int i5 = i2 + 1;
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i2);
                    l.c(jSONObject3, "jsonParameter");
                    arrayList2.add(new b(jSONObject3));
                    if (i5 >= length) {
                        break;
                    }
                    i2 = i5;
                }
            }
            String optString2 = jSONObject.optString("component_id");
            String optString3 = jSONObject.optString("activity_name");
            l.c(string, "eventName");
            l.c(string4, "appVersion");
            l.c(optString2, "componentId");
            l.c(optString, "pathType");
            l.c(optString3, "activityName");
            return new a(string, valueOf, valueOf2, string4, arrayList, arrayList2, optString2, optString, optString3);
        }

        public final List<a> b(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int i2 = 0;
                try {
                    int length = jSONArray.length();
                    if (length > 0) {
                        while (true) {
                            int i3 = i2 + 1;
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            l.c(jSONObject, "array.getJSONObject(i)");
                            arrayList.add(a(jSONObject));
                            if (i3 >= length) {
                                break;
                            }
                            i2 = i3;
                        }
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }
    }

    public enum c {
        MANUAL,
        INFERENCE
    }

    public a(String str, c cVar, C0031a aVar, String str2, List<c> list, List<b> list2, String str3, String str4, String str5) {
        l.d(str, "eventName");
        l.d(cVar, "method");
        l.d(aVar, "type");
        l.d(str2, "appVersion");
        l.d(list, "path");
        l.d(list2, "parameters");
        l.d(str3, "componentId");
        l.d(str4, "pathType");
        l.d(str5, "activityName");
        this.a = str;
        this.b = list;
        this.c = list2;
        this.f2024d = str5;
    }

    public final String a() {
        return this.f2024d;
    }

    public final String b() {
        return this.a;
    }

    public final List<b> c() {
        List<b> unmodifiableList = Collections.unmodifiableList(this.c);
        l.c(unmodifiableList, "unmodifiableList(parameters)");
        return unmodifiableList;
    }

    public final List<c> d() {
        List<c> unmodifiableList = Collections.unmodifiableList(this.b);
        l.c(unmodifiableList, "unmodifiableList(path)");
        return unmodifiableList;
    }
}
