package com.google.firebase.installations.r;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.r.b;

@AutoValue
public abstract class f {

    @AutoValue.Builder
    public static abstract class a {
        public abstract f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j2);
    }

    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        b.C0046b bVar = new b.C0046b();
        bVar.d(0);
        return bVar;
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
