package f.e.a.a.i.x.a;

import com.google.firebase.o.j.f;
import f.e.a.a.i.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a {
    private final f a;
    private final List<d> b;
    private final b c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3819d;

    /* renamed from: f.e.a.a.i.x.a.a$a  reason: collision with other inner class name */
    public static final class C0103a {
        private f a = null;
        private List<d> b = new ArrayList();
        private b c = null;

        /* renamed from: d  reason: collision with root package name */
        private String f3820d = "";

        C0103a() {
        }

        public C0103a a(d dVar) {
            this.b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.a, Collections.unmodifiableList(this.b), this.c, this.f3820d);
        }

        public C0103a c(String str) {
            this.f3820d = str;
            return this;
        }

        public C0103a d(b bVar) {
            this.c = bVar;
            return this;
        }

        public C0103a e(f fVar) {
            this.a = fVar;
            return this;
        }
    }

    static {
        new C0103a().b();
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.a = fVar;
        this.b = list;
        this.c = bVar;
        this.f3819d = str;
    }

    public static C0103a e() {
        return new C0103a();
    }

    @f(tag = 4)
    public String a() {
        return this.f3819d;
    }

    @f(tag = 3)
    public b b() {
        return this.c;
    }

    @f(tag = 2)
    public List<d> c() {
        return this.b;
    }

    @f(tag = 1)
    public f d() {
        return this.a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
