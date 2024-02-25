package com.google.android.datatransport.cct;

import f.e.a.a.b;
import f.e.a.a.i.h;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class c implements h {
    static final String c = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d  reason: collision with root package name */
    static final String f2214d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f2215e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set<b> f2216f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new b[]{b.b("proto"), b.b("json")})));

    /* renamed from: g  reason: collision with root package name */
    public static final c f2217g;
    private final String a;
    private final String b;

    static {
        String a2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f2214d = a2;
        String a3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f2215e = a3;
        f2217g = new c(a2, a3);
    }

    public c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static c e(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new c(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public Set<b> a() {
        return f2216f;
    }

    public String b() {
        return "cct";
    }

    public byte[] c() {
        return d();
    }

    public byte[] d() {
        String str = this.b;
        if (str == null && this.a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.a;
    }
}
