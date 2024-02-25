package m.v;

import java.io.Serializable;
import m.s;
import m.v.g;
import m.y.c.p;
import m.y.d.l;
import m.y.d.m;
import m.y.d.o;

public final class c implements g, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final g f5027e;

    /* renamed from: f  reason: collision with root package name */
    private final g.b f5028f;

    private static final class a implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: e  reason: collision with root package name */
        private final g[] f5029e;

        public a(g[] gVarArr) {
            l.d(gVarArr, "elements");
            this.f5029e = gVarArr;
        }

        private final Object readResolve() {
            g[] gVarArr = this.f5029e;
            g gVar = h.f5035e;
            int length = gVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                g gVar2 = gVarArr[i2];
                i2++;
                gVar = gVar.plus(gVar2);
            }
            return gVar;
        }
    }

    static final class b extends m implements p<String, g.b, String> {

        /* renamed from: e  reason: collision with root package name */
        public static final b f5030e = new b();

        b() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, g.b bVar) {
            l.d(str, "acc");
            l.d(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    /* renamed from: m.v.c$c  reason: collision with other inner class name */
    static final class C0144c extends m implements p<s, g.b, s> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g[] f5031e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o f5032f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0144c(g[] gVarArr, o oVar) {
            super(2);
            this.f5031e = gVarArr;
            this.f5032f = oVar;
        }

        public final void a(s sVar, g.b bVar) {
            l.d(sVar, "$noName_0");
            l.d(bVar, "element");
            g[] gVarArr = this.f5031e;
            o oVar = this.f5032f;
            int i2 = oVar.f5061e;
            oVar.f5061e = i2 + 1;
            gVarArr[i2] = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((s) obj, (g.b) obj2);
            return s.a;
        }
    }

    public c(g gVar, g.b bVar) {
        l.d(gVar, "left");
        l.d(bVar, "element");
        this.f5027e = gVar;
        this.f5028f = bVar;
    }

    private final boolean b(g.b bVar) {
        return l.a(get(bVar.getKey()), bVar);
    }

    private final boolean d(c cVar) {
        while (b(cVar.f5028f)) {
            g gVar = cVar.f5027e;
            if (!(gVar instanceof c)) {
                return b((g.b) gVar);
            }
            cVar = (c) gVar;
        }
        return false;
    }

    private final int e() {
        int i2 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f5027e;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i2;
            }
            i2++;
        }
    }

    private final Object writeReplace() {
        int e2 = e();
        g[] gVarArr = new g[e2];
        o oVar = new o();
        fold(s.a, new C0144c(gVarArr, oVar));
        if (oVar.f5061e == e2) {
            return new a(gVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.e() != e() || !cVar.d(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r2, p<? super R, ? super g.b, ? extends R> pVar) {
        l.d(pVar, "operation");
        return pVar.invoke(this.f5027e.fold(r2, pVar), this.f5028f);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        l.d(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e2 = cVar2.f5028f.get(cVar);
            if (e2 != null) {
                return e2;
            }
            g gVar = cVar2.f5027e;
            if (!(gVar instanceof c)) {
                return gVar.get(cVar);
            }
            cVar2 = (c) gVar;
        }
    }

    public int hashCode() {
        return this.f5027e.hashCode() + this.f5028f.hashCode();
    }

    public g minusKey(g.c<?> cVar) {
        l.d(cVar, "key");
        if (this.f5028f.get(cVar) != null) {
            return this.f5027e;
        }
        g minusKey = this.f5027e.minusKey(cVar);
        return minusKey == this.f5027e ? this : minusKey == h.f5035e ? this.f5028f : new c(minusKey, this.f5028f);
    }

    public g plus(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", b.f5030e)) + ']';
    }
}
