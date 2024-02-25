package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.login.x;
import com.facebook.y0.g0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONObject;

public final class z {
    public static final a c = new a((g) null);
    private final String a;
    private final g0 b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final Bundle b(String str) {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        }
    }

    static {
        Executors.newSingleThreadScheduledExecutor();
    }

    public z(Context context, String str) {
        PackageInfo packageInfo;
        l.d(context, "context");
        l.d(str, "applicationId");
        this.a = str;
        this.b = new g0(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) != null) {
                String str2 = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final String a() {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }

    public final void b(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                Bundle a2 = c.b(str);
                if (str3 != null) {
                    a2.putString("2_result", str3);
                }
                if (str4 != null) {
                    a2.putString("5_error_message", str4);
                }
                if (str5 != null) {
                    a2.putString("4_error_code", str5);
                }
                if (map != null && (!map.isEmpty())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry next : map.entrySet()) {
                        if (((String) next.getKey()) != null) {
                            linkedHashMap.put(next.getKey(), next.getValue());
                        }
                    }
                    a2.putString("6_extras", new JSONObject(linkedHashMap).toString());
                }
                a2.putString("3_method", str2);
                this.b.g(str6, a2);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final void c(String str, String str2, String str3) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                Bundle a2 = c.b(str);
                a2.putString("3_method", str2);
                this.b.g(str3, a2);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final void d(String str, String str2, String str3) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                Bundle a2 = c.b(str);
                a2.putString("3_method", str2);
                this.b.g(str3, a2);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final void e(String str, String str2, String str3) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                Bundle a2 = c.b("");
                a2.putString("2_result", x.f.a.ERROR.c());
                a2.putString("5_error_message", str2);
                a2.putString("3_method", str3);
                this.b.g(str, a2);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }
}
