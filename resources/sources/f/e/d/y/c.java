package f.e.d.y;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public final class c {
    private final Map<Type, f.e.d.h<?>> a;
    private final f.e.d.y.o.b b = f.e.d.y.o.b.a();

    class a implements i<T> {
        a(c cVar) {
        }

        public T a() {
            return new ConcurrentHashMap();
        }
    }

    class b implements i<T> {
        b(c cVar) {
        }

        public T a() {
            return new TreeMap();
        }
    }

    /* renamed from: f.e.d.y.c$c  reason: collision with other inner class name */
    class C0129c implements i<T> {
        C0129c(c cVar) {
        }

        public T a() {
            return new LinkedHashMap();
        }
    }

    class d implements i<T> {
        d(c cVar) {
        }

        public T a() {
            return new h();
        }
    }

    class e implements i<T> {
        private final m a = m.b();
        final /* synthetic */ Class b;
        final /* synthetic */ Type c;

        e(c cVar, Class cls, Type type) {
            this.b = cls;
            this.c = type;
        }

        public T a() {
            try {
                return this.a.c(this.b);
            } catch (Exception e2) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e2);
            }
        }
    }

    class f implements i<T> {
        final /* synthetic */ f.e.d.h a;
        final /* synthetic */ Type b;

        f(c cVar, f.e.d.h hVar, Type type) {
            this.a = hVar;
            this.b = type;
        }

        public T a() {
            return this.a.a(this.b);
        }
    }

    class g implements i<T> {
        final /* synthetic */ f.e.d.h a;
        final /* synthetic */ Type b;

        g(c cVar, f.e.d.h hVar, Type type) {
            this.a = hVar;
            this.b = type;
        }

        public T a() {
            return this.a.a(this.b);
        }
    }

    class h implements i<T> {
        final /* synthetic */ Constructor a;

        h(c cVar, Constructor constructor) {
            this.a = constructor;
        }

        public T a() {
            try {
                return this.a.newInstance((Object[]) null);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Failed to invoke " + this.a + " with no args", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to invoke " + this.a + " with no args", e3.getTargetException());
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    class i implements i<T> {
        i(c cVar) {
        }

        public T a() {
            return new TreeSet();
        }
    }

    class j implements i<T> {
        final /* synthetic */ Type a;

        j(c cVar, Type type) {
            this.a = type;
        }

        public T a() {
            Type type = this.a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new f.e.d.m("Invalid EnumSet type: " + this.a.toString());
            }
            throw new f.e.d.m("Invalid EnumSet type: " + this.a.toString());
        }
    }

    class k implements i<T> {
        k(c cVar) {
        }

        public T a() {
            return new LinkedHashSet();
        }
    }

    class l implements i<T> {
        l(c cVar) {
        }

        public T a() {
            return new ArrayDeque();
        }
    }

    class m implements i<T> {
        m(c cVar) {
        }

        public T a() {
            return new ArrayList();
        }
    }

    class n implements i<T> {
        n(c cVar) {
        }

        public T a() {
            return new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, f.e.d.h<?>> map) {
        this.a = map;
    }

    private <T> i<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.b.b(declaredConstructor);
            }
            return new h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> i<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new i(this) : EnumSet.class.isAssignableFrom(cls) ? new j(this, type) : Set.class.isAssignableFrom(cls) ? new k(this) : Queue.class.isAssignableFrom(cls) ? new l(this) : new m(this);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new n(this) : ConcurrentMap.class.isAssignableFrom(cls) ? new a(this) : SortedMap.class.isAssignableFrom(cls) ? new b(this) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(f.e.d.z.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new d(this) : new C0129c(this);
        }
        return null;
    }

    private <T> i<T> d(Type type, Class<? super T> cls) {
        return new e(this, cls, type);
    }

    public <T> i<T> a(f.e.d.z.a<T> aVar) {
        Type e2 = aVar.e();
        Class<? super T> c = aVar.c();
        f.e.d.h hVar = this.a.get(e2);
        if (hVar != null) {
            return new f(this, hVar, e2);
        }
        f.e.d.h hVar2 = this.a.get(c);
        if (hVar2 != null) {
            return new g(this, hVar2, e2);
        }
        i<T> b2 = b(c);
        if (b2 != null) {
            return b2;
        }
        i<T> c2 = c(e2, c);
        return c2 != null ? c2 : d(e2, c);
    }

    public String toString() {
        return this.a.toString();
    }
}
