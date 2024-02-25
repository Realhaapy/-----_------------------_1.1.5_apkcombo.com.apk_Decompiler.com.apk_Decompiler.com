package m.w.d;

import m.y.d.l;

public class a extends m.w.a {
    public void a(Throwable th, Throwable th2) {
        l.d(th, "cause");
        l.d(th2, "exception");
        th.addSuppressed(th2);
    }
}
