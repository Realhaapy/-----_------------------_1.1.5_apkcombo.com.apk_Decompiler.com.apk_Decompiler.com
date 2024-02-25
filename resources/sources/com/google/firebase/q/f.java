package com.google.firebase.q;

import java.util.List;
import java.util.Objects;

final class f extends m {
    private final String a;
    private final List<String> b;

    f(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.b = list;
    }

    public List<String> b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a.equals(mVar.c()) && this.b.equals(mVar.b());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
