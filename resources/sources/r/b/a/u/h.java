package r.b.a.u;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import r.b.a.b;
import r.b.a.q;
import r.b.a.w.d;
import r.b.a.x.a;
import r.b.a.x.e;
import r.b.a.x.i;
import r.b.a.x.j;

public abstract class h implements Comparable<h> {

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap<String, h> f5594e = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private static final ConcurrentHashMap<String, h> f5595f = new ConcurrentHashMap<>();

    static {
        try {
            Locale.class.getMethod("getUnicodeLocaleType", new Class[]{String.class});
        } catch (Throwable unused) {
        }
    }

    protected h() {
    }

    public static h j(e eVar) {
        d.i(eVar, "temporal");
        h hVar = (h) eVar.f(j.a());
        return hVar != null ? hVar : m.f5618g;
    }

    private static void m() {
        ConcurrentHashMap<String, h> concurrentHashMap = f5594e;
        if (concurrentHashMap.isEmpty()) {
            t(m.f5618g);
            t(v.f5646g);
            t(r.f5639g);
            t(o.f5623h);
            j jVar = j.f5596g;
            t(jVar);
            concurrentHashMap.putIfAbsent("Hijrah", jVar);
            f5595f.putIfAbsent("islamic", jVar);
            Iterator<S> it = ServiceLoader.load(h.class, h.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                f5594e.putIfAbsent(hVar.l(), hVar);
                String k2 = hVar.k();
                if (k2 != null) {
                    f5595f.putIfAbsent(k2, hVar);
                }
            }
        }
    }

    public static h o(String str) {
        m();
        h hVar = f5594e.get(str);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = f5595f.get(str);
        if (hVar2 != null) {
            return hVar2;
        }
        throw new b("Unknown chronology: " + str);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    static h s(DataInput dataInput) {
        return o(dataInput.readUTF());
    }

    private static void t(h hVar) {
        f5594e.putIfAbsent(hVar.l(), hVar);
        String k2 = hVar.k();
        if (k2 != null) {
            f5595f.putIfAbsent(k2, hVar);
        }
    }

    private Object writeReplace() {
        return new u((byte) 11, this);
    }

    /* renamed from: a */
    public int compareTo(h hVar) {
        return l().compareTo(hVar.l());
    }

    public abstract b c(e eVar);

    /* access modifiers changed from: package-private */
    public <D extends b> D d(r.b.a.x.d dVar) {
        D d2 = (b) dVar;
        if (equals(d2.x())) {
            return d2;
        }
        throw new ClassCastException("Chrono mismatch, expected: " + l() + ", actual: " + d2.x().l());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && compareTo((h) obj) == 0;
    }

    /* access modifiers changed from: package-private */
    public <D extends b> d<D> f(r.b.a.x.d dVar) {
        d<D> dVar2 = (d) dVar;
        if (equals(dVar2.E().x())) {
            return dVar2;
        }
        throw new ClassCastException("Chrono mismatch, required: " + l() + ", supplied: " + dVar2.E().x().l());
    }

    /* access modifiers changed from: package-private */
    public <D extends b> g<D> g(r.b.a.x.d dVar) {
        g<D> gVar = (g) dVar;
        if (equals(gVar.D().x())) {
            return gVar;
        }
        throw new ClassCastException("Chrono mismatch, required: " + l() + ", supplied: " + gVar.D().x().l());
    }

    public abstract i h(int i2);

    public int hashCode() {
        return getClass().hashCode() ^ l().hashCode();
    }

    public abstract String k();

    public abstract String l();

    public c<?> n(e eVar) {
        try {
            return c(eVar).v(r.b.a.h.x(eVar));
        } catch (b e2) {
            throw new b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + eVar.getClass(), e2);
        }
    }

    public String toString() {
        return l();
    }

    /* access modifiers changed from: package-private */
    public void u(Map<i, Long> map, a aVar, long j2) {
        Long l2 = map.get(aVar);
        if (l2 == null || l2.longValue() == j2) {
            map.put(aVar, Long.valueOf(j2));
            return;
        }
        throw new b("Invalid state, field: " + aVar + " " + l2 + " conflicts with " + aVar + " " + j2);
    }

    /* access modifiers changed from: package-private */
    public void v(DataOutput dataOutput) {
        dataOutput.writeUTF(l());
    }

    public f<?> w(r.b.a.e eVar, q qVar) {
        return g.L(this, eVar, qVar);
    }
}
