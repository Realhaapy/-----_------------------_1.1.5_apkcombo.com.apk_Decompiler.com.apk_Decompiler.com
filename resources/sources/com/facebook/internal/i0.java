package com.facebook.internal;

import android.util.Log;
import com.facebook.g0;
import com.facebook.p0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import m.y.d.g;
import m.y.d.l;
import m.y.d.s;

public final class i0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f1448e = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap<String, String> f1449f = new HashMap<>();
    private final p0 a;
    private final String b;
    private StringBuilder c;

    /* renamed from: d  reason: collision with root package name */
    private int f1450d = 3;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final synchronized String f(String str) {
            String str2;
            str2 = str;
            for (Map.Entry entry : i0.f1449f.entrySet()) {
                str2 = p.r(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
            }
            return str2;
        }

        public final void a(p0 p0Var, int i2, String str, String str2) {
            l.d(p0Var, "behavior");
            l.d(str, "tag");
            l.d(str2, "string");
            g0 g0Var = g0.a;
            if (g0.x(p0Var)) {
                String f2 = f(str2);
                if (!p.t(str, "FacebookSDK.", false, 2, (Object) null)) {
                    str = l.j("FacebookSDK.", str);
                }
                Log.println(i2, str, f2);
                if (p0Var == p0.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        public final void b(p0 p0Var, String str, String str2) {
            l.d(p0Var, "behavior");
            l.d(str, "tag");
            l.d(str2, "string");
            a(p0Var, 3, str, str2);
        }

        public final void c(p0 p0Var, String str, String str2, Object... objArr) {
            l.d(p0Var, "behavior");
            l.d(str, "tag");
            l.d(str2, "format");
            l.d(objArr, "args");
            g0 g0Var = g0.a;
            if (g0.x(p0Var)) {
                s sVar = s.a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                l.c(format, "java.lang.String.format(format, *args)");
                a(p0Var, 3, str, format);
            }
        }

        public final synchronized void d(String str) {
            l.d(str, "accessToken");
            g0 g0Var = g0.a;
            if (!g0.x(p0.INCLUDE_ACCESS_TOKENS)) {
                e(str, "ACCESS_TOKEN_REMOVED");
            }
        }

        public final synchronized void e(String str, String str2) {
            l.d(str, "original");
            l.d(str2, "replace");
            i0.f1449f.put(str, str2);
        }
    }

    public i0(p0 p0Var, String str) {
        l.d(p0Var, "behavior");
        l.d(str, "tag");
        this.a = p0Var;
        p0 p0Var2 = p0.a;
        p0.k(str, "tag");
        this.b = l.j("FacebookSDK.", str);
        this.c = new StringBuilder();
    }

    private final boolean g() {
        g0 g0Var = g0.a;
        return g0.x(this.a);
    }

    public final void b(String str) {
        l.d(str, "string");
        if (g()) {
            this.c.append(str);
        }
    }

    public final void c(String str, Object... objArr) {
        l.d(str, "format");
        l.d(objArr, "args");
        if (g()) {
            StringBuilder sb = this.c;
            s sVar = s.a;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            l.c(format, "java.lang.String.format(format, *args)");
            sb.append(format);
        }
    }

    public final void d(String str, Object obj) {
        l.d(str, "key");
        l.d(obj, "value");
        c("  %s:\t%s\n", str, obj);
    }

    public final void e() {
        String sb = this.c.toString();
        l.c(sb, "contents.toString()");
        f(sb);
        this.c = new StringBuilder();
    }

    public final void f(String str) {
        l.d(str, "string");
        f1448e.a(this.a, this.f1450d, this.b, str);
    }
}
