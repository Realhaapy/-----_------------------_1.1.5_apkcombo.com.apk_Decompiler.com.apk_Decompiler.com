package f.e.d.y;

import f.e.d.a0.c;
import f.e.d.b;
import f.e.d.f;
import f.e.d.v;
import f.e.d.w;
import f.e.d.x.e;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

public final class d implements w, Cloneable {

    /* renamed from: k  reason: collision with root package name */
    public static final d f4342k = new d();

    /* renamed from: e  reason: collision with root package name */
    private double f4343e = -1.0d;

    /* renamed from: f  reason: collision with root package name */
    private int f4344f = 136;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4345g = true;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4346h;

    /* renamed from: i  reason: collision with root package name */
    private List<b> f4347i = Collections.emptyList();

    /* renamed from: j  reason: collision with root package name */
    private List<b> f4348j = Collections.emptyList();

    class a extends v<T> {
        private v<T> a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f4349d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f.e.d.z.a f4350e;

        a(boolean z, boolean z2, f fVar, f.e.d.z.a aVar) {
            this.b = z;
            this.c = z2;
            this.f4349d = fVar;
            this.f4350e = aVar;
        }

        private v<T> f() {
            v<T> vVar = this.a;
            if (vVar != null) {
                return vVar;
            }
            v<T> l2 = this.f4349d.l(d.this, this.f4350e);
            this.a = l2;
            return l2;
        }

        public T c(f.e.d.a0.a aVar) {
            if (!this.b) {
                return f().c(aVar);
            }
            aVar.n0();
            return null;
        }

        public void e(c cVar, T t) {
            if (this.c) {
                cVar.S();
            } else {
                f().e(cVar, t);
            }
        }
    }

    private boolean e(Class<?> cls) {
        if (this.f4343e == -1.0d || n((f.e.d.x.d) cls.getAnnotation(f.e.d.x.d.class), (e) cls.getAnnotation(e.class))) {
            return (!this.f4345g && j(cls)) || i(cls);
        }
        return true;
    }

    private boolean f(Class<?> cls, boolean z) {
        for (b a2 : z ? this.f4347i : this.f4348j) {
            if (a2.a(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean j(Class<?> cls) {
        return cls.isMemberClass() && !k(cls);
    }

    private boolean k(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean l(f.e.d.x.d dVar) {
        return dVar == null || dVar.value() <= this.f4343e;
    }

    private boolean m(e eVar) {
        return eVar == null || eVar.value() > this.f4343e;
    }

    private boolean n(f.e.d.x.d dVar, e eVar) {
        return l(dVar) && m(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public <T> v<T> create(f fVar, f.e.d.z.a<T> aVar) {
        Class<? super T> c = aVar.c();
        boolean e2 = e(c);
        boolean z = e2 || f(c, true);
        boolean z2 = e2 || f(c, false);
        if (z || z2) {
            return new a(z2, z, fVar, aVar);
        }
        return null;
    }

    public boolean d(Class<?> cls, boolean z) {
        return e(cls) || f(cls, z);
    }

    public boolean h(Field field, boolean z) {
        f.e.d.x.a aVar;
        if ((this.f4344f & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f4343e != -1.0d && !n((f.e.d.x.d) field.getAnnotation(f.e.d.x.d.class), (e) field.getAnnotation(e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f4346h && ((aVar = (f.e.d.x.a) field.getAnnotation(f.e.d.x.a.class)) == null || (!z ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f4345g && j(field.getType())) || i(field.getType())) {
            return true;
        }
        List<b> list = z ? this.f4347i : this.f4348j;
        if (list.isEmpty()) {
            return false;
        }
        f.e.d.c cVar = new f.e.d.c(field);
        for (b b : list) {
            if (b.b(cVar)) {
                return true;
            }
        }
        return false;
    }
}
