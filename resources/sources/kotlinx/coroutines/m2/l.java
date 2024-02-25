package kotlinx.coroutines.m2;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.a0;

public final class l {
    public static final long a = c0.e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);
    public static final int b;
    public static final int c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f4923d = TimeUnit.SECONDS.toNanos(c0.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: e  reason: collision with root package name */
    public static h f4924e = f.a;

    static {
        int unused = c0.d("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);
        int f2 = c0.d("kotlinx.coroutines.scheduler.core.pool.size", f.a(a0.a(), 2), 1, 0, 8, (Object) null);
        b = f2;
        c = c0.d("kotlinx.coroutines.scheduler.max.pool.size", f.e(a0.a() * 128, f2, 2097150), 0, 2097150, 4, (Object) null);
    }
}
