package f.e.d;

import f.e.d.a0.c;
import java.io.IOException;
import java.io.StringWriter;

public abstract class l {
    public i h() {
        if (l()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public o i() {
        if (n()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public q j() {
        if (o()) {
            return (q) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean l() {
        return this instanceof i;
    }

    public boolean m() {
        return this instanceof n;
    }

    public boolean n() {
        return this instanceof o;
    }

    public boolean o() {
        return this instanceof q;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.Z(true);
            f.e.d.y.l.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
