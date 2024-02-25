package f.e.c.a;

import f.e.c.a.a0.o;
import f.e.c.a.y.c0;
import f.e.c.a.y.i0;
import f.e.c.a.y.z;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class p<P> {
    private final ConcurrentMap<c, List<b<P>>> a = new ConcurrentHashMap();
    private b<P> b;
    private final Class<P> c;

    public static final class b<P> {
        private final P a;
        private final byte[] b;
        private final z c;

        /* renamed from: d  reason: collision with root package name */
        private final i0 f4028d;

        b(P p2, byte[] bArr, z zVar, i0 i0Var, int i2) {
            this.a = p2;
            this.b = Arrays.copyOf(bArr, bArr.length);
            this.c = zVar;
            this.f4028d = i0Var;
        }

        public final byte[] a() {
            byte[] bArr = this.b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public i0 b() {
            return this.f4028d;
        }

        public P c() {
            return this.a;
        }

        public z d() {
            return this.c;
        }
    }

    private static class c implements Comparable<c> {

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f4029e;

        private c(byte[] bArr) {
            this.f4029e = Arrays.copyOf(bArr, bArr.length);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compareTo(f.e.c.a.p.c r7) {
            /*
                r6 = this;
                byte[] r0 = r6.f4029e
                int r1 = r0.length
                byte[] r2 = r7.f4029e
                int r3 = r2.length
                if (r1 == r3) goto L_0x000c
                int r7 = r0.length
                int r0 = r2.length
            L_0x000a:
                int r7 = r7 - r0
                return r7
            L_0x000c:
                r0 = 0
                r1 = 0
            L_0x000e:
                byte[] r2 = r6.f4029e
                int r3 = r2.length
                if (r1 >= r3) goto L_0x0023
                byte r3 = r2[r1]
                byte[] r4 = r7.f4029e
                byte r5 = r4[r1]
                if (r3 == r5) goto L_0x0020
                byte r7 = r2[r1]
                byte r0 = r4[r1]
                goto L_0x000a
            L_0x0020:
                int r1 = r1 + 1
                goto L_0x000e
            L_0x0023:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.p.c.compareTo(f.e.c.a.p$c):int");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return Arrays.equals(this.f4029e, ((c) obj).f4029e);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f4029e);
        }

        public String toString() {
            return o.b(this.f4029e);
        }
    }

    private p(Class<P> cls) {
        this.c = cls;
    }

    public static <P> p<P> f(Class<P> cls) {
        return new p<>(cls);
    }

    public b<P> a(P p2, c0.c cVar) {
        if (cVar.V() == z.ENABLED) {
            b bVar = new b(p2, c.a(cVar), cVar.V(), cVar.U(), cVar.T());
            ArrayList arrayList = new ArrayList();
            arrayList.add(bVar);
            c cVar2 = new c(bVar.a());
            List list = (List) this.a.put(cVar2, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(bVar);
                this.a.put(cVar2, Collections.unmodifiableList(arrayList2));
            }
            return bVar;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    public b<P> b() {
        return this.b;
    }

    public List<b<P>> c(byte[] bArr) {
        List<b<P>> list = (List) this.a.get(new c(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public Class<P> d() {
        return this.c;
    }

    public List<b<P>> e() {
        return c(c.a);
    }

    public void g(b<P> bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        } else if (bVar.d() != z.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        } else if (!c(bVar.a()).isEmpty()) {
            this.b = bVar;
        } else {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
    }
}
