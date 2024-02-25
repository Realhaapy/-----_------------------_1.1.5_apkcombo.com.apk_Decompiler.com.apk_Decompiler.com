package f.e.c.a.z.a;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class s1 {
    private static final Logger a = Logger.getLogger(s1.class.getName());
    private static final Unsafe b = B();
    private static final Class<?> c = d.b();

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f4170d = m(Long.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f4171e = m(Integer.TYPE);

    /* renamed from: f  reason: collision with root package name */
    private static final e f4172f = z();

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f4173g = Q();

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f4174h = P();

    /* renamed from: i  reason: collision with root package name */
    static final long f4175i = ((long) j(byte[].class));

    /* renamed from: j  reason: collision with root package name */
    static final boolean f4176j = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        /* renamed from: a */
        public Unsafe run() {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j2) {
            return s1.f4176j ? s1.q(obj, j2) : s1.r(obj, j2);
        }

        public byte d(Object obj, long j2) {
            return s1.f4176j ? s1.t(obj, j2) : s1.u(obj, j2);
        }

        public double e(Object obj, long j2) {
            return Double.longBitsToDouble(h(obj, j2));
        }

        public float f(Object obj, long j2) {
            return Float.intBitsToFloat(g(obj, j2));
        }

        public void k(Object obj, long j2, boolean z) {
            if (s1.f4176j) {
                s1.F(obj, j2, z);
            } else {
                s1.G(obj, j2, z);
            }
        }

        public void l(Object obj, long j2, byte b) {
            if (s1.f4176j) {
                s1.I(obj, j2, b);
            } else {
                s1.J(obj, j2, b);
            }
        }

        public void m(Object obj, long j2, double d2) {
            p(obj, j2, Double.doubleToLongBits(d2));
        }

        public void n(Object obj, long j2, float f2) {
            o(obj, j2, Float.floatToIntBits(f2));
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j2) {
            return s1.f4176j ? s1.q(obj, j2) : s1.r(obj, j2);
        }

        public byte d(Object obj, long j2) {
            return s1.f4176j ? s1.t(obj, j2) : s1.u(obj, j2);
        }

        public double e(Object obj, long j2) {
            return Double.longBitsToDouble(h(obj, j2));
        }

        public float f(Object obj, long j2) {
            return Float.intBitsToFloat(g(obj, j2));
        }

        public void k(Object obj, long j2, boolean z) {
            if (s1.f4176j) {
                s1.F(obj, j2, z);
            } else {
                s1.G(obj, j2, z);
            }
        }

        public void l(Object obj, long j2, byte b) {
            if (s1.f4176j) {
                s1.I(obj, j2, b);
            } else {
                s1.J(obj, j2, b);
            }
        }

        public void m(Object obj, long j2, double d2) {
            p(obj, j2, Double.doubleToLongBits(d2));
        }

        public void n(Object obj, long j2, float f2) {
            o(obj, j2, Float.floatToIntBits(f2));
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j2) {
            return this.a.getBoolean(obj, j2);
        }

        public byte d(Object obj, long j2) {
            return this.a.getByte(obj, j2);
        }

        public double e(Object obj, long j2) {
            return this.a.getDouble(obj, j2);
        }

        public float f(Object obj, long j2) {
            return this.a.getFloat(obj, j2);
        }

        public void k(Object obj, long j2, boolean z) {
            this.a.putBoolean(obj, j2, z);
        }

        public void l(Object obj, long j2, byte b) {
            this.a.putByte(obj, j2, b);
        }

        public void m(Object obj, long j2, double d2) {
            this.a.putDouble(obj, j2, d2);
        }

        public void n(Object obj, long j2, float f2) {
            this.a.putFloat(obj, j2, f2);
        }
    }

    private static abstract class e {
        Unsafe a;

        e(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j2);

        public abstract byte d(Object obj, long j2);

        public abstract double e(Object obj, long j2);

        public abstract float f(Object obj, long j2);

        public final int g(Object obj, long j2) {
            return this.a.getInt(obj, j2);
        }

        public final long h(Object obj, long j2) {
            return this.a.getLong(obj, j2);
        }

        public final Object i(Object obj, long j2) {
            return this.a.getObject(obj, j2);
        }

        public final long j(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j2, boolean z);

        public abstract void l(Object obj, long j2, byte b);

        public abstract void m(Object obj, long j2, double d2);

        public abstract void n(Object obj, long j2, float f2);

        public final void o(Object obj, long j2, int i2) {
            this.a.putInt(obj, j2, i2);
        }

        public final void p(Object obj, long j2, long j3) {
            this.a.putLong(obj, j2, j3);
        }

        public final void q(Object obj, long j2, Object obj2) {
            this.a.putObject(obj, j2, obj2);
        }
    }

    static {
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        j(cls6);
        k(cls6);
        j(cls5);
        k(cls5);
        j(cls4);
        k(cls4);
        j(cls3);
        k(cls3);
        j(cls2);
        k(cls2);
        j(cls);
        k(cls);
        o(l());
    }

    private s1() {
    }

    static Object A(Object obj, long j2) {
        return f4172f.i(obj, j2);
    }

    static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean C() {
        return f4174h;
    }

    static boolean D() {
        return f4173g;
    }

    static void E(Object obj, long j2, boolean z) {
        f4172f.k(obj, j2, z);
    }

    /* access modifiers changed from: private */
    public static void F(Object obj, long j2, boolean z) {
        I(obj, j2, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void G(Object obj, long j2, boolean z) {
        J(obj, j2, z ? (byte) 1 : 0);
    }

    static void H(byte[] bArr, long j2, byte b2) {
        f4172f.l(bArr, f4175i + j2, b2);
    }

    /* access modifiers changed from: private */
    public static void I(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int x = x(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        M(obj, j3, ((255 & b2) << i2) | (x & (~(255 << i2))));
    }

    /* access modifiers changed from: private */
    public static void J(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        M(obj, j3, ((255 & b2) << i2) | (x(obj, j3) & (~(255 << i2))));
    }

    static void K(Object obj, long j2, double d2) {
        f4172f.m(obj, j2, d2);
    }

    static void L(Object obj, long j2, float f2) {
        f4172f.n(obj, j2, f2);
    }

    static void M(Object obj, long j2, int i2) {
        f4172f.o(obj, j2, i2);
    }

    static void N(Object obj, long j2, long j3) {
        f4172f.p(obj, j2, j3);
    }

    static void O(Object obj, long j2, Object obj2) {
        f4172f.q(obj, j2, obj2);
    }

    private static boolean P() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getInt", new Class[]{cls, cls3});
            cls2.getMethod("putInt", new Class[]{cls, cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            cls2.getMethod("putLong", new Class[]{cls, cls3, cls3});
            cls2.getMethod("getObject", new Class[]{cls, cls3});
            cls2.getMethod("putObject", new Class[]{cls, cls3, cls});
            if (d.c()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, cls3});
            cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, cls3});
            cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, cls3});
            cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, cls3});
            cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static boolean Q() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (l() == null) {
                return false;
            }
            if (d.c()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls3});
            cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{cls3});
            cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls3});
            cls2.getMethod("putLong", new Class[]{cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    static <T> T i(Class<T> cls) {
        try {
            return b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static int j(Class<?> cls) {
        if (f4174h) {
            return f4172f.a(cls);
        }
        return -1;
    }

    private static int k(Class<?> cls) {
        if (f4174h) {
            return f4172f.b(cls);
        }
        return -1;
    }

    private static Field l() {
        Field n2;
        if (d.c() && (n2 = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return n2;
        }
        Field n3 = n(Buffer.class, "address");
        if (n3 == null || n3.getType() != Long.TYPE) {
            return null;
        }
        return n3;
    }

    private static boolean m(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!d.c()) {
            return false;
        }
        try {
            Class<?> cls3 = c;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f4172f) == null) {
            return -1;
        }
        return eVar.j(field);
    }

    static boolean p(Object obj, long j2) {
        return f4172f.c(obj, j2);
    }

    /* access modifiers changed from: private */
    public static boolean q(Object obj, long j2) {
        return t(obj, j2) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean r(Object obj, long j2) {
        return u(obj, j2) != 0;
    }

    static byte s(byte[] bArr, long j2) {
        return f4172f.d(bArr, f4175i + j2);
    }

    /* access modifiers changed from: private */
    public static byte t(Object obj, long j2) {
        return (byte) ((x(obj, -4 & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    /* access modifiers changed from: private */
    public static byte u(Object obj, long j2) {
        return (byte) ((x(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    static double v(Object obj, long j2) {
        return f4172f.e(obj, j2);
    }

    static float w(Object obj, long j2) {
        return f4172f.f(obj, j2);
    }

    static int x(Object obj, long j2) {
        return f4172f.g(obj, j2);
    }

    static long y(Object obj, long j2) {
        return f4172f.h(obj, j2);
    }

    private static e z() {
        Unsafe unsafe = b;
        if (unsafe == null) {
            return null;
        }
        if (!d.c()) {
            return new d(unsafe);
        }
        if (f4170d) {
            return new c(unsafe);
        }
        if (f4171e) {
            return new b(unsafe);
        }
        return null;
    }
}
