package com.android.billingclient.api;

import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class m1 implements Callable {
    public final /* synthetic */ e a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ t f1303d;

    public /* synthetic */ m1(e eVar, String str, List list, String str2, t tVar) {
        this.a = eVar;
        this.b = str;
        this.c = list;
        this.f1303d = tVar;
    }

    public final Object call() {
        this.a.N(this.b, this.c, (String) null, this.f1303d);
        return null;
    }
}
