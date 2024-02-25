package com.facebook.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.g0;
import com.facebook.login.o;
import e.c.b.d;
import m.y.d.g;
import m.y.d.l;

public class u {
    public static final a b = new a((g) null);
    private Uri a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public Uri a(String str, Bundle bundle) {
            l.d(str, "action");
            o0 o0Var = o0.a;
            m0 m0Var = m0.a;
            String b = m0.b();
            StringBuilder sb = new StringBuilder();
            g0 g0Var = g0.a;
            sb.append(g0.m());
            sb.append("/dialog/");
            sb.append(str);
            return o0.e(b, sb.toString(), bundle);
        }
    }

    public u(String str, Bundle bundle) {
        l.d(str, "action");
        this.a = b.a(str, bundle == null ? new Bundle() : bundle);
    }

    public final boolean a(Activity activity, String str) {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return false;
        }
        try {
            l.d(activity, "activity");
            d a2 = new d.a(o.b.b()).a();
            a2.a.setPackage(str);
            try {
                a2.a(activity, this.a);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void b(Uri uri) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                l.d(uri, "<set-?>");
                this.a = uri;
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }
}
