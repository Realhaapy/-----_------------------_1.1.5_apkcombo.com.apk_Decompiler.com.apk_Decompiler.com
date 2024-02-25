package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.m;
import com.google.firebase.remoteconfig.t;

public class q implements t {
    private final String a;
    private final int b;

    q(String str, int i2) {
        this.a = str;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    public byte[] b() {
        return this.b == 0 ? m.f2911j : this.a.getBytes(m.f2907e);
    }
}
