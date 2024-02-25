package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.k0;
import com.facebook.login.x;
import m.y.d.l;

public final class s extends k0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(Context context, x.e eVar) {
        super(context, 65536, 65537, 20121101, eVar.a(), eVar.m());
        l.d(context, "context");
        l.d(eVar, "request");
    }

    /* access modifiers changed from: protected */
    public void e(Bundle bundle) {
        l.d(bundle, "data");
    }
}
