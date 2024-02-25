package com.facebook.internal;

import com.facebook.g0;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import m.y.d.l;

public final class h0<T> {
    private T a;
    private CountDownLatch b = new CountDownLatch(1);

    public h0(Callable<T> callable) {
        l.d(callable, "callable");
        g0 g0Var = g0.a;
        g0.k().execute(new FutureTask(new i(this, callable)));
    }

    /* access modifiers changed from: private */
    public static final Void a(h0 h0Var, Callable callable) {
        l.d(h0Var, "this$0");
        l.d(callable, "$callable");
        try {
            h0Var.a = callable.call();
        } finally {
            CountDownLatch countDownLatch = h0Var.b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
