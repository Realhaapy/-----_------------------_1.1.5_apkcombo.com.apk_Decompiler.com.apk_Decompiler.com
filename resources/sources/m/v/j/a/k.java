package m.v.j.a;

import m.v.d;
import m.y.d.h;
import m.y.d.l;
import m.y.d.q;

public abstract class k extends d implements h<Object> {
    private final int arity;

    public k(int i2) {
        this(i2, (d<Object>) null);
    }

    public k(int i2, d<Object> dVar) {
        super(dVar);
        this.arity = i2;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String d2 = q.d(this);
        l.c(d2, "renderLambdaToString(this)");
        return d2;
    }
}
