package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.x1;

public final class r {
    public static final r a;
    private static final boolean b = a0.e("kotlinx.coroutines.fast.service.loader", true);
    public static final x1 c;

    static {
        r rVar = new r();
        a = rVar;
        c = rVar.a();
    }

    private r() {
    }

    private final x1 a() {
        T t;
        try {
            List<MainDispatcherFactory> c2 = b ? j.a.c() : h.f(f.a(a.b()));
            Iterator<T> it = c2.iterator();
            if (!it.hasNext()) {
                t = null;
            } else {
                t = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) t).getLoadPriority();
                    do {
                        T next = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            t = next;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) t;
            return mainDispatcherFactory == null ? s.b((Throwable) null, (String) null, 3, (Object) null) : s.d(mainDispatcherFactory, c2);
        } catch (Throwable th) {
            return s.b(th, (String) null, 2, (Object) null);
        }
    }
}
