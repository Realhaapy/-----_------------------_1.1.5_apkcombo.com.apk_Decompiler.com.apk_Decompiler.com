package q;

import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class f implements Serializable, Comparable<f> {

    /* renamed from: h  reason: collision with root package name */
    static final char[] f5478h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: i  reason: collision with root package name */
    public static final f f5479i = m(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: e  reason: collision with root package name */
    final byte[] f5480e;

    /* renamed from: f  reason: collision with root package name */
    transient int f5481f;

    /* renamed from: g  reason: collision with root package name */
    transient String f5482g;

    f(byte[] bArr) {
        this.f5480e = bArr;
    }

    static int c(String str, int i2) {
        int length = str.length();
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            if (i4 == i2) {
                return i3;
            }
            int codePointAt = str.codePointAt(i3);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i4++;
            i3 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    public static f f(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) ((g(str.charAt(i3)) << 4) + g(str.charAt(i3 + 1)));
            }
            return m(bArr);
        } else {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
    }

    private static int g(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    private f h(String str) {
        try {
            return m(MessageDigest.getInstance(str).digest(this.f5480e));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static f j(String str) {
        if (str != null) {
            f fVar = new f(str.getBytes(u.a));
            fVar.f5482g = str;
            return fVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static f m(byte... bArr) {
        if (bArr != null) {
            return new f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        f s2 = s(objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = f.class.getDeclaredField("e");
            declaredField.setAccessible(true);
            declaredField.set(this, s2.f5480e);
        } catch (NoSuchFieldException unused) {
            throw new AssertionError();
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    public static f s(InputStream inputStream, int i2) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (i2 >= 0) {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i3, i2 - i3);
                if (read != -1) {
                    i3 += read;
                } else {
                    throw new EOFException();
                }
            }
            return new f(bArr);
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + i2);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f5480e.length);
        objectOutputStream.write(this.f5480e);
    }

    public String A() {
        String str = this.f5482g;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f5480e, u.a);
        this.f5482g = str2;
        return str2;
    }

    /* access modifiers changed from: package-private */
    public void B(c cVar) {
        byte[] bArr = this.f5480e;
        cVar.d0(bArr, 0, bArr.length);
    }

    public String a() {
        return b.a(this.f5480e);
    }

    /* renamed from: d */
    public int compareTo(f fVar) {
        int v = v();
        int v2 = fVar.v();
        int min = Math.min(v, v2);
        for (int i2 = 0; i2 < min; i2++) {
            byte k2 = k(i2) & 255;
            byte k3 = fVar.k(i2) & 255;
            if (k2 != k3) {
                return k2 < k3 ? -1 : 1;
            }
        }
        if (v == v2) {
            return 0;
        }
        return v < v2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int v = fVar.v();
            byte[] bArr = this.f5480e;
            return v == bArr.length && fVar.o(0, bArr, 0, bArr.length);
        }
    }

    public int hashCode() {
        int i2 = this.f5481f;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.f5480e);
        this.f5481f = hashCode;
        return hashCode;
    }

    public byte k(int i2) {
        return this.f5480e[i2];
    }

    public String l() {
        byte[] bArr = this.f5480e;
        char[] cArr = new char[(bArr.length * 2)];
        int i2 = 0;
        for (byte b : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = f5478h;
            cArr[i2] = cArr2[(b >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean n(int i2, f fVar, int i3, int i4) {
        return fVar.o(i3, this.f5480e, i2, i4);
    }

    public boolean o(int i2, byte[] bArr, int i3, int i4) {
        if (i2 >= 0) {
            byte[] bArr2 = this.f5480e;
            return i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && u.a(bArr2, i2, bArr, i3, i4);
        }
    }

    public f t() {
        return h("SHA-1");
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.f5480e.length == 0) {
            return "[size=0]";
        }
        String A = A();
        int c = c(A, 64);
        if (c == -1) {
            if (this.f5480e.length <= 64) {
                sb2 = new StringBuilder();
                sb2.append("[hex=");
                sb2.append(l());
                sb2.append("]");
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(this.f5480e.length);
                sb2.append(" hex=");
                sb2.append(x(0, 64).l());
                sb2.append("…]");
            }
            return sb2.toString();
        }
        String replace = A.substring(0, c).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (c < A.length()) {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(this.f5480e.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }

    public f u() {
        return h("SHA-256");
    }

    public int v() {
        return this.f5480e.length;
    }

    public final boolean w(f fVar) {
        return n(0, fVar, 0, fVar.v());
    }

    public f x(int i2, int i3) {
        if (i2 >= 0) {
            byte[] bArr = this.f5480e;
            if (i3 <= bArr.length) {
                int i4 = i3 - i2;
                if (i4 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i2 == 0 && i3 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, i2, bArr2, 0, i4);
                    return new f(bArr2);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.f5480e.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    public f y() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f5480e;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b = bArr[i2];
            if (b < 65 || b > 90) {
                i2++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i2] = (byte) (b + 32);
                for (int i3 = i2 + 1; i3 < bArr2.length; i3++) {
                    byte b2 = bArr2[i3];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i3] = (byte) (b2 + 32);
                    }
                }
                return new f(bArr2);
            }
        }
    }

    public byte[] z() {
        return (byte[]) this.f5480e.clone();
    }
}
