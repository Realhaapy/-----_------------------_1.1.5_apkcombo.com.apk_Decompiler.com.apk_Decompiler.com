package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlinx.coroutines.d2;
import m.v.g;
import m.y.c.p;
import m.y.d.l;
import m.y.d.m;

public final class d0 {
    public static final z a = new z("NO_THREAD_ELEMENTS");
    private static final p<Object, g.b, Object> b = a.f4803e;
    private static final p<d2<?>, g.b, d2<?>> c = b.f4804e;

    /* renamed from: d  reason: collision with root package name */
    private static final p<g0, g.b, g0> f4802d = c.f4805e;

    static final class a extends m implements p<Object, g.b, Object> {

        /* renamed from: e  reason: collision with root package name */
        public static final a f4803e = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(Object obj, g.b bVar) {
            if (!(bVar instanceof d2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    static final class b extends m implements p<d2<?>, g.b, d2<?>> {

        /* renamed from: e  reason: collision with root package name */
        public static final b f4804e = new b();

        b() {
            super(2);
        }

        /* renamed from: a */
        public final d2<?> invoke(d2<?> d2Var, g.b bVar) {
            if (d2Var != null) {
                return d2Var;
            }
            if (bVar instanceof d2) {
                return (d2) bVar;
            }
            return null;
        }
    }

    static final class c extends m implements p<g0, g.b, g0> {

        /* renamed from: e  reason: collision with root package name */
        public static final c f4805e = new c();

        c() {
            super(2);
        }

        public final g0 a(g0 g0Var, g.b bVar) {
            if (bVar instanceof d2) {
                d2 d2Var = (d2) bVar;
                g0Var.a(d2Var, d2Var.O(g0Var.a));
            }
            return g0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            g0 g0Var = (g0) obj;
            a(g0Var, (g.b) obj2);
            return g0Var;
        }
    }

    public static final void a(g gVar, Object obj) {
        if (obj != a) {
            if (obj instanceof g0) {
                ((g0) obj).b(gVar);
                return;
            }
            Object fold = gVar.fold(null, c);
            Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((d2) fold).o(gVar, obj);
        }
    }

    public static final Object b(g gVar) {
        Object fold = gVar.fold(0, b);
        l.b(fold);
        return fold;
    }

    public static final Object c(g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        return obj == 0 ? a : obj instanceof Integer ? gVar.fold(new g0(gVar, ((Number) obj).intValue()), f4802d) : ((d2) obj).O(gVar);
    }
}
