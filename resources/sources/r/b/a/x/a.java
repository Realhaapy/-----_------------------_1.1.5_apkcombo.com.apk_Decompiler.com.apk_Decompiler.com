package r.b.a.x;

import java.util.Map;
import r.b.a.v.i;

public enum a implements i {
    NANO_OF_SECOND("NanoOfSecond", r4, r9, n.i(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", r4, r15, n.i(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", r4, r9, n.i(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", r4, r15, n.i(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", r4, r9, n.i(0, 999)),
    MILLI_OF_DAY("MilliOfDay", r4, r15, n.i(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", r4, r20, n.i(0, 59)),
    SECOND_OF_DAY("SecondOfDay", r4, r15, n.i(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", r4, r25, n.i(0, 59)),
    MINUTE_OF_DAY("MinuteOfDay", r4, r15, n.i(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", r25, r20, n.i(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", r4, r20, n.i(1, 12)),
    HOUR_OF_DAY("HourOfDay", r4, r15, n.i(0, 23)),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", r4, r5, n.i(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", r20, r5, n.i(0, 1)),
    DAY_OF_WEEK("DayOfWeek", r4, r5, n.i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", r4, r5, n.i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", r4, r5, n.i(1, 7)),
    DAY_OF_MONTH("DayOfMonth", r15, r11, n.j(1, 28, 31)),
    DAY_OF_YEAR("DayOfYear", r4, r36, n.j(1, 365, 366)),
    EPOCH_DAY("EpochDay", r4, r38, n.i(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", r4, r11, n.j(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", r4, r5, n.i(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", r4, r5, n.i(1, 12)),
    PROLEPTIC_MONTH("ProlepticMonth", r4, r38, n.i(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", r4, r5, n.j(1, 999999999, 1000000000)),
    YEAR("Year", r4, r5, n.i(-999999999, 999999999)),
    ERA("Era", b.ERAS, r5, n.i(0, 1)),
    INSTANT_SECONDS("InstantSeconds", r4, r5, n.i(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", r4, r5, n.i(-64800, 64800));
    

    /* renamed from: e  reason: collision with root package name */
    private final String f5756e;

    /* renamed from: f  reason: collision with root package name */
    private final l f5757f;

    /* renamed from: g  reason: collision with root package name */
    private final l f5758g;

    /* renamed from: h  reason: collision with root package name */
    private final n f5759h;

    private a(String str, l lVar, l lVar2, n nVar) {
        this.f5756e = str;
        this.f5757f = lVar;
        this.f5758g = lVar2;
        this.f5759h = nVar;
    }

    public boolean a() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public boolean c(e eVar) {
        return eVar.j(this);
    }

    public <R extends d> R d(R r2, long j2) {
        return r2.k(this, j2);
    }

    public long f(e eVar) {
        return eVar.n(this);
    }

    public boolean g() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    public n h(e eVar) {
        return eVar.d(this);
    }

    public e j(Map<i, Long> map, e eVar, i iVar) {
        return null;
    }

    public n k() {
        return this.f5759h;
    }

    public int l(long j2) {
        return k().a(j2, this);
    }

    public long m(long j2) {
        k().b(j2, this);
        return j2;
    }

    public String toString() {
        return this.f5756e;
    }
}
