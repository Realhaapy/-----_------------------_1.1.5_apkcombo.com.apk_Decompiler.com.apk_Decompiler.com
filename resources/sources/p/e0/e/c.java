package p.e0.e;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import p.a0;
import p.e0.g.d;
import p.e0.g.e;
import p.r;
import p.y;

public final class c {
    public final y a;
    public final a0 b;

    public static class a {
        final long a;
        final y b;
        final a0 c;

        /* renamed from: d  reason: collision with root package name */
        private Date f5140d;

        /* renamed from: e  reason: collision with root package name */
        private String f5141e;

        /* renamed from: f  reason: collision with root package name */
        private Date f5142f;

        /* renamed from: g  reason: collision with root package name */
        private String f5143g;

        /* renamed from: h  reason: collision with root package name */
        private Date f5144h;

        /* renamed from: i  reason: collision with root package name */
        private long f5145i;

        /* renamed from: j  reason: collision with root package name */
        private long f5146j;

        /* renamed from: k  reason: collision with root package name */
        private String f5147k;

        /* renamed from: l  reason: collision with root package name */
        private int f5148l = -1;

        public a(long j2, y yVar, a0 a0Var) {
            this.a = j2;
            this.b = yVar;
            this.c = a0Var;
            if (a0Var != null) {
                this.f5145i = a0Var.P();
                this.f5146j = a0Var.L();
                r B = a0Var.B();
                int g2 = B.g();
                for (int i2 = 0; i2 < g2; i2++) {
                    String e2 = B.e(i2);
                    String h2 = B.h(i2);
                    if ("Date".equalsIgnoreCase(e2)) {
                        this.f5140d = d.b(h2);
                        this.f5141e = h2;
                    } else if ("Expires".equalsIgnoreCase(e2)) {
                        this.f5144h = d.b(h2);
                    } else if ("Last-Modified".equalsIgnoreCase(e2)) {
                        this.f5142f = d.b(h2);
                        this.f5143g = h2;
                    } else if ("ETag".equalsIgnoreCase(e2)) {
                        this.f5147k = h2;
                    } else if ("Age".equalsIgnoreCase(e2)) {
                        this.f5148l = e.d(h2, -1);
                    }
                }
            }
        }

        private long a() {
            Date date = this.f5140d;
            long j2 = 0;
            if (date != null) {
                j2 = Math.max(0, this.f5146j - date.getTime());
            }
            int i2 = this.f5148l;
            if (i2 != -1) {
                j2 = Math.max(j2, TimeUnit.SECONDS.toMillis((long) i2));
            }
            long j3 = this.f5146j;
            return j2 + (j3 - this.f5145i) + (this.a - j3);
        }

        private long b() {
            p.d c2 = this.c.c();
            if (c2.d() != -1) {
                return TimeUnit.SECONDS.toMillis((long) c2.d());
            }
            if (this.f5144h != null) {
                Date date = this.f5140d;
                long time = this.f5144h.getTime() - (date != null ? date.getTime() : this.f5146j);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f5142f == null || this.c.O().h().x() != null) {
                return 0;
            } else {
                Date date2 = this.f5140d;
                long time2 = (date2 != null ? date2.getTime() : this.f5145i) - this.f5142f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0;
            }
        }

        private c d() {
            if (this.c == null) {
                return new c(this.b, (a0) null);
            }
            if (this.b.e() && this.c.o() == null) {
                return new c(this.b, (a0) null);
            }
            if (!c.a(this.c, this.b)) {
                return new c(this.b, (a0) null);
            }
            p.d b2 = this.b.b();
            if (b2.h() || e(this.b)) {
                return new c(this.b, (a0) null);
            }
            p.d c2 = this.c.c();
            long a2 = a();
            long b3 = b();
            if (b2.d() != -1) {
                b3 = Math.min(b3, TimeUnit.SECONDS.toMillis((long) b2.d()));
            }
            long j2 = 0;
            long millis = b2.f() != -1 ? TimeUnit.SECONDS.toMillis((long) b2.f()) : 0;
            if (!c2.g() && b2.e() != -1) {
                j2 = TimeUnit.SECONDS.toMillis((long) b2.e());
            }
            if (!c2.h()) {
                long j3 = millis + a2;
                if (j3 < j2 + b3) {
                    a0.a E = this.c.E();
                    if (j3 >= b3) {
                        E.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a2 > 86400000 && f()) {
                        E.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new c((y) null, E.c());
                }
            }
            String str = this.f5147k;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = "If-None-Match";
            } else if (this.f5142f != null) {
                str = this.f5143g;
            } else if (this.f5140d == null) {
                return new c(this.b, (a0) null);
            } else {
                str = this.f5141e;
            }
            r.a f2 = this.b.d().f();
            p.e0.a.a.b(f2, str2, str);
            y.a g2 = this.b.g();
            g2.c(f2.d());
            return new c(g2.a(), this.c);
        }

        private static boolean e(y yVar) {
            return (yVar.c("If-Modified-Since") == null && yVar.c("If-None-Match") == null) ? false : true;
        }

        private boolean f() {
            return this.c.c().d() == -1 && this.f5144h == null;
        }

        public c c() {
            c d2 = d();
            return (d2.a == null || !this.b.b().j()) ? d2 : new c((y) null, (a0) null);
        }
    }

    c(y yVar, a0 a0Var) {
        this.a = yVar;
        this.b = a0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.c().b() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(p.a0 r3, p.y r4) {
        /*
            int r0 = r3.g()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x005a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 300: goto L_0x005a;
                case 301: goto L_0x005a;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0059
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.v(r0)
            if (r0 != 0) goto L_0x005a
            p.d r0 = r3.c()
            int r0 = r0.d()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            p.d r0 = r3.c()
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x005a
            p.d r0 = r3.c()
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            p.d r3 = r3.c()
            boolean r3 = r3.i()
            if (r3 != 0) goto L_0x006f
            p.d r3 = r4.b()
            boolean r3 = r3.i()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e0.e.c.a(p.a0, p.y):boolean");
    }
}
