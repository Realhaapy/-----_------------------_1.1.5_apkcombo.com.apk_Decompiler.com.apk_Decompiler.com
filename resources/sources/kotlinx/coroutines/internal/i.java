package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import m.m;
import m.n;
import m.y.c.l;
import m.y.d.m;

public final class i {
    private static final int a = d(Throwable.class, -1);
    private static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    private static final WeakHashMap<Class<? extends Throwable>, l<Throwable, Throwable>> c = new WeakHashMap<>();

    public static final class a extends m implements l<Throwable, Throwable> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Constructor f4813e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Constructor constructor) {
            super(1);
            this.f4813e = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                m.a aVar = m.m.f5014e;
                Object newInstance = this.f4813e.newInstance(new Object[]{th.getMessage(), th});
                if (newInstance != null) {
                    obj = (Throwable) newInstance;
                    m.m.a(obj);
                    if (m.m.c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                m.a aVar2 = m.m.f5014e;
                obj = n.a(th2);
                m.m.a(obj);
            }
        }
    }

    public static final class b extends m.y.d.m implements l<Throwable, Throwable> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Constructor f4814e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(1);
            this.f4814e = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                m.a aVar = m.m.f5014e;
                Object newInstance = this.f4814e.newInstance(new Object[]{th});
                if (newInstance != null) {
                    obj = (Throwable) newInstance;
                    m.m.a(obj);
                    if (m.m.c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                m.a aVar2 = m.m.f5014e;
                obj = n.a(th2);
                m.m.a(obj);
            }
        }
    }

    public static final class c extends m.y.d.m implements l<Throwable, Throwable> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Constructor f4815e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f4815e = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Throwable th2;
            try {
                m.a aVar = m.m.f5014e;
                Object newInstance = this.f4815e.newInstance(new Object[]{th.getMessage()});
                if (newInstance != null) {
                    Throwable th3 = (Throwable) newInstance;
                    th3.initCause(th);
                    m.m.a(th3);
                    th2 = th3;
                    boolean c = m.m.c(th2);
                    Throwable th4 = th2;
                    if (c) {
                        th4 = null;
                    }
                    return th4;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th5) {
                m.a aVar2 = m.m.f5014e;
                Object a = n.a(th5);
                m.m.a(a);
                th2 = a;
            }
        }
    }

    public static final class d extends m.y.d.m implements l<Throwable, Throwable> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Constructor f4816e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f4816e = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Throwable th2;
            try {
                m.a aVar = m.m.f5014e;
                Object newInstance = this.f4816e.newInstance(new Object[0]);
                if (newInstance != null) {
                    Throwable th3 = (Throwable) newInstance;
                    th3.initCause(th);
                    m.m.a(th3);
                    th2 = th3;
                    boolean c = m.m.c(th2);
                    Throwable th4 = th2;
                    if (c) {
                        th4 = null;
                    }
                    return th4;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th5) {
                m.a aVar2 = m.m.f5014e;
                Object a = n.a(th5);
                m.m.a(a);
                th2 = a;
            }
        }
    }

    public static final class e<T> implements Comparator {
        public final int compare(T t, T t2) {
            return b.a(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
        }
    }

    static final class f extends m.y.d.m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final f f4817e = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    static final class g extends m.y.d.m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final g f4818e = new g();

        g() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    private static final l<Throwable, Throwable> a(Constructor<?> constructor) {
        Class<String> cls = String.class;
        Class[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new d(constructor);
        }
        if (length == 1) {
            Class cls2 = parameterTypes[0];
            if (m.y.d.l.a(cls2, Throwable.class)) {
                return new b(constructor);
            }
            if (m.y.d.l.a(cls2, cls)) {
                return new c(constructor);
            }
            return null;
        } else if (length == 2 && m.y.d.l.a(parameterTypes[0], cls) && m.y.d.l.a(parameterTypes[1], Throwable.class)) {
            return new a(constructor);
        } else {
            return null;
        }
    }

    private static final int b(Class<?> cls, int i2) {
        Class<? super Object> superclass;
        do {
            Field[] declaredFields = r5.getDeclaredFields();
            int length = declaredFields.length;
            int i3 = 0;
            Class<? super Object> cls2 = cls;
            for (int i4 = 0; i4 < length; i4++) {
                if (!Modifier.isStatic(declaredFields[i4].getModifiers())) {
                    i3++;
                }
            }
            i2 += i3;
            superclass = cls2.getSuperclass();
            cls2 = superclass;
        } while (superclass != null);
        return i2;
    }

    static /* synthetic */ int c(Class cls, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return b(cls, i2);
    }

    private static final int d(Class<?> cls, int i2) {
        Integer num;
        m.y.a.b(cls);
        try {
            m.a aVar = m.m.f5014e;
            num = Integer.valueOf(c(cls, 0, 1, (Object) null));
            m.m.a(num);
        } catch (Throwable th) {
            m.a aVar2 = m.m.f5014e;
            num = n.a(th);
            m.m.a(num);
        }
        Integer valueOf = Integer.valueOf(i2);
        if (m.m.c(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static final <E extends java.lang.Throwable> E e(E r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.d0
            r1 = 0
            if (r0 == 0) goto L_0x0026
            m.m$a r0 = m.m.f5014e     // Catch:{ all -> 0x0011 }
            kotlinx.coroutines.d0 r9 = (kotlinx.coroutines.d0) r9     // Catch:{ all -> 0x0011 }
            java.lang.Throwable r9 = r9.a()     // Catch:{ all -> 0x0011 }
            m.m.a(r9)     // Catch:{ all -> 0x0011 }
            goto L_0x001b
        L_0x0011:
            r9 = move-exception
            m.m$a r0 = m.m.f5014e
            java.lang.Object r9 = m.n.a(r9)
            m.m.a(r9)
        L_0x001b:
            boolean r0 = m.m.c(r9)
            if (r0 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r9
        L_0x0023:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            return r1
        L_0x0026:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            r2.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, m.y.c.l<java.lang.Throwable, java.lang.Throwable>> r3 = c     // Catch:{ all -> 0x0118 }
            java.lang.Class r4 = r9.getClass()     // Catch:{ all -> 0x0118 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0118 }
            m.y.c.l r3 = (m.y.c.l) r3     // Catch:{ all -> 0x0118 }
            r2.unlock()
            if (r3 != 0) goto L_0x0111
            int r2 = a
            java.lang.Class r3 = r9.getClass()
            r4 = 0
            int r3 = d(r3, r4)
            if (r2 == r3) goto L_0x0093
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            int r3 = r0.getWriteHoldCount()
            if (r3 != 0) goto L_0x005c
            int r3 = r0.getReadHoldCount()
            goto L_0x005d
        L_0x005c:
            r3 = 0
        L_0x005d:
            r5 = 0
        L_0x005e:
            if (r5 >= r3) goto L_0x0066
            r2.unlock()
            int r5 = r5 + 1
            goto L_0x005e
        L_0x0066:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, m.y.c.l<java.lang.Throwable, java.lang.Throwable>> r5 = c     // Catch:{ all -> 0x0086 }
            java.lang.Class r9 = r9.getClass()     // Catch:{ all -> 0x0086 }
            kotlinx.coroutines.internal.i$f r6 = kotlinx.coroutines.internal.i.f.f4817e     // Catch:{ all -> 0x0086 }
            r5.put(r9, r6)     // Catch:{ all -> 0x0086 }
            m.s r9 = m.s.a     // Catch:{ all -> 0x0086 }
        L_0x007a:
            if (r4 >= r3) goto L_0x0082
            r2.lock()
            int r4 = r4 + 1
            goto L_0x007a
        L_0x0082:
            r0.unlock()
            return r1
        L_0x0086:
            r9 = move-exception
        L_0x0087:
            if (r4 >= r3) goto L_0x008f
            r2.lock()
            int r4 = r4 + 1
            goto L_0x0087
        L_0x008f:
            r0.unlock()
            throw r9
        L_0x0093:
            java.lang.Class r0 = r9.getClass()
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()
            kotlinx.coroutines.internal.i$e r2 = new kotlinx.coroutines.internal.i$e
            r2.<init>()
            java.util.List r0 = m.t.f.p(r0, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        L_0x00a9:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00bb
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            m.y.c.l r2 = a(r2)
            if (r2 == 0) goto L_0x00a9
        L_0x00bb:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r0.readLock()
            int r5 = r0.getWriteHoldCount()
            if (r5 != 0) goto L_0x00cc
            int r5 = r0.getReadHoldCount()
            goto L_0x00cd
        L_0x00cc:
            r5 = 0
        L_0x00cd:
            r6 = 0
        L_0x00ce:
            if (r6 >= r5) goto L_0x00d6
            r3.unlock()
            int r6 = r6 + 1
            goto L_0x00ce
        L_0x00d6:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, m.y.c.l<java.lang.Throwable, java.lang.Throwable>> r6 = c     // Catch:{ all -> 0x0104 }
            java.lang.Class r7 = r9.getClass()     // Catch:{ all -> 0x0104 }
            if (r2 != 0) goto L_0x00e8
            kotlinx.coroutines.internal.i$g r8 = kotlinx.coroutines.internal.i.g.f4818e     // Catch:{ all -> 0x0104 }
            goto L_0x00e9
        L_0x00e8:
            r8 = r2
        L_0x00e9:
            r6.put(r7, r8)     // Catch:{ all -> 0x0104 }
            m.s r6 = m.s.a     // Catch:{ all -> 0x0104 }
        L_0x00ee:
            if (r4 >= r5) goto L_0x00f6
            r3.lock()
            int r4 = r4 + 1
            goto L_0x00ee
        L_0x00f6:
            r0.unlock()
            if (r2 != 0) goto L_0x00fc
            goto L_0x0103
        L_0x00fc:
            java.lang.Object r9 = r2.invoke(r9)
            r1 = r9
            java.lang.Throwable r1 = (java.lang.Throwable) r1
        L_0x0103:
            return r1
        L_0x0104:
            r9 = move-exception
        L_0x0105:
            if (r4 >= r5) goto L_0x010d
            r3.lock()
            int r4 = r4 + 1
            goto L_0x0105
        L_0x010d:
            r0.unlock()
            throw r9
        L_0x0111:
            java.lang.Object r9 = r3.invoke(r9)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            return r9
        L_0x0118:
            r9 = move-exception
            r2.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.i.e(java.lang.Throwable):java.lang.Throwable");
    }
}
