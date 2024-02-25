package f.e.d;

import f.e.d.y.l;
import f.e.d.y.n.g;
import f.e.d.y.n.h;
import f.e.d.y.n.i;
import f.e.d.y.n.j;
import f.e.d.y.n.k;
import f.e.d.y.n.n;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class f {

    /* renamed from: m  reason: collision with root package name */
    private static final f.e.d.z.a<?> f4309m = f.e.d.z.a.a(Object.class);
    private final ThreadLocal<Map<f.e.d.z.a<?>, C0127f<?>>> a = new ThreadLocal<>();
    private final Map<f.e.d.z.a<?>, v<?>> b = new ConcurrentHashMap();
    private final f.e.d.y.c c;

    /* renamed from: d  reason: collision with root package name */
    private final f.e.d.y.n.d f4310d;

    /* renamed from: e  reason: collision with root package name */
    final List<w> f4311e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f4312f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f4313g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f4314h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f4315i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f4316j;

    /* renamed from: k  reason: collision with root package name */
    final List<w> f4317k;

    /* renamed from: l  reason: collision with root package name */
    final List<w> f4318l;

    class a extends v<Number> {
        a(f fVar) {
        }

        /* renamed from: f */
        public Double c(f.e.d.a0.a aVar) {
            if (aVar.d0() != f.e.d.a0.b.NULL) {
                return Double.valueOf(aVar.U());
            }
            aVar.Z();
            return null;
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, Number number) {
            if (number == null) {
                cVar.S();
                return;
            }
            f.d(number.doubleValue());
            cVar.e0(number);
        }
    }

    class b extends v<Number> {
        b(f fVar) {
        }

        /* renamed from: f */
        public Float c(f.e.d.a0.a aVar) {
            if (aVar.d0() != f.e.d.a0.b.NULL) {
                return Float.valueOf((float) aVar.U());
            }
            aVar.Z();
            return null;
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, Number number) {
            if (number == null) {
                cVar.S();
                return;
            }
            f.d((double) number.floatValue());
            cVar.e0(number);
        }
    }

    class c extends v<Number> {
        c() {
        }

        /* renamed from: f */
        public Number c(f.e.d.a0.a aVar) {
            if (aVar.d0() != f.e.d.a0.b.NULL) {
                return Long.valueOf(aVar.W());
            }
            aVar.Z();
            return null;
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, Number number) {
            if (number == null) {
                cVar.S();
            } else {
                cVar.f0(number.toString());
            }
        }
    }

    class d extends v<AtomicLong> {
        final /* synthetic */ v a;

        d(v vVar) {
            this.a = vVar;
        }

        /* renamed from: f */
        public AtomicLong c(f.e.d.a0.a aVar) {
            return new AtomicLong(((Number) this.a.c(aVar)).longValue());
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, AtomicLong atomicLong) {
            this.a.e(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    class e extends v<AtomicLongArray> {
        final /* synthetic */ v a;

        e(v vVar) {
            this.a = vVar;
        }

        /* renamed from: f */
        public AtomicLongArray c(f.e.d.a0.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.L()) {
                arrayList.add(Long.valueOf(((Number) this.a.c(aVar)).longValue()));
            }
            aVar.z();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
            }
            return atomicLongArray;
        }

        /* renamed from: g */
        public void e(f.e.d.a0.c cVar, AtomicLongArray atomicLongArray) {
            cVar.g();
            int length = atomicLongArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                this.a.e(cVar, Long.valueOf(atomicLongArray.get(i2)));
            }
            cVar.z();
        }
    }

    /* renamed from: f.e.d.f$f  reason: collision with other inner class name */
    static class C0127f<T> extends v<T> {
        private v<T> a;

        C0127f() {
        }

        public T c(f.e.d.a0.a aVar) {
            v<T> vVar = this.a;
            if (vVar != null) {
                return vVar.c(aVar);
            }
            throw new IllegalStateException();
        }

        public void e(f.e.d.a0.c cVar, T t) {
            v<T> vVar = this.a;
            if (vVar != null) {
                vVar.e(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }

        public void f(v<T> vVar) {
            if (this.a == null) {
                this.a = vVar;
                return;
            }
            throw new AssertionError();
        }
    }

    f(f.e.d.y.d dVar, e eVar, Map<Type, h<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, u uVar, String str, int i2, int i3, List<w> list, List<w> list2, List<w> list3) {
        f.e.d.y.d dVar2 = dVar;
        boolean z8 = z7;
        Map<Type, h<?>> map2 = map;
        f.e.d.y.c cVar = new f.e.d.y.c(map);
        this.c = cVar;
        this.f4312f = z;
        this.f4313g = z3;
        this.f4314h = z4;
        this.f4315i = z5;
        this.f4316j = z6;
        this.f4317k = list;
        this.f4318l = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(n.Y);
        arrayList.add(h.b);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(n.D);
        arrayList.add(n.f4411m);
        arrayList.add(n.f4405g);
        arrayList.add(n.f4407i);
        arrayList.add(n.f4409k);
        v<Number> m2 = m(uVar);
        arrayList.add(n.b(Long.TYPE, Long.class, m2));
        arrayList.add(n.b(Double.TYPE, Double.class, e(z8)));
        arrayList.add(n.b(Float.TYPE, Float.class, f(z8)));
        arrayList.add(n.x);
        arrayList.add(n.f4413o);
        arrayList.add(n.f4415q);
        arrayList.add(n.a(AtomicLong.class, b(m2)));
        arrayList.add(n.a(AtomicLongArray.class, c(m2)));
        arrayList.add(n.f4417s);
        arrayList.add(n.z);
        arrayList.add(n.F);
        arrayList.add(n.H);
        arrayList.add(n.a(BigDecimal.class, n.B));
        arrayList.add(n.a(BigInteger.class, n.C));
        arrayList.add(n.J);
        arrayList.add(n.L);
        arrayList.add(n.P);
        arrayList.add(n.R);
        arrayList.add(n.W);
        arrayList.add(n.N);
        arrayList.add(n.f4402d);
        arrayList.add(f.e.d.y.n.c.b);
        arrayList.add(n.U);
        arrayList.add(k.b);
        arrayList.add(j.b);
        arrayList.add(n.S);
        arrayList.add(f.e.d.y.n.a.c);
        arrayList.add(n.b);
        arrayList.add(new f.e.d.y.n.b(cVar));
        boolean z9 = z2;
        arrayList.add(new g(cVar, z2));
        f.e.d.y.n.d dVar3 = new f.e.d.y.n.d(cVar);
        this.f4310d = dVar3;
        arrayList.add(dVar3);
        arrayList.add(n.Z);
        e eVar2 = eVar;
        arrayList.add(new i(cVar, eVar, dVar, dVar3));
        this.f4311e = Collections.unmodifiableList(arrayList);
    }

    private static void a(Object obj, f.e.d.a0.a aVar) {
        if (obj != null) {
            try {
                if (aVar.d0() != f.e.d.a0.b.END_DOCUMENT) {
                    throw new m("JSON document was not fully consumed.");
                }
            } catch (f.e.d.a0.d e2) {
                throw new t((Throwable) e2);
            } catch (IOException e3) {
                throw new m((Throwable) e3);
            }
        }
    }

    private static v<AtomicLong> b(v<Number> vVar) {
        return new d(vVar).b();
    }

    private static v<AtomicLongArray> c(v<Number> vVar) {
        return new e(vVar).b();
    }

    static void d(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private v<Number> e(boolean z) {
        return z ? n.v : new a(this);
    }

    private v<Number> f(boolean z) {
        return z ? n.u : new b(this);
    }

    private static v<Number> m(u uVar) {
        return uVar == u.DEFAULT ? n.t : new c();
    }

    public <T> T g(f.e.d.a0.a aVar, Type type) {
        boolean O = aVar.O();
        aVar.i0(true);
        try {
            aVar.d0();
            T c2 = j(f.e.d.z.a.b(type)).c(aVar);
            aVar.i0(O);
            return c2;
        } catch (EOFException e2) {
            if (1 != 0) {
                aVar.i0(O);
                return null;
            }
            throw new t((Throwable) e2);
        } catch (IllegalStateException e3) {
            throw new t((Throwable) e3);
        } catch (IOException e4) {
            throw new t((Throwable) e4);
        } catch (AssertionError e5) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.8): " + e5.getMessage());
            assertionError.initCause(e5);
            throw assertionError;
        } catch (Throwable th) {
            aVar.i0(O);
            throw th;
        }
    }

    public <T> T h(Reader reader, Type type) {
        f.e.d.a0.a n2 = n(reader);
        T g2 = g(n2, type);
        a(g2, n2);
        return g2;
    }

    public <T> T i(String str, Type type) {
        if (str == null) {
            return null;
        }
        return h(new StringReader(str), type);
    }

    public <T> v<T> j(f.e.d.z.a<T> aVar) {
        v<T> vVar = this.b.get(aVar == null ? f4309m : aVar);
        if (vVar != null) {
            return vVar;
        }
        Map map = this.a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap();
            this.a.set(map);
            z = true;
        }
        C0127f fVar = (C0127f) map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            C0127f fVar2 = new C0127f();
            map.put(aVar, fVar2);
            for (w create : this.f4311e) {
                v<T> create2 = create.create(this, aVar);
                if (create2 != null) {
                    fVar2.f(create2);
                    this.b.put(aVar, create2);
                    return create2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.8) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.a.remove();
            }
        }
    }

    public <T> v<T> k(Class<T> cls) {
        return j(f.e.d.z.a.a(cls));
    }

    public <T> v<T> l(w wVar, f.e.d.z.a<T> aVar) {
        if (!this.f4311e.contains(wVar)) {
            wVar = this.f4310d;
        }
        boolean z = false;
        for (w next : this.f4311e) {
            if (z) {
                v<T> create = next.create(this, aVar);
                if (create != null) {
                    return create;
                }
            } else if (next == wVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public f.e.d.a0.a n(Reader reader) {
        f.e.d.a0.a aVar = new f.e.d.a0.a(reader);
        aVar.i0(this.f4316j);
        return aVar;
    }

    public f.e.d.a0.c o(Writer writer) {
        if (this.f4313g) {
            writer.write(")]}'\n");
        }
        f.e.d.a0.c cVar = new f.e.d.a0.c(writer);
        if (this.f4315i) {
            cVar.Y("  ");
        }
        cVar.a0(this.f4312f);
        return cVar;
    }

    public String p(l lVar) {
        StringWriter stringWriter = new StringWriter();
        t(lVar, stringWriter);
        return stringWriter.toString();
    }

    public String q(Object obj) {
        return obj == null ? p(n.a) : r(obj, obj.getClass());
    }

    public String r(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        v(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void s(l lVar, f.e.d.a0.c cVar) {
        boolean L = cVar.L();
        cVar.Z(true);
        boolean J = cVar.J();
        cVar.X(this.f4314h);
        boolean E = cVar.E();
        cVar.a0(this.f4312f);
        try {
            l.b(lVar, cVar);
            cVar.Z(L);
            cVar.X(J);
            cVar.a0(E);
        } catch (IOException e2) {
            throw new m((Throwable) e2);
        } catch (AssertionError e3) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.8): " + e3.getMessage());
            assertionError.initCause(e3);
            throw assertionError;
        } catch (Throwable th) {
            cVar.Z(L);
            cVar.X(J);
            cVar.a0(E);
            throw th;
        }
    }

    public void t(l lVar, Appendable appendable) {
        try {
            s(lVar, o(l.c(appendable)));
        } catch (IOException e2) {
            throw new m((Throwable) e2);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f4312f + ",factories:" + this.f4311e + ",instanceCreators:" + this.c + "}";
    }

    public void u(Object obj, Type type, f.e.d.a0.c cVar) {
        v<?> j2 = j(f.e.d.z.a.b(type));
        boolean L = cVar.L();
        cVar.Z(true);
        boolean J = cVar.J();
        cVar.X(this.f4314h);
        boolean E = cVar.E();
        cVar.a0(this.f4312f);
        try {
            j2.e(cVar, obj);
            cVar.Z(L);
            cVar.X(J);
            cVar.a0(E);
        } catch (IOException e2) {
            throw new m((Throwable) e2);
        } catch (AssertionError e3) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.8): " + e3.getMessage());
            assertionError.initCause(e3);
            throw assertionError;
        } catch (Throwable th) {
            cVar.Z(L);
            cVar.X(J);
            cVar.a0(E);
            throw th;
        }
    }

    public void v(Object obj, Type type, Appendable appendable) {
        try {
            u(obj, type, o(l.c(appendable)));
        } catch (IOException e2) {
            throw new m((Throwable) e2);
        }
    }
}
