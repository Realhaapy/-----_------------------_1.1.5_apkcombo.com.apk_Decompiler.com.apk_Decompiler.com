package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.t;
import java.util.Objects;
import java.util.Set;

final class r extends t.b {
    private final long a;
    private final long b;
    private final Set<t.c> c;

    static final class b extends t.b.a {
        private Long a;
        private Long b;
        private Set<t.c> c;

        b() {
        }

        public t.b a() {
            String str = "";
            if (this.a == null) {
                str = str + " delta";
            }
            if (this.b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new r(this.a.longValue(), this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public t.b.a b(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        public t.b.a c(Set<t.c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.c = set;
            return this;
        }

        public t.b.a d(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }
    }

    private r(long j2, long j3, Set<t.c> set) {
        this.a = j2;
        this.b = j3;
        this.c = set;
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public Set<t.c> c() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t.b)) {
            return false;
        }
        t.b bVar = (t.b) obj;
        return this.a == bVar.b() && this.b == bVar.d() && this.c.equals(bVar.c());
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        return this.c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
