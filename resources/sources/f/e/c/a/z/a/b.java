package f.e.c.a.z.a;

import f.e.c.a.z.a.s0;

public abstract class b<MessageType extends s0> implements a1<MessageType> {
    static {
        q.b();
    }

    private MessageType c(MessageType messagetype) {
        if (messagetype == null || messagetype.l()) {
            return messagetype;
        }
        c0 a = d(messagetype).a();
        a.i(messagetype);
        throw a;
    }

    private n1 d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).p() : new n1(messagetype);
    }

    /* renamed from: e */
    public MessageType a(i iVar, q qVar) {
        MessageType f2 = f(iVar, qVar);
        c(f2);
        return f2;
    }

    public MessageType f(i iVar, q qVar) {
        MessageType messagetype;
        try {
            j s2 = iVar.s();
            messagetype = (s0) b(s2, qVar);
            s2.a(0);
            return messagetype;
        } catch (c0 e2) {
            e2.i(messagetype);
            throw e2;
        } catch (c0 e3) {
            throw e3;
        }
    }
}
