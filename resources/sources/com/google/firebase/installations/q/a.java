package com.google.firebase.installations.q;

import com.google.firebase.installations.q.c;
import com.google.firebase.installations.q.d;
import java.util.Objects;

final class a extends d {
    private final String a;
    private final c.a b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2656d;

    /* renamed from: e  reason: collision with root package name */
    private final long f2657e;

    /* renamed from: f  reason: collision with root package name */
    private final long f2658f;

    /* renamed from: g  reason: collision with root package name */
    private final String f2659g;

    static final class b extends d.a {
        private String a;
        private c.a b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private String f2660d;

        /* renamed from: e  reason: collision with root package name */
        private Long f2661e;

        /* renamed from: f  reason: collision with root package name */
        private Long f2662f;

        /* renamed from: g  reason: collision with root package name */
        private String f2663g;

        b() {
        }

        private b(d dVar) {
            this.a = dVar.d();
            this.b = dVar.g();
            this.c = dVar.b();
            this.f2660d = dVar.f();
            this.f2661e = Long.valueOf(dVar.c());
            this.f2662f = Long.valueOf(dVar.h());
            this.f2663g = dVar.e();
        }

        public d a() {
            String str = "";
            if (this.b == null) {
                str = str + " registrationStatus";
            }
            if (this.f2661e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f2662f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b, this.c, this.f2660d, this.f2661e.longValue(), this.f2662f.longValue(), this.f2663g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public d.a b(String str) {
            this.c = str;
            return this;
        }

        public d.a c(long j2) {
            this.f2661e = Long.valueOf(j2);
            return this;
        }

        public d.a d(String str) {
            this.a = str;
            return this;
        }

        public d.a e(String str) {
            this.f2663g = str;
            return this;
        }

        public d.a f(String str) {
            this.f2660d = str;
            return this;
        }

        public d.a g(c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.b = aVar;
            return this;
        }

        public d.a h(long j2) {
            this.f2662f = Long.valueOf(j2);
            return this;
        }
    }

    private a(String str, c.a aVar, String str2, String str3, long j2, long j3, String str4) {
        this.a = str;
        this.b = aVar;
        this.c = str2;
        this.f2656d = str3;
        this.f2657e = j2;
        this.f2658f = j3;
        this.f2659g = str4;
    }

    public String b() {
        return this.c;
    }

    public long c() {
        return this.f2657e;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.f2659g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.a;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.b.equals(dVar.g()) && ((str = this.c) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f2656d) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f2657e == dVar.c() && this.f2658f == dVar.h()) {
                String str4 = this.f2659g;
                String e2 = dVar.e();
                if (str4 == null) {
                    if (e2 == null) {
                        return true;
                    }
                } else if (str4.equals(e2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f2656d;
    }

    public c.a g() {
        return this.b;
    }

    public long h() {
        return this.f2658f;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str2 = this.c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2656d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j2 = this.f2657e;
        long j3 = this.f2658f;
        int i3 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.f2659g;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return i3 ^ i2;
    }

    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.a + ", registrationStatus=" + this.b + ", authToken=" + this.c + ", refreshToken=" + this.f2656d + ", expiresInSecs=" + this.f2657e + ", tokenCreationEpochInSecs=" + this.f2658f + ", fisError=" + this.f2659g + "}";
    }
}
