package f.e.e.j.d;

import java.util.ArrayList;
import java.util.List;

public final class c {
    private final a a;
    private final List<b> b;

    public c(a aVar) {
        this.a = aVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    private b a(int i2) {
        if (i2 >= this.b.size()) {
            List<b> list = this.b;
            b bVar = list.get(list.size() - 1);
            for (int size = this.b.size(); size <= i2; size++) {
                a aVar = this.a;
                bVar = bVar.g(new b(aVar, new int[]{1, aVar.c((size - 1) + aVar.d())}));
                this.b.add(bVar);
            }
        }
        return this.b.get(i2);
    }

    public void b(int[] iArr, int i2) {
        if (i2 != 0) {
            int length = iArr.length - i2;
            if (length > 0) {
                b a2 = a(i2);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] d2 = new b(this.a, iArr2).h(i2, 1).b(a2)[1].d();
                int length2 = i2 - d2.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    iArr[length + i3] = 0;
                }
                System.arraycopy(d2, 0, iArr, length + length2, d2.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
