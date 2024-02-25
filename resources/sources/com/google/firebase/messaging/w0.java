package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.i0;
import java.util.Map;

public final class w0 extends com.google.android.gms.common.internal.v.a {
    public static final Parcelable.Creator<w0> CREATOR = new x0();

    /* renamed from: e  reason: collision with root package name */
    Bundle f2830e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, String> f2831f;

    /* renamed from: g  reason: collision with root package name */
    private c f2832g;

    public static class b {
        private final Bundle a;
        private final Map<String, String> b = new e.e.a();

        public b(String str) {
            Bundle bundle = new Bundle();
            this.a = bundle;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("google.to", str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        public w0 a() {
            Bundle bundle = new Bundle();
            for (Map.Entry next : this.b.entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
            bundle.putAll(this.a);
            this.a.remove("from");
            return new w0(bundle);
        }

        public b b(String str) {
            this.a.putString("collapse_key", str);
            return this;
        }

        public b c(Map<String, String> map) {
            this.b.clear();
            this.b.putAll(map);
            return this;
        }

        public b d(String str) {
            this.a.putString("google.message_id", str);
            return this;
        }

        public b e(String str) {
            this.a.putString("message_type", str);
            return this;
        }

        public b f(int i2) {
            this.a.putString("google.ttl", String.valueOf(i2));
            return this;
        }
    }

    public static class c {
        private final String a;
        private final String b;
        private final String[] c;

        /* renamed from: d  reason: collision with root package name */
        private final String f2833d;

        /* renamed from: e  reason: collision with root package name */
        private final String f2834e;

        /* renamed from: f  reason: collision with root package name */
        private final String[] f2835f;

        /* renamed from: g  reason: collision with root package name */
        private final String f2836g;

        /* renamed from: h  reason: collision with root package name */
        private final String f2837h;

        /* renamed from: i  reason: collision with root package name */
        private final String f2838i;

        /* renamed from: j  reason: collision with root package name */
        private final String f2839j;

        /* renamed from: k  reason: collision with root package name */
        private final String f2840k;

        /* renamed from: l  reason: collision with root package name */
        private final String f2841l;

        /* renamed from: m  reason: collision with root package name */
        private final String f2842m;

        /* renamed from: n  reason: collision with root package name */
        private final Uri f2843n;

        /* renamed from: o  reason: collision with root package name */
        private final String f2844o;

        /* renamed from: p  reason: collision with root package name */
        private final Integer f2845p;

        /* renamed from: q  reason: collision with root package name */
        private final Integer f2846q;

        /* renamed from: r  reason: collision with root package name */
        private final Integer f2847r;

        private c(s0 s0Var) {
            this.a = s0Var.p("gcm.n.title");
            this.b = s0Var.h("gcm.n.title");
            this.c = j(s0Var, "gcm.n.title");
            this.f2833d = s0Var.p("gcm.n.body");
            this.f2834e = s0Var.h("gcm.n.body");
            this.f2835f = j(s0Var, "gcm.n.body");
            this.f2836g = s0Var.p("gcm.n.icon");
            this.f2838i = s0Var.o();
            this.f2839j = s0Var.p("gcm.n.tag");
            this.f2840k = s0Var.p("gcm.n.color");
            this.f2841l = s0Var.p("gcm.n.click_action");
            this.f2842m = s0Var.p("gcm.n.android_channel_id");
            this.f2843n = s0Var.f();
            this.f2837h = s0Var.p("gcm.n.image");
            this.f2844o = s0Var.p("gcm.n.ticker");
            this.f2845p = s0Var.b("gcm.n.notification_priority");
            this.f2846q = s0Var.b("gcm.n.visibility");
            this.f2847r = s0Var.b("gcm.n.notification_count");
            s0Var.a("gcm.n.sticky");
            s0Var.a("gcm.n.local_only");
            s0Var.a("gcm.n.default_sound");
            s0Var.a("gcm.n.default_vibrate_timings");
            s0Var.a("gcm.n.default_light_settings");
            s0Var.j("gcm.n.event_time");
            s0Var.e();
            s0Var.q();
        }

        private static String[] j(s0 s0Var, String str) {
            Object[] g2 = s0Var.g(str);
            if (g2 == null) {
                return null;
            }
            String[] strArr = new String[g2.length];
            for (int i2 = 0; i2 < g2.length; i2++) {
                strArr[i2] = String.valueOf(g2[i2]);
            }
            return strArr;
        }

        public String a() {
            return this.f2833d;
        }

        public String[] b() {
            return this.f2835f;
        }

        public String c() {
            return this.f2834e;
        }

        public String d() {
            return this.f2842m;
        }

        public String e() {
            return this.f2841l;
        }

        public String f() {
            return this.f2840k;
        }

        public String g() {
            return this.f2836g;
        }

        public Uri h() {
            String str = this.f2837h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public Uri i() {
            return this.f2843n;
        }

        public Integer k() {
            return this.f2847r;
        }

        public Integer l() {
            return this.f2845p;
        }

        public String m() {
            return this.f2838i;
        }

        public String n() {
            return this.f2839j;
        }

        public String o() {
            return this.f2844o;
        }

        public String p() {
            return this.a;
        }

        public String[] q() {
            return this.c;
        }

        public String r() {
            return this.b;
        }

        public Integer s() {
            return this.f2846q;
        }
    }

    public w0(Bundle bundle) {
        this.f2830e = bundle;
    }

    private int f(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public String b() {
        return this.f2830e.getString("collapse_key");
    }

    public Map<String, String> c() {
        if (this.f2831f == null) {
            this.f2831f = i0.a.a(this.f2830e);
        }
        return this.f2831f;
    }

    public String d() {
        return this.f2830e.getString("from");
    }

    public String e() {
        String string = this.f2830e.getString("google.message_id");
        return string == null ? this.f2830e.getString("message_id") : string;
    }

    public String g() {
        return this.f2830e.getString("message_type");
    }

    public c h() {
        if (this.f2832g == null && s0.t(this.f2830e)) {
            this.f2832g = new c(new s0(this.f2830e));
        }
        return this.f2832g;
    }

    public int i() {
        String string = this.f2830e.getString("google.original_priority");
        if (string == null) {
            string = this.f2830e.getString("google.priority");
        }
        return f(string);
    }

    public long j() {
        Object obj = this.f2830e.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0;
        }
    }

    public String k() {
        return this.f2830e.getString("google.to");
    }

    public int l() {
        Object obj = this.f2830e.get("google.ttl");
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

    /* access modifiers changed from: package-private */
    public void m(Intent intent) {
        intent.putExtras(this.f2830e);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        x0.c(this, parcel, i2);
    }
}
