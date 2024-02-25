package f.e.c.a;

import f.e.c.a.h;
import f.e.c.a.y.y;
import f.e.c.a.z.a.c0;
import f.e.c.a.z.a.i;
import f.e.c.a.z.a.s0;
import java.security.GeneralSecurityException;

public class f<PrimitiveT, KeyProtoT extends s0> implements e<PrimitiveT> {
    private final h<KeyProtoT> a;
    private final Class<PrimitiveT> b;

    private static class a<KeyFormatProtoT extends s0, KeyProtoT extends s0> {
        final h.a<KeyFormatProtoT, KeyProtoT> a;

        a(h.a<KeyFormatProtoT, KeyProtoT> aVar) {
            this.a = aVar;
        }

        private KeyProtoT b(KeyFormatProtoT keyformatprotot) {
            this.a.d(keyformatprotot);
            return (s0) this.a.a(keyformatprotot);
        }

        /* access modifiers changed from: package-private */
        public KeyProtoT a(i iVar) {
            return b(this.a.c(iVar));
        }
    }

    public f(h<KeyProtoT> hVar, Class<PrimitiveT> cls) {
        if (hVar.h().contains(cls) || Void.class.equals(cls)) {
            this.a = hVar;
            this.b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{hVar.toString(), cls.getName()}));
    }

    private a<?, KeyProtoT> f() {
        return new a<>(this.a.e());
    }

    private PrimitiveT g(KeyProtoT keyprotot) {
        if (!Void.class.equals(this.b)) {
            this.a.i(keyprotot);
            return this.a.d(keyprotot, this.b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    public final boolean a(String str) {
        return str.equals(e());
    }

    public final PrimitiveT b(i iVar) {
        try {
            return g(this.a.g(iVar));
        } catch (c0 e2) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.a.b().getName(), e2);
        }
    }

    public final s0 c(i iVar) {
        try {
            return f().a(iVar);
        } catch (c0 e2) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.a.e().b().getName(), e2);
        }
    }

    public final y d(i iVar) {
        try {
            s0 a2 = f().a(iVar);
            y.b V = y.V();
            V.A(e());
            V.B(a2.j());
            V.z(this.a.f());
            return (y) V.a();
        } catch (c0 e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    public final String e() {
        return this.a.c();
    }
}
