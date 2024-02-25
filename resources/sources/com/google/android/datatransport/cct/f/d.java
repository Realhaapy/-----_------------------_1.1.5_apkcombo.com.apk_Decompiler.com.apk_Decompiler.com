package com.google.android.datatransport.cct.f;

import java.util.List;
import java.util.Objects;

final class d extends j {
    private final List<m> a;

    d(List<m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.a = list;
    }

    public List<m> c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
