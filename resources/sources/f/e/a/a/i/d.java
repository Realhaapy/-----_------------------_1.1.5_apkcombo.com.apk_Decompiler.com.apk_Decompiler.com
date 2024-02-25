package f.e.a.a.i;

import f.e.a.a.c;
import f.e.a.a.e;
import f.e.a.a.i.o;
import java.util.Objects;

final class d extends o {
    private final p a;
    private final String b;
    private final c<?> c;

    /* renamed from: d  reason: collision with root package name */
    private final e<?, byte[]> f3794d;

    /* renamed from: e  reason: collision with root package name */
    private final f.e.a.a.b f3795e;

    static final class b extends o.a {
        private p a;
        private String b;
        private c<?> c;

        /* renamed from: d  reason: collision with root package name */
        private e<?, byte[]> f3796d;

        /* renamed from: e  reason: collision with root package name */
        private f.e.a.a.b f3797e;

        b() {
        }

        public o a() {
            String str = "";
            if (this.a == null) {
                str = str + " transportContext";
            }
            if (this.b == null) {
                str = str + " transportName";
            }
            if (this.c == null) {
                str = str + " event";
            }
            if (this.f3796d == null) {
                str = str + " transformer";
            }
            if (this.f3797e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new d(this.a, this.b, this.c, this.f3796d, this.f3797e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public o.a b(f.e.a.a.b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f3797e = bVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public o.a c(c<?> cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.c = cVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public o.a d(e<?, byte[]> eVar) {
            Objects.requireNonNull(eVar, "Null transformer");
            this.f3796d = eVar;
            return this;
        }

        public o.a e(p pVar) {
            Objects.requireNonNull(pVar, "Null transportContext");
            this.a = pVar;
            return this;
        }

        public o.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.b = str;
            return this;
        }
    }

    private d(p pVar, String str, c<?> cVar, e<?, byte[]> eVar, f.e.a.a.b bVar) {
        this.a = pVar;
        this.b = str;
        this.c = cVar;
        this.f3794d = eVar;
        this.f3795e = bVar;
    }

    public f.e.a.a.b b() {
        return this.f3795e;
    }

    /* access modifiers changed from: package-private */
    public c<?> c() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public e<?, byte[]> e() {
        return this.f3794d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a.equals(oVar.f()) && this.b.equals(oVar.g()) && this.c.equals(oVar.c()) && this.f3794d.equals(oVar.e()) && this.f3795e.equals(oVar.b());
    }

    public p f() {
        return this.a;
    }

    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f3794d.hashCode()) * 1000003) ^ this.f3795e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.f3794d + ", encoding=" + this.f3795e + "}";
    }
}
