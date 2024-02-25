package p;

import java.io.Closeable;
import p.r;

public final class a0 implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    final y f5083e;

    /* renamed from: f  reason: collision with root package name */
    final w f5084f;

    /* renamed from: g  reason: collision with root package name */
    final int f5085g;

    /* renamed from: h  reason: collision with root package name */
    final String f5086h;

    /* renamed from: i  reason: collision with root package name */
    final q f5087i;

    /* renamed from: j  reason: collision with root package name */
    final r f5088j;

    /* renamed from: k  reason: collision with root package name */
    final b0 f5089k;

    /* renamed from: l  reason: collision with root package name */
    final a0 f5090l;

    /* renamed from: m  reason: collision with root package name */
    final a0 f5091m;

    /* renamed from: n  reason: collision with root package name */
    final a0 f5092n;

    /* renamed from: o  reason: collision with root package name */
    final long f5093o;

    /* renamed from: p  reason: collision with root package name */
    final long f5094p;

    /* renamed from: q  reason: collision with root package name */
    private volatile d f5095q;

    public static class a {
        y a;
        w b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        String f5096d;

        /* renamed from: e  reason: collision with root package name */
        q f5097e;

        /* renamed from: f  reason: collision with root package name */
        r.a f5098f;

        /* renamed from: g  reason: collision with root package name */
        b0 f5099g;

        /* renamed from: h  reason: collision with root package name */
        a0 f5100h;

        /* renamed from: i  reason: collision with root package name */
        a0 f5101i;

        /* renamed from: j  reason: collision with root package name */
        a0 f5102j;

        /* renamed from: k  reason: collision with root package name */
        long f5103k;

        /* renamed from: l  reason: collision with root package name */
        long f5104l;

        public a() {
            this.c = -1;
            this.f5098f = new r.a();
        }

        a(a0 a0Var) {
            this.c = -1;
            this.a = a0Var.f5083e;
            this.b = a0Var.f5084f;
            this.c = a0Var.f5085g;
            this.f5096d = a0Var.f5086h;
            this.f5097e = a0Var.f5087i;
            this.f5098f = a0Var.f5088j.f();
            this.f5099g = a0Var.f5089k;
            this.f5100h = a0Var.f5090l;
            this.f5101i = a0Var.f5091m;
            this.f5102j = a0Var.f5092n;
            this.f5103k = a0Var.f5093o;
            this.f5104l = a0Var.f5094p;
        }

        private void e(a0 a0Var) {
            if (a0Var.f5089k != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private void f(String str, a0 a0Var) {
            if (a0Var.f5089k != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (a0Var.f5090l != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (a0Var.f5091m != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (a0Var.f5092n != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        public a a(String str, String str2) {
            this.f5098f.a(str, str2);
            return this;
        }

        public a b(b0 b0Var) {
            this.f5099g = b0Var;
            return this;
        }

        public a0 c() {
            if (this.a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.c < 0) {
                throw new IllegalStateException("code < 0: " + this.c);
            } else if (this.f5096d != null) {
                return new a0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        public a d(a0 a0Var) {
            if (a0Var != null) {
                f("cacheResponse", a0Var);
            }
            this.f5101i = a0Var;
            return this;
        }

        public a g(int i2) {
            this.c = i2;
            return this;
        }

        public a h(q qVar) {
            this.f5097e = qVar;
            return this;
        }

        public a i(String str, String str2) {
            this.f5098f.f(str, str2);
            return this;
        }

        public a j(r rVar) {
            this.f5098f = rVar.f();
            return this;
        }

        public a k(String str) {
            this.f5096d = str;
            return this;
        }

        public a l(a0 a0Var) {
            if (a0Var != null) {
                f("networkResponse", a0Var);
            }
            this.f5100h = a0Var;
            return this;
        }

        public a m(a0 a0Var) {
            if (a0Var != null) {
                e(a0Var);
            }
            this.f5102j = a0Var;
            return this;
        }

        public a n(w wVar) {
            this.b = wVar;
            return this;
        }

        public a o(long j2) {
            this.f5104l = j2;
            return this;
        }

        public a p(y yVar) {
            this.a = yVar;
            return this;
        }

        public a q(long j2) {
            this.f5103k = j2;
            return this;
        }
    }

    a0(a aVar) {
        this.f5083e = aVar.a;
        this.f5084f = aVar.b;
        this.f5085g = aVar.c;
        this.f5086h = aVar.f5096d;
        this.f5087i = aVar.f5097e;
        this.f5088j = aVar.f5098f.d();
        this.f5089k = aVar.f5099g;
        this.f5090l = aVar.f5100h;
        this.f5091m = aVar.f5101i;
        this.f5092n = aVar.f5102j;
        this.f5093o = aVar.f5103k;
        this.f5094p = aVar.f5104l;
    }

    public r B() {
        return this.f5088j;
    }

    public a E() {
        return new a(this);
    }

    public a0 J() {
        return this.f5092n;
    }

    public long L() {
        return this.f5094p;
    }

    public y O() {
        return this.f5083e;
    }

    public long P() {
        return this.f5093o;
    }

    public b0 a() {
        return this.f5089k;
    }

    public d c() {
        d dVar = this.f5095q;
        if (dVar != null) {
            return dVar;
        }
        d k2 = d.k(this.f5088j);
        this.f5095q = k2;
        return k2;
    }

    public void close() {
        b0 b0Var = this.f5089k;
        if (b0Var != null) {
            b0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public int g() {
        return this.f5085g;
    }

    public q o() {
        return this.f5087i;
    }

    public String toString() {
        return "Response{protocol=" + this.f5084f + ", code=" + this.f5085g + ", message=" + this.f5086h + ", url=" + this.f5083e.h() + '}';
    }

    public String v(String str) {
        return z(str, (String) null);
    }

    public String z(String str, String str2) {
        String c = this.f5088j.c(str);
        return c != null ? c : str2;
    }
}
