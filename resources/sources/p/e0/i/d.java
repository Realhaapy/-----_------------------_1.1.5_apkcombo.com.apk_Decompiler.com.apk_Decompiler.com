package p.e0.i;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import q.c;
import q.e;
import q.f;
import q.l;
import q.s;

final class d {
    static final c[] a;
    static final Map<f, Integer> b = b();

    static final class a {
        private final List<c> a;
        private final e b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        private int f5232d;

        /* renamed from: e  reason: collision with root package name */
        c[] f5233e;

        /* renamed from: f  reason: collision with root package name */
        int f5234f;

        /* renamed from: g  reason: collision with root package name */
        int f5235g;

        /* renamed from: h  reason: collision with root package name */
        int f5236h;

        a(int i2, int i3, s sVar) {
            this.a = new ArrayList();
            c[] cVarArr = new c[8];
            this.f5233e = cVarArr;
            this.f5234f = cVarArr.length - 1;
            this.f5235g = 0;
            this.f5236h = 0;
            this.c = i2;
            this.f5232d = i3;
            this.b = l.b(sVar);
        }

        a(int i2, s sVar) {
            this(i2, i2, sVar);
        }

        private void a() {
            int i2 = this.f5232d;
            int i3 = this.f5236h;
            if (i2 >= i3) {
                return;
            }
            if (i2 == 0) {
                b();
            } else {
                d(i3 - i2);
            }
        }

        private void b() {
            Arrays.fill(this.f5233e, (Object) null);
            this.f5234f = this.f5233e.length - 1;
            this.f5235g = 0;
            this.f5236h = 0;
        }

        private int c(int i2) {
            return this.f5234f + 1 + i2;
        }

