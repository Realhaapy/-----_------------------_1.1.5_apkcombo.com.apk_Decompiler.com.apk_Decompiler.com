package com.facebook.login;

import m.y.d.g;
import m.y.d.l;

public enum c0 {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");
    

    /* renamed from: f  reason: collision with root package name */
    public static final a f1582f = null;

    /* renamed from: e  reason: collision with root package name */
    private final String f1586e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final c0 a(String str) {
            c0[] values = c0.values();
            int length = values.length;
            int i2 = 0;
            while (i2 < length) {
                c0 c0Var = values[i2];
                i2++;
                if (l.a(c0Var.toString(), str)) {
                    return c0Var;
                }
            }
            return c0.FACEBOOK;
        }
    }

    static {
        f1582f = new a((g) null);
    }

    private c0(String str) {
        this.f1586e = str;
    }

    public String toString() {
        return this.f1586e;
    }
}
