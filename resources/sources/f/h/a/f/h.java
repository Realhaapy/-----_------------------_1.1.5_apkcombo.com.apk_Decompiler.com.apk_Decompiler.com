package f.h.a.f;

import f.h.a.d;
import java.util.HashMap;
import java.util.Map;

public class h {
    public static Map<String, Object> a(f fVar) {
        d b = fVar.b();
        if (b == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sql", b.e());
        hashMap.put("arguments", b.d());
        return hashMap;
    }
}
