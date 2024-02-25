package kotlinx.coroutines;

import java.util.Objects;
import m.s;
import m.v.g;
import m.y.d.g;
import m.y.d.l;

public final class i0 extends m.v.a implements d2<String> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f4798f = new a((g) null);

    /* renamed from: e  reason: collision with root package name */
    private final long f4799e;

    public static final class a implements g.c<i0> {
        private a() {
        }

        public /* synthetic */ a(m.y.d.g gVar) {
            this();
        }
    }

    public i0(long j2) {
        super(f4798f);
        this.f4799e = j2;
    }

    public final long T() {
        return this.f4799e;
    }

    /* renamed from: U */
    public void o(m.v.g gVar, String str) {
        Thread.currentThread().setName(str);
    }

    /* renamed from: V */
    public String O(m.v.g gVar) {
        String T;
        j0 j0Var = (j0) gVar.get(j0.f4833f);
        String str = "coroutine";
        if (!(j0Var == null || (T = j0Var.T()) == null)) {
            str = T;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int K = q.K(name, " @", 0, false, 6, (Object) null);
        if (K < 0) {
            K = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + K + 10);
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        String substring = name.substring(0, K);
        l.c(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(T());
        s sVar = s.a;
        String sb2 = sb.toString();
        l.c(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && this.f4799e == ((i0) obj).f4799e;
    }

    public int hashCode() {
        return c.a(this.f4799e);
    }

    public String toString() {
        return "CoroutineId(" + this.f4799e + ')';
    }
}
