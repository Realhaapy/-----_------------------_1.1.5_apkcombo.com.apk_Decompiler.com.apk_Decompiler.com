package kotlinx.coroutines;

import m.v.g;

public interface CoroutineExceptionHandler extends g.b {
    public static final a c = a.f4780e;

    public static final class a implements g.c<CoroutineExceptionHandler> {

        /* renamed from: e  reason: collision with root package name */
        static final /* synthetic */ a f4780e = new a();

        private a() {
        }
    }

    void handleException(g gVar, Throwable th);
}
