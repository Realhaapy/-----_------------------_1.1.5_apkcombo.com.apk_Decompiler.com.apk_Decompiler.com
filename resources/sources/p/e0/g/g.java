package p.e0.g;

import java.util.List;
import p.a0;
import p.e;
import p.e0.f.c;
import p.i;
import p.p;
import p.t;
import p.y;

public final class g implements t.a {
    private final List<t> a;
    private final p.e0.f.g b;
    private final c c;

    /* renamed from: d  reason: collision with root package name */
    private final c f5181d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5182e;

    /* renamed from: f  reason: collision with root package name */
    private final y f5183f;

    /* renamed from: g  reason: collision with root package name */
    private final e f5184g;

    /* renamed from: h  reason: collision with root package name */
    private final p f5185h;

    /* renamed from: i  reason: collision with root package name */
    private final int f5186i;

    /* renamed from: j  reason: collision with root package name */
    private final int f5187j;

    /* renamed from: k  reason: collision with root package name */
    private final int f5188k;

    /* renamed from: l  reason: collision with root package name */
    private int f5189l;

    public g(List<t> list, p.e0.f.g gVar, c cVar, c cVar2, int i2, y yVar, e eVar, p pVar, int i3, int i4, int i5) {
        this.a = list;
        this.f5181d = cVar2;
        this.b = gVar;
        this.c = cVar;
        this.f5182e = i2;
        this.f5183f = yVar;
        this.f5184g = eVar;
        this.f5185h = pVar;
        this.f5186i = i3;
        this.f5187j = i4;
        this.f5188k = i5;
    }

    public int a() {
        return this.f5186i;
    }

    public int b() {
        return this.f5187j;
    }

    public int c() {
        return this.f5188k;
    }

    public a0 d(y yVar) {
        return j(yVar, this.b, this.c, this.f5181d);
    }

    public y e() {
        return this.f5183f;
    }

    public e f() {
        return this.f5184g;
    }

    public i g() {
        return this.f5181d;
    }

    public p h() {
        return this.f5185h;
    }

    public c i() {
        return this.c;
    }

    public a0 j(y yVar, p.e0.f.g gVar, c cVar, c cVar2) {
        if (this.f5182e < this.a.size()) {
            this.f5189l++;
            if (this.c != null && !this.f5181d.s(yVar.h())) {
                throw new IllegalStateException("network interceptor " + this.a.get(this.f5182e - 1) + " must retain the same host and port");
            } else if (this.c == null || this.f5189l <= 1) {
                List<t> list = this.a;
                int i2 = this.f5182e;
                e eVar = this.f5184g;
                p pVar = this.f5185h;
                int i3 = this.f5186i;
                int i4 = this.f5187j;
                int i5 = i2;
                String str = " must call proceed() exactly once";
                g gVar2 = new g(list, gVar, cVar, cVar2, i2 + 1, yVar, eVar, pVar, i3, i4, this.f5188k);
                t tVar = list.get(i5);
                a0 a2 = tVar.a(gVar2);
                if (cVar != null && this.f5182e + 1 < this.a.size() && gVar2.f5189l != 1) {
                    throw new IllegalStateException("network interceptor " + tVar + str);
                } else if (a2 == null) {
                    throw new NullPointerException("interceptor " + tVar + " returned null");
                } else if (a2.a() != null) {
                    return a2;
                } else {
                    throw new IllegalStateException("interceptor " + tVar + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + this.a.get(this.f5182e - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }

    public p.e0.f.g k() {
        return this.b;
    }
}
