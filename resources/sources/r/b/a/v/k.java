package r.b.a.v;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class k extends g {
    /* access modifiers changed from: private */
    public static final Comparator<Map.Entry<String, Long>> a = new a();

    class a implements Comparator<Map.Entry<String, Long>> {
        a() {
        }

        /* renamed from: a */
        public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            return entry2.getKey().length() - entry.getKey().length();
        }
    }

    static final class b {
        private final Map<l, Map<Long, String>> a;
        private final Map<l, List<Map.Entry<String, Long>>> b;

        b(Map<l, Map<Long, String>> map) {
            this.a = map;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (l next : map.keySet()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : map.get(next).entrySet()) {
                    Object put = hashMap2.put(entry.getValue(), k.e(entry.getValue(), entry.getKey()));
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.values());
                Collections.sort(arrayList2, k.a);
                hashMap.put(next, arrayList2);
                arrayList.addAll(arrayList2);
                hashMap.put((Object) null, arrayList);
            }
            Collections.sort(arrayList, k.a);
            this.b = hashMap;
        }

        /* access modifiers changed from: package-private */
        public String a(long j2, l lVar) {
            Map map = this.a.get(lVar);
            if (map != null) {
                return (String) map.get(Long.valueOf(j2));
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public Iterator<Map.Entry<String, Long>> b(l lVar) {
            List list = this.b.get(lVar);
            if (list != null) {
                return list.iterator();
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static <A, B> Map.Entry<A, B> e(A a2, B b2) {
        return new AbstractMap.SimpleImmutableEntry(a2, b2);
    }
}
