package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public final class d1 {

    /* renamed from: f  reason: collision with root package name */
    private static final Uri f2525f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    private final String a;
    private final String b;
    private final ComponentName c = null;

    /* renamed from: d  reason: collision with root package name */
    private final int f2526d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f2527e;

    public d1(String str, String str2, int i2, boolean z) {
        n.d(str);
        this.a = str;
        n.d(str2);
        this.b = str2;
        this.f2526d = i2;
        this.f2527e = z;
    }

    public final int a() {
        return this.f2526d;
    }

    public final ComponentName b() {
        return this.c;
    }

    public final Intent c(Context context) {
        Bundle bundle;
        if (this.a == null) {
            return new Intent().setComponent(this.c);
        }
        Intent intent = null;
        if (this.f2527e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.a);
            try {
                bundle = context.getContentResolver().call(f2525f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e2) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e2.toString()));
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                String valueOf = String.valueOf(this.a);
                Log.w("ConnectionStatusConfig", valueOf.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(valueOf) : new String("Dynamic lookup for intent failed for action: "));
            }
        }
        return intent != null ? intent : new Intent(this.a).setPackage(this.b);
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return m.a(this.a, d1Var.a) && m.a(this.b, d1Var.b) && m.a(this.c, d1Var.c) && this.f2526d == d1Var.f2526d && this.f2527e == d1Var.f2527e;
    }

    public final int hashCode() {
        return m.b(this.a, this.b, this.c, Integer.valueOf(this.f2526d), Boolean.valueOf(this.f2527e));
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        n.h(this.c);
        return this.c.flattenToString();
    }
}
