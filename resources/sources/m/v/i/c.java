package m.v.i;

import m.n;
import m.s;
import m.v.d;
import m.v.g;
import m.v.j.a.h;
import m.v.j.a.j;
import m.y.c.p;
import m.y.d.l;
import m.y.d.t;

class c {

    public static final class a extends j {

        /* renamed from: e  reason: collision with root package name */
        private int f5040e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f5041f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p f5042g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Object f5043h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar, p pVar, Object obj) {
            super(dVar);
            this.f5041f = dVar;
            this.f5042g = pVar;
            this.f5043h = obj;
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i2 = this.f5040e;
            if (i2 == 0) {
                this.f5040e = 1;
                n.b(obj);
                p pVar = this.f5042g;
                t.b(pVar, 2);
                return pVar.invoke(this.f5043h, this);
            } else if (i2 == 1) {
                this.f5040e = 2;
                n.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static final class b extends m.v.j.a.d {

        /* renamed from: e  reason: collision with root package name */
        private int f5044e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f5045f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f5046g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p f5047h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Object f5048i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f5045f = dVar;
            this.f5046g = gVar;
            this.f5047h = pVar;
            this.f5048i = obj;
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i2 = this.f5044e;
            if (i2 == 0) {
                this.f5044e = 1;
                n.b(obj);
                p pVar = this.f5047h;
                t.b(pVar, 2);
                return pVar.invoke(this.f5048i, this);
            } else if (i2 == 1) {
                this.f5044e = 2;
                n.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static <R, T> d<s> a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r2, d<? super T> dVar) {
        l.d(pVar, "<this>");
        l.d(dVar, "completion");
        h.a(dVar);
        if (pVar instanceof m.v.j.a.a) {
            return ((m.v.j.a.a) pVar).create(r2, dVar);
        }
        g context = dVar.getContext();
        return context == m.v.h.f5035e ? new a(dVar, pVar, r2) : new b(dVar, context, pVar, r2);
    }

    public static <T> d<T> b(d<? super T> dVar) {
        l.d(dVar, "<this>");
        m.v.j.a.d dVar2 = dVar instanceof m.v.j.a.d ? (m.v.j.a.d) dVar : null;
        return dVar2 == null ? dVar : dVar2.intercepted();
    }
}
