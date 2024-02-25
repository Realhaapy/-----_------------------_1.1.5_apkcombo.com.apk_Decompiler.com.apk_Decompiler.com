package f.e.c.a.z.a;

final class k0 implements i1 {
    private static final r0 b = new a();
    private final r0 a;

    class a implements r0 {
        a() {
        }

        public q0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public boolean b(Class<?> cls) {
            return false;
        }
    }

    private static class b implements r0 {
        private r0[] a;

        b(r0... r0VarArr) {
            this.a = r0VarArr;
        }

        public q0 a(Class<?> cls) {
            for (r0 r0Var : this.a) {
                if (r0Var.b(cls)) {
                    return r0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        public boolean b(Class<?> cls) {
            for (r0 b : this.a) {
                if (b.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public k0() {
        this(b());
    }

    private k0(r0 r0Var) {
        b0.b(r0Var, "messageInfoFactory");
        this.a = r0Var;
    }

    private static r0 b() {
        return new b(y.c(), c());
    }

    private static r0 c() {
        try {
            return (r0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    private static boolean d(q0 q0Var) {
        return q0Var.b() == c1.PROTO2;
    }

    private static <T> h1<T> e(Class<T> cls, q0 q0Var) {
        if (z.class.isAssignableFrom(cls)) {
            if (d(q0Var)) {
                return v0.R(cls, q0Var, z0.b(), i0.b(), j1.M(), t.b(), p0.b());
            }
            return v0.R(cls, q0Var, z0.b(), i0.b(), j1.M(), (r<?>) null, p0.b());
        } else if (d(q0Var)) {
            return v0.R(cls, q0Var, z0.a(), i0.a(), j1.H(), t.a(), p0.a());
        } else {
            return v0.R(cls, q0Var, z0.a(), i0.a(), j1.I(), (r<?>) null, p0.a());
        }
    }

    public <T> h1<T> a(Class<T> cls) {
        o1<?, ?> H;
        r<?> a2;
        j1.J(cls);
        q0 a3 = this.a.a(cls);
        if (!a3.a()) {
            return e(cls, a3);
        }
        if (z.class.isAssignableFrom(cls)) {
            H = j1.M();
            a2 = t.b();
        } else {
            H = j1.H();
            a2 = t.a();
        }
        return w0.m(H, a2, a3.c());
    }
}
