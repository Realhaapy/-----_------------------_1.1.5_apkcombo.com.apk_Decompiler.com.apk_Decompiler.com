package f.e.a.a.i.a0.j;

import f.e.a.a.i.a0.j.k0;

final class g0 extends k0 {
    private final long b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3762d;

    /* renamed from: e  reason: collision with root package name */
    private final long f3763e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3764f;

    static final class b extends k0.a {
        private Long a;
        private Integer b;
        private Integer c;

        /* renamed from: d  reason: collision with root package name */
        private Long f3765d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f3766e;

        b() {
        }

        /* access modifiers changed from: package-private */
        public k0 a() {
            String str = "";
            if (this.a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.b == null) {
                str = str + " loadBatchSize";
            }
            if (this.c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f3765d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f3766e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new g0(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.f3765d.longValue(), this.f3766e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public k0.a b(int i2) {
            this.c = Integer.valueOf(i2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public k0.a c(long j2) {
            this.f3765d = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public k0.a d(int i2) {
            this.b = Integer.valueOf(i2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public k0.a e(int i2) {
            this.f3766e = Integer.valueOf(i2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public k0.a f(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }
    }

    private g0(long j2, int i2, int i3, long j3, int i4) {
        this.b = j2;
        this.c = i2;
        this.f3762d = i3;
        this.f3763e = j3;
        this.f3764f = i4;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f3762d;
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.f3763e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f3764f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.b == k0Var.f() && this.c == k0Var.d() && this.f3762d == k0Var.b() && this.f3763e == k0Var.c() && this.f3764f == k0Var.e();
    }

    /* access modifiers changed from: package-private */
    public long f() {
        return this.b;
    }

    public int hashCode() {
        long j2 = this.b;
        long j3 = this.f3763e;
        return this.f3764f ^ ((((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.f3762d) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.b + ", loadBatchSize=" + this.c + ", criticalSectionEnterTimeoutMs=" + this.f3762d + ", eventCleanUpAge=" + this.f3763e + ", maxBlobByteSizePerRow=" + this.f3764f + "}";
    }
}
