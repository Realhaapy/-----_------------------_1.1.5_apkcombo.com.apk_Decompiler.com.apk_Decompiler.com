package f.e.d.y.n;

import f.e.d.e;
import f.e.d.f;
import f.e.d.t;
import f.e.d.v;
import f.e.d.w;
import f.e.d.y.d;
import f.e.d.y.k;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class i implements w {

    /* renamed from: e  reason: collision with root package name */
    private final f.e.d.y.c f4387e;

    /* renamed from: f  reason: collision with root package name */
    private final e f4388f;

    /* renamed from: g  reason: collision with root package name */
    private final d f4389g;

    /* renamed from: h  reason: collision with root package name */
    private final d f4390h;

    /* renamed from: i  reason: collision with root package name */
    private final f.e.d.y.o.b f4391i = f.e.d.y.o.b.a();

    class a extends c {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Field f4392d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f4393e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v f4394f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f4395g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f.e.d.z.a f4396h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f4397i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, String str, boolean z, boolean z2, Field field, boolean z3, v vVar, f fVar, f.e.d.z.a aVar, boolean z4) {
            super(str, z, z2);
            this.f4392d = field;
            this.f4393e = z3;
            this.f4394f = vVar;
            this.f4395g = fVar;
            this.f4396h = aVar;
            this.f4397i = z4;
        }

        /* access modifiers changed from: package-private */
        public void a(f.e.d.a0.a aVar, Object obj) {
            Object c = this.f4394f.c(aVar);
            if (c != null || !this.f4397i) {
                this.f4392d.set(obj, c);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(f.e.d.a0.c cVar, Object obj) {
            (this.f4393e ? this.f4394f : new m(this.f4395g, this.f4394f, this.f4396h.e())).e(cVar, this.f4392d.get(obj));
        }

        public boolean c(Object obj) {
            return this.b && this.f4392d.get(obj) != obj;
        }
    }

    public static final class b<T> extends v<T> {
        private final f.e.d.y.i<T> a;
        private final Map<String, c> b;

        b(f.e.d.y.i<T> iVar, Map<String, c> map) {
            this.a = iVar;
            this.b = map;
        }

        public T c(f.e.d.a0.a aVar) {
            if (aVar.d0() == f.e.d.a0.b.NULL) {
                aVar.Z();
                return null;
            }
            T a2 = this.a.a();
            try {
                aVar.c();
                while (aVar.L()) {
                    c cVar = this.b.get(aVar.X());
                    if (cVar != null) {
                        if (cVar.c) {
                            cVar.a(aVar, a2);
                        }
                    }
                    aVar.n0();
                }
                aVar.B();
                return a2;
            } catch (IllegalStateException e2) {
                throw new t((Throwable) e2);
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }

        public void e(f.e.d.a0.c cVar, T t) {
            if (t == null) {
                cVar.S();
                return;
            }
            cVar.o();
            try {
                for (c next : this.b.values()) {
                    if (next.c(t)) {
                        cVar.O(next.a);
                        next.b(cVar, t);
                    }
                }
                cVar.B();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    static abstract class c {
        final String a;
        final boolean b;
        final boolean c;

        protected c(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        /* access modifiers changed from: package-private */
        public abstract void a(f.e.d.a0.a aVar, Object obj);

        /* access modifiers changed from: package-private */
        public abstract void b(f.e.d.a0.c cVar, Object obj);

        /* access modifiers changed from: package-private */
        public abstract boolean c(Object obj);
    }

    public i(f.e.d.y.c cVar, e eVar, d dVar, d dVar2) {
        this.f4387e = cVar;
        this.f4388f = eVar;
        this.f4389g = dVar;
        this.f4390h = dVar2;
    }

    private c a(f fVar, Field field, String str, f.e.d.z.a<?> aVar, boolean z, boolean z2) {
        f fVar2 = fVar;
        f.e.d.z.a<?> aVar2 = aVar;
        boolean a2 = k.a(aVar.c());
        Field field2 = field;
        f.e.d.x.b bVar = (f.e.d.x.b) field.getAnnotation(f.e.d.x.b.class);
        v<?> a3 = bVar != null ? this.f4390h.a(this.f4387e, fVar, aVar2, bVar) : null;
        boolean z3 = a3 != null;
        if (a3 == null) {
            a3 = fVar.j(aVar2);
        }
        return new a(this, str, z, z2, field, z3, a3, fVar, aVar, a2);
    }

    static boolean c(Field field, boolean z, d dVar) {
        return !dVar.d(field.getType(), z) && !dVar.h(field, z);
    }

    private Map<String, c> d(f fVar, f.e.d.z.a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type e2 = aVar.e();
        f.e.d.z.a<?> aVar2 = aVar;
        Class<? super Object> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                boolean b2 = b(field, true);
                boolean b3 = b(field, z);
                if (b2 || b3) {
                    this.f4391i.b(field);
                    Type p2 = f.e.d.y.b.p(aVar2.e(), cls2, field.getGenericType());
                    List<String> e3 = e(field);
                    int size = e3.size();
                    c cVar = null;
                    int i3 = 0;
                    while (i3 < size) {
                        String str = e3.get(i3);
                        boolean z2 = i3 != 0 ? false : b2;
                        String str2 = str;
                        int i4 = i3;
                        c cVar2 = cVar;
                        int i5 = size;
                        List<String> list = e3;
                        Field field2 = field;
                        cVar = cVar2 == null ? (c) linkedHashMap.put(str2, a(fVar, field, str2, f.e.d.z.a.b(p2), z2, b3)) : cVar2;
                        i3 = i4 + 1;
                        b2 = z2;
                        e3 = list;
                        size = i5;
                        field = field2;
                    }
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(e2 + " declares multiple JSON fields named " + cVar3.a);
                    }
                }
                i2++;
                z = false;
            }
            aVar2 = f.e.d.z.a.b(f.e.d.y.b.p(aVar2.e(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.c();
        }
        return linkedHashMap;
    }

    private List<String> e(Field field) {
        f.e.d.x.c cVar = (f.e.d.x.c) field.getAnnotation(f.e.d.x.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f4388f.a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public boolean b(Field field, boolean z) {
        return c(field, z, this.f4389g);
    }

    public <T> v<T> create(f fVar, f.e.d.z.a<T> aVar) {
        Class<? super T> c2 = aVar.c();
        if (!Object.class.isAssignableFrom(c2)) {
            return null;
        }
        return new b(this.f4387e.a(aVar), d(fVar, aVar, c2));
    }
}
