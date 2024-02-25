package com.google.android.datatransport.cct.f;

import com.google.android.datatransport.cct.f.l;
import java.util.Arrays;

final class f extends l {
    private final long a;
    private final Integer b;
    private final long c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f2260d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2261e;

    /* renamed from: f  reason: collision with root package name */
    private final long f2262f;

    /* renamed from: g  reason: collision with root package name */
    private final o f2263g;

    static final class b extends l.a {
        private Long a;
        private Integer b;
        private Long c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f2264d;

        /* renamed from: e  reason: collision with root package name */
        private String f2265e;

        /* renamed from: f  reason: collision with root package name */
        private Long f2266f;

        /* renamed from: g  reason: collision with root package name */
        private o f2267g;

        b() {
        }

        public l a() {
            String str = "";
            if (this.a == null) {
                str = str + " eventTimeMs";
            }
            if (this.c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f2266f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.a.longValue(), this.b, this.c.longValue(), this.f2264d, this.f2265e, this.f2266f.longValue(), this.f2267g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public l.a b(Integer num) {
            this.b = num;
            return this;
        }

        public l.a c(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        public l.a d(long j2) {
            this.c = Long.valueOf(j2);
            return this;
        }

        public l.a e(o oVar) {
            this.f2267g = oVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public l.a f(byte[] bArr) {
            this.f2264d = bArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        public l.a g(String str) {
            this.f2265e = str;
            return this;
        }

        public l.a h(long j2) {
            this.f2266f = Long.valueOf(j2);
            return this;
        }
    }

    private f(long j2, Integer num, long j3, byte[] bArr, String str, long j4, o oVar) {
        this.a = j2;
        this.b = num;
        this.c = j3;
        this.f2260d = bArr;
        this.f2261e = str;
        this.f2262f = j4;
        this.f2263g = oVar;
    }

    public Integer b() {
        return this.b;
    }

    public long c() {
        return this.a;
    }

    public long d() {
        return this.c;
    }

    public o e() {
        return this.f2263g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a == lVar.c() && ((num = this.b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.c == lVar.d()) {
            if (Arrays.equals(this.f2260d, lVar instanceof f ? ((f) lVar).f2260d : lVar.f()) && ((str = this.f2261e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f2262f == lVar.h()) {
                o oVar = this.f2263g;
                o e2 = lVar.e();
                if (oVar == null) {
                    if (e2 == null) {
                        return true;
                    }
                } else if (oVar.equals(e2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public byte[] f() {
        return this.f2260d;
    }

    public String g() {
        return this.f2261e;
    }

    public long h() {
        return this.f2262f;
    }

    public int hashCode() {
        long j2 = this.a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int i3 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j3 = this.c;
        int hashCode2 = (((((i2 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f2260d)) * 1000003;
        String str = this.f2261e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j4 = this.f2262f;
        int i4 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        o oVar = this.f2263g;
        if (oVar != null) {
            i3 = oVar.hashCode();
        }
        return i4 ^ i3;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.f2260d) + ", sourceExtensionJsonProto3=" + this.f2261e + ", timezoneOffsetSeconds=" + this.f2262f + ", networkConnectionInfo=" + this.f2263g + "}";
    }
}
