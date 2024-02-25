package p;

import java.util.Objects;
import p.e0.c;
import q.d;

public abstract class z {

    class a extends z {
        final /* synthetic */ u a;
        final /* synthetic */ int b;
        final /* synthetic */ byte[] c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f5464d;

        a(u uVar, int i2, byte[] bArr, int i3) {
            this.b = i2;
            this.c = bArr;
            this.f5464d = i3;
        }

        public long a() {
            return (long) this.b;
        }

        public u b() {
            return this.a;
        }

        public void e(d dVar) {
            dVar.e(this.c, this.f5464d, this.b);
        }
    }

    public static z c(u uVar, byte[] bArr) {
        return d(uVar, bArr, 0, bArr.length);
    }

    public static z d(u uVar, byte[] bArr, int i2, int i3) {
        Objects.requireNonNull(bArr, "content == null");
        c.d((long) bArr.length, (long) i2, (long) i3);
        return new a(uVar, i3, bArr, i2);
    }

    public abstract long a();

    public abstract u b();

    public abstract void e(d dVar);
}
