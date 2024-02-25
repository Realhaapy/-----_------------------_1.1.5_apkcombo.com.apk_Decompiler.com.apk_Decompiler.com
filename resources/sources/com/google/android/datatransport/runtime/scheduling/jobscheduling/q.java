package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.t;
import f.e.a.a.d;
import f.e.a.a.i.c0.a;
import java.util.Map;
import java.util.Objects;

final class q extends t {
    private final a a;
    private final Map<d, t.b> b;

    q(a aVar, Map<d, t.b> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.b = map;
    }

    /* access modifiers changed from: package-private */
    public a e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a.equals(tVar.e()) && this.b.equals(tVar.h());
    }

    /* access modifiers changed from: package-private */
    public Map<d, t.b> h() {
        return this.b;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
