package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Objects;
import m.m;
import m.n;
import m.y.d.g;

public final class c {
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        b bVar = null;
        try {
            m.a aVar = m.f5014e;
            obj = new a(a(Looper.getMainLooper(), true), (String) null, 2, (g) null);
            m.a(obj);
        } catch (Throwable th) {
            m.a aVar2 = m.f5014e;
            obj = n.a(th);
            m.a(obj);
        }
        if (!m.c(obj)) {
            bVar = obj;
        }
        b bVar2 = bVar;
    }

    public static final Handler a(Looper looper, boolean z) {
        int i2;
        if (!z || (i2 = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i2 >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
