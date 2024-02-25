package com.facebook.y0.u0;

import org.json.JSONObject;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ JSONObject f2164e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f2165f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j f2166g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f2167h;

    public /* synthetic */ d(JSONObject jSONObject, String str, j jVar, String str2) {
        this.f2164e = jSONObject;
        this.f2165f = str;
        this.f2166g = jVar;
        this.f2167h = str2;
    }

    public final void run() {
        j.d(this.f2164e, this.f2165f, this.f2166g, this.f2167h);
    }
}
