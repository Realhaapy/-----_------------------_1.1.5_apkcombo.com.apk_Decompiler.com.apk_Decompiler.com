package r.b.a.v;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import r.b.a.m;
import r.b.a.q;
import r.b.a.u.h;
import r.b.a.w.c;
import r.b.a.x.i;
import r.b.a.x.j;
import r.b.a.x.k;

final class d {
    private Locale a;
    private h b;
    private h c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public q f5711d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5712e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5713f = true;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<b> f5714g;

    final class b extends c {

        /* renamed from: e  reason: collision with root package name */
        h f5715e;

        /* renamed from: f  reason: collision with root package name */
        q f5716f;

        /* renamed from: g  reason: collision with root package name */
        final Map<i, Long> f5717g;

        /* renamed from: h  reason: collision with root package name */
        boolean f5718h;

        /* renamed from: i  reason: collision with root package name */
        m f5719i;

        private b() {
            this.f5715e = null;
            this.f5716f = null;
            this.f5717g = new HashMap();
            this.f5719i = m.f5567h;
        }

        public <R> R f(k<R> kVar) {
            return kVar == j.a() ? this.f5715e : (kVar == j.g() || kVar == j.f()) ? this.f5716f : super.f(kVar);
        }

        public boolean j(i iVar) {
            return this.f5717g.containsKey(iVar);
        }

        public int l(i iVar) {
            if (this.f5717g.containsKey(iVar)) {
                return r.b.a.w.d.p(this.f5717g.get(iVar).longValue());
            }
            throw new r.b.a.x.m("Unsupported field: " + iVar);
        }

        public long n(i iVar) {
            if (this.f5717g.containsKey(iVar)) {
                return this.f5717g.get(iVar).longValue();
            }
            throw new r.b.a.x.m("Unsupported field: " + iVar);
        }

        public String toString() {
            return this.f5717g.toString() + "," + this.f5715e + "," + this.f5716f;
        }

        /* access modifiers changed from: protected */
        public b u() {
            b bVar = new b();
            bVar.f5715e = this.f5715e;
            bVar.f5716f = this.f5716f;
            bVar.f5717g.putAll(this.f5717g);
            bVar.f5718h = this.f5718h;
            return bVar;
        }

        /* access modifiers changed from: package-private */
        public a v() {
            a aVar = new a();
            aVar.f5654e.putAll(this.f5717g);
            aVar.f5655f = d.this.g();
            q qVar = this.f5716f;
            if (qVar == null) {
                qVar = d.this.f5711d;
            }
            aVar.f5656g = qVar;
            aVar.f5659j = this.f5718h;
            aVar.f5660k = this.f5719i;
            return aVar;
        }
    }

    d(b bVar) {
        ArrayList<b> arrayList = new ArrayList<>();
        this.f5714g = arrayList;
        this.a = bVar.f();
        this.b = bVar.e();
        this.c = bVar.d();
        this.f5711d = bVar.g();
        arrayList.add(new b());
    }

    d(d dVar) {
        ArrayList<b> arrayList = new ArrayList<>();
        this.f5714g = arrayList;
        this.a = dVar.a;
        this.b = dVar.b;
        this.c = dVar.c;
        this.f5711d = dVar.f5711d;
        this.f5712e = dVar.f5712e;
        this.f5713f = dVar.f5713f;
        arrayList.add(new b());
    }

    static boolean c(char c2, char c3) {
        return c2 == c3 || Character.toUpperCase(c2) == Character.toUpperCase(c3) || Character.toLowerCase(c2) == Character.toLowerCase(c3);
    }

    private b e() {
        ArrayList<b> arrayList = this.f5714g;
        return arrayList.get(arrayList.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public boolean b(char c2, char c3) {
        return k() ? c2 == c3 : c(c2, c3);
    }

    /* access modifiers changed from: package-private */
    public d d() {
        return new d(this);
    }

    /* access modifiers changed from: package-private */
    public void f(boolean z) {
        ArrayList<b> arrayList;
        int i2;
        if (z) {
            arrayList = this.f5714g;
            i2 = arrayList.size() - 2;
        } else {
            arrayList = this.f5714g;
            i2 = arrayList.size() - 1;
        }
        arrayList.remove(i2);
    }

    /* access modifiers changed from: package-private */
    public h g() {
        h hVar = e().f5715e;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = this.c;
        return hVar2 == null ? r.b.a.u.m.f5618g : hVar2;
    }

    /* access modifiers changed from: package-private */
    public Locale h() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public Long i(i iVar) {
        return e().f5717g.get(iVar);
    }

    /* access modifiers changed from: package-private */
    public h j() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f5712e;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f5713f;
    }

    /* access modifiers changed from: package-private */
    public void m(boolean z) {
        this.f5712e = z;
    }

    /* access modifiers changed from: package-private */
    public void n(q qVar) {
        r.b.a.w.d.i(qVar, "zone");
        e().f5716f = qVar;
    }

    /* access modifiers changed from: package-private */
    public int o(i iVar, long j2, int i2, int i3) {
        r.b.a.w.d.i(iVar, "field");
        Long put = e().f5717g.put(iVar, Long.valueOf(j2));
        return (put == null || put.longValue() == j2) ? i3 : ~i2;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        e().f5718h = true;
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z) {
        this.f5713f = z;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.f5714g.add(e().u());
    }

    /* access modifiers changed from: package-private */
    public boolean s(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4) {
        if (i2 + i4 > charSequence.length() || i3 + i4 > charSequence2.length()) {
            return false;
        }
        if (k()) {
            for (int i5 = 0; i5 < i4; i5++) {
                if (charSequence.charAt(i2 + i5) != charSequence2.charAt(i3 + i5)) {
                    return false;
                }
            }
            return true;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            char charAt = charSequence.charAt(i2 + i6);
            char charAt2 = charSequence2.charAt(i3 + i6);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public b t() {
        return e();
    }

    public String toString() {
        return e().toString();
    }
}
