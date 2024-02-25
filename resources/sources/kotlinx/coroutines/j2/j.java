package kotlinx.coroutines.j2;

import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.p0;

public final class j<E> extends s implements q<E> {

    /* renamed from: h  reason: collision with root package name */
    public final Throwable f4851h;

    public j<E> B() {
        return this;
    }

    public j<E> C() {
        return this;
    }

    public final Throwable D() {
        Throwable th = this.f4851h;
        return th == null ? new k("Channel was closed") : th;
    }

    public final Throwable E() {
        Throwable th = this.f4851h;
        return th == null ? new l("Channel was closed") : th;
    }

    public void b(E e2) {
    }

    public /* bridge */ /* synthetic */ Object d() {
        B();
        return this;
    }

    public z e(E e2, o.c cVar) {
        z zVar = kotlinx.coroutines.o.a;
        if (cVar == null) {
            return zVar;
        }
        cVar.d();
        throw null;
    }

    public String toString() {
        return "Closed@" + p0.b(this) + '[' + this.f4851h + ']';
    }

    public void x() {
    }

    public /* bridge */ /* synthetic */ Object y() {
        C();
        return this;
    }

    public z z(o.c cVar) {
        z zVar = kotlinx.coroutines.o.a;
        if (cVar == null) {
            return zVar;
        }
        cVar.d();
        throw null;
    }
}
