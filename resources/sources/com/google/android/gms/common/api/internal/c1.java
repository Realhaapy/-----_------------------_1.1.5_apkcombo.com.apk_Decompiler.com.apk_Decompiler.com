package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.n;

final class c1 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final a1 f2407e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ d1 f2408f;

    c1(d1 d1Var, a1 a1Var) {
        this.f2408f = d1Var;
        this.f2407e = a1Var;
    }

    public final void run() {
        if (this.f2408f.f2412f) {
            a b = this.f2407e.b();
            if (b.e()) {
                d1 d1Var = this.f2408f;
                g gVar = d1Var.f2398e;
                Activity b2 = d1Var.b();
                PendingIntent d2 = b.d();
                n.h(d2);
                gVar.startActivityForResult(GoogleApiActivity.a(b2, d2, this.f2407e.a(), false), 1);
                return;
            }
            d1 d1Var2 = this.f2408f;
            if (d1Var2.f2415i.a(d1Var2.b(), b.b(), (String) null) != null) {
                d1 d1Var3 = this.f2408f;
                d1Var3.f2415i.t(d1Var3.b(), this.f2408f.f2398e, b.b(), 2, this.f2408f);
            } else if (b.b() == 18) {
                d1 d1Var4 = this.f2408f;
                Dialog o2 = d1Var4.f2415i.o(d1Var4.b(), this.f2408f);
                d1 d1Var5 = this.f2408f;
                d1Var5.f2415i.p(d1Var5.b().getApplicationContext(), new b1(this, o2));
            } else {
                this.f2408f.l(b, this.f2407e.a());
            }
        }
    }
}
