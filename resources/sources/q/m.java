package q;

import java.nio.ByteBuffer;
import java.util.Objects;

final class m implements d {

    /* renamed from: e  reason: collision with root package name */
    public final c f5500e = new c();

    /* renamed from: f  reason: collision with root package name */
    public final r f5501f;

    /* renamed from: g  reason: collision with root package name */
    boolean f5502g;

    m(r rVar) {
        Objects.requireNonNull(rVar, "sink == null");
        this.f5501f = rVar;
    }

    public d C() {
        if (!this.f5502g) {
            long B = this.f5500e.B();
            if (B > 0) {
                this.f5501f.h(this.f5500e, B);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public d N(String str) {
        if (!this.f5502g) {
            this.f5500e.k0(str);
            C();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public c b() {
        return this.f5500e;
    }

    public void close() {
        if (!this.f5502g) {
            try {
                c cVar = this.f5500e;
                long j2 = cVar.f5477f;
                if (j2 > 0) {
                    this.f5501f.h(cVar, j2);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f5501f.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f5502g = true;
            if (th != null) {
                u.e(th);
                throw null;
            }
        }
    }

    public t d() {
        return this.f5501f.d();
    }

    public d e(byte[] bArr, int i2, int i3) {
        if (!this.f5502g) {
            this.f5500e.d0(bArr, i2, i3);
            C();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public void flush() {
        if (!this.f5502g) {
            c cVar = this.f5500e;
            long j2 = cVar.f5477f;
            if (j2 > 0) {
                this.f5501f.h(cVar, j2);
            }
            this.f5501f.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public void h(c cVar, long j2) {
        if (!this.f5502g) {
            this.f5500e.h(cVar, j2);
            C();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f5502g;
    }

    public d j(long j2) {
        if (!this.f5502g) {
            this.f5500e.g0(j2);
            return C();
        }
        throw new IllegalStateException("closed");
    }

    public d l(int i2) {
        if (!this.f5502g) {
            this.f5500e.i0(i2);
            C();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public d m(int i2) {
        if (!this.f5502g) {
            this.f5500e.h0(i2);
            C();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public d t(int i2) {
        if (!this.f5502g) {
            this.f5500e.f0(i2);
            C();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f5501f + ")";
    }

    public int write(ByteBuffer byteBuffer) {
        if (!this.f5502g) {
            int write = this.f5500e.write(byteBuffer);
            C();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    public d y(byte[] bArr) {
        if (!this.f5502g) {
            this.f5500e.c0(bArr);
            C();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
