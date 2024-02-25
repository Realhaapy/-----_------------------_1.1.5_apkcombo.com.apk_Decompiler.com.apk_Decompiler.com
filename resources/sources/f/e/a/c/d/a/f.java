package f.e.a.c.d.a;

import android.os.Handler;
import android.os.Looper;

public class f extends Handler {
    public f(Looper looper) {
        super(looper);
    }

    public f(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
