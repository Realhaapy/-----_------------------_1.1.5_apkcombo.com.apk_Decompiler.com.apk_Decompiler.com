package p.e0.i;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p.e0.i.d;
import q.c;
import q.d;

final class j implements Closeable {

    /* renamed from: k  reason: collision with root package name */
    private static final Logger f5337k = Logger.getLogger(e.class.getName());

    /* renamed from: e  reason: collision with root package name */
    private final d f5338e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5339f;

    /* renamed from: g  reason: collision with root package name */
    private final c f5340g;

    /* renamed from: h  reason: collision with root package name */
    private int f5341h = 16384;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5342i;

    /* renamed from: j  reason: collision with root package name */
    final d.b f5343j;

    j(q.d dVar, boolean z) {
        this.f5338e = dVar;
        this.f5339f = z;
        c cVar = new c();
        this.f5340g = cVar;
        this.f5343j = new d.b(cVar);
    }

    private void U(int i2, long j2) {
        while (j2 > 0) {
            int min = (int) Math.min((long) this.f5341h, j2);
            long j3 = (long) min;
            j2 -= j3;
            v(i2, min, (byte) 9, j2 == 0 ? (byte) 4 : 0);
            this.f5338e.h(this.f5340g, j3);
        }
    }

    private static void V(q.d dVar, int i2) {
        dVar.t((i2 >>> 16) & 255);
        dVar.t((i2 >>> 8) & 255);
        dVar.t(i2 & 255);
    }

    /* access modifiers changed from: package-private */
    public void B(boolean z, int i2, List<c> list) {
        if (!this.f5342i) {
            this.f5343j.g(list);
            long X = this.f5340g.X();
            int min = (int) Math.min((long) this.f5341h, X);
            long j2 = (long) min;
            int i3 = (X > j2 ? 1 : (X == j2 ? 0 : -1));
            byte b = i3 == 0 ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            v(i2, min, (byte) 1, b);
            this.f5338e.h(this.f5340g, j2);
            if (i3 > 0) {
                U(i2, X - j2);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public int E() {
        return this.f5341h;
    }

    public synchronized void J(boolean z, int i2, int i3) {
        if (!this.f5342i) {
            v(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.f5338e.m(i2);
            this.f5338e.m(i3);
            this.f5338e.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void L(int i2, int i3, List<c> list) {
        if (!this.f5342i) {
            this.f5343j.g(list);
            long X = this.f5340g.X();
            int min = (int) Math.min((long) (this.f5341h - 4), X);
            long j2 = (long) min;
            int i4 = (X > j2 ? 1 : (X == j2 ? 0 : -1));
            v(i2, min + 4, (byte) 5, i4 == 0 ? (byte) 4 : 0);
            this.f5338e.m(i3 & Integer.MAX_VALUE);
            this.f5338e.h(this.f5340g, j2);
            if (i4 > 0) {
                U(i2, X - j2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void O(int i2, b bVar) {
        if (this.f5342i) {
            throw new IOException("closed");
        } else if (bVar.f5225e != -1) {
            v(i2, 4, (byte) 3, (byte) 0);
            this.f5338e.m(bVar.f5225e);
            this.f5338e.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void P(m mVar) {
        if (!this.f5342i) {
            int i2 = 0;
            v(0, mVar.j() * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (mVar.g(i2)) {
                    this.f5338e.l(i2 == 4 ? 3 : i2 == 7 ? 4 : i2);
                    this.f5338e.m(mVar.b(i2));
                }
                i2++;
            }
            this.f5338e.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void S(boolean z, int i2, int i3, List<c> list) {
        if (!this.f5342i) {
            B(z, i2, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void T(int i2, long j2) {
        if (this.f5342i) {
            throw new IOException("closed");
        } else if (j2 == 0 || j2 > 2147483647L) {
            e.c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j2));
            throw null;
        } else {
            v(i2, 4, (byte) 8, (byte) 0);
            this.f5338e.m((int) j2);
            this.f5338e.flush();
        }
    }

    public synchronized void a(m mVar) {
        if (!this.f5342i) {
            this.f5341h = mVar.f(this.f5341h);
            if (mVar.c() != -1) {
                this.f5343j.e(mVar.c());
            }
            v(0, 0, (byte) 4, (byte) 1);
            this.f5338e.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void c() {
        if (this.f5342i) {
            throw new IOException("closed");
        } else if (this.f5339f) {
            Logger logger = f5337k;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(p.e0.c.p(">> CONNECTION %s", e.a.l()));
            }
            this.f5338e.y(e.a.z());
            this.f5338e.flush();
        }
    }

    public synchronized void close() {
        this.f5342i = true;
        this.f5338e.close();
    }

    public synchronized void flush() {
        if (!this.f5342i) {
            this.f5338e.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void g(boolean z, int i2, c cVar, int i3) {
        if (!this.f5342i) {
            byte b = 0;
            if (z) {
                b = (byte) 1;
            }
            o(i2, b, cVar, i3);
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    public void o(int i2, byte b, c cVar, int i3) {
        v(i2, i3, (byte) 0, b);
        if (i3 > 0) {
            this.f5338e.h(cVar, (long) i3);
        }
    }

    public void v(int i2, int i3, byte b, byte b2) {
        Logger logger = f5337k;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.b(false, i2, i3, b, b2));
        }
        int i4 = this.f5341h;
        if (i3 > i4) {
            e.c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i4), Integer.valueOf(i3));
            throw null;
        } else if ((Integer.MIN_VALUE & i2) == 0) {
            V(this.f5338e, i3);
            this.f5338e.t(b & 255);
            this.f5338e.t(b2 & 255);
            this.f5338e.m(i2 & Integer.MAX_VALUE);
        } else {
            e.c("reserved bit set: %s", Integer.valueOf(i2));
            throw null;
        }
    }

    public synchronized void z(int i2, b bVar, byte[] bArr) {
        if (this.f5342i) {
            throw new IOException("closed");
        } else if (bVar.f5225e != -1) {
            v(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f5338e.m(i2);
            this.f5338e.m(bVar.f5225e);
            if (bArr.length > 0) {
                this.f5338e.y(bArr);
            }
            this.f5338e.flush();
        } else {
            e.c("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
    }
}
