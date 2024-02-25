package com.facebook.y0.l0;

import com.facebook.internal.i0;
import com.facebook.internal.o0;
import com.facebook.j0;
import com.facebook.p0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m.a0.c;
import m.r;
import m.s;
import m.y.c.p;
import m.y.d.l;
import m.y.d.m;
import m.y.d.t;
import org.json.JSONArray;
import org.json.JSONObject;

public final class h {
    public static final h a = new h();
    /* access modifiers changed from: private */
    public static final HashSet<Integer> b = e0.c(200, 202);
    private static final HashSet<Integer> c = e0.c(503, 504, 429);

    /* renamed from: d  reason: collision with root package name */
    public static a f1897d;

    /* renamed from: e  reason: collision with root package name */
    public static List<Map<String, Object>> f1898e;

    /* renamed from: f  reason: collision with root package name */
    private static int f1899f;

    public static final class a {
        private final String a;
        private final String b;
        private final String c;

        public a(String str, String str2, String str3) {
            l.d(str, "datasetID");
            l.d(str2, "cloudBridgeURL");
            l.d(str3, "accessKey");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.a, aVar.a) && l.a(this.b, aVar.b) && l.a(this.c, aVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.a + ", cloudBridgeURL=" + this.b + ", accessKey=" + this.c + ')';
        }
    }

    static final class b extends m implements p<String, Integer, s> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<Map<String, Object>> f1900e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(List<? extends Map<String, ? extends Object>> list) {
            super(2);
            this.f1900e = list;
        }

        /* access modifiers changed from: private */
        public static final void b(Integer num, List list) {
            l.d(list, "$processedEvents");
            if (!r.n(h.b, num)) {
                h.a.f(num, list, 5);
            }
        }

