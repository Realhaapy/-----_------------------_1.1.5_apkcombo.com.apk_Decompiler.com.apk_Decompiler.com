package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.g;
import java.util.Objects;

final class b extends g {
    private final g.a a;
    private final long b;

    b(g.a aVar, long j2) {
        Objects.requireNonNull(aVar, "Null status");
        this.a = aVar;
        this.b = j2;
    }

    public long b() {
        return this.b;
    }

    public g.a c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.c()) && this.b == gVar.b();
    }

    public int hashCode() {
        long j2 = this.b;
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.a + ", nextRequestWaitMillis=" + this.b + "}";
    }
}
