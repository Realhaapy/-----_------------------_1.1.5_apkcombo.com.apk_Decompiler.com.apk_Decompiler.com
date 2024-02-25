package p.e0.i;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p.e0.i.d;
import q.c;
import q.e;
import q.f;
import q.s;
import q.t;

final class h implements Closeable {

    /* renamed from: i  reason: collision with root package name */
    static final Logger f5306i = Logger.getLogger(e.class.getName());

    /* renamed from: e  reason: collision with root package name */
    private final e f5307e;

    /* renamed from: f  reason: collision with root package name */
    private final a f5308f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f5309g;

    /* renamed from: h  reason: collision with root package name */
    final d.a f5310h;

    static final class a implements s {

        /* renamed from: e  reason: collision with root package name */
        private final e f5311e;

        /* renamed from: f  reason: collision with root package name */
        int f5312f;

        /* renamed from: g  reason: collision with root package name */
        byte f5313g;

        /* renamed from: h  reason: collision with root package name */
        int f5314h;

        /* renamed from: i  reason: collision with root package name */
        int f5315i;

        /* renamed from: j  reason: collision with root package name */
        short f5316j;

        a(e eVar) {
            this.f5311e = eVar;
        }

        private void a() {
            int i2 = this.f5314h;
            int E = h.E(this.f5311e);
            this.f5315i = E;
            this.f5312f = E;
            byte readByte = (byte) (this.f5311e.readByte() & 255);
            this.f5313g = (byte) (this.f5311e.readByte() & 255);
            Logger logger = h.f5306i;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.b(true, this.f5314h, this.f5312f, readByte, this.f5313g));
            }
            int readInt = this.f5311e.readInt() & Integer.MAX_VALUE;
            this.f5314h = readInt;
            if (readByte != 9) {
                e.d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                throw null;
            } else if (readInt != i2) {
                e.d("TYPE_CONTINUATION streamId changed", new Object[0]);
                throw null;
            }
        }

        public long F(c cVar, long j2) {
            while (true) {
                int i2 = this.f5315i;
                if (i2 == 0) {
                    this.f5311e.skip((long) this.f5316j);
                    this.f5316j = 0;
                    if ((this.f5313g & 4) != 0) {
                        return -1;
                    }
                    a();
                } else {
                    long F = this.f5311e.F(cVar, Math.min(j2, (long) i2));
                    if (F == -1) {
                        return -1;
                    }
                    this.f5315i = (int) (((long) this.f5315i) - F);
                    return F;
                }
            }
        }

        public void close() {
        }

        public t d() {
            return this.f5311e.d();
        }
    }

    interface b {
        void a();

        void b(boolean z, m mVar);

        void c(boolean z, int i2, e eVar, int i3);

        void d(boolean z, int i2, int i3);

        void e(int i2, int i3, int i4, boolean z);

        void f(int i2, b bVar);

        void g(boolean z, int i2, int i3, List<c> list);

        void h(int i2, long j2);

        void i(int i2, int i3, List<c> list);

        void j(int i2, b bVar, f fVar);
    }

    h(e eVar, boolean z) {
        this.f5307e = eVar;
        this.f5309g = z;
        a aVar = new a(eVar);
        this.f5308f = aVar;
        this.f5310h = new d.a(4096, aVar);
    }

    private void B(b bVar, int i2, byte b2, int i3) {
        short s2 = 0;
        if (i3 != 0) {
            boolean z = (b2 & 1) != 0;
            if ((b2 & 8) != 0) {
                s2 = (short) (this.f5307e.readByte() & 255);
            }
            if ((b2 & 32) != 0) {
                L(bVar, i3);
                i2 -= 5;
            }
            bVar.g(z, i3, -1, z(a(i2, b2, s2), s2, b2, i3));
            return;
        }
        e.d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    static int E(e eVar) {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << 16) | ((eVar.readByte() & 255) << 8);
    }

    private void J(b bVar, int i2, byte b2, int i3) {
        boolean z = false;
        if (i2 != 8) {
            e.d("TYPE_PING length != 8: %s", Integer.valueOf(i2));
            throw null;
        } else if (i3 == 0) {
            int readInt = this.f5307e.readInt();
            int readInt2 = this.f5307e.readInt();
            if ((b2 & 1) != 0) {
                z = true;
            }
            bVar.d(z, readInt, readInt2);
        } else {
            e.d("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    private void L(b bVar, int i2) {
        int readInt = this.f5307e.readInt();
        bVar.e(i2, readInt & Integer.MAX_VALUE, (this.f5307e.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    private void O(b bVar, int i2, byte b2, int i3) {
        if (i2 != 5) {
            e.d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i2));
            throw null;
        } else if (i3 != 0) {
            L(bVar, i3);
        } else {
            e.d("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
    }

    private void P(b bVar, int i2, byte b2, int i3) {
        short s2 = 0;
        if (i3 != 0) {
            if ((b2 & 8) != 0) {
                s2 = (short) (this.f5307e.readByte() & 255);
            }
            bVar.i(i3, this.f5307e.readInt() & Integer.MAX_VALUE, z(a(i2 - 4, b2, s2), s2, b2, i3));
            return;
        }
        e.d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }

    private void S(b bVar, int i2, byte b2, int i3) {
        if (i2 != 4) {
            e.d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i2));
            throw null;
        } else if (i3 != 0) {
            int readInt = this.f5307e.readInt();
            b a2 = b.a(readInt);
            if (a2 != null) {
                bVar.f(i3, a2);
                return;
            }
            e.d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            throw null;
        } else {
            e.d("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
    }

    private void T(b bVar, int i2, byte b2, int i3) {
        if (i3 != 0) {
            e.d("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        } else if ((b2 & 1) != 0) {
            if (i2 == 0) {
                bVar.a();
            } else {
                e.d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        } else if (i2 % 6 == 0) {
            m mVar = new m();
            for (int i4 = 0; i4 < i2; i4 += 6) {
                short readShort = this.f5307e.readShort() & 65535;
                int readInt = this.f5307e.readInt();
                if (readShort != 2) {
                    if (readShort == 3) {
                        readShort = 4;
                    } else if (readShort == 4) {
                        readShort = 7;
                        if (readInt < 0) {
                            e.d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            throw null;
                        }
                    } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                        e.d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                        throw null;
                    }
                } else if (!(readInt == 0 || readInt == 1)) {
                    e.d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    throw null;
                }
                mVar.i(readShort, readInt);
            }
            bVar.b(false, mVar);
        } else {
            e.d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i2));
            throw null;
        }
    }

    private void U(b bVar, int i2, byte b2, int i3) {
        if (i2 == 4) {
            long readInt = ((long) this.f5307e.readInt()) & 2147483647L;
            if (readInt != 0) {
                bVar.h(i3, readInt);
                return;
            }
            e.d("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        e.d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i2));
        throw null;
    }

    static int a(int i2, byte b2, short s2) {
        if ((b2 & 8) != 0) {
            i2--;
        }
        if (s2 <= i2) {
            return (short) (i2 - s2);
        }
        e.d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s2), Integer.valueOf(i2));
        throw null;
    }

    private void o(b bVar, int i2, byte b2, int i3) {
        short s2 = 0;
        if (i3 != 0) {
            boolean z = true;
            boolean z2 = (b2 & 1) != 0;
            if ((b2 & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b2 & 8) != 0) {
                    s2 = (short) (this.f5307e.readByte() & 255);
                }
                bVar.c(z2, i3, this.f5307e, a(i2, b2, s2));
                this.f5307e.skip((long) s2);
                return;
            }
            e.d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        e.d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        throw null;
    }

    private void v(b bVar, int i2, byte b2, int i3) {
        if (i2 < 8) {
            e.d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i2));
            throw null;
        } else if (i3 == 0) {
            int readInt = this.f5307e.readInt();
            int readInt2 = this.f5307e.readInt();
            int i4 = i2 - 8;
            b a2 = b.a(readInt2);
            if (a2 != null) {
                f fVar = f.f5479i;
                if (i4 > 0) {
                    fVar = this.f5307e.k((long) i4);
                }
                bVar.j(readInt, a2, fVar);
                return;
            }
            e.d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        } else {
            e.d("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    private List<c> z(int i2, short s2, byte b2, int i3) {
        a aVar = this.f5308f;
        aVar.f5315i = i2;
        aVar.f5312f = i2;
        aVar.f5316j = s2;
        aVar.f5313g = b2;
        aVar.f5314h = i3;
        this.f5310h.k();
        return this.f5310h.e();
    }

    public boolean c(boolean z, b bVar) {
        try {
            this.f5307e.M(9);
            int E = E(this.f5307e);
            if (E < 0 || E > 16384) {
                e.d("FRAME_SIZE_ERROR: %s", Integer.valueOf(E));
                throw null;
            }
            byte readByte = (byte) (this.f5307e.readByte() & 255);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.f5307e.readByte() & 255);
                int readInt = this.f5307e.readInt() & Integer.MAX_VALUE;
                Logger logger = f5306i;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.b(true, readInt, E, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        o(bVar, E, readByte2, readInt);
                        break;
                    case 1:
                        B(bVar, E, readByte2, readInt);
                        break;
                    case 2:
                        O(bVar, E, readByte2, readInt);
                        break;
                    case 3:
                        S(bVar, E, readByte2, readInt);
                        break;
                    case 4:
                        T(bVar, E, readByte2, readInt);
                        break;
                    case 5:
                        P(bVar, E, readByte2, readInt);
                        break;
                    case 6:
                        J(bVar, E, readByte2, readInt);
                        break;
                    case 7:
                        v(bVar, E, readByte2, readInt);
                        break;
                    case 8:
                        U(bVar, E, readByte2, readInt);
                        break;
                    default:
                        this.f5307e.skip((long) E);
                        break;
                }
                return true;
            }
            e.d("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
            throw null;
        } catch (IOException unused) {
            return false;
        }
    }

    public void close() {
        this.f5307e.close();
    }

    public void g(b bVar) {
        if (!this.f5309g) {
            e eVar = this.f5307e;
            f fVar = e.a;
            f k2 = eVar.k((long) fVar.v());
            Logger logger = f5306i;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(p.e0.c.p("<< CONNECTION %s", k2.l()));
            }
            if (!fVar.equals(k2)) {
                e.d("Expected a connection header but was %s", k2.A());
                throw null;
            }
        } else if (!c(true, bVar)) {
            e.d("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }
}
