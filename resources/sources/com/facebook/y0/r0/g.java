package com.facebook.y0.r0;

import com.facebook.y0.r0.h;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import m.p;
import m.y.d.l;

public final class g {

    /* renamed from: m  reason: collision with root package name */
    public static final a f2117m = new a((m.y.d.g) null);

    /* renamed from: n  reason: collision with root package name */
    private static final Map<String, String> f2118n = a0.e(p.a("embedding.weight", "embed.weight"), p.a("dense1.weight", "fc1.weight"), p.a("dense2.weight", "fc2.weight"), p.a("dense3.weight", "fc3.weight"), p.a("dense1.bias", "fc1.bias"), p.a("dense2.bias", "fc2.bias"), p.a("dense3.bias", "fc3.bias"));
    private final f a;
    private final f b;
    private final f c;

    /* renamed from: d  reason: collision with root package name */
    private final f f2119d;

    /* renamed from: e  reason: collision with root package name */
    private final f f2120e;

    /* renamed from: f  reason: collision with root package name */
    private final f f2121f;

    /* renamed from: g  reason: collision with root package name */
    private final f f2122g;

    /* renamed from: h  reason: collision with root package name */
    private final f f2123h;

    /* renamed from: i  reason: collision with root package name */
    private final f f2124i;

    /* renamed from: j  reason: collision with root package name */
    private final f f2125j;

    /* renamed from: k  reason: collision with root package name */
    private final f f2126k;

    /* renamed from: l  reason: collision with root package name */
    private final Map<String, f> f2127l;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(m.y.d.g gVar) {
            this();
        }

        private final Map<String, f> b(File file) {
            j jVar = j.a;
            Map<String, f> c = j.c(file);
            if (c == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            Map a = g.a();
            for (Map.Entry next : c.entrySet()) {
                String str = (String) next.getKey();
                if (a.containsKey(next.getKey()) && (str = (String) a.get(next.getKey())) == null) {
                    return null;
                }
                hashMap.put(str, next.getValue());
            }
            return hashMap;
        }

        public final g a(File file) {
            l.d(file, "file");
            Map<String, f> b = b(file);
            if (b == null) {
                return null;
            }
            try {
                return new g(b, (m.y.d.g) null);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private g(Map<String, f> map) {
        f fVar = map.get("embed.weight");
        if (fVar != null) {
            this.a = fVar;
            i iVar = i.a;
            f fVar2 = map.get("convs.0.weight");
            if (fVar2 != null) {
                this.b = i.l(fVar2);
                f fVar3 = map.get("convs.1.weight");
                if (fVar3 != null) {
                    this.c = i.l(fVar3);
                    f fVar4 = map.get("convs.2.weight");
                    if (fVar4 != null) {
                        this.f2119d = i.l(fVar4);
                        f fVar5 = map.get("convs.0.bias");
                        if (fVar5 != null) {
                            this.f2120e = fVar5;
                            f fVar6 = map.get("convs.1.bias");
                            if (fVar6 != null) {
                                this.f2121f = fVar6;
                                f fVar7 = map.get("convs.2.bias");
                                if (fVar7 != null) {
                                    this.f2122g = fVar7;
                                    f fVar8 = map.get("fc1.weight");
                                    if (fVar8 != null) {
                                        this.f2123h = i.k(fVar8);
                                        f fVar9 = map.get("fc2.weight");
                                        if (fVar9 != null) {
                                            this.f2124i = i.k(fVar9);
                                            f fVar10 = map.get("fc1.bias");
                                            if (fVar10 != null) {
                                                this.f2125j = fVar10;
                                                f fVar11 = map.get("fc2.bias");
                                                if (fVar11 != null) {
                                                    this.f2126k = fVar11;
                                                    this.f2127l = new HashMap();
                                                    for (String str : e0.f(h.a.MTML_INTEGRITY_DETECT.c(), h.a.MTML_APP_EVENT_PREDICTION.c())) {
                                                        String j2 = l.j(str, ".weight");
                                                        String j3 = l.j(str, ".bias");
                                                        f fVar12 = map.get(j2);
                                                        f fVar13 = map.get(j3);
                                                        if (fVar12 != null) {
                                                            i iVar2 = i.a;
                                                            this.f2127l.put(j2, i.k(fVar12));
                                                        }
                                                        if (fVar13 != null) {
                                                            this.f2127l.put(j3, fVar13);
                                                        }
                                                    }
                                                    return;
                                                }
                                                throw new IllegalStateException("Required value was null.".toString());
                                            }
                                            throw new IllegalStateException("Required value was null.".toString());
                                        }
                                        throw new IllegalStateException("Required value was null.".toString());
                                    }
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public /* synthetic */ g(Map map, m.y.d.g gVar) {
        this(map);
    }

    public static final /* synthetic */ Map a() {
        Class<g> cls = g.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return f2118n;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public final f b(f fVar, String[] strArr, String str) {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            l.d(fVar, "dense");
            l.d(strArr, "texts");
            l.d(str, "task");
            i iVar = i.a;
            f c2 = i.c(i.e(strArr, 128, this.a), this.b);
            i.a(c2, this.f2120e);
            i.i(c2);
            f c3 = i.c(c2, this.c);
            i.a(c3, this.f2121f);
            i.i(c3);
            f g2 = i.g(c3, 2);
            f c4 = i.c(g2, this.f2119d);
            i.a(c4, this.f2122g);
            i.i(c4);
            f g3 = i.g(c2, c2.b(1));
            f g4 = i.g(g2, g2.b(1));
            f g5 = i.g(c4, c4.b(1));
            i.f(g3, 1);
            i.f(g4, 1);
            i.f(g5, 1);
            f d2 = i.d(i.b(new f[]{g3, g4, g5, fVar}), this.f2123h, this.f2125j);
            i.i(d2);
            f d3 = i.d(d2, this.f2124i, this.f2126k);
            i.i(d3);
            f fVar2 = this.f2127l.get(l.j(str, ".weight"));
            f fVar3 = this.f2127l.get(l.j(str, ".bias"));
            if (fVar2 != null) {
                if (fVar3 != null) {
                    f d4 = i.d(d3, fVar2, fVar3);
                    i.j(d4);
                    return d4;
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }
}
