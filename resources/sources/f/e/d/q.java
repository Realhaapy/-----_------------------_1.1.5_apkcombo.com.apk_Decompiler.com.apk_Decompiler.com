package f.e.d;

import f.e.d.y.a;
import f.e.d.y.g;
import java.math.BigInteger;

public final class q extends l {
    private final Object a;

    public q(Boolean bool) {
        a.b(bool);
        this.a = bool;
    }

    public q(Number number) {
        a.b(number);
        this.a = number;
    }

    public q(String str) {
        a.b(str);
        this.a = str;
    }

    private static boolean v(q qVar) {
        Object obj = qVar.a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.a == null) {
            return qVar.a == null;
        }
        if (v(this) && v(qVar)) {
            return t().longValue() == qVar.t().longValue();
        }
        Object obj2 = this.a;
        if (!(obj2 instanceof Number) || !(qVar.a instanceof Number)) {
            return obj2.equals(qVar.a);
        }
        double doubleValue = t().doubleValue();
        double doubleValue2 = qVar.t().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (v(this)) {
            doubleToLongBits = t().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(t().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public String k() {
        return w() ? t().toString() : u() ? ((Boolean) this.a).toString() : (String) this.a;
    }

    public boolean p() {
        return u() ? ((Boolean) this.a).booleanValue() : Boolean.parseBoolean(k());
    }

    public double q() {
        return w() ? t().doubleValue() : Double.parseDouble(k());
    }

    public int r() {
        return w() ? t().intValue() : Integer.parseInt(k());
    }

    public long s() {
        return w() ? t().longValue() : Long.parseLong(k());
    }

    public Number t() {
        Object obj = this.a;
        return obj instanceof String ? new g((String) this.a) : (Number) obj;
    }

    public boolean u() {
        return this.a instanceof Boolean;
    }

    public boolean w() {
        return this.a instanceof Number;
    }

    public boolean x() {
        return this.a instanceof String;
    }
}
