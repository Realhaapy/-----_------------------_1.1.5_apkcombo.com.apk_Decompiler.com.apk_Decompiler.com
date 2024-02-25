package f.e.d.y;

import f.e.d.a0.c;
import f.e.d.y.n.n;
import java.io.Writer;

public final class l {

    private static final class a extends Writer {

        /* renamed from: e  reason: collision with root package name */
        private final Appendable f4375e;

        /* renamed from: f  reason: collision with root package name */
        private final C0130a f4376f = new C0130a();

        /* renamed from: f.e.d.y.l$a$a  reason: collision with other inner class name */
        static class C0130a implements CharSequence {

            /* renamed from: e  reason: collision with root package name */
            char[] f4377e;

            C0130a() {
            }

            public char charAt(int i2) {
                return this.f4377e[i2];
            }

            public int length() {
                return this.f4377e.length;
            }

            public CharSequence subSequence(int i2, int i3) {
                return new String(this.f4377e, i2, i3 - i2);
            }
        }

        a(Appendable appendable) {
            this.f4375e = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(int i2) {
            this.f4375e.append((char) i2);
        }

        public void write(char[] cArr, int i2, int i3) {
            C0130a aVar = this.f4376f;
            aVar.f4377e = cArr;
            this.f4375e.append(aVar, i2, i3 + i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new f.e.d.m((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new f.e.d.t((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return f.e.d.n.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new f.e.d.t((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new f.e.d.t((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: d (r2v4 'e' f.e.d.a0.d A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static f.e.d.l a(f.e.d.a0.a r2) {
        /*
            r2.d0()     // Catch:{ EOFException -> 0x0024, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            f.e.d.v<f.e.d.l> r1 = f.e.d.y.n.n.X     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.c(r2)     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            f.e.d.l r2 = (f.e.d.l) r2     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            f.e.d.t r0 = new f.e.d.t
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            f.e.d.m r0 = new f.e.d.m
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            f.e.d.t r0 = new f.e.d.t
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            f.e.d.n r2 = f.e.d.n.a
            return r2
        L_0x002b:
            f.e.d.t r0 = new f.e.d.t
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.d.y.l.a(f.e.d.a0.a):f.e.d.l");
    }

    public static void b(f.e.d.l lVar, c cVar) {
        n.X.e(cVar, lVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }
}
