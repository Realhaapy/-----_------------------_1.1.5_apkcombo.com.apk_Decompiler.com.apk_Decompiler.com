package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import m.m;
import m.n;
import m.p;
import m.v.j.a.e;
import m.y.d.l;

public final class y {
    private static final String a;
    private static final String b;

    static {
        Object obj;
        Object obj2;
        try {
            m.a aVar = m.f5014e;
            obj = Class.forName("m.v.j.a.a").getCanonicalName();
            m.a(obj);
        } catch (Throwable th) {
            m.a aVar2 = m.f5014e;
            obj = n.a(th);
            m.a(obj);
        }
        if (m.b(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        a = (String) obj;
        try {
            m.a aVar3 = m.f5014e;
            obj2 = Class.forName("kotlinx.coroutines.internal.y").getCanonicalName();
            m.a(obj2);
        } catch (Throwable th2) {
            m.a aVar4 = m.f5014e;
            obj2 = n.a(th2);
            m.a(obj2);
        }
        if (m.b(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        b = (String) obj2;
    }

    public static final StackTraceElement b(String str) {
        return new StackTraceElement(l.j("\b\b\b(", str), "\b", "\b", -1);
    }

    private static final <E extends Throwable> m.l<E, StackTraceElement[]> c(E e2) {
        boolean z;
        Throwable cause = e2.getCause();
        if (cause == null || !l.a(cause.getClass(), e2.getClass())) {
            return p.a(e2, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int length = stackTrace.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else if (h(stackTrace[i2])) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        return z ? p.a(cause, stackTrace) : p.a(e2, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E d(E e2, E e3, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(b("Coroutine boundary"));
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int g2 = g(stackTrace, a);
        int i2 = 0;
        if (g2 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            e3.setStackTrace((StackTraceElement[]) array);
            return e3;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + g2)];
        if (g2 > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                stackTraceElementArr[i3] = stackTrace[i3];
                if (i4 >= g2) {
                    break;
                }
                i3 = i4;
            }
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            int i5 = i2 + 1;
            stackTraceElementArr[i2 + g2] = it.next();
            i2 = i5;
        }
        e3.setStackTrace(stackTraceElementArr);
        return e3;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    private static final java.util.ArrayDeque<java.lang.StackTraceElement> e(m.v.j.a.e r3) {
        /*
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            java.lang.StackTraceElement r1 = r3.getStackTraceElement()
            if (r1 != 0) goto L_0x000c
            goto L_0x000f
        L_0x000c:
            r0.add(r1)
        L_0x000f:
            boolean r1 = r3 instanceof m.v.j.a.e
            r2 = 0
            if (r1 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r3 = r2
        L_0x0016:
            if (r3 != 0) goto L_0x001a
            r3 = r2
            goto L_0x001e
        L_0x001a:
            m.v.j.a.e r3 = r3.getCallerFrame()
        L_0x001e:
            if (r3 != 0) goto L_0x0021
            return r0
        L_0x0021:
            java.lang.StackTraceElement r1 = r3.getStackTraceElement()
            if (r1 != 0) goto L_0x000c
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.y.e(m.v.j.a.e):java.util.ArrayDeque");
    }

    private static final boolean f(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && l.a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && l.a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && l.a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int g(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (l.a(str, stackTraceElementArr[i2].getClassName())) {
                return i2;
            }
        }
        return -1;
    }

    public static final boolean h(StackTraceElement stackTraceElement) {
        return p.t(stackTraceElement.getClassName(), "\b\b\b", false, 2, (Object) null);
    }

    private static final void i(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (h(stackTraceElementArr[i2])) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = i2 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i3 <= length2) {
            while (true) {
                int i4 = length2 - 1;
                if (f(stackTraceElementArr[length2], arrayDeque.getLast())) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i3) {
                    length2 = i4;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final <E extends Throwable> E j(E e2, e eVar) {
        m.l c = c(e2);
        E e3 = (Throwable) c.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c.b();
        E m2 = m(e3);
        if (m2 == null) {
            return e2;
        }
        ArrayDeque<StackTraceElement> e4 = e(eVar);
        if (e4.isEmpty()) {
            return e2;
        }
        if (e3 != e2) {
            i(stackTraceElementArr, e4);
        }
        d(e3, m2, e4);
        return m2;
    }

    public static final <E extends Throwable> E k(E e2) {
        E m2;
        if (!o0.d() || (m2 = m(e2)) == null) {
            return e2;
        }
        l(m2);
        return m2;
    }

    private static final <E extends Throwable> E l(E e2) {
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int length = stackTrace.length;
        int g2 = g(stackTrace, b);
        int i2 = g2 + 1;
        int g3 = g(stackTrace, a);
        int i3 = 0;
        int i4 = (length - g2) - (g3 == -1 ? 0 : length - g3);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i4];
        while (i3 < i4) {
            stackTraceElementArr[i3] = i3 == 0 ? b("Coroutine boundary") : stackTrace[(i2 + i3) - 1];
            i3++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    private static final <E extends Throwable> E m(E e2) {
        E e3 = i.e(e2);
        if (e3 == null) {
            return null;
        }
        if ((e2 instanceof d0) || l.a(e3.getMessage(), e2.getMessage())) {
            return e3;
        }
        return null;
    }

    public static final <E extends Throwable> E n(E e2) {
        E cause = e2.getCause();
        if (cause != null && l.a(cause.getClass(), e2.getClass())) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            int length = stackTrace.length;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (h(stackTrace[i2])) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                return cause;
            }
        }
        return e2;
    }
}
