package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.h;
import com.google.firebase.remoteconfig.internal.k;
import com.google.firebase.remoteconfig.internal.l;
import com.google.firebase.remoteconfig.n;
import com.google.firebase.remoteconfig.o;
import com.google.firebase.remoteconfig.r;
import e.f.j.e.a;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigFetchHttpClient {

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f2883h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private final Context a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2884d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2885e;

    /* renamed from: f  reason: collision with root package name */
    private final long f2886f;

    /* renamed from: g  reason: collision with root package name */
    private final long f2887g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j2, long j3) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.f2884d = f(str);
        this.f2885e = str3;
        this.f2886f = j2;
        this.f2887g = j3;
    }

    private boolean a(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    private String b(long j2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j2));
    }

    private JSONObject c(String str, String str2, Map<String, String> map, Long l2) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.b);
            Locale locale = this.a.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i2 = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", i2 >= 21 ? locale.toLanguageTag() : locale.toString());
            hashMap.put("platformVersion", Integer.toString(i2));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    hashMap.put("appBuild", Long.toString(a.a(packageInfo)));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", this.a.getPackageName());
            hashMap.put("sdkVersion", "21.1.1");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            if (l2 != null) {
                hashMap.put("firstOpenTime", b(l2.longValue()));
            }
            return new JSONObject(hashMap);
        }
        throw new n("Fetch failed: Firebase installation id is null.");
    }

    private static k e(JSONObject jSONObject, Date date) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        try {
            k.b g2 = k.g();
            g2.e(date);
            JSONObject jSONObject3 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                g2.c(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray("experimentDescriptions");
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                g2.d(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject("personalizationMetadata");
            } catch (JSONException unused3) {
            }
            if (jSONObject3 != null) {
                g2.f(jSONObject3);
            }
            return g2.a();
        } catch (JSONException e2) {
            throw new n("Fetch failed: fetch response could not be parsed.", e2);
        }
    }

    private static String f(String str) {
        Matcher matcher = f2883h.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private JSONObject g(URLConnection uRLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) read);
        }
    }

    private String h(String str, String str2) {
        return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", new Object[]{str, str2});
    }

    private String i() {
        try {
            Context context = this.a;
            byte[] a2 = com.google.android.gms.common.util.a.a(context, context.getPackageName());
            if (a2 != null) {
                return h.a(a2, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("FirebaseRemoteConfig", "No such package: " + this.a.getPackageName(), e2);
            return null;
        }
    }

    private void j(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", i());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private void k(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
    }

    private void l(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    private void m(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f2886f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f2887g));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        j(httpURLConnection, str2);
        k(httpURLConnection, map);
    }

    /* access modifiers changed from: package-private */
    public HttpURLConnection d() {
        try {
            return (HttpURLConnection) new URL(h(this.f2884d, this.f2885e)).openConnection();
        } catch (IOException e2) {
            throw new o(e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    @Keep
    public l.a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l2, Date date) {
        m(httpURLConnection, str3, str2, map2);
        try {
            l(httpURLConnection, c(str, str2, map, l2).toString().getBytes("utf-8"));
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject g2 = g(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                return !a(g2) ? l.a.a(date) : l.a.b(e(g2, date), headerField);
            }
            throw new r(responseCode, httpURLConnection.getResponseMessage());
        } catch (IOException | JSONException e2) {
            throw new n("The client had an error while calling the backend!", e2);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }
}