        private int d(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f5233e.length;
                while (true) {
                    length--;
                    i3 = this.f5234f;
                    if (length < i3 || i2 <= 0) {
                        c[] cVarArr = this.f5233e;
                        System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i4, this.f5235g);
                        this.f5234f += i4;
                    } else {
                        c[] cVarArr2 = this.f5233e;
                        i2 -= cVarArr2[length].c;
                        this.f5236h -= cVarArr2[length].c;
                        this.f5235g--;
                        i4++;
                    }
                }
                c[] cVarArr3 = this.f5233e;
                System.arraycopy(cVarArr3, i3 + 1, cVarArr3, i3 + 1 + i4, this.f5235g);
                this.f5234f += i4;
            }
            return i4;
        }

        private f f(int i2) {
            c cVar;
            if (h(i2)) {
                cVar = d.a[i2];
            } else {
                int c2 = c(i2 - d.a.length);
                if (c2 >= 0) {
                    c[] cVarArr = this.f5233e;
                    if (c2 < cVarArr.length) {
                        cVar = cVarArr[c2];
                    }
                }
                throw new IOException("Header index too large " + (i2 + 1));
            }
            return cVar.a;
        }

        private void g(int i2, c cVar) {
            this.a.add(cVar);
            int i3 = cVar.c;
            if (i2 != -1) {
                i3 -= this.f5233e[c(i2)].c;
            }
            int i4 = this.f5232d;
            if (i3 > i4) {
                b();
                return;
            }
            int d2 = d((this.f5236h + i3) - i4);
            if (i2 == -1) {
                int i5 = this.f5235g + 1;
                c[] cVarArr = this.f5233e;
                if (i5 > cVarArr.length) {
                    c[] cVarArr2 = new c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f5234f = this.f5233e.length - 1;
                    this.f5233e = cVarArr2;
                }
                int i6 = this.f5234f;
                this.f5234f = i6 - 1;
                this.f5233e[i6] = cVar;
                this.f5235g++;
            } else {
                this.f5233e[i2 + c(i2) + d2] = cVar;
            }
            this.f5236h += i3;
        }

        private boolean h(int i2) {
            return i2 >= 0 && i2 <= d.a.length - 1;
        }

        private int i() {
            return this.b.readByte() & 255;
        }

        private void l(int i2) {
            if (h(i2)) {
                this.a.add(d.a[i2]);
                return;
            }
            int c2 = c(i2 - d.a.length);
            if (c2 >= 0) {
                c[] cVarArr = this.f5233e;
                if (c2 < cVarArr.length) {
                    this.a.add(cVarArr[c2]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        private void n(int i2) {
            g(-1, new c(f(i2), j()));
        }

        private void o() {
            f j2 = j();
            d.a(j2);
            g(-1, new c(j2, j()));
        }

        private void p(int i2) {
            this.a.add(new c(f(i2), j()));
        }

        private void q() {
            f j2 = j();
            d.a(j2);
            this.a.add(new c(j2, j()));
        }

        public List<c> e() {
            ArrayList arrayList = new ArrayList(this.a);
            this.a.clear();
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        public f j() {
            int i2 = i();
            boolean z = (i2 & 128) == 128;
            int m2 = m(i2, 127);
            return z ? f.m(k.f().c(this.b.u((long) m2))) : this.b.k((long) m2);
        }

        /* access modifiers changed from: package-private */
        public void k() {
            while (!this.b.s()) {
                byte readByte = this.b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    l(m(readByte, 127) - 1);
                } else if (readByte == 64) {
                    o();
                } else if ((readByte & 64) == 64) {
                    n(m(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m2 = m(readByte, 31);
                    this.f5232d = m2;
                    if (m2 < 0 || m2 > this.c) {
                        throw new IOException("Invalid dynamic table size update " + this.f5232d);
                    }
                    a();
                } else if (readByte == 16 || readByte == 0) {
                    q();
                } else {
                    p(m(readByte, 15) - 1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public int m(int i2, int i3) {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int i6 = i();
                if ((i6 & 128) == 0) {
                    return i3 + (i6 << i5);
                }
                i3 += (i6 & 127) << i5;
                i5 += 7;
            }
        }
    }

    static final class b {
        private final c a;
        private final boolean b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f5237d;

        /* renamed from: e  reason: collision with root package name */
        int f5238e;

        /* renamed from: f  reason: collision with root package name */
        c[] f5239f;

        /* renamed from: g  reason: collision with root package name */
        int f5240g;

        /* renamed from: h  reason: collision with root package name */
        int f5241h;

        /* renamed from: i  reason: collision with root package name */
        int f5242i;

        b(int i2, boolean z, c cVar) {
            this.c = Integer.MAX_VALUE;
            c[] cVarArr = new c[8];
            this.f5239f = cVarArr;
            this.f5240g = cVarArr.length - 1;
            this.f5241h = 0;
            this.f5242i = 0;
            this.f5238e = i2;
            this.b = z;
            this.a = cVar;
        }

        b(c cVar) {
            this(4096, true, cVar);
        }

        private void a() {
            int i2 = this.f5238e;
            int i3 = this.f5242i;
            if (i2 >= i3) {
                return;
            }
            if (i2 == 0) {
                b();
            } else {
                c(i3 - i2);
            }
        }

        private void b() {
            Arrays.fill(this.f5239f, (Object) null);
            this.f5240g = this.f5239f.length - 1;
            this.f5241h = 0;
            this.f5242i = 0;
        }

        private int c(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f5239f.length;
                while (true) {
                    length--;
                    i3 = this.f5240g;
                    if (length < i3 || i2 <= 0) {
                        c[] cVarArr = this.f5239f;
                        System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i4, this.f5241h);
                        c[] cVarArr2 = this.f5239f;
                        int i5 = this.f5240g;
                        Arrays.fill(cVarArr2, i5 + 1, i5 + 1 + i4, (Object) null);
                        this.f5240g += i4;
                    } else {
                        c[] cVarArr3 = this.f5239f;
                        i2 -= cVarArr3[length].c;
                        this.f5242i -= cVarArr3[length].c;
                        this.f5241h--;
                        i4++;
                    }
                }
                c[] cVarArr4 = this.f5239f;
                System.arraycopy(cVarArr4, i3 + 1, cVarArr4, i3 + 1 + i4, this.f5241h);
                c[] cVarArr22 = this.f5239f;
                int i52 = this.f5240g;
                Arrays.fill(cVarArr22, i52 + 1, i52 + 1 + i4, (Object) null);
                this.f5240g += i4;
            }
            return i4;
        }

        private void d(c cVar) {
            int i2 = cVar.c;
            int i3 = this.f5238e;
            if (i2 > i3) {
                b();
                return;
            }
            c((this.f5242i + i2) - i3);
            int i4 = this.f5241h + 1;
            c[] cVarArr = this.f5239f;
            if (i4 > cVarArr.length) {
                c[] cVarArr2 = new c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f5240g = this.f5239f.length - 1;
                this.f5239f = cVarArr2;
            }
            int i5 = this.f5240g;
            this.f5240g = i5 - 1;
            this.f5239f[i5] = cVar;
            this.f5241h++;
            this.f5242i += i2;
        }

        /* access modifiers changed from: package-private */
        public void e(int i2) {
            int min = Math.min(i2, 16384);
            int i3 = this.f5238e;
            if (i3 != min) {
                if (min < i3) {
                    this.c = Math.min(this.c, min);
                }
                this.f5237d = true;
                this.f5238e = min;
                a();
            }
        }

        /* access modifiers changed from: package-private */
        public void f(f fVar) {
            int i2;
            int i3;
            if (!this.b || k.f().e(fVar) >= fVar.v()) {
                i3 = fVar.v();
                i2 = 0;
            } else {
                c cVar = new c();
                k.f().d(fVar, cVar);
                fVar = cVar.S();
                i3 = fVar.v();
                i2 = 128;
            }
            h(i3, 127, i2);
            this.a.b0(fVar);
        }

        /* access modifiers changed from: package-private */
        public void g(List<c> list) {
            int i2;
            int i3;
            if (this.f5237d) {
                int i4 = this.c;
                if (i4 < this.f5238e) {
                    h(i4, 31, 32);
                }
                this.f5237d = false;
                this.c = Integer.MAX_VALUE;
                h(this.f5238e, 31, 32);
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                c cVar = list.get(i5);
                f y = cVar.a.y();
                f fVar = cVar.b;
                Integer num = d.b.get(y);
                if (num != null) {
                    i3 = num.intValue() + 1;
                    if (i3 > 1 && i3 < 8) {
                        c[] cVarArr = d.a;
                        if (p.e0.c.o(cVarArr[i3 - 1].b, fVar)) {
                            i2 = i3;
                        } else if (p.e0.c.o(cVarArr[i3].b, fVar)) {
                            i2 = i3;
                            i3++;
                        }
                    }
                    i2 = i3;
                    i3 = -1;
                } else {
                    i3 = -1;
                    i2 = -1;
                }
                if (i3 == -1) {
                    int i6 = this.f5240g + 1;
                    int length = this.f5239f.length;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        if (p.e0.c.o(this.f5239f[i6].a, y)) {
                            if (p.e0.c.o(this.f5239f[i6].b, fVar)) {
                                i3 = d.a.length + (i6 - this.f5240g);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i6 - this.f5240g) + d.a.length;
                            }
                        }
                        i6++;
                    }
                }
                if (i3 != -1) {
                    h(i3, 127, 128);
                } else {
                    if (i2 == -1) {
                        this.a.f0(64);
                        f(y);
                    } else if (!y.w(c.f5226d) || c.f5231i.equals(y)) {
                        h(i2, 63, 64);
                    } else {
                        h(i2, 15, 0);
                        f(fVar);
                    }
                    f(fVar);
                    d(cVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void h(int i2, int i3, int i4) {
            int i5;
            c cVar;
            if (i2 < i3) {
                cVar = this.a;
                i5 = i2 | i4;
            } else {
                this.a.f0(i4 | i3);
                i5 = i2 - i3;
                while (i5 >= 128) {
                    this.a.f0(128 | (i5 & 127));
                    i5 >>>= 7;
                }
                cVar = this.a;
            }
            cVar.f0(i5);
        }
    }

    static {
        f fVar = c.f5228f;
        f fVar2 = c.f5229g;
        f fVar3 = c.f5230h;
        f fVar4 = c.f5227e;
        a = new c[]{new c(c.f5231i, ""), new c(fVar, "GET"), new c(fVar, "POST"), new c(fVar2, "/"), new c(fVar2, "/index.html"), new c(fVar3, "http"), new c(fVar3, "https"), new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
    }

    static f a(f fVar) {
        int v = fVar.v();
        int i2 = 0;
        while (i2 < v) {
            byte k2 = fVar.k(i2);
            if (k2 < 65 || k2 > 90) {
                i2++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.A());
            }
        }
        return fVar;
    }

    private static Map<f, Integer> b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.length);
        int i2 = 0;
        while (true) {
            c[] cVarArr = a;
            if (i2 >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i2].a)) {
                linkedHashMap.put(cVarArr[i2].a, Integer.valueOf(i2));
            }
            i2++;
        }
    }
}
