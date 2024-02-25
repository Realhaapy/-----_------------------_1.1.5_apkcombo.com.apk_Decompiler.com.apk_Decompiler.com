package kotlinx.coroutines.j2;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.o0;
import m.k;
import m.s;
import m.y.c.l;

public class d<E> extends a<E> {

    /* renamed from: d  reason: collision with root package name */
    private final int f4842d;

    /* renamed from: e  reason: collision with root package name */
    private final e f4843e;

    /* renamed from: f  reason: collision with root package name */
    private final ReentrantLock f4844f;

    /* renamed from: g  reason: collision with root package name */
    private Object[] f4845g;

    /* renamed from: h  reason: collision with root package name */
    private int f4846h;
    private volatile /* synthetic */ int size;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.values().length];
            iArr[e.SUSPEND.ordinal()] = 1;
            iArr[e.DROP_LATEST.ordinal()] = 2;
            iArr[e.DROP_OLDEST.ordinal()] = 3;
            a = iArr;
        }
    }

    public d(int i2, e eVar, l<? super E, s> lVar) {
        super(lVar);
        this.f4842d = i2;
        this.f4843e = eVar;
        if (i2 < 1 ? false : true) {
            this.f4844f = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i2, 8)];
            e.f(objArr, b.a, 0, 0, 6, (Object) null);
            s sVar = s.a;
            this.f4845g = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i2 + " was specified").toString());
    }

    private final void x(int i2, E e2) {
        if (i2 < this.f4842d) {
            y(i2);
            Object[] objArr = this.f4845g;
            objArr[(this.f4846h + i2) % objArr.length] = e2;
            return;
        }
        if (o0.a()) {
            if (!(this.f4843e == e.DROP_OLDEST)) {
                throw new AssertionError();
            }
        }
        Object[] objArr2 = this.f4845g;
        int i3 = this.f4846h;
        objArr2[i3 % objArr2.length] = null;
        objArr2[(i2 + i3) % objArr2.length] = e2;
        this.f4846h = (i3 + 1) % objArr2.length;
    }

    private final void y(int i2) {
        Object[] objArr = this.f4845g;
        if (i2 >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f4842d);
            Object[] objArr2 = new Object[min];
            if (i2 > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    Object[] objArr3 = this.f4845g;
                    objArr2[i3] = objArr3[(this.f4846h + i3) % objArr3.length];
                    if (i4 >= i2) {
                        break;
                    }
                    i3 = i4;
                }
            }
            e.e(objArr2, b.a, i2, min);
            this.f4845g = objArr2;
            this.f4846h = 0;
        }
    }

    private final z z(int i2) {
        if (i2 < this.f4842d) {
            this.size = i2 + 1;
            return null;
        }
        int i3 = a.a[this.f4843e.ordinal()];
        if (i3 == 1) {
            return b.c;
        }
        if (i3 == 2) {
            return b.b;
        }
        if (i3 == 3) {
            return null;
        }
        throw new k();
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "(buffer:capacity=" + this.f4842d + ",size=" + this.size + ')';
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public Object i(E e2) {
        q l2;
        z e3;
        ReentrantLock reentrantLock = this.f4844f;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            j<?> d2 = d();
            if (d2 == null) {
                z z = z(i2);
                if (z == null) {
                    if (i2 == 0) {
                        do {
                            l2 = l();
                            if (l2 != null) {
                                if (l2 instanceof j) {
                                    this.size = i2;
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
                        this.size = i2;
                        s sVar = s.a;
                        reentrantLock.unlock();
                        l2.b(e2);
                        return l2.d();
                    }
                    x(i2, e2);
                    z zVar = b.b;
                    reentrantLock.unlock();
                    return zVar;
                }
                reentrantLock.unlock();
                return z;
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
        ReentrantLock reentrantLock = this.f4844f;
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
        return this.size == 0;
    }

    /* access modifiers changed from: protected */
    public Object v() {
        ReentrantLock reentrantLock = this.f4844f;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            if (i2 == 0) {
                Object d2 = d();
                if (d2 == null) {
                    d2 = b.f4840d;
                }
                return d2;
            }
            Object[] objArr = this.f4845g;
            int i3 = this.f4846h;
            Object obj = objArr[i3];
            s sVar = null;
            objArr[i3] = null;
            this.size = i2 - 1;
            Object obj2 = b.f4840d;
            boolean z = false;
            if (i2 == this.f4842d) {
                s sVar2 = null;
                while (true) {
                    s m2 = m();
                    if (m2 == null) {
                        sVar = sVar2;
                        break;
                    }
                    z z2 = m2.z((o.c) null);
                    if (z2 != null) {
                        if (o0.a()) {
                            if (z2 == kotlinx.coroutines.o.a) {
                                z = true;
                            }
                            if (!z) {
                                throw new AssertionError();
                            }
                        }
                        obj2 = m2.y();
                        sVar = m2;
                        z = true;
                    } else {
                        m2.A();
                        sVar2 = m2;
                    }
                }
            }
            if (obj2 != b.f4840d && !(obj2 instanceof j)) {
                this.size = i2;
                Object[] objArr2 = this.f4845g;
                objArr2[(this.f4846h + i2) % objArr2.length] = obj2;
            }
            this.f4846h = (this.f4846h + 1) % this.f4845g.length;
            s sVar3 = s.a;
            reentrantLock.unlock();
            if (z) {
                m.y.d.l.b(sVar);
                sVar.x();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
