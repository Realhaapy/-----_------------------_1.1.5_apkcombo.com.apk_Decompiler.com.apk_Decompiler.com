package kotlinx.coroutines;

import m.s;
import m.y.c.l;

public final class z {
    public final Object a;
    public final l<Throwable, s> b;

    public z(Object obj, l<? super Throwable, s> lVar) {
        this.a = obj;
        this.b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return m.y.d.l.a(this.a, zVar.a) && m.y.d.l.a(this.b, zVar.b);
    }

    public int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.a + ", onCancellation=" + this.b + ')';
    }
}
