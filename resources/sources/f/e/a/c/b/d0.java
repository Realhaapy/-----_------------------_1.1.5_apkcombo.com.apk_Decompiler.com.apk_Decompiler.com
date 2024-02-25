package f.e.a.c.b;

import android.util.Log;
import f.e.a.c.g.j;
import java.io.IOException;

public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ j f3851e;

    public /* synthetic */ d0(j jVar) {
        this.f3851e = jVar;
    }

    public final void run() {
        if (this.f3851e.d(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }
}
