package p.e0.i;

import p.r;
import q.f;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final f f5226d = f.j(":");

    /* renamed from: e  reason: collision with root package name */
    public static final f f5227e = f.j(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final f f5228f = f.j(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final f f5229g = f.j(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final f f5230h = f.j(":scheme");

    /* renamed from: i  reason: collision with root package name */
    public static final f f5231i = f.j(":authority");
    public final f a;
    public final f b;
    final int c;

    interface a {
        void a(r rVar);
    }

    public c(String str, String str2) {
        this(f.j(str), f.j(str2));
    }

    public c(f fVar, String str) {
        this(fVar, f.j(str));
    }

    public c(f fVar, f fVar2) {
        this.a = fVar;
        this.b = fVar2;
        this.c = fVar.v() + 32 + fVar2.v();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && this.b.equals(cVar.b);
    }

    public int hashCode() {
        return ((527 + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return p.e0.c.p("%s: %s", this.a.A(), this.b.A());
    }
}
