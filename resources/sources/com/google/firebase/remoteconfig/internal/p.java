package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.q;
import com.google.firebase.remoteconfig.s;

public class p implements q {
    private final long a;
    private final int b;
    private final s c;

    public static class b {
        private long a;
        private int b;
        private s c;

        private b() {
        }

        public p a() {
            return new p(this.a, this.b, this.c);
        }

        /* access modifiers changed from: package-private */
        public b b(s sVar) {
            this.c = sVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b c(int i2) {
            this.b = i2;
            return this;
        }

        public b d(long j2) {
            this.a = j2;
            return this;
        }
    }

    private p(long j2, int i2, s sVar) {
        this.a = j2;
        this.b = i2;
        this.c = sVar;
    }

    static b d() {
        return new b();
    }

    public long a() {
        return this.a;
    }

    public s b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }
}
