package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.common.util.d;
import com.google.firebase.remoteconfig.t;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

public class m {

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f2907e = Charset.forName("UTF-8");
    private final Set<d<String, k>> a = new HashSet();
    private final Executor b;
    private final j c;

    /* renamed from: d  reason: collision with root package name */
    private final j f2908d;

    static {
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public m(Executor executor, j jVar, j jVar2) {
        this.b = executor;
        this.c = jVar;
        this.f2908d = jVar2;
    }

    private void b(String str, k kVar) {
        if (kVar != null) {
            synchronized (this.a) {
                for (d<String, k> gVar : this.a) {
                    this.b.execute(new g(gVar, str, kVar));
                }
            }
        }
    }

    private static k d(j jVar) {
        return jVar.d();
    }

    private static Set<String> e(j jVar) {
        HashSet hashSet = new HashSet();
        k d2 = d(jVar);
        if (d2 == null) {
            return hashSet;
        }
        Iterator<String> keys = d2.d().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    private static String f(j jVar, String str) {
        k d2 = d(jVar);
        if (d2 == null) {
            return null;
        }
        try {
            return d2.d().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void i(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", new Object[]{str2, str}));
    }

    public void a(d<String, k> dVar) {
        synchronized (this.a) {
            this.a.add(dVar);
        }
    }

    public Map<String, t> c() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(e(this.c));
        hashSet.addAll(e(this.f2908d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, g(str));
        }
        return hashMap;
    }

    public t g(String str) {
        String f2 = f(this.c, str);
        if (f2 != null) {
            b(str, d(this.c));
            return new q(f2, 2);
        }
        String f3 = f(this.f2908d, str);
        if (f3 != null) {
            return new q(f3, 1);
        }
        i(str, "FirebaseRemoteConfigValue");
        return new q("", 0);
    }
}
