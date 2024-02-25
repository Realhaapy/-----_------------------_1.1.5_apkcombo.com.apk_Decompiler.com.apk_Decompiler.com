package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.cct.f.a;
import com.google.android.datatransport.cct.f.j;
import com.google.android.datatransport.cct.f.k;
import com.google.android.datatransport.cct.f.l;
import com.google.android.datatransport.cct.f.m;
import com.google.android.datatransport.cct.f.n;
import com.google.android.datatransport.cct.f.o;
import com.google.android.datatransport.cct.f.p;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.m;
import f.e.a.a.i.i;
import f.e.a.a.i.j;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

final class d implements m {
    private final com.google.firebase.o.a a;
    private final ConnectivityManager b;
    private final Context c;

    /* renamed from: d  reason: collision with root package name */
    final URL f2218d;

    /* renamed from: e  reason: collision with root package name */
    private final f.e.a.a.i.c0.a f2219e;

    /* renamed from: f  reason: collision with root package name */
    private final f.e.a.a.i.c0.a f2220f;

    /* renamed from: g  reason: collision with root package name */
    private final int f2221g;

    static final class a {
        final URL a;
        final j b;
        final String c;

        a(URL url, j jVar, String str) {
            this.a = url;
            this.b = jVar;
            this.c = str;
        }

        /* access modifiers changed from: package-private */
        public a a(URL url) {
            return new a(url, this.b, this.c);
        }
    }

    static final class b {
        final int a;
        final URL b;
        final long c;

        b(int i2, URL url, long j2) {
            this.a = i2;
            this.b = url;
            this.c = j2;
        }
    }

    d(Context context, f.e.a.a.i.c0.a aVar, f.e.a.a.i.c0.a aVar2) {
        this(context, aVar, aVar2, 40000);
    }

    d(Context context, f.e.a.a.i.c0.a aVar, f.e.a.a.i.c0.a aVar2, int i2) {
        this.a = j.b();
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f2218d = m(c.c);
        this.f2219e = aVar2;
        this.f2220f = aVar;
        this.f2221g = i2;
    }

    /* access modifiers changed from: private */
    public b c(a aVar) {
        GZIPOutputStream gZIPOutputStream;
        InputStream l2;
        f.e.a.a.i.y.a.f("CctTransportBackend", "Making request to: %s", aVar.a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f2221g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.1.6"}));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.a.a(aVar.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                f.e.a.a.i.y.a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                f.e.a.a.i.y.a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                f.e.a.a.i.y.a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                }
                if (responseCode != 200) {
                    return new b(responseCode, (URL) null, 0);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    l2 = l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    b bVar = new b(responseCode, (URL) null, n.b(new BufferedReader(new InputStreamReader(l2))).c());
                    if (l2 != null) {
                        l2.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                throw th;
                throw th;
            } catch (Throwable th3) {
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th3;
            }
        } catch (ConnectException | UnknownHostException e2) {
            f.e.a.a.i.y.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e2);
            return new b(500, (URL) null, 0);
        } catch (com.google.firebase.o.b | IOException e3) {
            f.e.a.a.i.y.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e3);
            return new b(400, (URL) null, 0);
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }

