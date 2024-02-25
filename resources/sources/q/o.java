package q;

final class o {
    final byte[] a;
    int b;
    int c;

    /* renamed from: d  reason: collision with root package name */
    boolean f5506d;

    /* renamed from: e  reason: collision with root package name */
    boolean f5507e;

    /* renamed from: f  reason: collision with root package name */
    o f5508f;

    /* renamed from: g  reason: collision with root package name */
    o f5509g;

    o() {
        this.a = new byte[8192];
        this.f5507e = true;
        this.f5506d = false;
    }

    o(byte[] bArr, int i2, int i3, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i2;
        this.c = i3;
        this.f5506d = z;
        this.f5507e = z2;
    }

    public final void a() {
        o oVar = this.f5509g;
        if (oVar == this) {
            throw new IllegalStateException();
        } else if (oVar.f5507e) {
            int i2 = this.c - this.b;
            if (i2 <= (8192 - oVar.c) + (oVar.f5506d ? 0 : oVar.b)) {
                f(oVar, i2);
                b();
                p.a(this);
            }
        }
    }

    public final o b() {
        o oVar = this.f5508f;
        o oVar2 = oVar != this ? oVar : null;
        o oVar3 = this.f5509g;
        oVar3.f5508f = oVar;
        this.f5508f.f5509g = oVar3;
        this.f5508f = null;
        this.f5509g = null;
        return oVar2;
    }

    public final o c(o oVar) {
        oVar.f5509g = this;
        oVar.f5508f = this.f5508f;
        this.f5508f.f5509g = oVar;
        this.f5508f = oVar;
        return oVar;
    }

    /* access modifiers changed from: package-private */
    public final o d() {
        this.f5506d = true;
        return new o(this.a, this.b, this.c, true, false);
    }

    public final o e(int i2) {
        o oVar;
        if (i2 <= 0 || i2 > this.c - this.b) {
            throw new IllegalArgumentException();
        }
        if (i2 >= 1024) {
            oVar = d();
        } else {
            oVar = p.b();
            System.arraycopy(this.a, this.b, oVar.a, 0, i2);
        }
        oVar.c = oVar.b + i2;
        this.b += i2;
        this.f5509g.c(oVar);
        return oVar;
    }

    public final void f(o oVar, int i2) {
        if (oVar.f5507e) {
            int i3 = oVar.c;
            if (i3 + i2 > 8192) {
                if (!oVar.f5506d) {
                    int i4 = oVar.b;
                    if ((i3 + i2) - i4 <= 8192) {
                        byte[] bArr = oVar.a;
                        System.arraycopy(bArr, i4, bArr, 0, i3 - i4);
                        oVar.c -= oVar.b;
                        oVar.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.a, this.b, oVar.a, oVar.c, i2);
            oVar.c += i2;
            this.b += i2;
            return;
        }
        throw new IllegalArgumentException();
    }
}
