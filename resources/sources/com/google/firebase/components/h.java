package com.google.firebase.components;

import com.google.firebase.p.a;
import com.google.firebase.p.b;
import java.util.Map;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Map.Entry f2611e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f2612f;

    public /* synthetic */ h(Map.Entry entry, a aVar) {
        this.f2611e = entry;
        this.f2612f = aVar;
    }

    public final void run() {
        ((b) this.f2611e.getKey()).a(this.f2612f);
    }
}
