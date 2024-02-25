package com.facebook.internal;

import com.facebook.g0;
import java.util.Arrays;
import java.util.Collection;
import m.y.d.l;
import m.y.d.s;

public final class m0 {
    public static final m0 a = new m0();

    static {
        l.c(m0.class.getName(), "ServerProtocol::class.java.name");
    }

    private m0() {
    }

    public static final String a() {
        return "v14.0";
    }

    public static final String b() {
        s sVar = s.a;
        g0 g0Var = g0.a;
        String format = String.format("m.%s", Arrays.copyOf(new Object[]{g0.l()}, 1));
        l.c(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String c() {
        return "CONNECTION_FAILURE";
    }

    public static final Collection<String> d() {
        return j.g("service_disabled", "AndroidAuthKillSwitchException");
    }

    public static final Collection<String> e() {
        return j.g("access_denied", "OAuthAccessDeniedException");
    }

    public static final String f() {
        s sVar = s.a;
        g0 g0Var = g0.a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{g0.l()}, 1));
        l.c(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String g() {
        s sVar = s.a;
        g0 g0Var = g0.a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{g0.n()}, 1));
        l.c(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String h(String str) {
        l.d(str, "subdomain");
        s sVar = s.a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{str}, 1));
        l.c(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String i() {
        s sVar = s.a;
        g0 g0Var = g0.a;
        String format = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{g0.n()}, 1));
        l.c(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String j() {
        s sVar = s.a;
        g0 g0Var = g0.a;
        String format = String.format("m.%s", Arrays.copyOf(new Object[]{g0.o()}, 1));
        l.c(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
