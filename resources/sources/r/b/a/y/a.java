package r.b.a.y;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import r.b.a.r;

final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* renamed from: e  reason: collision with root package name */
    private byte f5795e;

    /* renamed from: f  reason: collision with root package name */
    private Object f5796f;

    public a() {
    }

    a(byte b, Object obj) {
        this.f5795e = b;
        this.f5796f = obj;
    }

    static Object a(DataInput dataInput) {
        return c(dataInput.readByte(), dataInput);
    }

    static long b(DataInput dataInput) {
        byte readByte = dataInput.readByte() & 255;
        if (readByte == 255) {
            return dataInput.readLong();
        }
        return (((long) (((readByte << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    private static Object c(byte b, DataInput dataInput) {
        if (b == 1) {
            return b.k(dataInput);
        }
        if (b == 2) {
            return d.n(dataInput);
        }
        if (b == 3) {
            return e.c(dataInput);
        }
        throw new StreamCorruptedException("Unknown serialized type");
    }

    static r d(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? r.B(dataInput.readInt()) : r.B(readByte * 900);
    }

    static void e(long j2, DataOutput dataOutput) {
        if (j2 < -4575744000L || j2 >= 10413792000L || j2 % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j2);
            return;
        }
        int i2 = (int) ((j2 + 4575744000L) / 900);
        dataOutput.writeByte((i2 >>> 16) & 255);
        dataOutput.writeByte((i2 >>> 8) & 255);
        dataOutput.writeByte(i2 & 255);
    }

    private static void f(byte b, Object obj, DataOutput dataOutput) {
        dataOutput.writeByte(b);
        if (b == 1) {
            ((b) obj).l(dataOutput);
        } else if (b == 2) {
            ((d) obj).s(dataOutput);
        } else if (b == 3) {
            ((e) obj).d(dataOutput);
        } else {
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    static void g(r rVar, DataOutput dataOutput) {
        int y = rVar.y();
        int i2 = y % 900 == 0 ? y / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(y);
        }
    }

    private Object readResolve() {
        return this.f5796f;
    }

    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f5795e = readByte;
        this.f5796f = c(readByte, objectInput);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        f(this.f5795e, this.f5796f, objectOutput);
    }
}
