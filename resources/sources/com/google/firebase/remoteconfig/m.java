package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import com.google.firebase.installations.h;
import com.google.firebase.l.a;
import com.google.firebase.l.c;
import com.google.firebase.remoteconfig.internal.j;
import com.google.firebase.remoteconfig.internal.k;
import com.google.firebase.remoteconfig.internal.l;
import com.google.firebase.remoteconfig.internal.n;
import f.e.a.c.g.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class m {

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f2911j = new byte[0];
    private final c a;
    private final Executor b;
    private final j c;

    /* renamed from: d  reason: collision with root package name */
    private final j f2912d;

    /* renamed from: e  reason: collision with root package name */
    private final j f2913e;

    /* renamed from: f  reason: collision with root package name */
    private final l f2914f;

    /* renamed from: g  reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.m f2915g;

    /* renamed from: h  reason: collision with root package name */
    private final n f2916h;

    /* renamed from: i  reason: collision with root package name */
    private final h f2917i;

    m(Context context, com.google.firebase.h hVar, h hVar2, c cVar, Executor executor, j jVar, j jVar2, j jVar3, l lVar, com.google.firebase.remoteconfig.internal.m mVar, n nVar) {
        this.f2917i = hVar2;
        this.a = cVar;
        this.b = executor;
        this.c = jVar;
        this.f2912d = jVar2;
        this.f2913e = jVar3;
        this.f2914f = lVar;
        this.f2915g = mVar;
        this.f2916h = nVar;
    }

    public static m g(com.google.firebase.h hVar) {
        return ((u) hVar.h(u.class)).d();
    }

    private static boolean h(k kVar, k kVar2) {
        return kVar2 == null || !kVar.e().equals(kVar2.e());
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ i j(i iVar, i iVar2, i iVar3) {
        Boolean bool = Boolean.FALSE;
        if (!iVar.m() || iVar.i() == null) {
            return f.e.a.c.g.l.f(bool);
        }
        k kVar = (k) iVar.i();
        return (!iVar2.m() || h(kVar, (k) iVar2.i())) ? this.f2912d.k(kVar).f(this.b, new g(this)) : f.e.a.c.g.l.f(bool);
    }

    static /* synthetic */ q k(i iVar, i iVar2) {
        return (q) iVar.i();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ i n(Void voidR) {
        return a();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Void q(s sVar) {
        this.f2916h.i(sVar);
        return null;
    }

    /* access modifiers changed from: private */
    public boolean s(i<k> iVar) {
        if (!iVar.m()) {
            return false;
        }
        this.c.b();
        if (iVar.i() != null) {
            y(iVar.i().c());
            return true;
        }
        Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
        return true;
    }

    private i<Void> v(Map<String, String> map) {
        try {
            k.b g2 = k.g();
            g2.b(map);
            return this.f2913e.k(g2.a()).n(c.a);
        } catch (JSONException e2) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e2);
            return f.e.a.c.g.l.f(null);
        }
    }

    static List<Map<String, String>> x(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public i<Boolean> a() {
        i<k> c2 = this.c.c();
        i<k> c3 = this.f2912d.c();
        return f.e.a.c.g.l.j(c2, c3).g(this.b, new e(this, c2, c3));
    }

    public i<q> b() {
        i<k> c2 = this.f2912d.c();
        i<k> c3 = this.f2913e.c();
        i<k> c4 = this.c.c();
        i d2 = f.e.a.c.g.l.d(this.b, new l(this));
        return f.e.a.c.g.l.j(c2, c3, c4, d2, this.f2917i.a(), this.f2917i.b(false)).f(this.b, new f(d2));
    }

    public i<Void> c() {
        return this.f2914f.d().n(b.a);
    }

    public i<Boolean> d() {
        return c().o(this.b, new d(this));
    }

    public Map<String, t> e() {
        return this.f2915g.c();
    }

    public q f() {
        return this.f2916h.c();
    }

    public i<Void> t(s sVar) {
        return f.e.a.c.g.l.d(this.b, new a(this, sVar));
    }

    public i<Void> u(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            boolean z = value instanceof byte[];
            String str = (String) next.getKey();
            if (z) {
                hashMap.put(str, new String((byte[]) value));
            } else {
                hashMap.put(str, value.toString());
            }
        }
        return v(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.f2912d.c();
        this.f2913e.c();
        this.c.c();
    }

    /* access modifiers changed from: package-private */
    public void y(JSONArray jSONArray) {
        if (this.a != null) {
            try {
                this.a.k(x(jSONArray));
            } catch (JSONException e2) {
                Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
            } catch (a e3) {
                Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e3);
            }
        }
    }
}
