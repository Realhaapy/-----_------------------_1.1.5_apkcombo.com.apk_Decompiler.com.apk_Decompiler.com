package r.b.a.u;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

final class u implements Externalizable {
    private static final long serialVersionUID = 7857518227608961174L;

    /* renamed from: e  reason: collision with root package name */
    private byte f5644e;

    /* renamed from: f  reason: collision with root package name */
    private Object f5645f;

    public u() {
    }

    u(byte b, Object obj) {
        this.f5644e = b;
        this.f5645f = obj;
    }

    private static Object a(byte b, ObjectInput objectInput) {
        switch (b) {
            case 1:
                return p.U(objectInput);
            case 2:
                return q.y(objectInput);
            case 3:
                return k.w0(objectInput);
            case 4:
                return l.g(objectInput);
            case 5:
                return s.U(objectInput);
            case 6:
                return t.c(objectInput);
            case 7:
                return w.U(objectInput);
            case 8:
                return x.c(objectInput);
            case 11:
                return h.s(objectInput);
            case 12:
                return d.Q(objectInput);
            case 13:
                return g.M(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private static void b(byte b, Object obj, ObjectOutput objectOutput) {
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((p) obj).a0(objectOutput);
                return;
            case 2:
                ((q) obj).B(objectOutput);
                return;
            case 3:
                ((k) obj).A0(objectOutput);
                return;
            case 4:
                ((l) obj).o(objectOutput);
                return;
            case 5:
                ((s) obj).Y(objectOutput);
                return;
            case 6:
                ((t) obj).g(objectOutput);
                return;
            case 7:
                ((w) obj).Y(objectOutput);
                return;
            case 8:
                ((x) obj).g(objectOutput);
                return;
            case 11:
                ((h) obj).v(objectOutput);
                return;
            case 12:
                ((d) obj).writeExternal(objectOutput);
                return;
            case 13:
                ((g) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f5645f;
    }

    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f5644e = readByte;
        this.f5645f = a(readByte, objectInput);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        b(this.f5644e, this.f5645f, objectOutput);
    }
}
