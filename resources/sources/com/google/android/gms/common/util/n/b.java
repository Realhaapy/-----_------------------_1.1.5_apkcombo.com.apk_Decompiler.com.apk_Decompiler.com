package com.google.android.gms.common.util.n;

import android.os.Process;

final class b implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f2602e;

    public b(Runnable runnable, int i2) {
        this.f2602e = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f2602e.run();
    }
}
