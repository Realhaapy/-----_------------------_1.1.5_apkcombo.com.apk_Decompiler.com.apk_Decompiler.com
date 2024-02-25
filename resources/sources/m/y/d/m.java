package m.y.d;

import java.io.Serializable;

public abstract class m<R> implements h<R>, Serializable {
    private final int arity;

    public m(int i2) {
        this.arity = i2;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String e2 = q.e(this);
        l.c(e2, "renderLambdaToString(this)");
        return e2;
    }
}
