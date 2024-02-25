package f.e.a.a.i;

import f.e.a.a.d;
import f.e.a.a.i.p;
import java.util.Arrays;
import java.util.Objects;

final class e extends p {
    private final String a;
    private final byte[] b;
    private final d c;

    static final class b extends p.a {
        private String a;
        private byte[] b;
        private d c;

        b() {
        }

        public p a() {
            String str = "";
            if (this.a == null) {
                str = str + " backendName";
            }
            if (this.c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new e(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public p.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.a = str;
            return this;
        }

        public p.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        public p.a d(d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.c = dVar;
            return this;
        }
    }

    private e(String str, byte[] bArr, d dVar) {
        this.a = str;
        this.b = bArr;
        this.c = dVar;
    }

    public String b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }

    public d d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.a.equals(pVar.b())) {
            return Arrays.equals(this.b, pVar instanceof e ? ((e) pVar).b : pVar.c()) && this.c.equals(pVar.d());
        }
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
