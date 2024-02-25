package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.facebook.common.c;
import com.facebook.internal.j0;
import com.facebook.internal.o0;
import com.facebook.internal.s0.n.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import m.y.d.l;

public class FacebookActivity extends e {

    /* renamed from: f  reason: collision with root package name */
    private static final String f1350f;

    /* renamed from: e  reason: collision with root package name */
    private Fragment f1351e;

    static {
        String name = FacebookActivity.class.getName();
        l.c(name, "FacebookActivity::class.java.name");
        f1350f = name;
    }

    private final void g() {
        Intent intent = getIntent();
        j0 j0Var = j0.a;
        l.c(intent, "requestIntent");
        c0 p2 = j0.p(j0.t(intent));
        Intent intent2 = getIntent();
        l.c(intent2, "intent");
        setResult(0, j0.l(intent2, (Bundle) null, p2));
        finish();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (!a.d(this)) {
            try {
                l.d(str, "prefix");
                l.d(printWriter, "writer");
                com.facebook.internal.t0.a.a a = com.facebook.internal.t0.a.a.a.a();
                if (!l.a(a == null ? null : Boolean.valueOf(a.a(str, printWriter, strArr)), Boolean.TRUE)) {
                    super.dump(str, fileDescriptor, printWriter, strArr);
                }
            } catch (Throwable th) {
                a.b(th, this);
            }
        }
    }

    public final Fragment e() {
        return this.f1351e;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [androidx.fragment.app.d, com.facebook.internal.w, androidx.fragment.app.Fragment] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.fragment.app.Fragment f() {
        /*
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            androidx.fragment.app.n r1 = r4.getSupportFragmentManager()
            java.lang.String r2 = "supportFragmentManager"
            m.y.d.l.c(r1, r2)
            java.lang.String r2 = "SingleFragment"
            androidx.fragment.app.Fragment r3 = r1.i0(r2)
            if (r3 != 0) goto L_0x0043
            java.lang.String r0 = r0.getAction()
            java.lang.String r3 = "FacebookDialogFragment"
            boolean r0 = m.y.d.l.a(r3, r0)
            r3 = 1
            if (r0 == 0) goto L_0x002e
            com.facebook.internal.w r0 = new com.facebook.internal.w
            r0.<init>()
            r0.setRetainInstance(r3)
            r0.p(r1, r2)
            goto L_0x0042
        L_0x002e:
            com.facebook.login.y r0 = new com.facebook.login.y
            r0.<init>()
            r0.setRetainInstance(r3)
            androidx.fragment.app.w r1 = r1.m()
            int r3 = com.facebook.common.b.com_facebook_fragment_container
            r1.b(r3, r0, r2)
            r1.f()
        L_0x0042:
            r3 = r0
        L_0x0043:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookActivity.f():androidx.fragment.app.Fragment");
    }

    public void onConfigurationChanged(Configuration configuration) {
        l.d(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.f1351e;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        g0 g0Var = g0.a;
        if (!g0.v()) {
            o0 o0Var = o0.a;
            o0.e0(f1350f, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            l.c(applicationContext, "applicationContext");
            g0.L(applicationContext);
        }
        setContentView(c.com_facebook_activity_layout);
        if (l.a("PassThrough", intent.getAction())) {
            g();
        } else {
            this.f1351e = f();
        }
    }
}
