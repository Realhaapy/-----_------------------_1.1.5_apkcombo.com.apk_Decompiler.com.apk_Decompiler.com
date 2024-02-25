package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.n;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class m {
    private final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();
    private final n b;

    private static final class a {
        final n.l a;
        final boolean b;
    }

    m(n nVar) {
        this.b = nVar;
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment w0 = this.b.w0();
        if (w0 != null) {
            w0.getParentFragmentManager().v0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.a(this.b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Fragment fragment, boolean z) {
        Context f2 = this.b.t0().f();
        Fragment w0 = this.b.w0();
        if (w0 != null) {
            w0.getParentFragmentManager().v0().b(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.b(this.b, fragment, f2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment w0 = this.b.w0();
        if (w0 != null) {
            w0.getParentFragmentManager().v0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.c(this.b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Fragment fragment, boolean z) {
        Fragment w0 = this.b.w0();
        if (w0 != null) {
            w0.getParentFragmentManager().v0().d(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.d(this.b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(Fragment fragment, boolean z) {
        Fragment w0 = this.b.w0();
        if (w0 != null) {
            w0.getParentFragmentManager().v0().e(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.e(this.b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment, boolean z) {
        Fragment w0 = this.b.w0();
        if (w0 != null) {
            w0.getParentFragmentManager().v0().f(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.f(this.b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(Fragment fragment, boolean z) {
        Context f2 = this.b.t0().f();
        Fragment w0 = this.b.w0();
        if (w0 != null) {
            w0.getParentFragmentManager().v0().g(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.g(this.b, fragment, f2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment w0 = this.b.w0();
        if (w0 != null) {
            w0.getParentFragmentManager().v0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.h(this.b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i(Fragment fragment, boolean z) {
        Fragment w0 = this.b.w0();
        if (w0 != null) {
            w0.getParentFragmentManager().v0().i(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.i(this.b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment w0 = this.b.w0();
        if (w0 != null) {
            w0.getParentFragmentManager().v0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.j(this.b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k(Fragment fragment, boolean z) {
        Fragment w0 = this.b.w0();
        if (w0 != null) {
            w0.getParentFragmentManager().v0().k(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.k(this.b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l(Fragment fragment, boolean z) {
        Fragment w0 = this.b.w0();
        if (w0 != null) {
            w0.getParentFragmentManager().v0().l(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.l(this.b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment w0 = this.b.w0();
        if (w0 != null) {
            w0.getParentFragmentManager().v0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.m(this.b, fragment, view, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void n(Fragment fragment, boolean z) {
        Fragment w0 = this.b.w0();
        if (w0 != null) {
            w0.getParentFragmentManager().v0().n(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.n(this.b, fragment);
            }
        }
    }
}
