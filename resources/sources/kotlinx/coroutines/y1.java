package kotlinx.coroutines;

import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.o;
import m.y.d.l;

public final class y1 extends m implements i1 {
    public boolean a() {
        return true;
    }

    public y1 g() {
        return this;
    }

    public String toString() {
        return o0.c() ? x("Active") : super.toString();
    }

    public final String x(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z = true;
        for (o oVar = (o) n(); !l.a(oVar, this); oVar = oVar.o()) {
            if (oVar instanceof t1) {
                t1 t1Var = (t1) oVar;
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(t1Var);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        l.c(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
