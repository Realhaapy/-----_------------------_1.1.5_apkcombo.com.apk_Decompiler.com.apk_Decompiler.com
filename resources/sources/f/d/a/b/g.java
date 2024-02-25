package f.d.a.b;

import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.MethodChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import m.y.d.l;

public abstract class g {
    public static final a c = new a((m.y.d.g) null);

    /* renamed from: d  reason: collision with root package name */
    private static final Handler f3746d = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final ExecutorService f3747e;
    private MethodChannel.Result a;
    private boolean b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(m.y.d.g gVar) {
            this();
        }

        public final ExecutorService a() {
            return g.f3747e;
        }
    }

    static {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(8);
        l.c(newFixedThreadPool, "newFixedThreadPool(8)");
        f3747e = newFixedThreadPool;
    }

    public g(MethodChannel.Result result) {
        this.a = result;
    }

    /* access modifiers changed from: private */
    public static final void d(MethodChannel.Result result, Object obj) {
        if (result != null) {
            result.success(obj);
        }
    }

    public final void c(Object obj) {
        if (!this.b) {
            this.b = true;
            MethodChannel.Result result = this.a;
            this.a = null;
            f3746d.post(new d(result, obj));
        }
    }
}
