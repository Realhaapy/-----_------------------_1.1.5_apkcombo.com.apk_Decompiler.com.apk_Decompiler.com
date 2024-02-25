package f.e.c.a.z.a;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;

public abstract class i implements Iterable<Byte>, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public static final i f4106f = new C0123i(b0.b);

    /* renamed from: g  reason: collision with root package name */
    private static final e f4107g = (d.c() ? new j((a) null) : new c((a) null));

    /* renamed from: e  reason: collision with root package name */
    private int f4108e = 0;

    class a extends b {

        /* renamed from: e  reason: collision with root package name */
        private int f4109e = 0;

        /* renamed from: f  reason: collision with root package name */
        private final int f4110f;

        a() {
            this.f4110f = i.this.size();
        }

        public byte a() {
            int i2 = this.f4109e;
            if (i2 < this.f4110f) {
                this.f4109e = i2 + 1;
                return i.this.o(i2);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f4109e < this.f4110f;
        }
    }

    static abstract class b implements f {
        b() {
        }

        /* renamed from: b */
        public final Byte next() {
            return Byte.valueOf(a());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class c implements e {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        public byte[] a(byte[] bArr, int i2, int i3) {
            return Arrays.copyOfRange(bArr, i2, i3 + i2);
        }
    }

    private static final class d extends C0123i {
        private static final long serialVersionUID = 1;

        /* renamed from: i  reason: collision with root package name */
        private final int f4112i;

        /* renamed from: j  reason: collision with root package name */
        private final int f4113j;

        d(byte[] bArr, int i2, int i3) {
            super(bArr);
            i.j(i2, i2 + i3, bArr.length);
            this.f4112i = i2;
            this.f4113j = i3;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        /* access modifiers changed from: protected */
        public int F() {
            return this.f4112i;
        }

        public byte h(int i2) {
            i.i(i2, size());
            return this.f4114h[this.f4112i + i2];
        }

        /* access modifiers changed from: protected */
        public void n(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.f4114h, F() + i2, bArr, i3, i4);
        }

        /* access modifiers changed from: package-private */
        public byte o(int i2) {
            return this.f4114h[this.f4112i + i2];
        }

        public int size() {
            return this.f4113j;
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return i.B(w());
        }
    }

    private interface e {
        byte[] a(byte[] bArr, int i2, int i3);
    }

    public interface f extends Iterator<Byte> {
        byte a();
    }

    static final class g {
        private final l a;
        private final byte[] b;

        private g(int i2) {
            byte[] bArr = new byte[i2];
            this.b = bArr;
            this.a = l.d0(bArr);
        }

        /* synthetic */ g(int i2, a aVar) {
            this(i2);
        }

        public i a() {
            this.a.c();
            return new C0123i(this.b);
        }

        public l b() {
            return this.a;
        }
    }

    static abstract class h extends i {
        h() {
        }
    }

    /* renamed from: f.e.c.a.z.a.i$i  reason: collision with other inner class name */
    private static class C0123i extends h {
        private static final long serialVersionUID = 1;

        /* renamed from: h  reason: collision with root package name */
        protected final byte[] f4114h;

        C0123i(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f4114h = bArr;
        }

        /* access modifiers changed from: package-private */
        public final void D(h hVar) {
            hVar.a(this.f4114h, F(), size());
        }

        /* access modifiers changed from: package-private */
        public final boolean E(i iVar, int i2, int i3) {
            if (i3 <= iVar.size()) {
                int i4 = i2 + i3;
                if (i4 > iVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i2 + ", " + i3 + ", " + iVar.size());
                } else if (!(iVar instanceof C0123i)) {
                    return iVar.v(i2, i4).equals(v(0, i3));
                } else {
                    C0123i iVar2 = (C0123i) iVar;
                    byte[] bArr = this.f4114h;
                    byte[] bArr2 = iVar2.f4114h;
                    int F = F() + i3;
                    int F2 = F();
                    int F3 = iVar2.F() + i2;
                    while (F2 < F) {
                        if (bArr[F2] != bArr2[F3]) {
                            return false;
                        }
                        F2++;
                        F3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i3 + size());
            }
        }

        /* access modifiers changed from: protected */
        public int F() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i) || size() != ((i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C0123i)) {
                return obj.equals(this);
            }
            C0123i iVar = (C0123i) obj;
            int u = u();
            int u2 = iVar.u();
            if (u == 0 || u2 == 0 || u == u2) {
                return E(iVar, 0, size());
            }
            return false;
        }

        public byte h(int i2) {
            return this.f4114h[i2];
        }

        /* access modifiers changed from: protected */
        public void n(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.f4114h, i2, bArr, i3, i4);
        }

        /* access modifiers changed from: package-private */
        public byte o(int i2) {
            return this.f4114h[i2];
        }

        public final boolean p() {
            int F = F();
            return t1.n(this.f4114h, F, size() + F);
        }

        public final j s() {
            return j.h(this.f4114h, F(), size(), true);
        }

        public int size() {
            return this.f4114h.length;
        }

        /* access modifiers changed from: protected */
        public final int t(int i2, int i3, int i4) {
            return b0.i(i2, this.f4114h, F() + i3, i4);
        }

        public final i v(int i2, int i3) {
            int j2 = i.j(i2, i3, size());
            return j2 == 0 ? i.f4106f : new d(this.f4114h, F() + i2, j2);
        }

        /* access modifiers changed from: protected */
        public final String y(Charset charset) {
            return new String(this.f4114h, F(), size(), charset);
        }
    }

    private static final class j implements e {
        private j() {
        }

        /* synthetic */ j(a aVar) {
            this();
        }

        public byte[] a(byte[] bArr, int i2, int i3) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            return bArr2;
        }
    }

    i() {
    }

    private String A() {
        if (size() <= 50) {
            return m1.a(this);
        }
        return m1.a(v(0, 47)) + "...";
    }

    static i B(byte[] bArr) {
        return new C0123i(bArr);
    }

    static i C(byte[] bArr, int i2, int i3) {
        return new d(bArr, i2, i3);
    }

    static void i(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return;
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
    }

    static int j(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        } else if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
        }
    }

    public static i k(byte[] bArr) {
        return l(bArr, 0, bArr.length);
    }

    public static i l(byte[] bArr, int i2, int i3) {
        j(i2, i2 + i3, bArr.length);
        return new C0123i(f4107g.a(bArr, i2, i3));
    }

    public static i m(String str) {
        return new C0123i(str.getBytes(b0.a));
    }

    static g r(int i2) {
        return new g(i2, (a) null);
    }

    /* access modifiers changed from: package-private */
    public abstract void D(h hVar);

    public abstract boolean equals(Object obj);

    public abstract byte h(int i2);

    public final int hashCode() {
        int i2 = this.f4108e;
        if (i2 == 0) {
            int size = size();
            i2 = t(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f4108e = i2;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public abstract void n(byte[] bArr, int i2, int i3, int i4);

    /* access modifiers changed from: package-private */
    public abstract byte o(int i2);

    public abstract boolean p();

    /* renamed from: q */
    public f iterator() {
        return new a();
    }

    public abstract j s();

    public abstract int size();

    /* access modifiers changed from: protected */
    public abstract int t(int i2, int i3, int i4);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), A()});
    }

    /* access modifiers changed from: protected */
    public final int u() {
        return this.f4108e;
    }

    public abstract i v(int i2, int i3);

    public final byte[] w() {
        int size = size();
        if (size == 0) {
            return b0.b;
        }
        byte[] bArr = new byte[size];
        n(bArr, 0, 0, size);
        return bArr;
    }

    public final String x(Charset charset) {
        return size() == 0 ? "" : y(charset);
    }

    /* access modifiers changed from: protected */
    public abstract String y(Charset charset);

    public final String z() {
        return x(b0.a);
    }
}
