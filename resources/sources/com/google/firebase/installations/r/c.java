package com.google.firebase.installations.r;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.util.a;
import com.google.android.gms.common.util.h;
import com.google.firebase.installations.i;
import com.google.firebase.installations.r.d;
import com.google.firebase.installations.r.f;
import com.google.firebase.q.j;
import com.google.firebase.r.b;
import f.e.a.c.g.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f2674d = Pattern.compile("[0-9]+s");

    /* renamed from: e  reason: collision with root package name */
    private static final Charset f2675e = Charset.forName("UTF-8");
    private final Context a;
    private final b<j> b;
    private final e c = new e();

    public c(Context context, b<j> bVar) {
        this.a = context;
        this.b = bVar;
    }

    private static String a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    private static JSONObject b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.1");
            return jSONObject;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private String f() {
        try {
            Context context = this.a;
            byte[] a2 = a.a(context, context.getPackageName());
            if (a2 != null) {
                return h.a(a2, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("ContentValues", "No such package: " + this.a.getPackageName(), e2);
            return null;
        }
    }

    private URL g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e2) {
            throw new i(e2.getMessage(), i.a.UNAVAILABLE);
        }
    }

    private static byte[] h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static boolean i(int i2) {
        return i2 >= 200 && i2 < 300;
    }

    private static void j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String o2 = o(httpURLConnection);
        if (!TextUtils.isEmpty(o2)) {
            Log.w("Firebase-Installations", o2);
            Log.w("Firebase-Installations", a(str, str2, str3));
        }
    }

    private HttpURLConnection l(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.a.getPackageName());
            j jVar = this.b.get();
            if (jVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) l.a(jVar.a()));
                } catch (ExecutionException e2) {
                    e = e2;
                } catch (InterruptedException e3) {
                    e = e3;
                    Thread.currentThread().interrupt();
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
            Log.w("ContentValues", "Failed to get heartbeats header", e);
            httpURLConnection.addRequestProperty("X-Android-Cert", f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
    }

    static long m(String str) {
        n.b(f2674d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private d n(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f2675e));
        f.a a2 = f.a();
        d.a a3 = d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a3.f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a3.c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a3.d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a2.c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a2.d(m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a3.b(a2.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a3.e(d.b.OK);
        return a3.a();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String o(java.net.HttpURLConnection r7) {
        /*
            java.io.InputStream r0 = r7.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = f2675e
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r0.<init>()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            if (r3 == 0) goto L_0x0028
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            goto L_0x0019
        L_0x0028:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 0
            int r6 = r7.getResponseCode()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r6     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 1
            java.lang.String r7 = r7.getResponseMessage()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r7     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r7 = 2
            r4[r7] = r0     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r7 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r7
        L_0x004a:
            r7 = move-exception
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r7
        L_0x004f:
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.r.c.o(java.net.HttpURLConnection):java.lang.String");
    }

    private f p(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f2675e));
        f.a a2 = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a2.c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a2.d(m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a2.b(f.b.OK);
        return a2.a();
    }

    private void q(HttpURLConnection httpURLConnection, String str, String str2) {
        s(httpURLConnection, h(b(str, str2)));
    }

    private void r(HttpURLConnection httpURLConnection) {
        s(httpURLConnection, h(c()));
    }

    private static void s(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    public d d(String str, String str2, String str3, String str4, String str5) {
        d n2;
        if (this.c.b()) {
            int i2 = 0;
            URL g2 = g(String.format("projects/%s/installations", new Object[]{str3}));
            while (i2 <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection l2 = l(g2, str);
                try {
                    l2.setRequestMethod("POST");
                    l2.setDoOutput(true);
                    if (str5 != null) {
                        l2.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    q(l2, str2, str4);
                    int responseCode = l2.getResponseCode();
                    this.c.f(responseCode);
                    if (i(responseCode)) {
                        n2 = n(l2);
                    } else {
                        k(l2, str4, str, str3);
                        if (responseCode == 429) {
                            throw new i("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", i.a.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            j();
                            d.a a2 = d.a();
                            a2.e(d.b.BAD_CONFIG);
                            n2 = a2.a();
                        } else {
                            l2.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i2++;
                        }
                    }
                    l2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return n2;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    public f e(String str, String str2, String str3, String str4) {
        f p2;
        f.a a2;
        if (this.c.b()) {
            int i2 = 0;
            URL g2 = g(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2}));
            while (i2 <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection l2 = l(g2, str);
                try {
                    l2.setRequestMethod("POST");
                    l2.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    l2.setDoOutput(true);
                    r(l2);
                    int responseCode = l2.getResponseCode();
                    this.c.f(responseCode);
                    if (i(responseCode)) {
                        p2 = p(l2);
                    } else {
                        k(l2, (String) null, str, str3);
                        if (responseCode == 401) {
                            a2 = f.a();
                            a2.b(f.b.AUTH_ERROR);
                        } else if (responseCode == 404) {
                            a2 = f.a();
                            a2.b(f.b.AUTH_ERROR);
                        } else if (responseCode == 429) {
                            throw new i("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", i.a.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            j();
                            a2 = f.a();
                            a2.b(f.b.BAD_CONFIG);
                        } else {
                            l2.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i2++;
                        }
                        p2 = a2.a();
                    }
                    l2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return p2;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }
}
