package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.q.d;
import com.google.firebase.installations.s.a;
import com.google.firebase.installations.s.b;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class o {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    private static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    private static o f2655d;
    private final a a;

    private o(a aVar) {
        this.a = aVar;
    }

    public static o c() {
        return d(b.b());
    }

    public static o d(a aVar) {
        if (f2655d == null) {
            f2655d = new o(aVar);
        }
        return f2655d;
    }

    static boolean g(String str) {
        return c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + b;
    }
}