        public final void a(String str, Integer num) {
            o0 o0Var = o0.a;
            o0.w0(new c(num, this.f1900e));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (Integer) obj2);
            return s.a;
        }
    }

    private h() {
    }

    public static final void c(String str, String str2, String str3) {
        l.d(str, "datasetID");
        l.d(str2, "url");
        l.d(str3, "accessKey");
        i0.a aVar = i0.f1448e;
        p0 p0Var = p0.APP_EVENTS;
        h hVar = a;
        aVar.c(p0Var, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", str, str2, str3);
        hVar.i(new a(str, str2, str3));
        hVar.j(new ArrayList());
    }

    private final List<Map<String, Object>> k(j0 j0Var) {
        JSONObject p2 = j0Var.p();
        if (p2 == null) {
            return null;
        }
        o0 o0Var = o0.a;
        Map<String, Object> n2 = a0.n(o0.l(p2));
        Object v = j0Var.v();
        Objects.requireNonNull(v, "null cannot be cast to non-null type kotlin.Any");
        n2.put("custom_events", v);
        StringBuilder sb = new StringBuilder();
        for (String next : n2.keySet()) {
            sb.append(next);
            sb.append(" : ");
            sb.append(n2.get(next));
            sb.append(System.getProperty("line.separator"));
        }
        i0.f1448e.c(p0.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb);
        return g.a.e(n2);
    }

    public static final void l(j0 j0Var) {
        l.d(j0Var, "request");
        o0 o0Var = o0.a;
        o0.w0(new b(j0Var));
    }

    /* access modifiers changed from: private */
    public static final void m(j0 j0Var) {
        l.d(j0Var, "$request");
        String q2 = j0Var.q();
        List U = q2 == null ? null : q.U(q2, new String[]{"/"}, false, 0, 6, (Object) null);
        if (U == null || U.size() != 2) {
            i0.f1448e.c(p0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", j0Var);
            return;
        }
        try {
            h hVar = a;
            String str = hVar.d().b() + "/capi/" + hVar.d().c() + "/events";
            List<Map<String, Object>> k2 = hVar.k(j0Var);
            if (k2 != null) {
                hVar.b(k2);
                int min = Math.min(hVar.e().size(), 10);
                List<T> A = r.A(hVar.e(), new c(0, min - 1));
                hVar.e().subList(0, min).clear();
                JSONArray jSONArray = new JSONArray(A);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("data", jSONArray);
                linkedHashMap.put("accessKey", hVar.d().a());
                JSONObject jSONObject = new JSONObject(linkedHashMap);
                i0.a aVar = i0.f1448e;
                p0 p0Var = p0.APP_EVENTS;
                String jSONObject2 = jSONObject.toString(2);
                l.c(jSONObject2, "jsonBodyStr.toString(2)");
                aVar.c(p0Var, "CAPITransformerWebRequests", "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, j0Var, jSONObject2);
                hVar.h(str, "POST", jSONObject.toString(), z.b(m.p.a("Content-Type", "application/json")), 60000, new b(A));
            }
        } catch (r e2) {
            i0.f1448e.c(p0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e2);
        }
    }

    public final void b(List<? extends Map<String, ? extends Object>> list) {
        if (list != null) {
            e().addAll(list);
        }
        int max = Math.max(0, e().size() - 1000);
        if (max > 0) {
            j(t.a(r.o(e(), max)));
        }
    }

    public final a d() {
        a aVar = f1897d;
        if (aVar != null) {
            return aVar;
        }
        l.n("credentials");
        throw null;
    }

    public final List<Map<String, Object>> e() {
        List<Map<String, Object>> list = f1898e;
        if (list != null) {
            return list;
        }
        l.n("transformedEvents");
        throw null;
    }

    public final void f(Integer num, List<? extends Map<String, ? extends Object>> list, int i2) {
        l.d(list, "processedEvents");
        if (!r.n(c, num)) {
            return;
        }
        if (f1899f >= i2) {
            e().clear();
            f1899f = 0;
            return;
        }
        e().addAll(0, list);
        f1899f++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b3, code lost:
        r11 = m.s.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        m.x.b.a(r10, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bb, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        m.x.b.a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bf, code lost:
        throw r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009b A[Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e3 A[Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11, int r12, m.y.c.p<? super java.lang.String, ? super java.lang.Integer, m.s> r13) {
        /*
            r7 = this;
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = "CAPITransformerWebRequests"
            java.lang.String r2 = "urlStr"
            m.y.d.l.d(r8, r2)
            java.lang.String r2 = "requestMethod"
            m.y.d.l.d(r9, r2)
            r2 = 0
            r3 = 0
            r4 = 1
            java.net.URL r5 = new java.net.URL     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            r5.<init>(r8)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.net.URLConnection r8 = r5.openConnection()     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            if (r8 == 0) goto L_0x00ef
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            r8.setRequestMethod(r9)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            if (r11 != 0) goto L_0x0024
            goto L_0x0045
        L_0x0024:
            java.util.Set r9 = r11.keySet()     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            if (r9 != 0) goto L_0x002b
            goto L_0x0045
        L_0x002b:
            java.util.Iterator r9 = r9.iterator()     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
        L_0x002f:
            boolean r5 = r9.hasNext()     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            if (r5 == 0) goto L_0x0045
            java.lang.Object r5 = r9.next()     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.lang.Object r6 = r11.get(r5)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            r8.setRequestProperty(r5, r6)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            goto L_0x002f
        L_0x0045:
            java.lang.String r9 = r8.getRequestMethod()     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.lang.String r11 = "POST"
            boolean r9 = r9.equals(r11)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            if (r9 != 0) goto L_0x0060
            java.lang.String r9 = r8.getRequestMethod()     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.lang.String r11 = "PUT"
            boolean r9 = r9.equals(r11)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            if (r9 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r9 = 0
            goto L_0x0061
        L_0x0060:
            r9 = 1
        L_0x0061:
            r8.setDoOutput(r9)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            r8.setConnectTimeout(r12)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.io.OutputStream r11 = r8.getOutputStream()     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            r9.<init>(r11)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.io.BufferedWriter r11 = new java.io.BufferedWriter     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.io.OutputStreamWriter r12 = new java.io.OutputStreamWriter     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            r12.<init>(r9, r0)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            r11.<init>(r12)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            r11.write(r10)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            r11.flush()     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            r11.close()     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            r9.close()     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            r9.<init>()     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.util.HashSet<java.lang.Integer> r10 = b     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            int r11 = r8.getResponseCode()     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            boolean r10 = r10.contains(r11)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            if (r10 == 0) goto L_0x00c0
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.io.InputStreamReader r11 = new java.io.InputStreamReader     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.io.InputStream r12 = r8.getInputStream()     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            r11.<init>(r12, r0)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            r10.<init>(r11)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
        L_0x00a9:
            java.lang.String r11 = r10.readLine()     // Catch:{ all -> 0x00b9 }
            if (r11 == 0) goto L_0x00b3
            r9.append(r11)     // Catch:{ all -> 0x00b9 }
            goto L_0x00a9
        L_0x00b3:
            m.s r11 = m.s.a     // Catch:{ all -> 0x00b9 }
            m.x.b.a(r10, r2)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            goto L_0x00c0
        L_0x00b9:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r9 = move-exception
            m.x.b.a(r10, r8)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            throw r9     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
        L_0x00c0:
            java.lang.String r9 = r9.toString()     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.lang.String r10 = "connResponseSB.toString()"
            m.y.d.l.c(r9, r10)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            com.facebook.internal.i0$a r10 = com.facebook.internal.i0.f1448e     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            com.facebook.p0 r11 = com.facebook.p0.APP_EVENTS     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.lang.String r12 = "\nResponse Received: \n%s\n%s"
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            r0[r3] = r9     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            int r5 = r8.getResponseCode()     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            r0[r4] = r5     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            r10.c(r11, r1, r12, r0)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            if (r13 == 0) goto L_0x0127
            int r8 = r8.getResponseCode()     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            r13.invoke(r9, r8)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            goto L_0x0127
        L_0x00ef:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            java.lang.String r9 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            r8.<init>(r9)     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
            throw r8     // Catch:{ UnknownHostException -> 0x010a, IOException -> 0x00f7 }
        L_0x00f7:
            r8 = move-exception
            com.facebook.internal.i0$a r9 = com.facebook.internal.i0.f1448e
            com.facebook.p0 r10 = com.facebook.p0.DEVELOPER_ERRORS
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.String r8 = r8.toString()
            r11[r3] = r8
            java.lang.String r8 = "Send to server failed: \n%s"
            r9.c(r10, r1, r8, r11)
            goto L_0x0127
        L_0x010a:
            r8 = move-exception
            com.facebook.internal.i0$a r9 = com.facebook.internal.i0.f1448e
            com.facebook.p0 r10 = com.facebook.p0.APP_EVENTS
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.String r8 = r8.toString()
            r11[r3] = r8
            java.lang.String r8 = "Connection failed, retrying: \n%s"
            r9.c(r10, r1, r8, r11)
            if (r13 == 0) goto L_0x0127
            r8 = 503(0x1f7, float:7.05E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13.invoke(r2, r8)
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.l0.h.h(java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, m.y.c.p):void");
    }

    public final void i(a aVar) {
        l.d(aVar, "<set-?>");
        f1897d = aVar;
    }

    public final void j(List<Map<String, Object>> list) {
        l.d(list, "<set-?>");
        f1898e = list;
    }
}
