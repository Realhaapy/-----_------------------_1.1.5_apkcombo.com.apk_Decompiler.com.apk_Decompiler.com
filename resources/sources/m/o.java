package m;

import java.io.Serializable;
import m.y.c.a;
import m.y.d.g;
import m.y.d.l;

final class o<T> implements g<T>, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private a<? extends T> f5016e;

    /* renamed from: f  reason: collision with root package name */
    private volatile Object f5017f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f5018g;

    public o(a<? extends T> aVar, Object obj) {
        l.d(aVar, "initializer");
        this.f5016e = aVar;
        this.f5017f = q.a;
        this.f5018g = obj == null ? this : obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(a aVar, Object obj, int i2, g gVar) {
        this(aVar, (i2 & 2) != 0 ? null : obj);
    }

    private final Object writeReplace() {
        return new d(getValue());
    }

    public boolean a() {
        return this.f5017f != q.a;
    }

    public T getValue() {
        T t;
        T t2 = this.f5017f;
        T t3 = q.a;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.f5018g) {
            t = this.f5017f;
            if (t == t3) {
                a aVar = this.f5016e;
                l.b(aVar);
                t = aVar.invoke();
                this.f5017f = t;
                this.f5016e = null;
            }
        }
        return t;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
