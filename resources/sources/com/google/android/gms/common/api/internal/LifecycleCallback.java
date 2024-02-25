package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {

    /* renamed from: e  reason: collision with root package name */
    protected final g f2398e;

    protected LifecycleCallback(g gVar) {
        this.f2398e = gVar;
    }

    public static g c(Activity activity) {
        return d(new f(activity));
    }

    protected static g d(f fVar) {
        if (fVar.d()) {
            return k1.f(fVar.b());
        }
        if (fVar.c()) {
            return i1.f(fVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static g getChimeraLifecycleFragmentImpl(f fVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity c = this.f2398e.c();
        n.h(c);
        return c;
    }

    public void e(int i2, int i3, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
