package kotlinx.coroutines;

import m.s;
import m.y.c.l;
import m.y.d.g;

final class x {
    public final Object a;
    public final k b;
    public final l<Throwable, s> c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f4961d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f4962e;

    public x(Object obj, k kVar, l<? super Throwable, s> lVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = kVar;
        this.c = lVar;
        this.f4961d = obj2;
        this.f4962e = th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, k kVar, l lVar, Object obj2, Throwable th, int i2, g gVar) {
        this(obj, (i2 & 2) != 0 ? null : kVar, (i2 & 4) != 0 ? null : lVar, (i2 & 8) != 0 ? null : obj2, (i2 & 16) != 0 ? null : th);
    }

    public static /* synthetic */ x b(x xVar, Object obj, k kVar, l<Throwable, s> lVar, Object obj2, Throwable th, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            obj = xVar.a;
        }
        if ((i2 & 2) != 0) {
            kVar = xVar.b;
        }
        k kVar2 = kVar;
        if ((i2 & 4) != 0) {
            lVar = xVar.c;
        }
        l<Throwable, s> lVar2 = lVar;
        if ((i2 & 8) != 0) {
            obj2 = xVar.f4961d;
        }
        Object obj4 = obj2;
        if ((i2 & 16) != 0) {
            th = xVar.f4962e;
        }
        return xVar.a(obj, kVar2, lVar2, obj4, th);
    }

    public final x a(Object obj, k kVar, l<? super Throwable, s> lVar, Object obj2, Throwable th) {
        return new x(obj, kVar, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f4962e != null;
    }

    public final void d(n<?> nVar, Throwable th) {
        k kVar = this.b;
        if (kVar != null) {
            nVar.o(kVar, th);
        }
        l<Throwable, s> lVar = this.c;
        if (lVar != null) {
            nVar.p(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return m.y.d.l.a(this.a, xVar.a) && m.y.d.l.a(this.b, xVar.b) && m.y.d.l.a(this.c, xVar.c) && m.y.d.l.a(this.f4961d, xVar.f4961d) && m.y.d.l.a(this.f4962e, xVar.f4962e);
    }

    public int hashCode() {
        Object obj = this.a;
        int i2 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        k kVar = this.b;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        l<Throwable, s> lVar = this.c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f4961d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f4962e;
        if (th != null) {
            i2 = th.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.f4961d + ", cancelCause=" + this.f4962e + ')';
    }
}
