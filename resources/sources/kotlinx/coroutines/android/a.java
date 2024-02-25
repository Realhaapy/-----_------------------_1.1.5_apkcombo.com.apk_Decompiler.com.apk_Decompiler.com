package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.r1;
import kotlinx.coroutines.v0;
import m.s;
import m.y.d.g;
import m.y.d.l;

public final class a extends b {
    private volatile a _immediate;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f4782f;

    /* renamed from: g  reason: collision with root package name */
    private final String f4783g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f4784h;

    /* renamed from: i  reason: collision with root package name */
    private final a f4785i;

    public a(Handler handler, String str) {
        this(handler, str, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Handler handler, String str, int i2, g gVar) {
        this(handler, (i2 & 2) != 0 ? null : str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Handler handler, String str, boolean z) {
        super((g) null);
        a aVar = null;
        this.f4782f = handler;
        this.f4783g = str;
        this.f4784h = z;
        this._immediate = z ? this : aVar;
        a aVar2 = this._immediate;
        if (aVar2 == null) {
            aVar2 = new a(handler, str, true);
            this._immediate = aVar2;
            s sVar = s.a;
        }
        this.f4785i = aVar2;
    }

    private final void X(m.v.g gVar, Runnable runnable) {
        r1.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        v0.b().T(gVar, runnable);
    }

    public void T(m.v.g gVar, Runnable runnable) {
        if (!this.f4782f.post(runnable)) {
            X(gVar, runnable);
        }
    }

    public boolean U(m.v.g gVar) {
        return !this.f4784h || !l.a(Looper.myLooper(), this.f4782f.getLooper());
    }

    /* renamed from: Y */
    public a V() {
        return this.f4785i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f4782f == this.f4782f;
    }

    public int hashCode() {
        return System.identityHashCode(this.f4782f);
    }

    public String toString() {
        String W = W();
        if (W != null) {
            return W;
        }
        String str = this.f4783g;
        if (str == null) {
            str = this.f4782f.toString();
        }
        return this.f4784h ? l.j(str, ".immediate") : str;
    }
}
