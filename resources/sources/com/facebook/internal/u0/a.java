package com.facebook.internal.u0;

import java.net.URL;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import m.y.d.p;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ URL f1536e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p f1537f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f1538g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ReentrantLock f1539h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Condition f1540i;

    public /* synthetic */ a(URL url, p pVar, String str, ReentrantLock reentrantLock, Condition condition) {
        this.f1536e = url;
        this.f1537f = pVar;
        this.f1538g = str;
        this.f1539h = reentrantLock;
        this.f1540i = condition;
    }

    public final void run() {
        c.c(this.f1536e, this.f1537f, this.f1538g, this.f1539h, this.f1540i);
    }
}
