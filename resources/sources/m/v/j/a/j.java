package m.v.j.a;

import m.v.d;
import m.v.g;
import m.v.h;

public abstract class j extends a {
    public j(d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == h.f5035e)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public g getContext() {
        return h.f5035e;
    }
}
