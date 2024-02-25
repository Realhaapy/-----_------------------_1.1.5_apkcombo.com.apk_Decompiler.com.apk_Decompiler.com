package kotlinx.coroutines.k2.g;

import kotlinx.coroutines.internal.x;
import kotlinx.coroutines.n1;
import m.v.g;
import m.y.c.p;
import m.y.d.m;

public final class e {

    static final class a extends m implements p<Integer, g.b, Integer> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c<?> f4871e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c<?> cVar) {
            super(2);
            this.f4871e = cVar;
        }

        public final Integer a(int i2, g.b bVar) {
            g.c key = bVar.getKey();
            g.b bVar2 = this.f4871e.f4865f.get(key);
            if (key != n1.f4932d) {
                return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : i2 + 1);
            }
            n1 n1Var = (n1) bVar2;
            n1 b = e.b((n1) bVar, n1Var);
            if (b == n1Var) {
                if (n1Var != null) {
                    i2++;
                }
                return Integer.valueOf(i2);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b + ", expected child of " + n1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public static final void a(c<?> cVar, g gVar) {
        if (((Number) gVar.fold(0, new a(cVar))).intValue() != cVar.f4866g) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + cVar.f4865f + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    public static final n1 b(n1 n1Var, n1 n1Var2) {
        while (n1Var != null) {
            if (n1Var == n1Var2 || !(n1Var instanceof x)) {
                return n1Var;
            }
            n1Var = ((x) n1Var).w0();
        }
        return null;
    }
}
