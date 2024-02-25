package r.b.a.y;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import r.b.a.e;
import r.b.a.f;
import r.b.a.g;
import r.b.a.r;
import r.b.a.w.d;
import r.b.a.y.f;

final class b extends f implements Serializable {
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: e  reason: collision with root package name */
    private final long[] f5797e;

    /* renamed from: f  reason: collision with root package name */
    private final r[] f5798f;

    /* renamed from: g  reason: collision with root package name */
    private final long[] f5799g;

    /* renamed from: h  reason: collision with root package name */
    private final g[] f5800h;

    /* renamed from: i  reason: collision with root package name */
    private final r[] f5801i;

    /* renamed from: j  reason: collision with root package name */
    private final e[] f5802j;

    /* renamed from: k  reason: collision with root package name */
    private final ConcurrentMap<Integer, d[]> f5803k = new ConcurrentHashMap();

    private b(long[] jArr, r[] rVarArr, long[] jArr2, r[] rVarArr2, e[] eVarArr) {
        g gVar;
        this.f5797e = jArr;
        this.f5798f = rVarArr;
        this.f5799g = jArr2;
        this.f5801i = rVarArr2;
        this.f5802j = eVarArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < jArr2.length) {
            int i3 = i2 + 1;
            d dVar = new d(jArr2[i2], rVarArr2[i2], rVarArr2[i3]);
            if (dVar.m()) {
                arrayList.add(dVar.d());
                gVar = dVar.c();
            } else {
                arrayList.add(dVar.c());
                gVar = dVar.d();
            }
            arrayList.add(gVar);
            i2 = i3;
        }
        this.f5800h = (g[]) arrayList.toArray(new g[arrayList.size()]);
    }

    private Object g(g gVar, d dVar) {
        g d2 = dVar.d();
        boolean m2 = dVar.m();
        boolean z = gVar.z(d2);
        return m2 ? z ? dVar.k() : gVar.z(dVar.c()) ? dVar : dVar.j() : !z ? dVar.j() : gVar.z(dVar.c()) ? dVar.k() : dVar;
    }

    private d[] h(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        d[] dVarArr = (d[]) this.f5803k.get(valueOf);
        if (dVarArr != null) {
            return dVarArr;
        }
        e[] eVarArr = this.f5802j;
        d[] dVarArr2 = new d[eVarArr.length];
        for (int i3 = 0; i3 < eVarArr.length; i3++) {
            dVarArr2[i3] = eVarArr[i3].b(i2);
        }
        if (i2 < 2100) {
            this.f5803k.putIfAbsent(valueOf, dVarArr2);
        }
        return dVarArr2;
    }

    private int i(long j2, r rVar) {
        return f.b0(d.e(j2 + ((long) rVar.y()), 86400)).S();
    }

    private Object j(g gVar) {
        int i2 = 0;
        if (this.f5802j.length > 0) {
            g[] gVarArr = this.f5800h;
            if (gVar.y(gVarArr[gVarArr.length - 1])) {
                d[] h2 = h(gVar.T());
                Object obj = null;
                int length = h2.length;
                while (i2 < length) {
                    d dVar = h2[i2];
                    Object g2 = g(gVar, dVar);
                    if ((g2 instanceof d) || g2.equals(dVar.k())) {
                        return g2;
                    }
                    i2++;
                    obj = g2;
                }
                return obj;
            }
        }
        int binarySearch = Arrays.binarySearch(this.f5800h, gVar);
        if (binarySearch == -1) {
            return this.f5801i[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else {
            g[] gVarArr2 = this.f5800h;
            if (binarySearch < gVarArr2.length - 1) {
                int i3 = binarySearch + 1;
                if (gVarArr2[binarySearch].equals(gVarArr2[i3])) {
                    binarySearch = i3;
                }
            }
        }
        if ((binarySearch & 1) != 0) {
            return this.f5801i[(binarySearch / 2) + 1];
        }
        g[] gVarArr3 = this.f5800h;
        g gVar2 = gVarArr3[binarySearch];
        g gVar3 = gVarArr3[binarySearch + 1];
        r[] rVarArr = this.f5801i;
        int i4 = binarySearch / 2;
        r rVar = rVarArr[i4];
        r rVar2 = rVarArr[i4 + 1];
        return rVar2.y() > rVar.y() ? new d(gVar2, rVar, rVar2) : new d(gVar3, rVar, rVar2);
    }

    static b k(DataInput dataInput) {
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            jArr[i2] = a.b(dataInput);
        }
        int i3 = readInt + 1;
        r[] rVarArr = new r[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            rVarArr[i4] = a.d(dataInput);
        }
        int readInt2 = dataInput.readInt();
        long[] jArr2 = new long[readInt2];
        for (int i5 = 0; i5 < readInt2; i5++) {
            jArr2[i5] = a.b(dataInput);
        }
        int i6 = readInt2 + 1;
        r[] rVarArr2 = new r[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            rVarArr2[i7] = a.d(dataInput);
        }
        int readByte = dataInput.readByte();
        e[] eVarArr = new e[readByte];
        for (int i8 = 0; i8 < readByte; i8++) {
            eVarArr[i8] = e.c(dataInput);
        }
        return new b(jArr, rVarArr, jArr2, rVarArr2, eVarArr);
    }

    private Object writeReplace() {
        return new a((byte) 1, this);
    }

    public r a(e eVar) {
        long x = eVar.x();
        if (this.f5802j.length > 0) {
            long[] jArr = this.f5799g;
            if (x > jArr[jArr.length - 1]) {
                r[] rVarArr = this.f5801i;
                d[] h2 = h(i(x, rVarArr[rVarArr.length - 1]));
                d dVar = null;
                for (int i2 = 0; i2 < h2.length; i2++) {
                    dVar = h2[i2];
                    if (x < dVar.o()) {
                        return dVar.k();
                    }
                }
                return dVar.j();
            }
        }
        int binarySearch = Arrays.binarySearch(this.f5799g, x);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f5801i[binarySearch + 1];
    }

    public d b(g gVar) {
        Object j2 = j(gVar);
        if (j2 instanceof d) {
            return (d) j2;
        }
        return null;
    }

    public List<r> c(g gVar) {
        Object j2 = j(gVar);
        return j2 instanceof d ? ((d) j2).l() : Collections.singletonList((r) j2);
    }

    public boolean d() {
        return this.f5799g.length == 0;
    }

    public boolean e(g gVar, r rVar) {
        return c(gVar).contains(rVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return Arrays.equals(this.f5797e, bVar.f5797e) && Arrays.equals(this.f5798f, bVar.f5798f) && Arrays.equals(this.f5799g, bVar.f5799g) && Arrays.equals(this.f5801i, bVar.f5801i) && Arrays.equals(this.f5802j, bVar.f5802j);
        }
        if ((obj instanceof f.a) && d()) {
            e eVar = e.f5527g;
            if (a(eVar).equals(((f.a) obj).a(eVar))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.f5797e) ^ Arrays.hashCode(this.f5798f)) ^ Arrays.hashCode(this.f5799g)) ^ Arrays.hashCode(this.f5801i)) ^ Arrays.hashCode(this.f5802j);
    }

    /* access modifiers changed from: package-private */
    public void l(DataOutput dataOutput) {
        dataOutput.writeInt(this.f5797e.length);
        for (long e2 : this.f5797e) {
            a.e(e2, dataOutput);
        }
        for (r g2 : this.f5798f) {
            a.g(g2, dataOutput);
        }
        dataOutput.writeInt(this.f5799g.length);
        for (long e3 : this.f5799g) {
            a.e(e3, dataOutput);
        }
        for (r g3 : this.f5801i) {
            a.g(g3, dataOutput);
        }
        dataOutput.writeByte(this.f5802j.length);
        for (e d2 : this.f5802j) {
            d2.d(dataOutput);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StandardZoneRules[currentStandardOffset=");
        r[] rVarArr = this.f5798f;
        sb.append(rVarArr[rVarArr.length - 1]);
        sb.append("]");
        return sb.toString();
    }
}
