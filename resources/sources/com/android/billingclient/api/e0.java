package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class e0 implements ThreadFactory {
    private final ThreadFactory a = Executors.defaultThreadFactory();
    private final AtomicInteger b = new AtomicInteger(1);

    e0(e eVar) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        int andIncrement = this.b.getAndIncrement();
        newThread.setName("PlayBillingLibrary-" + andIncrement);
        return newThread;
    }
}
