package f.e.d.y.n;

import f.e.d.a0.c;
import f.e.d.i;
import f.e.d.l;
import f.e.d.n;
import f.e.d.o;
import f.e.d.q;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class f extends c {

    /* renamed from: s  reason: collision with root package name */
    private static final Writer f4380s = new a();
    private static final q t = new q("closed");

    /* renamed from: p  reason: collision with root package name */
    private final List<l> f4381p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    private String f4382q;

    /* renamed from: r  reason: collision with root package name */
    private l f4383r = n.a;

    class a extends Writer {
        a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public f() {
        super(f4380s);
    }

    private l j0() {
        List<l> list = this.f4381p;
        return list.get(list.size() - 1);
    }

    private void k0(l lVar) {
        if (this.f4382q != null) {
            if (!lVar.m() || E()) {
                ((o) j0()).p(this.f4382q, lVar);
            }
            this.f4382q = null;
        } else if (this.f4381p.isEmpty()) {
            this.f4383r = lVar;
        } else {
            l j0 = j0();
            if (j0 instanceof i) {
                ((i) j0).p(lVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public c B() {
        if (this.f4381p.isEmpty() || this.f4382q != null) {
            throw new IllegalStateException();
        } else if (j0() instanceof o) {
            List<l> list = this.f4381p;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c O(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f4381p.isEmpty() || this.f4382q != null) {
            throw new IllegalStateException();
        } else if (j0() instanceof o) {
            this.f4382q = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c S() {
        k0(n.a);
        return this;
    }

    public c c0(long j2) {
        k0(new q((Number) Long.valueOf(j2)));
        return this;
    }

    public void close() {
        if (this.f4381p.isEmpty()) {
            this.f4381p.add(t);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c d0(Boolean bool) {
        if (bool == null) {
            S();
            return this;
        }
        k0(new q(bool));
        return this;
    }

    public c e0(Number number) {
        if (number == null) {
            S();
            return this;
        }
        if (!L()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        k0(new q(number));
        return this;
    }

    public c f0(String str) {
        if (str == null) {
            S();
            return this;
        }
        k0(new q(str));
        return this;
    }

    public void flush() {
    }

    public c g() {
        i iVar = new i();
        k0(iVar);
        this.f4381p.add(iVar);
        return this;
    }

    public c g0(boolean z) {
        k0(new q(Boolean.valueOf(z)));
        return this;
    }

    public l i0() {
        if (this.f4381p.isEmpty()) {
            return this.f4383r;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f4381p);
    }

    public c o() {
        o oVar = new o();
        k0(oVar);
        this.f4381p.add(oVar);
        return this;
    }

    public c z() {
        if (this.f4381p.isEmpty() || this.f4382q != null) {
            throw new IllegalStateException();
        } else if (j0() instanceof i) {
            List<l> list = this.f4381p;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }
}
