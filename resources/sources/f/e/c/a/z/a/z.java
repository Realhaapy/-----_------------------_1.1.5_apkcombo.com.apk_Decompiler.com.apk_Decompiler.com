package f.e.c.a.z.a;

import f.e.c.a.z.a.a;
import f.e.c.a.z.a.b0;
import f.e.c.a.z.a.e;
import f.e.c.a.z.a.s0;
import f.e.c.a.z.a.u1;
import f.e.c.a.z.a.v;
import f.e.c.a.z.a.z;
import f.e.c.a.z.a.z.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class z<MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a<MessageType, BuilderType> {
    private static Map<Object, z<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize = -1;
    protected p1 unknownFields = p1.e();

    public static abstract class a<MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.C0122a<MessageType, BuilderType> {

        /* renamed from: e  reason: collision with root package name */
        private final MessageType f4249e;

        /* renamed from: f  reason: collision with root package name */
        protected MessageType f4250f;

        /* renamed from: g  reason: collision with root package name */
        protected boolean f4251g = false;

        protected a(MessageType messagetype) {
            this.f4249e = messagetype;
            this.f4250f = (z) messagetype.u(f.NEW_MUTABLE_INSTANCE);
        }

        private void y(MessageType messagetype, MessageType messagetype2) {
            d1.a().e(messagetype).a(messagetype, messagetype2);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ a.C0122a m(a aVar) {
            w((z) aVar);
            return this;
        }

        /* renamed from: q */
        public final MessageType a() {
            MessageType r2 = o();
            if (r2.l()) {
                return r2;
            }
            throw a.C0122a.p(r2);
        }

        /* renamed from: r */
        public MessageType o() {
            if (this.f4251g) {
                return this.f4250f;
            }
            this.f4250f.C();
            this.f4251g = true;
            return this.f4250f;
        }

        /* renamed from: s */
        public BuilderType clone() {
            BuilderType E = d().i();
            E.x(o());
            return E;
        }

        /* access modifiers changed from: protected */
        public final void t() {
            if (this.f4251g) {
                u();
                this.f4251g = false;
            }
        }

        /* access modifiers changed from: protected */
        public void u() {
            MessageType messagetype = (z) this.f4250f.u(f.NEW_MUTABLE_INSTANCE);
            y(messagetype, this.f4250f);
            this.f4250f = messagetype;
        }

        /* renamed from: v */
        public MessageType d() {
            return this.f4249e;
        }

        /* access modifiers changed from: protected */
        public BuilderType w(MessageType messagetype) {
            x(messagetype);
            return this;
        }

        public BuilderType x(MessageType messagetype) {
            t();
            y(this.f4250f, messagetype);
            return this;
        }
    }

    protected static class b<T extends z<T, ?>> extends b<T> {
        private final T a;

        public b(T t) {
            this.a = t;
        }

        /* renamed from: g */
        public T b(j jVar, q qVar) {
            return z.J(this.a, jVar, qVar);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends z<MessageType, BuilderType> implements Object<MessageType, BuilderType> {
        protected v<d> extensions = v.h();

        /* access modifiers changed from: package-private */
        public v<d> N() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }
    }

    static final class d implements v.b<d> {

        /* renamed from: e  reason: collision with root package name */
        final b0.d<?> f4252e;

        /* renamed from: f  reason: collision with root package name */
        final int f4253f;

        /* renamed from: g  reason: collision with root package name */
        final u1.b f4254g;

        /* renamed from: h  reason: collision with root package name */
        final boolean f4255h;

        /* renamed from: i  reason: collision with root package name */
        final boolean f4256i;

        /* renamed from: a */
        public int compareTo(d dVar) {
            return this.f4253f - dVar.f4253f;
        }

        public int b() {
            return this.f4253f;
        }

        public b0.d<?> c() {
            return this.f4252e;
        }

        public boolean e() {
            return this.f4255h;
        }

        public u1.b i() {
            return this.f4254g;
        }

        public s0.a p(s0.a aVar, s0 s0Var) {
            a aVar2 = (a) aVar;
            aVar2.x((z) s0Var);
            return aVar2;
        }

        public u1.c q() {
            return this.f4254g.a();
        }

        public boolean r() {
            return this.f4256i;
        }
    }

    public static class e<ContainingType extends s0, Type> extends o<ContainingType, Type> {
        final s0 a;
        final d b;

        public u1.b a() {
            return this.b.i();
        }

        public s0 b() {
            return this.a;
        }

        public int c() {
            return this.b.b();
        }

        public boolean d() {
            return this.b.f4255h;
        }
    }

    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    static Object A(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static final <T extends z<T, ?>> boolean B(T t, boolean z) {
        byte byteValue = ((Byte) t.u(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f2 = d1.a().e(t).f(t);
        if (z) {
            t.v(f.SET_MEMOIZED_IS_INITIALIZED, f2 ? t : null);
        }
        return f2;
    }

    protected static <E> b0.i<E> D(b0.i<E> iVar) {
        int size = iVar.size();
        return iVar.b(size == 0 ? 10 : size * 2);
    }

    protected static Object F(s0 s0Var, String str, Object[] objArr) {
        return new f1(s0Var, str, objArr);
    }

    protected static <T extends z<T, ?>> T G(T t, i iVar, q qVar) {
        T I = I(t, iVar, qVar);
        s(I);
        return I;
    }

    protected static <T extends z<T, ?>> T H(T t, byte[] bArr, q qVar) {
        T K = K(t, bArr, 0, bArr.length, qVar);
        s(K);
        return K;
    }

    private static <T extends z<T, ?>> T I(T t, i iVar, q qVar) {
        T J;
        try {
            j s2 = iVar.s();
            J = J(t, s2, qVar);
            s2.a(0);
            return J;
        } catch (c0 e2) {
            e2.i(J);
            throw e2;
        } catch (c0 e3) {
            throw e3;
        }
    }

    static <T extends z<T, ?>> T J(T t, j jVar, q qVar) {
        T t2 = (z) t.u(f.NEW_MUTABLE_INSTANCE);
        try {
            h1 e2 = d1.a().e(t2);
            e2.d(t2, k.Q(jVar), qVar);
            e2.e(t2);
            return t2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof c0) {
                throw ((c0) e3.getCause());
            }
            c0 c0Var = new c0(e3.getMessage());
            c0Var.i(t2);
            throw c0Var;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof c0) {
                throw ((c0) e4.getCause());
            }
            throw e4;
        }
    }

    static <T extends z<T, ?>> T K(T t, byte[] bArr, int i2, int i3, q qVar) {
        T t2 = (z) t.u(f.NEW_MUTABLE_INSTANCE);
        try {
            h1 e2 = d1.a().e(t2);
            e2.b(t2, bArr, i2, i2 + i3, new e.b(qVar));
            e2.e(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e3) {
            if (e3.getCause() instanceof c0) {
                throw ((c0) e3.getCause());
            }
            c0 c0Var = new c0(e3.getMessage());
            c0Var.i(t2);
            throw c0Var;
        } catch (IndexOutOfBoundsException unused) {
            c0 j2 = c0.j();
            j2.i(t2);
            throw j2;
        }
    }

    protected static <T extends z<?, ?>> void L(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    private static <T extends z<T, ?>> T s(T t) {
        if (t == null || t.l()) {
            return t;
        }
        c0 a2 = t.p().a();
        a2.i(t);
        throw a2;
    }

    protected static <E> b0.i<E> x() {
        return e1.j();
    }

    static <T extends z<?, ?>> T y(Class<T> cls) {
        T t = (z) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (z) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            t = ((z) s1.i(cls)).d();
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    public void C() {
        d1.a().e(this).e(this);
    }

    /* renamed from: E */
    public final BuilderType i() {
        return (a) u(f.NEW_BUILDER);
    }

    /* renamed from: M */
    public final BuilderType e() {
        BuilderType buildertype = (a) u(f.NEW_BUILDER);
        buildertype.x(this);
        return buildertype;
    }

    public int b() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = d1.a().e(this).h(this);
        }
        return this.memoizedSerializedSize;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d().getClass().isInstance(obj)) {
            return false;
        }
        return d1.a().e(this).g(this, (z) obj);
    }

    public void h(l lVar) {
        d1.a().e(this).c(this, m.P(lVar));
    }

    public int hashCode() {
        int i2 = this.memoizedHashCode;
        if (i2 != 0) {
            return i2;
        }
        int j2 = d1.a().e(this).j(this);
        this.memoizedHashCode = j2;
        return j2;
    }

    public final a1<MessageType> k() {
        return (a1) u(f.GET_PARSER);
    }

    public final boolean l() {
        return B(this, true);
    }

    /* access modifiers changed from: package-private */
    public void q(int i2) {
        this.memoizedSerializedSize = i2;
    }

    /* access modifiers changed from: package-private */
    public Object r() {
        return u(f.BUILD_MESSAGE_INFO);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType t() {
        return (a) u(f.NEW_BUILDER);
    }

    public String toString() {
        return u0.e(this, super.toString());
    }

    /* access modifiers changed from: protected */
    public Object u(f fVar) {
        return w(fVar, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public Object v(f fVar, Object obj) {
        return w(fVar, obj, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object w(f fVar, Object obj, Object obj2);

    /* renamed from: z */
    public final MessageType d() {
        return (z) u(f.GET_DEFAULT_INSTANCE);
    }
}
