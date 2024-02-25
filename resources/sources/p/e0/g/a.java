package p.e0.g;

import java.util.List;
import p.a0;
import p.e0.c;
import p.e0.d;
import p.l;
import p.m;
import p.r;
import p.t;
import p.u;
import p.y;
import p.z;
import q.j;

public final class a implements t {
    private final m a;

    public a(m mVar) {
        this.a = mVar;
    }

    private String b(List<l> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                sb.append("; ");
            }
            l lVar = list.get(i2);
            sb.append(lVar.c());
            sb.append('=');
            sb.append(lVar.k());
        }
        return sb.toString();
    }

    public a0 a(t.a aVar) {
        y e2 = aVar.e();
        y.a g2 = e2.g();
        z a2 = e2.a();
        if (a2 != null) {
            u b = a2.b();
            if (b == null) {
                long a3 = a2.a();
                if (a3 != -1) {
                    g2.b("Content-Length", Long.toString(a3));
                    g2.e("Transfer-Encoding");
                } else {
                    g2.b("Transfer-Encoding", "chunked");
                    g2.e("Content-Length");
                }
            } else {
                b.toString();
                throw null;
            }
        }
        boolean z = false;
        if (e2.c("Host") == null) {
            g2.b("Host", c.q(e2.h(), false));
        }
        if (e2.c("Connection") == null) {
            g2.b("Connection", "Keep-Alive");
        }
        if (e2.c("Accept-Encoding") == null && e2.c("Range") == null) {
            z = true;
            g2.b("Accept-Encoding", "gzip");
        }
        List<l> a4 = this.a.a(e2.h());
        if (!a4.isEmpty()) {
            g2.b("Cookie", b(a4));
        }
        if (e2.c("User-Agent") == null) {
            g2.b("User-Agent", d.a());
        }
        a0 d2 = aVar.d(g2.a());
        e.e(this.a, e2.h(), d2.B());
        a0.a E = d2.E();
        E.p(e2);
        if (z && "gzip".equalsIgnoreCase(d2.v("Content-Encoding")) && e.c(d2)) {
            j jVar = new j(d2.a().o());
            r.a f2 = d2.B().f();
            f2.e("Content-Encoding");
            f2.e("Content-Length");
            E.j(f2.d());
            E.b(new h(d2.v("Content-Type"), -1, q.l.b(jVar)));
        }
        return E.c();
    }
}
