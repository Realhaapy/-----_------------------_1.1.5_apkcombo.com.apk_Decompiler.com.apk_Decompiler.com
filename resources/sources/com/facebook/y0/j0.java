package com.facebook.y0;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.g0;
import com.facebook.internal.o0;
import com.facebook.internal.s0.n.a;
import com.facebook.y0.k0.e;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import m.d0.f;
import m.y.d.l;

public final class j0 {
    public static final j0 a = new j0();
    private static final String b;
    private static SharedPreferences c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicBoolean f1848d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap<String, String> f1849e = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private static final ConcurrentHashMap<String, String> f1850f = new ConcurrentHashMap<>();

    static {
        String simpleName = j0.class.getSimpleName();
        l.c(simpleName, "UserDataStore::class.java.simpleName");
        b = simpleName;
    }

    private j0() {
    }

    public static final void a() {
        Class<j0> cls = j0.class;
        if (!a.d(cls)) {
            try {
                g0.b.b().execute(s.f2138e);
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void b() {
        Class<j0> cls = j0.class;
        if (!a.d(cls)) {
            try {
                if (!f1848d.get()) {
                    Log.w(b, "initStore should have been called before calling setUserData");
                    a.e();
                }
                f1849e.clear();
                SharedPreferences sharedPreferences = c;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString("com.facebook.appevents.UserDataStore.userData", (String) null).apply();
                } else {
                    l.n("sharedPreferences");
                    throw null;
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final String c() {
        Class<j0> cls = j0.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            if (!f1848d.get()) {
                a.e();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(f1849e);
            hashMap.putAll(a.d());
            o0 o0Var = o0.a;
            return o0.g0(hashMap);
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    private final Map<String, String> d() {
        if (a.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set<String> b2 = e.f1854d.b();
            for (String next : f1850f.keySet()) {
                if (b2.contains(next)) {
                    hashMap.put(next, f1850f.get(next));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    private final synchronized void e() {
        if (!a.d(this)) {
            try {
                AtomicBoolean atomicBoolean = f1848d;
                if (!atomicBoolean.get()) {
                    g0 g0Var = g0.a;
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(g0.c());
                    l.c(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
                    c = defaultSharedPreferences;
                    if (defaultSharedPreferences != null) {
                        String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
                        if (string == null) {
                            string = "";
                        }
                        SharedPreferences sharedPreferences = c;
                        if (sharedPreferences != null) {
                            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
                            if (string2 == null) {
                                string2 = "";
                            }
                            ConcurrentHashMap<String, String> concurrentHashMap = f1849e;
                            o0 o0Var = o0.a;
                            concurrentHashMap.putAll(o0.a0(string));
                            f1850f.putAll(o0.a0(string2));
                            atomicBoolean.set(true);
                            return;
                        }
                        l.n("sharedPreferences");
                        throw null;
                    }
                    l.n("sharedPreferences");
                    throw null;
                }
            } catch (Throwable th) {
                a.b(th, this);
            }
        }
    }

    public static final void f() {
        Class<j0> cls = j0.class;
        if (!a.d(cls)) {
            try {
                if (!f1848d.get()) {
                    a.e();
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    private final boolean j(String str) {
        if (a.d(this)) {
            return false;
        }
        try {
            return new f("[A-Fa-f0-9]{64}").a(str);
        } catch (Throwable th) {
            a.b(th, this);
            return false;
        }
    }

    private final String k(String str, String str2) {
        String str3;
        if (a.d(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (true) {
                if (i2 > length) {
                    break;
                }
                boolean z2 = l.e(str2.charAt(!z ? i2 : length), 32) <= 0;
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i2++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = str2.subSequence(i2, length + 1).toString();
            if (obj != null) {
                String lowerCase = obj.toLowerCase();
                l.c(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (l.a("em", str)) {
                    if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                        return lowerCase;
                    }
                    Log.e(b, "Setting email failure: this is not a valid email address");
                    return "";
                } else if (l.a("ph", str)) {
                    return new f("[^0-9]").b(lowerCase, "");
                } else {
                    if (!l.a("ge", str)) {
                        return lowerCase;
                    }
                    if (!(lowerCase.length() > 0)) {
                        str3 = "";
                    } else if (lowerCase != null) {
                        str3 = lowerCase.substring(0, 1);
                        l.c(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    if (!l.a("f", str3)) {
                        if (!l.a("m", str3)) {
                            Log.e(b, "Setting gender failure: the supported value for gender is f or m");
                            return "";
                        }
                    }
                    return str3;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    public static final void l(Map<String, String> map) {
        Class<j0> cls = j0.class;
        if (!a.d(cls)) {
            try {
                l.d(map, "ud");
                if (!f1848d.get()) {
                    a.e();
                }
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    String str2 = (String) next.getValue();
                    o0 o0Var = o0.a;
                    j0 j0Var = a;
                    int i2 = 1;
                    int length = str2.length() - 1;
                    int i3 = 0;
                    boolean z = false;
                    while (true) {
                        if (i3 > length) {
                            break;
                        }
                        boolean z2 = l.e(str2.charAt(!z ? i3 : length), 32) <= 0;
                        if (!z) {
                            if (!z2) {
                                z = true;
                            } else {
                                i3++;
                            }
                        } else if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    String A0 = o0.A0(j0Var.k(str, str2.subSequence(i3, length + 1).toString()));
                    ConcurrentHashMap<String, String> concurrentHashMap = f1850f;
                    if (concurrentHashMap.containsKey(str)) {
                        String str3 = concurrentHashMap.get(str);
                        String[] strArr = null;
                        if (str3 != null) {
                            List<String> c2 = new f(",").c(str3, 0);
                            if (c2 != null) {
                                Object[] array = c2.toArray(new String[0]);
                                if (array != null) {
                                    strArr = (String[]) array;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                            }
                        }
                        if (strArr == null) {
                            strArr = new String[0];
                        }
                        Set d2 = e0.d(Arrays.copyOf(strArr, strArr.length));
                        if (!d2.contains(A0)) {
                            StringBuilder sb = new StringBuilder();
                            if (!(strArr.length == 0)) {
                                if (strArr.length < 5) {
                                    sb.append(str3);
                                    sb.append(",");
                                } else {
                                    while (true) {
                                        int i4 = i2 + 1;
                                        sb.append(strArr[i2]);
                                        sb.append(",");
                                        if (i4 >= 5) {
                                            break;
                                        }
                                        i2 = i4;
                                    }
                                    sb.append(A0);
                                    d2.remove(strArr[0]);
                                    f1850f.put(str, sb.toString());
                                }
                            }
                            sb.append(A0);
                            f1850f.put(str, sb.toString());
                        } else {
                            return;
                        }
                    } else {
                        concurrentHashMap.put(str, A0);
                    }
                }
                j0 j0Var2 = a;
                o0 o0Var2 = o0.a;
                j0Var2.q("com.facebook.appevents.UserDataStore.internalUserData", o0.g0(f1850f));
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final void m(Bundle bundle) {
        Class<j0> cls = j0.class;
        if (!a.d(cls)) {
            try {
                g0.b.b().execute(new r(bundle));
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final void n(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Class<j0> cls = j0.class;
        if (!a.d(cls)) {
            try {
                Bundle bundle = new Bundle();
                if (str != null) {
                    bundle.putString("em", str);
                }
                if (str2 != null) {
                    bundle.putString("fn", str2);
                }
                if (str3 != null) {
                    bundle.putString("ln", str3);
                }
                if (str4 != null) {
                    bundle.putString("ph", str4);
                }
                if (str5 != null) {
                    bundle.putString("db", str5);
                }
                if (str6 != null) {
                    bundle.putString("ge", str6);
                }
                if (str7 != null) {
                    bundle.putString("ct", str7);
                }
                if (str8 != null) {
                    bundle.putString("st", str8);
                }
                if (str9 != null) {
                    bundle.putString("zp", str9);
                }
                if (str10 != null) {
                    bundle.putString("country", str10);
                }
                m(bundle);
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void o(Bundle bundle) {
        Class<j0> cls = j0.class;
        if (!a.d(cls)) {
            try {
                if (!f1848d.get()) {
                    Log.w(b, "initStore should have been called before calling setUserData");
                    a.e();
                }
                j0 j0Var = a;
                j0Var.p(bundle);
                o0 o0Var = o0.a;
                j0Var.q("com.facebook.appevents.UserDataStore.userData", o0.g0(f1849e));
                j0Var.q("com.facebook.appevents.UserDataStore.internalUserData", o0.g0(f1850f));
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    private final void p(Bundle bundle) {
        String A0;
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!a.d(this) && bundle != null) {
            try {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        String obj2 = obj.toString();
                        if (j(obj2)) {
                            concurrentHashMap = f1849e;
                            if (obj2 != null) {
                                A0 = obj2.toLowerCase();
                                l.c(A0, "(this as java.lang.String).toLowerCase()");
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                        } else {
                            o0 o0Var = o0.a;
                            l.c(str, "key");
                            A0 = o0.A0(k(str, obj2));
                            if (A0 != null) {
                                concurrentHashMap = f1849e;
                            }
                        }
                        concurrentHashMap.put(str, A0);
                    }
                }
            } catch (Throwable th) {
                a.b(th, this);
            }
        }
    }

    private final void q(String str, String str2) {
        if (!a.d(this)) {
            try {
                g0 g0Var = g0.a;
                g0.k().execute(new q(str, str2));
            } catch (Throwable th) {
                a.b(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void r(String str, String str2) {
        Class<j0> cls = j0.class;
        if (!a.d(cls)) {
            try {
                l.d(str, "$key");
                l.d(str2, "$value");
                if (!f1848d.get()) {
                    a.e();
                }
                SharedPreferences sharedPreferences = c;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString(str, str2).apply();
                } else {
                    l.n("sharedPreferences");
                    throw null;
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }
}
