package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.c;
import e.f.j.a;
import e.f.q.d;

public abstract class k<E> extends g {

    /* renamed from: e  reason: collision with root package name */
    private final Activity f1061e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f1062f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f1063g;

    /* renamed from: h  reason: collision with root package name */
    final n f1064h;

    k(Activity activity, Context context, Handler handler, int i2) {
        this.f1064h = new o();
        this.f1061e = activity;
        d.e(context, "context == null");
        this.f1062f = context;
        d.e(handler, "handler == null");
        this.f1063g = handler;
    }

    k(e eVar) {
        this(eVar, eVar, new Handler(), 0);
    }

    public View c(int i2) {
        return null;
    }

    public boolean d() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public Activity e() {
        return this.f1061e;
    }

    /* access modifiers changed from: package-private */
    public Context f() {
        return this.f1062f;
    }

    /* access modifiers changed from: package-private */
    public Handler g() {
        return this.f1063g;
    }

    public abstract E h();

    public LayoutInflater i() {
        return LayoutInflater.from(this.f1062f);
    }

    @Deprecated
    public void j(Fragment fragment, String[] strArr, int i2) {
    }

    public boolean k(Fragment fragment) {
        return true;
    }

    public boolean l(String str) {
        return false;
    }

    public void m(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (i2 == -1) {
            a.l(this.f1062f, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    public void n(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (i2 == -1) {
            c.x(this.f1061e, intentSender, i2, intent, i3, i4, i5, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }

    public void o() {
    }
}
