package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.e;
import androidx.lifecycle.i;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.b;
import androidx.savedstate.c;

class a0 implements c, v {

    /* renamed from: e  reason: collision with root package name */
    private final u f971e;

    /* renamed from: f  reason: collision with root package name */
    private i f972f = null;

    /* renamed from: g  reason: collision with root package name */
    private b f973g = null;

    a0(Fragment fragment, u uVar) {
        this.f971e = uVar;
    }

    /* access modifiers changed from: package-private */
    public void a(e.b bVar) {
        this.f972f.h(bVar);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f972f == null) {
            this.f972f = new i(this);
            this.f973g = b.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f972f != null;
    }

    /* access modifiers changed from: package-private */
    public void d(Bundle bundle) {
        this.f973g.c(bundle);
    }

    /* access modifiers changed from: package-private */
    public void e(Bundle bundle) {
        this.f973g.d(bundle);
    }

    /* access modifiers changed from: package-private */
    public void f(e.c cVar) {
        this.f972f.o(cVar);
    }

    public e getLifecycle() {
        b();
        return this.f972f;
    }

    public SavedStateRegistry getSavedStateRegistry() {
        b();
        return this.f973g.b();
    }

    public u getViewModelStore() {
        b();
        return this.f971e;
    }
}
