package m.v.j.a;

import java.io.Serializable;
import m.m;
import m.n;
import m.s;
import m.v.d;
import m.y.d.l;

public abstract class a implements d<Object>, e, Serializable {
    private final d<Object> completion;

    public a(d<Object> dVar) {
        this.completion = dVar;
    }

    public d<s> create(Object obj, d<?> dVar) {
        l.d(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public d<s> create(d<?> dVar) {
        l.d(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public e getCallerFrame() {
        d<Object> dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    /* access modifiers changed from: protected */
    public abstract Object invokeSuspend(Object obj);

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
    }

    public final void resumeWith(Object obj) {
        d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            d completion2 = aVar.getCompletion();
            l.b(completion2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj != d.c()) {
                    m.a aVar2 = m.f5014e;
                    m.a(obj);
                    aVar.releaseIntercepted();
                    if (completion2 instanceof a) {
                        dVar = completion2;
                    } else {
                        completion2.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                m.a aVar3 = m.f5014e;
                obj = n.a(th);
                m.a(obj);
            }
        }
    }

    public String toString() {
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        return l.j("Continuation at ", stackTraceElement);
    }
}
