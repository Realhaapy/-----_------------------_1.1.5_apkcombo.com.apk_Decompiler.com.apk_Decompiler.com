package com.facebook.y0.r0;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.internal.a0;
import com.facebook.internal.o0;
import com.facebook.j0;
import com.facebook.u;
import com.facebook.y0.q0.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import m.k;
import m.t.w;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h {
    public static final h a = new h();
    private static final Map<String, b> b = new ConcurrentHashMap();
    private static final List<String> c = j.g("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* renamed from: d  reason: collision with root package name */
    private static final List<String> f2128d = j.g("none", "address", "health");

    public enum a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* renamed from: com.facebook.y0.r0.h$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C0033a {
            public static final /* synthetic */ int[] a = null;

            static {
                int[] iArr = new int[a.values().length];
                iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                a = iArr;
            }
        }

        public final String c() {
            int i2 = C0033a.a[ordinal()];
            if (i2 == 1) {
                return "integrity_detect";
            }
            if (i2 == 2) {
                return "app_event_pred";
            }
            throw new k();
        }

        public final String d() {
            int i2 = C0033a.a[ordinal()];
            if (i2 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i2 == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new k();
        }
    }

    private static final class b {

        /* renamed from: i  reason: collision with root package name */
        public static final a f2132i = new a((g) null);
        private String a;
        private String b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private int f2133d;

        /* renamed from: e  reason: collision with root package name */
        private float[] f2134e;

        /* renamed from: f  reason: collision with root package name */
        private File f2135f;

        /* renamed from: g  reason: collision with root package name */
        private g f2136g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public Runnable f2137h;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }

            private final void b(String str, int i2) {
                File[] listFiles;
                j jVar = j.a;
                File a = j.a();
                if (a != null && (listFiles = a.listFiles()) != null) {
                    if (!(listFiles.length == 0)) {
                        String str2 = str + '_' + i2;
                        int length = listFiles.length;
                        int i3 = 0;
                        while (i3 < length) {
                            File file = listFiles[i3];
                            i3++;
                            String name = file.getName();
                            l.c(name, "name");
                            if (p.t(name, str, false, 2, (Object) null) && !p.t(name, str2, false, 2, (Object) null)) {
                                file.delete();
                            }
                        }
                    }
                }
            }

            private final void c(String str, String str2, k.a aVar) {
                j jVar = j.a;
                File file = new File(j.a(), str2);
                if (str == null || file.exists()) {
                    aVar.a(file);
                } else {
                    new com.facebook.y0.q0.k(str, file, aVar).execute(new String[0]);
                }
            }

            /* access modifiers changed from: private */
            public static final void e(List list, File file) {
                l.d(list, "$slaves");
                l.d(file, "file");
                g a = g.f2117m.a(file);
                if (a != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        b bVar = (b) it.next();
                        b.f2132i.c(bVar.e(), bVar.g() + '_' + bVar.h() + "_rule", new c(bVar, a));
                    }
                }
            }

            /* access modifiers changed from: private */
            public static final void f(b bVar, g gVar, File file) {
                l.d(bVar, "$slave");
                l.d(file, "file");
                bVar.i(gVar);
                bVar.k(file);
                Runnable a = bVar.f2137h;
                if (a != null) {
                    a.run();
                }
            }

            public final b a(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String string = jSONObject.getString("use_case");
                    String string2 = jSONObject.getString("asset_uri");
                    String optString = jSONObject.optString("rules_uri", (String) null);
                    int i2 = jSONObject.getInt("version_id");
                    float[] a = h.a(h.a, jSONObject.getJSONArray("thresholds"));
                    l.c(string, "useCase");
                    l.c(string2, "assetUri");
                    return new b(string, string2, optString, i2, a);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void d(b bVar, List<b> list) {
                l.d(bVar, "master");
                l.d(list, "slaves");
                b(bVar.g(), bVar.h());
                c(bVar.b(), bVar.g() + '_' + bVar.h(), new b(list));
            }
        }

        public b(String str, String str2, String str3, int i2, float[] fArr) {
            l.d(str, "useCase");
            l.d(str2, "assetUri");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.f2133d = i2;
            this.f2134e = fArr;
        }

        public final String b() {
            return this.b;
        }

        public final g c() {
            return this.f2136g;
        }

        public final File d() {
            return this.f2135f;
        }

        public final String e() {
            return this.c;
        }

        public final float[] f() {
            return this.f2134e;
        }

        public final String g() {
            return this.a;
        }

        public final int h() {
            return this.f2133d;
        }

        public final void i(g gVar) {
            this.f2136g = gVar;
        }

        public final b j(Runnable runnable) {
            this.f2137h = runnable;
            return this;
        }

        public final void k(File file) {
            this.f2135f = file;
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            a = iArr;
        }
    }

    private h() {
    }

    public static final /* synthetic */ float[] a(h hVar, JSONArray jSONArray) {
        Class<h> cls = h.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return hVar.o(jSONArray);
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    private final void b(JSONObject jSONObject) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        b a2 = b.f2132i.a(jSONObject.getJSONObject(keys.next()));
                        if (a2 != null) {
                            b.put(a2.g(), a2);
                        }
                    } catch (JSONException unused) {
                        return;
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public static final void c() {
        Class<h> cls = h.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                o0 o0Var = o0.a;
                o0.w0(e.f2115e);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[Catch:{ Exception -> 0x0081, all -> 0x007d }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d A[Catch:{ Exception -> 0x0081, all -> 0x007d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d() {
        /*
            java.lang.String r0 = "model_request_timestamp"
            java.lang.String r1 = "models"
            java.lang.Class<com.facebook.y0.r0.h> r2 = com.facebook.y0.r0.h.class
            boolean r3 = com.facebook.internal.s0.n.a.d(r2)
            if (r3 == 0) goto L_0x000d
            return
        L_0x000d:
            com.facebook.g0 r3 = com.facebook.g0.a     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            android.content.Context r3 = com.facebook.g0.c()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            java.lang.String r4 = "com.facebook.internal.MODEL_STORE"
            r5 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r5)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r4 = 0
            java.lang.String r4 = r3.getString(r1, r4)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r4 == 0) goto L_0x0031
            int r6 = r4.length()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r6 != 0) goto L_0x0028
            r5 = 1
        L_0x0028:
            if (r5 == 0) goto L_0x002b
            goto L_0x0031
        L_0x002b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            goto L_0x0036
        L_0x0031:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r5.<init>()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
        L_0x0036:
            r6 = 0
            long r6 = r3.getLong(r0, r6)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            com.facebook.internal.a0 r4 = com.facebook.internal.a0.a     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            com.facebook.internal.a0$b r4 = com.facebook.internal.a0.b.ModelRequest     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            boolean r4 = com.facebook.internal.a0.g(r4)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r4 == 0) goto L_0x0054
            int r4 = r5.length()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r4 == 0) goto L_0x0054
            com.facebook.y0.r0.h r4 = a     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            boolean r4 = r4.k(r6)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r4 != 0) goto L_0x0074
        L_0x0054:
            com.facebook.y0.r0.h r4 = a     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            org.json.JSONObject r5 = r4.h()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r5 != 0) goto L_0x005d
            return
        L_0x005d:
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            android.content.SharedPreferences$Editor r1 = r3.putString(r1, r4)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r3)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r0.apply()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
        L_0x0074:
            com.facebook.y0.r0.h r0 = a     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r0.b(r5)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r0.e()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r0 = move-exception
            com.facebook.internal.s0.n.a.b(r0, r2)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.r0.h.d():void");
    }

    private final void e() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                ArrayList arrayList = new ArrayList();
                String str = null;
                int i2 = 0;
                for (Map.Entry next : b.entrySet()) {
                    String str2 = (String) next.getKey();
                    b bVar = (b) next.getValue();
                    if (l.a(str2, a.MTML_APP_EVENT_PREDICTION.d())) {
                        String b2 = bVar.b();
                        int max = Math.max(i2, bVar.h());
                        a0 a0Var = a0.a;
                        if (a0.g(a0.b.SuggestedEvents) && j()) {
                            bVar.j(a.f2113e);
                            arrayList.add(bVar);
                        }
                        str = b2;
                        i2 = max;
                    }
                    if (l.a(str2, a.MTML_INTEGRITY_DETECT.d())) {
                        str = bVar.b();
                        i2 = Math.max(i2, bVar.h());
                        a0 a0Var2 = a0.a;
                        if (a0.g(a0.b.IntelligentIntegrity)) {
                            bVar.j(d.f2114e);
                            arrayList.add(bVar);
                        }
                    }
                }
                if (str != null && i2 > 0 && !arrayList.isEmpty()) {
                    b.f2132i.d(new b("MTML", str, (String) null, i2, (float[]) null), arrayList);
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void f() {
        Class<h> cls = h.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                com.facebook.y0.u0.h hVar = com.facebook.y0.u0.h.a;
                com.facebook.y0.u0.h.a();
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void g() {
        Class<h> cls = h.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                com.facebook.y0.p0.a aVar = com.facebook.y0.p0.a.a;
                com.facebook.y0.p0.a.a();
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    private final JSONObject h() {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            j0 x = j0.f1546n.x((u) null, "app/model_asset", (j0.b) null);
            x.G(bundle);
            JSONObject c2 = x.j().c();
            if (c2 == null) {
                return null;
            }
            return p(c2);
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }

    public static final File i(a aVar) {
        Class<h> cls = h.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            l.d(aVar, "task");
            b bVar = b.get(aVar.d());
            if (bVar == null) {
                return null;
            }
            return bVar.d();
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    private final boolean j() {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return false;
        }
        try {
            o0 o0Var = o0.a;
            Locale H = o0.H();
            if (H != null) {
                String language = H.getLanguage();
                l.c(language, "locale.language");
                return q.w(language, "en", false, 2, (Object) null);
            }
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return false;
        }
    }

    private final boolean k(long j2) {
        if (com.facebook.internal.s0.n.a.d(this) || j2 == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j2 < 259200000;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return false;
        }
    }

    private final float[] o(JSONArray jSONArray) {
        if (com.facebook.internal.s0.n.a.d(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int i2 = 0;
            int length = jSONArray.length();
            if (length > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    try {
                        String string = jSONArray.getString(i2);
                        l.c(string, "jsonArray.getString(i)");
                        fArr[i2] = Float.parseFloat(string);
                    } catch (JSONException unused) {
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return fArr;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:15|16|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return new org.json.JSONObject();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0064 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final org.json.JSONObject p(org.json.JSONObject r13) {
        /*
            r12 = this;
            java.lang.String r0 = "asset_uri"
            java.lang.String r1 = "thresholds"
            java.lang.String r2 = "version_id"
            java.lang.String r3 = "rules_uri"
            java.lang.String r4 = "use_case"
            boolean r5 = com.facebook.internal.s0.n.a.d(r12)
            r6 = 0
            if (r5 == 0) goto L_0x0012
            return r6
        L_0x0012:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x006a }
            r5.<init>()     // Catch:{ all -> 0x006a }
            java.lang.String r7 = "data"
            org.json.JSONArray r13 = r13.getJSONArray(r7)     // Catch:{ JSONException -> 0x0064 }
            r7 = 0
            int r8 = r13.length()     // Catch:{ JSONException -> 0x0064 }
            if (r8 <= 0) goto L_0x0069
        L_0x0024:
            int r9 = r7 + 1
            org.json.JSONObject r7 = r13.getJSONObject(r7)     // Catch:{ JSONException -> 0x0064 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0064 }
            r10.<init>()     // Catch:{ JSONException -> 0x0064 }
            java.lang.String r11 = r7.getString(r2)     // Catch:{ JSONException -> 0x0064 }
            r10.put(r2, r11)     // Catch:{ JSONException -> 0x0064 }
            java.lang.String r11 = r7.getString(r4)     // Catch:{ JSONException -> 0x0064 }
            r10.put(r4, r11)     // Catch:{ JSONException -> 0x0064 }
            org.json.JSONArray r11 = r7.getJSONArray(r1)     // Catch:{ JSONException -> 0x0064 }
            r10.put(r1, r11)     // Catch:{ JSONException -> 0x0064 }
            java.lang.String r11 = r7.getString(r0)     // Catch:{ JSONException -> 0x0064 }
            r10.put(r0, r11)     // Catch:{ JSONException -> 0x0064 }
            boolean r11 = r7.has(r3)     // Catch:{ JSONException -> 0x0064 }
            if (r11 == 0) goto L_0x0058
            java.lang.String r11 = r7.getString(r3)     // Catch:{ JSONException -> 0x0064 }
            r10.put(r3, r11)     // Catch:{ JSONException -> 0x0064 }
        L_0x0058:
            java.lang.String r7 = r7.getString(r4)     // Catch:{ JSONException -> 0x0064 }
            r5.put(r7, r10)     // Catch:{ JSONException -> 0x0064 }
            if (r9 < r8) goto L_0x0062
            goto L_0x0069
        L_0x0062:
            r7 = r9
            goto L_0x0024
        L_0x0064:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x006a }
            r5.<init>()     // Catch:{ all -> 0x006a }
        L_0x0069:
            return r5
        L_0x006a:
            r13 = move-exception
            com.facebook.internal.s0.n.a.b(r13, r12)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.r0.h.p(org.json.JSONObject):org.json.JSONObject");
    }

    public static final String[] q(a aVar, float[][] fArr, String[] strArr) {
        float[][] fArr2 = fArr;
        String[] strArr2 = strArr;
        Class<h> cls = h.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            l.d(aVar, "task");
            l.d(fArr2, "denses");
            l.d(strArr2, "texts");
            b bVar = b.get(aVar.d());
            g c2 = bVar == null ? null : bVar.c();
            if (c2 == null) {
                return null;
            }
            float[] f2 = bVar.f();
            int length = strArr2.length;
            boolean z = false;
            int length2 = fArr2[0].length;
            f fVar = new f(new int[]{length, length2});
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    System.arraycopy(fArr2[i2], 0, fVar.a(), i2 * length2, length2);
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            f b2 = c2.b(fVar, strArr2, aVar.c());
            if (!(b2 == null || f2 == null)) {
                if (!(b2.a().length == 0)) {
                    if (f2.length == 0) {
                        z = true;
                    }
                    if (!z) {
                        int i4 = c.a[aVar.ordinal()];
                        if (i4 == 1) {
                            return a.s(b2, f2);
                        }
                        if (i4 == 2) {
                            return a.r(b2, f2);
                        }
                        throw new m.k();
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    private final String[] r(f fVar, float[] fArr) {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            int b2 = fVar.b(0);
            int b3 = fVar.b(1);
            float[] a2 = fVar.a();
            if (b3 != fArr.length) {
                return null;
            }
            m.a0.c g2 = f.g(0, b2);
            ArrayList arrayList = new ArrayList(k.j(g2, 10));
            Iterator it = g2.iterator();
            while (it.hasNext()) {
                int b4 = ((w) it).b();
                String str = "none";
                int length = fArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    if (a2[(b4 * b3) + i3] >= fArr[i2]) {
                        str = f2128d.get(i3);
                    }
                    i2++;
                    i3 = i4;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }

    private final String[] s(f fVar, float[] fArr) {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            int b2 = fVar.b(0);
            int b3 = fVar.b(1);
            float[] a2 = fVar.a();
            if (b3 != fArr.length) {
                return null;
            }
            m.a0.c g2 = f.g(0, b2);
            ArrayList arrayList = new ArrayList(k.j(g2, 10));
            Iterator it = g2.iterator();
            while (it.hasNext()) {
                int b4 = ((w) it).b();
                String str = "other";
                int length = fArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    if (a2[(b4 * b3) + i3] >= fArr[i2]) {
                        str = c.get(i3);
                    }
                    i2++;
                    i3 = i4;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }
}
