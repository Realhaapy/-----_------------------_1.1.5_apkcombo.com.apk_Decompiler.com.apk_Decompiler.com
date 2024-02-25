package kotlinx.coroutines.k2.g;

import kotlinx.coroutines.r1;
import m.s;
import m.v.g;
import m.v.h;
import m.v.j.a.d;
import m.v.j.a.e;
import m.y.c.p;
import m.y.d.m;

public final class c<T> extends d implements kotlinx.coroutines.k2.c<T>, e {

    /* renamed from: e  reason: collision with root package name */
    public final kotlinx.coroutines.k2.c<T> f4864e;

    /* renamed from: f  reason: collision with root package name */
    public final g f4865f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4866g;

    /* renamed from: h  reason: collision with root package name */
    private g f4867h;

    /* renamed from: i  reason: collision with root package name */
    private m.v.d<? super s> f4868i;

    static final class a extends m implements p<Integer, g.b, Integer> {

        /* renamed from: e  reason: collision with root package name */
        public static final a f4869e = new a();

        a() {
            super(2);
        }

        public final Integer a(int i2, g.b bVar) {
            return Integer.valueOf(i2 + 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public c(kotlinx.coroutines.k2.c<? super T> cVar, g gVar) {
        super(b.f4862e, h.f5035e);
        this.f4864e = cVar;
        this.f4865f = gVar;
        this.f4866g = ((Number) gVar.fold(0, a.f4869e)).intValue();
    }

    private final void a(g gVar, g gVar2, T t) {
        if (!(gVar2 instanceof a)) {
            e.a(this, gVar);
            this.f4867h = gVar;
            return;
        }
        g((a) gVar2, t);
        throw null;
    }

    private final Object e(m.v.d<? super s> dVar, T t) {
        g context = dVar.getContext();
        r1.d(context);
        g gVar = this.f4867h;
        if (gVar != context) {
            a(context, gVar, t);
        }
        this.f4868i = dVar;
        return d.a.c(this.f4864e, t, this);
    }

    private final void g(a aVar, Object obj) {
        throw new IllegalStateException(i.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + aVar.f4860e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    public Object emit(T t, m.v.d<? super s> dVar) {
        try {
            Object e2 = e(dVar, t);
            if (e2 == d.c()) {
                m.v.j.a.h.c(dVar);
            }
            return e2 == d.c() ? e2 : s.a;
        } catch (Throwable th) {
            this.f4867h = new a(th);
            throw th;
        }
    }

    public e getCallerFrame() {
        m.v.d<? super s> dVar = this.f4868i;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        m.v.d<? super s> dVar = this.f4868i;
        g context = dVar == null ? null : dVar.getContext();
        return context == null ? h.f5035e : context;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public Object invokeSuspend(Object obj) {
        Throwable b = m.m.b(obj);
        if (b != null) {
            this.f4867h = new a(b);
        }
        m.v.d<? super s> dVar = this.f4868i;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return d.c();
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
