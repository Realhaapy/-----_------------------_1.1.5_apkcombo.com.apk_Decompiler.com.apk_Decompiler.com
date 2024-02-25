package com.facebook.internal;

import m.y.d.l;

public final class g0 {
    public static final g0 a = new g0();
    private static volatile String b;

    private g0() {
    }

    public static final String a() {
        return b;
    }

    public static final boolean b() {
        String str = b;
        Boolean bool = null;
        if (str != null) {
            bool = Boolean.valueOf(p.t(str, "Unity.", false, 2, (Object) null));
        }
        return l.a(bool, Boolean.TRUE);
    }
}
