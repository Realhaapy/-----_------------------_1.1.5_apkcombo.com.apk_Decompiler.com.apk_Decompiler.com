package r.b.a.y;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import r.b.a.w.d;

public abstract class i {
    private static final CopyOnWriteArrayList<i> a = new CopyOnWriteArrayList<>();
    private static final ConcurrentMap<String, i> b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        h.a();
    }

    protected i() {
    }

    public static Set<String> a() {
        return Collections.unmodifiableSet(b.keySet());
    }

    private static i b(String str) {
        ConcurrentMap<String, i> concurrentMap = b;
        i iVar = (i) concurrentMap.get(str);
        if (iVar != null) {
            return iVar;
        }
        if (concurrentMap.isEmpty()) {
            throw new g("No time-zone data files registered");
        }
        throw new g("Unknown time-zone ID: " + str);
    }

    public static f c(String str, boolean z) {
        d.i(str, "zoneId");
        return b(str).d(str, z);
    }

    public static void f(i iVar) {
        d.i(iVar, "provider");
        g(iVar);
        a.add(iVar);
    }

    private static void g(i iVar) {
        for (String next : iVar.e()) {
            d.i(next, "zoneId");
            if (b.putIfAbsent(next, iVar) != null) {
                throw new g("Unable to register zone as one already registered with that ID: " + next + ", currently loading from provider: " + iVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract f d(String str, boolean z);

    /* access modifiers changed from: protected */
    public abstract Set<String> e();
}
