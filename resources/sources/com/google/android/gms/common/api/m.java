package com.google.android.gms.common.api;

import com.google.android.gms.common.c;

public final class m extends UnsupportedOperationException {

    /* renamed from: e  reason: collision with root package name */
    private final c f2489e;

    public m(c cVar) {
        this.f2489e = cVar;
    }

    public String getMessage() {
        String valueOf = String.valueOf(this.f2489e);
        String.valueOf(valueOf).length();
        return "Missing ".concat(String.valueOf(valueOf));
    }
}
