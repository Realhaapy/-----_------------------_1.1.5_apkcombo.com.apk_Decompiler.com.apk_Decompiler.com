package com.facebook.y0;

import android.os.Build;
import android.os.Bundle;
import com.facebook.c0;
import com.facebook.internal.i0;
import com.facebook.internal.o0;
import com.facebook.p0;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import m.d0.f;
import m.s;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONObject;

public final class v implements Serializable {

    /* renamed from: j  reason: collision with root package name */
    public static final a f2184j = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final HashSet<String> f2185k = new HashSet<>();
    private static final long serialVersionUID = 1;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f2186e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f2187f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f2188g;

    /* renamed from: h  reason: collision with root package name */
    private final String f2189h;

    /* renamed from: i  reason: collision with root package name */
    private final String f2190i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final String c(String str) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                Charset forName = Charset.forName("UTF-8");
                l.c(forName, "Charset.forName(charsetName)");
                if (str != null) {
                    byte[] bytes = str.getBytes(forName);
                    l.c(bytes, "(this as java.lang.String).getBytes(charset)");
                    instance.update(bytes, 0, bytes.length);
                    byte[] digest = instance.digest();
                    l.c(digest, "digest.digest()");
                    com.facebook.y0.q0.g gVar = com.facebook.y0.q0.g.a;
                    return com.facebook.y0.q0.g.c(digest);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (NoSuchAlgorithmException e2) {
                o0 o0Var = o0.a;
                o0.d0("Failed to generate checksum: ", e2);
                return "0";
            } catch (UnsupportedEncodingException e3) {
                o0 o0Var2 = o0.a;
                o0.d0("Failed to generate checksum: ", e3);
                return "1";
            }
        }

        /* access modifiers changed from: private */
        public final void d(String str) {
            boolean contains;
            if (str != null) {
                if (!(str.length() == 0) && str.length() <= 40) {
                    synchronized (v.f2185k) {
                        contains = v.f2185k.contains(str);
                        s sVar = s.a;
                    }
                    if (contains) {
                        return;
                    }
                    if (new f("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").a(str)) {
                        synchronized (v.f2185k) {
                            v.f2185k.add(str);
                        }
                        return;
                    }
                    m.y.d.s sVar2 = m.y.d.s.a;
                    String format = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                    l.c(format, "java.lang.String.format(format, *args)");
                    throw new c0(format);
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            m.y.d.s sVar3 = m.y.d.s.a;
            String format2 = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            l.c(format2, "java.lang.String.format(locale, format, *args)");
            throw new c0(format2);
        }
    }

    public static final class b implements Serializable {
        private static final long serialVersionUID = 20160803001L;

        /* renamed from: e  reason: collision with root package name */
        private final String f2191e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f2192f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f2193g;

        /* renamed from: h  reason: collision with root package name */
        private final String f2194h;

        public b(String str, boolean z, boolean z2, String str2) {
            l.d(str, "jsonString");
            this.f2191e = str;
            this.f2192f = z;
            this.f2193g = z2;
            this.f2194h = str2;
        }

        private final Object readResolve() {
            return new v(this.f2191e, this.f2192f, this.f2193g, this.f2194h, (g) null);
        }
    }

    public v(String str, String str2, Double d2, Bundle bundle, boolean z, boolean z2, UUID uuid) {
        l.d(str, "contextName");
        l.d(str2, "eventName");
        this.f2187f = z;
        this.f2188g = z2;
        this.f2189h = str2;
        this.f2186e = d(str, str2, d2, bundle, uuid);
        this.f2190i = b();
    }

    private v(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f2186e = jSONObject;
        this.f2187f = z;
        String optString = jSONObject.optString("_eventName");
        l.c(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.f2189h = optString;
        this.f2190i = str2;
        this.f2188g = z2;
    }

    public /* synthetic */ v(String str, boolean z, boolean z2, String str2, g gVar) {
        this(str, z, z2, str2);
    }

    private final String b() {
        a aVar;
        String sb;
        String str;
        if (Build.VERSION.SDK_INT > 19) {
            aVar = f2184j;
            sb = this.f2186e.toString();
            str = "jsonObject.toString()";
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<String> keys = this.f2186e.keys();
            while (keys.hasNext()) {
                arrayList.add(keys.next());
            }
            n.k(arrayList);
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                sb2.append(str2);
                sb2.append(" = ");
                sb2.append(this.f2186e.optString(str2));
                sb2.append(10);
            }
            aVar = f2184j;
            sb = sb2.toString();
            str = "sb.toString()";
        }
        l.c(sb, str);
        return aVar.c(sb);
    }

    private final JSONObject d(String str, String str2, Double d2, Bundle bundle, UUID uuid) {
        a aVar = f2184j;
        aVar.d(str2);
        JSONObject jSONObject = new JSONObject();
        com.facebook.y0.t0.a aVar2 = com.facebook.y0.t0.a.a;
        String e2 = com.facebook.y0.t0.a.e(str2);
        jSONObject.put("_eventName", e2);
        jSONObject.put("_eventName_md5", aVar.c(e2));
        jSONObject.put("_logTime", System.currentTimeMillis() / ((long) 1000));
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map<String, String> i2 = i(bundle);
            for (String next : i2.keySet()) {
                jSONObject.put(next, i2.get(next));
            }
        }
        if (d2 != null) {
            jSONObject.put("_valueToSum", d2.doubleValue());
        }
        if (this.f2188g) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f2187f) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            i0.a aVar3 = i0.f1448e;
            p0 p0Var = p0.APP_EVENTS;
            String jSONObject2 = jSONObject.toString();
            l.c(jSONObject2, "eventObject.toString()");
            aVar3.c(p0Var, "AppEvents", "Created app event '%s'", jSONObject2);
        }
        return jSONObject;
    }

    private final Map<String, String> i(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            a aVar = f2184j;
            l.c(str, "key");
            aVar.d(str);
            Object obj = bundle.get(str);
            if ((obj instanceof String) || (obj instanceof Number)) {
                hashMap.put(str, obj.toString());
            } else {
                m.y.d.s sVar = m.y.d.s.a;
                String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2));
                l.c(format, "java.lang.String.format(format, *args)");
                throw new c0(format);
            }
        }
        com.facebook.y0.p0.a aVar2 = com.facebook.y0.p0.a.a;
        com.facebook.y0.p0.a.c(hashMap);
        com.facebook.y0.t0.a aVar3 = com.facebook.y0.t0.a.a;
        com.facebook.y0.t0.a.f(hashMap, this.f2189h);
        com.facebook.y0.n0.a aVar4 = com.facebook.y0.n0.a.a;
        com.facebook.y0.n0.a.c(hashMap, this.f2189h);
        return hashMap;
    }

    private final Object writeReplace() {
        String jSONObject = this.f2186e.toString();
        l.c(jSONObject, "jsonObject.toString()");
        return new b(jSONObject, this.f2187f, this.f2188g, this.f2190i);
    }

    public final boolean c() {
        return this.f2187f;
    }

    public final JSONObject e() {
        return this.f2186e;
    }

    public final String f() {
        return this.f2189h;
    }

    public final boolean g() {
        if (this.f2190i == null) {
            return true;
        }
        return l.a(b(), this.f2190i);
    }

    public final boolean h() {
        return this.f2187f;
    }

    public String toString() {
        m.y.d.s sVar = m.y.d.s.a;
        String format = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.f2186e.optString("_eventName"), Boolean.valueOf(this.f2187f), this.f2186e.toString()}, 3));
        l.c(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
