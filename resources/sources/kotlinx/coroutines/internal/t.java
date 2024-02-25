package kotlinx.coroutines.internal;

import kotlinx.coroutines.x1;
import m.v.g;
import m.y.d.l;

final class t extends x1 {

    /* renamed from: f  reason: collision with root package name */
    private final Throwable f4827f;

    /* renamed from: g  reason: collision with root package name */
    private final String f4828g;

    public t(Throwable th, String str) {
        this.f4827f = th;
        this.f4828g = str;
    }

    private final Void Y() {
        String j2;
        if (this.f4827f != null) {
            String str = this.f4828g;
            String str2 = "";
            if (!(str == null || (j2 = l.j(". ", str)) == null)) {
                str2 = j2;
            }
            throw new IllegalStateException(l.j("Module with the Main dispatcher had failed to initialize", str2), this.f4827f);
        }
        s.c();
        throw null;
    }

    public /* bridge */ /* synthetic */ void T(g gVar, Runnable runnable) {
        X(gVar, runnable);
        throw null;
    }

    public boolean U(g gVar) {
        Y();
        throw null;
    }

    public x1 V() {
        return this;
    }

    public Void X(g gVar, Runnable runnable) {
        Y();
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.f4827f;
        sb.append(th != null ? l.j(", cause=", th) : "");
        sb.append(']');
        return sb.toString();
    }
}