    private static int d(NetworkInfo networkInfo) {
        o.b bVar;
        if (networkInfo == null) {
            bVar = o.b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype == -1) {
                bVar = o.b.COMBINED;
            } else if (o.b.a(subtype) != null) {
                return subtype;
            } else {
                return 0;
            }
        }
        return bVar.c();
    }

    private static int e(NetworkInfo networkInfo) {
        return networkInfo == null ? o.c.NONE.c() : networkInfo.getType();
    }

    private static int f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            f.e.a.a.i.y.a.d("CctTransportBackend", "Unable to find version code for package", e2);
            return -1;
        }
    }

    private j g(f fVar) {
        l.a aVar;
        HashMap hashMap = new HashMap();
        for (f.e.a.a.i.j next : fVar.b()) {
            String j2 = next.j();
            if (!hashMap.containsKey(j2)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(j2, arrayList);
            } else {
                ((List) hashMap.get(j2)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            f.e.a.a.i.j jVar = (f.e.a.a.i.j) ((List) entry.getValue()).get(0);
            m.a a2 = com.google.android.datatransport.cct.f.m.a();
            a2.f(p.DEFAULT);
            a2.g(this.f2220f.a());
            a2.h(this.f2219e.a());
            k.a a3 = k.a();
            a3.c(k.b.ANDROID_FIREBASE);
            a.C0036a a4 = com.google.android.datatransport.cct.f.a.a();
            a4.m(Integer.valueOf(jVar.g("sdk-version")));
            a4.j(jVar.b("model"));
            a4.f(jVar.b("hardware"));
            a4.d(jVar.b("device"));
            a4.l(jVar.b("product"));
            a4.k(jVar.b("os-uild"));
            a4.h(jVar.b("manufacturer"));
            a4.e(jVar.b("fingerprint"));
            a4.c(jVar.b("country"));
            a4.g(jVar.b("locale"));
            a4.i(jVar.b("mcc_mnc"));
            a4.b(jVar.b("application_build"));
            a3.b(a4.a());
            a2.b(a3.a());
            try {
                a2.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                a2.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (f.e.a.a.i.j jVar2 : (List) entry.getValue()) {
                i e2 = jVar2.e();
                f.e.a.a.b b2 = e2.b();
                if (b2.equals(f.e.a.a.b.b("proto"))) {
                    aVar = l.j(e2.a());
                } else if (b2.equals(f.e.a.a.b.b("json"))) {
                    aVar = l.i(new String(e2.a(), Charset.forName("UTF-8")));
                } else {
                    f.e.a.a.i.y.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                aVar.c(jVar2.f());
                aVar.d(jVar2.k());
                aVar.h(jVar2.h("tz-offset"));
                o.a a5 = o.a();
                a5.c(o.c.a(jVar2.g("net-type")));
                a5.b(o.b.a(jVar2.g("mobile-subtype")));
                aVar.e(a5.a());
                if (jVar2.d() != null) {
                    aVar.b(jVar2.d());
                }
                arrayList3.add(aVar.a());
            }
            a2.c(arrayList3);
            arrayList2.add(a2.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager h(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long i() {
        Calendar.getInstance();
        return (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
    }

    static /* synthetic */ a k(a aVar, b bVar) {
        URL url = bVar.b;
        if (url == null) {
            return null;
        }
        f.e.a.a.i.y.a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.b);
    }

    private static InputStream l(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Invalid url: " + str, e2);
        }
    }

    public f.e.a.a.i.j a(f.e.a.a.i.j jVar) {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        j.a l2 = jVar.l();
        l2.a("sdk-version", Build.VERSION.SDK_INT);
        l2.c("model", Build.MODEL);
        l2.c("hardware", Build.HARDWARE);
        l2.c("device", Build.DEVICE);
        l2.c("product", Build.PRODUCT);
        l2.c("os-uild", Build.ID);
        l2.c("manufacturer", Build.MANUFACTURER);
        l2.c("fingerprint", Build.FINGERPRINT);
        l2.b("tz-offset", i());
        l2.a("net-type", e(activeNetworkInfo));
        l2.a("mobile-subtype", d(activeNetworkInfo));
        l2.c("country", Locale.getDefault().getCountry());
        l2.c("locale", Locale.getDefault().getLanguage());
        l2.c("mcc_mnc", h(this.c).getSimOperator());
        l2.c("application_build", Integer.toString(f(this.c)));
        return l2.d();
    }

    public g b(f fVar) {
        com.google.android.datatransport.cct.f.j g2 = g(fVar);
        URL url = this.f2218d;
        String str = null;
        if (fVar.c() != null) {
            try {
                c e2 = c.e(fVar.c());
                if (e2.f() != null) {
                    str = e2.f();
                }
                if (e2.g() != null) {
                    url = m(e2.g());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) f.e.a.a.i.z.b.a(5, new a(url, g2, str), new b(this), a.a);
            int i2 = bVar.a;
            if (i2 == 200) {
                return g.e(bVar.c);
            }
            if (i2 < 500) {
                if (i2 != 404) {
                    return i2 == 400 ? g.d() : g.a();
                }
            }
            return g.f();
        } catch (IOException e3) {
            f.e.a.a.i.y.a.d("CctTransportBackend", "Could not make request to the backend", e3);
            return g.f();
        }
    }
}
