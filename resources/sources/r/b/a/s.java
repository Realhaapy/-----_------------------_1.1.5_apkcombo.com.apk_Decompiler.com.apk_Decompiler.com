package r.b.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.regex.Pattern;
import r.b.a.w.d;
import r.b.a.y.f;
import r.b.a.y.g;
import r.b.a.y.i;

final class s extends q implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f5583g = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: e  reason: collision with root package name */
    private final String f5584e;

    /* renamed from: f  reason: collision with root package name */
    private final transient f f5585f;

    s(String str, f fVar) {
        this.f5584e = str;
        this.f5585f = fVar;
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    static s w(String str, boolean z) {
        d.i(str, "zoneId");
        if (str.length() < 2 || !f5583g.matcher(str).matches()) {
            throw new b("Invalid ID for region-based ZoneId, invalid format: " + str);
        }
        f fVar = null;
        try {
            fVar = i.c(str, true);
        } catch (g e2) {
            if (str.equals("GMT0")) {
                fVar = r.f5578i.c();
            } else if (z) {
                throw e2;
            }
        }
        return new s(str, fVar);
    }

    private Object writeReplace() {
        return new n((byte) 7, this);
    }

    private static s x(String str) {
        if (str.equals("Z") || str.startsWith("+") || str.startsWith("-")) {
            throw new b("Invalid ID for region-based ZoneId, invalid format: " + str);
        } else if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
            return new s(str, r.f5578i.c());
        } else {
            if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
                r z = r.z(str.substring(3));
                if (z.y() == 0) {
                    return new s(str.substring(0, 3), z.c());
                }
                return new s(str.substring(0, 3) + z.a(), z.c());
            } else if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                return w(str, false);
            } else {
                r z2 = r.z(str.substring(2));
                if (z2.y() == 0) {
                    return new s("UT", z2.c());
                }
                return new s("UT" + z2.a(), z2.c());
            }
        }
    }

    static q y(DataInput dataInput) {
        return x(dataInput.readUTF());
    }

    public String a() {
        return this.f5584e;
    }

    public f c() {
        f fVar = this.f5585f;
        return fVar != null ? fVar : i.c(this.f5584e, false);
    }

    /* access modifiers changed from: package-private */
    public void v(DataOutput dataOutput) {
        dataOutput.writeByte(7);
        z(dataOutput);
    }

    /* access modifiers changed from: package-private */
    public void z(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f5584e);
    }
}
