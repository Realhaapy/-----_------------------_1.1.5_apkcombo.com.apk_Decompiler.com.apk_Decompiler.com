package r.b.a.u;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import r.b.a.b;
import r.b.a.f;
import r.b.a.w.a;
import r.b.a.x.i;
import r.b.a.x.n;

public final class q extends a implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final q f5631h;

    /* renamed from: i  reason: collision with root package name */
    public static final q f5632i;

    /* renamed from: j  reason: collision with root package name */
    public static final q f5633j;

    /* renamed from: k  reason: collision with root package name */
    public static final q f5634k;

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicReference<q[]> f5635l;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: e  reason: collision with root package name */
    private final int f5636e;

    /* renamed from: f  reason: collision with root package name */
    private final transient f f5637f;

    /* renamed from: g  reason: collision with root package name */
    private final transient String f5638g;

    static {
        q qVar = new q(-1, f.Z(1868, 9, 8), "Meiji");
        f5631h = qVar;
        q qVar2 = new q(0, f.Z(1912, 7, 30), "Taisho");
        f5632i = qVar2;
        q qVar3 = new q(1, f.Z(1926, 12, 25), "Showa");
        f5633j = qVar3;
        q qVar4 = new q(2, f.Z(1989, 1, 8), "Heisei");
        f5634k = qVar4;
        f5635l = new AtomicReference<>(new q[]{qVar, qVar2, qVar3, qVar4});
    }

    private q(int i2, f fVar, String str) {
        this.f5636e = i2;
        this.f5637f = fVar;
        this.f5638g = str;
    }

    public static q[] A() {
        q[] qVarArr = f5635l.get();
        return (q[]) Arrays.copyOf(qVarArr, qVarArr.length);
    }

    private Object readResolve() {
        try {
            return w(this.f5636e);
        } catch (b e2) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e2);
            throw invalidObjectException;
        }
    }

    static q v(f fVar) {
        if (!fVar.z(f5631h.f5637f)) {
            q[] qVarArr = f5635l.get();
            for (int length = qVarArr.length - 1; length >= 0; length--) {
                q qVar = qVarArr[length];
                if (fVar.compareTo(qVar.f5637f) >= 0) {
                    return qVar;
                }
            }
            return null;
        }
        throw new b("Date too early: " + fVar);
    }

    public static q w(int i2) {
        q[] qVarArr = f5635l.get();
        if (i2 >= f5631h.f5636e && i2 <= qVarArr[qVarArr.length - 1].f5636e) {
            return qVarArr[x(i2)];
        }
        throw new b("japaneseEra is invalid");
    }

    private Object writeReplace() {
        return new u((byte) 2, this);
    }

    private static int x(int i2) {
        return i2 + 1;
    }

    static q y(DataInput dataInput) {
        return w(dataInput.readByte());
    }

    /* access modifiers changed from: package-private */
    public void B(DataOutput dataOutput) {
        dataOutput.writeByte(getValue());
    }

    public n d(i iVar) {
        r.b.a.x.a aVar = r.b.a.x.a.ERA;
        return iVar == aVar ? o.f5623h.B(aVar) : super.d(iVar);
    }

    public int getValue() {
        return this.f5636e;
    }

    public String toString() {
        return this.f5638g;
    }

    /* access modifiers changed from: package-private */
    public f u() {
        int x = x(this.f5636e);
        q[] A = A();
        return x >= A.length + -1 ? f.f5531i : A[x + 1].z().X(1);
    }

    /* access modifiers changed from: package-private */
    public f z() {
        return this.f5637f;
    }
}
