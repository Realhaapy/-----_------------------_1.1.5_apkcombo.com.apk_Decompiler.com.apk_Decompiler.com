package q;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class k implements s {

    /* renamed from: e  reason: collision with root package name */
    private final e f5491e;

    /* renamed from: f  reason: collision with root package name */
    private final Inflater f5492f;

    /* renamed from: g  reason: collision with root package name */
    private int f5493g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5494h;

    k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f5491e = eVar;
            this.f5492f = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    private void c() {
        int i2 = this.f5493g;
        if (i2 != 0) {
            int remaining = i2 - this.f5492f.getRemaining();
            this.f5493g -= remaining;
            this.f5491e.skip((long) remaining);
        }
    }

    public long F(c cVar, long j2) {
        o a0;
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        } else if (this.f5494h) {
            throw new IllegalStateException("closed");
        } else if (i2 == 0) {
            return 0;
        } else {
            while (true) {
                boolean a = a();
                try {
                    a0 = cVar.a0(1);
                    int inflate = this.f5492f.inflate(a0.a, a0.c, (int) Math.min(j2, (long) (8192 - a0.c)));
                    if (inflate > 0) {
                        a0.c += inflate;
                        long j3 = (long) inflate;
                        cVar.f5477f += j3;
                        return j3;
                    } else if (this.f5492f.finished()) {
                        break;
                    } else if (this.f5492f.needsDictionary()) {
                        break;
                    } else if (a) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            c();
            if (a0.b != a0.c) {
                return -1;
            }
            cVar.f5476e = a0.b();
            p.a(a0);
            return -1;
        }
    }

    public final boolean a() {
        if (!this.f5492f.needsInput()) {
            return false;
        }
        c();
        if (this.f5492f.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f5491e.s()) {
            return true;
        } else {
            o oVar = this.f5491e.b().f5476e;
            int i2 = oVar.c;
            int i3 = oVar.b;
            int i4 = i2 - i3;
            this.f5493g = i4;
            this.f5492f.setInput(oVar.a, i3, i4);
            return false;
        }
    }

    public void close() {
        if (!this.f5494h) {
            this.f5492f.end();
            this.f5494h = true;
            this.f5491e.close();
        }
    }

    public t d() {
        return this.f5491e.d();
    }
}
