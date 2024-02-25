package com.facebook.y0.r0;

import m.y.d.g;
import m.y.d.l;

public final class f {

    /* renamed from: d  reason: collision with root package name */
    public static final a f2116d = new a((g) null);
    private int[] a;
    private int b;
    private float[] c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final int b(int[] iArr) {
            int i2 = 1;
            if (!(iArr.length == 0)) {
                int i3 = iArr[0];
                int k2 = f.k(iArr);
                if (1 <= k2) {
                    while (true) {
                        i3 *= iArr[i2];
                        if (i2 == k2) {
                            break;
                        }
                        i2++;
                    }
                }
                return i3;
            }
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
    }

    public f(int[] iArr) {
        l.d(iArr, "shape");
        this.a = iArr;
        int a2 = f2116d.b(iArr);
        this.b = a2;
        this.c = new float[a2];
    }

    public final float[] a() {
        return this.c;
    }

    public final int b(int i2) {
        return this.a[i2];
    }

    public final int c() {
        return this.a.length;
    }

    public final void d(int[] iArr) {
        l.d(iArr, "shape");
        this.a = iArr;
        int a2 = f2116d.b(iArr);
        float[] fArr = new float[a2];
        System.arraycopy(this.c, 0, fArr, 0, Math.min(this.b, a2));
        this.c = fArr;
        this.b = a2;
    }
}
