package com.google.android.datatransport.cct.f;

import com.google.android.datatransport.cct.f.k;

final class e extends k {
    private final k.b a;
    private final a b;

    static final class b extends k.a {
        private k.b a;
        private a b;

        b() {
        }

        public k a() {
            return new e(this.a, this.b);
        }

        public k.a b(a aVar) {
            this.b = aVar;
            return this;
        }

        public k.a c(k.b bVar) {
            this.a = bVar;
            return this;
        }
    }

    private e(k.b bVar, a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    public a b() {
        return this.b;
    }

    public k.b c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.a;
        if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
            a aVar = this.b;
            a b2 = kVar.b();
            if (aVar == null) {
                if (b2 == null) {
                    return true;
                }
            } else if (aVar.equals(b2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.a;
        int i2 = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        a aVar = this.b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
