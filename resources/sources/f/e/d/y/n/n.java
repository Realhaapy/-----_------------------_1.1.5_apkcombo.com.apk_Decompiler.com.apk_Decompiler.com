package f.e.d.y.n;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class n {
    public static final f.e.d.v<String> A;
    public static final f.e.d.v<BigDecimal> B = new h();
    public static final f.e.d.v<BigInteger> C = new i();
    public static final f.e.d.w D;
    public static final f.e.d.v<StringBuilder> E;
    public static final f.e.d.w F;
    public static final f.e.d.v<StringBuffer> G;
    public static final f.e.d.w H;
    public static final f.e.d.v<URL> I;
    public static final f.e.d.w J;
    public static final f.e.d.v<URI> K;
    public static final f.e.d.w L;
    public static final f.e.d.v<InetAddress> M;
    public static final f.e.d.w N;
    public static final f.e.d.v<UUID> O;
    public static final f.e.d.w P;
    public static final f.e.d.v<Currency> Q;
    public static final f.e.d.w R;
    public static final f.e.d.w S = new r();
    public static final f.e.d.v<Calendar> T;
    public static final f.e.d.w U;
    public static final f.e.d.v<Locale> V;
    public static final f.e.d.w W;
    public static final f.e.d.v<f.e.d.l> X;
    public static final f.e.d.w Y;
    public static final f.e.d.w Z = new w();
    public static final f.e.d.v<Class> a;
    public static final f.e.d.w b;
    public static final f.e.d.v<BitSet> c;

    /* renamed from: d  reason: collision with root package name */
    public static final f.e.d.w f4402d;

    /* renamed from: e  reason: collision with root package name */
    public static final f.e.d.v<Boolean> f4403e;

    /* renamed from: f  reason: collision with root package name */
    public static final f.e.d.v<Boolean> f4404f = new d0();

    /* renamed from: g  reason: collision with root package name */
    public static final f.e.d.w f4405g;

    /* renamed from: h  reason: collision with root package name */
    public static final f.e.d.v<Number> f4406h;

    /* renamed from: i  reason: collision with root package name */
    public static final f.e.d.w f4407i;

    /* renamed from: j  reason: collision with root package name */
    public static final f.e.d.v<Number> f4408j;

    /* renamed from: k  reason: collision with root package name */
    public static final f.e.d.w f4409k;

    /* renamed from: l  reason: collision with root package name */
    public static final f.e.d.v<Number> f4410l;

    /* renamed from: m  reason: collision with root package name */
    public static final f.e.d.w f4411m;

    /* renamed from: n  reason: collision with root package name */
    public static final f.e.d.v<AtomicInteger> f4412n;

    /* renamed from: o  reason: collision with root package name */
    public static final f.e.d.w f4413o;

    /* renamed from: p  reason: collision with root package name */
    public static final f.e.d.v<AtomicBoolean> f4414p;

    /* renamed from: q  reason: collision with root package name */
    public static final f.e.d.w f4415q;

    /* renamed from: r  reason: collision with root package name */
    public static final f.e.d.v<AtomicIntegerArray> f4416r;

    /* renamed from: s  reason: collision with root package name */
    public static final f.e.d.w f4417s;
    public static final f.e.d.v<Number> t = new b();
    public static final f.e.d.v<Number> u = new c();
    public static final f.e.d.v<Number> v = new d();
    public static final f.e.d.v<Number> w;
    public static final f.e.d.w x;
    public static final f.e.d.v<Character> y;
    public static final f.e.d.w z;

    class a extends f.e.d.v<AtomicIntegerArray> {
        a() {
        }

        /* renamed from: f */
        public AtomicIntegerArray c(f.e.d.a0.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.L()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.V()));
                } catch (NumberFormatException e2) {
                    throw new f.e.d.t((Throwable) e2);
                }
            }
            aVar.z();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, AtomicIntegerArray atomicIntegerArray) {
            cVar.g();
            int length = atomicIntegerArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.c0((long) atomicIntegerArray.get(i2));
            }
            cVar.z();
        }
    }

    class a0 implements f.e.d.w {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Class f4418e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f.e.d.v f4419f;

        class a extends f.e.d.v<T1> {
            final /* synthetic */ Class a;

            a(Class cls) {
                this.a = cls;
            }

            public T1 c(f.e.d.a0.a aVar) {
                T1 c = a0.this.f4419f.c(aVar);
                if (c == null || this.a.isInstance(c)) {
                    return c;
                }
                throw new f.e.d.t("Expected a " + this.a.getName() + " but was " + c.getClass().getName());
            }

            public void e(f.e.d.a0.c cVar, T1 t1) {
                a0.this.f4419f.e(cVar, t1);
            }
        }

        a0(Class cls, f.e.d.v vVar) {
            this.f4418e = cls;
            this.f4419f = vVar;
        }

        public <T2> f.e.d.v<T2> create(f.e.d.f fVar, f.e.d.z.a<T2> aVar) {
            Class<? super T2> c = aVar.c();
            if (!this.f4418e.isAssignableFrom(c)) {
                return null;
            }
            return new a(c);
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f4418e.getName() + ",adapter=" + this.f4419f + "]";
        }
    }

    class b extends f.e.d.v<Number> {
        b() {
        }

        /* renamed from: f */
        public Number c(f.e.d.a0.a aVar) {
            if (aVar.d0() == f.e.d.a0.b.NULL) {
                aVar.Z();
                return null;
            }
            try {
                return Long.valueOf(aVar.W());
            } catch (NumberFormatException e2) {
                throw new f.e.d.t((Throwable) e2);
            }
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, Number number) {
            cVar.e0(number);
        }
    }

    static /* synthetic */ class b0 {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                f.e.d.a0.b[] r0 = f.e.d.a0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                f.e.d.a0.b r1 = f.e.d.a0.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.e.d.a0.b r1 = f.e.d.a0.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.e.d.a0.b r1 = f.e.d.a0.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                f.e.d.a0.b r1 = f.e.d.a0.b.NULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                f.e.d.a0.b r1 = f.e.d.a0.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                f.e.d.a0.b r1 = f.e.d.a0.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                f.e.d.a0.b r1 = f.e.d.a0.b.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0060 }
                f.e.d.a0.b r1 = f.e.d.a0.b.NAME     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006c }
                f.e.d.a0.b r1 = f.e.d.a0.b.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                f.e.d.a0.b r1 = f.e.d.a0.b.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.d.y.n.n.b0.<clinit>():void");
        }
    }

    class c extends f.e.d.v<Number> {
        c() {
        }

        /* renamed from: f */
        public Number c(f.e.d.a0.a aVar) {
            if (aVar.d0() != f.e.d.a0.b.NULL) {
                return Float.valueOf((float) aVar.U());
            }
            aVar.Z();
            return null;
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, Number number) {
            cVar.e0(number);
        }
    }

    class c0 extends f.e.d.v<Boolean> {
        c0() {
        }

        /* renamed from: f */
        public Boolean c(f.e.d.a0.a aVar) {
            f.e.d.a0.b d0 = aVar.d0();
            if (d0 != f.e.d.a0.b.NULL) {
                return d0 == f.e.d.a0.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.b0())) : Boolean.valueOf(aVar.T());
            }
            aVar.Z();
            return null;
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, Boolean bool) {
            cVar.d0(bool);
        }
    }

    class d extends f.e.d.v<Number> {
        d() {
        }

        /* renamed from: f */
        public Number c(f.e.d.a0.a aVar) {
            if (aVar.d0() != f.e.d.a0.b.NULL) {
                return Double.valueOf(aVar.U());
            }
            aVar.Z();
            return null;
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, Number number) {
            cVar.e0(number);
        }
    }

    class d0 extends f.e.d.v<Boolean> {
        d0() {
        }

        /* renamed from: f */
        public Boolean c(f.e.d.a0.a aVar) {
            if (aVar.d0() != f.e.d.a0.b.NULL) {
                return Boolean.valueOf(aVar.b0());
            }
            aVar.Z();
            return null;
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, Boolean bool) {
            cVar.f0(bool == null ? "null" : bool.toString());
        }
    }

    class e extends f.e.d.v<Number> {
        e() {
        }

        /* renamed from: f */
        public Number c(f.e.d.a0.a aVar) {
            f.e.d.a0.b d0 = aVar.d0();
            int i2 = b0.a[d0.ordinal()];
            if (i2 == 1 || i2 == 3) {
                return new f.e.d.y.g(aVar.b0());
            }
            if (i2 == 4) {
                aVar.Z();
                return null;
            }
            throw new f.e.d.t("Expecting number, got: " + d0);
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, Number number) {
            cVar.e0(number);
        }
    }

    class e0 extends f.e.d.v<Number> {
        e0() {
        }

        /* renamed from: f */
        public Number c(f.e.d.a0.a aVar) {
            if (aVar.d0() == f.e.d.a0.b.NULL) {
                aVar.Z();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.V());
            } catch (NumberFormatException e2) {
                throw new f.e.d.t((Throwable) e2);
            }
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, Number number) {
            cVar.e0(number);
        }
    }

    class f extends f.e.d.v<Character> {
        f() {
        }

        /* renamed from: f */
        public Character c(f.e.d.a0.a aVar) {
            if (aVar.d0() == f.e.d.a0.b.NULL) {
                aVar.Z();
                return null;
            }
            String b0 = aVar.b0();
            if (b0.length() == 1) {
                return Character.valueOf(b0.charAt(0));
            }
            throw new f.e.d.t("Expecting character, got: " + b0);
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, Character ch) {
            cVar.f0(ch == null ? null : String.valueOf(ch));
        }
    }

    class f0 extends f.e.d.v<Number> {
        f0() {
        }

        /* renamed from: f */
        public Number c(f.e.d.a0.a aVar) {
            if (aVar.d0() == f.e.d.a0.b.NULL) {
                aVar.Z();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.V());
            } catch (NumberFormatException e2) {
                throw new f.e.d.t((Throwable) e2);
            }
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, Number number) {
            cVar.e0(number);
        }
    }

    class g extends f.e.d.v<String> {
        g() {
        }

        /* renamed from: f */
        public String c(f.e.d.a0.a aVar) {
            f.e.d.a0.b d0 = aVar.d0();
            if (d0 != f.e.d.a0.b.NULL) {
                return d0 == f.e.d.a0.b.BOOLEAN ? Boolean.toString(aVar.T()) : aVar.b0();
            }
            aVar.Z();
            return null;
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, String str) {
            cVar.f0(str);
        }
    }

    class g0 extends f.e.d.v<Number> {
        g0() {
        }

        /* renamed from: f */
        public Number c(f.e.d.a0.a aVar) {
            if (aVar.d0() == f.e.d.a0.b.NULL) {
                aVar.Z();
                return null;
            }
            try {
                return Integer.valueOf(aVar.V());
            } catch (NumberFormatException e2) {
                throw new f.e.d.t((Throwable) e2);
            }
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, Number number) {
            cVar.e0(number);
        }
    }

    class h extends f.e.d.v<BigDecimal> {
        h() {
        }

        /* renamed from: f */
        public BigDecimal c(f.e.d.a0.a aVar) {
            if (aVar.d0() == f.e.d.a0.b.NULL) {
                aVar.Z();
                return null;
            }
            try {
                return new BigDecimal(aVar.b0());
            } catch (NumberFormatException e2) {
                throw new f.e.d.t((Throwable) e2);
            }
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, BigDecimal bigDecimal) {
            cVar.e0(bigDecimal);
        }
    }

    class h0 extends f.e.d.v<AtomicInteger> {
        h0() {
        }

        /* renamed from: f */
        public AtomicInteger c(f.e.d.a0.a aVar) {
            try {
                return new AtomicInteger(aVar.V());
            } catch (NumberFormatException e2) {
                throw new f.e.d.t((Throwable) e2);
            }
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, AtomicInteger atomicInteger) {
            cVar.c0((long) atomicInteger.get());
        }
    }

    class i extends f.e.d.v<BigInteger> {
        i() {
        }

        /* renamed from: f */
        public BigInteger c(f.e.d.a0.a aVar) {
            if (aVar.d0() == f.e.d.a0.b.NULL) {
                aVar.Z();
                return null;
            }
            try {
                return new BigInteger(aVar.b0());
            } catch (NumberFormatException e2) {
                throw new f.e.d.t((Throwable) e2);
            }
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, BigInteger bigInteger) {
            cVar.e0(bigInteger);
        }
    }

    class i0 extends f.e.d.v<AtomicBoolean> {
        i0() {
        }

        /* renamed from: f */
        public AtomicBoolean c(f.e.d.a0.a aVar) {
            return new AtomicBoolean(aVar.T());
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, AtomicBoolean atomicBoolean) {
            cVar.g0(atomicBoolean.get());
        }
    }

    class j extends f.e.d.v<StringBuilder> {
        j() {
        }

        /* renamed from: f */
        public StringBuilder c(f.e.d.a0.a aVar) {
            if (aVar.d0() != f.e.d.a0.b.NULL) {
                return new StringBuilder(aVar.b0());
            }
            aVar.Z();
            return null;
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, StringBuilder sb) {
            cVar.f0(sb == null ? null : sb.toString());
        }
    }

    private static final class j0<T extends Enum<T>> extends f.e.d.v<T> {
        private final Map<String, T> a = new HashMap();
        private final Map<T, String> b = new HashMap();

        class a implements PrivilegedAction<Void> {
            final /* synthetic */ Field a;

            a(j0 j0Var, Field field) {
                this.a = field;
            }

            /* renamed from: a */
            public Void run() {
                this.a.setAccessible(true);
                return null;
            }
        }

        public j0(Class<T> cls) {
            try {
                for (Field field : cls.getDeclaredFields()) {
                    if (field.isEnumConstant()) {
                        AccessController.doPrivileged(new a(this, field));
                        Enum enumR = (Enum) field.get((Object) null);
                        String name = enumR.name();
                        f.e.d.x.c cVar = (f.e.d.x.c) field.getAnnotation(f.e.d.x.c.class);
                        if (cVar != null) {
                            name = cVar.value();
                            for (String put : cVar.alternate()) {
                                this.a.put(put, enumR);
                            }
                        }
                        this.a.put(name, enumR);
                        this.b.put(enumR, name);
                    }
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: f */
        public T c(f.e.d.a0.a aVar) {
            if (aVar.d0() != f.e.d.a0.b.NULL) {
                return (Enum) this.a.get(aVar.b0());
            }
            aVar.Z();
            return null;
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, T t) {
            cVar.f0(t == null ? null : this.b.get(t));
        }
    }

    class k extends f.e.d.v<Class> {
        k() {
        }

        public /* bridge */ /* synthetic */ Object c(f.e.d.a0.a aVar) {
            f(aVar);
            throw null;
        }

        public /* bridge */ /* synthetic */ void e(f.e.d.a0.c cVar, Object obj) {
            g(cVar, (Class) obj);
            throw null;
        }

        public Class f(f.e.d.a0.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public void g(f.e.d.a0.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    class l extends f.e.d.v<StringBuffer> {
        l() {
        }

        /* renamed from: f */
        public StringBuffer c(f.e.d.a0.a aVar) {
            if (aVar.d0() != f.e.d.a0.b.NULL) {
                return new StringBuffer(aVar.b0());
            }
            aVar.Z();
            return null;
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, StringBuffer stringBuffer) {
            cVar.f0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    class m extends f.e.d.v<URL> {
        m() {
        }

        /* renamed from: f */
        public URL c(f.e.d.a0.a aVar) {
            if (aVar.d0() == f.e.d.a0.b.NULL) {
                aVar.Z();
                return null;
            }
            String b0 = aVar.b0();
            if ("null".equals(b0)) {
                return null;
            }
            return new URL(b0);
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, URL url) {
            cVar.f0(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: f.e.d.y.n.n$n  reason: collision with other inner class name */
    class C0132n extends f.e.d.v<URI> {
        C0132n() {
        }

        /* renamed from: f */
        public URI c(f.e.d.a0.a aVar) {
            if (aVar.d0() == f.e.d.a0.b.NULL) {
                aVar.Z();
                return null;
            }
            try {
                String b0 = aVar.b0();
                if ("null".equals(b0)) {
                    return null;
                }
                return new URI(b0);
            } catch (URISyntaxException e2) {
                throw new f.e.d.m((Throwable) e2);
            }
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, URI uri) {
            cVar.f0(uri == null ? null : uri.toASCIIString());
        }
    }

    class o extends f.e.d.v<InetAddress> {
        o() {
        }

        /* renamed from: f */
        public InetAddress c(f.e.d.a0.a aVar) {
            if (aVar.d0() != f.e.d.a0.b.NULL) {
                return InetAddress.getByName(aVar.b0());
            }
            aVar.Z();
            return null;
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, InetAddress inetAddress) {
            cVar.f0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    class p extends f.e.d.v<UUID> {
        p() {
        }

        /* renamed from: f */
        public UUID c(f.e.d.a0.a aVar) {
            if (aVar.d0() != f.e.d.a0.b.NULL) {
                return UUID.fromString(aVar.b0());
            }
            aVar.Z();
            return null;
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, UUID uuid) {
            cVar.f0(uuid == null ? null : uuid.toString());
        }
    }

    class q extends f.e.d.v<Currency> {
        q() {
        }

        /* renamed from: f */
        public Currency c(f.e.d.a0.a aVar) {
            return Currency.getInstance(aVar.b0());
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, Currency currency) {
            cVar.f0(currency.getCurrencyCode());
        }
    }

    class r implements f.e.d.w {

        class a extends f.e.d.v<Timestamp> {
            final /* synthetic */ f.e.d.v a;

            a(r rVar, f.e.d.v vVar) {
                this.a = vVar;
            }

            /* renamed from: f */
            public Timestamp c(f.e.d.a0.a aVar) {
                Date date = (Date) this.a.c(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            /* renamed from: g */
            public void e(f.e.d.a0.c cVar, Timestamp timestamp) {
                this.a.e(cVar, timestamp);
            }
        }

        r() {
        }

        public <T> f.e.d.v<T> create(f.e.d.f fVar, f.e.d.z.a<T> aVar) {
            if (aVar.c() != Timestamp.class) {
                return null;
            }
            return new a(this, fVar.k(Date.class));
        }
    }

    class s extends f.e.d.v<Calendar> {
        s() {
        }

        /* renamed from: f */
        public Calendar c(f.e.d.a0.a aVar) {
            if (aVar.d0() == f.e.d.a0.b.NULL) {
                aVar.Z();
                return null;
            }
            aVar.c();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (aVar.d0() != f.e.d.a0.b.END_OBJECT) {
                String X = aVar.X();
                int V = aVar.V();
                if ("year".equals(X)) {
                    i2 = V;
                } else if ("month".equals(X)) {
                    i3 = V;
                } else if ("dayOfMonth".equals(X)) {
                    i4 = V;
                } else if ("hourOfDay".equals(X)) {
                    i5 = V;
                } else if ("minute".equals(X)) {
                    i6 = V;
                } else if ("second".equals(X)) {
                    i7 = V;
                }
            }
            aVar.B();
            return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, Calendar calendar) {
            if (calendar == null) {
                cVar.S();
                return;
            }
            cVar.o();
            cVar.O("year");
            cVar.c0((long) calendar.get(1));
            cVar.O("month");
            cVar.c0((long) calendar.get(2));
            cVar.O("dayOfMonth");
            cVar.c0((long) calendar.get(5));
            cVar.O("hourOfDay");
            cVar.c0((long) calendar.get(11));
            cVar.O("minute");
            cVar.c0((long) calendar.get(12));
            cVar.O("second");
            cVar.c0((long) calendar.get(13));
            cVar.B();
        }
    }

    class t extends f.e.d.v<Locale> {
        t() {
        }

        /* renamed from: f */
        public Locale c(f.e.d.a0.a aVar) {
            Locale locale;
            String str = null;
            if (aVar.d0() == f.e.d.a0.b.NULL) {
                aVar.Z();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.b0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str == null) {
                return locale;
            }
            locale = new Locale(nextToken, nextToken2, str);
            return locale;
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, Locale locale) {
            cVar.f0(locale == null ? null : locale.toString());
        }
    }

    class u extends f.e.d.v<f.e.d.l> {
        u() {
        }

        /* renamed from: f */
        public f.e.d.l c(f.e.d.a0.a aVar) {
            switch (b0.a[aVar.d0().ordinal()]) {
                case 1:
                    return new f.e.d.q((Number) new f.e.d.y.g(aVar.b0()));
                case 2:
                    return new f.e.d.q(Boolean.valueOf(aVar.T()));
                case 3:
                    return new f.e.d.q(aVar.b0());
                case 4:
                    aVar.Z();
                    return f.e.d.n.a;
                case 5:
                    f.e.d.i iVar = new f.e.d.i();
                    aVar.a();
                    while (aVar.L()) {
                        iVar.p(c(aVar));
                    }
                    aVar.z();
                    return iVar;
                case 6:
                    f.e.d.o oVar = new f.e.d.o();
                    aVar.c();
                    while (aVar.L()) {
                        oVar.p(aVar.X(), c(aVar));
                    }
                    aVar.B();
                    return oVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, f.e.d.l lVar) {
            if (lVar == null || lVar.m()) {
                cVar.S();
            } else if (lVar.o()) {
                f.e.d.q j2 = lVar.j();
                if (j2.w()) {
                    cVar.e0(j2.t());
                } else if (j2.u()) {
                    cVar.g0(j2.p());
                } else {
                    cVar.f0(j2.k());
                }
            } else if (lVar.l()) {
                cVar.g();
                Iterator<f.e.d.l> it = lVar.h().iterator();
                while (it.hasNext()) {
                    e(cVar, it.next());
                }
                cVar.z();
            } else if (lVar.n()) {
                cVar.o();
                for (Map.Entry next : lVar.i().q()) {
                    cVar.O((String) next.getKey());
                    e(cVar, (f.e.d.l) next.getValue());
                }
                cVar.B();
            } else {
                throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
            }
        }
    }

    class v extends f.e.d.v<BitSet> {
        v() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
            if (r8.V() != 0) goto L_0x0069;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.BitSet c(f.e.d.a0.a r8) {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.a()
                f.e.d.a0.b r1 = r8.d0()
                r2 = 0
                r3 = 0
            L_0x000e:
                f.e.d.a0.b r4 = f.e.d.a0.b.END_ARRAY
                if (r1 == r4) goto L_0x0075
                int[] r4 = f.e.d.y.n.n.b0.a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L_0x0063
                r6 = 2
                if (r4 == r6) goto L_0x005e
                r6 = 3
                if (r4 != r6) goto L_0x0047
                java.lang.String r1 = r8.b0()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0030 }
                if (r1 == 0) goto L_0x002e
                goto L_0x0069
            L_0x002e:
                r5 = 0
                goto L_0x0069
            L_0x0030:
                f.e.d.t r8 = new f.e.d.t
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x0047:
                f.e.d.t r8 = new f.e.d.t
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x005e:
                boolean r5 = r8.T()
                goto L_0x0069
            L_0x0063:
                int r1 = r8.V()
                if (r1 == 0) goto L_0x002e
            L_0x0069:
                if (r5 == 0) goto L_0x006e
                r0.set(r3)
            L_0x006e:
                int r3 = r3 + 1
                f.e.d.a0.b r1 = r8.d0()
                goto L_0x000e
            L_0x0075:
                r8.z()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.d.y.n.n.v.c(f.e.d.a0.a):java.util.BitSet");
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, BitSet bitSet) {
            cVar.g();
            int length = bitSet.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.c0(bitSet.get(i2) ? 1 : 0);
            }
            cVar.z();
        }
    }

    class w implements f.e.d.w {
        w() {
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [f.e.d.z.a, f.e.d.z.a<T>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> f.e.d.v<T> create(f.e.d.f r2, f.e.d.z.a<T> r3) {
            /*
                r1 = this;
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                java.lang.Class r3 = r3.c()
                boolean r0 = r2.isAssignableFrom(r3)
                if (r0 == 0) goto L_0x001f
                if (r3 != r2) goto L_0x000f
                goto L_0x001f
            L_0x000f:
                boolean r2 = r3.isEnum()
                if (r2 != 0) goto L_0x0019
                java.lang.Class r3 = r3.getSuperclass()
            L_0x0019:
                f.e.d.y.n.n$j0 r2 = new f.e.d.y.n.n$j0
                r2.<init>(r3)
                return r2
            L_0x001f:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.d.y.n.n.w.create(f.e.d.f, f.e.d.z.a):f.e.d.v");
        }
    }

    class x implements f.e.d.w {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Class f4420e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f.e.d.v f4421f;

        x(Class cls, f.e.d.v vVar) {
            this.f4420e = cls;
            this.f4421f = vVar;
        }

        public <T> f.e.d.v<T> create(f.e.d.f fVar, f.e.d.z.a<T> aVar) {
            if (aVar.c() == this.f4420e) {
                return this.f4421f;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f4420e.getName() + ",adapter=" + this.f4421f + "]";
        }
    }

    class y implements f.e.d.w {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Class f4422e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Class f4423f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f.e.d.v f4424g;

        y(Class cls, Class cls2, f.e.d.v vVar) {
            this.f4422e = cls;
            this.f4423f = cls2;
            this.f4424g = vVar;
        }

        public <T> f.e.d.v<T> create(f.e.d.f fVar, f.e.d.z.a<T> aVar) {
            Class<? super T> c = aVar.c();
            if (c == this.f4422e || c == this.f4423f) {
                return this.f4424g;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f4423f.getName() + "+" + this.f4422e.getName() + ",adapter=" + this.f4424g + "]";
        }
    }

    class z implements f.e.d.w {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Class f4425e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Class f4426f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f.e.d.v f4427g;

        z(Class cls, Class cls2, f.e.d.v vVar) {
            this.f4425e = cls;
            this.f4426f = cls2;
            this.f4427g = vVar;
        }

        public <T> f.e.d.v<T> create(f.e.d.f fVar, f.e.d.z.a<T> aVar) {
            Class<? super T> c = aVar.c();
            if (c == this.f4425e || c == this.f4426f) {
                return this.f4427g;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f4425e.getName() + "+" + this.f4426f.getName() + ",adapter=" + this.f4427g + "]";
        }
    }

    static {
        f.e.d.v<Class> b2 = new k().b();
        a = b2;
        b = a(Class.class, b2);
        f.e.d.v<BitSet> b3 = new v().b();
        c = b3;
        f4402d = a(BitSet.class, b3);
        c0 c0Var = new c0();
        f4403e = c0Var;
        f4405g = b(Boolean.TYPE, Boolean.class, c0Var);
        e0 e0Var = new e0();
        f4406h = e0Var;
        f4407i = b(Byte.TYPE, Byte.class, e0Var);
        f0 f0Var = new f0();
        f4408j = f0Var;
        f4409k = b(Short.TYPE, Short.class, f0Var);
        g0 g0Var = new g0();
        f4410l = g0Var;
        f4411m = b(Integer.TYPE, Integer.class, g0Var);
        f.e.d.v<AtomicInteger> b4 = new h0().b();
        f4412n = b4;
        f4413o = a(AtomicInteger.class, b4);
        f.e.d.v<AtomicBoolean> b5 = new i0().b();
        f4414p = b5;
        f4415q = a(AtomicBoolean.class, b5);
        f.e.d.v<AtomicIntegerArray> b6 = new a().b();
        f4416r = b6;
        f4417s = a(AtomicIntegerArray.class, b6);
        e eVar = new e();
        w = eVar;
        x = a(Number.class, eVar);
        f fVar = new f();
        y = fVar;
        z = b(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        A = gVar;
        D = a(String.class, gVar);
        j jVar = new j();
        E = jVar;
        F = a(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = a(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = a(URL.class, mVar);
        C0132n nVar = new C0132n();
        K = nVar;
        L = a(URI.class, nVar);
        o oVar = new o();
        M = oVar;
        N = d(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = a(UUID.class, pVar);
        f.e.d.v<Currency> b7 = new q().b();
        Q = b7;
        R = a(Currency.class, b7);
        s sVar = new s();
        T = sVar;
        U = c(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        V = tVar;
        W = a(Locale.class, tVar);
        u uVar = new u();
        X = uVar;
        Y = d(f.e.d.l.class, uVar);
    }

    public static <TT> f.e.d.w a(Class<TT> cls, f.e.d.v<TT> vVar) {
        return new x(cls, vVar);
    }

    public static <TT> f.e.d.w b(Class<TT> cls, Class<TT> cls2, f.e.d.v<? super TT> vVar) {
        return new y(cls, cls2, vVar);
    }

    public static <TT> f.e.d.w c(Class<TT> cls, Class<? extends TT> cls2, f.e.d.v<? super TT> vVar) {
        return new z(cls, cls2, vVar);
    }

    public static <T1> f.e.d.w d(Class<T1> cls, f.e.d.v<T1> vVar) {
        return new a0(cls, vVar);
    }
}
