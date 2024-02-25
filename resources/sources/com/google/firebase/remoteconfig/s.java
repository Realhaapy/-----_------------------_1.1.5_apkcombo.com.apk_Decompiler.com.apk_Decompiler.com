package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.internal.l;

public class s {
    private final long a;
    private final long b;

    public static class b {
        /* access modifiers changed from: private */
        public long a = 60;
        /* access modifiers changed from: private */
        public long b = l.f2899j;

        public s c() {
            return new s(this);
        }

        public b d(long j2) {
            if (j2 >= 0) {
                this.a = j2;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", new Object[]{Long.valueOf(j2)}));
        }

        public b e(long j2) {
            if (j2 >= 0) {
                this.b = j2;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j2 + " is an invalid argument");
        }
    }

    private s(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }
}
