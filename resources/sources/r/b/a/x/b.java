package r.b.a.x;

import r.b.a.d;

public enum b implements l {
    NANOS("Nanos", d.g(1)),
    MICROS("Micros", d.g(1000)),
    MILLIS("Millis", d.g(1000000)),
    SECONDS("Seconds", d.h(1)),
    MINUTES("Minutes", d.h(60)),
    HOURS("Hours", d.h(3600)),
    HALF_DAYS("HalfDays", d.h(43200)),
    DAYS("Days", d.h(86400)),
    WEEKS("Weeks", d.h(604800)),
    MONTHS("Months", d.h(2629746)),
    YEARS("Years", d.h(31556952)),
    DECADES("Decades", d.h(315569520)),
    CENTURIES("Centuries", d.h(3155695200L)),
    MILLENNIA("Millennia", d.h(31556952000L)),
    ERAS("Eras", d.h(31556952000000000L)),
    FOREVER("Forever", d.j(Long.MAX_VALUE, 999999999));
    

    /* renamed from: e  reason: collision with root package name */
    private final String f5774e;

    private b(String str, d dVar) {
        this.f5774e = str;
    }

    public boolean a() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    public <R extends d> R c(R r2, long j2) {
        return r2.s(j2, this);
    }

    public String toString() {
        return this.f5774e;
    }
}
