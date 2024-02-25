package kotlinx.coroutines;

import kotlinx.coroutines.internal.y;
import m.m;
import m.n;
import m.s;
import m.v.d;
import m.v.j.a.e;
import m.y.c.l;
import m.y.d.g;

public final class c0 {
    public static final <T> Object a(Object obj, d<? super T> dVar) {
        if (obj instanceof y) {
            m.a aVar = m.f5014e;
            Throwable th = ((y) obj).a;
            if (o0.d() && (dVar instanceof e)) {
                th = y.j(th, (e) dVar);
            }
            obj = n.a(th);
        } else {
            m.a aVar2 = m.f5014e;
        }
        m.a(obj);
        return obj;
    }

    public static final <T> Object b(Object obj, l<? super Throwable, s> lVar) {
        Throwable b = m.b(obj);
        return b == null ? lVar != null ? new z(obj, lVar) : obj : new y(b, false, 2, (g) null);
    }

    public static final <T> Object c(Object obj, m<?> mVar) {
        Throwable b = m.b(obj);
        if (b != null) {
            if (o0.d() && (mVar instanceof e)) {
                b = y.j(b, (e) mVar);
            }
            obj = new y(b, false, 2, (g) null);
        }
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, l lVar, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
