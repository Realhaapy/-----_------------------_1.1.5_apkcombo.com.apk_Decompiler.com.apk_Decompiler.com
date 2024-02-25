package com.facebook.internal;

import com.facebook.internal.q0;
import com.facebook.j0;
import com.facebook.m0;
import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class o implements j0.b {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ int b;
    public final /* synthetic */ q0.f c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f1471d;

    public /* synthetic */ o(String[] strArr, int i2, q0.f fVar, CountDownLatch countDownLatch) {
        this.a = strArr;
        this.b = i2;
        this.c = fVar;
        this.f1471d = countDownLatch;
    }

    public final void a(m0 m0Var) {
        q0.f.b(this.a, this.b, this.c, this.f1471d, m0Var);
    }
}
