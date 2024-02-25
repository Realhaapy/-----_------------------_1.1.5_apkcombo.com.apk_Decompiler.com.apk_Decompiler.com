package kotlinx.coroutines.j2;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.h0;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.internal.u;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.o0;
import m.s;
import m.y.c.l;

public class m<E> extends a<E> {

    /* renamed from: d  reason: collision with root package name */
    private final ReentrantLock f4852d = new ReentrantLock();

    /* renamed from: e  reason: collision with root package name */
    private Object f4853e = b.a;

    public m(l<? super E, s> lVar) {
        super(lVar);
    }

    private final h0 x(Object obj) {
        l<E, s> lVar;
        Object obj2 = this.f4853e;
        h0 h0Var = null;
        if (!(obj2 == b.a || (lVar = this.b) == null)) {
            h0Var = u.d(lVar, obj2, (h0) null, 2, (Object) null);
        }
        this.f4853e = obj;
        return h0Var;
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "(value=" + this.f4853e + ')';
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public Object i(E e2) {
        q l2;
        z e3;
        ReentrantLock reentrantLock = this.f4852d;
        reentrantLock.lock();
        try {
            j<?> d2 = d();
            if (d2 == null) {
                if (this.f4853e == b.a) {
                    do {
                        l2 = l();
                        if (l2 != null) {
                            if (l2 instanceof j) {
                                reentrantLock.unlock();
                                return l2;
                            }
                            e3 = l2.e(e2, (o.c) null);
                        }
                    } while (e3 == null);
                    if (o0.a()) {
                        if (!(e3 == kotlinx.coroutines.o.a)) {
                            throw new AssertionError();
                        }
                    }
                    s sVar = s.a;
                    reentrantLock.unlock();
                    l2.b(e2);
                    return l2.d();
                }
                h0 x = x(e2);
                if (x == null) {
                    z zVar = b.b;
                    reentrantLock.unlock();
                    return zVar;
                }
                throw x;
            }
            reentrantLock.unlock();
            return d2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public boolean q(o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f4852d;
        reentrantLock.lock();
        try {
            return super.q(oVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return this.f4853e == b.a;
    }

    /* access modifiers changed from: protected */
    public Object v() {
        ReentrantLock reentrantLock = this.f4852d;
        reentrantLock.lock();
        try {
            Object obj = this.f4853e;
            z zVar = b.a;
            if (obj == zVar) {
                Object d2 = d();
                if (d2 == null) {
                    d2 = b.f4840d;
                }
                return d2;
            }
            this.f4853e = zVar;
            s sVar = s.a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
