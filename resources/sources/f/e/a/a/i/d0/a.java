package f.e.a.a.i.d0;

import android.util.SparseArray;
import f.e.a.a.d;
import java.util.HashMap;

public final class a {
    private static SparseArray<d> a = new SparseArray<>();
    private static HashMap<d, Integer> b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        b.put(d.VERY_LOW, 1);
        b.put(d.HIGHEST, 2);
        for (d next : b.keySet()) {
            a.append(b.get(next).intValue(), next);
        }
    }

    public static int a(d dVar) {
        Integer num = b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i2) {
        d dVar = a.get(i2);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i2);
    }
}
