package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class m<T> {
    private final Set<Class<? super T>> a;
    private final Set<t> b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2613d;

    /* renamed from: e  reason: collision with root package name */
    private final p<T> f2614e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f2615f;

    public static class b<T> {
        private final Set<Class<? super T>> a;
        private final Set<t> b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private int f2616d;

        /* renamed from: e  reason: collision with root package name */
        private p<T> f2617e;

        /* renamed from: f  reason: collision with root package name */
        private Set<Class<?>> f2618f;

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.a = hashSet;
            this.b = new HashSet();
            this.c = 0;
            this.f2616d = 0;
            this.f2618f = new HashSet();
            c0.c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> c2 : clsArr) {
                c0.c(c2, "Null interface");
            }
            Collections.addAll(this.a, clsArr);
        }

        /* access modifiers changed from: private */
        public b<T> g() {
            this.f2616d = 1;
            return this;
        }

        private b<T> h(int i2) {
            c0.d(this.c == 0, "Instantiation type has already been set.");
            this.c = i2;
            return this;
        }

        private void i(Class<?> cls) {
            c0.a(!this.a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(t tVar) {
            c0.c(tVar, "Null dependency");
            i(tVar.b());
            this.b.add(tVar);
            return this;
        }

        public b<T> c() {
            h(1);
            return this;
        }

        public m<T> d() {
            c0.d(this.f2617e != null, "Missing required property: factory.");
            return new m(new HashSet(this.a), new HashSet(this.b), this.c, this.f2616d, this.f2617e, this.f2618f);
        }

        public b<T> e() {
            h(2);
            return this;
        }

        public b<T> f(p<T> pVar) {
            c0.c(pVar, "Null factory");
            this.f2617e = pVar;
            return this;
        }
    }

    private m(Set<Class<? super T>> set, Set<t> set2, int i2, int i3, p<T> pVar, Set<Class<?>> set3) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.c = i2;
        this.f2613d = i3;
        this.f2614e = pVar;
        this.f2615f = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> b(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> m<T> g(T t, Class<T> cls) {
        b<T> h2 = h(cls);
        h2.f(new a(t));
        return h2.d();
    }

    public static <T> b<T> h(Class<T> cls) {
        b<T> a2 = a(cls);
        b unused = a2.g();
        return a2;
    }

    static /* synthetic */ Object l(Object obj, n nVar) {
        return obj;
    }

    static /* synthetic */ Object m(Object obj, n nVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> m<T> n(T t, Class<T> cls, Class<? super T>... clsArr) {
        b<T> b2 = b(cls, clsArr);
        b2.f(new b(t));
        return b2.d();
    }

    public Set<t> c() {
        return this.b;
    }

    public p<T> d() {
        return this.f2614e;
    }

    public Set<Class<? super T>> e() {
        return this.a;
    }

    public Set<Class<?>> f() {
        return this.f2615f;
    }

    public boolean i() {
        return this.c == 1;
    }

    public boolean j() {
        return this.c == 2;
    }

    public boolean k() {
        return this.f2613d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.c + ", type=" + this.f2613d + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }
}
