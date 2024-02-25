package f.e.c.a;

import f.e.c.a.t.e;
import f.e.c.a.y.y;
import f.e.c.a.z.a.i;
import f.e.c.a.z.a.s0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class h<KeyProtoT extends s0> {
    private final Class<KeyProtoT> a;
    private final Map<Class<?>, b<?, KeyProtoT>> b;
    private final Class<?> c;

    public static abstract class a<KeyFormatProtoT extends s0, KeyT> {
        private final Class<KeyFormatProtoT> a;

        public a(Class<KeyFormatProtoT> cls) {
            this.a = cls;
        }

        public abstract KeyT a(KeyFormatProtoT keyformatprotot);

        public final Class<KeyFormatProtoT> b() {
            return this.a;
        }

        public abstract KeyFormatProtoT c(i iVar);

        public abstract void d(KeyFormatProtoT keyformatprotot);
    }

    protected static abstract class b<PrimitiveT, KeyT> {
        private final Class<PrimitiveT> a;

        public b(Class<PrimitiveT> cls) {
            this.a = cls;
        }

        public abstract PrimitiveT a(KeyT keyt);

        /* access modifiers changed from: package-private */
        public final Class<PrimitiveT> b() {
            return this.a;
        }
    }

    @SafeVarargs
    protected h(Class<KeyProtoT> cls, b<?, KeyProtoT>... bVarArr) {
        this.a = cls;
        HashMap hashMap = new HashMap();
        int length = bVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            e.a aVar = bVarArr[i2];
            if (!hashMap.containsKey(aVar.b())) {
                hashMap.put(aVar.b(), aVar);
                i2++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + aVar.b().getCanonicalName());
            }
        }
        this.c = bVarArr.length > 0 ? bVarArr[0].b() : Void.class;
        this.b = Collections.unmodifiableMap(hashMap);
    }

    /* access modifiers changed from: package-private */
    public final Class<?> a() {
        return this.c;
    }

    public final Class<KeyProtoT> b() {
        return this.a;
    }

    public abstract String c();

    public final <P> P d(KeyProtoT keyprotot, Class<P> cls) {
        b bVar = this.b.get(cls);
        if (bVar != null) {
            return bVar.a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a<?, KeyProtoT> e();

    public abstract y.c f();

    public abstract KeyProtoT g(i iVar);

    public final Set<Class<?>> h() {
        return this.b.keySet();
    }

    public abstract void i(KeyProtoT keyprotot);
}
