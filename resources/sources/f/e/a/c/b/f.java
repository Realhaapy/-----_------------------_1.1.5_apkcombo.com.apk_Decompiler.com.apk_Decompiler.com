package f.e.a.c.b;

import android.os.Looper;
import android.os.Message;

final class f extends f.e.a.c.d.b.f {
    final /* synthetic */ d a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    f(d dVar, Looper looper) {
        super(looper);
        this.a = dVar;
    }

    public final void handleMessage(Message message) {
        d.d(this.a, message);
    }
}
