package com.facebook.y0.l0;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.g0;
import com.facebook.internal.i0;
import com.facebook.internal.o0;
import com.facebook.j0;
import com.facebook.m0;
import com.facebook.n0;
import com.facebook.p0;
import com.facebook.u;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Objects;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {
    public static final f a = new f();
    private static final String b = "com.facebook.y0.l0.f";
    private static boolean c;

    private f() {
    }

    public static final void a() {
        try {
            a aVar = a.a;
            g0 g0Var = g0.a;
            j0 j0Var = new j0((u) null, l.j(g0.d(), "/cloudbridge_settings"), (Bundle) null, n0.GET, aVar, (String) null, 32, (g) null);
            i0.a aVar2 = i0.f1448e;
            p0 p0Var = p0.APP_EVENTS;
            String str = b;
            if (str != null) {
                aVar2.c(p0Var, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", j0Var);
                j0Var.k();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (JSONException e2) {
            i0.a aVar3 = i0.f1448e;
            p0 p0Var2 = p0.APP_EVENTS;
            String str2 = b;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            aVar3.c(p0Var2, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", b.b(e2));
        }
    }

    /* access modifiers changed from: private */
    public static final void b(m0 m0Var) {
        l.d(m0Var, "response");
        a.c(m0Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047 A[Catch:{ all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055 A[Catch:{ all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063 A[Catch:{ all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064 A[Catch:{ all -> 0x0099 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map<java.lang.String, java.lang.Object> d() {
        /*
            java.lang.Class<com.facebook.y0.l0.f> r0 = com.facebook.y0.l0.f.class
            boolean r1 = com.facebook.internal.s0.n.a.d(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            com.facebook.g0 r1 = com.facebook.g0.a     // Catch:{ all -> 0x0099 }
            android.content.Context r1 = com.facebook.g0.c()     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = "com.facebook.sdk.CloudBridgeSavedCredentials"
            r4 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r4)     // Catch:{ all -> 0x0099 }
            if (r1 != 0) goto L_0x001a
            return r2
        L_0x001a:
            com.facebook.y0.l0.o r3 = com.facebook.y0.l0.o.DATASETID     // Catch:{ all -> 0x0099 }
            java.lang.String r5 = r3.c()     // Catch:{ all -> 0x0099 }
            java.lang.String r5 = r1.getString(r5, r2)     // Catch:{ all -> 0x0099 }
            com.facebook.y0.l0.o r6 = com.facebook.y0.l0.o.URL     // Catch:{ all -> 0x0099 }
            java.lang.String r7 = r6.c()     // Catch:{ all -> 0x0099 }
            java.lang.String r7 = r1.getString(r7, r2)     // Catch:{ all -> 0x0099 }
            com.facebook.y0.l0.o r8 = com.facebook.y0.l0.o.ACCESSKEY     // Catch:{ all -> 0x0099 }
            java.lang.String r9 = r8.c()     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = r1.getString(r9, r2)     // Catch:{ all -> 0x0099 }
            r9 = 1
            if (r5 == 0) goto L_0x0044
            boolean r10 = m.d0.p.m(r5)     // Catch:{ all -> 0x0099 }
            if (r10 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r10 = 0
            goto L_0x0045
        L_0x0044:
            r10 = 1
        L_0x0045:
            if (r10 != 0) goto L_0x0098
            if (r7 == 0) goto L_0x0052
            boolean r10 = m.d0.p.m(r7)     // Catch:{ all -> 0x0099 }
            if (r10 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r10 = 0
            goto L_0x0053
        L_0x0052:
            r10 = 1
        L_0x0053:
            if (r10 != 0) goto L_0x0098
            if (r1 == 0) goto L_0x0060
            boolean r10 = m.d0.p.m(r1)     // Catch:{ all -> 0x0099 }
            if (r10 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r10 = 0
            goto L_0x0061
        L_0x0060:
            r10 = 1
        L_0x0061:
            if (r10 == 0) goto L_0x0064
            goto L_0x0098
        L_0x0064:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0099 }
            r10.<init>()     // Catch:{ all -> 0x0099 }
            java.lang.String r6 = r6.c()     // Catch:{ all -> 0x0099 }
            r10.put(r6, r7)     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = r3.c()     // Catch:{ all -> 0x0099 }
            r10.put(r3, r5)     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = r8.c()     // Catch:{ all -> 0x0099 }
            r10.put(r3, r1)     // Catch:{ all -> 0x0099 }
            com.facebook.internal.i0$a r3 = com.facebook.internal.i0.f1448e     // Catch:{ all -> 0x0099 }
            com.facebook.p0 r6 = com.facebook.p0.APP_EVENTS     // Catch:{ all -> 0x0099 }
            java.lang.String r8 = b     // Catch:{ all -> 0x0099 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0099 }
            java.lang.String r11 = " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n "
            r12 = 3
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ all -> 0x0099 }
            r12[r4] = r5     // Catch:{ all -> 0x0099 }
            r12[r9] = r7     // Catch:{ all -> 0x0099 }
            r4 = 2
            r12[r4] = r1     // Catch:{ all -> 0x0099 }
            r3.c(r6, r8, r11, r12)     // Catch:{ all -> 0x0099 }
            return r10
        L_0x0098:
            return r2
        L_0x0099:
            r1 = move-exception
            com.facebook.internal.s0.n.a.b(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.l0.f.d():java.util.Map");
    }

    public final void c(m0 m0Var) {
        l.d(m0Var, "response");
        boolean z = false;
        if (m0Var.b() != null) {
            i0.a aVar = i0.f1448e;
            p0 p0Var = p0.APP_EVENTS;
            String str = b;
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            aVar.c(p0Var, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", m0Var.b().toString(), String.valueOf(m0Var.b().e()));
            Map<String, Object> d2 = d();
            if (d2 != null) {
                URL url = new URL(String.valueOf(d2.get(o.URL.c())));
                h hVar = h.a;
                String valueOf = String.valueOf(d2.get(o.DATASETID.c()));
                h.c(valueOf, url.getProtocol() + "://" + url.getHost(), String.valueOf(d2.get(o.ACCESSKEY.c())));
                c = true;
                return;
            }
            return;
        }
        i0.a aVar2 = i0.f1448e;
        p0 p0Var2 = p0.APP_EVENTS;
        String str2 = b;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
        aVar2.c(p0Var2, str2, " \n\nGraph Response Received: \n================\n%s\n\n ", m0Var);
        JSONObject c2 = m0Var.c();
        try {
            o0 o0Var = o0.a;
            Object obj = c2 == null ? null : c2.get("data");
            if (obj != null) {
                Map<String, Object> l2 = o0.l(new JSONObject((String) r.p(o0.k((JSONArray) obj))));
                String str3 = (String) l2.get(o.URL.c());
                String str4 = (String) l2.get(o.DATASETID.c());
                String str5 = (String) l2.get(o.ACCESSKEY.c());
                if (str3 == null || str4 == null || str5 == null) {
                    aVar2.b(p0Var2, str2, "CloudBridge Settings API response doesn't have valid data");
                    return;
                }
                try {
                    h hVar2 = h.a;
                    h.c(str4, str3, str5);
                    g(l2);
                    o oVar = o.ENABLED;
                    if (l2.get(oVar.c()) != null) {
                        Object obj2 = l2.get(oVar.c());
                        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                        z = ((Boolean) obj2).booleanValue();
                    }
                    c = z;
                } catch (MalformedURLException e2) {
                    i0.f1448e.c(p0.APP_EVENTS, b, "CloudBridge Settings API response doesn't have valid url\n %s ", b.b(e2));
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
        } catch (JSONException e3) {
            i0.f1448e.c(p0.APP_EVENTS, b, "CloudBridge Settings API response is not a valid json: \n%s ", b.b(e3));
        } catch (NullPointerException e4) {
            i0.f1448e.c(p0.APP_EVENTS, b, "CloudBridge Settings API response is not a valid json: \n%s ", b.b(e4));
        }
    }

    public final boolean e() {
        return c;
    }

    public final void g(Map<String, ? extends Object> map) {
        g0 g0Var = g0.a;
        SharedPreferences sharedPreferences = g0.c().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences != null) {
            if (map == null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.clear();
                edit.apply();
                return;
            }
            o oVar = o.DATASETID;
            Object obj = map.get(oVar.c());
            o oVar2 = o.URL;
            Object obj2 = map.get(oVar2.c());
            o oVar3 = o.ACCESSKEY;
            Object obj3 = map.get(oVar3.c());
            if (obj != null && obj2 != null && obj3 != null) {
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.putString(oVar.c(), obj.toString());
                edit2.putString(oVar2.c(), obj2.toString());
                edit2.putString(oVar3.c(), obj3.toString());
                edit2.apply();
                i0.f1448e.c(p0.APP_EVENTS, String.valueOf(b), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
            }
        }
    }
}
