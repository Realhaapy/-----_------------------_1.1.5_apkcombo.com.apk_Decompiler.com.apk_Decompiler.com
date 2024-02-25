package kotlinx.coroutines.m2;

import kotlinx.coroutines.f0;
import kotlinx.coroutines.internal.a0;
import m.y.d.g;

public final class b extends c {

    /* renamed from: k  reason: collision with root package name */
    public static final b f4905k;

    /* renamed from: l  reason: collision with root package name */
    private static final f0 f4906l;

    static {
        b bVar = new b();
        f4905k = bVar;
        f4906l = new e(bVar, c0.d("kotlinx.coroutines.io.parallelism", f.a(64, a0.a()), 0, 0, 12, (Object) null), "Dispatchers.IO", 1);
    }

    private b() {
        super(0, 0, (String) null, 7, (g) null);
    }

    public final f0 X() {
        return f4906l;
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}
