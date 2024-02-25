package f.e.e.i.b;

import e.a.j;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public final class d {
    static final String[] b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    static final int[][] c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d  reason: collision with root package name */
    private static final int[][] f4461d;

    /* renamed from: e  reason: collision with root package name */
    static final int[][] f4462e;
    private final byte[] a;

    class a implements Comparator<f> {
        a(d dVar) {
        }

        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.d() - fVar2.d();
        }
    }

    static {
        Class<int> cls = int.class;
        int[][] iArr = (int[][]) Array.newInstance(cls, new int[]{5, 256});
        f4461d = iArr;
        iArr[0][32] = 1;
        for (int i2 = 65; i2 <= 90; i2++) {
            f4461d[0][i2] = (i2 - 65) + 2;
        }
        f4461d[1][32] = 1;
        for (int i3 = 97; i3 <= 122; i3++) {
            f4461d[1][i3] = (i3 - 97) + 2;
        }
        f4461d[2][32] = 1;
        for (int i4 = 48; i4 <= 57; i4++) {
            f4461d[2][i4] = (i4 - 48) + 2;
        }
        int[][] iArr2 = f4461d;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, j.G0, j.I0, 127};
        for (int i5 = 0; i5 < 28; i5++) {
            f4461d[3][iArr3[i5]] = i5;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, j.F0, j.H0};
        for (int i6 = 0; i6 < 31; i6++) {
            if (iArr4[i6] > 0) {
                f4461d[4][iArr4[i6]] = i6;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(cls, new int[]{6, 6});
        f4462e = iArr5;
        for (int[] fill : iArr5) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr6 = f4462e;
        iArr6[0][4] = 0;
        iArr6[1][4] = 0;
        iArr6[1][0] = 28;
        iArr6[3][4] = 0;
        iArr6[2][4] = 0;
        iArr6[2][0] = 15;
    }

    public d(byte[] bArr) {
        this.a = bArr;
    }

    private static Collection<f> b(Iterable<f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (f next : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f fVar = (f) it.next();
                if (fVar.f(next)) {
                    z = false;
                    break;
                } else if (next.f(fVar)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(next);
            }
        }
        return linkedList;
    }

    private void c(f fVar, int i2, Collection<f> collection) {
        char c2 = (char) (this.a[i2] & 255);
        boolean z = f4461d[fVar.e()][c2] > 0;
        f fVar2 = null;
        for (int i3 = 0; i3 <= 4; i3++) {
            int i4 = f4461d[i3][c2];
            if (i4 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.b(i2);
                }
                if (!z || i3 == fVar.e() || i3 == 2) {
                    collection.add(fVar2.g(i3, i4));
                }
                if (!z && f4462e[fVar.e()][i3] >= 0) {
                    collection.add(fVar2.h(i3, i4));
                }
            }
        }
        if (fVar.c() > 0 || f4461d[fVar.e()][c2] == 0) {
            collection.add(fVar.a(i2));
        }
    }

    private static void d(f fVar, int i2, int i3, Collection<f> collection) {
        f b2 = fVar.b(i2);
        collection.add(b2.g(4, i3));
        if (fVar.e() != 4) {
            collection.add(b2.h(4, i3));
        }
        if (i3 == 3 || i3 == 4) {
            collection.add(b2.g(2, 16 - i3).g(2, 1));
        }
        if (fVar.c() > 0) {
            collection.add(fVar.a(i2).a(i2 + 1));
        }
    }

    private Collection<f> e(Iterable<f> iterable, int i2) {
        LinkedList linkedList = new LinkedList();
        for (f c2 : iterable) {
            c(c2, i2, linkedList);
        }
        return b(linkedList);
    }

    private static Collection<f> f(Iterable<f> iterable, int i2, int i3) {
        LinkedList linkedList = new LinkedList();
        for (f d2 : iterable) {
            d(d2, i2, i3, linkedList);
        }
        return b(linkedList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f.e.e.j.a a() {
        /*
            r8 = this;
            f.e.e.i.b.f r0 = f.e.e.i.b.f.f4464e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = 0
        L_0x0008:
            byte[] r3 = r8.a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x004c
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L_0x0015
            byte r5 = r3[r4]
            goto L_0x0016
        L_0x0015:
            r5 = 0
        L_0x0016:
            byte r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L_0x0038
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L_0x0034
            r6 = 46
            if (r3 == r6) goto L_0x0030
            r6 = 58
            if (r3 == r6) goto L_0x002c
        L_0x002a:
            r3 = 0
            goto L_0x003d
        L_0x002c:
            if (r5 != r7) goto L_0x002a
            r3 = 5
            goto L_0x003d
        L_0x0030:
            if (r5 != r7) goto L_0x002a
            r3 = 3
            goto L_0x003d
        L_0x0034:
            if (r5 != r7) goto L_0x002a
            r3 = 4
            goto L_0x003d
        L_0x0038:
            r3 = 10
            if (r5 != r3) goto L_0x002a
            r3 = 2
        L_0x003d:
            if (r3 <= 0) goto L_0x0045
            java.util.Collection r0 = f(r0, r2, r3)
            r2 = r4
            goto L_0x0049
        L_0x0045:
            java.util.Collection r0 = r8.e(r0, r2)
        L_0x0049:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x004c:
            f.e.e.i.b.d$a r1 = new f.e.e.i.b.d$a
            r1.<init>(r8)
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            f.e.e.i.b.f r0 = (f.e.e.i.b.f) r0
            byte[] r1 = r8.a
            f.e.e.j.a r0 = r0.i(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.e.i.b.d.a():f.e.e.j.a");
    }
}
