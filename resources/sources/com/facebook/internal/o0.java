package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.c0;
import com.facebook.g0;
import com.facebook.internal.a0;
import com.facebook.j0;
import com.facebook.m0;
import com.facebook.n0;
import com.facebook.u;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import m.d0.d;
import m.d0.f;
import m.y.d.l;
import m.y.d.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class o0 {
    public static final o0 a = new o0();
    private static int b = 0;
    private static long c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static long f1472d = -1;

    /* renamed from: e  reason: collision with root package name */
    private static long f1473e = -1;

    /* renamed from: f  reason: collision with root package name */
    private static String f1474f = "";

    /* renamed from: g  reason: collision with root package name */
    private static String f1475g = "";

    /* renamed from: h  reason: collision with root package name */
    private static String f1476h = "NoCarrier";

    public interface a {
        void a(c0 c0Var);

        void b(JSONObject jSONObject);
    }

    private o0() {
    }

    private final j0 A(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", G(x()));
        bundle.putString("access_token", str);
        j0 y = j0.f1546n.y((u) null, (j0.d) null);
        y.G(bundle);
        y.F(n0.GET);
        return y;
    }

    public static final String A0(String str) {
        if (str == null) {
            return null;
        }
        return a.K("SHA-256", str);
    }

    public static final void B(String str, a aVar) {
        l.d(str, "accessToken");
        l.d(aVar, "callback");
        l0 l0Var = l0.a;
        JSONObject a2 = l0.a(str);
        if (a2 != null) {
            aVar.b(a2);
            return;
        }
        k kVar = new k(aVar, str);
        j0 A = a.A(str);
        A.C(kVar);
        A.k();
    }

    public static final void B0(Parcel parcel, Map<String, String> map) {
        l.d(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    /* access modifiers changed from: private */
    public static final void C(a aVar, String str, m0 m0Var) {
        l.d(aVar, "$callback");
        l.d(str, "$accessToken");
        l.d(m0Var, "response");
        if (m0Var.b() != null) {
            aVar.a(m0Var.b().e());
            return;
        }
        l0 l0Var = l0.a;
        JSONObject d2 = m0Var.d();
        if (d2 != null) {
            l0.b(str, d2);
            aVar.b(m0Var.d());
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static final void C0(Parcel parcel, Map<String, String> map) {
        l.d(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    public static final String D(Context context) {
        p0 p0Var = p0.a;
        p0.j(context, "context");
        g0 g0Var = g0.a;
        return g0.d();
    }

    public static final Method E(Class<?> cls, String str, Class<?>... clsArr) {
        l.d(cls, "clazz");
        l.d(str, "methodName");
        l.d(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method F(String str, String str2, Class<?>... clsArr) {
        l.d(str, "className");
        l.d(str2, "methodName");
        l.d(clsArr, "parameterTypes");
        try {
            Class<?> cls = Class.forName(str);
            l.c(cls, "forName(className)");
            return E(cls, str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final String G(String str) {
        return l.a(str, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
    }

    public static final Locale H() {
        try {
            g0 g0Var = g0.a;
            return g0.c().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object I(JSONObject jSONObject, String str, String str2) {
        l.d(jSONObject, "jsonObject");
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new c0("Got an unexpected non-JSON object.");
    }

    private final String J(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        l.c(digest, "digest");
        int length = digest.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = digest[i2];
            i2++;
            sb.append(Integer.toHexString((b2 >> 4) & 15));
            sb.append(Integer.toHexString((b2 >> 0) & 15));
        }
        String sb2 = sb.toString();
        l.c(sb2, "builder.toString()");
        return sb2;
    }

    private final String K(String str, String str2) {
        Charset charset = d.a;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = str2.getBytes(charset);
        l.c(bytes, "(this as java.lang.String).getBytes(charset)");
        return L(str, bytes);
    }

    private final String L(String str, byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            l.c(instance, "hash");
            return J(instance, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final Object M(Object obj, Method method, Object... objArr) {
        l.d(method, "method");
        l.d(objArr, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean N() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            s sVar = s.a;
            g0 g0Var = g0.a;
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{g0.d()}, 1));
            l.c(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context c2 = g0.c();
            PackageManager packageManager = c2.getPackageManager();
            String packageName = c2.getPackageName();
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 65536)) {
                if (l.a(packageName, resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        r3 = (android.view.autofill.AutofillManager) r3.getSystemService(android.view.autofill.AutofillManager.class);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean O(android.content.Context r3) {
        /*
            java.lang.String r0 = "context"
            m.y.d.l.d(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 26
            if (r0 >= r2) goto L_0x000d
            return r1
        L_0x000d:
            java.lang.Class<android.view.autofill.AutofillManager> r0 = android.view.autofill.AutofillManager.class
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.autofill.AutofillManager r3 = (android.view.autofill.AutofillManager) r3
            if (r3 == 0) goto L_0x0024
            boolean r0 = r3.isAutofillSupported()
            if (r0 == 0) goto L_0x0024
            boolean r3 = r3.isEnabled()
            if (r3 == 0) goto L_0x0024
            r1 = 1
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.o0.O(android.content.Context):boolean");
    }

    public static final boolean P(Context context) {
        l.d(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str != null) {
            l.c(str, "DEVICE");
            if (new f(".+_cheets|cheets_.+").a(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean Q(Uri uri) {
        return uri != null && p.l("content", uri.getScheme(), true);
    }

    public static final boolean R(u uVar) {
        return uVar != null && l.a(uVar, u.f1749p.e());
    }

    public static final boolean S() {
        Class<o0> cls = o0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return false;
        }
        try {
            JSONObject y = y();
            if (y == null) {
                return false;
            }
            try {
                JSONArray jSONArray = y.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                if (length > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        String string = jSONArray.getString(i2);
                        l.c(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        l.c(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (l.a(lowerCase, "ldu")) {
                            return true;
                        }
                        if (i3 >= length) {
                            break;
                        }
                        i2 = i3;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return false;
        }
    }

    public static final boolean T(Uri uri) {
        return uri != null && p.l("file", uri.getScheme(), true);
    }

    private final boolean U(Context context) {
        Method F = F("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (F == null) {
            return false;
        }
        Object M = M((Object) null, F, context);
        return (M instanceof Integer) && l.a(M, 0);
    }

    public static final boolean V(String str) {
        if (str != null) {
            return str.length() == 0;
        }
    }

    public static final boolean W(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static final boolean X(Uri uri) {
        return uri != null && (p.l("http", uri.getScheme(), true) || p.l("https", uri.getScheme(), true) || p.l("fbstaging", uri.getScheme(), true));
    }

    public static final Set<String> Y(JSONArray jSONArray) {
        l.d(jSONArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        if (length > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                String string = jSONArray.getString(i2);
                l.c(string, "jsonArray.getString(i)");
                hashSet.add(string);
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return hashSet;
    }

    public static final List<String> Z(JSONArray jSONArray) {
        l.d(jSONArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(jSONArray.getString(i2));
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return arrayList;
    }

    private final void a(JSONObject jSONObject, q qVar, String str, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !U(context) || !qVar.k()) {
            jSONObject.put("anon_id", str);
        }
    }

    public static final Map<String, String> a0(String str) {
        l.d(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                l.c(next, "key");
                String string = jSONObject.getString(next);
                l.c(string, "jsonObject.getString(key)");
                hashMap.put(next, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    private final void b(JSONObject jSONObject, q qVar, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !U(context) || !qVar.k()) {
            jSONObject.put("attribution", qVar.j());
        }
    }

    public static final <T> boolean c(T t, T t2) {
        return t == null ? t2 == null : l.a(t, t2);
    }

    public static final JSONObject d(String str) {
        l.d(str, "accessToken");
        l0 l0Var = l0.a;
        JSONObject a2 = l0.a(str);
        if (a2 != null) {
            return a2;
        }
        m0 j2 = a.A(str).j();
        if (j2.b() != null) {
            return null;
        }
        return j2.d();
    }

    public static final void d0(String str, Exception exc) {
        g0 g0Var = g0.a;
        if (g0.t() && str != null && exc != null) {
            Log.d(str, exc.getClass().getSimpleName() + ": " + exc.getMessage());
        }
    }

    public static final Uri e(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        l.c(build, "builder.build()");
        return build;
    }

    public static final void e0(String str, String str2) {
        g0 g0Var = g0.a;
        if (g0.t() && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    private final void f(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            Object[] array = q.U(cookie, new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                String str2 = strArr[i2];
                i2++;
                Object[] array2 = q.U(str2, new String[]{"="}, false, 0, 6, (Object) null).toArray(new String[0]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr2 = (String[]) array2;
                if (strArr2.length > 0) {
                    String str3 = strArr2[0];
                    int length2 = str3.length() - 1;
                    int i3 = 0;
                    boolean z = false;
                    while (i3 <= length2) {
                        boolean z2 = l.e(str3.charAt(!z ? i3 : length2), 32) <= 0;
                        if (!z) {
                            if (!z2) {
                                z = true;
                            } else {
                                i3++;
                            }
                        } else if (!z2) {
                            break;
                        } else {
                            length2--;
                        }
                    }
                    instance.setCookie(str, l.j(str3.subSequence(i3, length2 + 1).toString(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
                }
            }
            instance.removeExpiredCookie();
        }
    }

    public static final void f0(String str, String str2, Throwable th) {
        g0 g0Var = g0.a;
        if (g0.t() && !V(str)) {
            Log.d(str, str2, th);
        }
    }

    public static final void g(Context context) {
        l.d(context, "context");
        try {
            o0 o0Var = a;
            o0Var.f(context, "facebook.com");
            o0Var.f(context, ".facebook.com");
            o0Var.f(context, "https://facebook.com");
            o0Var.f(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final String g0(Map<String, String> map) {
        l.d(map, "map");
        String str = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry next : map.entrySet()) {
                    jSONObject.put((String) next.getKey(), (String) next.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            l.c(str, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return str;
    }

    public static final void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final String h0(String str) {
        l.d(str, "key");
        return a.K("MD5", str);
    }

    public static final String i(String str, String str2) {
        return V(str) ? str2 : str;
    }

    public static final boolean i0(Context context) {
        l.d(context, "context");
        return O(context);
    }

    private final long j(double d2) {
        return Math.round(d2 / 1.073741824E9d);
    }

    public static final Bundle j0(String str) {
        Bundle bundle = new Bundle();
        if (!V(str)) {
            if (str != null) {
                Object[] array = q.U(str, new String[]{"&"}, false, 0, 6, (Object) null).toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                int length = strArr.length;
                int i2 = 0;
                while (i2 < length) {
                    String str2 = strArr[i2];
                    i2++;
                    Object[] array2 = q.U(str2, new String[]{"="}, false, 0, 6, (Object) null).toArray(new String[0]);
                    Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                    String[] strArr2 = (String[]) array2;
                    try {
                        if (strArr2.length == 2) {
                            bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                        } else if (strArr2.length == 1) {
                            bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), "");
                        }
                    } catch (UnsupportedEncodingException e2) {
                        d0("FacebookSDK", e2);
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return bundle;
    }

    public static final List<String> k(JSONArray jSONArray) {
        l.d(jSONArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            int length = jSONArray.length();
            if (length <= 0) {
                return arrayList;
            }
            while (true) {
                int i3 = i2 + 1;
                String string = jSONArray.getString(i2);
                l.c(string, "jsonArray.getString(i)");
                arrayList.add(string);
                if (i3 >= length) {
                    return arrayList;
                }
                i2 = i3;
            }
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final boolean k0(Bundle bundle, String str, Object obj) {
        String jSONObject;
        l.d(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return true;
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        } else {
            if (obj instanceof String) {
                jSONObject = (String) obj;
            } else if (obj instanceof JSONArray) {
                jSONObject = ((JSONArray) obj).toString();
            } else if (!(obj instanceof JSONObject)) {
                return false;
            } else {
                jSONObject = ((JSONObject) obj).toString();
            }
            bundle.putString(str, jSONObject);
            return true;
        }
    }

    public static final Map<String, Object> l(JSONObject jSONObject) {
        l.d(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jSONObject.names();
        if (names == null) {
            return hashMap;
        }
        int i2 = 0;
        int length = names.length();
        if (length > 0) {
            while (true) {
                int i3 = i2 + 1;
                try {
                    String string = names.getString(i2);
                    l.c(string, "keys.getString(i)");
                    Object obj = jSONObject.get(string);
                    if (obj instanceof JSONObject) {
                        obj = l((JSONObject) obj);
                    }
                    l.c(obj, "value");
                    hashMap.put(string, obj);
                } catch (JSONException unused) {
                }
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return hashMap;
    }

    public static final void l0(Bundle bundle, String str, String str2) {
        l.d(bundle, "b");
        if (!V(str2)) {
            bundle.putString(str, str2);
        }
    }

    public static final Map<String, String> m(JSONObject jSONObject) {
        l.d(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                l.c(next, "key");
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    public static final Map<String, String> m0(Parcel parcel) {
        l.d(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int i2 = 0;
        if (readInt > 0) {
            do {
                i2++;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (!(readString == null || readString2 == null)) {
                    hashMap.put(readString, readString2);
                    continue;
                }
            } while (i2 < readInt);
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int n(java.io.InputStream r6, java.io.OutputStream r7) {
        /*
            java.lang.String r0 = "outputStream"
            m.y.d.l.d(r7, r0)
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x002a }
            r1.<init>(r6)     // Catch:{ all -> 0x002a }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0027 }
            r2 = 0
            r3 = 0
        L_0x0011:
            int r4 = r1.read(r0)     // Catch:{ all -> 0x0027 }
            r5 = -1
            if (r4 == r5) goto L_0x001d
            r7.write(r0, r2, r4)     // Catch:{ all -> 0x0027 }
            int r3 = r3 + r4
            goto L_0x0011
        L_0x001d:
            r1.close()
            if (r6 != 0) goto L_0x0023
            goto L_0x0026
        L_0x0023:
            r6.close()
        L_0x0026:
            return r3
        L_0x0027:
            r7 = move-exception
            r0 = r1
            goto L_0x002b
        L_0x002a:
            r7 = move-exception
        L_0x002b:
            if (r0 != 0) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            r0.close()
        L_0x0031:
            if (r6 != 0) goto L_0x0034
            goto L_0x0037
        L_0x0034:
            r6.close()
        L_0x0037:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.o0.n(java.io.InputStream, java.io.OutputStream):int");
    }

    public static final String n0(InputStream inputStream) {
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            String sb2 = sb.toString();
                            l.c(sb2, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                            h(bufferedInputStream);
                            h(inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    h(bufferedInputStream);
                    h(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                h(bufferedInputStream);
                h(inputStreamReader);
                throw th;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
            h(bufferedInputStream);
            h(inputStreamReader);
            throw th;
        }
    }

    public static final void o(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static final Map<String, String> o0(Parcel parcel) {
        l.d(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int i2 = 0;
        if (readInt > 0) {
            do {
                i2++;
                hashMap.put(parcel.readString(), parcel.readString());
            } while (i2 < readInt);
        }
        return hashMap;
    }

    private final boolean p() {
        return l.a("mounted", Environment.getExternalStorageState());
    }

    private final void p0() {
        try {
            if (p()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f1473e = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            f1473e = j((double) f1473e);
        } catch (Exception unused) {
        }
    }

    public static final String q(int i2) {
        String bigInteger = new BigInteger(i2 * 5, new Random()).toString(32);
        l.c(bigInteger, "BigInteger(length * 5, r).toString(32)");
        return bigInteger;
    }

    private final int q0() {
        int i2 = b;
        if (i2 > 0) {
            return i2;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(l.a);
            if (listFiles != null) {
                b = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (b <= 0) {
            b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return b;
    }

    public static final String r(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        l.c(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    /* access modifiers changed from: private */
    public static final boolean r0(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    public static final String s(Context context) {
        l.d(context, "context");
        try {
            g0 g0Var = g0.a;
            String e2 = g0.e();
            if (e2 != null) {
                return e2;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i2 = applicationInfo.labelRes;
            if (i2 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i2);
            l.c(string, "context.getString(stringId)");
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    private final void s0(Context context) {
        if (l.a(f1476h, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService("phone");
                if (systemService != null) {
                    String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                    l.c(networkOperatorName, "telephonyManager.networkOperatorName");
                    f1476h = networkOperatorName;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            } catch (Exception unused) {
            }
        }
    }

    public static final String t() {
        g0 g0Var = g0.a;
        Context c2 = g0.c();
        if (c2 == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = c2.getPackageManager().getPackageInfo(c2.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void t0(Context context) {
        if (c == -1 || System.currentTimeMillis() - c >= 1800000) {
            c = System.currentTimeMillis();
            u0();
            s0(context);
            v0();
            p0();
        }
    }

    public static final Date u(Bundle bundle, String str, Date date) {
        long j2;
        l.d(date, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            j2 = ((Number) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    j2 = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        return j2 == 0 ? new Date(Long.MAX_VALUE) : new Date(date.getTime() + (j2 * 1000));
    }

    private final void u0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            l.c(displayName, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
            f1474f = displayName;
            String id = timeZone.getID();
            l.c(id, "tz.id");
            f1475g = id;
        } catch (AssertionError | Exception unused) {
        }
    }

    public static final long v(Uri uri) {
        l.d(uri, "contentUri");
        Cursor cursor = null;
        try {
            g0 g0Var = g0.a;
            Cursor query = g0.c().getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
            if (query == null) {
                return 0;
            }
            int columnIndex = query.getColumnIndex("_size");
            query.moveToFirst();
            long j2 = query.getLong(columnIndex);
            query.close();
            return j2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final void v0() {
        try {
            if (p()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f1472d = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            f1472d = j((double) f1472d);
        } catch (Exception unused) {
        }
    }

    public static final Locale w() {
        Locale H = H();
        if (H != null) {
            return H;
        }
        Locale locale = Locale.getDefault();
        l.c(locale, "getDefault()");
        return locale;
    }

    public static final void w0(Runnable runnable) {
        try {
            g0 g0Var = g0.a;
            g0.k().execute(runnable);
        } catch (Exception unused) {
        }
    }

    private final String x() {
        u e2 = u.f1749p.e();
        return (e2 == null || e2.h() == null) ? "facebook" : e2.h();
    }

    public static final void x0(JSONObject jSONObject, q qVar, String str, boolean z, Context context) {
        l.d(jSONObject, "params");
        l.d(context, "context");
        a0 a0Var = a0.a;
        a0.b bVar = a0.b.ServiceUpdateCompliance;
        if (!a0.g(bVar)) {
            jSONObject.put("anon_id", str);
        }
        boolean z2 = true;
        jSONObject.put("application_tracking_enabled", !z);
        g0 g0Var = g0.a;
        jSONObject.put("advertiser_id_collection_enabled", g0.b());
        if (qVar != null) {
            if (a0.g(bVar)) {
                a.a(jSONObject, qVar, str, context);
            }
            if (qVar.j() != null) {
                if (a0.g(bVar)) {
                    a.b(jSONObject, qVar, context);
                } else {
                    jSONObject.put("attribution", qVar.j());
                }
            }
            if (qVar.h() != null) {
                jSONObject.put("advertiser_id", qVar.h());
                jSONObject.put("advertiser_tracking_enabled", !qVar.k());
            }
            if (!qVar.k()) {
                com.facebook.y0.j0 j0Var = com.facebook.y0.j0.a;
                String c2 = com.facebook.y0.j0.c();
                if (c2.length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    jSONObject.put("ud", c2);
                }
            }
            if (qVar.i() != null) {
                jSONObject.put("installer_package", qVar.i());
            }
        }
    }

    public static final JSONObject y() {
        Class<o0> cls = o0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            g0 g0Var = g0.a;
            String string = g0.c().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", (String) null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final void y0(JSONObject jSONObject, Context context) {
        String str;
        Locale locale;
        int i2;
        l.d(jSONObject, "params");
        l.d(context, "appContext");
        JSONArray jSONArray = new JSONArray();
        o0 o0Var = a;
        jSONArray.put("a2");
        o0Var.t0(context);
        String packageName = context.getPackageName();
        int i3 = 0;
        int i4 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo != null) {
                i4 = packageInfo.versionCode;
                str = packageInfo.versionName;
                jSONArray.put(packageName);
                jSONArray.put(i4);
                jSONArray.put(str);
                jSONArray.put(Build.VERSION.RELEASE);
                jSONArray.put(Build.MODEL);
                try {
                    locale = context.getResources().getConfiguration().locale;
                } catch (Exception unused) {
                    locale = Locale.getDefault();
                }
                jSONArray.put(locale.getLanguage() + '_' + locale.getCountry());
                jSONArray.put(f1474f);
                jSONArray.put(f1476h);
                double d2 = 0.0d;
                try {
                    Display display = null;
                    if (Build.VERSION.SDK_INT >= 17) {
                        Object systemService = context.getSystemService("display");
                        DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
                        if (displayManager != null) {
                            display = displayManager.getDisplay(0);
                        }
                    } else {
                        Object systemService2 = context.getSystemService("window");
                        WindowManager windowManager = systemService2 instanceof WindowManager ? (WindowManager) systemService2 : null;
                        if (windowManager != null) {
                            display = windowManager.getDefaultDisplay();
                        }
                    }
                    if (display != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        display.getMetrics(displayMetrics);
                        int i5 = displayMetrics.widthPixels;
                        try {
                            int i6 = displayMetrics.heightPixels;
                            try {
                                d2 = (double) displayMetrics.density;
                            } catch (Exception unused2) {
                            }
                            i2 = i6;
                            i3 = i5;
                        } catch (Exception unused3) {
                            i3 = i5;
                        }
                        jSONArray.put(i3);
                        jSONArray.put(i2);
                        jSONArray.put(new DecimalFormat("#.##").format(d2));
                        jSONArray.put(a.q0());
                        jSONArray.put(f1472d);
                        jSONArray.put(f1473e);
                        jSONArray.put(f1475g);
                        jSONObject.put("extinfo", jSONArray.toString());
                    }
                } catch (Exception unused4) {
                }
                i2 = 0;
                jSONArray.put(i3);
                jSONArray.put(i2);
                jSONArray.put(new DecimalFormat("#.##").format(d2));
                jSONArray.put(a.q0());
                jSONArray.put(f1472d);
                jSONArray.put(f1473e);
                jSONArray.put(f1475g);
                jSONObject.put("extinfo", jSONArray.toString());
            }
        } catch (PackageManager.NameNotFoundException unused5) {
            str = "";
        }
    }

    public static final String z(String str) {
        boolean z;
        int i2;
        Object obj;
        String str2;
        String str3;
        g0 g0Var = g0.a;
        String l2 = g0.l();
        if (str == null) {
            return l2;
        }
        if (l.a(str, "gaming")) {
            z = false;
            i2 = 4;
            obj = null;
            str2 = "facebook.com";
            str3 = "fb.gg";
        } else if (!l.a(str, "instagram")) {
            return l2;
        } else {
            z = false;
            i2 = 4;
            obj = null;
            str2 = "facebook.com";
            str3 = "instagram.com";
        }
        return p.r(l2, str2, str3, z, i2, obj);
    }

    public static final String z0(byte[] bArr) {
        l.d(bArr, "bytes");
        return a.L("SHA-1", bArr);
    }
}
