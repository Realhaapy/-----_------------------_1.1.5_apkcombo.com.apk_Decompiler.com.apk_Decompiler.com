package com.android.billingclient.api;

import android.os.Bundle;
import java.util.concurrent.Callable;

public final /* synthetic */ class w implements Callable {
    public final /* synthetic */ e a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f1327d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g f1328e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Bundle f1329f;

    public /* synthetic */ w(e eVar, int i2, String str, String str2, g gVar, Bundle bundle) {
        this.a = eVar;
        this.b = i2;
        this.c = str;
        this.f1327d = str2;
        this.f1328e = gVar;
        this.f1329f = bundle;
    }

    public final Object call() {
        return this.a.D(this.b, this.c, this.f1327d, this.f1328e, this.f1329f);
    }
}
