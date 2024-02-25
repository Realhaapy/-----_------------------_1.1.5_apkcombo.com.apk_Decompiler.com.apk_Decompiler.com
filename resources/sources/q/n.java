package q;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Objects;

final class n implements e {

    /* renamed from: e  reason: collision with root package name */
    public final c f5503e = new c();

    /* renamed from: f  reason: collision with root package name */
    public final s f5504f;

    /* renamed from: g  reason: collision with root package name */
    boolean f5505g;

    n(s sVar) {
        Objects.requireNonNull(sVar, "source == null");
        this.f5504f = sVar;
    }

    public short A() {
        M(2);
        return this.f5503e.A();
    }

    public long F(c cVar, long j2) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        } else if (!this.f5505g) {
            c cVar2 = this.f5503e;
            if (cVar2.f5477f == 0 && this.f5504f.F(cVar2, 8192) == -1) {
                return -1;
            }
            return this.f5503e.F(cVar, Math.min(j2, this.f5503e.f5477f));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public String G(long j2) {
        if (j2 >= 0) {
            long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
            long a = a((byte) 10, 0, j3);
            if (a != -1) {
                return this.f5503e.W(a);
            }
            if (j3 < Long.MAX_VALUE && c(j3) && this.f5503e.L(j3 - 1) == 13 && c(1 + j3) && this.f5503e.L(j3) == 10) {
                return this.f5503e.W(j3);
            }
            c cVar = new c();
            c cVar2 = this.f5503e;
            cVar2.E(cVar, 0, Math.min(32, cVar2.X()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f5503e.X(), j2) + " content=" + cVar.S().l() + 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j2);
    }

    public long H(r rVar) {
        c cVar;
        if (rVar != null) {
            long j2 = 0;
            while (true) {
                int i2 = (this.f5504f.F(this.f5503e, 8192) > -1 ? 1 : (this.f5504f.F(this.f5503e, 8192) == -1 ? 0 : -1));
                cVar = this.f5503e;
                if (i2 == 0) {
                    break;
                }
                long B = cVar.B();
                if (B > 0) {
                    j2 += B;
                    rVar.h(this.f5503e, B);
                }
            }
            if (cVar.X() <= 0) {
                return j2;
            }
            long X = j2 + this.f5503e.X();
            c cVar2 = this.f5503e;
            rVar.h(cVar2, cVar2.X());
            return X;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public void M(long j2) {
        if (!c(j2)) {
            throw new EOFException();
        }
    }

    public long Q(byte b) {
        return a(b, 0, Long.MAX_VALUE);
    }

    public long R() {
        M(1);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!c((long) i3)) {
                break;
            }
            byte L = this.f5503e.L((long) i2);
            if ((L >= 48 && L <= 57) || ((L >= 97 && L <= 102) || (L >= 65 && L <= 70))) {
                i2 = i3;
            } else if (i2 == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(L)}));
            }
        }
        return this.f5503e.R();
    }

    public long a(byte b, long j2, long j3) {
        if (this.f5505g) {
            throw new IllegalStateException("closed");
        } else if (j2 < 0 || j3 < j2) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j2), Long.valueOf(j3)}));
        } else {
            while (j2 < j3) {
                long O = this.f5503e.O(b, j2, j3);
                if (O == -1) {
                    c cVar = this.f5503e;
                    long j4 = cVar.f5477f;
                    if (j4 >= j3 || this.f5504f.F(cVar, 8192) == -1) {
                        break;
                    }
                    j2 = Math.max(j2, j4);
                } else {
                    return O;
                }
            }
            return -1;
        }
    }

    public c b() {
        return this.f5503e;
    }

    public boolean c(long j2) {
        c cVar;
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        } else if (!this.f5505g) {
            do {
                cVar = this.f5503e;
                if (cVar.f5477f >= j2) {
                    return true;
                }
            } while (this.f5504f.F(cVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public void close() {
        if (!this.f5505g) {
            this.f5505g = true;
            this.f5504f.close();
            this.f5503e.v();
        }
    }

    public t d() {
        return this.f5504f.d();
    }

    public boolean isOpen() {
        return !this.f5505g;
    }

    public f k(long j2) {
        M(j2);
        return this.f5503e.k(j2);
    }

    public String p() {
        return G(Long.MAX_VALUE);
    }

    public int q() {
        M(4);
        return this.f5503e.q();
    }

    public int read(ByteBuffer byteBuffer) {
        c cVar = this.f5503e;
        if (cVar.f5477f == 0 && this.f5504f.F(cVar, 8192) == -1) {
            return -1;
        }
        return this.f5503e.read(byteBuffer);
    }

    public byte readByte() {
        M(1);
        return this.f5503e.readByte();
    }

    public void readFully(byte[] bArr) {
        try {
            M((long) bArr.length);
            this.f5503e.readFully(bArr);
        } catch (EOFException e2) {
            int i2 = 0;
            while (true) {
                c cVar = this.f5503e;
                long j2 = cVar.f5477f;
                if (j2 > 0) {
                    int read = cVar.read(bArr, i2, (int) j2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e2;
                }
            }
        }
    }

    public int readInt() {
        M(4);
        return this.f5503e.readInt();
    }

    public short readShort() {
        M(2);
        return this.f5503e.readShort();
    }

    public boolean s() {
        if (!this.f5505g) {
            return this.f5503e.s() && this.f5504f.F(this.f5503e, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public void skip(long j2) {
        if (!this.f5505g) {
            while (j2 > 0) {
                c cVar = this.f5503e;
                if (cVar.f5477f == 0 && this.f5504f.F(cVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j2, this.f5503e.X());
                this.f5503e.skip(min);
                j2 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f5504f + ")";
    }

    public byte[] u(long j2) {
        M(j2);
        return this.f5503e.u(j2);
    }
}
