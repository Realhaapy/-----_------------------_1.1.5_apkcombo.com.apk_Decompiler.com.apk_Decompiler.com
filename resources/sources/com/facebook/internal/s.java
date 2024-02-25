package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import m.y.d.l;
import org.json.JSONArray;
import org.json.JSONObject;

public final class s {
    public static final s a = new s();
    private static final Map<Class<?>, h> b;

    public static final class a implements h {
        a() {
        }

        public void a(Bundle bundle, String str, Object obj) {
            l.d(bundle, "bundle");
            l.d(str, "key");
            l.d(obj, "value");
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    public static final class b implements h {
        b() {
        }

        public void a(Bundle bundle, String str, Object obj) {
            l.d(bundle, "bundle");
            l.d(str, "key");
            l.d(obj, "value");
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    public static final class c implements h {
        c() {
        }

        public void a(Bundle bundle, String str, Object obj) {
            l.d(bundle, "bundle");
            l.d(str, "key");
            l.d(obj, "value");
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    public static final class d implements h {
        d() {
        }

        public void a(Bundle bundle, String str, Object obj) {
            l.d(bundle, "bundle");
            l.d(str, "key");
            l.d(obj, "value");
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    public static final class e implements h {
        e() {
        }

        public void a(Bundle bundle, String str, Object obj) {
            l.d(bundle, "bundle");
            l.d(str, "key");
            l.d(obj, "value");
            bundle.putString(str, (String) obj);
        }
    }

    public static final class f implements h {
        f() {
        }

        public void a(Bundle bundle, String str, Object obj) {
            l.d(bundle, "bundle");
            l.d(str, "key");
            l.d(obj, "value");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    public static final class g implements h {
        g() {
        }

        public void a(Bundle bundle, String str, Object obj) {
            l.d(bundle, "bundle");
            l.d(str, "key");
            l.d(obj, "value");
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int i2 = 0;
            int length = jSONArray.length();
            if (length > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    Object obj2 = jSONArray.get(i2);
                    if (obj2 instanceof String) {
                        arrayList.add(obj2);
                        if (i3 >= length) {
                            break;
                        }
                        i2 = i3;
                    } else {
                        throw new IllegalArgumentException(l.j("Unexpected type in an array: ", obj2.getClass()));
                    }
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    public interface h {
        void a(Bundle bundle, String str, Object obj);
    }

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(Boolean.class, new a());
        hashMap.put(Integer.class, new b());
        hashMap.put(Long.class, new c());
        hashMap.put(Double.class, new d());
        hashMap.put(String.class, new e());
        hashMap.put(String[].class, new f());
        hashMap.put(JSONArray.class, new g());
    }

    private s() {
    }

    public static final Bundle a(JSONObject jSONObject) {
        l.d(jSONObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, a((JSONObject) obj));
                } else {
                    h hVar = b.get(obj.getClass());
                    if (hVar != null) {
                        l.c(next, "key");
                        l.c(obj, "value");
                        hVar.a(bundle, next, obj);
                    } else {
                        throw new IllegalArgumentException(l.j("Unsupported type: ", obj.getClass()));
                    }
                }
            }
        }
        return bundle;
    }
}
