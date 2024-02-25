package f.e.d.y.n;

import f.e.d.a0.b;
import f.e.d.f;
import f.e.d.l;
import f.e.d.q;
import f.e.d.t;
import f.e.d.v;
import f.e.d.w;
import f.e.d.y.c;
import f.e.d.y.i;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public final class g implements w {

    /* renamed from: e  reason: collision with root package name */
    private final c f4384e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f4385f;

    private final class a<K, V> extends v<Map<K, V>> {
        private final v<K> a;
        private final v<V> b;
        private final i<? extends Map<K, V>> c;

        public a(f fVar, Type type, v<K> vVar, Type type2, v<V> vVar2, i<? extends Map<K, V>> iVar) {
            this.a = new m(fVar, vVar, type);
            this.b = new m(fVar, vVar2, type2);
            this.c = iVar;
        }

        private String f(l lVar) {
            if (lVar.o()) {
                q j2 = lVar.j();
                if (j2.w()) {
                    return String.valueOf(j2.t());
                }
                if (j2.u()) {
                    return Boolean.toString(j2.p());
                }
                if (j2.x()) {
                    return j2.k();
                }
                throw new AssertionError();
            } else if (lVar.m()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: g */
        public Map<K, V> c(f.e.d.a0.a aVar) {
            b d0 = aVar.d0();
            if (d0 == b.NULL) {
                aVar.Z();
                return null;
            }
            Map<K, V> map = (Map) this.c.a();
            if (d0 == b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.L()) {
                    aVar.a();
                    K c2 = this.a.c(aVar);
                    if (map.put(c2, this.b.c(aVar)) == null) {
                        aVar.z();
                    } else {
                        throw new t("duplicate key: " + c2);
                    }
                }
                aVar.z();
            } else {
                aVar.c();
                while (aVar.L()) {
                    f.e.d.y.f.a.a(aVar);
                    K c3 = this.a.c(aVar);
                    if (map.put(c3, this.b.c(aVar)) != null) {
                        throw new t("duplicate key: " + c3);
                    }
                }
                aVar.B();
            }
            return map;
        }

        /* renamed from: h */
        public void e(f.e.d.a0.c cVar, Map<K, V> map) {
            if (map == null) {
                cVar.S();
            } else if (!g.this.f4385f) {
                cVar.o();
                for (Map.Entry next : map.entrySet()) {
                    cVar.O(String.valueOf(next.getKey()));
                    this.b.e(cVar, next.getValue());
                }
                cVar.B();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i2 = 0;
                boolean z = false;
                for (Map.Entry next2 : map.entrySet()) {
                    l d2 = this.a.d(next2.getKey());
                    arrayList.add(d2);
                    arrayList2.add(next2.getValue());
                    z |= d2.l() || d2.n();
                }
                if (z) {
                    cVar.g();
                    int size = arrayList.size();
                    while (i2 < size) {
                        cVar.g();
                        f.e.d.y.l.b((l) arrayList.get(i2), cVar);
                        this.b.e(cVar, arrayList2.get(i2));
                        cVar.z();
                        i2++;
                    }
                    cVar.z();
                    return;
                }
                cVar.o();
                int size2 = arrayList.size();
                while (i2 < size2) {
                    cVar.O(f((l) arrayList.get(i2)));
                    this.b.e(cVar, arrayList2.get(i2));
                    i2++;
                }
                cVar.B();
            }
        }
    }

    public g(c cVar, boolean z) {
        this.f4384e = cVar;
        this.f4385f = z;
    }

    private v<?> a(f fVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? n.f4404f : fVar.j(f.e.d.z.a.b(type));
    }

    public <T> v<T> create(f fVar, f.e.d.z.a<T> aVar) {
        Type e2 = aVar.e();
        if (!Map.class.isAssignableFrom(aVar.c())) {
            return null;
        }
        Type[] j2 = f.e.d.y.b.j(e2, f.e.d.y.b.k(e2));
        return new a(fVar, j2[0], a(fVar, j2[0]), j2[1], fVar.j(f.e.d.z.a.b(j2[1])), this.f4384e.a(aVar));
    }
}
