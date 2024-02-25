package e.f.o;

import android.os.Handler;
import android.os.Looper;

class c {
    static Handler a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
