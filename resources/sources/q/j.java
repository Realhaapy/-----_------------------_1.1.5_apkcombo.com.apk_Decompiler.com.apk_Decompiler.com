package q;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class j implements s {

    /* renamed from: e  reason: collision with root package name */
    private int f5486e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final e f5487f;

    /* renamed from: g  reason: collision with root package name */
    private final Inflater f5488g;

    /* renamed from: h  reason: collision with root package name */
    private final k f5489h;

    /* renamed from: i  reason: collision with root package name */
    private final CRC32 f5490i = new CRC32();

    public j(s sVar) {
        if (sVar != null) {
            Inflater inflater = new Inflater(true);
            this.f5488g = inflater;
            e b = l.b(sVar);
            this.f5487f = b;
            this.f5489h = new k(b, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void a(String str, int i2, int i3) {
        if (i3 != i2) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}));
        }
    }

    private void c() {
        this.f5487f.M(10);
        byte L = this.f5487f.b().L(3);
        boolean z = ((L >> 1) & 1) == 1;
        if (z) {
            o(this.f5487f.b(), 0, 10);
        }
        a("ID1ID2", 8075, this.f5487f.readShort());
        this.f5487f.skip(8);
        if (((L >> 2) & 1) == 1) {
            this.f5487f.M(2);
            if (z) {
                o(this.f5487f.b(), 0, 2);
            }
            long A = (long) this.f5487f.b().A();
            this.f5487f.M(A);
            if (z) {
                o(this.f5487f.b(), 0, A);
            }
            this.f5487f.skip(A);
        }
        if (((L >> 3) & 1) == 1) {
            long Q = this.f5487f.Q((byte) 0);
            if (Q != -1) {
                if (z) {
                    o(this.f5487f.b(), 0, Q + 1);
                }
                this.f5487f.skip(Q + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((L >> 4) & 1) == 1) {
            long Q2 = this.f5487f.Q((byte) 0);
            if (Q2 != -1) {
                if (z) {
                    o(this.f5487f.b(), 0, Q2 + 1);
                }
                this.f5487f.skip(Q2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            a("FHCRC", this.f5487f.A(), (short) ((int) this.f5490i.getValue()));
            this.f5490i.reset();
        }
    }

    private void g() {
        a("CRC", this.f5487f.q(), (int) this.f5490i.getValue());
        a("ISIZE", this.f5487f.q(), (int) this.f5488g.getBytesWritten());
    }

    private void o(c cVar, long j2, long j3) {
        o oVar = cVar.f5476e;
        while (true) {
            int i2 = oVar.c;
            int i3 = oVar.b;
            if (j2 < ((long) (i2 - i3))) {
                break;
            }
            j2 -= (long) (i2 - i3);
            oVar = oVar.f5508f;
        }
        while (j3 > 0) {
            int i4 = (int) (((long) oVar.b) + j2);
            int min = (int) Math.min((long) (oVar.c - i4), j3);
            this.f5490i.update(oVar.a, i4, min);
            j3 -= (long) min;
            oVar = oVar.f5508f;
            j2 = 0;
        }
    }

    public long F(c cVar, long j2) {
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        } else if (i2 == 0) {
            return 0;
        } else {
            if (this.f5486e == 0) {
                c();
                this.f5486e = 1;
            }
            if (this.f5486e == 1) {
                long j3 = cVar.f5477f;
                long F = this.f5489h.F(cVar, j2);
                if (F != -1) {
                    o(cVar, j3, F);
                    return F;
                }
                this.f5486e = 2;
            }
            if (this.f5486e == 2) {
                g();
                this.f5486e = 3;
                if (!this.f5487f.s()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public void close() {
        this.f5489h.close();
    }

    public t d() {
        return this.f5487f.d();
    }
}
