package r.b.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;
import r.b.a.x.b;
import r.b.a.x.h;

public final class d implements h, Comparable<d>, Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final d f5524g = new d(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: e  reason: collision with root package name */
    private final long f5525e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5526f;

    static {
        BigInteger.valueOf(1000000000);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private d(long j2, int i2) {
        this.f5525e = j2;
        this.f5526f = i2;
    }

    private static d d(long j2, int i2) {
        return (((long) i2) | j2) == 0 ? f5524g : new d(j2, i2);
    }

    public static d g(long j2) {
        long j3 = j2 / 1000000000;
        int i2 = (int) (j2 % 1000000000);
        if (i2 < 0) {
            i2 += 1000000000;
            j3--;
        }
        return d(j3, i2);
    }

    public static d h(long j2) {
        return d(j2, 0);
    }

    public static d j(long j2, long j3) {
        return d(r.b.a.w.d.k(j2, r.b.a.w.d.e(j3, 1000000000)), r.b.a.w.d.g(j3, 1000000000));
    }

    static d k(DataInput dataInput) {
        return j(dataInput.readLong(), (long) dataInput.readInt());
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 1, this);
    }

    public r.b.a.x.d a(r.b.a.x.d dVar) {
        long j2 = this.f5525e;
        if (j2 != 0) {
            dVar = dVar.s(j2, b.SECONDS);
        }
        int i2 = this.f5526f;
        return i2 != 0 ? dVar.s((long) i2, b.NANOS) : dVar;
    }

    /* renamed from: c */
    public int compareTo(d dVar) {
        int b = r.b.a.w.d.b(this.f5525e, dVar.f5525e);
        return b != 0 ? b : this.f5526f - dVar.f5526f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f5525e == dVar.f5525e && this.f5526f == dVar.f5526f;
    }

    public long f() {
        return this.f5525e;
    }

    public int hashCode() {
        long j2 = this.f5525e;
        return ((int) (j2 ^ (j2 >>> 32))) + (this.f5526f * 51);
    }

    /* access modifiers changed from: package-private */
    public void l(DataOutput dataOutput) {
        dataOutput.writeLong(this.f5525e);
        dataOutput.writeInt(this.f5526f);
    }

    public String toString() {
        if (this == f5524g) {
            return "PT0S";
        }
        long j2 = this.f5525e;
        long j3 = j2 / 3600;
        int i2 = (int) ((j2 % 3600) / 60);
        int i3 = (int) (j2 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i3 == 0 && this.f5526f == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i3 >= 0 || this.f5526f <= 0) {
            sb.append(i3);
        } else if (i3 == -1) {
            sb.append("-0");
        } else {
            sb.append(i3 + 1);
        }
        if (this.f5526f > 0) {
            int length = sb.length();
            sb.append(i3 < 0 ? 2000000000 - this.f5526f : this.f5526f + 1000000000);
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}
