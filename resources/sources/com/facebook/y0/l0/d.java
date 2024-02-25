package com.facebook.y0.l0;

import m.y.d.g;
import m.y.d.l;

public enum d {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;
    

    /* renamed from: e  reason: collision with root package name */
    public static final a f1865e = null;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final d a(String str) {
            l.d(str, "rawValue");
            return l.a(str, "MOBILE_APP_INSTALL") ? d.MOBILE_APP_INSTALL : l.a(str, "CUSTOM_APP_EVENTS") ? d.CUSTOM : d.OTHER;
        }
    }

    static {
        f1865e = new a((g) null);
    }
}
