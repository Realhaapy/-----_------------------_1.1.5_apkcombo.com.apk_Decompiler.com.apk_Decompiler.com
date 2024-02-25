package f.e.a.a.i;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.j;
import com.google.android.datatransport.runtime.backends.l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.t;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.u;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.v;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.w;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.x;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;
import f.e.a.a.i.a0.c;
import f.e.a.a.i.a0.g;
import f.e.a.a.i.a0.i;
import f.e.a.a.i.a0.j.j0;
import f.e.a.a.i.a0.j.m0;
import f.e.a.a.i.a0.j.n0;
import f.e.a.a.i.a0.j.o0;
import f.e.a.a.i.a0.j.p0;
import f.e.a.a.i.a0.j.r0;
import f.e.a.a.i.a0.j.s0;
import f.e.a.a.i.a0.j.u0;
import f.e.a.a.i.u;
import f.e.a.a.i.w.b.d;
import java.util.concurrent.Executor;

final class f extends u {

    /* renamed from: e  reason: collision with root package name */
    private l.a.a<Executor> f3798e;

    /* renamed from: f  reason: collision with root package name */
    private l.a.a<Context> f3799f;

    /* renamed from: g  reason: collision with root package name */
    private l.a.a f3800g;

    /* renamed from: h  reason: collision with root package name */
    private l.a.a f3801h;

    /* renamed from: i  reason: collision with root package name */
    private l.a.a f3802i;

    /* renamed from: j  reason: collision with root package name */
    private l.a.a<String> f3803j;

    /* renamed from: k  reason: collision with root package name */
    private l.a.a<r0> f3804k;

    /* renamed from: l  reason: collision with root package name */
    private l.a.a<t> f3805l;

    /* renamed from: m  reason: collision with root package name */
    private l.a.a<y> f3806m;

    /* renamed from: n  reason: collision with root package name */
    private l.a.a<c> f3807n;

    /* renamed from: o  reason: collision with root package name */
    private l.a.a<u> f3808o;

    /* renamed from: p  reason: collision with root package name */
    private l.a.a<w> f3809p;

    /* renamed from: q  reason: collision with root package name */
    private l.a.a<t> f3810q;

    private static final class b implements u.a {
        private Context a;

        private b() {
        }

        public u a() {
            d.a(this.a, Context.class);
            return new f(this.a);
        }

        public /* bridge */ /* synthetic */ u.a b(Context context) {
            c(context);
            return this;
        }

        public b c(Context context) {
            d.b(context);
            this.a = context;
            return this;
        }
    }

    private f(Context context) {
        o(context);
    }

    public static u.a g() {
        return new b();
    }

    private void o(Context context) {
        this.f3798e = f.e.a.a.i.w.b.a.b(l.a());
        f.e.a.a.i.w.b.b a2 = f.e.a.a.i.w.b.c.a(context);
        this.f3799f = a2;
        j a3 = j.a(a2, f.e.a.a.i.c0.c.a(), f.e.a.a.i.c0.d.a());
        this.f3800g = a3;
        this.f3801h = f.e.a.a.i.w.b.a.b(l.a(this.f3799f, a3));
        this.f3802i = u0.a(this.f3799f, m0.a(), o0.a());
        this.f3803j = n0.a(this.f3799f);
        this.f3804k = f.e.a.a.i.w.b.a.b(s0.a(f.e.a.a.i.c0.c.a(), f.e.a.a.i.c0.d.a(), p0.a(), this.f3802i, this.f3803j));
        g b2 = g.b(f.e.a.a.i.c0.c.a());
        this.f3805l = b2;
        i a4 = i.a(this.f3799f, this.f3804k, b2, f.e.a.a.i.c0.d.a());
        this.f3806m = a4;
        l.a.a<Executor> aVar = this.f3798e;
        l.a.a aVar2 = this.f3801h;
        l.a.a<r0> aVar3 = this.f3804k;
        this.f3807n = f.e.a.a.i.a0.d.a(aVar, aVar2, a4, aVar3, aVar3);
        l.a.a<Context> aVar4 = this.f3799f;
        l.a.a aVar5 = this.f3801h;
        l.a.a<r0> aVar6 = this.f3804k;
        this.f3808o = v.a(aVar4, aVar5, aVar6, this.f3806m, this.f3798e, aVar6, f.e.a.a.i.c0.c.a(), f.e.a.a.i.c0.d.a(), this.f3804k);
        l.a.a<Executor> aVar7 = this.f3798e;
        l.a.a<r0> aVar8 = this.f3804k;
        this.f3809p = x.a(aVar7, aVar8, this.f3806m, aVar8);
        this.f3810q = f.e.a.a.i.w.b.a.b(v.a(f.e.a.a.i.c0.c.a(), f.e.a.a.i.c0.d.a(), this.f3807n, this.f3808o, this.f3809p));
    }

    /* access modifiers changed from: package-private */
    public j0 a() {
        return this.f3804k.get();
    }

    /* access modifiers changed from: package-private */
    public t c() {
        return this.f3810q.get();
    }
}
