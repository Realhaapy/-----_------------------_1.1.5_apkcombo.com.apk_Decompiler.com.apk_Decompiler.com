package p;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p.e0.c;
import p.e0.g.f;
import p.r;

public final class y {
    final s a;
    final String b;
    final r c;

    /* renamed from: d  reason: collision with root package name */
    final z f5459d;

    /* renamed from: e  reason: collision with root package name */
    final Map<Class<?>, Object> f5460e;

    /* renamed from: f  reason: collision with root package name */
    private volatile d f5461f;

    public static class a {
        s a;
        String b;
        r.a c;

        /* renamed from: d  reason: collision with root package name */
        z f5462d;

        /* renamed from: e  reason: collision with root package name */
        Map<Class<?>, Object> f5463e;

        public a() {
            this.f5463e = Collections.emptyMap();
            this.b = "GET";
            this.c = new r.a();
        }

        a(y yVar) {
            this.f5463e = Collections.emptyMap();
            this.a = yVar.a;
            this.b = yVar.b;
            this.f5462d = yVar.f5459d;
            this.f5463e = yVar.f5460e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(yVar.f5460e);
            this.c = yVar.c.f();
        }

        public y a() {
            if (this.a != null) {
                return new y(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a b(String str, String str2) {
            this.c.f(str, str2);
            return this;
        }

        public a c(r rVar) {
            this.c = rVar.f();
            return this;
        }

        public a d(String str, z zVar) {
            Objects.requireNonNull(str, "method == null");
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (zVar != null && !f.b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (zVar != null || !f.e(str)) {
                this.b = str;
                this.f5462d = zVar;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        public a e(String str) {
            this.c.e(str);
            return this;
        }

        public a f(String str) {
            StringBuilder sb;
            int i2;
            Objects.requireNonNull(str, "url == null");
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                sb = new StringBuilder();
                sb.append("http:");
                i2 = 3;
            } else {
                if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    sb = new StringBuilder();
                    sb.append("https:");
                    i2 = 4;
                }
                g(s.k(str));
                return this;
            }
            sb.append(str.substring(i2));
            str = sb.toString();
            g(s.k(str));
            return this;
        }

        public a g(s sVar) {
            Objects.requireNonNull(sVar, "url == null");
            this.a = sVar;
            return this;
        }
    }

    y(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c.d();
        this.f5459d = aVar.f5462d;
        this.f5460e = c.t(aVar.f5463e);
    }

    public z a() {
        return this.f5459d;
    }

    public d b() {
        d dVar = this.f5461f;
        if (dVar != null) {
            return dVar;
        }
        d k2 = d.k(this.c);
        this.f5461f = k2;
        return k2;
    }

    public String c(String str) {
        return this.c.c(str);
    }

    public r d() {
        return this.c;
    }

    public boolean e() {
        return this.a.m();
    }

    public String f() {
        return this.b;
    }

    public a g() {
        return new a(this);
    }

    public s h() {
        return this.a;
    }

    public String toString() {
        return "Request{method=" + this.b + ", url=" + this.a + ", tags=" + this.f5460e + '}';
    }
}
