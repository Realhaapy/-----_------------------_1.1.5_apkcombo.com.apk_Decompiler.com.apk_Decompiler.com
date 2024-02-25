package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.internal.g0;
import com.facebook.internal.i0;
import com.facebook.internal.m0;
import com.facebook.internal.o0;
import com.facebook.internal.p0;
import com.facebook.l0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m.y.d.l;
import m.y.d.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class j0 {

    /* renamed from: n  reason: collision with root package name */
    public static final c f1546n = new c((m.y.d.g) null);

    /* renamed from: o  reason: collision with root package name */
    public static final String f1547o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final String f1548p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static String f1549q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f1550r = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static volatile String f1551s;
    private u a;
    private String b;
    private JSONObject c;

    /* renamed from: d  reason: collision with root package name */
    private String f1552d;

    /* renamed from: e  reason: collision with root package name */
    private String f1553e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1554f;

    /* renamed from: g  reason: collision with root package name */
    private Bundle f1555g;

    /* renamed from: h  reason: collision with root package name */
    private Object f1556h;

    /* renamed from: i  reason: collision with root package name */
    private String f1557i;

    /* renamed from: j  reason: collision with root package name */
    private b f1558j;

    /* renamed from: k  reason: collision with root package name */
    private n0 f1559k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1560l;

    /* renamed from: m  reason: collision with root package name */
    private String f1561m;

    private static final class a {
        private final j0 a;
        private final Object b;

        public a(j0 j0Var, Object obj) {
            l.d(j0Var, "request");
            this.a = j0Var;
            this.b = obj;
        }

        public final j0 a() {
            return this.a;
        }

        public final Object b() {
            return this.b;
        }
    }

    public interface b {
        void a(m0 m0Var);
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(m.y.d.g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final String C(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (obj instanceof Date) {
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                l.c(format, "iso8601DateFormat.format(value)");
                return format;
            }
            throw new IllegalArgumentException("Unsupported parameter type.");
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void D(org.json.JSONObject r10, java.lang.String r11, com.facebook.j0.e r12) {
            /*
                r9 = this;
                boolean r0 = r9.s(r11)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0023
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                java.lang.String r4 = ":"
                r3 = r11
                int r0 = m.d0.q.F(r3, r4, r5, r6, r7, r8)
                java.lang.String r4 = "?"
                int r11 = m.d0.q.F(r3, r4, r5, r6, r7, r8)
                r3 = 3
                if (r0 <= r3) goto L_0x0023
                r3 = -1
                if (r11 == r3) goto L_0x0021
                if (r0 >= r11) goto L_0x0023
            L_0x0021:
                r11 = 1
                goto L_0x0024
            L_0x0023:
                r11 = 0
            L_0x0024:
                java.util.Iterator r0 = r10.keys()
            L_0x0028:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0053
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r10.opt(r3)
                if (r11 == 0) goto L_0x0044
                java.lang.String r5 = "image"
                boolean r5 = m.d0.p.l(r3, r5, r1)
                if (r5 == 0) goto L_0x0044
                r5 = 1
                goto L_0x0045
            L_0x0044:
                r5 = 0
            L_0x0045:
                java.lang.String r6 = "key"
                m.y.d.l.c(r3, r6)
                java.lang.String r6 = "value"
                m.y.d.l.c(r4, r6)
                r9.E(r3, r4, r12, r5)
                goto L_0x0028
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.j0.c.D(org.json.JSONObject, java.lang.String, com.facebook.j0$e):void");
        }

        private final void E(String str, Object obj, e eVar, boolean z) {
            String str2;
            String jSONObject;
            String str3;
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (z) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        s sVar = s.a;
                        String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        l.c(format, "java.lang.String.format(format, *args)");
                        Object opt = jSONObject2.opt(next);
                        l.c(opt, "jsonObject.opt(propertyName)");
                        E(format, opt, eVar, z);
                    }
                    return;
                }
                if (jSONObject2.has("id")) {
                    jSONObject = jSONObject2.optString("id");
                    str3 = "jsonObject.optString(\"id\")";
                } else if (jSONObject2.has("url")) {
                    jSONObject = jSONObject2.optString("url");
                    str3 = "jsonObject.optString(\"url\")";
                } else if (jSONObject2.has("fbsdk:create_object")) {
                    jSONObject = jSONObject2.toString();
                    str3 = "jsonObject.toString()";
                } else {
                    return;
                }
                l.c(jSONObject, str3);
                E(str, jSONObject, eVar, z);
            } else if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                if (length > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        s sVar2 = s.a;
                        String format2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2)}, 2));
                        l.c(format2, "java.lang.String.format(locale, format, *args)");
                        Object opt2 = jSONArray.opt(i2);
                        l.c(opt2, "jsonArray.opt(i)");
                        E(format2, opt2, eVar, z);
                        if (i3 < length) {
                            i2 = i3;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                    str2 = obj.toString();
                } else if (Date.class.isAssignableFrom(cls)) {
                    str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    l.c(str2, "iso8601DateFormat.format(date)");
                } else {
                    o0 o0Var = o0.a;
                    String str4 = j0.f1547o;
                    o0.e0(str4, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
                    return;
                }
                eVar.a(str, str2);
            }
        }

        private final void F(l0 l0Var, i0 i0Var, int i2, URL url, OutputStream outputStream, boolean z) {
            h hVar = new h(outputStream, i0Var, z);
            boolean z2 = false;
            if (i2 == 1) {
                j0 p2 = l0Var.get(0);
                HashMap hashMap = new HashMap();
                for (String str : p2.t().keySet()) {
                    Object obj = p2.t().get(str);
                    if (t(obj)) {
                        l.c(str, "key");
                        hashMap.put(str, new a(p2, obj));
                    }
                }
                if (i0Var != null) {
                    i0Var.b("  Parameters:\n");
                }
                J(p2.t(), hVar, p2);
                if (i0Var != null) {
                    i0Var.b("  Attachments:\n");
                }
                I(hashMap, hVar);
                JSONObject p3 = p2.p();
                if (p3 != null) {
                    String path = url.getPath();
                    l.c(path, "url.path");
                    D(p3, path, hVar);
                    return;
                }
                return;
            }
            String n2 = n(l0Var);
            if (n2.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                hVar.a("batch_app_id", n2);
                HashMap hashMap2 = new HashMap();
                K(hVar, l0Var, hashMap2);
                if (i0Var != null) {
                    i0Var.b("  Attachments:\n");
                }
                I(hashMap2, hVar);
                return;
            }
            throw new c0("App ID was not specified at the request or Settings.");
        }

        /* access modifiers changed from: private */
        public static final void H(ArrayList arrayList, l0 l0Var) {
            l.d(arrayList, "$callbacks");
            l.d(l0Var, "$requests");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = pair.second;
                l.c(obj, "pair.second");
                ((b) pair.first).a((m0) obj);
            }
            for (l0.a a : l0Var.s()) {
                a.a(l0Var);
            }
        }

        private final void I(Map<String, a> map, h hVar) {
            for (Map.Entry next : map.entrySet()) {
                if (j0.f1546n.t(((a) next.getValue()).b())) {
                    hVar.j((String) next.getKey(), ((a) next.getValue()).b(), ((a) next.getValue()).a());
                }
            }
        }

        private final void J(Bundle bundle, h hVar, j0 j0Var) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (u(obj)) {
                    l.c(str, "key");
                    hVar.j(str, obj, j0Var);
                }
            }
        }

        private final void K(h hVar, Collection<j0> collection, Map<String, a> map) {
            JSONArray jSONArray = new JSONArray();
            for (j0 f2 : collection) {
                f2.B(jSONArray, map);
            }
            hVar.l("batch", jSONArray, collection);
        }

        private final void M(HttpURLConnection httpURLConnection, boolean z) {
            if (z) {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                return;
            }
            httpURLConnection.setRequestProperty("Content-Type", o());
        }

        private final HttpURLConnection e(URL url) {
            URLConnection openConnection = url.openConnection();
            Objects.requireNonNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestProperty("User-Agent", p());
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        private final String n(l0 l0Var) {
            String q2 = l0Var.q();
            boolean z = true;
            if (q2 != null && (!l0Var.isEmpty())) {
                return q2;
            }
            Iterator it = l0Var.iterator();
            while (it.hasNext()) {
                u l2 = ((j0) it.next()).l();
                if (l2 != null) {
                    return l2.c();
                }
            }
            String b = j0.f1549q;
            if (b != null) {
                if (b.length() <= 0) {
                    z = false;
                }
                if (z) {
                    return b;
                }
            }
            g0 g0Var = g0.a;
            return g0.d();
        }

        private final String o() {
            s sVar = s.a;
            String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{j0.f1548p}, 1));
            l.c(format, "java.lang.String.format(format, *args)");
            return format;
        }

        private final String p() {
            if (j0.f1551s == null) {
                s sVar = s.a;
                String format = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "14.1.1"}, 2));
                l.c(format, "java.lang.String.format(format, *args)");
                j0.f1551s = format;
                g0 g0Var = g0.a;
                String a = g0.a();
                o0 o0Var = o0.a;
                if (!o0.V(a)) {
                    String format2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{j0.f1551s, a}, 2));
                    l.c(format2, "java.lang.String.format(locale, format, *args)");
                    j0.f1551s = format2;
                }
            }
            return j0.f1551s;
        }

        private final boolean q(l0 l0Var) {
            for (l0.a aVar : l0Var.s()) {
                if (aVar instanceof l0.b) {
                    return true;
                }
            }
            Iterator it = l0Var.iterator();
            while (it.hasNext()) {
                if (((j0) it.next()).n() instanceof f) {
                    return true;
                }
            }
            return false;
        }

        private final boolean r(l0 l0Var) {
            Iterator it = l0Var.iterator();
            while (it.hasNext()) {
                j0 j0Var = (j0) it.next();
                Iterator it2 = j0Var.t().keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (t(j0Var.t().get((String) it2.next()))) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        private final boolean s(String str) {
            Matcher matcher = j0.f1550r.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                l.c(str, "matcher.group(1)");
            }
            return p.t(str, "me/", false, 2, (Object) null) || p.t(str, "/me/", false, 2, (Object) null);
        }

        /* access modifiers changed from: private */
        public final boolean t(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof g);
        }

        /* access modifiers changed from: private */
        public final boolean u(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        /* access modifiers changed from: private */
        public static final void z(d dVar, m0 m0Var) {
            l.d(m0Var, "response");
            if (dVar != null) {
                dVar.a(m0Var.c(), m0Var);
            }
        }

        public final j0 A(u uVar, String str, JSONObject jSONObject, b bVar) {
            j0 j0Var = new j0(uVar, str, (Bundle) null, n0.POST, bVar, (String) null, 32, (m.y.d.g) null);
            j0Var.E(jSONObject);
            return j0Var;
        }

        public final j0 B(u uVar, String str, Bundle bundle, b bVar) {
            return new j0(uVar, str, bundle, n0.POST, bVar, (String) null, 32, (m.y.d.g) null);
        }

        public final void G(l0 l0Var, List<m0> list) {
            l.d(l0Var, "requests");
            l.d(list, "responses");
            int size = l0Var.size();
            ArrayList arrayList = new ArrayList();
            if (size > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    j0 p2 = l0Var.get(i2);
                    if (p2.n() != null) {
                        arrayList.add(new Pair(p2.n(), list.get(i2)));
                    }
                    if (i3 >= size) {
                        break;
                    }
                    i2 = i3;
                }
            }
            if (arrayList.size() > 0) {
                o oVar = new o(arrayList, l0Var);
                Handler r2 = l0Var.r();
                if ((r2 == null ? null : Boolean.valueOf(r2.post(oVar))) == null) {
                    oVar.run();
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00f2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void L(com.facebook.l0 r14, java.net.HttpURLConnection r15) {
            /*
                r13 = this;
                java.lang.String r0 = "requests"
                m.y.d.l.d(r14, r0)
                java.lang.String r0 = "connection"
                m.y.d.l.d(r15, r0)
                com.facebook.internal.i0 r0 = new com.facebook.internal.i0
                com.facebook.p0 r1 = com.facebook.p0.REQUESTS
                java.lang.String r2 = "Request"
                r0.<init>(r1, r2)
                int r10 = r14.size()
                boolean r11 = r13.r(r14)
                r1 = 0
                r2 = 0
                r3 = 1
                if (r10 != r3) goto L_0x0029
                com.facebook.j0 r4 = r14.get(r1)
                com.facebook.n0 r4 = r4.s()
                goto L_0x002a
            L_0x0029:
                r4 = r2
            L_0x002a:
                if (r4 != 0) goto L_0x002e
                com.facebook.n0 r4 = com.facebook.n0.POST
            L_0x002e:
                java.lang.String r5 = r4.name()
                r15.setRequestMethod(r5)
                r13.M(r15, r11)
                java.net.URL r12 = r15.getURL()
                java.lang.String r5 = "Request:\n"
                r0.b(r5)
                java.lang.String r5 = r14.t()
                java.lang.String r6 = "Id"
                r0.d(r6, r5)
                java.lang.String r5 = "url"
                m.y.d.l.c(r12, r5)
                java.lang.String r5 = "URL"
                r0.d(r5, r12)
                java.lang.String r5 = r15.getRequestMethod()
                java.lang.String r6 = "connection.requestMethod"
                m.y.d.l.c(r5, r6)
                java.lang.String r6 = "Method"
                r0.d(r6, r5)
                java.lang.String r5 = "User-Agent"
                java.lang.String r6 = r15.getRequestProperty(r5)
                java.lang.String r7 = "connection.getRequestProperty(\"User-Agent\")"
                m.y.d.l.c(r6, r7)
                r0.d(r5, r6)
                java.lang.String r5 = "Content-Type"
                java.lang.String r6 = r15.getRequestProperty(r5)
                java.lang.String r7 = "connection.getRequestProperty(\"Content-Type\")"
                m.y.d.l.c(r6, r7)
                r0.d(r5, r6)
                int r5 = r14.w()
                r15.setConnectTimeout(r5)
                int r5 = r14.w()
                r15.setReadTimeout(r5)
                com.facebook.n0 r5 = com.facebook.n0.POST
                if (r4 != r5) goto L_0x0091
                r1 = 1
            L_0x0091:
                if (r1 != 0) goto L_0x0097
                r0.e()
                return
            L_0x0097:
                r15.setDoOutput(r3)
                java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00ee }
                java.io.OutputStream r15 = r15.getOutputStream()     // Catch:{ all -> 0x00ee }
                r1.<init>(r15)     // Catch:{ all -> 0x00ee }
                if (r11 == 0) goto L_0x00ae
                java.util.zip.GZIPOutputStream r15 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x00ab }
                r15.<init>(r1)     // Catch:{ all -> 0x00ab }
                goto L_0x00af
            L_0x00ab:
                r14 = move-exception
                r2 = r1
                goto L_0x00ef
            L_0x00ae:
                r15 = r1
            L_0x00af:
                boolean r1 = r13.q(r14)     // Catch:{ all -> 0x00eb }
                if (r1 == 0) goto L_0x00da
                com.facebook.t0 r1 = new com.facebook.t0     // Catch:{ all -> 0x00eb }
                android.os.Handler r2 = r14.r()     // Catch:{ all -> 0x00eb }
                r1.<init>(r2)     // Catch:{ all -> 0x00eb }
                r5 = 0
                r3 = r13
                r4 = r14
                r6 = r10
                r7 = r12
                r8 = r1
                r9 = r11
                r3.F(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00eb }
                int r2 = r1.g()     // Catch:{ all -> 0x00eb }
                java.util.Map r5 = r1.o()     // Catch:{ all -> 0x00eb }
                com.facebook.u0 r1 = new com.facebook.u0     // Catch:{ all -> 0x00eb }
                long r6 = (long) r2     // Catch:{ all -> 0x00eb }
                r2 = r1
                r3 = r15
                r4 = r14
                r2.<init>(r3, r4, r5, r6)     // Catch:{ all -> 0x00eb }
                r15 = r1
            L_0x00da:
                r1 = r13
                r2 = r14
                r3 = r0
                r4 = r10
                r5 = r12
                r6 = r15
                r7 = r11
                r1.F(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00eb }
                r15.close()
                r0.e()
                return
            L_0x00eb:
                r14 = move-exception
                r2 = r15
                goto L_0x00ef
            L_0x00ee:
                r14 = move-exception
            L_0x00ef:
                if (r2 != 0) goto L_0x00f2
                goto L_0x00f5
            L_0x00f2:
                r2.close()
            L_0x00f5:
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.j0.c.L(com.facebook.l0, java.net.HttpURLConnection):void");
        }

        public final HttpURLConnection N(l0 l0Var) {
            URL url;
            l.d(l0Var, "requests");
            O(l0Var);
            try {
                if (l0Var.size() == 1) {
                    url = new URL(l0Var.get(0).w());
                } else {
                    m0 m0Var = m0.a;
                    url = new URL(m0.g());
                }
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = e(url);
                    L(l0Var, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e2) {
                    o0 o0Var = o0.a;
                    o0.o(httpURLConnection);
                    throw new c0("could not construct request body", e2);
                } catch (JSONException e3) {
                    o0 o0Var2 = o0.a;
                    o0.o(httpURLConnection);
                    throw new c0("could not construct request body", e3);
                }
            } catch (MalformedURLException e4) {
                throw new c0("could not construct URL for request", e4);
            }
        }

        public final void O(l0 l0Var) {
            l.d(l0Var, "requests");
            Iterator it = l0Var.iterator();
            while (it.hasNext()) {
                j0 j0Var = (j0) it.next();
                if (n0.GET == j0Var.s()) {
                    o0 o0Var = o0.a;
                    if (o0.V(j0Var.t().getString("fields"))) {
                        i0.a aVar = i0.f1448e;
                        p0 p0Var = p0.DEVELOPER_ERRORS;
                        StringBuilder sb = new StringBuilder();
                        sb.append("GET requests for /");
                        String q2 = j0Var.q();
                        if (q2 == null) {
                            q2 = "";
                        }
                        sb.append(q2);
                        sb.append(" should contain an explicit \"fields\" parameter.");
                        aVar.a(p0Var, 5, "Request", sb.toString());
                    }
                }
            }
        }

        public final m0 f(j0 j0Var) {
            l.d(j0Var, "request");
            List<m0> i2 = i(j0Var);
            if (i2.size() == 1) {
                return i2.get(0);
            }
            throw new c0("invalid state: expected a single response");
        }

        public final List<m0> g(l0 l0Var) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            List<m0> list;
            l.d(l0Var, "requests");
            p0 p0Var = p0.a;
            p0.i(l0Var, "requests");
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = N(l0Var);
                exc = null;
            } catch (Exception e2) {
                exc = e2;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                o0 o0Var = o0.a;
                o0.o(httpURLConnection2);
                throw th;
            }
            if (httpURLConnection != null) {
                try {
                    list = m(httpURLConnection, l0Var);
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection2 = httpURLConnection;
                    o0 o0Var2 = o0.a;
                    o0.o(httpURLConnection2);
                    throw th;
                }
            } else {
                List<m0> a = m0.f1707f.a(l0Var.u(), (HttpURLConnection) null, new c0((Throwable) exc));
                G(l0Var, a);
                list = a;
            }
            o0 o0Var3 = o0.a;
            o0.o(httpURLConnection);
            return list;
        }

        public final List<m0> h(Collection<j0> collection) {
            l.d(collection, "requests");
            return g(new l0(collection));
        }

        public final List<m0> i(j0... j0VarArr) {
            l.d(j0VarArr, "requests");
            return h(f.s(j0VarArr));
        }

        public final k0 j(l0 l0Var) {
            l.d(l0Var, "requests");
            p0 p0Var = p0.a;
            p0.i(l0Var, "requests");
            k0 k0Var = new k0(l0Var);
            g0 g0Var = g0.a;
            k0Var.executeOnExecutor(g0.k(), new Void[0]);
            return k0Var;
        }

        public final k0 k(Collection<j0> collection) {
            l.d(collection, "requests");
            return j(new l0(collection));
        }

        public final k0 l(j0... j0VarArr) {
            l.d(j0VarArr, "requests");
            return k(f.s(j0VarArr));
        }

        public final List<m0> m(HttpURLConnection httpURLConnection, l0 l0Var) {
            l.d(httpURLConnection, "connection");
            l.d(l0Var, "requests");
            List<m0> f2 = m0.f1707f.f(httpURLConnection, l0Var);
            o0 o0Var = o0.a;
            o0.o(httpURLConnection);
            int size = l0Var.size();
            if (size == f2.size()) {
                G(l0Var, f2);
                w.f1771f.e().d();
                return f2;
            }
            s sVar = s.a;
            String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(f2.size()), Integer.valueOf(size)}, 2));
            l.c(format, "java.lang.String.format(locale, format, *args)");
            throw new c0(format);
        }

        public final j0 x(u uVar, String str, b bVar) {
            return new j0(uVar, str, (Bundle) null, (n0) null, bVar, (String) null, 32, (m.y.d.g) null);
        }

        public final j0 y(u uVar, d dVar) {
            return new j0(uVar, "me", (Bundle) null, (n0) null, new p(dVar), (String) null, 32, (m.y.d.g) null);
        }
    }

    public interface d {
        void a(JSONObject jSONObject, m0 m0Var);
    }

    private interface e {
        void a(String str, String str2);
    }

    public interface f extends b {
        void b(long j2, long j3);
    }

    public static final class g<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<g<?>> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        private final String f1562e;

        /* renamed from: f  reason: collision with root package name */
        private final RESOURCE f1563f;

        public static final class a implements Parcelable.Creator<g<?>> {
            a() {
            }

            /* renamed from: a */
            public g<?> createFromParcel(Parcel parcel) {
                l.d(parcel, "source");
                return new g<>(parcel, (m.y.d.g) null);
            }

            /* renamed from: b */
            public g<?>[] newArray(int i2) {
                return new g[i2];
            }
        }

        private g(Parcel parcel) {
            this.f1562e = parcel.readString();
            g0 g0Var = g0.a;
            this.f1563f = parcel.readParcelable(g0.c().getClassLoader());
        }

        public /* synthetic */ g(Parcel parcel, m.y.d.g gVar) {
            this(parcel);
        }

        public g(RESOURCE resource, String str) {
            this.f1562e = str;
            this.f1563f = resource;
        }

        public final String a() {
            return this.f1562e;
        }

        public final RESOURCE b() {
            return this.f1563f;
        }

        public int describeContents() {
            return 1;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "out");
            parcel.writeString(this.f1562e);
            parcel.writeParcelable(this.f1563f, i2);
        }
    }

    private static final class h implements e {
        private final OutputStream a;
        private final i0 b;
        private boolean c = true;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f1564d;

        public h(OutputStream outputStream, i0 i0Var, boolean z) {
            l.d(outputStream, "outputStream");
            this.a = outputStream;
            this.b = i0Var;
            this.f1564d = z;
        }

        private final RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public void a(String str, String str2) {
            l.d(str, "key");
            l.d(str2, "value");
            f(str, (String) null, (String) null);
            i("%s", str2);
            k();
            i0 i0Var = this.b;
            if (i0Var != null) {
                i0Var.d(l.j("    ", str), str2);
            }
        }

        public final void c(String str, Object... objArr) {
            l.d(str, "format");
            l.d(objArr, "args");
            if (!this.f1564d) {
                if (this.c) {
                    OutputStream outputStream = this.a;
                    Charset charset = m.d0.d.a;
                    byte[] bytes = "--".getBytes(charset);
                    l.c(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    OutputStream outputStream2 = this.a;
                    String c2 = j0.f1548p;
                    Objects.requireNonNull(c2, "null cannot be cast to non-null type java.lang.String");
                    byte[] bytes2 = c2.getBytes(charset);
                    l.c(bytes2, "(this as java.lang.String).getBytes(charset)");
                    outputStream2.write(bytes2);
                    OutputStream outputStream3 = this.a;
                    byte[] bytes3 = "\r\n".getBytes(charset);
                    l.c(bytes3, "(this as java.lang.String).getBytes(charset)");
                    outputStream3.write(bytes3);
                    this.c = false;
                }
                OutputStream outputStream4 = this.a;
                s sVar = s.a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
                l.c(format, "java.lang.String.format(format, *args)");
                Charset charset2 = m.d0.d.a;
                Objects.requireNonNull(format, "null cannot be cast to non-null type java.lang.String");
                byte[] bytes4 = format.getBytes(charset2);
                l.c(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                return;
            }
            OutputStream outputStream5 = this.a;
            s sVar2 = s.a;
            Locale locale = Locale.US;
            Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
            String format2 = String.format(locale, str, Arrays.copyOf(copyOf2, copyOf2.length));
            l.c(format2, "java.lang.String.format(locale, format, *args)");
            String encode = URLEncoder.encode(format2, "UTF-8");
            l.c(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
            byte[] bytes5 = encode.getBytes(m.d0.d.a);
            l.c(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void d(String str, Bitmap bitmap) {
            l.d(str, "key");
            l.d(bitmap, "bitmap");
            f(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.a);
            i("", new Object[0]);
            k();
            i0 i0Var = this.b;
            if (i0Var != null) {
                i0Var.d(l.j("    ", str), "<Image>");
            }
        }

        public final void e(String str, byte[] bArr) {
            l.d(str, "key");
            l.d(bArr, "bytes");
            f(str, str, "content/unknown");
            this.a.write(bArr);
            i("", new Object[0]);
            k();
            i0 i0Var = this.b;
            if (i0Var != null) {
                String j2 = l.j("    ", str);
                s sVar = s.a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
                l.c(format, "java.lang.String.format(locale, format, *args)");
                i0Var.d(j2, format);
            }
        }

        public final void f(String str, String str2, String str3) {
            if (!this.f1564d) {
                c("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    c("; filename=\"%s\"", str2);
                }
                i("", new Object[0]);
                if (str3 != null) {
                    i("%s: %s", "Content-Type", str3);
                }
                i("", new Object[0]);
                return;
            }
            OutputStream outputStream = this.a;
            s sVar = s.a;
            String format = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
            l.c(format, "java.lang.String.format(format, *args)");
            Charset charset = m.d0.d.a;
            Objects.requireNonNull(format, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = format.getBytes(charset);
            l.c(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void g(String str, Uri uri, String str2) {
            int i2;
            l.d(str, "key");
            l.d(uri, "contentUri");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            f(str, str, str2);
            if (this.a instanceof t0) {
                o0 o0Var = o0.a;
                ((t0) this.a).c(o0.v(uri));
                i2 = 0;
            } else {
                g0 g0Var = g0.a;
                InputStream openInputStream = g0.c().getContentResolver().openInputStream(uri);
                o0 o0Var2 = o0.a;
                i2 = o0.n(openInputStream, this.a) + 0;
            }
            i("", new Object[0]);
            k();
            i0 i0Var = this.b;
            if (i0Var != null) {
                String j2 = l.j("    ", str);
                s sVar = s.a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
                l.c(format, "java.lang.String.format(locale, format, *args)");
                i0Var.d(j2, format);
            }
        }

        public final void h(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int i2;
            l.d(str, "key");
            l.d(parcelFileDescriptor, "descriptor");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            f(str, str, str2);
            OutputStream outputStream = this.a;
            if (outputStream instanceof t0) {
                ((t0) outputStream).c(parcelFileDescriptor.getStatSize());
                i2 = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                o0 o0Var = o0.a;
                i2 = o0.n(autoCloseInputStream, this.a) + 0;
            }
            i("", new Object[0]);
            k();
            i0 i0Var = this.b;
            if (i0Var != null) {
                String j2 = l.j("    ", str);
                s sVar = s.a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
                l.c(format, "java.lang.String.format(locale, format, *args)");
                i0Var.d(j2, format);
            }
        }

        public final void i(String str, Object... objArr) {
            l.d(str, "format");
            l.d(objArr, "args");
            c(str, Arrays.copyOf(objArr, objArr.length));
            if (!this.f1564d) {
                c("\r\n", new Object[0]);
            }
        }

        public final void j(String str, Object obj, j0 j0Var) {
            l.d(str, "key");
            OutputStream outputStream = this.a;
            if (outputStream instanceof v0) {
                ((v0) outputStream).a(j0Var);
            }
            c cVar = j0.f1546n;
            if (cVar.u(obj)) {
                a(str, cVar.C(obj));
            } else if (obj instanceof Bitmap) {
                d(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                e(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                g(str, (Uri) obj, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                h(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof g) {
                g gVar = (g) obj;
                Parcelable b2 = gVar.b();
                String a2 = gVar.a();
                if (b2 instanceof ParcelFileDescriptor) {
                    h(str, (ParcelFileDescriptor) b2, a2);
                } else if (b2 instanceof Uri) {
                    g(str, (Uri) b2, a2);
                } else {
                    throw b();
                }
            } else {
                throw b();
            }
        }

        public final void k() {
            if (!this.f1564d) {
                i("--%s", j0.f1548p);
                return;
            }
            OutputStream outputStream = this.a;
            byte[] bytes = "&".getBytes(m.d0.d.a);
            l.c(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void l(String str, JSONArray jSONArray, Collection<j0> collection) {
            l.d(str, "key");
            l.d(jSONArray, "requestJsonArray");
            l.d(collection, "requests");
            OutputStream outputStream = this.a;
            if (!(outputStream instanceof v0)) {
                String jSONArray2 = jSONArray.toString();
                l.c(jSONArray2, "requestJsonArray.toString()");
                a(str, jSONArray2);
                return;
            }
            v0 v0Var = (v0) outputStream;
            f(str, (String) null, (String) null);
            c("[", new Object[0]);
            int i2 = 0;
            for (j0 a2 : collection) {
                int i3 = i2 + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                v0Var.a(a2);
                if (i2 > 0) {
                    c(",%s", jSONObject.toString());
                } else {
                    c("%s", jSONObject.toString());
                }
                i2 = i3;
            }
            c("]", new Object[0]);
            i0 i0Var = this.b;
            if (i0Var != null) {
                String j2 = l.j("    ", str);
                String jSONArray3 = jSONArray.toString();
                l.c(jSONArray3, "requestJsonArray.toString()");
                i0Var.d(j2, jSONArray3);
            }
        }
    }

    public static final class i implements e {
        final /* synthetic */ ArrayList<String> a;

        i(ArrayList<String> arrayList) {
            this.a = arrayList;
        }

        public void a(String str, String str2) {
            l.d(str, "key");
            l.d(str2, "value");
            ArrayList<String> arrayList = this.a;
            s sVar = s.a;
            String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, "UTF-8")}, 2));
            l.c(format, "java.lang.String.format(locale, format, *args)");
            arrayList.add(format);
        }
    }

    static {
        String simpleName = j0.class.getSimpleName();
        l.c(simpleName, "GraphRequest::class.java.simpleName");
        f1547o = simpleName;
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        l.c(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt > 0) {
            int i2 = 0;
            do {
                i2++;
                sb.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i2 < nextInt);
        }
        String sb2 = sb.toString();
        l.c(sb2, "buffer.toString()");
        f1548p = sb2;
    }

    public j0() {
        this((u) null, (String) null, (Bundle) null, (n0) null, (b) null, (String) null, 63, (m.y.d.g) null);
    }

    public j0(u uVar, String str, Bundle bundle, n0 n0Var, b bVar, String str2) {
        Bundle bundle2;
        this.f1554f = true;
        this.a = uVar;
        this.b = str;
        this.f1557i = str2;
        C(bVar);
        F(n0Var);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        this.f1555g = bundle2;
        if (this.f1557i == null) {
            g0 g0Var = g0.a;
            this.f1557i = g0.m();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ j0(com.facebook.u r6, java.lang.String r7, android.os.Bundle r8, com.facebook.n0 r9, com.facebook.j0.b r10, java.lang.String r11, int r12, m.y.d.g r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.j0.<init>(com.facebook.u, java.lang.String, android.os.Bundle, com.facebook.n0, com.facebook.j0$b, java.lang.String, int, m.y.d.g):void");
    }

    /* access modifiers changed from: private */
    public final void B(JSONArray jSONArray, Map<String, a> map) {
        JSONObject jSONObject = new JSONObject();
        String str = this.f1552d;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f1554f);
        }
        String str2 = this.f1553e;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String u = u();
        jSONObject.put("relative_url", u);
        jSONObject.put("method", this.f1559k);
        u uVar = this.a;
        if (uVar != null) {
            i0.f1448e.d(uVar.l());
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.f1555g.keySet()) {
            Object obj = this.f1555g.get(str3);
            if (f1546n.t(obj)) {
                s sVar = s.a;
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                l.c(format, "java.lang.String.format(locale, format, *args)");
                arrayList.add(format);
                map.put(format, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.c;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            f1546n.D(jSONObject2, u, new i(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    private final boolean I() {
        String m2 = m();
        boolean w = m2 == null ? false : q.w(m2, "|", false, 2, (Object) null);
        if (!(m2 != null && p.t(m2, "IG", false, 2, (Object) null) && !w) || !y()) {
            return !z() && !w;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final void a(b bVar, m0 m0Var) {
        l.d(m0Var, "response");
        JSONObject c2 = m0Var.c();
        JSONObject optJSONObject = c2 == null ? null : c2.optJSONObject("__debug__");
        JSONArray optJSONArray = optJSONObject == null ? null : optJSONObject.optJSONArray("messages");
        if (optJSONArray != null) {
            int i2 = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                    String optString = optJSONObject2 == null ? null : optJSONObject2.optString("message");
                    String optString2 = optJSONObject2 == null ? null : optJSONObject2.optString("type");
                    String optString3 = optJSONObject2 == null ? null : optJSONObject2.optString("link");
                    if (!(optString == null || optString2 == null)) {
                        p0 p0Var = p0.GRAPH_API_DEBUG_INFO;
                        if (l.a(optString2, "warning")) {
                            p0Var = p0.GRAPH_API_DEBUG_WARNING;
                        }
                        o0 o0Var = o0.a;
                        if (!o0.V(optString3)) {
                            optString = optString + " Link: " + optString3;
                        }
                        i0.f1448e.b(p0Var, f1547o, optString);
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
        }
        if (bVar != null) {
            bVar.a(m0Var);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r1 != null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void h() {
        /*
            r3 = this;
            android.os.Bundle r0 = r3.f1555g
            boolean r1 = r3.I()
            java.lang.String r2 = "access_token"
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = r3.o()
        L_0x000e:
            r0.putString(r2, r1)
            goto L_0x0019
        L_0x0012:
            java.lang.String r1 = r3.m()
            if (r1 == 0) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            boolean r1 = r0.containsKey(r2)
            if (r1 != 0) goto L_0x0034
            com.facebook.internal.o0 r1 = com.facebook.internal.o0.a
            com.facebook.g0 r1 = com.facebook.g0.a
            java.lang.String r1 = com.facebook.g0.i()
            boolean r1 = com.facebook.internal.o0.V(r1)
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = f1547o
            java.lang.String r2 = "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change."
            android.util.Log.w(r1, r2)
        L_0x0034:
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "android"
            r0.putString(r1, r2)
            java.lang.String r1 = "format"
            java.lang.String r2 = "json"
            r0.putString(r1, r2)
            com.facebook.g0 r1 = com.facebook.g0.a
            com.facebook.p0 r1 = com.facebook.p0.GRAPH_API_DEBUG_INFO
            boolean r1 = com.facebook.g0.x(r1)
            java.lang.String r2 = "debug"
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = "info"
        L_0x0050:
            r0.putString(r2, r1)
            goto L_0x005f
        L_0x0054:
            com.facebook.p0 r1 = com.facebook.p0.GRAPH_API_DEBUG_WARNING
            boolean r1 = com.facebook.g0.x(r1)
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = "warning"
            goto L_0x0050
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.j0.h():void");
    }

    private final String i(String str, boolean z) {
        if (!z && this.f1559k == n0.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f1555g.keySet()) {
            Object obj = this.f1555g.get(str2);
            if (obj == null) {
                obj = "";
            }
            c cVar = f1546n;
            if (cVar.u(obj)) {
                buildUpon.appendQueryParameter(str2, cVar.C(obj).toString());
            } else if (this.f1559k != n0.GET) {
                s sVar = s.a;
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                l.c(format, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        l.c(builder, "uriBuilder.toString()");
        return builder;
    }

    private final String m() {
        u uVar = this.a;
        if (uVar != null) {
            if (!this.f1555g.containsKey("access_token")) {
                String l2 = uVar.l();
                i0.f1448e.d(l2);
                return l2;
            }
        } else if (!this.f1555g.containsKey("access_token")) {
            return o();
        }
        return this.f1555g.getString("access_token");
    }

    private final String o() {
        g0 g0Var = g0.a;
        String d2 = g0.d();
        String i2 = g0.i();
        boolean z = true;
        if (d2.length() > 0) {
            if (i2.length() <= 0) {
                z = false;
            }
            if (z) {
                return d2 + '|' + i2;
            }
        }
        o0 o0Var = o0.a;
        o0.e0(f1547o, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    private final String r() {
        if (f1550r.matcher(this.b).matches()) {
            return this.b;
        }
        s sVar = s.a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f1557i, this.b}, 2));
        l.c(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final String x(String str) {
        if (!z()) {
            m0 m0Var = m0.a;
            str = m0.f();
        }
        s sVar = s.a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, r()}, 2));
        l.c(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final boolean y() {
        if (this.b == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("^/?");
        g0 g0Var = g0.a;
        sb.append(g0.d());
        sb.append("/?.*");
        return this.f1560l || Pattern.matches(sb.toString(), this.b) || Pattern.matches("^/?app/?.*", this.b);
    }

    private final boolean z() {
        g0 g0Var = g0.a;
        if (!l.a(g0.n(), "instagram.com")) {
            return true;
        }
        return !y();
    }

    public final void C(b bVar) {
        g0 g0Var = g0.a;
        if (g0.x(p0.GRAPH_API_DEBUG_INFO) || g0.x(p0.GRAPH_API_DEBUG_WARNING)) {
            this.f1558j = new q(bVar);
        } else {
            this.f1558j = bVar;
        }
    }

    public final void D(boolean z) {
        this.f1560l = z;
    }

    public final void E(JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public final void F(n0 n0Var) {
        if (this.f1561m == null || n0Var == n0.GET) {
            if (n0Var == null) {
                n0Var = n0.GET;
            }
            this.f1559k = n0Var;
            return;
        }
        throw new c0("Can't change HTTP method on request with overridden URL.");
    }

    public final void G(Bundle bundle) {
        l.d(bundle, "<set-?>");
        this.f1555g = bundle;
    }

    public final void H(Object obj) {
        this.f1556h = obj;
    }

    public final m0 j() {
        return f1546n.f(this);
    }

    public final k0 k() {
        return f1546n.l(this);
    }

    public final u l() {
        return this.a;
    }

    public final b n() {
        return this.f1558j;
    }

    public final JSONObject p() {
        return this.c;
    }

    public final String q() {
        return this.b;
    }

    public final n0 s() {
        return this.f1559k;
    }

    public final Bundle t() {
        return this.f1555g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.b);
        sb.append(", graphObject: ");
        sb.append(this.c);
        sb.append(", httpMethod: ");
        sb.append(this.f1559k);
        sb.append(", parameters: ");
        sb.append(this.f1555g);
        sb.append("}");
        String sb2 = sb.toString();
        l.c(sb2, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb2;
    }

    public final String u() {
        if (this.f1561m == null) {
            m0 m0Var = m0.a;
            String x = x(m0.g());
            h();
            Uri parse = Uri.parse(i(x, true));
            s sVar = s.a;
            String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
            l.c(format, "java.lang.String.format(format, *args)");
            return format;
        }
        throw new c0("Can't override URL for a batch request");
    }

    public final Object v() {
        return this.f1556h;
    }

    public final String w() {
        String str;
        String str2 = this.f1561m;
        if (str2 != null) {
            return String.valueOf(str2);
        }
        String str3 = this.b;
        if (this.f1559k != n0.POST || str3 == null || !p.k(str3, "/videos", false, 2, (Object) null)) {
            m0 m0Var = m0.a;
            g0 g0Var = g0.a;
            str = m0.h(g0.n());
        } else {
            m0 m0Var2 = m0.a;
            str = m0.i();
        }
        String x = x(str);
        h();
        return i(x, false);
    }
}
