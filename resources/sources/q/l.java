package q;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Logger;

public final class l {
    static final Logger a = Logger.getLogger(l.class.getName());

    class a implements r {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ t f5495e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ OutputStream f5496f;

        a(t tVar, OutputStream outputStream) {
            this.f5495e = tVar;
            this.f5496f = outputStream;
        }

        public void close() {
            this.f5496f.close();
        }

        public t d() {
            return this.f5495e;
        }

        public void flush() {
            this.f5496f.flush();
        }

        public void h(c cVar, long j2) {
            u.b(cVar.f5477f, 0, j2);
            while (j2 > 0) {
                this.f5495e.f();
                o oVar = cVar.f5476e;
                int min = (int) Math.min(j2, (long) (oVar.c - oVar.b));
                this.f5496f.write(oVar.a, oVar.b, min);
                int i2 = oVar.b + min;
                oVar.b = i2;
                long j3 = (long) min;
                j2 -= j3;
                cVar.f5477f -= j3;
                if (i2 == oVar.c) {
                    cVar.f5476e = oVar.b();
                    p.a(oVar);
                }
            }
        }

        public String toString() {
            return "sink(" + this.f5496f + ")";
        }
    }

    class b implements s {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ t f5497e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ InputStream f5498f;

        b(t tVar, InputStream inputStream) {
            this.f5497e = tVar;
            this.f5498f = inputStream;
        }

        public long F(c cVar, long j2) {
            int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            } else if (i2 == 0) {
                return 0;
            } else {
                try {
                    this.f5497e.f();
                    o a0 = cVar.a0(1);
                    int read = this.f5498f.read(a0.a, a0.c, (int) Math.min(j2, (long) (8192 - a0.c)));
                    if (read == -1) {
                        return -1;
                    }
                    a0.c += read;
                    long j3 = (long) read;
                    cVar.f5477f += j3;
                    return j3;
                } catch (AssertionError e2) {
                    if (l.c(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
            }
        }

        public void close() {
            this.f5498f.close();
        }

        public t d() {
            return this.f5497e;
        }

        public String toString() {
            return "source(" + this.f5498f + ")";
        }
    }

    class c extends a {

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Socket f5499k;

        c(Socket socket) {
            this.f5499k = socket;
        }

        /* access modifiers changed from: protected */
        public IOException o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Exception} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.AssertionError} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Exception} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Exception} */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void t() {
            /*
                r5 = this;
                java.lang.String r0 = "Failed to close timed out socket "
                java.net.Socket r1 = r5.f5499k     // Catch:{ Exception -> 0x001a, AssertionError -> 0x0008 }
                r1.close()     // Catch:{ Exception -> 0x001a, AssertionError -> 0x0008 }
                goto L_0x0033
            L_0x0008:
                r1 = move-exception
                boolean r2 = q.l.c(r1)
                if (r2 == 0) goto L_0x0019
                java.util.logging.Logger r2 = q.l.a
                java.util.logging.Level r3 = java.util.logging.Level.WARNING
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                goto L_0x0024
            L_0x0019:
                throw r1
            L_0x001a:
                r1 = move-exception
                java.util.logging.Logger r2 = q.l.a
                java.util.logging.Level r3 = java.util.logging.Level.WARNING
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
            L_0x0024:
                r4.append(r0)
                java.net.Socket r0 = r5.f5499k
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.log(r3, r0, r1)
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q.l.c.t():void");
        }
    }

    private l() {
    }

    public static d a(r rVar) {
        return new m(rVar);
    }

    public static e b(s sVar) {
        return new n(sVar);
    }

    static boolean c(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static r d(OutputStream outputStream) {
        return e(outputStream, new t());
    }

    private static r e(OutputStream outputStream, t tVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (tVar != null) {
            return new a(tVar, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static r f(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            a j2 = j(socket);
            return j2.r(e(socket.getOutputStream(), j2));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static s g(InputStream inputStream) {
        return h(inputStream, new t());
    }

    private static s h(InputStream inputStream, t tVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (tVar != null) {
            return new b(tVar, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static s i(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            a j2 = j(socket);
            return j2.s(h(socket.getInputStream(), j2));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    private static a j(Socket socket) {
        return new c(socket);
    }
}
