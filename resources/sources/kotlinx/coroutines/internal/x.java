package kotlinx.coroutines.internal;

import kotlinx.coroutines.c;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.n1;
import kotlinx.coroutines.s;
import m.v.d;
import m.v.j.a.e;
import m.y.c.l;

public class x<T> extends c<T> implements e {

    /* renamed from: g  reason: collision with root package name */
    public final d<T> f4832g;

    /* access modifiers changed from: protected */
    public final boolean T() {
        return true;
    }

    public final e getCallerFrame() {
        d<T> dVar = this.f4832g;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void p(Object obj) {
        h.c(c.b(this.f4832g), c0.a(obj, this.f4832g), (l) null, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void s0(Object obj) {
        d<T> dVar = this.f4832g;
        dVar.resumeWith(c0.a(obj, dVar));
    }

    public final n1 w0() {
        s K = K();
        if (K == null) {
            return null;
        }
        return K.getParent();
    }
}
