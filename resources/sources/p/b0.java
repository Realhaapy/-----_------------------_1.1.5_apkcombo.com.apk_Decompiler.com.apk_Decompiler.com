package p;

import java.io.Closeable;
import java.util.Objects;
import q.c;
import q.e;

public abstract class b0 implements Closeable {

    class a extends b0 {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f5105e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f5106f;

        a(u uVar, long j2, e eVar) {
            this.f5105e = j2;
            this.f5106f = eVar;
        }

        public long a() {
            return this.f5105e;
        }

        public e o() {
            return this.f5106f;
        }
    }

    public static b0 c(u uVar, long j2, e eVar) {
        Objects.requireNonNull(eVar, "source == null");
        return new a(uVar, j2, eVar);
    }

    public static b0 g(u uVar, byte[] bArr) {
        c cVar = new c();
        cVar.c0(bArr);
        return c(uVar, (long) bArr.length, cVar);
    }

    public abstract long a();

    public void close() {
        p.e0.c.e(o());
    }

    public abstract e o();
}
