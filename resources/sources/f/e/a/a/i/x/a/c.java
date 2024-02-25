package f.e.a.a.i.x.a;

import com.google.firebase.o.j.e;
import com.google.firebase.o.j.f;

public final class c {
    private final long a;
    private final b b;

    public static final class a {
        private long a = 0;
        private b b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.a, this.b);
        }

        public a b(long j2) {
            this.a = j2;
            return this;
        }

        public a c(b bVar) {
            this.b = bVar;
            return this;
        }
    }

    public enum b implements e {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f3829e;

        private b(int i2) {
            this.f3829e = i2;
        }

        public int b() {
            return this.f3829e;
        }
    }

    static {
        new a().a();
    }

    c(long j2, b bVar) {
        this.a = j2;
        this.b = bVar;
    }

    public static a c() {
        return new a();
    }

    @f(tag = 1)
    public long a() {
        return this.a;
    }

    @f(tag = 3)
    public b b() {
        return this.b;
    }
}
