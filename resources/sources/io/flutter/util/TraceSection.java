package io.flutter.util;

import e.a.j;
import e.p.a;

public final class TraceSection {
    public static void begin(String str) {
        if (str.length() >= 124) {
            str = str.substring(0, j.G0) + "...";
        }
        a.a(str);
    }

    public static void end() {
        a.b();
    }
}
