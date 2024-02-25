package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.l;

public final class k {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2685d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2686e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2687f;

    /* renamed from: g  reason: collision with root package name */
    private final String f2688g;

    public static final class b {
        private String a;
        private String b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private String f2689d;

        /* renamed from: e  reason: collision with root package name */
        private String f2690e;

        /* renamed from: f  reason: collision with root package name */
        private String f2691f;

        /* renamed from: g  reason: collision with root package name */
        private String f2692g;

        public k a() {
            return new k(this.b, this.a, this.c, this.f2689d, this.f2690e, this.f2691f, this.f2692g);
        }

        public b b(String str) {
            n.e(str, "ApiKey must be set.");
            this.a = str;
            return this;
        }

        public b c(String str) {
            n.e(str, "ApplicationId must be set.");
            this.b = str;
            return this;
        }

        public b d(String str) {
            this.c = str;
            return this;
        }

        public b e(String str) {
            this.f2689d = str;
            return this;
        }

        public b f(String str) {
            this.f2690e = str;
            return this;
        }

        public b g(String str) {
            this.f2692g = str;
            return this;
        }

        public b h(String str) {
            this.f2691f = str;
            return this;
        }
    }

    private k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        n.k(!l.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.f2685d = str4;
        this.f2686e = str5;
        this.f2687f = str6;
        this.f2688g = str7;
    }

    public static k a(Context context) {
        q qVar = new q(context);
        String a2 = qVar.a("google_app_id");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return new k(a2, qVar.a("google_api_key"), qVar.a("firebase_database_url"), qVar.a("ga_trackingId"), qVar.a("gcm_defaultSenderId"), qVar.a("google_storage_bucket"), qVar.a("project_id"));
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.f2685d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return m.a(this.b, kVar.b) && m.a(this.a, kVar.a) && m.a(this.c, kVar.c) && m.a(this.f2685d, kVar.f2685d) && m.a(this.f2686e, kVar.f2686e) && m.a(this.f2687f, kVar.f2687f) && m.a(this.f2688g, kVar.f2688g);
    }

    public String f() {
        return this.f2686e;
    }

    public String g() {
        return this.f2688g;
    }

    public String h() {
        return this.f2687f;
    }

    public int hashCode() {
        return m.b(this.b, this.a, this.c, this.f2685d, this.f2686e, this.f2687f, this.f2688g);
    }

    public String toString() {
        m.a c2 = m.c(this);
        c2.a("applicationId", this.b);
        c2.a("apiKey", this.a);
        c2.a("databaseUrl", this.c);
        c2.a("gcmSenderId", this.f2686e);
        c2.a("storageBucket", this.f2687f);
        c2.a("projectId", this.f2688g);
        return c2.toString();
    }
}
