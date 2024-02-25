package com.facebook.internal.s0;

import android.os.Build;
import com.facebook.internal.o0;
import java.io.File;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class i {

    /* renamed from: h  reason: collision with root package name */
    public static final b f1504h = new b((g) null);
    private String a;
    private c b;
    private JSONArray c;

    /* renamed from: d  reason: collision with root package name */
    private String f1505d;

    /* renamed from: e  reason: collision with root package name */
    private String f1506e;

    /* renamed from: f  reason: collision with root package name */
    private String f1507f;

    /* renamed from: g  reason: collision with root package name */
    private Long f1508g;

    public static final class a {
        public static final a a = new a();

        private a() {
        }

        public static final i a(String str, String str2) {
            return new i(str, str2, (g) null);
        }

        public static final i b(Throwable th, c cVar) {
            l.d(cVar, "t");
            return new i(th, cVar, (g) null);
        }

        public static final i c(JSONArray jSONArray) {
            l.d(jSONArray, "features");
            return new i(jSONArray, (g) null);
        }

        public static final i d(File file) {
            l.d(file, "file");
            return new i(file, (g) null);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final c b(String str) {
            return p.t(str, "crash_log_", false, 2, (Object) null) ? c.CrashReport : p.t(str, "shield_log_", false, 2, (Object) null) ? c.CrashShield : p.t(str, "thread_check_log_", false, 2, (Object) null) ? c.ThreadCheck : p.t(str, "analysis_log_", false, 2, (Object) null) ? c.Analysis : p.t(str, "anr_log_", false, 2, (Object) null) ? c.AnrReport : c.Unknown;
        }
    }

    public enum c {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a = null;

            static {
                int[] iArr = new int[c.values().length];
                iArr[c.Analysis.ordinal()] = 1;
                iArr[c.AnrReport.ordinal()] = 2;
                iArr[c.CrashReport.ordinal()] = 3;
                iArr[c.CrashShield.ordinal()] = 4;
                iArr[c.ThreadCheck.ordinal()] = 5;
                a = iArr;
            }
        }

        public final String c() {
            int i2 = a.a[ordinal()];
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_";
        }

        public String toString() {
            int i2 = a.a[ordinal()];
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.Analysis.ordinal()] = 1;
            iArr[c.AnrReport.ordinal()] = 2;
            iArr[c.CrashReport.ordinal()] = 3;
            iArr[c.CrashShield.ordinal()] = 4;
            iArr[c.ThreadCheck.ordinal()] = 5;
            a = iArr;
        }
    }

    private i(File file) {
        String name = file.getName();
        l.c(name, "file.name");
        this.a = name;
        this.b = f1504h.b(name);
        k kVar = k.a;
        JSONObject q2 = k.q(this.a, true);
        if (q2 != null) {
            this.f1508g = Long.valueOf(q2.optLong("timestamp", 0));
            this.f1505d = q2.optString("app_version", (String) null);
            this.f1506e = q2.optString("reason", (String) null);
            this.f1507f = q2.optString("callstack", (String) null);
            this.c = q2.optJSONArray("feature_names");
        }
    }

    public /* synthetic */ i(File file, g gVar) {
        this(file);
    }

    private i(String str, String str2) {
        this.b = c.AnrReport;
        o0 o0Var = o0.a;
        this.f1505d = o0.t();
        this.f1506e = str;
        this.f1507f = str2;
        this.f1508g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.f1508g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        l.c(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.a = stringBuffer2;
    }

    public /* synthetic */ i(String str, String str2, g gVar) {
        this(str, str2);
    }

    private i(Throwable th, c cVar) {
        this.b = cVar;
        o0 o0Var = o0.a;
        this.f1505d = o0.t();
        k kVar = k.a;
        this.f1506e = k.b(th);
        this.f1507f = k.e(th);
        this.f1508g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cVar.c());
        stringBuffer.append(String.valueOf(this.f1508g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        l.c(stringBuffer2, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
        this.a = stringBuffer2;
    }

    public /* synthetic */ i(Throwable th, c cVar, g gVar) {
        this(th, cVar);
    }

    private i(JSONArray jSONArray) {
        this.b = c.Analysis;
        this.f1508g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.f1508g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        l.c(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.a = stringBuffer2;
    }

    public /* synthetic */ i(JSONArray jSONArray, g gVar) {
        this(jSONArray);
    }

    private final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l2 = this.f1508g;
            if (l2 != null) {
                jSONObject.put("timestamp", l2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f1505d;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l2 = this.f1508g;
            if (l2 != null) {
                jSONObject.put("timestamp", l2);
            }
            String str2 = this.f1506e;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.f1507f;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            c cVar = this.b;
            if (cVar != null) {
                jSONObject.put("type", cVar);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject e() {
        c cVar = this.b;
        int i2 = cVar == null ? -1 : d.a[cVar.ordinal()];
        if (i2 == 1) {
            return c();
        }
        if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
            return d();
        }
        return null;
    }

    public final void a() {
        k kVar = k.a;
        k.a(this.a);
    }

    public final int b(i iVar) {
        l.d(iVar, "data");
        Long l2 = this.f1508g;
        if (l2 == null) {
            return -1;
        }
        long longValue = l2.longValue();
        Long l3 = iVar.f1508g;
        if (l3 == null) {
            return 1;
        }
        return l.f(l3.longValue(), longValue);
    }

    public final boolean f() {
        c cVar = this.b;
        int i2 = cVar == null ? -1 : d.a[cVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return ((i2 != 3 && i2 != 4 && i2 != 5) || this.f1507f == null || this.f1508g == null) ? false : true;
            }
            if (this.f1507f == null || this.f1506e == null || this.f1508g == null) {
                return false;
            }
        } else if (this.c == null || this.f1508g == null) {
            return false;
        }
    }

    public final void g() {
        if (f()) {
            k kVar = k.a;
            k.s(this.a, toString());
        }
    }

    public String toString() {
        String jSONObject;
        String str;
        JSONObject e2 = e();
        if (e2 == null) {
            jSONObject = new JSONObject().toString();
            str = "JSONObject().toString()";
        } else {
            jSONObject = e2.toString();
            str = "params.toString()";
        }
        l.c(jSONObject, str);
        return jSONObject;
    }
}
