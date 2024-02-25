package m.v.j.a;

import m.v.e;
import m.v.g;
import m.y.d.l;

public abstract class d extends a {
    private final g _context;
    private transient m.v.d<Object> intercepted;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(m.v.d<Object> dVar) {
        this(dVar, dVar == null ? null : dVar.getContext());
    }

    public d(m.v.d<Object> dVar, g gVar) {
        super(dVar);
        this._context = gVar;
    }

    public g getContext() {
        g gVar = this._context;
        l.b(gVar);
        return gVar;
    }

    public final m.v.d<Object> intercepted() {
        m.v.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            e eVar = (e) getContext().get(e.b);
            dVar = eVar == null ? this : eVar.g(this);
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
        m.v.d<Object> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            g.b bVar = getContext().get(e.b);
            l.b(bVar);
            ((e) bVar).c(dVar);
        }
        this.intercepted = c.f5049e;
    }
}
