package com.google.firebase.installations.r;

import com.google.firebase.installations.o;
import java.util.concurrent.TimeUnit;

class e {

    /* renamed from: d  reason: collision with root package name */
    private static final long f2679d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    private static final long f2680e = TimeUnit.MINUTES.toMillis(30);
    private final o a = o.c();
    private long b;
    private int c;

    e() {
    }

    private synchronized long a(int i2) {
        if (!c(i2)) {
            return f2679d;
        }
        return (long) Math.min(Math.pow(2.0d, (double) this.c) + ((double) this.a.e()), (double) f2680e);
    }

    private static boolean c(int i2) {
        return i2 == 429 || (i2 >= 500 && i2 < 600);
    }

    private static boolean d(int i2) {
        return (i2 >= 200 && i2 < 300) || i2 == 401 || i2 == 404;
    }

    private synchronized void e() {
        this.c = 0;
    }

    public synchronized boolean b() {
        return this.c == 0 || this.a.a() > this.b;
    }

    public synchronized void f(int i2) {
        if (d(i2)) {
            e();
            return;
        }
        this.c++;
        this.b = this.a.a() + a(i2);
    }
}
