package r.b.a.y;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import r.b.a.c;
import r.b.a.f;
import r.b.a.g;
import r.b.a.h;
import r.b.a.i;
import r.b.a.r;
import r.b.a.u.m;
import r.b.a.w.d;

public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: e  reason: collision with root package name */
    private final i f5809e;

    /* renamed from: f  reason: collision with root package name */
    private final byte f5810f;

    /* renamed from: g  reason: collision with root package name */
    private final c f5811g;

    /* renamed from: h  reason: collision with root package name */
    private final h f5812h;

    /* renamed from: i  reason: collision with root package name */
    private final int f5813i;

    /* renamed from: j  reason: collision with root package name */
    private final b f5814j;

    /* renamed from: k  reason: collision with root package name */
    private final r f5815k;

    /* renamed from: l  reason: collision with root package name */
    private final r f5816l;

    /* renamed from: m  reason: collision with root package name */
    private final r f5817m;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                r.b.a.y.e$b[] r0 = r.b.a.y.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                r.b.a.y.e$b r1 = r.b.a.y.e.b.UTC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                r.b.a.y.e$b r1 = r.b.a.y.e.b.STANDARD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r.b.a.y.e.a.<clinit>():void");
        }
    }

    public enum b {
        UTC,
        WALL,
        STANDARD;

        public g a(g gVar, r rVar, r rVar2) {
            long y;
            int i2 = a.a[ordinal()];
            if (i2 == 1) {
                y = (long) (rVar2.y() - r.f5578i.y());
            } else if (i2 != 2) {
                return gVar;
            } else {
                y = (long) (rVar2.y() - rVar.y());
            }
            return gVar.f0(y);
        }
    }

    e(i iVar, int i2, c cVar, h hVar, int i3, b bVar, r rVar, r rVar2, r rVar3) {
        this.f5809e = iVar;
        this.f5810f = (byte) i2;
        this.f5811g = cVar;
        this.f5812h = hVar;
        this.f5813i = i3;
        this.f5814j = bVar;
        this.f5815k = rVar;
        this.f5816l = rVar2;
        this.f5817m = rVar3;
    }

    private void a(StringBuilder sb, long j2) {
        if (j2 < 10) {
            sb.append(0);
        }
        sb.append(j2);
    }

    static e c(DataInput dataInput) {
        int readInt = dataInput.readInt();
        i u = i.u(readInt >>> 28);
        int i2 = ((264241152 & readInt) >>> 22) - 32;
        int i3 = (3670016 & readInt) >>> 19;
        c a2 = i3 == 0 ? null : c.a(i3);
        int i4 = (507904 & readInt) >>> 14;
        b bVar = b.values()[(readInt & 12288) >>> 12];
        int i5 = (readInt & 4080) >>> 4;
        int i6 = (readInt & 12) >>> 2;
        int i7 = readInt & 3;
        int readInt2 = i4 == 31 ? dataInput.readInt() : i4 * 3600;
        r B = r.B(i5 == 255 ? dataInput.readInt() : (i5 - 128) * 900);
        r B2 = r.B(i6 == 3 ? dataInput.readInt() : B.y() + (i6 * 1800));
        r B3 = r.B(i7 == 3 ? dataInput.readInt() : B.y() + (i7 * 1800));
        if (i2 >= -28 && i2 <= 31 && i2 != 0) {
            return new e(u, i2, a2, h.I((long) d.f(readInt2, 86400)), d.d(readInt2, 86400), bVar, B, B2, B3);
        }
        throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public d b(int i2) {
        f fVar;
        r.b.a.x.f fVar2;
        byte b2 = this.f5810f;
        if (b2 < 0) {
            i iVar = this.f5809e;
            fVar = f.a0(i2, iVar, iVar.c(m.f5618g.z((long) i2)) + 1 + this.f5810f);
            c cVar = this.f5811g;
            if (cVar != null) {
                fVar2 = r.b.a.x.g.b(cVar);
            }
            return new d(this.f5814j.a(g.W(fVar.f0((long) this.f5813i), this.f5812h), this.f5815k, this.f5816l), this.f5816l, this.f5817m);
        }
        fVar = f.a0(i2, this.f5809e, b2);
        c cVar2 = this.f5811g;
        if (cVar2 != null) {
            fVar2 = r.b.a.x.g.a(cVar2);
        }
        return new d(this.f5814j.a(g.W(fVar.f0((long) this.f5813i), this.f5812h), this.f5815k, this.f5816l), this.f5816l, this.f5817m);
        fVar = fVar.h(fVar2);
        return new d(this.f5814j.a(g.W(fVar.f0((long) this.f5813i), this.f5812h), this.f5815k, this.f5816l), this.f5816l, this.f5817m);
    }

    /* access modifiers changed from: package-private */
    public void d(DataOutput dataOutput) {
        int R = this.f5812h.R() + (this.f5813i * 86400);
        int y = this.f5815k.y();
        int y2 = this.f5816l.y() - y;
        int y3 = this.f5817m.y() - y;
        int z = (R % 3600 != 0 || R > 86400) ? 31 : R == 86400 ? 24 : this.f5812h.z();
        int i2 = y % 900 == 0 ? (y / 900) + 128 : 255;
        int i3 = (y2 == 0 || y2 == 1800 || y2 == 3600) ? y2 / 1800 : 3;
        int i4 = (y3 == 0 || y3 == 1800 || y3 == 3600) ? y3 / 1800 : 3;
        c cVar = this.f5811g;
        dataOutput.writeInt((this.f5809e.getValue() << 28) + ((this.f5810f + 32) << 22) + ((cVar == null ? 0 : cVar.getValue()) << 19) + (z << 14) + (this.f5814j.ordinal() << 12) + (i2 << 4) + (i3 << 2) + i4);
        if (z == 31) {
            dataOutput.writeInt(R);
        }
        if (i2 == 255) {
            dataOutput.writeInt(y);
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.f5816l.y());
        }
        if (i4 == 3) {
            dataOutput.writeInt(this.f5817m.y());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f5809e == eVar.f5809e && this.f5810f == eVar.f5810f && this.f5811g == eVar.f5811g && this.f5814j == eVar.f5814j && this.f5813i == eVar.f5813i && this.f5812h.equals(eVar.f5812h) && this.f5815k.equals(eVar.f5815k) && this.f5816l.equals(eVar.f5816l) && this.f5817m.equals(eVar.f5817m);
    }

    public int hashCode() {
        int R = ((this.f5812h.R() + this.f5813i) << 15) + (this.f5809e.ordinal() << 11) + ((this.f5810f + 32) << 5);
        c cVar = this.f5811g;
        return ((((R + ((cVar == null ? 7 : cVar.ordinal()) << 2)) + this.f5814j.ordinal()) ^ this.f5815k.hashCode()) ^ this.f5816l.hashCode()) ^ this.f5817m.hashCode();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TransitionRule["
            r0.append(r1)
            r.b.a.r r1 = r7.f5816l
            r.b.a.r r2 = r7.f5817m
            int r1 = r1.compareTo(r2)
            if (r1 <= 0) goto L_0x0017
            java.lang.String r1 = "Gap "
            goto L_0x0019
        L_0x0017:
            java.lang.String r1 = "Overlap "
        L_0x0019:
            r0.append(r1)
            r.b.a.r r1 = r7.f5816l
            r0.append(r1)
            java.lang.String r1 = " to "
            r0.append(r1)
            r.b.a.r r1 = r7.f5817m
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r.b.a.c r1 = r7.f5811g
            r2 = 32
            if (r1 == 0) goto L_0x0068
            byte r3 = r7.f5810f
            r4 = -1
            java.lang.String r1 = r1.name()
            r0.append(r1)
            if (r3 != r4) goto L_0x0051
            java.lang.String r1 = " on or before last day of "
        L_0x0044:
            r0.append(r1)
            r.b.a.i r1 = r7.f5809e
            java.lang.String r1 = r1.name()
            r0.append(r1)
            goto L_0x0079
        L_0x0051:
            if (r3 >= 0) goto L_0x0063
            java.lang.String r1 = " on or before last day minus "
            r0.append(r1)
            byte r1 = r7.f5810f
            int r1 = -r1
            int r1 = r1 + -1
            r0.append(r1)
            java.lang.String r1 = " of "
            goto L_0x0044
        L_0x0063:
            java.lang.String r1 = " on or after "
            r0.append(r1)
        L_0x0068:
            r.b.a.i r1 = r7.f5809e
            java.lang.String r1 = r1.name()
            r0.append(r1)
            r0.append(r2)
            byte r1 = r7.f5810f
            r0.append(r1)
        L_0x0079:
            java.lang.String r1 = " at "
            r0.append(r1)
            int r1 = r7.f5813i
            if (r1 != 0) goto L_0x0088
            r.b.a.h r1 = r7.f5812h
            r0.append(r1)
            goto L_0x00af
        L_0x0088:
            r.b.a.h r1 = r7.f5812h
            int r1 = r1.R()
            r2 = 60
            int r1 = r1 / r2
            int r3 = r7.f5813i
            int r3 = r3 * 24
            int r3 = r3 * 60
            int r1 = r1 + r3
            long r3 = (long) r1
            r5 = 60
            long r5 = r.b.a.w.d.e(r3, r5)
            r7.a(r0, r5)
            r1 = 58
            r0.append(r1)
            int r1 = r.b.a.w.d.g(r3, r2)
            long r1 = (long) r1
            r7.a(r0, r1)
        L_0x00af:
            java.lang.String r1 = " "
            r0.append(r1)
            r.b.a.y.e$b r1 = r7.f5814j
            r0.append(r1)
            java.lang.String r1 = ", standard offset "
            r0.append(r1)
            r.b.a.r r1 = r7.f5815k
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b.a.y.e.toString():java.lang.String");
    }
}
