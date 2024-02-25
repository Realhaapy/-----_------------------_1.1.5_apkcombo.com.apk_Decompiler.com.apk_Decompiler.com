package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.h;
import com.google.firebase.installations.g;
import com.google.firebase.messaging.l1.a;
import com.google.firebase.messaging.l1.b;
import f.e.a.a.c;
import f.e.a.a.f;
import f.e.a.c.g.l;
import java.util.concurrent.ExecutionException;

public class q0 {
    public static boolean A(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return B(intent.getExtras());
    }

    public static boolean B(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            h.l();
            Context j2 = h.l().j();
            SharedPreferences sharedPreferences = j2.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = j2.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(j2.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("delivery_metrics_exported_to_big_query_enabled"))) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    static a b(a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        a.C0048a p2 = a.p();
        p2.m(p(extras));
        p2.e(bVar);
        p2.f(f(extras));
        p2.i(m());
        p2.k(a.d.ANDROID);
        p2.h(k(extras));
        String h2 = h(extras);
        if (h2 != null) {
            p2.g(h2);
        }
        String o2 = o(extras);
        if (o2 != null) {
            p2.l(o2);
        }
        String c = c(extras);
        if (c != null) {
            p2.c(c);
        }
        String i2 = i(extras);
        if (i2 != null) {
            p2.b(i2);
        }
        String e2 = e(extras);
        if (e2 != null) {
            p2.d(e2);
        }
        long n2 = n(extras);
        if (n2 > 0) {
            p2.j(n2);
        }
        return p2.a();
    }

    static String c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    static String d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    static String e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    static String f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) l.a(g.l(h.l()).a());
        } catch (InterruptedException | ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }

    static String g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    static String h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    static String i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    static String j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    static a.c k(Bundle bundle) {
        return (bundle == null || !s0.t(bundle)) ? a.c.DATA_MESSAGE : a.c.DISPLAY_NOTIFICATION;
    }

    static String l(Bundle bundle) {
        return (bundle == null || !s0.t(bundle)) ? "data" : "display";
    }

    static String m() {
        return h.l().j().getPackageName();
    }

    static long n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "error parsing project number", e2);
            }
        }
        h l2 = h.l();
        String f2 = l2.o().f();
        if (f2 != null) {
            try {
                return Long.parseLong(f2);
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e3);
            }
        }
        String c = l2.o().c();
        if (!c.startsWith("1:")) {
            try {
                return Long.parseLong(c);
            } catch (NumberFormatException e4) {
                Log.w("FirebaseMessaging", "error parsing app ID", e4);
                return 0;
            }
        } else {
            String[] split = c.split(":");
            if (split.length < 2) {
                return 0;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0;
            }
            return Long.parseLong(str);
        }
    }

    static String o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    static int p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    static String q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    private static boolean r(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    public static void s(Intent intent) {
        x("_nd", intent.getExtras());
    }

    public static void t(Intent intent) {
        x("_nf", intent.getExtras());
    }

    public static void u(Bundle bundle) {
        y(bundle);
        x("_no", bundle);
    }

    public static void v(Intent intent) {
        if (A(intent)) {
            x("_nr", intent.getExtras());
        }
        if (z(intent)) {
            w(a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.l());
        }
    }

    private static void w(a.b bVar, Intent intent, f.e.a.a.g gVar) {
        if (gVar == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        a b = b(bVar, intent);
        if (b != null) {
            try {
                f<b> a = gVar.a("FCM_CLIENT_EVENT_LOGGING", b.class, f.e.a.a.b.b("proto"), a.a);
                b.a b2 = b.b();
                b2.b(b);
                a.a(c.d(b2.a()));
            } catch (RuntimeException e2) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e2);
            }
        }
    }

    static void x(String str, Bundle bundle) {
        try {
            h.l();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d2 = d(bundle);
            if (d2 != null) {
                bundle2.putString("_nmid", d2);
            }
            String e2 = e(bundle);
            if (e2 != null) {
                bundle2.putString("_nmn", e2);
            }
            String i2 = i(bundle);
            if (!TextUtils.isEmpty(i2)) {
                bundle2.putString("label", i2);
            }
            String g2 = g(bundle);
            if (!TextUtils.isEmpty(g2)) {
                bundle2.putString("message_channel", g2);
            }
            String o2 = o(bundle);
            if (o2 != null) {
                bundle2.putString("_nt", o2);
            }
            String j2 = j(bundle);
            if (j2 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(j2));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e3);
                }
            }
            String q2 = q(bundle);
            if (q2 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(q2));
                } catch (NumberFormatException e4) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e4);
                }
            }
            String l2 = l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", l2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            com.google.firebase.m.a.a aVar = (com.google.firebase.m.a.a) h.l().h(com.google.firebase.m.a.a.class);
            if (aVar != null) {
                aVar.f("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    private static void y(Bundle bundle) {
        if (bundle != null) {
            if ("1".equals(bundle.getString("google.c.a.tc"))) {
                com.google.firebase.m.a.a aVar = (com.google.firebase.m.a.a) h.l().h(com.google.firebase.m.a.a.class);
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                }
                if (aVar != null) {
                    String string = bundle.getString("google.c.a.c_id");
                    aVar.e("fcm", "_ln", string);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", "Firebase");
                    bundle2.putString("medium", "notification");
                    bundle2.putString("campaign", string);
                    aVar.f("fcm", "_cmp", bundle2);
                    return;
                }
                Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        }
    }

    public static boolean z(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return a();
    }
}
