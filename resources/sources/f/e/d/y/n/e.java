package f.e.d.y.n;

import f.e.d.a0.b;
import f.e.d.i;
import f.e.d.l;
import f.e.d.n;
import f.e.d.o;
import f.e.d.q;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class e extends f.e.d.a0.a {
    private static final Reader x = new a();
    private static final Object y = new Object();
    private Object[] t = new Object[32];
    private int u = 0;
    private String[] v = new String[32];
    private int[] w = new int[32];

    class a extends Reader {
        a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public e(l lVar) {
        super(x);
        t0(lVar);
    }

    private String S() {
        return " at path " + J();
    }

    private void p0(b bVar) {
        if (d0() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + d0() + S());
        }
    }

    private Object q0() {
        return this.t[this.u - 1];
    }

    private Object r0() {
        Object[] objArr = this.t;
        int i2 = this.u - 1;
        this.u = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    private void t0(Object obj) {
        int i2 = this.u;
        Object[] objArr = this.t;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.t = Arrays.copyOf(objArr, i3);
            this.w = Arrays.copyOf(this.w, i3);
            this.v = (String[]) Arrays.copyOf(this.v, i3);
        }
        Object[] objArr2 = this.t;
        int i4 = this.u;
        this.u = i4 + 1;
        objArr2[i4] = obj;
    }

    public void B() {
        p0(b.END_OBJECT);
        r0();
        r0();
        int i2 = this.u;
        if (i2 > 0) {
            int[] iArr = this.w;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public String J() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = 0;
        while (i2 < this.u) {
            Object[] objArr = this.t;
            if (objArr[i2] instanceof i) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.w[i2]);
                    sb.append(']');
                }
            } else if (objArr[i2] instanceof o) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.v;
                    if (strArr[i2] != null) {
                        sb.append(strArr[i2]);
                    }
                }
            }
            i2++;
        }
        return sb.toString();
    }

    public boolean L() {
        b d0 = d0();
        return (d0 == b.END_OBJECT || d0 == b.END_ARRAY) ? false : true;
    }

    public boolean T() {
        p0(b.BOOLEAN);
        boolean p2 = ((q) r0()).p();
        int i2 = this.u;
        if (i2 > 0) {
            int[] iArr = this.w;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return p2;
    }

    public double U() {
        b d0 = d0();
        b bVar = b.NUMBER;
        if (d0 == bVar || d0 == b.STRING) {
            double q2 = ((q) q0()).q();
            if (O() || (!Double.isNaN(q2) && !Double.isInfinite(q2))) {
                r0();
                int i2 = this.u;
                if (i2 > 0) {
                    int[] iArr = this.w;
                    int i3 = i2 - 1;
                    iArr[i3] = iArr[i3] + 1;
                }
                return q2;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + q2);
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + d0 + S());
    }

    public int V() {
        b d0 = d0();
        b bVar = b.NUMBER;
        if (d0 == bVar || d0 == b.STRING) {
            int r2 = ((q) q0()).r();
            r0();
            int i2 = this.u;
            if (i2 > 0) {
                int[] iArr = this.w;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return r2;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + d0 + S());
    }

    public long W() {
        b d0 = d0();
        b bVar = b.NUMBER;
        if (d0 == bVar || d0 == b.STRING) {
            long s2 = ((q) q0()).s();
            r0();
            int i2 = this.u;
            if (i2 > 0) {
                int[] iArr = this.w;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return s2;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + d0 + S());
    }

    public String X() {
        p0(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) q0()).next();
        String str = (String) entry.getKey();
        this.v[this.u - 1] = str;
        t0(entry.getValue());
        return str;
    }

    public void Z() {
        p0(b.NULL);
        r0();
        int i2 = this.u;
        if (i2 > 0) {
            int[] iArr = this.w;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public void a() {
        p0(b.BEGIN_ARRAY);
        t0(((i) q0()).iterator());
        this.w[this.u - 1] = 0;
    }

    public String b0() {
        b d0 = d0();
        b bVar = b.STRING;
        if (d0 == bVar || d0 == b.NUMBER) {
            String k2 = ((q) r0()).k();
            int i2 = this.u;
            if (i2 > 0) {
                int[] iArr = this.w;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return k2;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + d0 + S());
    }

    public void c() {
        p0(b.BEGIN_OBJECT);
        t0(((o) q0()).q().iterator());
    }

    public void close() {
        this.t = new Object[]{y};
        this.u = 1;
    }

    public b d0() {
        if (this.u == 0) {
            return b.END_DOCUMENT;
        }
        Object q0 = q0();
        if (q0 instanceof Iterator) {
            boolean z = this.t[this.u - 2] instanceof o;
            Iterator it = (Iterator) q0;
            if (!it.hasNext()) {
                return z ? b.END_OBJECT : b.END_ARRAY;
            }
            if (z) {
                return b.NAME;
            }
            t0(it.next());
            return d0();
        } else if (q0 instanceof o) {
            return b.BEGIN_OBJECT;
        } else {
            if (q0 instanceof i) {
                return b.BEGIN_ARRAY;
            }
            if (q0 instanceof q) {
                q qVar = (q) q0;
                if (qVar.x()) {
                    return b.STRING;
                }
                if (qVar.u()) {
                    return b.BOOLEAN;
                }
                if (qVar.w()) {
                    return b.NUMBER;
                }
                throw new AssertionError();
            } else if (q0 instanceof n) {
                return b.NULL;
            } else {
                if (q0 == y) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public void n0() {
        if (d0() == b.NAME) {
            X();
            this.v[this.u - 2] = "null";
        } else {
            r0();
            int i2 = this.u;
            if (i2 > 0) {
                this.v[i2 - 1] = "null";
            }
        }
        int i3 = this.u;
        if (i3 > 0) {
            int[] iArr = this.w;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    public void s0() {
        p0(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) q0()).next();
        t0(entry.getValue());
        t0(new q((String) entry.getKey()));
    }

    public String toString() {
        return e.class.getSimpleName();
    }

    public void z() {
        p0(b.END_ARRAY);
        r0();
        r0();
        int i2 = this.u;
        if (i2 > 0) {
            int[] iArr = this.w;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }
}
