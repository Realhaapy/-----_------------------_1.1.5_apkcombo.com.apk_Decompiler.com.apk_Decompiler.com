package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class g {

    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static g a() {
        return new b(a.FATAL_ERROR, -1);
    }

    public static g d() {
        return new b(a.INVALID_PAYLOAD, -1);
    }

    public static g e(long j2) {
        return new b(a.OK, j2);
    }

    public static g f() {
        return new b(a.TRANSIENT_ERROR, -1);
    }

    public abstract long b();

    public abstract a c();
}
