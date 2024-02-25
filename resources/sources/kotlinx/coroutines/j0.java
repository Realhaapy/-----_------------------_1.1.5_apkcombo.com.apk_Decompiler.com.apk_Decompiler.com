package kotlinx.coroutines;

import m.v.g;
import m.y.d.g;
import m.y.d.l;

public final class j0 extends m.v.a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f4833f = new a((g) null);

    /* renamed from: e  reason: collision with root package name */
    private final String f4834e;

    public static final class a implements g.c<j0> {
        private a() {
        }

        public /* synthetic */ a(m.y.d.g gVar) {
            this();
        }
    }

    public final String T() {
        return this.f4834e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && l.a(this.f4834e, ((j0) obj).f4834e);
    }

    public int hashCode() {
        return this.f4834e.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f4834e + ')';
    }
}
