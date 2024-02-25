package m.z;

import java.util.Random;
import m.y.d.l;

public final class b extends a {

    /* renamed from: g  reason: collision with root package name */
    private final a f5063g = new a();

    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    public Random c() {
        Object obj = this.f5063g.get();
        l.c(obj, "implStorage.get()");
        return (Random) obj;
    }
}
