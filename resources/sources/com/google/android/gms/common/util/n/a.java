package com.google.android.gms.common.util.n;

import com.google.android.gms.common.internal.n;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class a implements ThreadFactory {
    private final String a;
    private final ThreadFactory b = Executors.defaultThreadFactory();

    public a(String str) {
        n.i(str, "Name must not be null");
        this.a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.b.newThread(new b(runnable, 0));
        newThread.setName(this.a);
        return newThread;
    }
}
