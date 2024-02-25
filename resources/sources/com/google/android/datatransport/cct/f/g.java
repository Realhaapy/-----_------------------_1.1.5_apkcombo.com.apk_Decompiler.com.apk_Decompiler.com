package com.google.android.datatransport.cct.f;

import com.google.android.datatransport.cct.f.m;
import java.util.List;

final class g extends m {
    private final long a;
    private final long b;
    private final k c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f2268d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2269e;

    /* renamed from: f  reason: collision with root package name */
    private final List<l> f2270f;

    /* renamed from: g  reason: collision with root package name */
    private final p f2271g;

    static final class b extends m.a {
        private Long a;
        private Long b;
        private k c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f2272d;

        /* renamed from: e  reason: collision with root package name */
        private String f2273e;

        /* renamed from: f  reason: collision with root package name */
        private List<l> f2274f;

        /* renamed from: g  reason: collision with root package name */
        private p f2275g;

        b() {
        }

        public m a() {
            String str = "";
            if (this.a == null) {
                str = str + " requestTimeMs";
            }
            if (this.b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.a.longValue(), this.b.longValue(), this.c, this.f2272d, this.f2273e, this.f2274f, this.f2275g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public m.a b(k kVar) {
            this.c = kVar;
            return this;
        }

        public m.a c(List<l> list) {
            this.f2274f = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        public m.a d(Integer num) {
            this.f2272d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        public m.a e(String str) {
            this.f2273e = str;
            return this;
        }

        public m.a f(p pVar) {
            this.f2275g = pVar;
            return this;
        }

        public m.a g(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        public m.a h(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }
    }

    private g(long j2, long j3, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.a = j2;
        this.b = j3;
        this.c = kVar;
        this.f2268d = num;
        this.f2269e = str;
        this.f2270f = list;
        this.f2271g = pVar;
    }

    public k b() {
        return this.c;
    }

    public List<l> c() {
        return this.f2270f;
    }

    public Integer d() {
        return this.f2268d;
    }

    public String e() {
        return this.f2269e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.a == mVar.g() && this.b == mVar.h() && ((kVar = this.c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f2268d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f2269e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f2270f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f2271g;
            p f2 = mVar.f();
            if (pVar == null) {
                if (f2 == null) {
                    return true;
                }
            } else if (pVar.equals(f2)) {
                return true;
            }
        }
        return false;
    }

    public p f() {
        return this.f2271g;
    }

    public long g() {
        return this.a;
    }

    public long h() {
        return this.b;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        k kVar = this.c;
        int i3 = 0;
        int hashCode = (i2 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f2268d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f2269e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f2270f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f2271g;
        if (pVar != null) {
            i3 = pVar.hashCode();
        }
        return hashCode4 ^ i3;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.f2268d + ", logSourceName=" + this.f2269e + ", logEvents=" + this.f2270f + ", qosTier=" + this.f2271g + "}";
    }
}
