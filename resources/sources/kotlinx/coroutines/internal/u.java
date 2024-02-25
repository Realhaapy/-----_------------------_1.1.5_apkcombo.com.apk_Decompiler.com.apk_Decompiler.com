package kotlinx.coroutines.internal;

import kotlinx.coroutines.h0;
import m.s;
import m.v.g;
import m.y.c.l;
import m.y.d.m;

public final class u {

    static final class a extends m implements l<Throwable, s> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l<E, s> f4829e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ E f4830f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f4831g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l<? super E, s> lVar, E e2, g gVar) {
            super(1);
            this.f4829e = lVar;
            this.f4830f = e2;
            this.f4831g = gVar;
        }

        public final void a(Throwable th) {
            u.b(this.f4829e, this.f4830f, this.f4831g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return s.a;
        }
    }

    public static final <E> l<Throwable, s> a(l<? super E, s> lVar, E e2, g gVar) {
        return new a(lVar, e2, gVar);
    }

    public static final <E> void b(l<? super E, s> lVar, E e2, g gVar) {
        h0 c = c(lVar, e2, (h0) null);
        if (c != null) {
            h0.a(gVar, c);
        }
    }

    public static final <E> h0 c(l<? super E, s> lVar, E e2, h0 h0Var) {
        try {
            lVar.invoke(e2);
        } catch (Throwable th) {
            if (h0Var == null || h0Var.getCause() == th) {
                return new h0(m.y.d.l.j("Exception in undelivered element handler for ", e2), th);
            }
            b.a(h0Var, th);
        }
        return h0Var;
    }

    public static /* synthetic */ h0 d(l lVar, Object obj, h0 h0Var, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            h0Var = null;
        }
        return c(lVar, obj, h0Var);
    }
}
