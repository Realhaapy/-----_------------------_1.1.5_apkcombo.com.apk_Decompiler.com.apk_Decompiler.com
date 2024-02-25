package com.google.firebase.o.j;

import com.google.firebase.o.b;
import com.google.firebase.o.c;
import com.google.firebase.o.g;

class i implements g {
    private boolean a = false;
    private boolean b = false;
    private c c;

    /* renamed from: d  reason: collision with root package name */
    private final g f2873d;

    i(g gVar) {
        this.f2873d = gVar;
    }

    private void a() {
        if (!this.a) {
            this.a = true;
            return;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }

    /* access modifiers changed from: package-private */
    public void b(c cVar, boolean z) {
        this.a = false;
        this.c = cVar;
        this.b = z;
    }

    public g c(String str) {
        a();
        this.f2873d.f(this.c, str, this.b);
        return this;
    }

    public g d(boolean z) {
        a();
        this.f2873d.k(this.c, z, this.b);
        return this;
    }
}
