package com.facebook.y0.r0;

import com.facebook.internal.s0.n.a;
import m.y.d.l;

public final class i {
    public static final i a = new i();

    private i() {
    }

    public static final void a(f fVar, f fVar2) {
        Class<i> cls = i.class;
        if (!a.d(cls)) {
            try {
                l.d(fVar, "x");
                l.d(fVar2, "b");
                int b = fVar.b(0);
                int b2 = fVar.b(1);
                int b3 = fVar.b(2);
                float[] a2 = fVar.a();
                float[] a3 = fVar2.a();
                if (b > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        if (b2 > 0) {
                            int i4 = 0;
                            while (true) {
                                int i5 = i4 + 1;
                                if (b3 > 0) {
                                    int i6 = 0;
                                    while (true) {
                                        int i7 = i6 + 1;
                                        int i8 = (i2 * b2 * b3) + (i4 * b3) + i6;
                                        a2[i8] = a2[i8] + a3[i6];
                                        if (i7 >= b3) {
                                            break;
                                        }
                                        i6 = i7;
                                    }
                                }
                                if (i5 >= b2) {
                                    break;
                                }
                                i4 = i5;
                            }
                        }
                        if (i3 < b) {
                            i2 = i3;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final f b(f[] fVarArr) {
        int i2;
        f[] fVarArr2 = fVarArr;
        Class<i> cls = i.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(fVarArr2, "tensors");
            int b = fVarArr2[0].b(0);
            int length = fVarArr2.length - 1;
            if (length >= 0) {
                int i3 = 0;
                i2 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    i2 += fVarArr2[i3].b(1);
                    if (i4 > length) {
                        break;
                    }
                    i3 = i4;
                }
            } else {
                i2 = 0;
            }
            f fVar = new f(new int[]{b, i2});
            float[] a2 = fVar.a();
            if (b > 0) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    int i7 = i5 * i2;
                    int length2 = fVarArr2.length - 1;
                    if (length2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            int i9 = i8 + 1;
                            float[] a3 = fVarArr2[i8].a();
                            int b2 = fVarArr2[i8].b(1);
                            System.arraycopy(a3, i5 * b2, a2, i7, b2);
                            i7 += b2;
                            if (i9 > length2) {
                                break;
                            }
                            i8 = i9;
                        }
                    }
                    if (i6 >= b) {
                        break;
                    }
                    i5 = i6;
                }
            }
            return fVar;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final f c(f fVar, f fVar2) {
        Class<i> cls;
        f fVar3;
        Class<i> cls2;
        f fVar4 = fVar;
        f fVar5 = fVar2;
        Class<i> cls3 = i.class;
        if (a.d(cls3)) {
            return null;
        }
        try {
            l.d(fVar4, "x");
            l.d(fVar5, "w");
            int b = fVar4.b(0);
            int b2 = fVar4.b(1);
            int b3 = fVar4.b(2);
            int b4 = fVar5.b(0);
            int i2 = (b2 - b4) + 1;
            int b5 = fVar5.b(2);
            f fVar6 = new f(new int[]{b, i2, b5});
            float[] a2 = fVar.a();
            float[] a3 = fVar6.a();
            float[] a4 = fVar2.a();
            if (b <= 0) {
                return fVar6;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (b5 > 0) {
                    int i5 = 0;
                    while (true) {
                        int i6 = i5 + 1;
                        if (i2 > 0) {
                            int i7 = 0;
                            while (true) {
                                int i8 = i7 + 1;
                                float f2 = 0.0f;
                                if (b4 > 0) {
                                    int i9 = 0;
                                    while (true) {
                                        cls2 = cls3;
                                        int i10 = i9 + 1;
                                        if (b3 > 0) {
                                            int i11 = 0;
                                            while (true) {
                                                fVar3 = fVar6;
                                                int i12 = i11 + 1;
                                                try {
                                                    f2 += a2[(b2 * b3 * i3) + ((i9 + i7) * b3) + i11] * a4[(((i9 * b3) + i11) * b5) + i5];
                                                    if (i12 >= b3) {
                                                        break;
                                                    }
                                                    i11 = i12;
                                                    fVar6 = fVar3;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    cls = cls2;
                                                    a.b(th, cls);
                                                    return null;
                                                }
                                            }
                                        } else {
                                            fVar3 = fVar6;
                                        }
                                        if (i10 >= b4) {
                                            break;
                                        }
                                        i9 = i10;
                                        cls3 = cls2;
                                        fVar6 = fVar3;
                                    }
                                } else {
                                    cls2 = cls3;
                                    fVar3 = fVar6;
                                }
                                a3[(i2 * b5 * i3) + (i7 * b5) + i5] = f2;
                                if (i8 >= i2) {
                                    break;
                                }
                                i7 = i8;
                                cls3 = cls2;
                                fVar6 = fVar3;
                            }
                        } else {
                            cls2 = cls3;
                            fVar3 = fVar6;
                        }
                        if (i6 >= b5) {
                            break;
                        }
                        i5 = i6;
                        cls3 = cls2;
                        fVar6 = fVar3;
                    }
                } else {
                    cls2 = cls3;
                    fVar3 = fVar6;
                }
                if (i4 >= b) {
                    return fVar3;
                }
                i3 = i4;
                cls3 = cls2;
                fVar6 = fVar3;
            }
        } catch (Throwable th2) {
            th = th2;
            cls = cls3;
            a.b(th, cls);
            return null;
        }
    }

    public static final f d(f fVar, f fVar2, f fVar3) {
        Class<i> cls = i.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(fVar, "x");
            l.d(fVar2, "w");
            l.d(fVar3, "b");
            int b = fVar.b(0);
            int b2 = fVar3.b(0);
            f h2 = h(fVar, fVar2);
            float[] a2 = fVar3.a();
            float[] a3 = h2.a();
            if (b > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (b2 > 0) {
                        int i4 = 0;
                        while (true) {
                            int i5 = i4 + 1;
                            int i6 = (i2 * b2) + i4;
                            a3[i6] = a3[i6] + a2[i4];
                            if (i5 >= b2) {
                                break;
                            }
                            i4 = i5;
                        }
                    }
                    if (i3 >= b) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return h2;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final f e(String[] strArr, int i2, f fVar) {
        String[] strArr2 = strArr;
        int i3 = i2;
        f fVar2 = fVar;
        Class<i> cls = i.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(strArr2, "texts");
            l.d(fVar2, "w");
            int length = strArr2.length;
            int b = fVar2.b(1);
            f fVar3 = new f(new int[]{length, i3, b});
            float[] a2 = fVar3.a();
            float[] a3 = fVar.a();
            if (length > 0) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    int[] d2 = j.a.d(strArr2[i4], i3);
                    if (i3 > 0) {
                        int i6 = 0;
                        while (true) {
                            int i7 = i6 + 1;
                            System.arraycopy(a3, d2[i6] * b, a2, (b * i3 * i4) + (i6 * b), b);
                            if (i7 >= i3) {
                                break;
                            }
                            i6 = i7;
                        }
                    }
                    if (i5 >= length) {
                        break;
                    }
                    i4 = i5;
                }
            }
            return fVar3;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final void f(f fVar, int i2) {
        Class<i> cls = i.class;
        if (!a.d(cls)) {
            try {
                l.d(fVar, "x");
                if (i2 < fVar.c()) {
                    int c = fVar.c();
                    int i3 = 1;
                    if (i2 < c) {
                        int i4 = i2;
                        while (true) {
                            int i5 = i4 + 1;
                            i3 *= fVar.b(i4);
                            if (i5 >= c) {
                                break;
                            }
                            i4 = i5;
                        }
                    }
                    int[] iArr = new int[(i2 + 1)];
                    int i6 = 0;
                    if (i2 > 0) {
                        while (true) {
                            int i7 = i6 + 1;
                            iArr[i6] = fVar.b(i6);
                            if (i7 >= i2) {
                                break;
                            }
                            i6 = i7;
                        }
                    }
                    iArr[i2] = i3;
                    fVar.d(iArr);
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final f g(f fVar, int i2) {
        int i3;
        f fVar2 = fVar;
        int i4 = i2;
        Class<i> cls = i.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(fVar2, "x");
            int b = fVar2.b(0);
            int b2 = fVar2.b(1);
            int b3 = fVar2.b(2);
            int i5 = (b2 - i4) + 1;
            f fVar3 = new f(new int[]{b, i5, b3});
            float[] a2 = fVar.a();
            float[] a3 = fVar3.a();
            if (b > 0) {
                int i6 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    if (b3 > 0) {
                        int i8 = 0;
                        while (true) {
                            int i9 = i8 + 1;
                            if (i5 > 0) {
                                int i10 = 0;
                                while (true) {
                                    int i11 = i10 + 1;
                                    int i12 = i10 * b3;
                                    int i13 = (i6 * i5 * b3) + i12 + i8;
                                    int i14 = (i6 * b2 * b3) + i12 + i8;
                                    a3[i13] = Float.MIN_VALUE;
                                    if (i4 > 0) {
                                        int i15 = 0;
                                        while (true) {
                                            int i16 = i15 + 1;
                                            i3 = b2;
                                            a3[i13] = Math.max(a3[i13], a2[i14 + (i15 * b3)]);
                                            if (i16 >= i4) {
                                                break;
                                            }
                                            i15 = i16;
                                            b2 = i3;
                                        }
                                    } else {
                                        i3 = b2;
                                    }
                                    if (i11 >= i5) {
                                        break;
                                    }
                                    i10 = i11;
                                    b2 = i3;
                                }
                            } else {
                                i3 = b2;
                            }
                            if (i9 >= b3) {
                                break;
                            }
                            i8 = i9;
                            b2 = i3;
                        }
                    } else {
                        i3 = b2;
                    }
                    if (i7 >= b) {
                        break;
                    }
                    i6 = i7;
                    b2 = i3;
                }
            }
            return fVar3;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final f h(f fVar, f fVar2) {
        f fVar3 = fVar;
        f fVar4 = fVar2;
        Class<i> cls = i.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(fVar3, "x");
            l.d(fVar4, "w");
            int b = fVar3.b(0);
            int b2 = fVar4.b(0);
            int b3 = fVar4.b(1);
            f fVar5 = new f(new int[]{b, b3});
            float[] a2 = fVar.a();
            float[] a3 = fVar2.a();
            float[] a4 = fVar5.a();
            if (b > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (b3 > 0) {
                        int i4 = 0;
                        while (true) {
                            int i5 = i4 + 1;
                            int i6 = (i2 * b3) + i4;
                            a4[i6] = 0.0f;
                            if (b2 > 0) {
                                int i7 = 0;
                                while (true) {
                                    int i8 = i7 + 1;
                                    a4[i6] = a4[i6] + (a2[(i2 * b2) + i7] * a3[(i7 * b3) + i4]);
                                    if (i8 >= b2) {
                                        break;
                                    }
                                    i7 = i8;
                                }
                            }
                            if (i5 >= b3) {
                                break;
                            }
                            i4 = i5;
                        }
                    }
                    if (i3 >= b) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return fVar5;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final void i(f fVar) {
        Class<i> cls = i.class;
        if (!a.d(cls)) {
            try {
                l.d(fVar, "x");
                float[] a2 = fVar.a();
                int i2 = 0;
                int length = a2.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i3 = i2 + 1;
                        if (a2[i2] < 0.0f) {
                            a2[i2] = 0.0f;
                        }
                        if (i3 <= length) {
                            i2 = i3;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final void j(f fVar) {
        Class<i> cls = i.class;
        if (!a.d(cls)) {
            try {
                l.d(fVar, "x");
                int i2 = 0;
                int b = fVar.b(0);
                int b2 = fVar.b(1);
                float[] a2 = fVar.a();
                if (b > 0) {
                    while (true) {
                        int i3 = i2 + 1;
                        int i4 = i2 * b2;
                        int i5 = i4 + b2;
                        float f2 = Float.MIN_VALUE;
                        float f3 = 0.0f;
                        if (i4 < i5) {
                            int i6 = i4;
                            while (true) {
                                int i7 = i6 + 1;
                                if (a2[i6] > f2) {
                                    f2 = a2[i6];
                                }
                                if (i7 >= i5) {
                                    break;
                                }
                                i6 = i7;
                            }
                        }
                        if (i4 < i5) {
                            int i8 = i4;
                            while (true) {
                                int i9 = i8 + 1;
                                a2[i8] = (float) Math.exp((double) (a2[i8] - f2));
                                f3 += a2[i8];
                                if (i9 >= i5) {
                                    break;
                                }
                                i8 = i9;
                            }
                        }
                        if (i4 < i5) {
                            while (true) {
                                int i10 = i4 + 1;
                                a2[i4] = a2[i4] / f3;
                                if (i10 >= i5) {
                                    break;
                                }
                                i4 = i10;
                            }
                        }
                        if (i3 < b) {
                            i2 = i3;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    public static final f k(f fVar) {
        Class<i> cls = i.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(fVar, "x");
            int b = fVar.b(0);
            int b2 = fVar.b(1);
            f fVar2 = new f(new int[]{b2, b});
            float[] a2 = fVar.a();
            float[] a3 = fVar2.a();
            if (b > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (b2 > 0) {
                        int i4 = 0;
                        while (true) {
                            int i5 = i4 + 1;
                            a3[(i4 * b) + i2] = a2[(i2 * b2) + i4];
                            if (i5 >= b2) {
                                break;
                            }
                            i4 = i5;
                        }
                    }
                    if (i3 >= b) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return fVar2;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final f l(f fVar) {
        f fVar2 = fVar;
        Class<i> cls = i.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(fVar2, "x");
            int b = fVar2.b(0);
            int b2 = fVar2.b(1);
            int b3 = fVar2.b(2);
            f fVar3 = new f(new int[]{b3, b2, b});
            float[] a2 = fVar.a();
            float[] a3 = fVar3.a();
            if (b > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (b2 > 0) {
                        int i4 = 0;
                        while (true) {
                            int i5 = i4 + 1;
                            if (b3 > 0) {
                                int i6 = 0;
                                while (true) {
                                    int i7 = i6 + 1;
                                    a3[(i6 * b * b2) + (i4 * b) + i2] = a2[(i2 * b2 * b3) + (i4 * b3) + i6];
                                    if (i7 >= b3) {
                                        break;
                                    }
                                    i6 = i7;
                                }
                            }
                            if (i5 >= b2) {
                                break;
                            }
                            i4 = i5;
                        }
                    }
                    if (i3 >= b) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return fVar3;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }
}
