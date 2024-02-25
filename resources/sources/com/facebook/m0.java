package com.facebook;

import android.util.Log;
import com.facebook.internal.i0;
import com.facebook.internal.o0;
import com.facebook.u;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import m.y.d.g;
import m.y.d.l;
import m.y.d.s;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class m0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f1707f = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final String f1708g = "com.facebook.m0";
    private final HttpURLConnection a;
    private final JSONObject b;
    private final JSONArray c;

    /* renamed from: d  reason: collision with root package name */
    private final f0 f1709d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f1710e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final m0 b(j0 j0Var, HttpURLConnection httpURLConnection, Object obj, Object obj2) {
            Boolean bool = null;
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                f0 a = f0.f1366o.a(jSONObject, obj2, httpURLConnection);
                if (a != null) {
                    Log.e(m0.f1708g, a.toString());
                    if (a.b() == 190) {
                        o0 o0Var = o0.a;
                        if (o0.R(j0Var.l())) {
                            if (a.g() != 493) {
                                u.f1749p.h((u) null);
                            } else {
                                u.c cVar = u.f1749p;
                                u e2 = cVar.e();
                                if (e2 != null) {
                                    bool = Boolean.valueOf(e2.n());
                                }
                                if (l.a(bool, Boolean.FALSE)) {
                                    cVar.d();
                                }
                            }
                        }
                    }
                    return new m0(j0Var, httpURLConnection, a);
                }
                o0 o0Var2 = o0.a;
                Object I = o0.I(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (I instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) I;
                    return new m0(j0Var, httpURLConnection, jSONObject2.toString(), jSONObject2);
                } else if (I instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) I;
                    return new m0(j0Var, httpURLConnection, jSONArray.toString(), jSONArray);
                } else {
                    obj = JSONObject.NULL;
                    l.c(obj, "NULL");
                }
            }
            if (obj == JSONObject.NULL) {
                return new m0(j0Var, httpURLConnection, obj.toString(), (JSONObject) null);
            }
            throw new c0(l.j("Got unexpected object type in response, class: ", obj.getClass().getSimpleName()));
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009b A[LOOP:0: B:21:0x0062->B:30:0x009b, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x009d A[EDGE_INSN: B:34:0x009d->B:31:0x009d ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.util.List<com.facebook.m0> c(java.net.HttpURLConnection r9, java.util.List<com.facebook.j0> r10, java.lang.Object r11) {
            /*
                r8 = this;
                int r0 = r10.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 0
                r3 = 1
                if (r0 != r3) goto L_0x004e
                java.lang.Object r3 = r10.get(r2)
                com.facebook.j0 r3 = (com.facebook.j0) r3
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
                r4.<init>()     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
                java.lang.String r5 = "body"
                r4.put(r5, r11)     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
                if (r9 != 0) goto L_0x0022
                r5 = 200(0xc8, float:2.8E-43)
                goto L_0x0026
            L_0x0022:
                int r5 = r9.getResponseCode()     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            L_0x0026:
                java.lang.String r6 = "code"
                r4.put(r6, r5)     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
                org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
                r5.<init>()     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
                r5.put(r4)     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
                goto L_0x004f
            L_0x0034:
                r4 = move-exception
                com.facebook.m0 r5 = new com.facebook.m0
                com.facebook.f0 r6 = new com.facebook.f0
                r6.<init>((java.net.HttpURLConnection) r9, (java.lang.Exception) r4)
                r5.<init>(r3, r9, r6)
                goto L_0x004b
            L_0x0040:
                r4 = move-exception
                com.facebook.m0 r5 = new com.facebook.m0
                com.facebook.f0 r6 = new com.facebook.f0
                r6.<init>((java.net.HttpURLConnection) r9, (java.lang.Exception) r4)
                r5.<init>(r3, r9, r6)
            L_0x004b:
                r1.add(r5)
            L_0x004e:
                r5 = r11
            L_0x004f:
                boolean r3 = r5 instanceof org.json.JSONArray
                if (r3 == 0) goto L_0x009e
                r3 = r5
                org.json.JSONArray r3 = (org.json.JSONArray) r3
                int r4 = r3.length()
                if (r4 != r0) goto L_0x009e
                int r0 = r3.length()
                if (r0 <= 0) goto L_0x009d
            L_0x0062:
                int r3 = r2 + 1
                java.lang.Object r4 = r10.get(r2)
                com.facebook.j0 r4 = (com.facebook.j0) r4
                r6 = r5
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x008a, c0 -> 0x007e }
                java.lang.Object r2 = r6.get(r2)     // Catch:{ JSONException -> 0x008a, c0 -> 0x007e }
                java.lang.String r6 = "obj"
                m.y.d.l.c(r2, r6)     // Catch:{ JSONException -> 0x008a, c0 -> 0x007e }
                com.facebook.m0 r2 = r8.b(r4, r9, r2, r11)     // Catch:{ JSONException -> 0x008a, c0 -> 0x007e }
                r1.add(r2)     // Catch:{ JSONException -> 0x008a, c0 -> 0x007e }
                goto L_0x0098
            L_0x007e:
                r2 = move-exception
                com.facebook.m0 r6 = new com.facebook.m0
                com.facebook.f0 r7 = new com.facebook.f0
                r7.<init>((java.net.HttpURLConnection) r9, (java.lang.Exception) r2)
                r6.<init>(r4, r9, r7)
                goto L_0x0095
            L_0x008a:
                r2 = move-exception
                com.facebook.m0 r6 = new com.facebook.m0
                com.facebook.f0 r7 = new com.facebook.f0
                r7.<init>((java.net.HttpURLConnection) r9, (java.lang.Exception) r2)
                r6.<init>(r4, r9, r7)
            L_0x0095:
                r1.add(r6)
            L_0x0098:
                if (r3 < r0) goto L_0x009b
                goto L_0x009d
            L_0x009b:
                r2 = r3
                goto L_0x0062
            L_0x009d:
                return r1
            L_0x009e:
                com.facebook.c0 r9 = new com.facebook.c0
                java.lang.String r10 = "Unexpected number of results"
                r9.<init>((java.lang.String) r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.m0.a.c(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
        }

        public final List<m0> a(List<j0> list, HttpURLConnection httpURLConnection, c0 c0Var) {
            l.d(list, "requests");
            ArrayList arrayList = new ArrayList(k.j(list, 10));
            for (j0 m0Var : list) {
                arrayList.add(new m0(m0Var, httpURLConnection, new f0(httpURLConnection, (Exception) c0Var)));
            }
            return arrayList;
        }

        public final List<m0> d(InputStream inputStream, HttpURLConnection httpURLConnection, l0 l0Var) {
            l.d(l0Var, "requests");
            o0 o0Var = o0.a;
            String n0 = o0.n0(inputStream);
            i0.f1448e.c(p0.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(n0.length()), n0);
            return e(n0, httpURLConnection, l0Var);
        }

        public final List<m0> e(String str, HttpURLConnection httpURLConnection, l0 l0Var) {
            l.d(str, "responseString");
            l.d(l0Var, "requests");
            Object nextValue = new JSONTokener(str).nextValue();
            l.c(nextValue, "resultObject");
            List<m0> c = c(httpURLConnection, l0Var, nextValue);
            i0.f1448e.c(p0.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", l0Var.t(), Integer.valueOf(str.length()), c);
            return c;
        }

        public final List<m0> f(HttpURLConnection httpURLConnection, l0 l0Var) {
            List<m0> a;
            l.d(httpURLConnection, "connection");
            l.d(l0Var, "requests");
            InputStream inputStream = null;
            try {
                g0 g0Var = g0.a;
                if (g0.u()) {
                    inputStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                    a = d(inputStream, httpURLConnection, l0Var);
                    o0 o0Var = o0.a;
                    o0.h(inputStream);
                    return a;
                }
                Log.e(m0.f1708g, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                throw new c0("GraphRequest can't be used when Facebook SDK isn't fully initialized");
            } catch (c0 e2) {
                i0.f1448e.c(p0.REQUESTS, "Response", "Response <Error>: %s", e2);
                a = a(l0Var, httpURLConnection, e2);
            } catch (Exception e3) {
                i0.f1448e.c(p0.REQUESTS, "Response", "Response <Error>: %s", e3);
                a = a(l0Var, httpURLConnection, new c0((Throwable) e3));
            } catch (Throwable th) {
                o0 o0Var2 = o0.a;
                o0.h((Closeable) null);
                throw th;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public m0(j0 j0Var, HttpURLConnection httpURLConnection, f0 f0Var) {
        this(j0Var, httpURLConnection, (String) null, (JSONObject) null, (JSONArray) null, f0Var);
        l.d(j0Var, "request");
        l.d(f0Var, "error");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public m0(j0 j0Var, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(j0Var, httpURLConnection, str, (JSONObject) null, jSONArray, (f0) null);
        l.d(j0Var, "request");
        l.d(str, "rawResponse");
        l.d(jSONArray, "graphObjects");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public m0(j0 j0Var, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(j0Var, httpURLConnection, str, jSONObject, (JSONArray) null, (f0) null);
        l.d(j0Var, "request");
        l.d(str, "rawResponse");
    }

    public m0(j0 j0Var, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, f0 f0Var) {
        l.d(j0Var, "request");
        this.a = httpURLConnection;
        this.b = jSONObject;
        this.c = jSONArray;
        this.f1709d = f0Var;
        this.f1710e = jSONObject;
    }

    public final f0 b() {
        return this.f1709d;
    }

    public final JSONObject c() {
        return this.b;
    }

    public final JSONObject d() {
        return this.f1710e;
    }

    public String toString() {
        String str;
        try {
            s sVar = s.a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.a;
            objArr[0] = Integer.valueOf(httpURLConnection == null ? 200 : httpURLConnection.getResponseCode());
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            l.c(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response: " + " responseCode: " + str + ", graphObject: " + this.b + ", error: " + this.f1709d + "}";
        l.c(str2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return str2;
    }
}
