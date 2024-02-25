package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import m.y.d.l;

public final class o1 extends CancellationException implements d0<o1> {

    /* renamed from: e  reason: collision with root package name */
    public final n1 f4935e;

    public o1(String str, Throwable th, n1 n1Var) {
        super(str);
        this.f4935e = n1Var;
        if (th != null) {
            initCause(th);
        }
    }

    /* renamed from: b */
    public o1 a() {
        if (!o0.c()) {
            return null;
        }
        String message = getMessage();
        l.b(message);
        return new o1(message, this, this.f4935e);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof o1) {
                o1 o1Var = (o1) obj;
                if (!l.a(o1Var.getMessage(), getMessage()) || !l.a(o1Var.f4935e, this.f4935e) || !l.a(o1Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        if (o0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        l.b(message);
        int hashCode = ((message.hashCode() * 31) + this.f4935e.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    public String toString() {
        return super.toString() + "; job=" + this.f4935e;
    }
}
