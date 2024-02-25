package com.google.firebase.q;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class d implements ThreadFactory {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    public final Thread newThread(Runnable runnable) {
        return g.j(runnable);
    }
}
