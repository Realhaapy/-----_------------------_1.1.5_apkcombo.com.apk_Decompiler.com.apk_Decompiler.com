package kotlinx.coroutines.m2;

import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
import m.y.d.g;

public class c extends e1 {

    /* renamed from: f  reason: collision with root package name */
    private final int f4907f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4908g;

    /* renamed from: h  reason: collision with root package name */
    private final long f4909h;

    /* renamed from: i  reason: collision with root package name */
    private final String f4910i;

    /* renamed from: j  reason: collision with root package name */
    private a f4911j;

    public c(int i2, int i3, long j2, String str) {
        this.f4907f = i2;
        this.f4908g = i3;
        this.f4909h = j2;
        this.f4910i = str;
        this.f4911j = V();
    }

    public c(int i2, int i3, String str) {
        this(i2, i3, l.f4923d, str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i2, int i3, String str, int i4, g gVar) {
        this((i4 & 1) != 0 ? l.b : i2, (i4 & 2) != 0 ? l.c : i3, (i4 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    private final a V() {
        return new a(this.f4907f, this.f4908g, this.f4909h, this.f4910i);
    }

    public void T(m.v.g gVar, Runnable runnable) {
        try {
            a.z(this.f4911j, runnable, (j) null, false, 6, (Object) null);
        } catch (RejectedExecutionException unused) {
            q0.f4936k.T(gVar, runnable);
        }
    }

    public final void W(Runnable runnable, j jVar, boolean z) {
        try {
            this.f4911j.v(runnable, jVar, z);
        } catch (RejectedExecutionException unused) {
            q0.f4936k.l0(this.f4911j.g(runnable, jVar));
        }
    }
}
