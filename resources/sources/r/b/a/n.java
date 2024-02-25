package r.b.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

final class n implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: e  reason: collision with root package name */
    private byte f5571e;

    /* renamed from: f  reason: collision with root package name */
    private Object f5572f;

    public n() {
    }

    n(byte b, Object obj) {
        this.f5571e = b;
        this.f5572f = obj;
    }

    static Object a(DataInput dataInput) {
        return b(dataInput.readByte(), dataInput);
    }

    private static Object b(byte b, DataInput dataInput) {
        if (b == 64) {
            return j.y(dataInput);
        }
        switch (b) {
            case 1:
                return d.k(dataInput);
            case 2:
                return e.I(dataInput);
            case 3:
                return f.j0(dataInput);
            case 4:
                return g.i0(dataInput);
            case 5:
                return h.P(dataInput);
            case 6:
                return t.d0(dataInput);
            case 7:
                return s.y(dataInput);
            case 8:
                return r.D(dataInput);
            default:
                switch (b) {
                    case 66:
                        return l.z(dataInput);
                    case 67:
                        return o.A(dataInput);
                    case 68:
                        return p.C(dataInput);
                    case 69:
                        return k.C(dataInput);
                    default:
                        throw new StreamCorruptedException("Unknown serialized type");
                }
        }
    }

    static void c(byte b, Object obj, DataOutput dataOutput) {
        dataOutput.writeByte(b);
        if (b != 64) {
            switch (b) {
                case 1:
                    ((d) obj).l(dataOutput);
                    return;
                case 2:
                    ((e) obj).M(dataOutput);
                    return;
                case 3:
                    ((f) obj).r0(dataOutput);
                    return;
                case 4:
                    ((g) obj).n0(dataOutput);
                    return;
                case 5:
                    ((h) obj).Y(dataOutput);
                    return;
                case 6:
                    ((t) obj).m0(dataOutput);
                    return;
                case 7:
                    ((s) obj).z(dataOutput);
                    return;
                case 8:
                    ((r) obj).G(dataOutput);
                    return;
                default:
                    switch (b) {
                        case 66:
                            ((l) obj).E(dataOutput);
                            return;
                        case 67:
                            ((o) obj).D(dataOutput);
                            return;
                        case 68:
                            ((p) obj).I(dataOutput);
                            return;
                        case 69:
                            ((k) obj).K(dataOutput);
                            return;
                        default:
                            throw new InvalidClassException("Unknown serialized type");
                    }
            }
        } else {
            ((j) obj).z(dataOutput);
        }
    }

    private Object readResolve() {
        return this.f5572f;
    }

    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f5571e = readByte;
        this.f5572f = b(readByte, objectInput);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        c(this.f5571e, this.f5572f, objectOutput);
    }
}
